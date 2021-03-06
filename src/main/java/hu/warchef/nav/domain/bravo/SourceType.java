//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.31 at 04:47:23 PM CEST 
//


package hu.warchef.nav.domain.bravo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SourceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SourceType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="WEB"/&gt;
 *     &lt;enumeration value="XML"/&gt;
 *     &lt;enumeration value="MGM"/&gt;
 *     &lt;enumeration value="OPG"/&gt;
 *     &lt;enumeration value="OSZ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SourceType", namespace = "http://schemas.nav.gov.hu/OSA/1.0/api")
@XmlEnum
public enum SourceType {


    /**
     * Web exchange
     * 
     */
    WEB,

    /**
     * Manual XML upload
     * 
     */
    XML,

    /**
     * Machine-to-machine exchange
     * 
     */
    MGM,

    /**
     * Online cash register exchange
     * 
     */
    OPG,

    /**
     * NTCA online invoicing
     * 
     */
    OSZ;

    public String value() {
        return name();
    }

    public static SourceType fromValue(String v) {
        return valueOf(v);
    }

}
