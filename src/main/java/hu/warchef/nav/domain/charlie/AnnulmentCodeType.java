//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.31 at 04:47:20 PM CEST 
//


package hu.warchef.nav.domain.charlie;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AnnulmentCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AnnulmentCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ERRATIC_DATA"/&gt;
 *     &lt;enumeration value="ERRATIC_INVOICE_NUMBER"/&gt;
 *     &lt;enumeration value="ERRATIC_INVOICE_ISSUE_DATE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AnnulmentCodeType", namespace = "http://schemas.nav.gov.hu/OSA/2.0/annul")
@XmlEnum
public enum AnnulmentCodeType {


    /**
     * Technical annulment due to erratic data content
     * 
     */
    ERRATIC_DATA,

    /**
     * Technical annulment due to erratic invoice number
     * 
     */
    ERRATIC_INVOICE_NUMBER,

    /**
     * Technical annulment due to erratic invoice issue date
     * 
     */
    ERRATIC_INVOICE_ISSUE_DATE;

    public String value() {
        return name();
    }

    public static AnnulmentCodeType fromValue(String v) {
        return valueOf(v);
    }

}
