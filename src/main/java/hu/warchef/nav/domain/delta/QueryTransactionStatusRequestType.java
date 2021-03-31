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
 * Request type of the POST /queryTransactionStatus REST operation
 * 
 * <p>Java class for QueryTransactionStatusRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryTransactionStatusRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.nav.gov.hu/OSA/3.0/api}BasicOnlineInvoiceRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="transactionId" type="{http://schemas.nav.gov.hu/NTCA/1.0/common}EntityIdType"/&gt;
 *         &lt;element name="returnOriginalRequest" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryTransactionStatusRequestType", propOrder = {
    "transactionId",
    "returnOriginalRequest"
})
@XmlSeeAlso({
    QueryTransactionStatusRequest.class
})
public class QueryTransactionStatusRequestType
    extends BasicOnlineInvoiceRequestType
{

    @XmlElement(required = true)
    protected String transactionId;
    protected Boolean returnOriginalRequest;

    /**
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the returnOriginalRequest property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnOriginalRequest() {
        return returnOriginalRequest;
    }

    /**
     * Sets the value of the returnOriginalRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnOriginalRequest(Boolean value) {
        this.returnOriginalRequest = value;
    }

}
