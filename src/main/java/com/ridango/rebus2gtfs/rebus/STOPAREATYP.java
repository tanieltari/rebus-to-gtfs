
package com.ridango.rebus2gtfs.rebus;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for STOPAREA_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="STOPAREA_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="gid" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="VersionId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="VersionFromDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="VersionToDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="InventoryDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="hplnr">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               <minInclusive value="-2147483648"/>
 *               <maxInclusive value="2147483647"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="hplnam">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="40"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="ShortName">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="40"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="hpltyp">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="1"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="Typenumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="GisAreas">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence maxOccurs="unbounded" minOccurs="0">
 *                   <element name="GisArea">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence maxOccurs="unbounded">
 *                             <element name="nod">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <attribute name="seq" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                     <attribute name="N" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                     <attribute name="E" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                   </restriction>
 *                                 </complexContent>
 *                               </complexType>
 *                             </element>
 *                           </sequence>
 *                           <attribute name="CSystem" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="HplInsideGisarea">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence maxOccurs="unbounded" minOccurs="0">
 *                   <element name="Hplnr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="kommun">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               <minInclusive value="-2147483648"/>
 *               <maxInclusive value="2147483647"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="zon">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="6"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="Roadkeeper" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="omr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="CoordAvg" type="{}COORD_TYP"/>
 *         <element name="rpass">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="1"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="hplnamk">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="6"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="bytesprio">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte">
 *               <minInclusive value="0"/>
 *               <maxInclusive value="255"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="bytesmarg">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte">
 *               <minInclusive value="0"/>
 *               <maxInclusive value="255"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="hplnamt">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="40"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="talkod">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="24"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="exttalkod">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="40"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="hplnamu">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="40"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="trainnam">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="40"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="monnam">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="40"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="Trafikverket_StationsKod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Trafikverket_StationsNamn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="azon">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="6"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="thm">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="3"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="anm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="ValidFromDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="NofDepartures" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="EmptyYesNo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="OuterCallVolume">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               <minInclusive value="0"/>
 *               <maxInclusive value="4"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <sequence maxOccurs="unbounded">
 *           <element name="STOPPOINTLST" type="{}STOPPOINT_TYP"/>
 *         </sequence>
 *         <sequence maxOccurs="unbounded">
 *           <element name="STOPPOINT_UNUSED_LST" type="{}STOPPOINT_TYP"/>
 *         </sequence>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STOPAREA_TYP", propOrder = {
    "gid",
    "versionId",
    "versionFromDate",
    "versionToDate",
    "inventoryDate",
    "hplnr",
    "hplnam",
    "shortName",
    "hpltyp",
    "typenumber",
    "gisAreas",
    "hplInsideGisarea",
    "kommun",
    "zon",
    "roadkeeper",
    "omr",
    "coordAvg",
    "rpass",
    "hplnamk",
    "bytesprio",
    "bytesmarg",
    "hplnamt",
    "talkod",
    "exttalkod",
    "hplnamu",
    "trainnam",
    "monnam",
    "trafikverketStationsKod",
    "trafikverketStationsNamn",
    "azon",
    "thm",
    "anm",
    "validFromDate",
    "nofDepartures",
    "emptyYesNo",
    "outerCallVolume",
    "stoppointlst",
    "stoppointunusedlst"
})
public class STOPAREATYP {

    protected long gid;
    @XmlElement(name = "VersionId")
    protected int versionId;
    @XmlElement(name = "VersionFromDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar versionFromDate;
    @XmlElement(name = "VersionToDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar versionToDate;
    @XmlElement(name = "InventoryDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar inventoryDate;
    protected int hplnr;
    @XmlElement(required = true, nillable = true)
    protected String hplnam;
    @XmlElement(name = "ShortName", required = true, nillable = true)
    protected String shortName;
    @XmlElement(required = true, nillable = true)
    protected String hpltyp;
    /**
     * Hämtas från extstopareatype  Om det är en närområdeshållplats så beskrivs områdespolygonen i Coordcluster
     * 
     */
    @XmlElement(name = "Typenumber")
    protected int typenumber;
    @XmlElement(name = "GisAreas", required = true)
    protected STOPAREATYP.GisAreas gisAreas;
    @XmlElement(name = "HplInsideGisarea", required = true)
    protected STOPAREATYP.HplInsideGisarea hplInsideGisarea;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer kommun;
    @XmlElement(required = true, nillable = true)
    protected String zon;
    @XmlElement(name = "Roadkeeper", required = true)
    protected String roadkeeper;
    @XmlElement(required = true)
    protected String omr;
    @XmlElement(name = "CoordAvg", required = true)
    protected COORDTYP coordAvg;
    @XmlElement(required = true, nillable = true)
    protected String rpass;
    @XmlElement(required = true, nillable = true)
    protected String hplnamk;
    @XmlElement(required = true, type = Short.class, nillable = true)
    protected Short bytesprio;
    @XmlElement(required = true, type = Short.class, nillable = true)
    protected Short bytesmarg;
    @XmlElement(required = true, nillable = true)
    protected String hplnamt;
    @XmlElement(required = true, nillable = true)
    protected String talkod;
    @XmlElement(required = true, nillable = true)
    protected String exttalkod;
    @XmlElement(required = true, nillable = true)
    protected String hplnamu;
    @XmlElement(required = true, nillable = true)
    protected String trainnam;
    @XmlElement(required = true, nillable = true)
    protected String monnam;
    @XmlElement(name = "Trafikverket_StationsKod", required = true)
    protected String trafikverketStationsKod;
    /**
     * Detta är trafikverkets benämningar på Stationer i Sverige.
     * 
     */
    @XmlElement(name = "Trafikverket_StationsNamn", required = true)
    protected String trafikverketStationsNamn;
    @XmlElement(required = true, nillable = true)
    protected String azon;
    @XmlElement(required = true, nillable = true)
    protected String thm;
    @XmlElement(required = true)
    protected String anm;
    @XmlElement(name = "ValidFromDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar validFromDate;
    /**
     * Här lagras antal avgångar per dag för exporten aktuelldatum
     * 
     */
    @XmlElement(name = "NofDepartures")
    protected Integer nofDepartures;
    @XmlElement(name = "EmptyYesNo")
    protected boolean emptyYesNo;
    @XmlElement(name = "OuterCallVolume")
    protected int outerCallVolume;
    @XmlElement(name = "STOPPOINTLST", required = true)
    protected List<STOPPOINTTYP> stoppointlst;
    @XmlElement(name = "STOPPOINT_UNUSED_LST", required = true)
    protected List<STOPPOINTTYP> stoppointunusedlst;

    /**
     * Gets the value of the gid property.
     * 
     */
    public long getGid() {
        return gid;
    }

    /**
     * Sets the value of the gid property.
     * 
     */
    public void setGid(long value) {
        this.gid = value;
    }

    /**
     * Gets the value of the versionId property.
     * 
     */
    public int getVersionId() {
        return versionId;
    }

    /**
     * Sets the value of the versionId property.
     * 
     */
    public void setVersionId(int value) {
        this.versionId = value;
    }

    /**
     * Gets the value of the versionFromDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVersionFromDate() {
        return versionFromDate;
    }

    /**
     * Sets the value of the versionFromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVersionFromDate(XMLGregorianCalendar value) {
        this.versionFromDate = value;
    }

    /**
     * Gets the value of the versionToDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVersionToDate() {
        return versionToDate;
    }

    /**
     * Sets the value of the versionToDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVersionToDate(XMLGregorianCalendar value) {
        this.versionToDate = value;
    }

    /**
     * Gets the value of the inventoryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInventoryDate() {
        return inventoryDate;
    }

    /**
     * Sets the value of the inventoryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInventoryDate(XMLGregorianCalendar value) {
        this.inventoryDate = value;
    }

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
     * Gets the value of the hplnam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHplnam() {
        return hplnam;
    }

    /**
     * Sets the value of the hplnam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHplnam(String value) {
        this.hplnam = value;
    }

    /**
     * Gets the value of the shortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * Sets the value of the shortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortName(String value) {
        this.shortName = value;
    }

    /**
     * Gets the value of the hpltyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHpltyp() {
        return hpltyp;
    }

    /**
     * Sets the value of the hpltyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHpltyp(String value) {
        this.hpltyp = value;
    }

    /**
     * Hämtas från extstopareatype  Om det är en närområdeshållplats så beskrivs områdespolygonen i Coordcluster
     * 
     */
    public int getTypenumber() {
        return typenumber;
    }

    /**
     * Sets the value of the typenumber property.
     * 
     */
    public void setTypenumber(int value) {
        this.typenumber = value;
    }

    /**
     * Gets the value of the gisAreas property.
     * 
     * @return
     *     possible object is
     *     {@link STOPAREATYP.GisAreas }
     *     
     */
    public STOPAREATYP.GisAreas getGisAreas() {
        return gisAreas;
    }

    /**
     * Sets the value of the gisAreas property.
     * 
     * @param value
     *     allowed object is
     *     {@link STOPAREATYP.GisAreas }
     *     
     */
    public void setGisAreas(STOPAREATYP.GisAreas value) {
        this.gisAreas = value;
    }

    /**
     * Gets the value of the hplInsideGisarea property.
     * 
     * @return
     *     possible object is
     *     {@link STOPAREATYP.HplInsideGisarea }
     *     
     */
    public STOPAREATYP.HplInsideGisarea getHplInsideGisarea() {
        return hplInsideGisarea;
    }

    /**
     * Sets the value of the hplInsideGisarea property.
     * 
     * @param value
     *     allowed object is
     *     {@link STOPAREATYP.HplInsideGisarea }
     *     
     */
    public void setHplInsideGisarea(STOPAREATYP.HplInsideGisarea value) {
        this.hplInsideGisarea = value;
    }

    /**
     * Gets the value of the kommun property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKommun() {
        return kommun;
    }

    /**
     * Sets the value of the kommun property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKommun(Integer value) {
        this.kommun = value;
    }

    /**
     * Gets the value of the zon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZon() {
        return zon;
    }

    /**
     * Sets the value of the zon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZon(String value) {
        this.zon = value;
    }

    /**
     * Gets the value of the roadkeeper property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoadkeeper() {
        return roadkeeper;
    }

    /**
     * Sets the value of the roadkeeper property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoadkeeper(String value) {
        this.roadkeeper = value;
    }

    /**
     * Gets the value of the omr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOmr() {
        return omr;
    }

    /**
     * Sets the value of the omr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOmr(String value) {
        this.omr = value;
    }

    /**
     * Gets the value of the coordAvg property.
     * 
     * @return
     *     possible object is
     *     {@link COORDTYP }
     *     
     */
    public COORDTYP getCoordAvg() {
        return coordAvg;
    }

    /**
     * Sets the value of the coordAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link COORDTYP }
     *     
     */
    public void setCoordAvg(COORDTYP value) {
        this.coordAvg = value;
    }

    /**
     * Gets the value of the rpass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRpass() {
        return rpass;
    }

    /**
     * Sets the value of the rpass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRpass(String value) {
        this.rpass = value;
    }

    /**
     * Gets the value of the hplnamk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHplnamk() {
        return hplnamk;
    }

    /**
     * Sets the value of the hplnamk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHplnamk(String value) {
        this.hplnamk = value;
    }

    /**
     * Gets the value of the bytesprio property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getBytesprio() {
        return bytesprio;
    }

    /**
     * Sets the value of the bytesprio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setBytesprio(Short value) {
        this.bytesprio = value;
    }

    /**
     * Gets the value of the bytesmarg property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getBytesmarg() {
        return bytesmarg;
    }

    /**
     * Sets the value of the bytesmarg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setBytesmarg(Short value) {
        this.bytesmarg = value;
    }

    /**
     * Gets the value of the hplnamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHplnamt() {
        return hplnamt;
    }

    /**
     * Sets the value of the hplnamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHplnamt(String value) {
        this.hplnamt = value;
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
     * Gets the value of the exttalkod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExttalkod() {
        return exttalkod;
    }

    /**
     * Sets the value of the exttalkod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExttalkod(String value) {
        this.exttalkod = value;
    }

    /**
     * Gets the value of the hplnamu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHplnamu() {
        return hplnamu;
    }

    /**
     * Sets the value of the hplnamu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHplnamu(String value) {
        this.hplnamu = value;
    }

    /**
     * Gets the value of the trainnam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainnam() {
        return trainnam;
    }

    /**
     * Sets the value of the trainnam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainnam(String value) {
        this.trainnam = value;
    }

    /**
     * Gets the value of the monnam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonnam() {
        return monnam;
    }

    /**
     * Sets the value of the monnam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonnam(String value) {
        this.monnam = value;
    }

    /**
     * Gets the value of the trafikverketStationsKod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrafikverketStationsKod() {
        return trafikverketStationsKod;
    }

    /**
     * Sets the value of the trafikverketStationsKod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrafikverketStationsKod(String value) {
        this.trafikverketStationsKod = value;
    }

    /**
     * Detta är trafikverkets benämningar på Stationer i Sverige.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrafikverketStationsNamn() {
        return trafikverketStationsNamn;
    }

    /**
     * Sets the value of the trafikverketStationsNamn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTrafikverketStationsNamn()
     */
    public void setTrafikverketStationsNamn(String value) {
        this.trafikverketStationsNamn = value;
    }

    /**
     * Gets the value of the azon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAzon() {
        return azon;
    }

    /**
     * Sets the value of the azon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAzon(String value) {
        this.azon = value;
    }

    /**
     * Gets the value of the thm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThm() {
        return thm;
    }

    /**
     * Sets the value of the thm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThm(String value) {
        this.thm = value;
    }

    /**
     * Gets the value of the anm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnm() {
        return anm;
    }

    /**
     * Sets the value of the anm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnm(String value) {
        this.anm = value;
    }

    /**
     * Gets the value of the validFromDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidFromDate() {
        return validFromDate;
    }

    /**
     * Sets the value of the validFromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidFromDate(XMLGregorianCalendar value) {
        this.validFromDate = value;
    }

    /**
     * Här lagras antal avgångar per dag för exporten aktuelldatum
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNofDepartures() {
        return nofDepartures;
    }

    /**
     * Sets the value of the nofDepartures property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getNofDepartures()
     */
    public void setNofDepartures(Integer value) {
        this.nofDepartures = value;
    }

    /**
     * Gets the value of the emptyYesNo property.
     * 
     */
    public boolean isEmptyYesNo() {
        return emptyYesNo;
    }

    /**
     * Sets the value of the emptyYesNo property.
     * 
     */
    public void setEmptyYesNo(boolean value) {
        this.emptyYesNo = value;
    }

    /**
     * Gets the value of the outerCallVolume property.
     * 
     */
    public int getOuterCallVolume() {
        return outerCallVolume;
    }

    /**
     * Sets the value of the outerCallVolume property.
     * 
     */
    public void setOuterCallVolume(int value) {
        this.outerCallVolume = value;
    }

    /**
     * Gets the value of the stoppointlst property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stoppointlst property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSTOPPOINTLST().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link STOPPOINTTYP }
     * </p>
     * 
     * 
     * @return
     *     The value of the stoppointlst property.
     */
    public List<STOPPOINTTYP> getSTOPPOINTLST() {
        if (stoppointlst == null) {
            stoppointlst = new ArrayList<>();
        }
        return this.stoppointlst;
    }

    /**
     * Gets the value of the stoppointunusedlst property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stoppointunusedlst property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSTOPPOINTUNUSEDLST().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link STOPPOINTTYP }
     * </p>
     * 
     * 
     * @return
     *     The value of the stoppointunusedlst property.
     */
    public List<STOPPOINTTYP> getSTOPPOINTUNUSEDLST() {
        if (stoppointunusedlst == null) {
            stoppointunusedlst = new ArrayList<>();
        }
        return this.stoppointunusedlst;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence maxOccurs="unbounded" minOccurs="0">
     *         <element name="GisArea">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence maxOccurs="unbounded">
     *                   <element name="nod">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <attribute name="seq" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                           <attribute name="N" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                           <attribute name="E" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                 </sequence>
     *                 <attribute name="CSystem" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "gisArea"
    })
    public static class GisAreas {

        @XmlElement(name = "GisArea")
        protected List<STOPAREATYP.GisAreas.GisArea> gisArea;

        /**
         * Gets the value of the gisArea property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the gisArea property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getGisArea().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link STOPAREATYP.GisAreas.GisArea }
         * </p>
         * 
         * 
         * @return
         *     The value of the gisArea property.
         */
        public List<STOPAREATYP.GisAreas.GisArea> getGisArea() {
            if (gisArea == null) {
                gisArea = new ArrayList<>();
            }
            return this.gisArea;
        }


        /**
         * <p>Java class for anonymous complex type</p>.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.</p>
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       <sequence maxOccurs="unbounded">
         *         <element name="nod">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <attribute name="seq" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                 <attribute name="N" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                 <attribute name="E" type="{http://www.w3.org/2001/XMLSchema}double" />
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *       </sequence>
         *       <attribute name="CSystem" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     </restriction>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "nod"
        })
        public static class GisArea {

            @XmlElement(required = true)
            protected List<STOPAREATYP.GisAreas.GisArea.Nod> nod;
            /**
             * Koordinatsystemnummer
             * 
             */
            @XmlAttribute(name = "CSystem")
            protected Integer cSystem;

            /**
             * Gets the value of the nod property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the nod property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getNod().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link STOPAREATYP.GisAreas.GisArea.Nod }
             * </p>
             * 
             * 
             * @return
             *     The value of the nod property.
             */
            public List<STOPAREATYP.GisAreas.GisArea.Nod> getNod() {
                if (nod == null) {
                    nod = new ArrayList<>();
                }
                return this.nod;
            }

            /**
             * Koordinatsystemnummer
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getCSystem() {
                return cSystem;
            }

            /**
             * Sets the value of the cSystem property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             * @see #getCSystem()
             */
            public void setCSystem(Integer value) {
                this.cSystem = value;
            }


            /**
             * <p>Java class for anonymous complex type</p>.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.</p>
             * 
             * <pre>{@code
             * <complexType>
             *   <complexContent>
             *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       <attribute name="seq" type="{http://www.w3.org/2001/XMLSchema}int" />
             *       <attribute name="N" type="{http://www.w3.org/2001/XMLSchema}double" />
             *       <attribute name="E" type="{http://www.w3.org/2001/XMLSchema}double" />
             *     </restriction>
             *   </complexContent>
             * </complexType>
             * }</pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Nod {

                @XmlAttribute(name = "seq")
                protected Integer seq;
                @XmlAttribute(name = "N")
                protected Double n;
                @XmlAttribute(name = "E")
                protected Double e;

                /**
                 * Gets the value of the seq property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getSeq() {
                    return seq;
                }

                /**
                 * Sets the value of the seq property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setSeq(Integer value) {
                    this.seq = value;
                }

                /**
                 * Gets the value of the n property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                public Double getN() {
                    return n;
                }

                /**
                 * Sets the value of the n property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                public void setN(Double value) {
                    this.n = value;
                }

                /**
                 * Gets the value of the e property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                public Double getE() {
                    return e;
                }

                /**
                 * Sets the value of the e property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                public void setE(Double value) {
                    this.e = value;
                }

            }

        }

    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence maxOccurs="unbounded" minOccurs="0">
     *         <element name="Hplnr" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "hplnr"
    })
    public static class HplInsideGisarea {

        @XmlElement(name = "Hplnr", type = Integer.class)
        protected List<Integer> hplnr;

        /**
         * Gets the value of the hplnr property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the hplnr property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getHplnr().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Integer }
         * </p>
         * 
         * 
         * @return
         *     The value of the hplnr property.
         */
        public List<Integer> getHplnr() {
            if (hplnr == null) {
                hplnr = new ArrayList<>();
            }
            return this.hplnr;
        }

    }

}
