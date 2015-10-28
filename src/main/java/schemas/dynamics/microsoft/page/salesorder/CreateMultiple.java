
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
 *         &lt;element name="salesorder_List" type="{urn:microsoft-dynamics-schemas/page/salesorder}salesorder_List"/&gt;
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
    "salesorderList"
})
@XmlRootElement(name = "CreateMultiple")
public class CreateMultiple {

    @XmlElement(name = "salesorder_List", required = true)
    protected SalesorderList salesorderList;

    /**
     * Gets the value of the salesorderList property.
     * 
     * @return
     *     possible object is
     *     {@link SalesorderList }
     *     
     */
    public SalesorderList getSalesorderList() {
        return salesorderList;
    }

    /**
     * Sets the value of the salesorderList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesorderList }
     *     
     */
    public void setSalesorderList(SalesorderList value) {
        this.salesorderList = value;
    }

}
