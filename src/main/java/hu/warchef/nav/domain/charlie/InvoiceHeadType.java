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
 * Data in header of invoice
 * 
 * <p>Java class for InvoiceHeadType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceHeadType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="supplierInfo" type="{http://schemas.nav.gov.hu/OSA/2.0/data}SupplierInfoType"/&gt;
 *         &lt;element name="customerInfo" type="{http://schemas.nav.gov.hu/OSA/2.0/data}CustomerInfoType" minOccurs="0"/&gt;
 *         &lt;element name="fiscalRepresentativeInfo" type="{http://schemas.nav.gov.hu/OSA/2.0/data}FiscalRepresentativeType" minOccurs="0"/&gt;
 *         &lt;element name="invoiceDetail" type="{http://schemas.nav.gov.hu/OSA/2.0/data}InvoiceDetailType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceHeadType", namespace = "http://schemas.nav.gov.hu/OSA/2.0/data", propOrder = {
    "supplierInfo",
    "customerInfo",
    "fiscalRepresentativeInfo",
    "invoiceDetail"
})
public class InvoiceHeadType {

    @XmlElement(required = true)
    protected SupplierInfoType supplierInfo;
    protected CustomerInfoType customerInfo;
    protected FiscalRepresentativeType fiscalRepresentativeInfo;
    @XmlElement(required = true)
    protected InvoiceDetailType invoiceDetail;

    /**
     * Gets the value of the supplierInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SupplierInfoType }
     *     
     */
    public SupplierInfoType getSupplierInfo() {
        return supplierInfo;
    }

    /**
     * Sets the value of the supplierInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierInfoType }
     *     
     */
    public void setSupplierInfo(SupplierInfoType value) {
        this.supplierInfo = value;
    }

    /**
     * Gets the value of the customerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerInfoType }
     *     
     */
    public CustomerInfoType getCustomerInfo() {
        return customerInfo;
    }

    /**
     * Sets the value of the customerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerInfoType }
     *     
     */
    public void setCustomerInfo(CustomerInfoType value) {
        this.customerInfo = value;
    }

    /**
     * Gets the value of the fiscalRepresentativeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FiscalRepresentativeType }
     *     
     */
    public FiscalRepresentativeType getFiscalRepresentativeInfo() {
        return fiscalRepresentativeInfo;
    }

    /**
     * Sets the value of the fiscalRepresentativeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FiscalRepresentativeType }
     *     
     */
    public void setFiscalRepresentativeInfo(FiscalRepresentativeType value) {
        this.fiscalRepresentativeInfo = value;
    }

    /**
     * Gets the value of the invoiceDetail property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceDetailType }
     *     
     */
    public InvoiceDetailType getInvoiceDetail() {
        return invoiceDetail;
    }

    /**
     * Sets the value of the invoiceDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceDetailType }
     *     
     */
    public void setInvoiceDetail(InvoiceDetailType value) {
        this.invoiceDetail = value;
    }

}
