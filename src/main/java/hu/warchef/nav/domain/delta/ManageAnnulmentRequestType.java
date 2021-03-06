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
 * Request type of the POST /manageAnnulment REST operation
 * 
 * <p>Java class for ManageAnnulmentRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManageAnnulmentRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.nav.gov.hu/OSA/3.0/api}BasicOnlineInvoiceRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="exchangeToken" type="{http://schemas.nav.gov.hu/NTCA/1.0/common}SimpleText50NotBlankType"/&gt;
 *         &lt;element name="annulmentOperations" type="{http://schemas.nav.gov.hu/OSA/3.0/api}AnnulmentOperationListType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManageAnnulmentRequestType", propOrder = {
    "exchangeToken",
    "annulmentOperations"
})
@XmlSeeAlso({
    ManageAnnulmentRequest.class
})
public class ManageAnnulmentRequestType
    extends BasicOnlineInvoiceRequestType
{

    @XmlElement(required = true)
    protected String exchangeToken;
    @XmlElement(required = true)
    protected AnnulmentOperationListType annulmentOperations;

    /**
     * Gets the value of the exchangeToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeToken() {
        return exchangeToken;
    }

    /**
     * Sets the value of the exchangeToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeToken(String value) {
        this.exchangeToken = value;
    }

    /**
     * Gets the value of the annulmentOperations property.
     * 
     * @return
     *     possible object is
     *     {@link AnnulmentOperationListType }
     *     
     */
    public AnnulmentOperationListType getAnnulmentOperations() {
        return annulmentOperations;
    }

    /**
     * Sets the value of the annulmentOperations property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnulmentOperationListType }
     *     
     */
    public void setAnnulmentOperations(AnnulmentOperationListType value) {
        this.annulmentOperations = value;
    }

}
