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
 * Status data of technical annulment
 * 
 * <p>Java class for AnnulmentDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnnulmentDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="annulmentVerificationStatus" type="{http://schemas.nav.gov.hu/OSA/2.0/api}AnnulmentVerificationStatusType"/&gt;
 *         &lt;element name="annulmentDecisionDate" type="{http://schemas.nav.gov.hu/OSA/2.0/data}TimestampType" minOccurs="0"/&gt;
 *         &lt;element name="annulmentDecisionUser" type="{http://schemas.nav.gov.hu/OSA/2.0/api}LoginType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnnulmentDataType", propOrder = {
    "annulmentVerificationStatus",
    "annulmentDecisionDate",
    "annulmentDecisionUser"
})
public class AnnulmentDataType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected AnnulmentVerificationStatusType annulmentVerificationStatus;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar annulmentDecisionDate;
    protected String annulmentDecisionUser;

    /**
     * Gets the value of the annulmentVerificationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AnnulmentVerificationStatusType }
     *     
     */
    public AnnulmentVerificationStatusType getAnnulmentVerificationStatus() {
        return annulmentVerificationStatus;
    }

    /**
     * Sets the value of the annulmentVerificationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnulmentVerificationStatusType }
     *     
     */
    public void setAnnulmentVerificationStatus(AnnulmentVerificationStatusType value) {
        this.annulmentVerificationStatus = value;
    }

    /**
     * Gets the value of the annulmentDecisionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAnnulmentDecisionDate() {
        return annulmentDecisionDate;
    }

    /**
     * Sets the value of the annulmentDecisionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAnnulmentDecisionDate(XMLGregorianCalendar value) {
        this.annulmentDecisionDate = value;
    }

    /**
     * Gets the value of the annulmentDecisionUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnulmentDecisionUser() {
        return annulmentDecisionUser;
    }

    /**
     * Sets the value of the annulmentDecisionUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnulmentDecisionUser(String value) {
        this.annulmentDecisionUser = value;
    }

}