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
 * <p>Java class for MarginSchemeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MarginSchemeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TRAVEL_AGENCY"/&gt;
 *     &lt;enumeration value="SECOND_HAND"/&gt;
 *     &lt;enumeration value="ARTWORK"/&gt;
 *     &lt;enumeration value="ANTIQUES"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MarginSchemeType", namespace = "http://schemas.nav.gov.hu/OSA/2.0/data")
@XmlEnum
public enum MarginSchemeType {


    /**
     * Travel agencies
     * 
     */
    TRAVEL_AGENCY,

    /**
     * Second-hand goods
     * 
     */
    SECOND_HAND,

    /**
     * Works of art
     * 
     */
    ARTWORK,

    /**
     * Collector’s items and antiques
     * 
     */
    ANTIQUES;

    public String value() {
        return name();
    }

    public static MarginSchemeType fromValue(String v) {
        return valueOf(v);
    }

}
