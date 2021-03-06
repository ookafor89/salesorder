
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
 *         &lt;element name="transferorder_List" type="{urn:microsoft-dynamics-schemas/page/transferorder}transferorder_List"/&gt;
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
    "transferorderList"
})
@XmlRootElement(name = "CreateMultiple")
public class CreateMultiple {

    @XmlElement(name = "transferorder_List", required = true)
    protected TransferorderList transferorderList;

    /**
     * Gets the value of the transferorderList property.
     * 
     * @return
     *     possible object is
     *     {@link TransferorderList }
     *     
     */
    public TransferorderList getTransferorderList() {
        return transferorderList;
    }

    /**
     * Sets the value of the transferorderList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferorderList }
     *     
     */
    public void setTransferorderList(TransferorderList value) {
        this.transferorderList = value;
    }

}
