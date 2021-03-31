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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Modification or cancellation reference data
 * 
 * <p>Java class for InvoiceReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceReferenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="originalInvoiceNumber" type="{http://schemas.nav.gov.hu/OSA/1.0/data}SimpleText50NotBlankType"/&gt;
 *         &lt;element name="modificationIssueDate" type="{http://schemas.nav.gov.hu/OSA/1.0/data}DateType"/&gt;
 *         &lt;element name="modificationTimestamp" type="{http://schemas.nav.gov.hu/OSA/1.0/data}TimestampType"/&gt;
 *         &lt;element name="lastModificationReference" type="{http://schemas.nav.gov.hu/OSA/1.0/data}SimpleText50NotBlankType" minOccurs="0"/&gt;
 *         &lt;element name="modifyWithoutMaster" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceReferenceType", propOrder = {
    "originalInvoiceNumber",
    "modificationIssueDate",
    "modificationTimestamp",
    "lastModificationReference",
    "modifyWithoutMaster"
})
public class InvoiceReferenceType {

    @XmlElement(required = true)
    protected String originalInvoiceNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar modificationIssueDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modificationTimestamp;
    protected String lastModificationReference;
    @XmlElement(defaultValue = "false")
    protected boolean modifyWithoutMaster;

    /**
     * Gets the value of the originalInvoiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalInvoiceNumber() {
        return originalInvoiceNumber;
    }

    /**
     * Sets the value of the originalInvoiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalInvoiceNumber(String value) {
        this.originalInvoiceNumber = value;
    }

    /**
     * Gets the value of the modificationIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModificationIssueDate() {
        return modificationIssueDate;
    }

    /**
     * Sets the value of the modificationIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModificationIssueDate(XMLGregorianCalendar value) {
        this.modificationIssueDate = value;
    }

    /**
     * Gets the value of the modificationTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModificationTimestamp() {
        return modificationTimestamp;
    }

    /**
     * Sets the value of the modificationTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModificationTimestamp(XMLGregorianCalendar value) {
        this.modificationTimestamp = value;
    }

    /**
     * Gets the value of the lastModificationReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastModificationReference() {
        return lastModificationReference;
    }

    /**
     * Sets the value of the lastModificationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModificationReference(String value) {
        this.lastModificationReference = value;
    }

    /**
     * Gets the value of the modifyWithoutMaster property.
     * 
     */
    public boolean isModifyWithoutMaster() {
        return modifyWithoutMaster;
    }

    /**
     * Sets the value of the modifyWithoutMaster property.
     * 
     */
    public void setModifyWithoutMaster(boolean value) {
        this.modifyWithoutMaster = value;
    }

}
