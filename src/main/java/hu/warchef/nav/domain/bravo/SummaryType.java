//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.31 at 04:47:23 PM CEST 
//


package hu.warchef.nav.domain.bravo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Data of calculation of invoice totals
 * 
 * <p>Java class for SummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SummaryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="summaryNormal" type="{http://schemas.nav.gov.hu/OSA/1.0/data}SummaryNormalType"/&gt;
 *           &lt;element name="summarySimplified" type="{http://schemas.nav.gov.hu/OSA/1.0/data}SummarySimplifiedType" maxOccurs="unbounded"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="invoiceGrossAmount" type="{http://schemas.nav.gov.hu/OSA/1.0/data}MonetaryType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SummaryType", propOrder = {
    "summaryNormal",
    "summarySimplified",
    "invoiceGrossAmount"
})
public class SummaryType {

    protected SummaryNormalType summaryNormal;
    protected List<SummarySimplifiedType> summarySimplified;
    protected BigDecimal invoiceGrossAmount;

    /**
     * Gets the value of the summaryNormal property.
     * 
     * @return
     *     possible object is
     *     {@link SummaryNormalType }
     *     
     */
    public SummaryNormalType getSummaryNormal() {
        return summaryNormal;
    }

    /**
     * Sets the value of the summaryNormal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryNormalType }
     *     
     */
    public void setSummaryNormal(SummaryNormalType value) {
        this.summaryNormal = value;
    }

    /**
     * Gets the value of the summarySimplified property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the summarySimplified property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSummarySimplified().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SummarySimplifiedType }
     * 
     * 
     */
    public List<SummarySimplifiedType> getSummarySimplified() {
        if (summarySimplified == null) {
            summarySimplified = new ArrayList<SummarySimplifiedType>();
        }
        return this.summarySimplified;
    }

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

}
