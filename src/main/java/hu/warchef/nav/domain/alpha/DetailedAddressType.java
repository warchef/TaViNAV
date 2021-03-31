//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.31 at 04:47:25 PM CEST 
//


package hu.warchef.nav.domain.alpha;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Detailed address data
 * 
 * <p>Java class for DetailedAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DetailedAddressType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="countryCode" type="{http://schemas.nav.gov.hu/OSA/1.0/data}CountryCodeType"/&gt;
 *         &lt;element name="region" type="{http://schemas.nav.gov.hu/OSA/1.0/data}SimpleText50NotBlankType" minOccurs="0"/&gt;
 *         &lt;element name="postalCode" type="{http://schemas.nav.gov.hu/OSA/1.0/data}PostalCodeType"/&gt;
 *         &lt;element name="city" type="{http://schemas.nav.gov.hu/OSA/1.0/data}SimpleText255NotBlankType"/&gt;
 *         &lt;element name="streetName" type="{http://schemas.nav.gov.hu/OSA/1.0/data}SimpleText255NotBlankType"/&gt;
 *         &lt;element name="publicPlaceCategory" type="{http://schemas.nav.gov.hu/OSA/1.0/data}SimpleText50NotBlankType"/&gt;
 *         &lt;element name="number" type="{http://schemas.nav.gov.hu/OSA/1.0/data}SimpleText50NotBlankType" minOccurs="0"/&gt;
 *         &lt;element name="building" type="{http://schemas.nav.gov.hu/OSA/1.0/data}SimpleText50NotBlankType" minOccurs="0"/&gt;
 *         &lt;element name="staircase" type="{http://schemas.nav.gov.hu/OSA/1.0/data}SimpleText50NotBlankType" minOccurs="0"/&gt;
 *         &lt;element name="floor" type="{http://schemas.nav.gov.hu/OSA/1.0/data}SimpleText50NotBlankType" minOccurs="0"/&gt;
 *         &lt;element name="door" type="{http://schemas.nav.gov.hu/OSA/1.0/data}SimpleText50NotBlankType" minOccurs="0"/&gt;
 *         &lt;element name="lotNumber" type="{http://schemas.nav.gov.hu/OSA/1.0/data}SimpleText50NotBlankType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailedAddressType", propOrder = {
    "countryCode",
    "region",
    "postalCode",
    "city",
    "streetName",
    "publicPlaceCategory",
    "number",
    "building",
    "staircase",
    "floor",
    "door",
    "lotNumber"
})
public class DetailedAddressType {

    @XmlElement(required = true, defaultValue = "HU")
    protected String countryCode;
    protected String region;
    @XmlElement(required = true)
    protected String postalCode;
    @XmlElement(required = true)
    protected String city;
    @XmlElement(required = true)
    protected String streetName;
    @XmlElement(required = true)
    protected String publicPlaceCategory;
    protected String number;
    protected String building;
    protected String staircase;
    protected String floor;
    protected String door;
    protected String lotNumber;

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the streetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * Sets the value of the streetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetName(String value) {
        this.streetName = value;
    }

    /**
     * Gets the value of the publicPlaceCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicPlaceCategory() {
        return publicPlaceCategory;
    }

    /**
     * Sets the value of the publicPlaceCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicPlaceCategory(String value) {
        this.publicPlaceCategory = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the building property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuilding() {
        return building;
    }

    /**
     * Sets the value of the building property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuilding(String value) {
        this.building = value;
    }

    /**
     * Gets the value of the staircase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaircase() {
        return staircase;
    }

    /**
     * Sets the value of the staircase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaircase(String value) {
        this.staircase = value;
    }

    /**
     * Gets the value of the floor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloor() {
        return floor;
    }

    /**
     * Sets the value of the floor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloor(String value) {
        this.floor = value;
    }

    /**
     * Gets the value of the door property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoor() {
        return door;
    }

    /**
     * Sets the value of the door property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoor(String value) {
        this.door = value;
    }

    /**
     * Gets the value of the lotNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLotNumber() {
        return lotNumber;
    }

    /**
     * Sets the value of the lotNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLotNumber(String value) {
        this.lotNumber = value;
    }

}