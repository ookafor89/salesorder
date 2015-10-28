
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
 *         &lt;element name="SalesLines_Key" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "salesLinesKey"
})
@XmlRootElement(name = "Delete_SalesLines")
public class DeleteSalesLines {

    @XmlElement(name = "SalesLines_Key", required = true)
    protected String salesLinesKey;

    /**
     * Gets the value of the salesLinesKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesLinesKey() {
        return salesLinesKey;
    }

    /**
     * Sets the value of the salesLinesKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesLinesKey(String value) {
        this.salesLinesKey = value;
    }

}
