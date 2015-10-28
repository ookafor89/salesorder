
package schemas.dynamics.microsoft.page.transferorder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for transferorder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transferorder"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Transfer_from_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Transfer_to_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="In_Transit_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Posting_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Shortcut_Dimension_1_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Shortcut_Dimension_2_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Assigned_User_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{urn:microsoft-dynamics-schemas/page/transferorder}Status" minOccurs="0"/&gt;
 *         &lt;element name="Transfer_from_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Transfer_from_Name_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Transfer_from_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Transfer_from_Address_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Transfer_from_Post_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Transfer_from_City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Transfer_from_Contact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Shipment_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Outbound_Whse_Handling_Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Shipment_Method_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Shipping_Agent_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Shipping_Agent_Service_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Shipping_Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Shipping_Advice" type="{urn:microsoft-dynamics-schemas/page/transferorder}Shipping_Advice" minOccurs="0"/&gt;
 *         &lt;element name="Transfer_to_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Transfer_to_Name_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Transfer_to_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Transfer_to_Address_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Transfer_to_Post_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Transfer_to_City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Transfer_to_Contact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Receipt_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Inbound_Whse_Handling_Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Transaction_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Transaction_Specification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Transport_Method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Area" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Entry_Exit_Point" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TransferLines" type="{urn:microsoft-dynamics-schemas/page/transferorder}Transfer_Order_Line_List" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transferorder", propOrder = {
    "key",
    "no",
    "transferFromCode",
    "transferToCode",
    "inTransitCode",
    "postingDate",
    "shortcutDimension1Code",
    "shortcutDimension2Code",
    "assignedUserID",
    "status",
    "transferFromName",
    "transferFromName2",
    "transferFromAddress",
    "transferFromAddress2",
    "transferFromPostCode",
    "transferFromCity",
    "transferFromContact",
    "shipmentDate",
    "outboundWhseHandlingTime",
    "shipmentMethodCode",
    "shippingAgentCode",
    "shippingAgentServiceCode",
    "shippingTime",
    "shippingAdvice",
    "transferToName",
    "transferToName2",
    "transferToAddress",
    "transferToAddress2",
    "transferToPostCode",
    "transferToCity",
    "transferToContact",
    "receiptDate",
    "inboundWhseHandlingTime",
    "transactionType",
    "transactionSpecification",
    "transportMethod",
    "area",
    "entryExitPoint",
    "transferLines"
})
public class Transferorder {

    @XmlElement(name = "Key")
    protected String key;
    @XmlElement(name = "No")
    protected String no;
    @XmlElement(name = "Transfer_from_Code")
    protected String transferFromCode;
    @XmlElement(name = "Transfer_to_Code")
    protected String transferToCode;
    @XmlElement(name = "In_Transit_Code")
    protected String inTransitCode;
    @XmlElement(name = "Posting_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar postingDate;
    @XmlElement(name = "Shortcut_Dimension_1_Code")
    protected String shortcutDimension1Code;
    @XmlElement(name = "Shortcut_Dimension_2_Code")
    protected String shortcutDimension2Code;
    @XmlElement(name = "Assigned_User_ID")
    protected String assignedUserID;
    @XmlElement(name = "Status")
    @XmlSchemaType(name = "string")
    protected Status status;
    @XmlElement(name = "Transfer_from_Name")
    protected String transferFromName;
    @XmlElement(name = "Transfer_from_Name_2")
    protected String transferFromName2;
    @XmlElement(name = "Transfer_from_Address")
    protected String transferFromAddress;
    @XmlElement(name = "Transfer_from_Address_2")
    protected String transferFromAddress2;
    @XmlElement(name = "Transfer_from_Post_Code")
    protected String transferFromPostCode;
    @XmlElement(name = "Transfer_from_City")
    protected String transferFromCity;
    @XmlElement(name = "Transfer_from_Contact")
    protected String transferFromContact;
    @XmlElement(name = "Shipment_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar shipmentDate;
    @XmlElement(name = "Outbound_Whse_Handling_Time")
    protected String outboundWhseHandlingTime;
    @XmlElement(name = "Shipment_Method_Code")
    protected String shipmentMethodCode;
    @XmlElement(name = "Shipping_Agent_Code")
    protected String shippingAgentCode;
    @XmlElement(name = "Shipping_Agent_Service_Code")
    protected String shippingAgentServiceCode;
    @XmlElement(name = "Shipping_Time")
    protected String shippingTime;
    @XmlElement(name = "Shipping_Advice")
    @XmlSchemaType(name = "string")
    protected ShippingAdvice shippingAdvice;
    @XmlElement(name = "Transfer_to_Name")
    protected String transferToName;
    @XmlElement(name = "Transfer_to_Name_2")
    protected String transferToName2;
    @XmlElement(name = "Transfer_to_Address")
    protected String transferToAddress;
    @XmlElement(name = "Transfer_to_Address_2")
    protected String transferToAddress2;
    @XmlElement(name = "Transfer_to_Post_Code")
    protected String transferToPostCode;
    @XmlElement(name = "Transfer_to_City")
    protected String transferToCity;
    @XmlElement(name = "Transfer_to_Contact")
    protected String transferToContact;
    @XmlElement(name = "Receipt_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar receiptDate;
    @XmlElement(name = "Inbound_Whse_Handling_Time")
    protected String inboundWhseHandlingTime;
    @XmlElement(name = "Transaction_Type")
    protected String transactionType;
    @XmlElement(name = "Transaction_Specification")
    protected String transactionSpecification;
    @XmlElement(name = "Transport_Method")
    protected String transportMethod;
    @XmlElement(name = "Area")
    protected String area;
    @XmlElement(name = "Entry_Exit_Point")
    protected String entryExitPoint;
    @XmlElement(name = "TransferLines")
    protected TransferOrderLineList transferLines;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the no property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNo() {
        return no;
    }

    /**
     * Sets the value of the no property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNo(String value) {
        this.no = value;
    }

    /**
     * Gets the value of the transferFromCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferFromCode() {
        return transferFromCode;
    }

    /**
     * Sets the value of the transferFromCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferFromCode(String value) {
        this.transferFromCode = value;
    }

    /**
     * Gets the value of the transferToCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferToCode() {
        return transferToCode;
    }

    /**
     * Sets the value of the transferToCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferToCode(String value) {
        this.transferToCode = value;
    }

    /**
     * Gets the value of the inTransitCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTransitCode() {
        return inTransitCode;
    }

    /**
     * Sets the value of the inTransitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTransitCode(String value) {
        this.inTransitCode = value;
    }

    /**
     * Gets the value of the postingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPostingDate() {
        return postingDate;
    }

    /**
     * Sets the value of the postingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPostingDate(XMLGregorianCalendar value) {
        this.postingDate = value;
    }

    /**
     * Gets the value of the shortcutDimension1Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortcutDimension1Code() {
        return shortcutDimension1Code;
    }

    /**
     * Sets the value of the shortcutDimension1Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortcutDimension1Code(String value) {
        this.shortcutDimension1Code = value;
    }

    /**
     * Gets the value of the shortcutDimension2Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortcutDimension2Code() {
        return shortcutDimension2Code;
    }

    /**
     * Sets the value of the shortcutDimension2Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortcutDimension2Code(String value) {
        this.shortcutDimension2Code = value;
    }

    /**
     * Gets the value of the assignedUserID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignedUserID() {
        return assignedUserID;
    }

    /**
     * Sets the value of the assignedUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignedUserID(String value) {
        this.assignedUserID = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the transferFromName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferFromName() {
        return transferFromName;
    }

    /**
     * Sets the value of the transferFromName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferFromName(String value) {
        this.transferFromName = value;
    }

    /**
     * Gets the value of the transferFromName2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferFromName2() {
        return transferFromName2;
    }

    /**
     * Sets the value of the transferFromName2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferFromName2(String value) {
        this.transferFromName2 = value;
    }

    /**
     * Gets the value of the transferFromAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferFromAddress() {
        return transferFromAddress;
    }

    /**
     * Sets the value of the transferFromAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferFromAddress(String value) {
        this.transferFromAddress = value;
    }

    /**
     * Gets the value of the transferFromAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferFromAddress2() {
        return transferFromAddress2;
    }

    /**
     * Sets the value of the transferFromAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferFromAddress2(String value) {
        this.transferFromAddress2 = value;
    }

    /**
     * Gets the value of the transferFromPostCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferFromPostCode() {
        return transferFromPostCode;
    }

    /**
     * Sets the value of the transferFromPostCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferFromPostCode(String value) {
        this.transferFromPostCode = value;
    }

    /**
     * Gets the value of the transferFromCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferFromCity() {
        return transferFromCity;
    }

    /**
     * Sets the value of the transferFromCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferFromCity(String value) {
        this.transferFromCity = value;
    }

    /**
     * Gets the value of the transferFromContact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferFromContact() {
        return transferFromContact;
    }

    /**
     * Sets the value of the transferFromContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferFromContact(String value) {
        this.transferFromContact = value;
    }

    /**
     * Gets the value of the shipmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShipmentDate() {
        return shipmentDate;
    }

    /**
     * Sets the value of the shipmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShipmentDate(XMLGregorianCalendar value) {
        this.shipmentDate = value;
    }

    /**
     * Gets the value of the outboundWhseHandlingTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutboundWhseHandlingTime() {
        return outboundWhseHandlingTime;
    }

    /**
     * Sets the value of the outboundWhseHandlingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutboundWhseHandlingTime(String value) {
        this.outboundWhseHandlingTime = value;
    }

    /**
     * Gets the value of the shipmentMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentMethodCode() {
        return shipmentMethodCode;
    }

    /**
     * Sets the value of the shipmentMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentMethodCode(String value) {
        this.shipmentMethodCode = value;
    }

    /**
     * Gets the value of the shippingAgentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingAgentCode() {
        return shippingAgentCode;
    }

    /**
     * Sets the value of the shippingAgentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingAgentCode(String value) {
        this.shippingAgentCode = value;
    }

    /**
     * Gets the value of the shippingAgentServiceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingAgentServiceCode() {
        return shippingAgentServiceCode;
    }

    /**
     * Sets the value of the shippingAgentServiceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingAgentServiceCode(String value) {
        this.shippingAgentServiceCode = value;
    }

    /**
     * Gets the value of the shippingTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingTime() {
        return shippingTime;
    }

    /**
     * Sets the value of the shippingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingTime(String value) {
        this.shippingTime = value;
    }

    /**
     * Gets the value of the shippingAdvice property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingAdvice }
     *     
     */
    public ShippingAdvice getShippingAdvice() {
        return shippingAdvice;
    }

    /**
     * Sets the value of the shippingAdvice property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingAdvice }
     *     
     */
    public void setShippingAdvice(ShippingAdvice value) {
        this.shippingAdvice = value;
    }

    /**
     * Gets the value of the transferToName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferToName() {
        return transferToName;
    }

    /**
     * Sets the value of the transferToName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferToName(String value) {
        this.transferToName = value;
    }

    /**
     * Gets the value of the transferToName2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferToName2() {
        return transferToName2;
    }

    /**
     * Sets the value of the transferToName2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferToName2(String value) {
        this.transferToName2 = value;
    }

    /**
     * Gets the value of the transferToAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferToAddress() {
        return transferToAddress;
    }

    /**
     * Sets the value of the transferToAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferToAddress(String value) {
        this.transferToAddress = value;
    }

    /**
     * Gets the value of the transferToAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferToAddress2() {
        return transferToAddress2;
    }

    /**
     * Sets the value of the transferToAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferToAddress2(String value) {
        this.transferToAddress2 = value;
    }

    /**
     * Gets the value of the transferToPostCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferToPostCode() {
        return transferToPostCode;
    }

    /**
     * Sets the value of the transferToPostCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferToPostCode(String value) {
        this.transferToPostCode = value;
    }

    /**
     * Gets the value of the transferToCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferToCity() {
        return transferToCity;
    }

    /**
     * Sets the value of the transferToCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferToCity(String value) {
        this.transferToCity = value;
    }

    /**
     * Gets the value of the transferToContact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferToContact() {
        return transferToContact;
    }

    /**
     * Sets the value of the transferToContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferToContact(String value) {
        this.transferToContact = value;
    }

    /**
     * Gets the value of the receiptDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReceiptDate() {
        return receiptDate;
    }

    /**
     * Sets the value of the receiptDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReceiptDate(XMLGregorianCalendar value) {
        this.receiptDate = value;
    }

    /**
     * Gets the value of the inboundWhseHandlingTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInboundWhseHandlingTime() {
        return inboundWhseHandlingTime;
    }

    /**
     * Sets the value of the inboundWhseHandlingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInboundWhseHandlingTime(String value) {
        this.inboundWhseHandlingTime = value;
    }

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionType(String value) {
        this.transactionType = value;
    }

    /**
     * Gets the value of the transactionSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionSpecification() {
        return transactionSpecification;
    }

    /**
     * Sets the value of the transactionSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionSpecification(String value) {
        this.transactionSpecification = value;
    }

    /**
     * Gets the value of the transportMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportMethod() {
        return transportMethod;
    }

    /**
     * Sets the value of the transportMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportMethod(String value) {
        this.transportMethod = value;
    }

    /**
     * Gets the value of the area property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArea(String value) {
        this.area = value;
    }

    /**
     * Gets the value of the entryExitPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryExitPoint() {
        return entryExitPoint;
    }

    /**
     * Sets the value of the entryExitPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryExitPoint(String value) {
        this.entryExitPoint = value;
    }

    /**
     * Gets the value of the transferLines property.
     * 
     * @return
     *     possible object is
     *     {@link TransferOrderLineList }
     *     
     */
    public TransferOrderLineList getTransferLines() {
        return transferLines;
    }

    /**
     * Sets the value of the transferLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferOrderLineList }
     *     
     */
    public void setTransferLines(TransferOrderLineList value) {
        this.transferLines = value;
    }

}
