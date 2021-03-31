//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.31 at 04:47:25 PM CEST 
//


package hu.warchef.nav.domain.alpha;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Customer data
 * 
 * <p>Java class for CustomerInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customerTaxNumber" type="{http://schemas.nav.gov.hu/OSA/1.0/data}TaxNumberType" minOccurs="0"/&gt;
 *         &lt;element name="groupMemberTaxNumber" type="{http://schemas.nav.gov.hu/OSA/1.0/data}TaxNumberType" minOccurs="0"/&gt;
 *         &lt;element name="communityVatNumber" type="{http://schemas.nav.gov.hu/OSA/1.0/data}CommunityVatNumberType" minOccurs="0"/&gt;
 *         &lt;element name="thirdStateTaxId" type="{http://schemas.nav.gov.hu/OSA/1.0/data}SimpleText50NotBlankType" minOccurs="0"/&gt;
 *         &lt;element name="customerName" type="{http://schemas.nav.gov.hu/OSA/1.0/data}SimpleText512NotBlankType"/&gt;
 *         &lt;element name="customerAddress" type="{http://schemas.nav.gov.hu/OSA/1.0/data}AddressType"/&gt;
 *         &lt;element name="customerBankAccountNumber" type="{http://schemas.nav.gov.hu/OSA/1.0/data}BankAccountNumberType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerInfoType", propOrder = {
    "customerTaxNumber",
    "groupMemberTaxNumber",
    "communityVatNumber",
    "thirdStateTaxId",
    "customerName",
    "customerAddress",
    "customerBankAccountNumber"
})
public class CustomerInfoType {

    protected TaxNumberType customerTaxNumber;
    protected TaxNumberType groupMemberTaxNumber;
    protected String communityVatNumber;
    protected String thirdStateTaxId;
    @XmlElement(required = true)
    protected String customerName;
    @XmlElement(required = true)
    protected AddressType customerAddress;
    protected String customerBankAccountNumber;

    /**
     * Gets the value of the customerTaxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link TaxNumberType }
     *     
     */
    public TaxNumberType getCustomerTaxNumber() {
        return customerTaxNumber;
    }

    /**
     * Sets the value of the customerTaxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxNumberType }
     *     
     */
    public void setCustomerTaxNumber(TaxNumberType value) {
        this.customerTaxNumber = value;
    }

    /**
     * Gets the value of the groupMemberTaxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link TaxNumberType }
     *     
     */
    public TaxNumberType getGroupMemberTaxNumber() {
        return groupMemberTaxNumber;
    }

    /**
     * Sets the value of the groupMemberTaxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxNumberType }
     *     
     */
    public void setGroupMemberTaxNumber(TaxNumberType value) {
        this.groupMemberTaxNumber = value;
    }

    /**
     * Gets the value of the communityVatNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommunityVatNumber() {
        return communityVatNumber;
    }

    /**
     * Sets the value of the communityVatNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommunityVatNumber(String value) {
        this.communityVatNumber = value;
    }

    /**
     * Gets the value of the thirdStateTaxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdStateTaxId() {
        return thirdStateTaxId;
    }

    /**
     * Sets the value of the thirdStateTaxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdStateTaxId(String value) {
        this.thirdStateTaxId = value;
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
     * Gets the value of the customerAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getCustomerAddress() {
        return customerAddress;
    }

    /**
     * Sets the value of the customerAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setCustomerAddress(AddressType value) {
        this.customerAddress = value;
    }

    /**
     * Gets the value of the customerBankAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerBankAccountNumber() {
        return customerBankAccountNumber;
    }

    /**
     * Sets the value of the customerBankAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerBankAccountNumber(String value) {
        this.customerBankAccountNumber = value;
    }

}
