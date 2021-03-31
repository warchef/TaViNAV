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
 * VAT data of given tax rate
 * 
 * <p>Java class for VatRateVatDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VatRateVatDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vatRateVatAmount" type="{http://schemas.nav.gov.hu/OSA/2.0/data}MonetaryType"/&gt;
 *         &lt;element name="vatRateVatAmountHUF" type="{http://schemas.nav.gov.hu/OSA/2.0/data}MonetaryType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VatRateVatDataType", namespace = "http://schemas.nav.gov.hu/OSA/2.0/data", propOrder = {
    "vatRateVatAmount",
    "vatRateVatAmountHUF"
})
public class VatRateVatDataType {

    @XmlElement(required = true)
    protected BigDecimal vatRateVatAmount;
    @XmlElement(required = true)
    protected BigDecimal vatRateVatAmountHUF;

    /**
     * Gets the value of the vatRateVatAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVatRateVatAmount() {
        return vatRateVatAmount;
    }

    /**
     * Sets the value of the vatRateVatAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVatRateVatAmount(BigDecimal value) {
        this.vatRateVatAmount = value;
    }

    /**
     * Gets the value of the vatRateVatAmountHUF property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVatRateVatAmountHUF() {
        return vatRateVatAmountHUF;
    }

    /**
     * Sets the value of the vatRateVatAmountHUF property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVatRateVatAmountHUF(BigDecimal value) {
        this.vatRateVatAmountHUF = value;
    }

}
