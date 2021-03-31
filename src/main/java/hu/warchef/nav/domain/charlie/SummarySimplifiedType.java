//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.31 at 04:47:20 PM CEST 
//


package hu.warchef.nav.domain.charlie;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Calculation of simplified invoice totals
 * 
 * <p>Java class for SummarySimplifiedType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SummarySimplifiedType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vatContent" type="{http://schemas.nav.gov.hu/OSA/2.0/data}RateType"/&gt;
 *         &lt;element name="vatContentGrossAmount" type="{http://schemas.nav.gov.hu/OSA/2.0/data}MonetaryType"/&gt;
 *         &lt;element name="vatContentGrossAmountHUF" type="{http://schemas.nav.gov.hu/OSA/2.0/data}MonetaryType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SummarySimplifiedType", namespace = "http://schemas.nav.gov.hu/OSA/2.0/data", propOrder = {
    "vatContent",
    "vatContentGrossAmount",
    "vatContentGrossAmountHUF"
})
public class SummarySimplifiedType {

    @XmlElement(required = true)
    protected BigDecimal vatContent;
    @XmlElement(required = true)
    protected BigDecimal vatContentGrossAmount;
    @XmlElement(required = true)
    protected BigDecimal vatContentGrossAmountHUF;

    /**
     * Gets the value of the vatContent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVatContent() {
        return vatContent;
    }

    /**
     * Sets the value of the vatContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVatContent(BigDecimal value) {
        this.vatContent = value;
    }

    /**
     * Gets the value of the vatContentGrossAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVatContentGrossAmount() {
        return vatContentGrossAmount;
    }

    /**
     * Sets the value of the vatContentGrossAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVatContentGrossAmount(BigDecimal value) {
        this.vatContentGrossAmount = value;
    }

    /**
     * Gets the value of the vatContentGrossAmountHUF property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVatContentGrossAmountHUF() {
        return vatContentGrossAmountHUF;
    }

    /**
     * Sets the value of the vatContentGrossAmountHUF property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVatContentGrossAmountHUF(BigDecimal value) {
        this.vatContentGrossAmountHUF = value;
    }

}
