//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.31 at 04:47:25 PM CEST 
//


package hu.warchef.nav.domain.alpha;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceCategoryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InvoiceCategoryType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NORMAL"/&gt;
 *     &lt;enumeration value="SIMPLIFIED"/&gt;
 *     &lt;enumeration value="AGGREGATE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InvoiceCategoryType")
@XmlEnum
public enum InvoiceCategoryType {


    /**
     * Normal (not simplified and not aggregate) invoice
     * 
     */
    NORMAL,

    /**
     * Simplified invoice
     * 
     */
    SIMPLIFIED,

    /**
     * Aggregate invoice
     * 
     */
    AGGREGATE;

    public String value() {
        return name();
    }

    public static InvoiceCategoryType fromValue(String v) {
        return valueOf(v);
    }

}
