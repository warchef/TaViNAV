//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.31 at 04:47:15 PM CEST 
//


package hu.warchef.nav.domain.delta;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Digest query result
 * 
 * <p>Java class for InvoiceDigestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceDigestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="invoiceNumber" type="{http://schemas.nav.gov.hu/NTCA/1.0/common}SimpleText50NotBlankType"/&gt;
 *         &lt;element name="batchIndex" type="{http://schemas.nav.gov.hu/OSA/3.0/base}InvoiceUnboundedIndexType" minOccurs="0"/&gt;
 *         &lt;element name="invoiceOperation" type="{http://schemas.nav.gov.hu/OSA/3.0/api}ManageInvoiceOperationType"/&gt;
 *         &lt;element name="invoiceCategory" type="{http://schemas.nav.gov.hu/OSA/3.0/base}InvoiceCategoryType"/&gt;
 *         &lt;element name="invoiceIssueDate" type="{http://schemas.nav.gov.hu/OSA/3.0/base}InvoiceDateType"/&gt;
 *         &lt;element name="supplierTaxNumber" type="{http://schemas.nav.gov.hu/NTCA/1.0/common}TaxpayerIdType"/&gt;
 *         &lt;element name="supplierGroupMemberTaxNumber" type="{http://schemas.nav.gov.hu/NTCA/1.0/common}TaxpayerIdType" minOccurs="0"/&gt;
 *         &lt;element name="supplierName" type="{http://schemas.nav.gov.hu/NTCA/1.0/common}SimpleText512NotBlankType"/&gt;
 *         &lt;element name="customerTaxNumber" type="{http://schemas.nav.gov.hu/NTCA/1.0/common}TaxpayerIdType" minOccurs="0"/&gt;
 *         &lt;element name="customerGroupMemberTaxNumber" type="{http://schemas.nav.gov.hu/NTCA/1.0/common}TaxpayerIdType" minOccurs="0"/&gt;
 *         &lt;element name="customerName" type="{http://schemas.nav.gov.hu/NTCA/1.0/common}SimpleText512NotBlankType" minOccurs="0"/&gt;
 *         &lt;element name="paymentMethod" type="{http://schemas.nav.gov.hu/OSA/3.0/base}PaymentMethodType" minOccurs="0"/&gt;
 *         &lt;element name="paymentDate" type="{http://schemas.nav.gov.hu/OSA/3.0/base}InvoiceDateType" minOccurs="0"/&gt;
 *         &lt;element name="invoiceAppearance" type="{http://schemas.nav.gov.hu/OSA/3.0/base}InvoiceAppearanceType" minOccurs="0"/&gt;
 *         &lt;element name="source" type="{http://schemas.nav.gov.hu/OSA/3.0/api}SourceType" minOccurs="0"/&gt;
 *         &lt;element name="invoiceDeliveryDate" type="{http://schemas.nav.gov.hu/OSA/3.0/base}InvoiceDateType" minOccurs="0"/&gt;
 *         &lt;element name="currency" type="{http://schemas.nav.gov.hu/NTCA/1.0/common}CurrencyType" minOccurs="0"/&gt;
 *         &lt;element name="invoiceNetAmount" type="{http://schemas.nav.gov.hu/OSA/3.0/base}MonetaryType" minOccurs="0"/&gt;
 *         &lt;element name="invoiceNetAmountHUF" type="{http://schemas.nav.gov.hu/OSA/3.0/base}MonetaryType" minOccurs="0"/&gt;
 *         &lt;element name="invoiceVatAmount" type="{http://schemas.nav.gov.hu/OSA/3.0/base}MonetaryType" minOccurs="0"/&gt;
 *         &lt;element name="invoiceVatAmountHUF" type="{http://schemas.nav.gov.hu/OSA/3.0/base}MonetaryType" minOccurs="0"/&gt;
 *         &lt;element name="transactionId" type="{http://schemas.nav.gov.hu/NTCA/1.0/common}EntityIdType" minOccurs="0"/&gt;
 *         &lt;element name="index" type="{http://schemas.nav.gov.hu/OSA/3.0/base}InvoiceIndexType" minOccurs="0"/&gt;
 *         &lt;element name="originalInvoiceNumber" type="{http://schemas.nav.gov.hu/NTCA/1.0/common}SimpleText50NotBlankType" minOccurs="0"/&gt;
 *         &lt;element name="modificationIndex" type="{http://schemas.nav.gov.hu/OSA/3.0/base}InvoiceUnboundedIndexType" minOccurs="0"/&gt;
 *         &lt;element name="insDate" type="{http://schemas.nav.gov.hu/OSA/3.0/base}InvoiceTimestampType"/&gt;
 *         &lt;element name="completenessIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceDigestType", propOrder = {
    "invoiceNumber",
    "batchIndex",
    "invoiceOperation",
    "invoiceCategory",
    "invoiceIssueDate",
    "supplierTaxNumber",
    "supplierGroupMemberTaxNumber",
    "supplierName",
    "customerTaxNumber",
    "customerGroupMemberTaxNumber",
    "customerName",
    "paymentMethod",
    "paymentDate",
    "invoiceAppearance",
    "source",
    "invoiceDeliveryDate",
    "currency",
    "invoiceNetAmount",
    "invoiceNetAmountHUF",
    "invoiceVatAmount",
    "invoiceVatAmountHUF",
    "transactionId",
    "index",
    "originalInvoiceNumber",
    "modificationIndex",
    "insDate",
    "completenessIndicator"
})
public class InvoiceDigestType {

    @XmlElement(required = true)
    protected String invoiceNumber;
    protected Integer batchIndex;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ManageInvoiceOperationType invoiceOperation;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected InvoiceCategoryType invoiceCategory;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar invoiceIssueDate;
    @XmlElement(required = true)
    protected String supplierTaxNumber;
    protected String supplierGroupMemberTaxNumber;
    @XmlElement(required = true)
    protected String supplierName;
    protected String customerTaxNumber;
    protected String customerGroupMemberTaxNumber;
    protected String customerName;
    @XmlSchemaType(name = "string")
    protected PaymentMethodType paymentMethod;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar paymentDate;
    @XmlSchemaType(name = "string")
    protected InvoiceAppearanceType invoiceAppearance;
    @XmlSchemaType(name = "string")
    protected SourceType source;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar invoiceDeliveryDate;
    protected String currency;
    protected BigDecimal invoiceNetAmount;
    protected BigDecimal invoiceNetAmountHUF;
    protected BigDecimal invoiceVatAmount;
    protected BigDecimal invoiceVatAmountHUF;
    protected String transactionId;
    protected Integer index;
    protected String originalInvoiceNumber;
    protected Integer modificationIndex;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar insDate;
    protected Boolean completenessIndicator;

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
     * Gets the value of the invoiceOperation property.
     * 
     * @return
     *     possible object is
     *     {@link ManageInvoiceOperationType }
     *     
     */
    public ManageInvoiceOperationType getInvoiceOperation() {
        return invoiceOperation;
    }

    /**
     * Sets the value of the invoiceOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManageInvoiceOperationType }
     *     
     */
    public void setInvoiceOperation(ManageInvoiceOperationType value) {
        this.invoiceOperation = value;
    }

    /**
     * Gets the value of the invoiceCategory property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceCategoryType }
     *     
     */
    public InvoiceCategoryType getInvoiceCategory() {
        return invoiceCategory;
    }

    /**
     * Sets the value of the invoiceCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceCategoryType }
     *     
     */
    public void setInvoiceCategory(InvoiceCategoryType value) {
        this.invoiceCategory = value;
    }

    /**
     * Gets the value of the invoiceIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInvoiceIssueDate() {
        return invoiceIssueDate;
    }

    /**
     * Sets the value of the invoiceIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInvoiceIssueDate(XMLGregorianCalendar value) {
        this.invoiceIssueDate = value;
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

    /**
     * Gets the value of the supplierGroupMemberTaxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierGroupMemberTaxNumber() {
        return supplierGroupMemberTaxNumber;
    }

    /**
     * Sets the value of the supplierGroupMemberTaxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierGroupMemberTaxNumber(String value) {
        this.supplierGroupMemberTaxNumber = value;
    }

    /**
     * Gets the value of the supplierName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierName() {
        return supplierName;
    }

    /**
     * Sets the value of the supplierName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierName(String value) {
        this.supplierName = value;
    }

    /**
     * Gets the value of the customerTaxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerTaxNumber() {
        return customerTaxNumber;
    }

    /**
     * Sets the value of the customerTaxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerTaxNumber(String value) {
        this.customerTaxNumber = value;
    }

    /**
     * Gets the value of the customerGroupMemberTaxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerGroupMemberTaxNumber() {
        return customerGroupMemberTaxNumber;
    }

    /**
     * Sets the value of the customerGroupMemberTaxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerGroupMemberTaxNumber(String value) {
        this.customerGroupMemberTaxNumber = value;
    }

    /**
     * Gets the value of the customerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Sets the value of the customerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMethodType }
     *     
     */
    public PaymentMethodType getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMethodType }
     *     
     */
    public void setPaymentMethod(PaymentMethodType value) {
        this.paymentMethod = value;
    }

    /**
     * Gets the value of the paymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaymentDate() {
        return paymentDate;
    }

    /**
     * Sets the value of the paymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaymentDate(XMLGregorianCalendar value) {
        this.paymentDate = value;
    }

    /**
     * Gets the value of the invoiceAppearance property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceAppearanceType }
     *     
     */
    public InvoiceAppearanceType getInvoiceAppearance() {
        return invoiceAppearance;
    }

    /**
     * Sets the value of the invoiceAppearance property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceAppearanceType }
     *     
     */
    public void setInvoiceAppearance(InvoiceAppearanceType value) {
        this.invoiceAppearance = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link SourceType }
     *     
     */
    public SourceType getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceType }
     *     
     */
    public void setSource(SourceType value) {
        this.source = value;
    }

    /**
     * Gets the value of the invoiceDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInvoiceDeliveryDate() {
        return invoiceDeliveryDate;
    }

    /**
     * Sets the value of the invoiceDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInvoiceDeliveryDate(XMLGregorianCalendar value) {
        this.invoiceDeliveryDate = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the invoiceNetAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInvoiceNetAmount() {
        return invoiceNetAmount;
    }

    /**
     * Sets the value of the invoiceNetAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInvoiceNetAmount(BigDecimal value) {
        this.invoiceNetAmount = value;
    }

    /**
     * Gets the value of the invoiceNetAmountHUF property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInvoiceNetAmountHUF() {
        return invoiceNetAmountHUF;
    }

    /**
     * Sets the value of the invoiceNetAmountHUF property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInvoiceNetAmountHUF(BigDecimal value) {
        this.invoiceNetAmountHUF = value;
    }

    /**
     * Gets the value of the invoiceVatAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInvoiceVatAmount() {
        return invoiceVatAmount;
    }

    /**
     * Sets the value of the invoiceVatAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInvoiceVatAmount(BigDecimal value) {
        this.invoiceVatAmount = value;
    }

    /**
     * Gets the value of the invoiceVatAmountHUF property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInvoiceVatAmountHUF() {
        return invoiceVatAmountHUF;
    }

    /**
     * Sets the value of the invoiceVatAmountHUF property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInvoiceVatAmountHUF(BigDecimal value) {
        this.invoiceVatAmountHUF = value;
    }

    /**
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIndex(Integer value) {
        this.index = value;
    }

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
     * Gets the value of the modificationIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getModificationIndex() {
        return modificationIndex;
    }

    /**
     * Sets the value of the modificationIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setModificationIndex(Integer value) {
        this.modificationIndex = value;
    }

    /**
     * Gets the value of the insDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInsDate() {
        return insDate;
    }

    /**
     * Sets the value of the insDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInsDate(XMLGregorianCalendar value) {
        this.insDate = value;
    }

    /**
     * Gets the value of the completenessIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCompletenessIndicator() {
        return completenessIndicator;
    }

    /**
     * Sets the value of the completenessIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCompletenessIndicator(Boolean value) {
        this.completenessIndicator = value;
    }

}