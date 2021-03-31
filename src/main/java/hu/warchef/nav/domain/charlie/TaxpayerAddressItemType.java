//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.31 at 04:47:20 PM CEST 
//


package hu.warchef.nav.domain.charlie;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Taxpayer address item
 * 
 * <p>Java class for TaxpayerAddressItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxpayerAddressItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="taxpayerAddressType" type="{http://schemas.nav.gov.hu/OSA/2.0/api}TaxpayerAddressTypeType"/&gt;
 *         &lt;element name="taxpayerAddress" type="{http://schemas.nav.gov.hu/OSA/2.0/data}DetailedAddressType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxpayerAddressItemType", propOrder = {
    "taxpayerAddressType",
    "taxpayerAddress"
})
public class TaxpayerAddressItemType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TaxpayerAddressTypeType taxpayerAddressType;
    @XmlElement(required = true)
    protected DetailedAddressType taxpayerAddress;

    /**
     * Gets the value of the taxpayerAddressType property.
     * 
     * @return
     *     possible object is
     *     {@link TaxpayerAddressTypeType }
     *     
     */
    public TaxpayerAddressTypeType getTaxpayerAddressType() {
        return taxpayerAddressType;
    }

    /**
     * Sets the value of the taxpayerAddressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxpayerAddressTypeType }
     *     
     */
    public void setTaxpayerAddressType(TaxpayerAddressTypeType value) {
        this.taxpayerAddressType = value;
    }

    /**
     * Gets the value of the taxpayerAddress property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedAddressType }
     *     
     */
    public DetailedAddressType getTaxpayerAddress() {
        return taxpayerAddress;
    }

    /**
     * Sets the value of the taxpayerAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedAddressType }
     *     
     */
    public void setTaxpayerAddress(DetailedAddressType value) {
        this.taxpayerAddress = value;
    }

}
