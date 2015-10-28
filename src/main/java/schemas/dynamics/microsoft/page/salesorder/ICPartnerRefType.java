
package schemas.dynamics.microsoft.page.salesorder;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IC_Partner_Ref_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IC_Partner_Ref_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_blank_"/&gt;
 *     &lt;enumeration value="G_L_Account"/&gt;
 *     &lt;enumeration value="Item"/&gt;
 *     &lt;enumeration value="Charge_Item"/&gt;
 *     &lt;enumeration value="Cross_Reference"/&gt;
 *     &lt;enumeration value="Common_Item_No"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IC_Partner_Ref_Type")
@XmlEnum
public enum ICPartnerRefType {

    @XmlEnumValue("_blank_")
    BLANK("_blank_"),
    @XmlEnumValue("G_L_Account")
    G_L_ACCOUNT("G_L_Account"),
    @XmlEnumValue("Item")
    ITEM("Item"),
    @XmlEnumValue("Charge_Item")
    CHARGE_ITEM("Charge_Item"),
    @XmlEnumValue("Cross_Reference")
    CROSS_REFERENCE("Cross_Reference"),
    @XmlEnumValue("Common_Item_No")
    COMMON_ITEM_NO("Common_Item_No");
    private final String value;

    ICPartnerRefType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ICPartnerRefType fromValue(String v) {
        for (ICPartnerRefType c: ICPartnerRefType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
