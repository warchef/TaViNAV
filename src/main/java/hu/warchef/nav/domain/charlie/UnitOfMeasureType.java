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
 * <p>Java class for UnitOfMeasureType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnitOfMeasureType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PIECE"/&gt;
 *     &lt;enumeration value="KILOGRAM"/&gt;
 *     &lt;enumeration value="TON"/&gt;
 *     &lt;enumeration value="KWH"/&gt;
 *     &lt;enumeration value="DAY"/&gt;
 *     &lt;enumeration value="HOUR"/&gt;
 *     &lt;enumeration value="MINUTE"/&gt;
 *     &lt;enumeration value="MONTH"/&gt;
 *     &lt;enumeration value="LITER"/&gt;
 *     &lt;enumeration value="KILOMETER"/&gt;
 *     &lt;enumeration value="CUBIC_METER"/&gt;
 *     &lt;enumeration value="METER"/&gt;
 *     &lt;enumeration value="LINEAR_METER"/&gt;
 *     &lt;enumeration value="CARTON"/&gt;
 *     &lt;enumeration value="PACK"/&gt;
 *     &lt;enumeration value="OWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UnitOfMeasureType", namespace = "http://schemas.nav.gov.hu/OSA/2.0/data")
@XmlEnum
public enum UnitOfMeasureType {


    /**
     * Piece
     * 
     */
    PIECE,

    /**
     * Kilogram
     * 
     */
    KILOGRAM,

    /**
     * Metric ton
     * 
     */
    TON,

    /**
     * Kilowatt hour
     * 
     */
    KWH,

    /**
     * Day
     * 
     */
    DAY,

    /**
     * Hour
     * 
     */
    HOUR,

    /**
     * Minute
     * 
     */
    MINUTE,

    /**
     * Month
     * 
     */
    MONTH,

    /**
     * Liter
     * 
     */
    LITER,

    /**
     * Kilometer
     * 
     */
    KILOMETER,

    /**
     * Cubic meter
     * 
     */
    CUBIC_METER,

    /**
     * Meter
     * 
     */
    METER,

    /**
     * Linear meter
     * 
     */
    LINEAR_METER,

    /**
     * Carton
     * 
     */
    CARTON,

    /**
     * Pack
     * 
     */
    PACK,

    /**
     * Own unit of measure
     * 
     */
    OWN;

    public String value() {
        return name();
    }

    public static UnitOfMeasureType fromValue(String v) {
        return valueOf(v);
    }

}