//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.31 at 04:47:23 PM CEST 
//


package hu.warchef.nav.domain.bravo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.nav.gov.hu/OSA/1.0/api}BasicResponseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="processingResults" type="{http://schemas.nav.gov.hu/OSA/1.0/api}ProcessingResultListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "processingResults"
})
@XmlRootElement(name = "QueryInvoiceStatusResponse", namespace = "http://schemas.nav.gov.hu/OSA/1.0/api")
public class QueryInvoiceStatusResponse
    extends BasicResponseType
{

    @XmlElement(namespace = "http://schemas.nav.gov.hu/OSA/1.0/api")
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
