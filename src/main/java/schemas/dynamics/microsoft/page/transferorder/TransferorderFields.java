
package schemas.dynamics.microsoft.page.transferorder;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transferorder_Fields.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="transferorder_Fields"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="No"/&gt;
 *     &lt;enumeration value="Transfer_from_Code"/&gt;
 *     &lt;enumeration value="Transfer_to_Code"/&gt;
 *     &lt;enumeration value="In_Transit_Code"/&gt;
 *     &lt;enumeration value="Posting_Date"/&gt;
 *     &lt;enumeration value="Shortcut_Dimension_1_Code"/&gt;
 *     &lt;enumeration value="Shortcut_Dimension_2_Code"/&gt;
 *     &lt;enumeration value="Assigned_User_ID"/&gt;
 *     &lt;enumeration value="Status"/&gt;
 *     &lt;enumeration value="Transfer_from_Name"/&gt;
 *     &lt;enumeration value="Transfer_from_Name_2"/&gt;
 *     &lt;enumeration value="Transfer_from_Address"/&gt;
 *     &lt;enumeration value="Transfer_from_Address_2"/&gt;
 *     &lt;enumeration value="Transfer_from_Post_Code"/&gt;
 *     &lt;enumeration value="Transfer_from_City"/&gt;
 *     &lt;enumeration value="Transfer_from_Contact"/&gt;
 *     &lt;enumeration value="Shipment_Date"/&gt;
 *     &lt;enumeration value="Outbound_Whse_Handling_Time"/&gt;
 *     &lt;enumeration value="Shipment_Method_Code"/&gt;
 *     &lt;enumeration value="Shipping_Agent_Code"/&gt;
 *     &lt;enumeration value="Shipping_Agent_Service_Code"/&gt;
 *     &lt;enumeration value="Shipping_Time"/&gt;
 *     &lt;enumeration value="Shipping_Advice"/&gt;
 *     &lt;enumeration value="Transfer_to_Name"/&gt;
 *     &lt;enumeration value="Transfer_to_Name_2"/&gt;
 *     &lt;enumeration value="Transfer_to_Address"/&gt;
 *     &lt;enumeration value="Transfer_to_Address_2"/&gt;
 *     &lt;enumeration value="Transfer_to_Post_Code"/&gt;
 *     &lt;enumeration value="Transfer_to_City"/&gt;
 *     &lt;enumeration value="Transfer_to_Contact"/&gt;
 *     &lt;enumeration value="Receipt_Date"/&gt;
 *     &lt;enumeration value="Inbound_Whse_Handling_Time"/&gt;
 *     &lt;enumeration value="Transaction_Type"/&gt;
 *     &lt;enumeration value="Transaction_Specification"/&gt;
 *     &lt;enumeration value="Transport_Method"/&gt;
 *     &lt;enumeration value="Area"/&gt;
 *     &lt;enumeration value="Entry_Exit_Point"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "transferorder_Fields")
@XmlEnum
public enum TransferorderFields {

    @XmlEnumValue("No")
    NO("No"),
    @XmlEnumValue("Transfer_from_Code")
    TRANSFER_FROM_CODE("Transfer_from_Code"),
    @XmlEnumValue("Transfer_to_Code")
    TRANSFER_TO_CODE("Transfer_to_Code"),
    @XmlEnumValue("In_Transit_Code")
    IN_TRANSIT_CODE("In_Transit_Code"),
    @XmlEnumValue("Posting_Date")
    POSTING_DATE("Posting_Date"),
    @XmlEnumValue("Shortcut_Dimension_1_Code")
    SHORTCUT_DIMENSION_1_CODE("Shortcut_Dimension_1_Code"),
    @XmlEnumValue("Shortcut_Dimension_2_Code")
    SHORTCUT_DIMENSION_2_CODE("Shortcut_Dimension_2_Code"),
    @XmlEnumValue("Assigned_User_ID")
    ASSIGNED_USER_ID("Assigned_User_ID"),
    @XmlEnumValue("Status")
    STATUS("Status"),
    @XmlEnumValue("Transfer_from_Name")
    TRANSFER_FROM_NAME("Transfer_from_Name"),
    @XmlEnumValue("Transfer_from_Name_2")
    TRANSFER_FROM_NAME_2("Transfer_from_Name_2"),
    @XmlEnumValue("Transfer_from_Address")
    TRANSFER_FROM_ADDRESS("Transfer_from_Address"),
    @XmlEnumValue("Transfer_from_Address_2")
    TRANSFER_FROM_ADDRESS_2("Transfer_from_Address_2"),
    @XmlEnumValue("Transfer_from_Post_Code")
    TRANSFER_FROM_POST_CODE("Transfer_from_Post_Code"),
    @XmlEnumValue("Transfer_from_City")
    TRANSFER_FROM_CITY("Transfer_from_City"),
    @XmlEnumValue("Transfer_from_Contact")
    TRANSFER_FROM_CONTACT("Transfer_from_Contact"),
    @XmlEnumValue("Shipment_Date")
    SHIPMENT_DATE("Shipment_Date"),
    @XmlEnumValue("Outbound_Whse_Handling_Time")
    OUTBOUND_WHSE_HANDLING_TIME("Outbound_Whse_Handling_Time"),
    @XmlEnumValue("Shipment_Method_Code")
    SHIPMENT_METHOD_CODE("Shipment_Method_Code"),
    @XmlEnumValue("Shipping_Agent_Code")
    SHIPPING_AGENT_CODE("Shipping_Agent_Code"),
    @XmlEnumValue("Shipping_Agent_Service_Code")
    SHIPPING_AGENT_SERVICE_CODE("Shipping_Agent_Service_Code"),
    @XmlEnumValue("Shipping_Time")
    SHIPPING_TIME("Shipping_Time"),
    @XmlEnumValue("Shipping_Advice")
    SHIPPING_ADVICE("Shipping_Advice"),
    @XmlEnumValue("Transfer_to_Name")
    TRANSFER_TO_NAME("Transfer_to_Name"),
    @XmlEnumValue("Transfer_to_Name_2")
    TRANSFER_TO_NAME_2("Transfer_to_Name_2"),
    @XmlEnumValue("Transfer_to_Address")
    TRANSFER_TO_ADDRESS("Transfer_to_Address"),
    @XmlEnumValue("Transfer_to_Address_2")
    TRANSFER_TO_ADDRESS_2("Transfer_to_Address_2"),
    @XmlEnumValue("Transfer_to_Post_Code")
    TRANSFER_TO_POST_CODE("Transfer_to_Post_Code"),
    @XmlEnumValue("Transfer_to_City")
    TRANSFER_TO_CITY("Transfer_to_City"),
    @XmlEnumValue("Transfer_to_Contact")
    TRANSFER_TO_CONTACT("Transfer_to_Contact"),
    @XmlEnumValue("Receipt_Date")
    RECEIPT_DATE("Receipt_Date"),
    @XmlEnumValue("Inbound_Whse_Handling_Time")
    INBOUND_WHSE_HANDLING_TIME("Inbound_Whse_Handling_Time"),
    @XmlEnumValue("Transaction_Type")
    TRANSACTION_TYPE("Transaction_Type"),
    @XmlEnumValue("Transaction_Specification")
    TRANSACTION_SPECIFICATION("Transaction_Specification"),
    @XmlEnumValue("Transport_Method")
    TRANSPORT_METHOD("Transport_Method"),
    @XmlEnumValue("Area")
    AREA("Area"),
    @XmlEnumValue("Entry_Exit_Point")
    ENTRY_EXIT_POINT("Entry_Exit_Point");
    private final String value;

    TransferorderFields(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransferorderFields fromValue(String v) {
        for (TransferorderFields c: TransferorderFields.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
