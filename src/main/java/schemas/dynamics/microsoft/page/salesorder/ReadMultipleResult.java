
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
 *         &lt;element name="ReadMultiple_Result" type="{urn:microsoft-dynamics-schemas/page/salesorder}salesorder_List" minOccurs="0"/&gt;
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
    "readMultipleResult"
})
@XmlRootElement(name = "ReadMultiple_Result")
public class ReadMultipleResult {

    @XmlElement(name = "ReadMultiple_Result")
    protected SalesorderList readMultipleResult;

    /**
     * Gets the value of the readMultipleResult property.
     * 
     * @return
     *     possible object is
     *     {@link SalesorderList }
     *     
     */
    public SalesorderList getReadMultipleResult() {
        return readMultipleResult;
    }

    /**
     * Sets the value of the readMultipleResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesorderList }
     *     
     */
    public void setReadMultipleResult(SalesorderList value) {
        this.readMultipleResult = value;
    }

}
