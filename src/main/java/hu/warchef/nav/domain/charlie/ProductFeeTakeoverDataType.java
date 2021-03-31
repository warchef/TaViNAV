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
 * Data in connection with takeover of environmental protection product fee
 * 
 * <p>Java class for ProductFeeTakeoverDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductFeeTakeoverDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="takeoverReason" type="{http://schemas.nav.gov.hu/OSA/2.0/data}TakeoverType"/&gt;
 *         &lt;element name="takeoverAmount" type="{http://schemas.nav.gov.hu/OSA/2.0/data}MonetaryType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductFeeTakeoverDataType", namespace = "http://schemas.nav.gov.hu/OSA/2.0/data", propOrder = {
    "takeoverReason",
    "takeoverAmount"
})
public class ProductFeeTakeoverDataType {

    @XmlElement(required = true)
    protected String takeoverReason;
    protected BigDecimal takeoverAmount;

    /**
     * Gets the value of the takeoverReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTakeoverReason() {
        return takeoverReason;
    }

    /**
     * Sets the value of the takeoverReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTakeoverReason(String value) {
        this.takeoverReason = value;
    }

    /**
     * Gets the value of the takeoverAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTakeoverAmount() {
        return takeoverAmount;
    }

    /**
     * Sets the value of the takeoverAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTakeoverAmount(BigDecimal value) {
        this.takeoverAmount = value;
    }

}
