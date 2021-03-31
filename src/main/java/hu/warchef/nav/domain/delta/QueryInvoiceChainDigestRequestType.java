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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Request type of the POST /queryInvoiceChainDigest REST operation
 * 
 * <p>Java class for QueryInvoiceChainDigestRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryInvoiceChainDigestRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.nav.gov.hu/OSA/3.0/api}BasicOnlineInvoiceRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="page" type="{http://schemas.nav.gov.hu/NTCA/1.0/common}RequestPageType"/&gt;
 *         &lt;element name="invoiceChainQuery" type="{http://schemas.nav.gov.hu/OSA/3.0/api}InvoiceChainQueryType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryInvoiceChainDigestRequestType", propOrder = {
    "page",
    "invoiceChainQuery"
})
@XmlSeeAlso({
    QueryInvoiceChainDigestRequest.class
})
public class QueryInvoiceChainDigestRequestType
    extends BasicOnlineInvoiceRequestType
{

    protected int page;
    @XmlElement(required = true)
    protected InvoiceChainQueryType invoiceChainQuery;

    /**
     * Gets the value of the page property.
     * 
     */
    public int getPage() {
        return page;
    }

    /**
     * Sets the value of the page property.
     * 
     */
    public void setPage(int value) {
        this.page = value;
    }

    /**
     * Gets the value of the invoiceChainQuery property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceChainQueryType }
     *     
     */
    public InvoiceChainQueryType getInvoiceChainQuery() {
        return invoiceChainQuery;
    }

    /**
     * Sets the value of the invoiceChainQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceChainQueryType }
     *     
     */
    public void setInvoiceChainQuery(InvoiceChainQueryType value) {
        this.invoiceChainQuery = value;
    }

}
