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
 * Marking tax rate or tax exempt supply
 * 
 * <p>Java class for VatRateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VatRateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="vatPercentage" type="{http://schemas.nav.gov.hu/OSA/2.0/data}RateType"/&gt;
 *         &lt;element name="vatExemption" type="{http://schemas.nav.gov.hu/OSA/2.0/data}SimpleText50NotBlankType"/&gt;
 *         &lt;element name="vatOutOfScope" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="vatDomesticReverseCharge" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="marginSchemeVat" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="marginSchemeNoVat" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VatRateType", namespace = "http://schemas.nav.gov.hu/OSA/2.0/data", propOrder = {
    "vatPercentage",
    "vatExemption",
    "vatOutOfScope",
    "vatDomesticReverseCharge",
    "marginSchemeVat",
    "marginSchemeNoVat"
})
public class VatRateType {

    protected BigDecimal vatPercentage;
    protected String vatExemption;
    @XmlElement(defaultValue = "false")
    protected Boolean vatOutOfScope;
    @XmlElement(defaultValue = "false")
    protected Boolean vatDomesticReverseCharge;
    @XmlElement(defaultValue = "false")
    protected Boolean marginSchemeVat;
    @XmlElement(defaultValue = "false")
    protected Boolean marginSchemeNoVat;

    /**
     * Gets the value of the vatPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVatPercentage() {
        return vatPercentage;
    }

    /**
     * Sets the value of the vatPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVatPercentage(BigDecimal value) {
        this.vatPercentage = value;
    }

    /**
     * Gets the value of the vatExemption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVatExemption() {
        return vatExemption;
    }

    /**
     * Sets the value of the vatExemption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVatExemption(String value) {
        this.vatExemption = value;
    }

    /**
     * Gets the value of the vatOutOfScope property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVatOutOfScope() {
        return vatOutOfScope;
    }

    /**
     * Sets the value of the vatOutOfScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVatOutOfScope(Boolean value) {
        this.vatOutOfScope = value;
    }

    /**
     * Gets the value of the vatDomesticReverseCharge property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVatDomesticReverseCharge() {
        return vatDomesticReverseCharge;
    }

    /**
     * Sets the value of the vatDomesticReverseCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVatDomesticReverseCharge(Boolean value) {
        this.vatDomesticReverseCharge = value;
    }

    /**
     * Gets the value of the marginSchemeVat property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMarginSchemeVat() {
        return marginSchemeVat;
    }

    /**
     * Sets the value of the marginSchemeVat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMarginSchemeVat(Boolean value) {
        this.marginSchemeVat = value;
    }

    /**
     * Gets the value of the marginSchemeNoVat property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMarginSchemeNoVat() {
        return marginSchemeNoVat;
    }

    /**
     * Sets the value of the marginSchemeNoVat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMarginSchemeNoVat(Boolean value) {
        this.marginSchemeNoVat = value;
    }

}
