//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.31 at 04:47:25 PM CEST 
//


package hu.warchef.nav.domain.alpha;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Field type including aggregate invoice special data
 * 
 * <p>Java class for AggregateInvoiceLineDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AggregateInvoiceLineDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lineExchangeRate" type="{http://schemas.nav.gov.hu/OSA/1.0/data}ExchangeRateType" minOccurs="0"/&gt;
 *         &lt;element name="lineDeliveryDate" type="{http://schemas.nav.gov.hu/OSA/1.0/data}DateType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AggregateInvoiceLineDataType", propOrder = {
    "lineExchangeRate",
    "lineDeliveryDate"
})
public class AggregateInvoiceLineDataType {

    protected BigDecimal lineExchangeRate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lineDeliveryDate;

    /**
     * Gets the value of the lineExchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLineExchangeRate() {
        return lineExchangeRate;
    }

    /**
     * Sets the value of the lineExchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLineExchangeRate(BigDecimal value) {
        this.lineExchangeRate = value;
    }

    /**
     * Gets the value of the lineDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLineDeliveryDate() {
        return lineDeliveryDate;
    }

    /**
     * Sets the value of the lineDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLineDeliveryDate(XMLGregorianCalendar value) {
        this.lineDeliveryDate = value;
    }

}
