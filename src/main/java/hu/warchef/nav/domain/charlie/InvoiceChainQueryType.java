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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Invoice number param of the invoice chain digest query
 * 
 * <p>Java class for InvoiceChainQueryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceChainQueryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="invoiceNumber" type="{http://schemas.nav.gov.hu/OSA/2.0/data}SimpleText50NotBlankType"/&gt;
 *         &lt;element name="invoiceDirection" type="{http://schemas.nav.gov.hu/OSA/2.0/api}InvoiceDirectionType"/&gt;
 *         &lt;element name="taxNumber" type="{http://schemas.nav.gov.hu/OSA/2.0/data}TaxpayerIdType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceChainQueryType", propOrder = {
    "invoiceNumber",
    "invoiceDirection",
    "taxNumber"
})
public class InvoiceChainQueryType {

    @XmlElement(required = true)
    protected String invoiceNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected InvoiceDirectionType invoiceDirection;
    protected String taxNumber;

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
     * Gets the value of the taxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxNumber() {
        return taxNumber;
    }

    /**
     * Sets the value of the taxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxNumber(String value) {
        this.taxNumber = value;
    }

}
