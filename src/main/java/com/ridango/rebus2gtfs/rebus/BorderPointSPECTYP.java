
package com.ridango.rebus2gtfs.rebus;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BorderPointSPEC_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="BorderPointSPEC_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="fKommunNr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="tKommunNr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="fLan" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="tLan" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="FJourneyPatternPointGid" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="Fdesignation">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="8"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="fhplnr">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               <minInclusive value="-2147483648"/>
 *               <maxInclusive value="2147483647"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="TJourneyPatternPointGid" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="Tdesignation">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="8"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="thplnr">
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
 *         <element name="TransportModeTypeNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Coord" type="{}COORD_TYP"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BorderPointSPEC_TYP", propOrder = {
    "fKommunNr",
    "tKommunNr",
    "fLan",
    "tLan",
    "fJourneyPatternPointGid",
    "fdesignation",
    "fhplnr",
    "tJourneyPatternPointGid",
    "tdesignation",
    "thplnr",
    "avst",
    "transportModeTypeNumber",
    "coord"
})
public class BorderPointSPECTYP {

    protected int fKommunNr;
    protected int tKommunNr;
    protected int fLan;
    protected int tLan;
    @XmlElement(name = "FJourneyPatternPointGid")
    protected long fJourneyPatternPointGid;
    /**
     * Läge
     * 
     */
    @XmlElement(name = "Fdesignation", required = true, nillable = true)
    protected String fdesignation;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer fhplnr;
    @XmlElement(name = "TJourneyPatternPointGid")
    protected long tJourneyPatternPointGid;
    /**
     * Läge
     * 
     */
    @XmlElement(name = "Tdesignation", required = true, nillable = true)
    protected String tdesignation;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer thplnr;
    /**
     * Distance from Startpoint
     * 
     */
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer avst;
    @XmlElement(name = "TransportModeTypeNumber")
    protected int transportModeTypeNumber;
    @XmlElement(name = "Coord", required = true)
    protected COORDTYP coord;

    /**
     * Gets the value of the fKommunNr property.
     * 
     */
    public int getFKommunNr() {
        return fKommunNr;
    }

    /**
     * Sets the value of the fKommunNr property.
     * 
     */
    public void setFKommunNr(int value) {
        this.fKommunNr = value;
    }

    /**
     * Gets the value of the tKommunNr property.
     * 
     */
    public int getTKommunNr() {
        return tKommunNr;
    }

    /**
     * Sets the value of the tKommunNr property.
     * 
     */
    public void setTKommunNr(int value) {
        this.tKommunNr = value;
    }

    /**
     * Gets the value of the fLan property.
     * 
     */
    public int getFLan() {
        return fLan;
    }

    /**
     * Sets the value of the fLan property.
     * 
     */
    public void setFLan(int value) {
        this.fLan = value;
    }

    /**
     * Gets the value of the tLan property.
     * 
     */
    public int getTLan() {
        return tLan;
    }

    /**
     * Sets the value of the tLan property.
     * 
     */
    public void setTLan(int value) {
        this.tLan = value;
    }

    /**
     * Gets the value of the fJourneyPatternPointGid property.
     * 
     */
    public long getFJourneyPatternPointGid() {
        return fJourneyPatternPointGid;
    }

    /**
     * Sets the value of the fJourneyPatternPointGid property.
     * 
     */
    public void setFJourneyPatternPointGid(long value) {
        this.fJourneyPatternPointGid = value;
    }

    /**
     * Läge
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFdesignation() {
        return fdesignation;
    }

    /**
     * Sets the value of the fdesignation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFdesignation()
     */
    public void setFdesignation(String value) {
        this.fdesignation = value;
    }

    /**
     * Gets the value of the fhplnr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFhplnr() {
        return fhplnr;
    }

    /**
     * Sets the value of the fhplnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFhplnr(Integer value) {
        this.fhplnr = value;
    }

    /**
     * Gets the value of the tJourneyPatternPointGid property.
     * 
     */
    public long getTJourneyPatternPointGid() {
        return tJourneyPatternPointGid;
    }

    /**
     * Sets the value of the tJourneyPatternPointGid property.
     * 
     */
    public void setTJourneyPatternPointGid(long value) {
        this.tJourneyPatternPointGid = value;
    }

    /**
     * Läge
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTdesignation() {
        return tdesignation;
    }

    /**
     * Sets the value of the tdesignation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTdesignation()
     */
    public void setTdesignation(String value) {
        this.tdesignation = value;
    }

    /**
     * Gets the value of the thplnr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getThplnr() {
        return thplnr;
    }

    /**
     * Sets the value of the thplnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setThplnr(Integer value) {
        this.thplnr = value;
    }

    /**
     * Distance from Startpoint
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
     * @see #getAvst()
     */
    public void setAvst(Integer value) {
        this.avst = value;
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
     * Gets the value of the coord property.
     * 
     * @return
     *     possible object is
     *     {@link COORDTYP }
     *     
     */
    public COORDTYP getCoord() {
        return coord;
    }

    /**
     * Sets the value of the coord property.
     * 
     * @param value
     *     allowed object is
     *     {@link COORDTYP }
     *     
     */
    public void setCoord(COORDTYP value) {
        this.coord = value;
    }

}
