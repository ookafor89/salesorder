
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
 *         &lt;element name="salesHeader" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "salesHeader"
})
@XmlRootElement(name = "PostInvoiceForSalesOrder")
public class PostInvoiceForSalesOrder {

    @XmlElement(required = true)
    protected String salesHeader;

    /**
     * Gets the value of the salesHeader property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesHeader() {
        return salesHeader;
    }

    /**
     * Sets the value of the salesHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesHeader(String value) {
        this.salesHeader = value;
    }

}
