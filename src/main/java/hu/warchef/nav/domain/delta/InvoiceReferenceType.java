//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.31 at 04:47:15 PM CEST 
//


package hu.warchef.nav.domain.delta;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Modification or cancellation reference data
 * 
 * <p>Java class for InvoiceReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceReferenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="originalInvoiceNumber" type="{http://schemas.nav.gov.hu/NTCA/1.0/common}SimpleText50NotBlankType"/&gt;
 *         &lt;element name="modifyWithoutMaster" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="modificationIndex" type="{http://schemas.nav.gov.hu/OSA/3.0/base}InvoiceUnboundedIndexType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceReferenceType", namespace = "http://schemas.nav.gov.hu/OSA/3.0/data", propOrder = {
    "originalInvoiceNumber",
    "modifyWithoutMaster",
    "modificationIndex"
})
public class InvoiceReferenceType {

    @XmlElement(required = true)
    protected String originalInvoiceNumber;
    protected boolean modifyWithoutMaster;
    protected int modificationIndex;

    /**
     * Gets the value of the originalInvoiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalInvoiceNumber() {
        return originalInvoiceNumber;
    }

    /**
     * Sets the value of the originalInvoiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalInvoiceNumber(String value) {
        this.originalInvoiceNumber = value;
    }

    /**
     * Gets the value of the modifyWithoutMaster property.
     * 
     */
    public boolean isModifyWithoutMaster() {
        return modifyWithoutMaster;
    }

    /**
     * Sets the value of the modifyWithoutMaster property.
     * 
     */
    public void setModifyWithoutMaster(boolean value) {
        this.modifyWithoutMaster = value;
    }

    /**
     * Gets the value of the modificationIndex property.
     * 
     */
    public int getModificationIndex() {
        return modificationIndex;
    }

    /**
     * Sets the value of the modificationIndex property.
     * 
     */
    public void setModificationIndex(int value) {
        this.modificationIndex = value;
    }

}
