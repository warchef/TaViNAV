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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Basic result data
 * 
 * <p>Java class for BasicResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BasicResultType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="funcCode" type="{http://schemas.nav.gov.hu/OSA/2.0/api}FunctionCodeType"/&gt;
 *         &lt;element name="errorCode" type="{http://schemas.nav.gov.hu/OSA/2.0/data}SimpleText50NotBlankType" minOccurs="0"/&gt;
 *         &lt;element name="message" type="{http://schemas.nav.gov.hu/OSA/2.0/data}SimpleText1024NotBlankType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasicResultType", propOrder = {
    "funcCode",
    "errorCode",
    "message"
})
@XmlSeeAlso({
    GeneralExceptionResponse.class
})
public class BasicResultType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected FunctionCodeType funcCode;
    protected String errorCode;
    protected String message;

    /**
     * Gets the value of the funcCode property.
     * 
     * @return
     *     possible object is
     *     {@link FunctionCodeType }
     *     
     */
    public FunctionCodeType getFuncCode() {
        return funcCode;
    }

    /**
     * Sets the value of the funcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FunctionCodeType }
     *     
     */
    public void setFuncCode(FunctionCodeType value) {
        this.funcCode = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
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

}
