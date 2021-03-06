//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.31 at 04:47:20 PM CEST 
//


package hu.warchef.nav.domain.charlie;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Invoice chain element
 * 
 * <p>Java class for InvoiceChainElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceChainElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="invoiceChainDigest" type="{http://schemas.nav.gov.hu/OSA/2.0/api}InvoiceChainDigestType"/&gt;
 *         &lt;element name="invoiceLines" type="{http://schemas.nav.gov.hu/OSA/2.0/api}InvoiceLinesType" minOccurs="0"/&gt;
 *         &lt;element name="invoiceReferenceData" type="{http://schemas.nav.gov.hu/OSA/2.0/api}InvoiceReferenceDataType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceChainElementType", propOrder = {
    "invoiceChainDigest",
    "invoiceLines",
    "invoiceReferenceData"
})
public class InvoiceChainElementType {

    @XmlElement(required = true)
    protected InvoiceChainDigestType invoiceChainDigest;
    protected InvoiceLinesType invoiceLines;
    protected InvoiceReferenceDataType invoiceReferenceData;

    /**
     * Gets the value of the invoiceChainDigest property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceChainDigestType }
     *     
     */
    public InvoiceChainDigestType getInvoiceChainDigest() {
        return invoiceChainDigest;
    }

    /**
     * Sets the value of the invoiceChainDigest property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceChainDigestType }
     *     
     */
    public void setInvoiceChainDigest(InvoiceChainDigestType value) {
        this.invoiceChainDigest = value;
    }

    /**
     * Gets the value of the invoiceLines property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceLinesType }
     *     
     */
    public InvoiceLinesType getInvoiceLines() {
        return invoiceLines;
    }

    /**
     * Sets the value of the invoiceLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceLinesType }
     *     
     */
    public void setInvoiceLines(InvoiceLinesType value) {
        this.invoiceLines = value;
    }

    /**
     * Gets the value of the invoiceReferenceData property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceReferenceDataType }
     *     
     */
    public InvoiceReferenceDataType getInvoiceReferenceData() {
        return invoiceReferenceData;
    }

    /**
     * Sets the value of the invoiceReferenceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceReferenceDataType }
     *     
     */
    public void setInvoiceReferenceData(InvoiceReferenceDataType value) {
        this.invoiceReferenceData = value;
    }

}
