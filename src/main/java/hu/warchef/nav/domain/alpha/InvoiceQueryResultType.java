//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.31 at 04:47:25 PM CEST 
//


package hu.warchef.nav.domain.alpha;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Invoice query result
 * 
 * <p>Java class for InvoiceQueryResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceQueryResultType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="invoiceResult" type="{http://schemas.nav.gov.hu/OSA/1.0/api}InvoiceResultType"/&gt;
 *         &lt;element name="invoiceDigestList" type="{http://schemas.nav.gov.hu/OSA/1.0/api}InvoiceDigestListType"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceQueryResultType", namespace = "http://schemas.nav.gov.hu/OSA/1.0/api", propOrder = {

})
public class InvoiceQueryResultType {

    @XmlElement(required = true)
    protected InvoiceResultType invoiceResult;
    @XmlElement(required = true)
    protected InvoiceDigestListType invoiceDigestList;

    /**
     * Gets the value of the invoiceResult property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceResultType }
     *     
     */
    public InvoiceResultType getInvoiceResult() {
        return invoiceResult;
    }

    /**
     * Sets the value of the invoiceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceResultType }
     *     
     */
    public void setInvoiceResult(InvoiceResultType value) {
        this.invoiceResult = value;
    }

    /**
     * Gets the value of the invoiceDigestList property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceDigestListType }
     *     
     */
    public InvoiceDigestListType getInvoiceDigestList() {
        return invoiceDigestList;
    }

    /**
     * Sets the value of the invoiceDigestList property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceDigestListType }
     *     
     */
    public void setInvoiceDigestList(InvoiceDigestListType value) {
        this.invoiceDigestList = value;
    }

}
