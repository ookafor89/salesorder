
package schemas.dynamics.microsoft.page.salesorder;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Job_Queue_Status.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Job_Queue_Status"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_blank_"/&gt;
 *     &lt;enumeration value="Scheduled_for_Posting"/&gt;
 *     &lt;enumeration value="Error"/&gt;
 *     &lt;enumeration value="Posting"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Job_Queue_Status")
@XmlEnum
public enum JobQueueStatus {

    @XmlEnumValue("_blank_")
    BLANK("_blank_"),
    @XmlEnumValue("Scheduled_for_Posting")
    SCHEDULED_FOR_POSTING("Scheduled_for_Posting"),
    @XmlEnumValue("Error")
    ERROR("Error"),
    @XmlEnumValue("Posting")
    POSTING("Posting");
    private final String value;

    JobQueueStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static JobQueueStatus fromValue(String v) {
        for (JobQueueStatus c: JobQueueStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
