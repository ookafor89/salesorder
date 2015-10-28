package com.c2g.product_service.product.service;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Holder;

import org.apache.camel.Exchange;
import org.apache.camel.Handler;
import org.apache.cxf.message.MessageContentsList;
import org.codehaus.jackson.JsonNode;
import org.joda.time.DateTime;

import schemas.dynamics.microsoft.page.salesorder.SalesOrderLine;
import schemas.dynamics.microsoft.page.salesorder.SalesOrderLineList;
import schemas.dynamics.microsoft.page.salesorder.Salesorder;
import schemas.dynamics.microsoft.page.salesorder.Status;
import schemas.dynamics.microsoft.page.salesorder.Type;

import com.javacodegeeks.ws.product_service.types.ProductRequest;


/**
 * A bean which we use in the route
 */
public class SalesOrderGenerator{

    private String say = "Hello World";
    private static ArrayList<String> PRODUCT_DETAILS = new ArrayList<String>();
    
    @Handler
    public Holder<Salesorder> getSalesOrder(Map salesOrderJson) throws Exception{
    	List<Map> lineItems=(List<Map>)salesOrderJson.get("line_items");
    	  int listSize=lineItems.size();
    	  Salesorder salesOrder = new Salesorder();
    	  salesOrder.setSellToCustomerName((String)salesOrderJson.get("Sell_to_Customer_Name"));
    	  salesOrder.setSellToCustomerNo((String)salesOrderJson.get("Sell_to_Customer_No"));
    	  salesOrder.setOrderDate(toXMLGregorianCalendar((String)salesOrderJson.get("Order_Date")));
    	  SalesOrderLineList salesOrderLineList=new SalesOrderLineList();
    	  List<SalesOrderLine> list=salesOrderLineList.getSalesOrderLine();
    	  for (int i = 0; i < listSize; i++) {
    		    Map item=lineItems.get(i);
              	SalesOrderLine saleOrderLine=new SalesOrderLine();
                saleOrderLine.setNo("1972-S");
        		saleOrderLine.setQuantity(BigDecimal.valueOf(new Double((String)item.get("Variant_Code"))));
        		saleOrderLine.setUnitPrice(BigDecimal.valueOf(new Double((String)item.get("Unit_Price"))));
        		saleOrderLine.setType(Type.ITEM);
        		saleOrderLine.setLocationCode("BLUE");
        		saleOrderLine.setQtyToShip(BigDecimal.valueOf((new Double("200"))));
        		saleOrderLine.setQtyToInvoice(BigDecimal.valueOf((new Double("200"))));
        		list.add(saleOrderLine);
          }
    	  if(salesOrder.getKey()==null){
    		  System.out.println("SALES ORDER KEY IS NULL");
    	  }else{
    		  System.out.println("SALES ORDER KEY IS : "+salesOrder.getKey());
    	  }
    	  salesOrder.setSalesLines(salesOrderLineList);
    	  Holder<Salesorder> salesHolder = new Holder<Salesorder>(salesOrder);
    	  return salesHolder;
    }
    
    public String onCreate(Exchange exchange){
    	System.out.println("THE REQUEST CONTAINS : "+exchange.getIn().getBody());
    	//System.out.println("THE RESPONSE CONTAINS : "+exchange.getOut().getBody());
    	MessageContentsList messageContent=(MessageContentsList)exchange.getIn().getBody();
    	System.out.println("THE RESPONSE CONTAINS : "+messageContent.get(1));
    	Holder<Salesorder> salesHolder = (Holder<Salesorder>)messageContent.get(1);
    	System.out.println("THE NEW KEY GENERATED : "+salesHolder.value.getKey());
    	salesHolder.value.setStatus(Status.RELEASED);
    	return salesHolder.value.getKey();
    }
    public Holder<Salesorder> doUpdate(Exchange exchange){
    	System.out.println("THE REQUEST CONTAINS : "+exchange.getIn().getBody());
    	MessageContentsList messageContent=(MessageContentsList)exchange.getIn().getBody();
    	Salesorder salesOrder=(Salesorder)messageContent.get(0);
    	salesOrder.setStatus(Status.RELEASED);
  	  	Holder<Salesorder> salesHolder = new Holder<Salesorder>(salesOrder);
    	return salesHolder;
    }   
    public String isUpdated(Exchange exchange){
    	System.out.println("THE REQUEST CONTAINS : "+exchange.getIn().getBody());
    	//System.out.println("THE RESPONSE CONTAINS : "+exchange.getOut().getBody());
    	MessageContentsList messageContent=(MessageContentsList)exchange.getIn().getBody();
    	System.out.println("THE RESPONSE CONTAINS : "+messageContent.get(1));
    	Holder<Salesorder> salesHolder = (Holder<Salesorder>)messageContent.get(1);
    	System.out.println("THE NEW KEY GENERATED : "+salesHolder.value.getKey());
    	salesHolder.value.setStatus(Status.RELEASED);
    	return salesHolder.value.getKey();
    }
    public Object[] getSalesOrder(Exchange exchange){
    	Object[] params=new Object[2];
    	params[0]="1270";
    	params[1]="1270";
    	return params;
    } 
   
    public static XMLGregorianCalendar toXMLGregorianCalendar(String date)throws Exception  {
    	DateTime dateTime=DateTime.parse(date);
        final GregorianCalendar calendar = new GregorianCalendar(dateTime.getZone().toTimeZone());
    	//Calendar cal = DatatypeConverter.parseDateTime(date);
    	XMLGregorianCalendar xmlCalender= DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);
        return xmlCalender;
    }
}
