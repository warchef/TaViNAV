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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Data of the document verifying the declaration submitted on the product fee according to the Paragraph (3), Section 13 and the Paragraph (3) Section 25 of the Act LXXXV of 2011
 * 
 * <p>Java class for PaymentEvidenceDocumentDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentEvidenceDocumentDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="evidenceDocumentNo" type="{http://schemas.nav.gov.hu/OSA/2.0/data}SimpleText50NotBlankType"/&gt;
 *         &lt;element name="evidenceDocumentDate" type="{http://schemas.nav.gov.hu/OSA/2.0/data}DateType"/&gt;
 *         &lt;element name="obligatedName" type="{http://schemas.nav.gov.hu/OSA/2.0/data}SimpleText255NotBlankType"/&gt;
 *         &lt;element name="obligatedAddress" type="{http://schemas.nav.gov.hu/OSA/2.0/data}AddressType"/&gt;
 *         &lt;element name="obligatedTaxNumber" type="{http://schemas.nav.gov.hu/OSA/2.0/data}TaxNumberType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentEvidenceDocumentDataType", namespace = "http://schemas.nav.gov.hu/OSA/2.0/data", propOrder = {
    "evidenceDocumentNo",
    "evidenceDocumentDate",
    "obligatedName",
    "obligatedAddress",
    "obligatedTaxNumber"
})
public class PaymentEvidenceDocumentDataType {

    @XmlElement(required = true)
    protected String evidenceDocumentNo;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar evidenceDocumentDate;
    @XmlElement(required = true)
    protected String obligatedName;
    @XmlElement(required = true)
    protected AddressType obligatedAddress;
    @XmlElement(required = true)
    protected TaxNumberType obligatedTaxNumber;

    /**
     * Gets the value of the evidenceDocumentNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvidenceDocumentNo() {
        return evidenceDocumentNo;
    }

    /**
     * Sets the value of the evidenceDocumentNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvidenceDocumentNo(String value) {
        this.evidenceDocumentNo = value;
    }

    /**
     * Gets the value of the evidenceDocumentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEvidenceDocumentDate() {
        return evidenceDocumentDate;
    }

    /**
     * Sets the value of the evidenceDocumentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEvidenceDocumentDate(XMLGregorianCalendar value) {
        this.evidenceDocumentDate = value;
    }

    /**
     * Gets the value of the obligatedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObligatedName() {
        return obligatedName;
    }

    /**
     * Sets the value of the obligatedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObligatedName(String value) {
        this.obligatedName = value;
    }

    /**
     * Gets the value of the obligatedAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getObligatedAddress() {
        return obligatedAddress;
    }

    /**
     * Sets the value of the obligatedAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setObligatedAddress(AddressType value) {
        this.obligatedAddress = value;
    }

    /**
     * Gets the value of the obligatedTaxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link TaxNumberType }
     *     
     */
    public TaxNumberType getObligatedTaxNumber() {
        return obligatedTaxNumber;
    }

    /**
     * Sets the value of the obligatedTaxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxNumberType }
     *     
     */
    public void setObligatedTaxNumber(TaxNumberType value) {
        this.obligatedTaxNumber = value;
    }

}