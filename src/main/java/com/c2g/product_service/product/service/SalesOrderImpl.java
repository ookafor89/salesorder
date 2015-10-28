package com.c2g.product_service.product.service;

import java.math.BigDecimal;
import java.util.GregorianCalendar;
import java.util.List;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Holder;

import org.apache.camel.Handler;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.node.ArrayNode;
import org.joda.time.DateTime;

import schemas.dynamics.microsoft.page.salesorder.SalesOrderLine;
import schemas.dynamics.microsoft.page.salesorder.SalesOrderLineList;
import schemas.dynamics.microsoft.page.salesorder.Salesorder;


/**
 * A bean which we use in the route
 */
public class SalesOrderImpl{
    
    @Handler
    public Holder<Salesorder> processSalesOrder(String salesOrderJson) throws Exception {
    	ObjectMapper jsonMapper = new ObjectMapper();
	    JsonNode jsonNode = jsonMapper.readTree(salesOrderJson);
  	  	Salesorder salesOrder = new Salesorder();
  	  	salesOrder.setSellToCustomerName(jsonNode.get("Sell_to_Customer_No").getTextValue());
  	  	salesOrder.setSellToCustomerNo(jsonNode.get("Sell_to_Customer_Name").getTextValue());
  	  	salesOrder.setOrderDate(toXMLGregorianCalendar(jsonNode.get("Order_Date").getTextValue()));
  	  	Holder<Salesorder> salesHolder = new Holder<Salesorder>(salesOrder);
  	  	
  	  ArrayNode arrayNode = (ArrayNode) jsonNode.get("line_items");
  	  if(arrayNode!=null && arrayNode.size()>0){
  		SalesOrderLineList salesOrderLineList=new SalesOrderLineList();
  		List<SalesOrderLine> list=salesOrderLineList.getSalesOrderLine();
  		for (int i = 0; i < arrayNode.size(); i++) {
            JsonNode individualElement = arrayNode.get(i);
            SalesOrderLine saleOrderLine=new SalesOrderLine();
      		saleOrderLine.setVariantCode(individualElement.get("Variant_Code").getTextValue());
      		saleOrderLine.setQuantity(BigDecimal.valueOf(new Double(individualElement.get("Quantity").getTextValue())));
      		saleOrderLine.setUnitPrice(BigDecimal.valueOf(new Double(individualElement.get("Unit_Price").getTextValue())));
      		saleOrderLine.setLocationCode("");
      		list.add(saleOrderLine);
        }
  		salesOrder.setSalesLines(salesOrderLineList);
  	  }
      
  	  	return salesHolder;
    }
    
    public static XMLGregorianCalendar toXMLGregorianCalendar(String date)throws Exception  {
    	DateTime dateTime=DateTime.parse(date);
        final GregorianCalendar calendar = new GregorianCalendar(dateTime.getZone().toTimeZone());
    	//Calendar cal = DatatypeConverter.parseDateTime(date);
    	XMLGregorianCalendar xmlCalender= DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);
        return xmlCalender;
    }
}
