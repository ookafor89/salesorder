
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
 *         &lt;element name="transferHeader" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "transferHeader"
})
@XmlRootElement(name = "CreateShipment")
public class CreateShipment {

    @XmlElement(required = true)
    protected String transferHeader;

    /**
     * Gets the value of the transferHeader property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferHeader() {
        return transferHeader;
    }

    /**
     * Sets the value of the transferHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferHeader(String value) {
        this.transferHeader = value;
    }

}
