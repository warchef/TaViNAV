//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.31 at 04:47:20 PM CEST 
//


package hu.warchef.nav.domain.charlie;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Response type of the POST /queryTransactionStatus REST operation
 * 
 * <p>Java class for QueryTransactionStatusResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryTransactionStatusResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.nav.gov.hu/OSA/2.0/api}BasicResponseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="processingResults" type="{http://schemas.nav.gov.hu/OSA/2.0/api}ProcessingResultListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryTransactionStatusResponseType", propOrder = {
    "processingResults"
})
@XmlSeeAlso({
    QueryTransactionStatusResponse.class
})
public class QueryTransactionStatusResponseType
    extends BasicResponseType
{

    protected ProcessingResultListType processingResults;

    /**
     * Gets the value of the processingResults property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingResultListType }
     *     
     */
    public ProcessingResultListType getProcessingResults() {
        return processingResults;
    }

    /**
     * Sets the value of the processingResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingResultListType }
     *     
     */
    public void setProcessingResults(ProcessingResultListType value) {
        this.processingResults = value;
    }

}
