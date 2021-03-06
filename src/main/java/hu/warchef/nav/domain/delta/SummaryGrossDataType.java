//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.31 at 04:47:15 PM CEST 
//


package hu.warchef.nav.domain.delta;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Gross data of the invoice summary
 * 
 * <p>Java class for SummaryGrossDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SummaryGrossDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="invoiceGrossAmount" type="{http://schemas.nav.gov.hu/OSA/3.0/base}MonetaryType"/&gt;
 *         &lt;element name="invoiceGrossAmountHUF" type="{http://schemas.nav.gov.hu/OSA/3.0/base}MonetaryType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SummaryGrossDataType", namespace = "http://schemas.nav.gov.hu/OSA/3.0/data", propOrder = {
    "invoiceGrossAmount",
    "invoiceGrossAmountHUF"
})
public class SummaryGrossDataType {

    @XmlElement(required = true)
    protected BigDecimal invoiceGrossAmount;
    @XmlElement(required = true)
    protected BigDecimal invoiceGrossAmountHUF;

    /**
     * Gets the value of the invoiceGrossAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInvoiceGrossAmount() {
        return invoiceGrossAmount;
    }

    /**
     * Sets the value of the invoiceGrossAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInvoiceGrossAmount(BigDecimal value) {
        this.invoiceGrossAmount = value;
    }

    /**
     * Gets the value of the invoiceGrossAmountHUF property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInvoiceGrossAmountHUF() {
        return invoiceGrossAmountHUF;
    }

    /**
     * Sets the value of the invoiceGrossAmountHUF property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInvoiceGrossAmountHUF(BigDecimal value) {
        this.invoiceGrossAmountHUF = value;
    }

}
