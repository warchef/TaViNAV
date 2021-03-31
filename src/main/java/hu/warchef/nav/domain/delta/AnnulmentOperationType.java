//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.31 at 04:47:15 PM CEST 
//


package hu.warchef.nav.domain.delta;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Technical annulment operation of the request
 * 
 * <p>Java class for AnnulmentOperationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnnulmentOperationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="index" type="{http://schemas.nav.gov.hu/OSA/3.0/base}InvoiceIndexType"/&gt;
 *         &lt;element name="annulmentOperation" type="{http://schemas.nav.gov.hu/OSA/3.0/api}ManageAnnulmentOperationType"/&gt;
 *         &lt;element name="invoiceAnnulment" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnnulmentOperationType", propOrder = {
    "index",
    "annulmentOperation",
    "invoiceAnnulment"
})
public class AnnulmentOperationType {

    protected int index;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ManageAnnulmentOperationType annulmentOperation;
    @XmlElement(required = true)
    protected byte[] invoiceAnnulment;

    /**
     * Gets the value of the index property.
     * 
     */
    public int getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     */
    public void setIndex(int value) {
        this.index = value;
    }

    /**
     * Gets the value of the annulmentOperation property.
     * 
     * @return
     *     possible object is
     *     {@link ManageAnnulmentOperationType }
     *     
     */
    public ManageAnnulmentOperationType getAnnulmentOperation() {
        return annulmentOperation;
    }

    /**
     * Sets the value of the annulmentOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManageAnnulmentOperationType }
     *     
     */
    public void setAnnulmentOperation(ManageAnnulmentOperationType value) {
        this.annulmentOperation = value;
    }

    /**
     * Gets the value of the invoiceAnnulment property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getInvoiceAnnulment() {
        return invoiceAnnulment;
    }

    /**
     * Sets the value of the invoiceAnnulment property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setInvoiceAnnulment(byte[] value) {
        this.invoiceAnnulment = value;
    }

}
