
package com.ridango.rebus2gtfs.rebus;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ACTFIKTIVNOD_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ACTFIKTIVNOD_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FiktivnodID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="AktListElemId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="MetersBeforeAfter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="ZoneGid" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="KommunGid" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="Zon" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="ZonNamn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="KommunNamn" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "ACTFIKTIVNOD_TYP", propOrder = {
    "fiktivnodID",
    "aktListElemId",
    "metersBeforeAfter",
    "zoneGid",
    "kommunGid",
    "zon",
    "zonNamn",
    "kommunNamn",
    "sekv"
})
public class ACTFIKTIVNODTYP {

    @XmlElement(name = "FiktivnodID")
    protected int fiktivnodID;
    @XmlElement(name = "AktListElemId")
    protected int aktListElemId;
    @XmlElement(name = "MetersBeforeAfter")
    protected int metersBeforeAfter;
    @XmlElement(name = "ZoneGid")
    protected long zoneGid;
    @XmlElement(name = "KommunGid")
    protected long kommunGid;
    @XmlElement(name = "Zon")
    protected int zon;
    @XmlElement(name = "ZonNamn", required = true)
    protected String zonNamn;
    @XmlElement(name = "KommunNamn", required = true)
    protected String kommunNamn;
    @XmlElement(name = "Sekv")
    protected int sekv;

    /**
     * Gets the value of the fiktivnodID property.
     * 
     */
    public int getFiktivnodID() {
        return fiktivnodID;
    }

    /**
     * Sets the value of the fiktivnodID property.
     * 
     */
    public void setFiktivnodID(int value) {
        this.fiktivnodID = value;
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
     * Gets the value of the zoneGid property.
     * 
     */
    public long getZoneGid() {
        return zoneGid;
    }

    /**
     * Sets the value of the zoneGid property.
     * 
     */
    public void setZoneGid(long value) {
        this.zoneGid = value;
    }

    /**
     * Gets the value of the kommunGid property.
     * 
     */
    public long getKommunGid() {
        return kommunGid;
    }

    /**
     * Sets the value of the kommunGid property.
     * 
     */
    public void setKommunGid(long value) {
        this.kommunGid = value;
    }

    /**
     * Gets the value of the zon property.
     * 
     */
    public int getZon() {
        return zon;
    }

    /**
     * Sets the value of the zon property.
     * 
     */
    public void setZon(int value) {
        this.zon = value;
    }

    /**
     * Gets the value of the zonNamn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZonNamn() {
        return zonNamn;
    }

    /**
     * Sets the value of the zonNamn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZonNamn(String value) {
        this.zonNamn = value;
    }

    /**
     * Gets the value of the kommunNamn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKommunNamn() {
        return kommunNamn;
    }

    /**
     * Sets the value of the kommunNamn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKommunNamn(String value) {
        this.kommunNamn = value;
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
