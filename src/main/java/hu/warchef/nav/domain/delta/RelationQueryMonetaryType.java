//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.31 at 04:47:15 PM CEST 
//


package hu.warchef.nav.domain.delta;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Query parameter for monetary values
 * 
 * <p>Java class for RelationQueryMonetaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelationQueryMonetaryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="queryOperator" type="{http://schemas.nav.gov.hu/OSA/3.0/api}QueryOperatorType"/&gt;
 *         &lt;element name="queryValue" type="{http://schemas.nav.gov.hu/OSA/3.0/base}MonetaryType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelationQueryMonetaryType", propOrder = {
    "queryOperator",
    "queryValue"
})
public class RelationQueryMonetaryType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected QueryOperatorType queryOperator;
    @XmlElement(required = true)
    protected BigDecimal queryValue;

    /**
     * Gets the value of the queryOperator property.
     * 
     * @return
     *     possible object is
     *     {@link QueryOperatorType }
     *     
     */
    public QueryOperatorType getQueryOperator() {
        return queryOperator;
    }

    /**
     * Sets the value of the queryOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryOperatorType }
     *     
     */
    public void setQueryOperator(QueryOperatorType value) {
        this.queryOperator = value;
    }

    /**
     * Gets the value of the queryValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQueryValue() {
        return queryValue;
    }

    /**
     * Sets the value of the queryValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQueryValue(BigDecimal value) {
        this.queryValue = value;
    }

}
