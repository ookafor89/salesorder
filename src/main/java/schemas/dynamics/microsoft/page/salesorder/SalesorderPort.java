package schemas.dynamics.microsoft.page.salesorder;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.3
 * 2015-10-20T12:52:20.095+01:00
 * Generated source version: 3.1.3
 * 
 */
@WebService(targetNamespace = "urn:microsoft-dynamics-schemas/page/salesorder", name = "salesorder_Port")
@XmlSeeAlso({ObjectFactory.class})
public interface SalesorderPort {

    @WebResult(name = "return_value", targetNamespace = "urn:microsoft-dynamics-schemas/page/salesorder")
    @RequestWrapper(localName = "GetSalesorder", targetNamespace = "urn:microsoft-dynamics-schemas/page/salesorder", className = "schemas.dynamics.microsoft.page.salesorder.GetSalesorder")
    @WebMethod(operationName = "GetSalesorder", action = "urn:microsoft-dynamics-schemas/page/salesorder:GetSalesorder")
    @ResponseWrapper(localName = "GetSalesorder_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/salesorder", className = "schemas.dynamics.microsoft.page.salesorder.GetSalesorderResult")
    public java.lang.String getSalesorder(
        @WebParam(name = "salesHeader", targetNamespace = "urn:microsoft-dynamics-schemas/page/salesorder")
        java.lang.String salesHeader,
        @WebParam(name = "ref", targetNamespace = "urn:microsoft-dynamics-schemas/page/salesorder")
        java.lang.String ref
    );

    @RequestWrapper(localName = "PostInvoiceForSalesOrder", targetNamespace = "urn:microsoft-dynamics-schemas/page/salesorder", className = "schemas.dynamics.microsoft.page.salesorder.PostInvoiceForSalesOrder")
    @WebMethod(operationName = "PostInvoiceForSalesOrder", action = "urn:microsoft-dynamics-schemas/page/salesorder:PostInvoiceForSalesOrder")
    @ResponseWrapper(localName = "PostInvoiceForSalesOrder_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/salesorder", className = "schemas.dynamics.microsoft.page.salesorder.PostInvoiceForSalesOrderResult")
    public void postInvoiceForSalesOrder(
        @WebParam(name = "salesHeader", targetNamespace = "urn:microsoft-dynamics-schemas/page/salesorder")
        java.lang.String salesHeader
    );

    @RequestWrapper(localName = "Update", targetNamespace = "urn:microsoft-dynamics-schemas/page/salesorder", className = "schemas.dynamics.microsoft.page.salesorder.Update")
    @WebMethod(operationName = "Update", action = "urn:microsoft-dynamics-schemas/page/salesorder:Update")
    @ResponseWrapper(localName = "Update_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/salesorder", className = "schemas.dynamics.microsoft.page.salesorder.UpdateResult")
    public void update(
        @WebParam(mode = WebParam.Mode.INOUT, name = "salesorder", targetNamespace = "urn:microsoft-dynamics-schemas/page/salesorder")
        javax.xml.ws.Holder<Salesorder> salesorder
    );

    @WebResult(name = "GetRecIdFromKey_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/salesorder")
    @RequestWrapper(localName = "GetRecIdFromKey", targetNamespace = "urn:microsoft-dynamics-schemas/page/salesorder", className = "schemas.dynamics.microsoft.page.salesorder.GetRecIdFromKey")
    @WebMethod(operationName = "GetRecIdFromKey", action = "urn:microsoft-dynamics-schemas/page/salesorder:GetRecIdFromKey")
    @ResponseWrapper(localName = "GetRecIdFromKey_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/salesorder", className = "schemas.dynamics.microsoft.page.salesorder.GetRecIdFromKeyResult")
    public java.lang.String getRecIdFromKey(
        @WebParam(name = "Key", targetNamespace = "urn:microsoft-dynamics-schemas/page/salesorder")
        java.lang.String key
    );

    @RequestWrapper(localName = "UpdateMultiple", targetNamespace = "urn:microsoft-dynamics-schemas/page/salesorder", className = "schemas.dynamics.microsoft.page.salesorder.UpdateMultiple")
    @WebMethod(operationName = "UpdateMultiple", action = "urn:microsoft-dynamics-schemas/page/salesorder:UpdateMultiple")
    @ResponseWrapper(localName = "UpdateMultiple_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/salesorder", className = "schemas.dynamics.microsoft.page.salesorder.UpdateMultipleResult")
    public void updateMultiple(
        @WebParam(mode = WebParam.Mode.INOUT, name = "salesorder_List", targetNamespace = "urn:microsoft-dynamics-schemas/page/salesorder")
        javax.xml.ws.Holder<SalesorderList> salesorderList
    );

    @RequestWrapper(localName = "Create", targetNamespace = "urn:microsoft-dynamics-schemas/page/salesorder", className = "schemas.dynamics.microsoft.page.salesorder.Create")
    @WebMethod(operationName = "Create", action = "urn:microsoft-dynamics-schemas/page/salesorder:Create")
    @ResponseWrapper(localName = "Create_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/salesorder", className = "schemas.dynamics.microsoft.page.salesorder.CreateResult")
    public void create(
        @WebParam(mode = WebParam.Mode.INOUT, name = "salesorder", targetNamespace = "urn:microsoft-dynamics-schemas/page/salesorder")
        javax.xml.ws.Holder<Salesorder> salesorder
    );

    @WebResult(name = "salesorder", targetNamespace = "urn:microsoft-dynamics-schemas/page/salesorder")
    @RequestWrapper(localName = "ReadByRecId", targetNamespace = "urn:microsoft-dynamics-schemas/page/salesorder", className = "schemas.dynamics.microsoft.page.salesorder.ReadByRecId")
    @WebMethod(operationName = "ReadByRecId", action = "urn:microsoft-dynamics-schemas/page/salesorder:ReadByRecId")
    @ResponseWrapper(localName = "ReadByRecId_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/salesorder", className = "schemas.dynamics.microsoft.page.salesorder.ReadByRecIdResult")
    public schemas.dynamics.microsoft.page.salesorder.Salesorder readByRecId(
        @WebParam(name = "recId", targetNamespace = "urn:microsoft-dynamics-schemas/page/salesorder")
        java.lang.String recId
    );

    @RequestWrapper(localName = "CreateMultiple", targetNamespace = "urn:microsoft-dynamics-schemas/page/salesorder", className = "schemas.dynamics.microsoft.page.salesorder.CreateMultiple")
    @WebMethod(operationName = "CreateMultiple", action = "urn:microsoft-dynamics-schemas/page/salesorder:CreateMultiple")
    @ResponseWrapper(localName = "CreateMultiple_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/salesorder", className = "schemas.dynamics.microsoft.page.salesorder.CreateMultipleResult")
    public void createMultiple(
        @WebParam(mode = WebParam.Mode.INOUT, name = "salesorder_List", targetNamespace = "urn:microsoft-dynamics-schemas/page/salesorder")
        javax.xml.ws.Holder<SalesorderList> salesorderList
    );

    @WebResult(name = "IsUpdated_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/salesorder")
    @RequestWrapper(localName = "IsUpdated", targetNamespace = "urn:microsoft-dynamics-schemas/page/salesorder", className = "schemas.dynamics.microsoft.page.salesorder.IsUpdated")
    @WebMethod(operationName = "IsUpdated", action = "urn:microsoft-dynamics-schemas/page/salesorder:IsUpdated")
    @ResponseWrapper(localName = "IsUpdated_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/salesorder", className = "schemas.dynamics.microsoft.page.salesorder.IsUpdatedResult")
    public boolean isUpdated(
        @WebParam(name = "Key", targetNamespace = "urn:microsoft-dynamics-schemas/page/salesorder")
        java.lang.String key
    );

    @WebResult(name = "salesorder", targetNamespace = "urn:microsoft-dynamics-schemas/page/salesorder")
    @RequestWrapper(localName = "Read", targetNamespace = "urn:microsoft-dynamics-schemas/page/salesorder", className = "schemas.dynamics.microsoft.page.salesorder.Read")
    @WebMethod(operationName = "Read", action = "urn:microsoft-dynamics-schemas/page/salesorder:Read")
    @ResponseWrapper(localName = "Read_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/salesorder", className = "schemas.dynamics.microsoft.page.salesorder.ReadResult")
    public schemas.dynamics.microsoft.page.salesorder.Salesorder read(
        @WebParam(name = "No", targetNamespace = "urn:microsoft-dynamics-schemas/page/salesorder")
        java.lang.String no
    );

    @RequestWrapper(localName = "PostShipmentForSalesOrder", targetNamespace = "urn:microsoft-dynamics-schemas/page/salesorder", className = "schemas.dynamics.microsoft.page.salesorder.PostShipmentForSalesOrder")
    @WebMethod(operationName = "PostShipmentForSalesOrder", action = "urn:microsoft-dynamics-schemas/page/salesorder:PostShipmentForSalesOrder")
    @ResponseWrapper(localName = "PostShipmentForSalesOrder_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/salesorder", className = "schemas.dynamics.microsoft.page.salesorder.PostShipmentForSalesOrderResult")
    public void postShipmentForSalesOrder(
        @WebParam(name = "salesHeader", targetNamespace = "urn:microsoft-dynamics-schemas/page/salesorder")
        java.lang.String salesHeader
    );

    @WebResult(name = "ReadMultiple_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/salesorder")
    @RequestWrapper(localName = "ReadMultiple", targetNamespace = "urn:microsoft-dynamics-schemas/page/salesorder", className = "schemas.dynamics.microsoft.page.salesorder.ReadMultiple")
    @WebMethod(operationName = "ReadMultiple", action = "urn:microsoft-dynamics-schemas/page/salesorder:ReadMultiple")
    @ResponseWrapper(localName = "ReadMultiple_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/salesorder", className = "schemas.dynamics.microsoft.page.salesorder.ReadMultipleResult")
    public schemas.dynamics.microsoft.page.salesorder.SalesorderList readMultiple(
        @WebParam(name = "filter", targetNamespace = "urn:microsoft-dynamics-schemas/page/salesorder")
        java.util.List<schemas.dynamics.microsoft.page.salesorder.SalesorderFilter> filter,
        @WebParam(name = "bookmarkKey", targetNamespace = "urn:microsoft-dynamics-schemas/page/salesorder")
        java.lang.String bookmarkKey,
        @WebParam(name = "setSize", targetNamespace = "urn:microsoft-dynamics-schemas/page/salesorder")
        int setSize
    );

    @WebResult(name = "Delete_SalesLines_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/salesorder")
    @RequestWrapper(localName = "Delete_SalesLines", targetNamespace = "urn:microsoft-dynamics-schemas/page/salesorder", className = "schemas.dynamics.microsoft.page.salesorder.DeleteSalesLines")
    @WebMethod(operationName = "Delete_SalesLines", action = "urn:microsoft-dynamics-schemas/page/salesorder:Delete_SalesLines")
    @ResponseWrapper(localName = "Delete_SalesLines_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/salesorder", className = "schemas.dynamics.microsoft.page.salesorder.DeleteSalesLinesResult")
    public boolean deleteSalesLines(
        @WebParam(name = "SalesLines_Key", targetNamespace = "urn:microsoft-dynamics-schemas/page/salesorder")
        java.lang.String salesLinesKey
    );

    @WebResult(name = "Delete_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/salesorder")
    @RequestWrapper(localName = "Delete", targetNamespace = "urn:microsoft-dynamics-schemas/page/salesorder", className = "schemas.dynamics.microsoft.page.salesorder.Delete")
    @WebMethod(operationName = "Delete", action = "urn:microsoft-dynamics-schemas/page/salesorder:Delete")
    @ResponseWrapper(localName = "Delete_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/salesorder", className = "schemas.dynamics.microsoft.page.salesorder.DeleteResult")
    public boolean delete(
        @WebParam(name = "Key", targetNamespace = "urn:microsoft-dynamics-schemas/page/salesorder")
        java.lang.String key
    );

    @RequestWrapper(localName = "ReleaseSalesOrder", targetNamespace = "urn:microsoft-dynamics-schemas/page/salesorder", className = "schemas.dynamics.microsoft.page.salesorder.ReleaseSalesOrder")
    @WebMethod(operationName = "ReleaseSalesOrder", action = "urn:microsoft-dynamics-schemas/page/salesorder:ReleaseSalesOrder")
    @ResponseWrapper(localName = "ReleaseSalesOrder_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/salesorder", className = "schemas.dynamics.microsoft.page.salesorder.ReleaseSalesOrderResult")
    public void releaseSalesOrder(
        @WebParam(name = "salesHeader", targetNamespace = "urn:microsoft-dynamics-schemas/page/salesorder")
        java.lang.String salesHeader
    );

    @RequestWrapper(localName = "PostShipmentAndInvoiceForSalesOrder", targetNamespace = "urn:microsoft-dynamics-schemas/page/salesorder", className = "schemas.dynamics.microsoft.page.salesorder.PostShipmentAndInvoiceForSalesOrder")
    @WebMethod(operationName = "PostShipmentAndInvoiceForSalesOrder", action = "urn:microsoft-dynamics-schemas/page/salesorder:PostShipmentAndInvoiceForSalesOrder")
    @ResponseWrapper(localName = "PostShipmentAndInvoiceForSalesOrder_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/salesorder", className = "schemas.dynamics.microsoft.page.salesorder.PostShipmentAndInvoiceForSalesOrderResult")
    public void postShipmentAndInvoiceForSalesOrder(
        @WebParam(name = "salesHeader", targetNamespace = "urn:microsoft-dynamics-schemas/page/salesorder")
        java.lang.String salesHeader
    );
}
