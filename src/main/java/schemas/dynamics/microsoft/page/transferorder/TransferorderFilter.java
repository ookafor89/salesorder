
package schemas.dynamics.microsoft.page.transferorder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transferorder_Filter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transferorder_Filter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Field" type="{urn:microsoft-dynamics-schemas/page/transferorder}transferorder_Fields"/&gt;
 *         &lt;element name="Criteria" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transferorder_Filter", propOrder = {
    "field",
    "criteria"
})
public class TransferorderFilter {

    @XmlElement(name = "Field", required = true)
    @XmlSchemaType(name = "string")
    protected TransferorderFields field;
    @XmlElement(name = "Criteria", required = true)
    protected String criteria;

    /**
     * Gets the value of the field property.
     * 
     * @return
     *     possible object is
     *     {@link TransferorderFields }
     *     
     */
    public TransferorderFields getField() {
        return field;
    }

    /**
     * Sets the value of the field property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferorderFields }
     *     
     */
    public void setField(TransferorderFields value) {
        this.field = value;
    }

    /**
     * Gets the value of the criteria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCriteria() {
        return criteria;
    }

    /**
     * Sets the value of the criteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCriteria(String value) {
        this.criteria = value;
    }

}
