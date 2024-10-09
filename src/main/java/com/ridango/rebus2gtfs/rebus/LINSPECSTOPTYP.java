
package com.ridango.rebus2gtfs.rebus;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LINSPECSTOP_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="LINSPECSTOP_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="hplnr">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               <minInclusive value="-2147483648"/>
 *               <maxInclusive value="2147483647"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="avst">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               <minInclusive value="-2147483648"/>
 *               <maxInclusive value="2147483647"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="lage">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="8"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="hastighet">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               <minInclusive value="-32768"/>
 *               <maxInclusive value="32767"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="ankinttid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="inttid">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               <minInclusive value="-2147483648"/>
 *               <maxInclusive value="2147483647"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="ankintminut" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="intminut" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="regler">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte">
 *               <minInclusive value="0"/>
 *               <maxInclusive value="255"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="vsek">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte">
 *               <minInclusive value="0"/>
 *               <maxInclusive value="255"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="pa">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte">
 *               <minInclusive value="0"/>
 *               <maxInclusive value="255"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="av">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte">
 *               <minInclusive value="0"/>
 *               <maxInclusive value="255"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="actlstid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="note" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="noteid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="nodtyp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Trafiktyp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="UtropNr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Namnutrop" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="TrafiktypDBid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LINSPECSTOP_TYP", propOrder = {
    "hplnr",
    "avst",
    "lage",
    "hastighet",
    "ankinttid",
    "inttid",
    "ankintminut",
    "intminut",
    "regler",
    "vsek",
    "pa",
    "av",
    "actlstid",
    "note",
    "noteid",
    "nodtyp",
    "trafiktyp",
    "utropNr",
    "namnutrop",
    "trafiktypDBid"
})
public class LINSPECSTOPTYP {

    protected int hplnr;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer avst;
    @XmlElement(required = true, nillable = true)
    protected String lage;
    @XmlElement(required = true, type = Short.class, nillable = true)
    protected Short hastighet;
    protected int ankinttid;
    /**
     * avgångstid i sekunder
     * 
     */
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer inttid;
    protected int ankintminut;
    /**
     * Avrundat till hel minut
     * 
     */
    protected int intminut;
    @XmlElement(required = true, type = Short.class, nillable = true)
    protected Short regler;
    @XmlElement(required = true, type = Short.class, nillable = true)
    protected Short vsek;
    @XmlElement(required = true, type = Short.class, nillable = true)
    protected Short pa;
    @XmlElement(required = true, type = Short.class, nillable = true)
    protected Short av;
    protected int actlstid;
    @XmlElement(required = true)
    protected String note;
    protected int noteid;
    @XmlElement(required = true)
    protected String nodtyp;
    @XmlElement(name = "Trafiktyp", required = true)
    protected String trafiktyp;
    @XmlElement(name = "UtropNr")
    protected int utropNr;
    @XmlElement(name = "Namnutrop")
    protected int namnutrop;
    @XmlElement(name = "TrafiktypDBid")
    protected int trafiktypDBid;

    /**
     * Gets the value of the hplnr property.
     * 
     */
    public int getHplnr() {
        return hplnr;
    }

    /**
     * Sets the value of the hplnr property.
     * 
     */
    public void setHplnr(int value) {
        this.hplnr = value;
    }

    /**
     * Gets the value of the avst property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAvst() {
        return avst;
    }

    /**
     * Sets the value of the avst property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAvst(Integer value) {
        this.avst = value;
    }

    /**
     * Gets the value of the lage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLage() {
        return lage;
    }

    /**
     * Sets the value of the lage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLage(String value) {
        this.lage = value;
    }

    /**
     * Gets the value of the hastighet property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getHastighet() {
        return hastighet;
    }

    /**
     * Sets the value of the hastighet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setHastighet(Short value) {
        this.hastighet = value;
    }

    /**
     * Gets the value of the ankinttid property.
     * 
     */
    public int getAnkinttid() {
        return ankinttid;
    }

    /**
     * Sets the value of the ankinttid property.
     * 
     */
    public void setAnkinttid(int value) {
        this.ankinttid = value;
    }

    /**
     * avgångstid i sekunder
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInttid() {
        return inttid;
    }

    /**
     * Sets the value of the inttid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getInttid()
     */
    public void setInttid(Integer value) {
        this.inttid = value;
    }

    /**
     * Gets the value of the ankintminut property.
     * 
     */
    public int getAnkintminut() {
        return ankintminut;
    }

    /**
     * Sets the value of the ankintminut property.
     * 
     */
    public void setAnkintminut(int value) {
        this.ankintminut = value;
    }

    /**
     * Avrundat till hel minut
     * 
     */
    public int getIntminut() {
        return intminut;
    }

    /**
     * Sets the value of the intminut property.
     * 
     */
    public void setIntminut(int value) {
        this.intminut = value;
    }

    /**
     * Gets the value of the regler property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getRegler() {
        return regler;
    }

    /**
     * Sets the value of the regler property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setRegler(Short value) {
        this.regler = value;
    }

    /**
     * Gets the value of the vsek property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getVsek() {
        return vsek;
    }

    /**
     * Sets the value of the vsek property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setVsek(Short value) {
        this.vsek = value;
    }

    /**
     * Gets the value of the pa property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPa() {
        return pa;
    }

    /**
     * Sets the value of the pa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPa(Short value) {
        this.pa = value;
    }

    /**
     * Gets the value of the av property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getAv() {
        return av;
    }

    /**
     * Sets the value of the av property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setAv(Short value) {
        this.av = value;
    }

    /**
     * Gets the value of the actlstid property.
     * 
     */
    public int getActlstid() {
        return actlstid;
    }

    /**
     * Sets the value of the actlstid property.
     * 
     */
    public void setActlstid(int value) {
        this.actlstid = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the noteid property.
     * 
     */
    public int getNoteid() {
        return noteid;
    }

    /**
     * Sets the value of the noteid property.
     * 
     */
    public void setNoteid(int value) {
        this.noteid = value;
    }

    /**
     * Gets the value of the nodtyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodtyp() {
        return nodtyp;
    }

    /**
     * Sets the value of the nodtyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodtyp(String value) {
        this.nodtyp = value;
    }

    /**
     * Gets the value of the trafiktyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrafiktyp() {
        return trafiktyp;
    }

    /**
     * Sets the value of the trafiktyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrafiktyp(String value) {
        this.trafiktyp = value;
    }

    /**
     * Gets the value of the utropNr property.
     * 
     */
    public int getUtropNr() {
        return utropNr;
    }

    /**
     * Sets the value of the utropNr property.
     * 
     */
    public void setUtropNr(int value) {
        this.utropNr = value;
    }

    /**
     * Gets the value of the namnutrop property.
     * 
     */
    public int getNamnutrop() {
        return namnutrop;
    }

    /**
     * Sets the value of the namnutrop property.
     * 
     */
    public void setNamnutrop(int value) {
        this.namnutrop = value;
    }

    /**
     * Gets the value of the trafiktypDBid property.
     * 
     */
    public int getTrafiktypDBid() {
        return trafiktypDBid;
    }

    /**
     * Sets the value of the trafiktypDBid property.
     * 
     */
    public void setTrafiktypDBid(int value) {
        this.trafiktypDBid = value;
    }

}
