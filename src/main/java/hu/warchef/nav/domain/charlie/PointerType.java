//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.31 at 04:47:20 PM CEST 
//


package hu.warchef.nav.domain.charlie;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Processing cursor data
 * 
 * <p>Java class for PointerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PointerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tag" type="{http://schemas.nav.gov.hu/OSA/2.0/data}SimpleText1024NotBlankType" minOccurs="0"/&gt;
 *         &lt;element name="value" type="{http://schemas.nav.gov.hu/OSA/2.0/data}SimpleText1024NotBlankType" minOccurs="0"/&gt;
 *         &lt;element name="line" type="{http://schemas.nav.gov.hu/OSA/2.0/data}LineNumberType" minOccurs="0"/&gt;
 *         &lt;element name="originalInvoiceNumber" type="{http://schemas.nav.gov.hu/OSA/2.0/data}SimpleText50NotBlankType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointerType", propOrder = {
    "tag",
    "value",
    "line",
    "originalInvoiceNumber"
})
public class PointerType {

    protected String tag;
    protected String value;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger line;
    protected String originalInvoiceNumber;

    /**
     * Gets the value of the tag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag() {
        return tag;
    }

    /**
     * Sets the value of the tag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag(String value) {
        this.tag = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the line property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLine() {
        return line;
    }

    /**
     * Sets the value of the line property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLine(BigInteger value) {
        this.line = value;
    }

    /**
     * Gets the value of the originalInvoiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalInvoiceNumber() {
        return originalInvoiceNumber;
    }

    /**
     * Sets the value of the originalInvoiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalInvoiceNumber(String value) {
        this.originalInvoiceNumber = value;
    }

}
