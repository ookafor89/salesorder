
package schemas.dynamics.microsoft.page.transferorder;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Transfer_Order_Line complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Transfer_Order_Line"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Item_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Variant_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Planning_Flexibility" type="{urn:microsoft-dynamics-schemas/page/transferorder}Planning_Flexibility" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Transfer_from_Bin_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Transfer_To_Bin_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Reserved_Quantity_Inbnd" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Reserved_Quantity_Shipped" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Reserved_Quantity_Outbnd" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Unit_of_Measure_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Unit_of_Measure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Qty_to_Ship" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Quantity_Shipped" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Qty_to_Receive" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Quantity_Received" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Shipment_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Receipt_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Shipping_Agent_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Shipping_Agent_Service_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Shipping_Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Outbound_Whse_Handling_Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Inbound_Whse_Handling_Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Shortcut_Dimension_1_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Shortcut_Dimension_2_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShortcutDimCode_x005B_3_x005D_" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShortcutDimCode_x005B_4_x005D_" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShortcutDimCode_x005B_5_x005D_" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShortcutDimCode_x005B_6_x005D_" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShortcutDimCode_x005B_7_x005D_" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShortcutDimCode_x005B_8_x005D_" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transfer_Order_Line", propOrder = {
    "key",
    "itemNo",
    "variantCode",
    "planningFlexibility",
    "description",
    "transferFromBinCode",
    "transferToBinCode",
    "quantity",
    "reservedQuantityInbnd",
    "reservedQuantityShipped",
    "reservedQuantityOutbnd",
    "unitOfMeasureCode",
    "unitOfMeasure",
    "qtyToShip",
    "quantityShipped",
    "qtyToReceive",
    "quantityReceived",
    "shipmentDate",
    "receiptDate",
    "shippingAgentCode",
    "shippingAgentServiceCode",
    "shippingTime",
    "outboundWhseHandlingTime",
    "inboundWhseHandlingTime",
    "shortcutDimension1Code",
    "shortcutDimension2Code",
    "shortcutDimCodeX005B3X005D",
    "shortcutDimCodeX005B4X005D",
    "shortcutDimCodeX005B5X005D",
    "shortcutDimCodeX005B6X005D",
    "shortcutDimCodeX005B7X005D",
    "shortcutDimCodeX005B8X005D"
})
public class TransferOrderLine {

    @XmlElement(name = "Key")
    protected String key;
    @XmlElement(name = "Item_No")
    protected String itemNo;
    @XmlElement(name = "Variant_Code")
    protected String variantCode;
    @XmlElement(name = "Planning_Flexibility")
    @XmlSchemaType(name = "string")
    protected PlanningFlexibility planningFlexibility;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Transfer_from_Bin_Code")
    protected String transferFromBinCode;
    @XmlElement(name = "Transfer_To_Bin_Code")
    protected String transferToBinCode;
    @XmlElement(name = "Quantity")
    protected BigDecimal quantity;
    @XmlElement(name = "Reserved_Quantity_Inbnd")
    protected BigDecimal reservedQuantityInbnd;
    @XmlElement(name = "Reserved_Quantity_Shipped")
    protected BigDecimal reservedQuantityShipped;
    @XmlElement(name = "Reserved_Quantity_Outbnd")
    protected BigDecimal reservedQuantityOutbnd;
    @XmlElement(name = "Unit_of_Measure_Code")
    protected String unitOfMeasureCode;
    @XmlElement(name = "Unit_of_Measure")
    protected String unitOfMeasure;
    @XmlElement(name = "Qty_to_Ship")
    protected BigDecimal qtyToShip;
    @XmlElement(name = "Quantity_Shipped")
    protected BigDecimal quantityShipped;
    @XmlElement(name = "Qty_to_Receive")
    protected BigDecimal qtyToReceive;
    @XmlElement(name = "Quantity_Received")
    protected BigDecimal quantityReceived;
    @XmlElement(name = "Shipment_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar shipmentDate;
    @XmlElement(name = "Receipt_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar receiptDate;
    @XmlElement(name = "Shipping_Agent_Code")
    protected String shippingAgentCode;
    @XmlElement(name = "Shipping_Agent_Service_Code")
    protected String shippingAgentServiceCode;
    @XmlElement(name = "Shipping_Time")
    protected String shippingTime;
    @XmlElement(name = "Outbound_Whse_Handling_Time")
    protected String outboundWhseHandlingTime;
    @XmlElement(name = "Inbound_Whse_Handling_Time")
    protected String inboundWhseHandlingTime;
    @XmlElement(name = "Shortcut_Dimension_1_Code")
    protected String shortcutDimension1Code;
    @XmlElement(name = "Shortcut_Dimension_2_Code")
    protected String shortcutDimension2Code;
    @XmlElement(name = "ShortcutDimCode_x005B_3_x005D_")
    protected String shortcutDimCodeX005B3X005D;
    @XmlElement(name = "ShortcutDimCode_x005B_4_x005D_")
    protected String shortcutDimCodeX005B4X005D;
    @XmlElement(name = "ShortcutDimCode_x005B_5_x005D_")
    protected String shortcutDimCodeX005B5X005D;
    @XmlElement(name = "ShortcutDimCode_x005B_6_x005D_")
    protected String shortcutDimCodeX005B6X005D;
    @XmlElement(name = "ShortcutDimCode_x005B_7_x005D_")
    protected String shortcutDimCodeX005B7X005D;
    @XmlElement(name = "ShortcutDimCode_x005B_8_x005D_")
    protected String shortcutDimCodeX005B8X005D;

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
     * Gets the value of the itemNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemNo() {
        return itemNo;
    }

    /**
     * Sets the value of the itemNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemNo(String value) {
        this.itemNo = value;
    }

    /**
     * Gets the value of the variantCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariantCode() {
        return variantCode;
    }

    /**
     * Sets the value of the variantCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariantCode(String value) {
        this.variantCode = value;
    }

    /**
     * Gets the value of the planningFlexibility property.
     * 
     * @return
     *     possible object is
     *     {@link PlanningFlexibility }
     *     
     */
    public PlanningFlexibility getPlanningFlexibility() {
        return planningFlexibility;
    }

    /**
     * Sets the value of the planningFlexibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanningFlexibility }
     *     
     */
    public void setPlanningFlexibility(PlanningFlexibility value) {
        this.planningFlexibility = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the transferFromBinCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferFromBinCode() {
        return transferFromBinCode;
    }

    /**
     * Sets the value of the transferFromBinCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferFromBinCode(String value) {
        this.transferFromBinCode = value;
    }

    /**
     * Gets the value of the transferToBinCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferToBinCode() {
        return transferToBinCode;
    }

    /**
     * Sets the value of the transferToBinCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferToBinCode(String value) {
        this.transferToBinCode = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantity(BigDecimal value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the reservedQuantityInbnd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReservedQuantityInbnd() {
        return reservedQuantityInbnd;
    }

    /**
     * Sets the value of the reservedQuantityInbnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReservedQuantityInbnd(BigDecimal value) {
        this.reservedQuantityInbnd = value;
    }

    /**
     * Gets the value of the reservedQuantityShipped property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReservedQuantityShipped() {
        return reservedQuantityShipped;
    }

    /**
     * Sets the value of the reservedQuantityShipped property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReservedQuantityShipped(BigDecimal value) {
        this.reservedQuantityShipped = value;
    }

    /**
     * Gets the value of the reservedQuantityOutbnd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReservedQuantityOutbnd() {
        return reservedQuantityOutbnd;
    }

    /**
     * Sets the value of the reservedQuantityOutbnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReservedQuantityOutbnd(BigDecimal value) {
        this.reservedQuantityOutbnd = value;
    }

    /**
     * Gets the value of the unitOfMeasureCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOfMeasureCode() {
        return unitOfMeasureCode;
    }

    /**
     * Sets the value of the unitOfMeasureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitOfMeasureCode(String value) {
        this.unitOfMeasureCode = value;
    }

    /**
     * Gets the value of the unitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Sets the value of the unitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitOfMeasure(String value) {
        this.unitOfMeasure = value;
    }

    /**
     * Gets the value of the qtyToShip property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQtyToShip() {
        return qtyToShip;
    }

    /**
     * Sets the value of the qtyToShip property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQtyToShip(BigDecimal value) {
        this.qtyToShip = value;
    }

    /**
     * Gets the value of the quantityShipped property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantityShipped() {
        return quantityShipped;
    }

    /**
     * Sets the value of the quantityShipped property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantityShipped(BigDecimal value) {
        this.quantityShipped = value;
    }

    /**
     * Gets the value of the qtyToReceive property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQtyToReceive() {
        return qtyToReceive;
    }

    /**
     * Sets the value of the qtyToReceive property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQtyToReceive(BigDecimal value) {
        this.qtyToReceive = value;
    }

    /**
     * Gets the value of the quantityReceived property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantityReceived() {
        return quantityReceived;
    }

    /**
     * Sets the value of the quantityReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantityReceived(BigDecimal value) {
        this.quantityReceived = value;
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
     * Gets the value of the shortcutDimCodeX005B3X005D property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortcutDimCodeX005B3X005D() {
        return shortcutDimCodeX005B3X005D;
    }

    /**
     * Sets the value of the shortcutDimCodeX005B3X005D property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortcutDimCodeX005B3X005D(String value) {
        this.shortcutDimCodeX005B3X005D = value;
    }

    /**
     * Gets the value of the shortcutDimCodeX005B4X005D property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortcutDimCodeX005B4X005D() {
        return shortcutDimCodeX005B4X005D;
    }

    /**
     * Sets the value of the shortcutDimCodeX005B4X005D property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortcutDimCodeX005B4X005D(String value) {
        this.shortcutDimCodeX005B4X005D = value;
    }

    /**
     * Gets the value of the shortcutDimCodeX005B5X005D property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortcutDimCodeX005B5X005D() {
        return shortcutDimCodeX005B5X005D;
    }

    /**
     * Sets the value of the shortcutDimCodeX005B5X005D property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortcutDimCodeX005B5X005D(String value) {
        this.shortcutDimCodeX005B5X005D = value;
    }

    /**
     * Gets the value of the shortcutDimCodeX005B6X005D property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortcutDimCodeX005B6X005D() {
        return shortcutDimCodeX005B6X005D;
    }

    /**
     * Sets the value of the shortcutDimCodeX005B6X005D property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortcutDimCodeX005B6X005D(String value) {
        this.shortcutDimCodeX005B6X005D = value;
    }

    /**
     * Gets the value of the shortcutDimCodeX005B7X005D property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortcutDimCodeX005B7X005D() {
        return shortcutDimCodeX005B7X005D;
    }

    /**
     * Sets the value of the shortcutDimCodeX005B7X005D property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortcutDimCodeX005B7X005D(String value) {
        this.shortcutDimCodeX005B7X005D = value;
    }

    /**
     * Gets the value of the shortcutDimCodeX005B8X005D property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortcutDimCodeX005B8X005D() {
        return shortcutDimCodeX005B8X005D;
    }

    /**
     * Sets the value of the shortcutDimCodeX005B8X005D property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortcutDimCodeX005B8X005D(String value) {
        this.shortcutDimCodeX005B8X005D = value;
    }

}
