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
 * Online Invoice specific basic request data
 * 
 * <p>Java class for BasicOnlineInvoiceRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BasicOnlineInvoiceRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.nav.gov.hu/NTCA/1.0/common}BasicRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="software" type="{http://schemas.nav.gov.hu/OSA/3.0/api}SoftwareType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasicOnlineInvoiceRequestType", propOrder = {
    "software"
})
@XmlSeeAlso({
    TokenExchangeRequest.class,
    QueryTransactionStatusRequestType.class,
    QueryTransactionListRequestType.class,
    QueryTaxpayerRequestType.class,
    QueryInvoiceDigestRequestType.class,
    QueryInvoiceDataRequestType.class,
    QueryInvoiceChainDigestRequestType.class,
    ManageInvoiceRequestType.class,
    ManageAnnulmentRequestType.class
})
public class BasicOnlineInvoiceRequestType
    extends BasicRequestType
{

    @XmlElement(required = true)
    protected SoftwareType software;

    /**
     * Gets the value of the software property.
     * 
     * @return
     *     possible object is
     *     {@link SoftwareType }
     *     
     */
    public SoftwareType getSoftware() {
        return software;
    }

    /**
     * Sets the value of the software property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoftwareType }
     *     
     */
    public void setSoftware(SoftwareType value) {
        this.software = value;
    }

}
