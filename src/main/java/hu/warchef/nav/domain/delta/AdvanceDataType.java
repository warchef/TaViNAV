//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.31 at 04:47:15 PM CEST 
//


package hu.warchef.nav.domain.delta;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Advance related data
 * 
 * <p>Java class for AdvanceDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdvanceDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="advanceIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="advancePaymentData" type="{http://schemas.nav.gov.hu/OSA/3.0/data}AdvancePaymentDataType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdvanceDataType", namespace = "http://schemas.nav.gov.hu/OSA/3.0/data", propOrder = {
    "advanceIndicator",
    "advancePaymentData"
})
public class AdvanceDataType {

    protected boolean advanceIndicator;
    protected AdvancePaymentDataType advancePaymentData;

    /**
     * Gets the value of the advanceIndicator property.
     * 
     */
    public boolean isAdvanceIndicator() {
        return advanceIndicator;
    }

    /**
     * Sets the value of the advanceIndicator property.
     * 
     */
    public void setAdvanceIndicator(boolean value) {
        this.advanceIndicator = value;
    }

    /**
     * Gets the value of the advancePaymentData property.
     * 
     * @return
     *     possible object is
     *     {@link AdvancePaymentDataType }
     *     
     */
    public AdvancePaymentDataType getAdvancePaymentData() {
        return advancePaymentData;
    }

    /**
     * Sets the value of the advancePaymentData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvancePaymentDataType }
     *     
     */
    public void setAdvancePaymentData(AdvancePaymentDataType value) {
        this.advancePaymentData = value;
    }

}
