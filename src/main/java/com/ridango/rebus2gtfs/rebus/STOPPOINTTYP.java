
package com.ridango.rebus2gtfs.rebus;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for STOPPOINT_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="STOPPOINT_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="VersionId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="stoppointgid" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="journeypatternpointgid" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="localnumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="TypeNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Transportmode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="designation">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="8"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="transportauthoritynumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Coord" type="{}COORD_TYP"/>
 *         <element name="koordkval">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               <minInclusive value="-2147483648"/>
 *               <maxInclusive value="2147483647"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="alias">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="24"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="address">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="255"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="hplklass">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="48"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="StopPointFeatures" type="{}Feature" maxOccurs="unbounded"/>
 *         <element name="funkr">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="24"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="funks">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="24"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="funkh">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="24"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="GPSRadiusMeters" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="InternalNote" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="ForAlightingYesNo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="ForBoardingYesNo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="DirectionDegrees" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="LengthMeters" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="InsidestationYesNo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="InDoorsYesNo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="PublicNote" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Utrustning" type="{}UTRUSTNING_TYP"/>
 *         <element name="EmptyYesNo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="ExportToDII" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STOPPOINT_TYP", propOrder = {
    "versionId",
    "stoppointgid",
    "journeypatternpointgid",
    "localnumber",
    "typeNumber",
    "transportmode",
    "designation",
    "transportauthoritynumber",
    "coord",
    "koordkval",
    "alias",
    "address",
    "hplklass",
    "stopPointFeatures",
    "funkr",
    "funks",
    "funkh",
    "gpsRadiusMeters",
    "internalNote",
    "forAlightingYesNo",
    "forBoardingYesNo",
    "directionDegrees",
    "lengthMeters",
    "insidestationYesNo",
    "inDoorsYesNo",
    "publicNote",
    "utrustning",
    "emptyYesNo",
    "exportToDII"
})
public class STOPPOINTTYP {

    @XmlElement(name = "VersionId")
    protected int versionId;
    protected long stoppointgid;
    protected long journeypatternpointgid;
    protected int localnumber;
    @XmlElement(name = "TypeNumber")
    protected int typeNumber;
    /**
     * Transportmode per läge
     * 
     */
    @XmlElement(name = "Transportmode")
    protected int transportmode;
    /**
     * Läge
     * 
     */
    @XmlElement(required = true, nillable = true)
    protected String designation;
    protected int transportauthoritynumber;
    @XmlElement(name = "Coord", required = true)
    protected COORDTYP coord;
    /**
     * InputMethodTypeNumber
     * 
     */
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer koordkval;
    @XmlElement(required = true, nillable = true)
    protected String alias;
    @XmlElement(required = true, nillable = true)
    protected String address;
    @XmlElement(required = true, nillable = true)
    protected String hplklass;
    @XmlElement(name = "StopPointFeatures", required = true)
    protected List<Feature> stopPointFeatures;
    @XmlElement(required = true, nillable = true)
    protected String funkr;
    @XmlElement(required = true, nillable = true)
    protected String funks;
    @XmlElement(required = true, nillable = true)
    protected String funkh;
    @XmlElement(name = "GPSRadiusMeters")
    protected int gpsRadiusMeters;
    @XmlElement(name = "InternalNote", required = true)
    protected String internalNote;
    @XmlElement(name = "ForAlightingYesNo")
    protected boolean forAlightingYesNo;
    @XmlElement(name = "ForBoardingYesNo")
    protected boolean forBoardingYesNo;
    @XmlElement(name = "DirectionDegrees")
    protected int directionDegrees;
    @XmlElement(name = "LengthMeters")
    protected int lengthMeters;
    @XmlElement(name = "InsidestationYesNo")
    protected boolean insidestationYesNo;
    @XmlElement(name = "InDoorsYesNo")
    protected boolean inDoorsYesNo;
    @XmlElement(name = "PublicNote", required = true)
    protected String publicNote;
    @XmlElement(name = "Utrustning", required = true)
    protected UTRUSTNINGTYP utrustning;
    @XmlElement(name = "EmptyYesNo")
    protected boolean emptyYesNo;
    @XmlElement(name = "ExportToDII")
    protected boolean exportToDII;

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
     * Gets the value of the stoppointgid property.
     * 
     */
    public long getStoppointgid() {
        return stoppointgid;
    }

    /**
     * Sets the value of the stoppointgid property.
     * 
     */
    public void setStoppointgid(long value) {
        this.stoppointgid = value;
    }

    /**
     * Gets the value of the journeypatternpointgid property.
     * 
     */
    public long getJourneypatternpointgid() {
        return journeypatternpointgid;
    }

    /**
     * Sets the value of the journeypatternpointgid property.
     * 
     */
    public void setJourneypatternpointgid(long value) {
        this.journeypatternpointgid = value;
    }

    /**
     * Gets the value of the localnumber property.
     * 
     */
    public int getLocalnumber() {
        return localnumber;
    }

    /**
     * Sets the value of the localnumber property.
     * 
     */
    public void setLocalnumber(int value) {
        this.localnumber = value;
    }

    /**
     * Gets the value of the typeNumber property.
     * 
     */
    public int getTypeNumber() {
        return typeNumber;
    }

    /**
     * Sets the value of the typeNumber property.
     * 
     */
    public void setTypeNumber(int value) {
        this.typeNumber = value;
    }

    /**
     * Transportmode per läge
     * 
     */
    public int getTransportmode() {
        return transportmode;
    }

    /**
     * Sets the value of the transportmode property.
     * 
     */
    public void setTransportmode(int value) {
        this.transportmode = value;
    }

    /**
     * Läge
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesignation() {
        return designation;
    }

    /**
     * Sets the value of the designation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDesignation()
     */
    public void setDesignation(String value) {
        this.designation = value;
    }

    /**
     * Gets the value of the transportauthoritynumber property.
     * 
     */
    public int getTransportauthoritynumber() {
        return transportauthoritynumber;
    }

    /**
     * Sets the value of the transportauthoritynumber property.
     * 
     */
    public void setTransportauthoritynumber(int value) {
        this.transportauthoritynumber = value;
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

    /**
     * InputMethodTypeNumber
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKoordkval() {
        return koordkval;
    }

    /**
     * Sets the value of the koordkval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getKoordkval()
     */
    public void setKoordkval(Integer value) {
        this.koordkval = value;
    }

    /**
     * Gets the value of the alias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Sets the value of the alias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlias(String value) {
        this.alias = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the hplklass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHplklass() {
        return hplklass;
    }

    /**
     * Sets the value of the hplklass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHplklass(String value) {
        this.hplklass = value;
    }

    /**
     * Gets the value of the stopPointFeatures property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stopPointFeatures property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getStopPointFeatures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Feature }
     * </p>
     * 
     * 
     * @return
     *     The value of the stopPointFeatures property.
     */
    public List<Feature> getStopPointFeatures() {
        if (stopPointFeatures == null) {
            stopPointFeatures = new ArrayList<>();
        }
        return this.stopPointFeatures;
    }

    /**
     * Gets the value of the funkr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunkr() {
        return funkr;
    }

    /**
     * Sets the value of the funkr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunkr(String value) {
        this.funkr = value;
    }

    /**
     * Gets the value of the funks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunks() {
        return funks;
    }

    /**
     * Sets the value of the funks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunks(String value) {
        this.funks = value;
    }

    /**
     * Gets the value of the funkh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunkh() {
        return funkh;
    }

    /**
     * Sets the value of the funkh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunkh(String value) {
        this.funkh = value;
    }

    /**
     * Gets the value of the gpsRadiusMeters property.
     * 
     */
    public int getGPSRadiusMeters() {
        return gpsRadiusMeters;
    }

    /**
     * Sets the value of the gpsRadiusMeters property.
     * 
     */
    public void setGPSRadiusMeters(int value) {
        this.gpsRadiusMeters = value;
    }

    /**
     * Gets the value of the internalNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalNote() {
        return internalNote;
    }

    /**
     * Sets the value of the internalNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalNote(String value) {
        this.internalNote = value;
    }

    /**
     * Gets the value of the forAlightingYesNo property.
     * 
     */
    public boolean isForAlightingYesNo() {
        return forAlightingYesNo;
    }

    /**
     * Sets the value of the forAlightingYesNo property.
     * 
     */
    public void setForAlightingYesNo(boolean value) {
        this.forAlightingYesNo = value;
    }

    /**
     * Gets the value of the forBoardingYesNo property.
     * 
     */
    public boolean isForBoardingYesNo() {
        return forBoardingYesNo;
    }

    /**
     * Sets the value of the forBoardingYesNo property.
     * 
     */
    public void setForBoardingYesNo(boolean value) {
        this.forBoardingYesNo = value;
    }

    /**
     * Gets the value of the directionDegrees property.
     * 
     */
    public int getDirectionDegrees() {
        return directionDegrees;
    }

    /**
     * Sets the value of the directionDegrees property.
     * 
     */
    public void setDirectionDegrees(int value) {
        this.directionDegrees = value;
    }

    /**
     * Gets the value of the lengthMeters property.
     * 
     */
    public int getLengthMeters() {
        return lengthMeters;
    }

    /**
     * Sets the value of the lengthMeters property.
     * 
     */
    public void setLengthMeters(int value) {
        this.lengthMeters = value;
    }

    /**
     * Gets the value of the insidestationYesNo property.
     * 
     */
    public boolean isInsidestationYesNo() {
        return insidestationYesNo;
    }

    /**
     * Sets the value of the insidestationYesNo property.
     * 
     */
    public void setInsidestationYesNo(boolean value) {
        this.insidestationYesNo = value;
    }

    /**
     * Gets the value of the inDoorsYesNo property.
     * 
     */
    public boolean isInDoorsYesNo() {
        return inDoorsYesNo;
    }

    /**
     * Sets the value of the inDoorsYesNo property.
     * 
     */
    public void setInDoorsYesNo(boolean value) {
        this.inDoorsYesNo = value;
    }

    /**
     * Gets the value of the publicNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicNote() {
        return publicNote;
    }

    /**
     * Sets the value of the publicNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicNote(String value) {
        this.publicNote = value;
    }

    /**
     * Gets the value of the utrustning property.
     * 
     * @return
     *     possible object is
     *     {@link UTRUSTNINGTYP }
     *     
     */
    public UTRUSTNINGTYP getUtrustning() {
        return utrustning;
    }

    /**
     * Sets the value of the utrustning property.
     * 
     * @param value
     *     allowed object is
     *     {@link UTRUSTNINGTYP }
     *     
     */
    public void setUtrustning(UTRUSTNINGTYP value) {
        this.utrustning = value;
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
     * Gets the value of the exportToDII property.
     * 
     */
    public boolean isExportToDII() {
        return exportToDII;
    }

    /**
     * Sets the value of the exportToDII property.
     * 
     */
    public void setExportToDII(boolean value) {
        this.exportToDII = value;
    }

}
