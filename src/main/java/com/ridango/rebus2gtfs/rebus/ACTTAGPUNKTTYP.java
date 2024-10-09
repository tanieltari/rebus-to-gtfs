
package com.ridango.rebus2gtfs.rebus;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ACTTAGPUNKT_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ACTTAGPUNKT_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TagPunktId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="AktListElemId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Namn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="TurId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Hsek" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="MetersAfterStop" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Sekv" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="KommunGid" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="KommunNamn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACTTAGPUNKT_TYP", propOrder = {
    "tagPunktId",
    "aktListElemId",
    "namn",
    "turId",
    "hsek",
    "metersAfterStop",
    "sekv",
    "kommunGid",
    "kommunNamn"
})
public class ACTTAGPUNKTTYP {

    @XmlElement(name = "TagPunktId")
    protected int tagPunktId;
    @XmlElement(name = "AktListElemId")
    protected int aktListElemId;
    @XmlElement(name = "Namn", required = true)
    protected String namn;
    @XmlElement(name = "TurId")
    protected int turId;
    @XmlElement(name = "Hsek")
    protected int hsek;
    @XmlElement(name = "MetersAfterStop")
    protected int metersAfterStop;
    @XmlElement(name = "Sekv")
    protected int sekv;
    @XmlElement(name = "KommunGid")
    protected long kommunGid;
    @XmlElement(name = "KommunNamn", required = true)
    protected String kommunNamn;

    /**
     * Gets the value of the tagPunktId property.
     * 
     */
    public int getTagPunktId() {
        return tagPunktId;
    }

    /**
     * Sets the value of the tagPunktId property.
     * 
     */
    public void setTagPunktId(int value) {
        this.tagPunktId = value;
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
     * Gets the value of the namn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamn() {
        return namn;
    }

    /**
     * Sets the value of the namn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamn(String value) {
        this.namn = value;
    }

    /**
     * Gets the value of the turId property.
     * 
     */
    public int getTurId() {
        return turId;
    }

    /**
     * Sets the value of the turId property.
     * 
     */
    public void setTurId(int value) {
        this.turId = value;
    }

    /**
     * Gets the value of the hsek property.
     * 
     */
    public int getHsek() {
        return hsek;
    }

    /**
     * Sets the value of the hsek property.
     * 
     */
    public void setHsek(int value) {
        this.hsek = value;
    }

    /**
     * Gets the value of the metersAfterStop property.
     * 
     */
    public int getMetersAfterStop() {
        return metersAfterStop;
    }

    /**
     * Sets the value of the metersAfterStop property.
     * 
     */
    public void setMetersAfterStop(int value) {
        this.metersAfterStop = value;
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

}
