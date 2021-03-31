//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.31 at 04:47:23 PM CEST 
//


package hu.warchef.nav.domain.bravo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Basic response data
 * 
 * <p>Java class for BasicResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BasicResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="header" type="{http://schemas.nav.gov.hu/OSA/1.0/api}BasicHeaderType"/&gt;
 *         &lt;element name="result" type="{http://schemas.nav.gov.hu/OSA/1.0/api}BasicResultType"/&gt;
 *         &lt;element name="software" type="{http://schemas.nav.gov.hu/OSA/1.0/api}SoftwareType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasicResponseType", namespace = "http://schemas.nav.gov.hu/OSA/1.0/api", propOrder = {
    "header",
    "result",
    "software"
})
@XmlSeeAlso({
    TokenExchangeResponse.class,
    QueryTaxpayerResponse.class,
    QueryInvoiceStatusResponse.class,
    QueryInvoiceDataResponse.class,
    ManageInvoiceResponse.class,
    GeneralErrorResponseType.class
})
public class BasicResponseType {

    @XmlElement(required = true)
    protected BasicHeaderType header;
    @XmlElement(required = true)
    protected BasicResultType result;
    protected SoftwareType software;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link BasicHeaderType }
     *     
     */
    public BasicHeaderType getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicHeaderType }
     *     
     */
    public void setHeader(BasicHeaderType value) {
        this.header = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link BasicResultType }
     *     
     */
    public BasicResultType getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicResultType }
     *     
     */
    public void setResult(BasicResultType value) {
        this.result = value;
    }

    /**
     * Gets the value of the software property.
     * 
     * @return
     *     possible object is
     *     {@link SoftwareType }
     *     
     */
    public SoftwareType getSoftware() {
        return software;
    }

    /**
     * Sets the value of the software property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoftwareType }
     *     
     */
    public void setSoftware(SoftwareType value) {
        this.software = value;
    }

}