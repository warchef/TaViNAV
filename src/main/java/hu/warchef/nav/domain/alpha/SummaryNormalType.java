//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.31 at 04:47:25 PM CEST 
//


package hu.warchef.nav.domain.alpha;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Calculation of invoice totals (not simplified invoice)
 * 
 * <p>Java class for SummaryNormalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SummaryNormalType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="summaryByVatRate" type="{http://schemas.nav.gov.hu/OSA/1.0/data}SummaryByVatRateType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="invoiceNetAmount" type="{http://schemas.nav.gov.hu/OSA/1.0/data}MonetaryType"/&gt;
 *         &lt;element name="invoiceVatAmount" type="{http://schemas.nav.gov.hu/OSA/1.0/data}MonetaryType"/&gt;
 *         &lt;element name="invoiceVatAmountHUF" type="{http://schemas.nav.gov.hu/OSA/1.0/data}MonetaryType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SummaryNormalType", propOrder = {
    "summaryByVatRate",
    "invoiceNetAmount",
    "invoiceVatAmount",
    "invoiceVatAmountHUF"
})
public class SummaryNormalType {

    protected List<SummaryByVatRateType> summaryByVatRate;
    @XmlElement(required = true)
    protected BigDecimal invoiceNetAmount;
    @XmlElement(required = true)
    protected BigDecimal invoiceVatAmount;
    @XmlElement(required = true)
    protected BigDecimal invoiceVatAmountHUF;

    /**
     * Gets the value of the summaryByVatRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the summaryByVatRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSummaryByVatRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SummaryByVatRateType }
     * 
     * 
     */
    public List<SummaryByVatRateType> getSummaryByVatRate() {
        if (summaryByVatRate == null) {
            summaryByVatRate = new ArrayList<SummaryByVatRateType>();
        }
        return this.summaryByVatRate;
    }

    /**
     * Gets the value of the invoiceNetAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInvoiceNetAmount() {
        return invoiceNetAmount;
    }

    /**
     * Sets the value of the invoiceNetAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInvoiceNetAmount(BigDecimal value) {
        this.invoiceNetAmount = value;
    }

    /**
     * Gets the value of the invoiceVatAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInvoiceVatAmount() {
        return invoiceVatAmount;
    }

    /**
     * Sets the value of the invoiceVatAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInvoiceVatAmount(BigDecimal value) {
        this.invoiceVatAmount = value;
    }

    /**
     * Gets the value of the invoiceVatAmountHUF property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInvoiceVatAmountHUF() {
        return invoiceVatAmountHUF;
    }

    /**
     * Sets the value of the invoiceVatAmountHUF property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInvoiceVatAmountHUF(BigDecimal value) {
        this.invoiceVatAmountHUF = value;
    }

}
