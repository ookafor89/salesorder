
package schemas.dynamics.microsoft.page.transferorder;

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
 *         &lt;element name="transferorder" type="{urn:microsoft-dynamics-schemas/page/transferorder}transferorder"/&gt;
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
    "transferorder"
})
@XmlRootElement(name = "Create_Result")
public class CreateResult {

    @XmlElement(required = true)
    protected Transferorder transferorder;

    /**
     * Gets the value of the transferorder property.
     * 
     * @return
     *     possible object is
     *     {@link Transferorder }
     *     
     */
    public Transferorder getTransferorder() {
        return transferorder;
    }

    /**
     * Sets the value of the transferorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Transferorder }
     *     
     */
    public void setTransferorder(Transferorder value) {
        this.transferorder = value;
    }

}
