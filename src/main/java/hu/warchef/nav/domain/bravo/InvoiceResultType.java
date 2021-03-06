//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.31 at 04:47:23 PM CEST 
//


package hu.warchef.nav.domain.bravo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Invoice number based query result
 * 
 * <p>Java class for InvoiceResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceResultType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="invoice" type="{http://schemas.nav.gov.hu/OSA/1.0/api}InvoiceType"/&gt;
 *         &lt;element name="auditData" type="{http://schemas.nav.gov.hu/OSA/1.0/api}AuditDataType"/&gt;
 *         &lt;element name="invoiceReference" type="{http://schemas.nav.gov.hu/OSA/1.0/data}InvoiceReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="compressedContentIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceResultType", namespace = "http://schemas.nav.gov.hu/OSA/1.0/api", propOrder = {
    "invoice",
    "auditData",
    "invoiceReference",
    "compressedContentIndicator"
})
public class InvoiceResultType {

    @XmlElement(required = true)
    protected byte[] invoice;
    @XmlElement(required = true)
    protected AuditDataType auditData;
    protected InvoiceReferenceType invoiceReference;
    @XmlElement(defaultValue = "false")
    protected boolean compressedContentIndicator;

    /**
     * Gets the value of the invoice property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getInvoice() {
        return invoice;
    }

    /**
     * Sets the value of the invoice property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setInvoice(byte[] value) {
        this.invoice = value;
    }

    /**
     * Gets the value of the auditData property.
     * 
     * @return
     *     possible object is
     *     {@link AuditDataType }
     *     
     */
    public AuditDataType getAuditData() {
        return auditData;
    }

    /**
     * Sets the value of the auditData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditDataType }
     *     
     */
    public void setAuditData(AuditDataType value) {
        this.auditData = value;
    }

    /**
     * Gets the value of the invoiceReference property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceReferenceType }
     *     
     */
    public InvoiceReferenceType getInvoiceReference() {
        return invoiceReference;
    }

    /**
     * Sets the value of the invoiceReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceReferenceType }
     *     
     */
    public void setInvoiceReference(InvoiceReferenceType value) {
        this.invoiceReference = value;
    }

    /**
     * Gets the value of the compressedContentIndicator property.
     * 
     */
    public boolean isCompressedContentIndicator() {
        return compressedContentIndicator;
    }

    /**
     * Sets the value of the compressedContentIndicator property.
     * 
     */
    public void setCompressedContentIndicator(boolean value) {
        this.compressedContentIndicator = value;
    }

}
