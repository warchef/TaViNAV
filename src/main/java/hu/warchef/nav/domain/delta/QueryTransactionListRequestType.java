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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Request type of the POST /queryTransactionList REST operation
 * 
 * <p>Java class for QueryTransactionListRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryTransactionListRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.nav.gov.hu/OSA/3.0/api}BasicOnlineInvoiceRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="page" type="{http://schemas.nav.gov.hu/NTCA/1.0/common}RequestPageType"/&gt;
 *         &lt;element name="insDate" type="{http://schemas.nav.gov.hu/OSA/3.0/api}DateTimeIntervalParamType"/&gt;
 *         &lt;element name="requestStatus" type="{http://schemas.nav.gov.hu/OSA/3.0/api}RequestStatusType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryTransactionListRequestType", propOrder = {
    "page",
    "insDate",
    "requestStatus"
})
@XmlSeeAlso({
    QueryTransactionListRequest.class
})
public class QueryTransactionListRequestType
    extends BasicOnlineInvoiceRequestType
{

    protected int page;
    @XmlElement(required = true)
    protected DateTimeIntervalParamType insDate;
    @XmlSchemaType(name = "string")
    protected RequestStatusType requestStatus;

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
     * Gets the value of the insDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeIntervalParamType }
     *     
     */
    public DateTimeIntervalParamType getInsDate() {
        return insDate;
    }

    /**
     * Sets the value of the insDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeIntervalParamType }
     *     
     */
    public void setInsDate(DateTimeIntervalParamType value) {
        this.insDate = value;
    }

    /**
     * Gets the value of the requestStatus property.
     * 
     * @return
     *     possible object is
     *     {@link RequestStatusType }
     *     
     */
    public RequestStatusType getRequestStatus() {
        return requestStatus;
    }

    /**
     * Sets the value of the requestStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestStatusType }
     *     
     */
    public void setRequestStatus(RequestStatusType value) {
        this.requestStatus = value;
    }

}
