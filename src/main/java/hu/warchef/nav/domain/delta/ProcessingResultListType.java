//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.31 at 04:47:15 PM CEST 
//


package hu.warchef.nav.domain.delta;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Processing results of the request
 * 
 * <p>Java class for ProcessingResultListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcessingResultListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="processingResult" type="{http://schemas.nav.gov.hu/OSA/3.0/api}ProcessingResultType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="originalRequestVersion" type="{http://schemas.nav.gov.hu/OSA/3.0/api}OriginalRequestVersionType"/&gt;
 *         &lt;element name="annulmentData" type="{http://schemas.nav.gov.hu/OSA/3.0/api}AnnulmentDataType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessingResultListType", propOrder = {
    "processingResult",
    "originalRequestVersion",
    "annulmentData"
})
public class ProcessingResultListType {

    @XmlElement(required = true)
    protected List<ProcessingResultType> processingResult;
    @XmlElement(required = true)
    protected String originalRequestVersion;
    protected AnnulmentDataType annulmentData;

    /**
     * Gets the value of the processingResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processingResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessingResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcessingResultType }
     * 
     * 
     */
    public List<ProcessingResultType> getProcessingResult() {
        if (processingResult == null) {
            processingResult = new ArrayList<ProcessingResultType>();
        }
        return this.processingResult;
    }

    /**
     * Gets the value of the originalRequestVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalRequestVersion() {
        return originalRequestVersion;
    }

    /**
     * Sets the value of the originalRequestVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalRequestVersion(String value) {
        this.originalRequestVersion = value;
    }

    /**
     * Gets the value of the annulmentData property.
     * 
     * @return
     *     possible object is
     *     {@link AnnulmentDataType }
     *     
     */
    public AnnulmentDataType getAnnulmentData() {
        return annulmentData;
    }

    /**
     * Sets the value of the annulmentData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnulmentDataType }
     *     
     */
    public void setAnnulmentData(AnnulmentDataType value) {
        this.annulmentData = value;
    }

}