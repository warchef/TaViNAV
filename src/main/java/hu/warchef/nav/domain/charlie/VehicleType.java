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
 * Other data in relation to motorised land vehicle
 * 
 * <p>Java class for VehicleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="engineCapacity" type="{http://schemas.nav.gov.hu/OSA/2.0/data}QuantityType"/&gt;
 *         &lt;element name="enginePower" type="{http://schemas.nav.gov.hu/OSA/2.0/data}QuantityType"/&gt;
 *         &lt;element name="kms" type="{http://schemas.nav.gov.hu/OSA/2.0/data}QuantityType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleType", namespace = "http://schemas.nav.gov.hu/OSA/2.0/data", propOrder = {
    "engineCapacity",
    "enginePower",
    "kms"
})
public class VehicleType {

    @XmlElement(required = true)
    protected BigDecimal engineCapacity;
    @XmlElement(required = true)
    protected BigDecimal enginePower;
    @XmlElement(required = true)
    protected BigDecimal kms;

    /**
     * Gets the value of the engineCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEngineCapacity() {
        return engineCapacity;
    }

    /**
     * Sets the value of the engineCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEngineCapacity(BigDecimal value) {
        this.engineCapacity = value;
    }

    /**
     * Gets the value of the enginePower property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEnginePower() {
        return enginePower;
    }

    /**
     * Sets the value of the enginePower property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEnginePower(BigDecimal value) {
        this.enginePower = value;
    }

    /**
     * Gets the value of the kms property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getKms() {
        return kms;
    }

    /**
     * Sets the value of the kms property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setKms(BigDecimal value) {
        this.kms = value;
    }

}
