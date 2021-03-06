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
import javax.xml.bind.annotation.XmlType;


/**
 * Item value data to be completed in case of normal or aggregate invoice
 * 
 * <p>Java class for LineAmountsNormalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LineAmountsNormalType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lineNetAmountData" type="{http://schemas.nav.gov.hu/OSA/3.0/data}LineNetAmountDataType"/&gt;
 *         &lt;element name="lineVatRate" type="{http://schemas.nav.gov.hu/OSA/3.0/data}VatRateType"/&gt;
 *         &lt;element name="lineVatData" type="{http://schemas.nav.gov.hu/OSA/3.0/data}LineVatDataType" minOccurs="0"/&gt;
 *         &lt;element name="lineGrossAmountData" type="{http://schemas.nav.gov.hu/OSA/3.0/data}LineGrossAmountDataType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineAmountsNormalType", namespace = "http://schemas.nav.gov.hu/OSA/3.0/data", propOrder = {
    "lineNetAmountData",
    "lineVatRate",
    "lineVatData",
    "lineGrossAmountData"
})
public class LineAmountsNormalType {

    @XmlElement(required = true)
    protected LineNetAmountDataType lineNetAmountData;
    @XmlElement(required = true)
    protected VatRateType lineVatRate;
    protected LineVatDataType lineVatData;
    protected LineGrossAmountDataType lineGrossAmountData;

    /**
     * Gets the value of the lineNetAmountData property.
     * 
     * @return
     *     possible object is
     *     {@link LineNetAmountDataType }
     *     
     */
    public LineNetAmountDataType getLineNetAmountData() {
        return lineNetAmountData;
    }

    /**
     * Sets the value of the lineNetAmountData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineNetAmountDataType }
     *     
     */
    public void setLineNetAmountData(LineNetAmountDataType value) {
        this.lineNetAmountData = value;
    }

    /**
     * Gets the value of the lineVatRate property.
     * 
     * @return
     *     possible object is
     *     {@link VatRateType }
     *     
     */
    public VatRateType getLineVatRate() {
        return lineVatRate;
    }

    /**
     * Sets the value of the lineVatRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link VatRateType }
     *     
     */
    public void setLineVatRate(VatRateType value) {
        this.lineVatRate = value;
    }

    /**
     * Gets the value of the lineVatData property.
     * 
     * @return
     *     possible object is
     *     {@link LineVatDataType }
     *     
     */
    public LineVatDataType getLineVatData() {
        return lineVatData;
    }

    /**
     * Sets the value of the lineVatData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineVatDataType }
     *     
     */
    public void setLineVatData(LineVatDataType value) {
        this.lineVatData = value;
    }

    /**
     * Gets the value of the lineGrossAmountData property.
     * 
     * @return
     *     possible object is
     *     {@link LineGrossAmountDataType }
     *     
     */
    public LineGrossAmountDataType getLineGrossAmountData() {
        return lineGrossAmountData;
    }

    /**
     * Sets the value of the lineGrossAmountData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineGrossAmountDataType }
     *     
     */
    public void setLineGrossAmountData(LineGrossAmountDataType value) {
        this.lineGrossAmountData = value;
    }

}
