
package com.ridango.rebus2gtfs.rebus;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ACTBORDER_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ACTBORDER_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BordernodID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="AktListElemId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="MetersBeforeAfter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="ZoneBefore" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="ZoneNameBefore" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="ZoneGidBefore" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="ZoneAfter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="ZoneNameAfter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="ZoneGidAfter" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="MunicipalityGidBefore" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="MunicipalityNameBefore" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="MunicipalityGidAfter" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="MunicipalityNameAfter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="CountyBefore" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="CountyAfter" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="CountyNameBefore" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="CountyNameAfter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="TransportModeTypeNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="BorderCoord" type="{}COORD_TYP"/>
 *         <element name="Sekv" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACTBORDER_TYP", propOrder = {
    "bordernodID",
    "aktListElemId",
    "metersBeforeAfter",
    "zoneBefore",
    "zoneNameBefore",
    "zoneGidBefore",
    "zoneAfter",
    "zoneNameAfter",
    "zoneGidAfter",
    "municipalityGidBefore",
    "municipalityNameBefore",
    "municipalityGidAfter",
    "municipalityNameAfter",
    "countyBefore",
    "countyAfter",
    "countyNameBefore",
    "countyNameAfter",
    "transportModeTypeNumber",
    "borderCoord",
    "sekv"
})
public class ACTBORDERTYP {

    @XmlElement(name = "BordernodID")
    protected int bordernodID;
    @XmlElement(name = "AktListElemId")
    protected int aktListElemId;
    @XmlElement(name = "MetersBeforeAfter")
    protected int metersBeforeAfter;
    @XmlElement(name = "ZoneBefore")
    protected int zoneBefore;
    @XmlElement(name = "ZoneNameBefore", required = true)
    protected String zoneNameBefore;
    @XmlElement(name = "ZoneGidBefore")
    protected long zoneGidBefore;
    @XmlElement(name = "ZoneAfter")
    protected int zoneAfter;
    @XmlElement(name = "ZoneNameAfter", required = true)
    protected String zoneNameAfter;
    @XmlElement(name = "ZoneGidAfter")
    protected long zoneGidAfter;
    @XmlElement(name = "MunicipalityGidBefore")
    protected long municipalityGidBefore;
    @XmlElement(name = "MunicipalityNameBefore", required = true)
    protected String municipalityNameBefore;
    @XmlElement(name = "MunicipalityGidAfter")
    protected long municipalityGidAfter;
    @XmlElement(name = "MunicipalityNameAfter", required = true)
    protected String municipalityNameAfter;
    @XmlElement(name = "CountyBefore")
    protected long countyBefore;
    @XmlElement(name = "CountyAfter")
    protected long countyAfter;
    @XmlElement(name = "CountyNameBefore", required = true)
    protected String countyNameBefore;
    @XmlElement(name = "CountyNameAfter", required = true)
    protected String countyNameAfter;
    @XmlElement(name = "TransportModeTypeNumber")
    protected int transportModeTypeNumber;
    @XmlElement(name = "BorderCoord", required = true)
    protected COORDTYP borderCoord;
    @XmlElement(name = "Sekv")
    protected int sekv;

    /**
     * Gets the value of the bordernodID property.
     * 
     */
    public int getBordernodID() {
        return bordernodID;
    }

    /**
     * Sets the value of the bordernodID property.
     * 
     */
    public void setBordernodID(int value) {
        this.bordernodID = value;
    }

    /**
     * Gets the value of the aktListElemId property.
     * 
     */
    public int getAktListElemId() {
        return aktListElemId;
    }

    /**
     * Sets the value of the aktListElemId property.
     * 
     */
    public void setAktListElemId(int value) {
        this.aktListElemId = value;
    }

    /**
     * Gets the value of the metersBeforeAfter property.
     * 
     */
    public int getMetersBeforeAfter() {
        return metersBeforeAfter;
    }

    /**
     * Sets the value of the metersBeforeAfter property.
     * 
     */
    public void setMetersBeforeAfter(int value) {
        this.metersBeforeAfter = value;
    }

    /**
     * Gets the value of the zoneBefore property.
     * 
     */
    public int getZoneBefore() {
        return zoneBefore;
    }

    /**
     * Sets the value of the zoneBefore property.
     * 
     */
    public void setZoneBefore(int value) {
        this.zoneBefore = value;
    }

    /**
     * Gets the value of the zoneNameBefore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZoneNameBefore() {
        return zoneNameBefore;
    }

    /**
     * Sets the value of the zoneNameBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZoneNameBefore(String value) {
        this.zoneNameBefore = value;
    }

    /**
     * Gets the value of the zoneGidBefore property.
     * 
     */
    public long getZoneGidBefore() {
        return zoneGidBefore;
    }

    /**
     * Sets the value of the zoneGidBefore property.
     * 
     */
    public void setZoneGidBefore(long value) {
        this.zoneGidBefore = value;
    }

    /**
     * Gets the value of the zoneAfter property.
     * 
     */
    public int getZoneAfter() {
        return zoneAfter;
    }

    /**
     * Sets the value of the zoneAfter property.
     * 
     */
    public void setZoneAfter(int value) {
        this.zoneAfter = value;
    }

    /**
     * Gets the value of the zoneNameAfter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZoneNameAfter() {
        return zoneNameAfter;
    }

    /**
     * Sets the value of the zoneNameAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZoneNameAfter(String value) {
        this.zoneNameAfter = value;
    }

    /**
     * Gets the value of the zoneGidAfter property.
     * 
     */
    public long getZoneGidAfter() {
        return zoneGidAfter;
    }

    /**
     * Sets the value of the zoneGidAfter property.
     * 
     */
    public void setZoneGidAfter(long value) {
        this.zoneGidAfter = value;
    }

    /**
     * Gets the value of the municipalityGidBefore property.
     * 
     */
    public long getMunicipalityGidBefore() {
        return municipalityGidBefore;
    }

    /**
     * Sets the value of the municipalityGidBefore property.
     * 
     */
    public void setMunicipalityGidBefore(long value) {
        this.municipalityGidBefore = value;
    }

    /**
     * Gets the value of the municipalityNameBefore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunicipalityNameBefore() {
        return municipalityNameBefore;
    }

    /**
     * Sets the value of the municipalityNameBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunicipalityNameBefore(String value) {
        this.municipalityNameBefore = value;
    }

    /**
     * Gets the value of the municipalityGidAfter property.
     * 
     */
    public long getMunicipalityGidAfter() {
        return municipalityGidAfter;
    }

    /**
     * Sets the value of the municipalityGidAfter property.
     * 
     */
    public void setMunicipalityGidAfter(long value) {
        this.municipalityGidAfter = value;
    }

    /**
     * Gets the value of the municipalityNameAfter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunicipalityNameAfter() {
        return municipalityNameAfter;
    }

    /**
     * Sets the value of the municipalityNameAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunicipalityNameAfter(String value) {
        this.municipalityNameAfter = value;
    }

    /**
     * Gets the value of the countyBefore property.
     * 
     */
    public long getCountyBefore() {
        return countyBefore;
    }

    /**
     * Sets the value of the countyBefore property.
     * 
     */
    public void setCountyBefore(long value) {
        this.countyBefore = value;
    }

    /**
     * Gets the value of the countyAfter property.
     * 
     */
    public long getCountyAfter() {
        return countyAfter;
    }

    /**
     * Sets the value of the countyAfter property.
     * 
     */
    public void setCountyAfter(long value) {
        this.countyAfter = value;
    }

    /**
     * Gets the value of the countyNameBefore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountyNameBefore() {
        return countyNameBefore;
    }

    /**
     * Sets the value of the countyNameBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountyNameBefore(String value) {
        this.countyNameBefore = value;
    }

    /**
     * Gets the value of the countyNameAfter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountyNameAfter() {
        return countyNameAfter;
    }

    /**
     * Sets the value of the countyNameAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountyNameAfter(String value) {
        this.countyNameAfter = value;
    }

    /**
     * Gets the value of the transportModeTypeNumber property.
     * 
     */
    public int getTransportModeTypeNumber() {
        return transportModeTypeNumber;
    }

    /**
     * Sets the value of the transportModeTypeNumber property.
     * 
     */
    public void setTransportModeTypeNumber(int value) {
        this.transportModeTypeNumber = value;
    }

    /**
     * Gets the value of the borderCoord property.
     * 
     * @return
     *     possible object is
     *     {@link COORDTYP }
     *     
     */
    public COORDTYP getBorderCoord() {
        return borderCoord;
    }

    /**
     * Sets the value of the borderCoord property.
     * 
     * @param value
     *     allowed object is
     *     {@link COORDTYP }
     *     
     */
    public void setBorderCoord(COORDTYP value) {
        this.borderCoord = value;
    }

    /**
     * Gets the value of the sekv property.
     * 
     */
    public int getSekv() {
        return sekv;
    }

    /**
     * Sets the value of the sekv property.
     * 
     */
    public void setSekv(int value) {
        this.sekv = value;
    }

}
