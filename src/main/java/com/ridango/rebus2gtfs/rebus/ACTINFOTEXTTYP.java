
package com.ridango.rebus2gtfs.rebus;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ACTINFOTEXT_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ACTINFOTEXT_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="InfoId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="AktListElemId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="MetersBeforeAfter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="InfotextId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Infotextkod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Infotext" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Infotext16" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Talkod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="ExtTalkod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="ExtNr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="ExtNr2" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "ACTINFOTEXT_TYP", propOrder = {
    "infoId",
    "aktListElemId",
    "metersBeforeAfter",
    "infotextId",
    "infotextkod",
    "infotext",
    "infotext16",
    "talkod",
    "extTalkod",
    "extNr",
    "extNr2",
    "sekv"
})
public class ACTINFOTEXTTYP {

    @XmlElement(name = "InfoId")
    protected int infoId;
    @XmlElement(name = "AktListElemId")
    protected int aktListElemId;
    @XmlElement(name = "MetersBeforeAfter")
    protected int metersBeforeAfter;
    @XmlElement(name = "InfotextId")
    protected int infotextId;
    @XmlElement(name = "Infotextkod")
    protected int infotextkod;
    @XmlElement(name = "Infotext", required = true)
    protected String infotext;
    @XmlElement(name = "Infotext16", required = true)
    protected String infotext16;
    @XmlElement(name = "Talkod", required = true)
    protected String talkod;
    @XmlElement(name = "ExtTalkod", required = true)
    protected String extTalkod;
    @XmlElement(name = "ExtNr")
    protected int extNr;
    @XmlElement(name = "ExtNr2")
    protected int extNr2;
    @XmlElement(name = "Sekv")
    protected int sekv;

    /**
     * Gets the value of the infoId property.
     * 
     */
    public int getInfoId() {
        return infoId;
    }

    /**
     * Sets the value of the infoId property.
     * 
     */
    public void setInfoId(int value) {
        this.infoId = value;
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
     * Gets the value of the infotextId property.
     * 
     */
    public int getInfotextId() {
        return infotextId;
    }

    /**
     * Sets the value of the infotextId property.
     * 
     */
    public void setInfotextId(int value) {
        this.infotextId = value;
    }

    /**
     * Gets the value of the infotextkod property.
     * 
     */
    public int getInfotextkod() {
        return infotextkod;
    }

    /**
     * Sets the value of the infotextkod property.
     * 
     */
    public void setInfotextkod(int value) {
        this.infotextkod = value;
    }

    /**
     * Gets the value of the infotext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfotext() {
        return infotext;
    }

    /**
     * Sets the value of the infotext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfotext(String value) {
        this.infotext = value;
    }

    /**
     * Gets the value of the infotext16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfotext16() {
        return infotext16;
    }

    /**
     * Sets the value of the infotext16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfotext16(String value) {
        this.infotext16 = value;
    }

    /**
     * Gets the value of the talkod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTalkod() {
        return talkod;
    }

    /**
     * Sets the value of the talkod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTalkod(String value) {
        this.talkod = value;
    }

    /**
     * Gets the value of the extTalkod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtTalkod() {
        return extTalkod;
    }

    /**
     * Sets the value of the extTalkod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtTalkod(String value) {
        this.extTalkod = value;
    }

    /**
     * Gets the value of the extNr property.
     * 
     */
    public int getExtNr() {
        return extNr;
    }

    /**
     * Sets the value of the extNr property.
     * 
     */
    public void setExtNr(int value) {
        this.extNr = value;
    }

    /**
     * Gets the value of the extNr2 property.
     * 
     */
    public int getExtNr2() {
        return extNr2;
    }

    /**
     * Sets the value of the extNr2 property.
     * 
     */
    public void setExtNr2(int value) {
        this.extNr2 = value;
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
