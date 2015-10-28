
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
 *         &lt;element name="Delete_TransferLines_Result" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "deleteTransferLinesResult"
})
@XmlRootElement(name = "Delete_TransferLines_Result")
public class DeleteTransferLinesResult {

    @XmlElement(name = "Delete_TransferLines_Result")
    protected boolean deleteTransferLinesResult;

    /**
     * Gets the value of the deleteTransferLinesResult property.
     * 
     */
    public boolean isDeleteTransferLinesResult() {
        return deleteTransferLinesResult;
    }

    /**
     * Sets the value of the deleteTransferLinesResult property.
     * 
     */
    public void setDeleteTransferLinesResult(boolean value) {
        this.deleteTransferLinesResult = value;
    }

}
