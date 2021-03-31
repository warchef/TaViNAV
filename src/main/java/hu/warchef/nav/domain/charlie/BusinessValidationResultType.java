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
 * Business validation response type
 * 
 * <p>Java class for BusinessValidationResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessValidationResultType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="validationResultCode" type="{http://schemas.nav.gov.hu/OSA/2.0/api}BusinessResultCodeType"/&gt;
 *         &lt;element name="validationErrorCode" type="{http://schemas.nav.gov.hu/OSA/2.0/data}SimpleText100NotBlankType" minOccurs="0"/&gt;
 *         &lt;element name="message" type="{http://schemas.nav.gov.hu/OSA/2.0/data}SimpleText512NotBlankType" minOccurs="0"/&gt;
 *         &lt;element name="pointer" type="{http://schemas.nav.gov.hu/OSA/2.0/api}PointerType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessValidationResultType", propOrder = {
    "validationResultCode",
    "validationErrorCode",
    "message",
    "pointer"
})
public class BusinessValidationResultType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected BusinessResultCodeType validationResultCode;
    protected String validationErrorCode;
    protected String message;
    protected PointerType pointer;

    /**
     * Gets the value of the validationResultCode property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessResultCodeType }
     *     
     */
    public BusinessResultCodeType getValidationResultCode() {
        return validationResultCode;
    }

    /**
     * Sets the value of the validationResultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessResultCodeType }
     *     
     */
    public void setValidationResultCode(BusinessResultCodeType value) {
        this.validationResultCode = value;
    }

    /**
     * Gets the value of the validationErrorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidationErrorCode() {
        return validationErrorCode;
    }

    /**
     * Sets the value of the validationErrorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidationErrorCode(String value) {
        this.validationErrorCode = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the pointer property.
     * 
     * @return
     *     possible object is
     *     {@link PointerType }
     *     
     */
    public PointerType getPointer() {
        return pointer;
    }

    /**
     * Sets the value of the pointer property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointerType }
     *     
     */
    public void setPointer(PointerType value) {
        this.pointer = value;
    }

}
