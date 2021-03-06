
package schemas.dynamics.microsoft.page.salesorder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="salesorder" type="{urn:microsoft-dynamics-schemas/page/salesorder}salesorder"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "salesorder"
})
@XmlRootElement(name = "Create_Result")
public class CreateResult {

    @XmlElement(required = true)
    protected Salesorder salesorder;

    /**
     * Gets the value of the salesorder property.
     * 
     * @return
     *     possible object is
     *     {@link Salesorder }
     *     
     */
    public Salesorder getSalesorder() {
        return salesorder;
    }

    /**
     * Sets the value of the salesorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Salesorder }
     *     
     */
    public void setSalesorder(Salesorder value) {
        this.salesorder = value;
    }

}
