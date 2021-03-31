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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Invoice number param of the Invoice query
 * 
 * <p>Java class for InvoiceNumberQueryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceNumberQueryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="invoiceNumber" type="{http://schemas.nav.gov.hu/NTCA/1.0/common}SimpleText50NotBlankType"/&gt;
 *         &lt;element name="invoiceDirection" type="{http://schemas.nav.gov.hu/OSA/3.0/api}InvoiceDirectionType"/&gt;
 *         &lt;element name="batchIndex" type="{http://schemas.nav.gov.hu/OSA/3.0/base}InvoiceUnboundedIndexType" minOccurs="0"/&gt;
 *         &lt;element name="supplierTaxNumber" type="{http://schemas.nav.gov.hu/NTCA/1.0/common}TaxpayerIdType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceNumberQueryType", propOrder = {
    "invoiceNumber",
    "invoiceDirection",
    "batchIndex",
    "supplierTaxNumber"
})
public class InvoiceNumberQueryType {

    @XmlElement(required = true)
    protected String invoiceNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected InvoiceDirectionType invoiceDirection;
    protected Integer batchIndex;
    protected String supplierTaxNumber;

    /**
     * Gets the value of the invoiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Sets the value of the invoiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceNumber(String value) {
        this.invoiceNumber = value;
    }

    /**
     * Gets the value of the invoiceDirection property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceDirectionType }
     *     
     */
    public InvoiceDirectionType getInvoiceDirection() {
        return invoiceDirection;
    }

    /**
     * Sets the value of the invoiceDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceDirectionType }
     *     
     */
    public void setInvoiceDirection(InvoiceDirectionType value) {
        this.invoiceDirection = value;
    }

    /**
     * Gets the value of the batchIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBatchIndex() {
        return batchIndex;
    }

    /**
     * Sets the value of the batchIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBatchIndex(Integer value) {
        this.batchIndex = value;
    }

    /**
     * Gets the value of the supplierTaxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierTaxNumber() {
        return supplierTaxNumber;
    }

    /**
     * Sets the value of the supplierTaxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierTaxNumber(String value) {
        this.supplierTaxNumber = value;
    }

}
