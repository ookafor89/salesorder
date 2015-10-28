
package schemas.dynamics.microsoft.page.transferorder;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Planning_Flexibility.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Planning_Flexibility"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unlimited"/&gt;
 *     &lt;enumeration value="None"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Planning_Flexibility")
@XmlEnum
public enum PlanningFlexibility {

    @XmlEnumValue("Unlimited")
    UNLIMITED("Unlimited"),
    @XmlEnumValue("None")
    NONE("None");
    private final String value;

    PlanningFlexibility(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PlanningFlexibility fromValue(String v) {
        for (PlanningFlexibility c: PlanningFlexibility.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
