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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Data of technical annulment concerning previous data exchange
 * 
 * <p>Java class for InvoiceAnnulmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceAnnulmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="annulmentReference" type="{http://schemas.nav.gov.hu/NTCA/1.0/common}SimpleText50NotBlankType"/&gt;
 *         &lt;element name="annulmentTimestamp" type="{http://schemas.nav.gov.hu/OSA/3.0/base}InvoiceTimestampType"/&gt;
 *         &lt;element name="annulmentCode" type="{http://schemas.nav.gov.hu/OSA/3.0/annul}AnnulmentCodeType"/&gt;
 *         &lt;element name="annulmentReason" type="{http://schemas.nav.gov.hu/NTCA/1.0/common}SimpleText1024NotBlankType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceAnnulmentType", namespace = "http://schemas.nav.gov.hu/OSA/3.0/annul", propOrder = {
    "annulmentReference",
    "annulmentTimestamp",
    "annulmentCode",
    "annulmentReason"
})
@XmlSeeAlso({
    InvoiceAnnulment.class
})
public class InvoiceAnnulmentType {

    @XmlElement(required = true)
    protected String annulmentReference;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar annulmentTimestamp;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected AnnulmentCodeType annulmentCode;
    @XmlElement(required = true)
    protected String annulmentReason;

    /**
     * Gets the value of the annulmentReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnulmentReference() {
        return annulmentReference;
    }

    /**
     * Sets the value of the annulmentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnulmentReference(String value) {
        this.annulmentReference = value;
    }

    /**
     * Gets the value of the annulmentTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAnnulmentTimestamp() {
        return annulmentTimestamp;
    }

    /**
     * Sets the value of the annulmentTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAnnulmentTimestamp(XMLGregorianCalendar value) {
        this.annulmentTimestamp = value;
    }

    /**
     * Gets the value of the annulmentCode property.
     * 
     * @return
     *     possible object is
     *     {@link AnnulmentCodeType }
     *     
     */
    public AnnulmentCodeType getAnnulmentCode() {
        return annulmentCode;
    }

    /**
     * Sets the value of the annulmentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnulmentCodeType }
     *     
     */
    public void setAnnulmentCode(AnnulmentCodeType value) {
        this.annulmentCode = value;
    }

    /**
     * Gets the value of the annulmentReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnulmentReason() {
        return annulmentReason;
    }

    /**
     * Sets the value of the annulmentReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnulmentReason(String value) {
        this.annulmentReason = value;
    }

}
