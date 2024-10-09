
package com.ridango.rebus2gtfs.rebus;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ACTDEST_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ACTDEST_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OmskyltId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="AktListElemId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="MetersBeforeAfter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Destid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Destkod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="DestNamn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Dest16" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="ExtNr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="ExtNr2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Talkod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Sekv" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="ViaDests" type="{}VIADEST_TYP" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACTDEST_TYP", propOrder = {
    "omskyltId",
    "aktListElemId",
    "metersBeforeAfter",
    "destid",
    "destkod",
    "destNamn",
    "dest16",
    "extNr",
    "extNr2",
    "talkod",
    "sekv",
    "viaDests"
})
public class ACTDESTTYP {

    @XmlElement(name = "OmskyltId")
    protected int omskyltId;
    @XmlElement(name = "AktListElemId")
    protected int aktListElemId;
    @XmlElement(name = "MetersBeforeAfter")
    protected int metersBeforeAfter;
    @XmlElement(name = "Destid")
    protected int destid;
    @XmlElement(name = "Destkod")
    protected int destkod;
    @XmlElement(name = "DestNamn", required = true)
    protected String destNamn;
    @XmlElement(name = "Dest16", required = true)
    protected String dest16;
    @XmlElement(name = "ExtNr")
    protected int extNr;
    @XmlElement(name = "ExtNr2")
    protected int extNr2;
    @XmlElement(name = "Talkod")
    protected int talkod;
    @XmlElement(name = "Sekv")
    protected int sekv;
    @XmlElement(name = "ViaDests", required = true)
    protected List<VIADESTTYP> viaDests;

    /**
     * Gets the value of the omskyltId property.
     * 
     */
    public int getOmskyltId() {
        return omskyltId;
    }

    /**
     * Sets the value of the omskyltId property.
     * 
     */
    public void setOmskyltId(int value) {
        this.omskyltId = value;
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
     * Gets the value of the destid property.
     * 
     */
    public int getDestid() {
        return destid;
    }

    /**
     * Sets the value of the destid property.
     * 
     */
    public void setDestid(int value) {
        this.destid = value;
    }

    /**
     * Gets the value of the destkod property.
     * 
     */
    public int getDestkod() {
        return destkod;
    }

    /**
     * Sets the value of the destkod property.
     * 
     */
    public void setDestkod(int value) {
        this.destkod = value;
    }

    /**
     * Gets the value of the destNamn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestNamn() {
        return destNamn;
    }

    /**
     * Sets the value of the destNamn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestNamn(String value) {
        this.destNamn = value;
    }

    /**
     * Gets the value of the dest16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDest16() {
        return dest16;
    }

    /**
     * Sets the value of the dest16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDest16(String value) {
        this.dest16 = value;
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
     * Gets the value of the talkod property.
     * 
     */
    public int getTalkod() {
        return talkod;
    }

    /**
     * Sets the value of the talkod property.
     * 
     */
    public void setTalkod(int value) {
        this.talkod = value;
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
     * Gets the value of the viaDests property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the viaDests property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getViaDests().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VIADESTTYP }
     * </p>
     * 
     * 
     * @return
     *     The value of the viaDests property.
     */
    public List<VIADESTTYP> getViaDests() {
        if (viaDests == null) {
            viaDests = new ArrayList<>();
        }
        return this.viaDests;
    }

}
