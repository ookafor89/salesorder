
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
 *         &lt;element name="Delete_SalesLines_Result" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "deleteSalesLinesResult"
})
@XmlRootElement(name = "Delete_SalesLines_Result")
public class DeleteSalesLinesResult {

    @XmlElement(name = "Delete_SalesLines_Result")
    protected boolean deleteSalesLinesResult;

    /**
     * Gets the value of the deleteSalesLinesResult property.
     * 
     */
    public boolean isDeleteSalesLinesResult() {
        return deleteSalesLinesResult;
    }

    /**
     * Sets the value of the deleteSalesLinesResult property.
     * 
     */
    public void setDeleteSalesLinesResult(boolean value) {
        this.deleteSalesLinesResult = value;
    }

}
