
package com.ridango.rebus2gtfs.rebus;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExportDocType1 complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ExportDocType1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ALMA" type="{}Almas"/>
 *         <element name="COORD" type="{}COORD_TYP2"/>
 *         <element name="BYTESINFO" type="{}BYTESINFO_TYP"/>
 *         <element name="FOTNOT" type="{}FOTNOT_TYP"/>
 *         <element name="LAN" type="{}LAN_TYP"/>
 *         <element name="LIN" type="{}LIN_TYP"/>
 *         <element name="LNK" type="{}LINK_TYP"/>
 *         <element name="OML" type="{}OML_TYP"/>
 *         <element name="SAMLIN" type="{}SAMLIN_TYP"/>
 *         <element name="SIGNAL" type="{}SIGNAL_TYP"/>
 *         <element name="STOP" type="{}STOP_TYP"/>
 *         <element name="Timetable" type="{}Timetables"/>
 *         <element name="WALKLINK" type="{}WALKLINK_TYP"/>
 *         <element name="ZON" type="{}ZON_TYP"/>
 *         <element name="ZONAVST" type="{}ZONAVST_TYP"/>
 *         <element name="TOM" type="{}TOM_TYP"/>
 *         <element name="SYNONYMS" type="{}Synonym_TYP"/>
 *         <element name="Actlstlst">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Acts" type="{}ACTLST_TYP"/>
 *                 </sequence>
 *                 <attribute name="RebusVersion" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 <attribute name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Hentrep">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence maxOccurs="unbounded">
 *                   <element name="ENTREPRENOR" type="{}Entreprenor_typ"/>
 *                 </sequence>
 *                 <attribute name="RebusVersion" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 <attribute name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Misc">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="KOMMUN">
 *                     <complexType>
 *                       <complexContent>
 *                         <extension base="{}KOMMUN_TYP">
 *                           <sequence maxOccurs="unbounded">
 *                             <element name="KOMMUNSPEC" type="{}KOMMUNSPEC_TYP"/>
 *                           </sequence>
 *                         </extension>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="THM">
 *                     <complexType>
 *                       <complexContent>
 *                         <extension base="{}THM_TYP">
 *                           <sequence maxOccurs="unbounded">
 *                             <element name="THMSPEC" type="{}THMSPEC_TYP"/>
 *                           </sequence>
 *                         </extension>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="Linjenatstyper">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence maxOccurs="unbounded">
 *                             <element name="LINJENATSTYP" type="{}LINJENATSTYPSPEC_TYP"/>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="Linjetyper">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence maxOccurs="unbounded">
 *                             <element name="LINJETYP" type="{}LINJETYPSPEC_TYP"/>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="NAMN" type="{}NAMN_TYP"/>
 *                   <element name="DEST" type="{}DEST_TYP"/>
 *                   <element name="DESTALL" type="{}DEST_TYP"/>
 *                   <element name="Avtal">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence maxOccurs="unbounded" minOccurs="0">
 *                             <element name="AVTAL" type="{}AVTALSPEC_TYP"/>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="Taxetyp">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence maxOccurs="unbounded" minOccurs="0">
 *                             <element name="TAXETYP" type="{}TAXETYPSPEC_TYP"/>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="AdressMultipel" type="{}AdressMultipel_TYP"/>
 *                   <element name="TRAFIKTYP" type="{}TRAFIKTYP_TYP"/>
 *                   <element name="BorderPoints">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence maxOccurs="unbounded">
 *                             <element name="BorderPoint">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <sequence>
 *                                       <element name="BorderPointSPEC" type="{}BorderPointSPEC_TYP"/>
 *                                     </sequence>
 *                                   </restriction>
 *                                 </complexContent>
 *                               </complexType>
 *                             </element>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *                 <attribute name="RebusVersion" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 <attribute name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Samtrafik">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="SamtrafikregelTOT">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence maxOccurs="unbounded">
 *                             <element name="SAMTRAFIKREGELSPEC" type="{}SAMTRAFIKREGELSPEC_TYP"/>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="SAMTRAFIKREGEL" type="{}SAMTRAFIKREGEL_TYP"/>
 *                   <element name="SAMTRAFIKRESULT" type="{}SAMTRAFIKRESULT_TYP"/>
 *                 </sequence>
 *                 <attribute name="RebusVersion" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 <attribute name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Fordon">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence maxOccurs="unbounded">
 *                   <element name="FordSpec" type="{}Ford_TYP"/>
 *                 </sequence>
 *                 <attribute name="RebusVersion" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 <attribute name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Statistics">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="NoStoparea" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   <element name="NoStopPoints" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   <element name="NoOfDays" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   <element name="NoTrips" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   <element name="NoLines" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   <element name="NoActivities" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   <element name="NoConnectedTraffic" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   <element name="NoFootnotes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   <element name="NoPeriods" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   <element name="NoWalklinks" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   <element name="NoVehicles" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   <element name="NoEmptyRuns" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   <element name="NoMunicipalities" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   <element name="NoLinetypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   <element name="NoLinNatTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   <element name="NoNames" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   <element name="NoDestinations" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   <element name="NoContracts" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   <element name="NoTaxtypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   <element name="NoTraffictypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                 </sequence>
 *                 <attribute name="RebusVersion" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 <attribute name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="HPLKONV" type="{}HPLKONV_TYP"/>
 *         <element name="LINKONV" type="{}LINKONV_TYP"/>
 *         <element name="StopPointFeatueDataTypes" type="{}DataTypes"/>
 *         <element name="PERFOTNOT" type="{}PERFOT_TYP"/>
 *         <element name="TRAFFOTNOT" type="{}TRAFFOT_TYP"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportDocType1", propOrder = {
    "alma",
    "coord",
    "bytesinfo",
    "fotnot",
    "lan",
    "lin",
    "lnk",
    "oml",
    "samlin",
    "signal",
    "stop",
    "timetable",
    "walklink",
    "zon",
    "zonavst",
    "tom",
    "synonyms",
    "actlstlst",
    "hentrep",
    "misc",
    "samtrafik",
    "fordon",
    "statistics",
    "hplkonv",
    "linkonv",
    "stopPointFeatueDataTypes",
    "perfotnot",
    "traffotnot"
})
public class ExportDocType1 {

    @XmlElement(name = "ALMA", required = true)
    protected Almas alma;
    @XmlElement(name = "COORD", required = true)
    protected COORDTYP2 coord;
    @XmlElement(name = "BYTESINFO", required = true)
    protected BYTESINFOTYP bytesinfo;
    @XmlElement(name = "FOTNOT", required = true)
    protected FOTNOTTYP fotnot;
    @XmlElement(name = "LAN", required = true)
    protected LANTYP lan;
    @XmlElement(name = "LIN", required = true)
    protected LINTYP lin;
    @XmlElement(name = "LNK", required = true)
    protected LINKTYP lnk;
    @XmlElement(name = "OML", required = true)
    protected OMLTYP oml;
    @XmlElement(name = "SAMLIN", required = true)
    protected SAMLINTYP samlin;
    @XmlElement(name = "SIGNAL", required = true)
    protected SIGNALTYP signal;
    @XmlElement(name = "STOP", required = true)
    protected STOPTYP stop;
    @XmlElement(name = "Timetable", required = true)
    protected Timetables timetable;
    @XmlElement(name = "WALKLINK", required = true)
    protected WALKLINKTYP walklink;
    @XmlElement(name = "ZON", required = true)
    protected ZONTYP zon;
    @XmlElement(name = "ZONAVST", required = true)
    protected ZONAVSTTYP zonavst;
    @XmlElement(name = "TOM", required = true)
    protected TOMTYP tom;
    @XmlElement(name = "SYNONYMS", required = true)
    protected SynonymTYP synonyms;
    @XmlElement(name = "Actlstlst", required = true)
    protected ExportDocType1 .Actlstlst actlstlst;
    @XmlElement(name = "Hentrep", required = true)
    protected ExportDocType1 .Hentrep hentrep;
    @XmlElement(name = "Misc", required = true)
    protected ExportDocType1 .Misc misc;
    @XmlElement(name = "Samtrafik", required = true)
    protected ExportDocType1 .Samtrafik samtrafik;
    @XmlElement(name = "Fordon", required = true)
    protected ExportDocType1 .Fordon fordon;
    @XmlElement(name = "Statistics", required = true)
    protected ExportDocType1 .Statistics statistics;
    /**
     * Konverteringtabell för SYD och MITT
     * 
     */
    @XmlElement(name = "HPLKONV", required = true)
    protected HPLKONVTYP hplkonv;
    /**
     * Konverteringstabell för SYD och MITT
     * 
     */
    @XmlElement(name = "LINKONV", required = true)
    protected LINKONVTYP linkonv;
    @XmlElement(name = "StopPointFeatueDataTypes", required = true)
    protected DataTypes stopPointFeatueDataTypes;
    @XmlElement(name = "PERFOTNOT", required = true)
    protected PERFOTTYP perfotnot;
    @XmlElement(name = "TRAFFOTNOT", required = true)
    protected TRAFFOTTYP traffotnot;

    /**
     * Gets the value of the alma property.
     * 
     * @return
     *     possible object is
     *     {@link Almas }
     *     
     */
    public Almas getALMA() {
        return alma;
    }

    /**
     * Sets the value of the alma property.
     * 
     * @param value
     *     allowed object is
     *     {@link Almas }
     *     
     */
    public void setALMA(Almas value) {
        this.alma = value;
    }

    /**
     * Gets the value of the coord property.
     * 
     * @return
     *     possible object is
     *     {@link COORDTYP2 }
     *     
     */
    public COORDTYP2 getCOORD() {
        return coord;
    }

    /**
     * Sets the value of the coord property.
     * 
     * @param value
     *     allowed object is
     *     {@link COORDTYP2 }
     *     
     */
    public void setCOORD(COORDTYP2 value) {
        this.coord = value;
    }

    /**
     * Gets the value of the bytesinfo property.
     * 
     * @return
     *     possible object is
     *     {@link BYTESINFOTYP }
     *     
     */
    public BYTESINFOTYP getBYTESINFO() {
        return bytesinfo;
    }

    /**
     * Sets the value of the bytesinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BYTESINFOTYP }
     *     
     */
    public void setBYTESINFO(BYTESINFOTYP value) {
        this.bytesinfo = value;
    }

    /**
     * Gets the value of the fotnot property.
     * 
     * @return
     *     possible object is
     *     {@link FOTNOTTYP }
     *     
     */
    public FOTNOTTYP getFOTNOT() {
        return fotnot;
    }

    /**
     * Sets the value of the fotnot property.
     * 
     * @param value
     *     allowed object is
     *     {@link FOTNOTTYP }
     *     
     */
    public void setFOTNOT(FOTNOTTYP value) {
        this.fotnot = value;
    }

    /**
     * Gets the value of the lan property.
     * 
     * @return
     *     possible object is
     *     {@link LANTYP }
     *     
     */
    public LANTYP getLAN() {
        return lan;
    }

    /**
     * Sets the value of the lan property.
     * 
     * @param value
     *     allowed object is
     *     {@link LANTYP }
     *     
     */
    public void setLAN(LANTYP value) {
        this.lan = value;
    }

    /**
     * Gets the value of the lin property.
     * 
     * @return
     *     possible object is
     *     {@link LINTYP }
     *     
     */
    public LINTYP getLIN() {
        return lin;
    }

    /**
     * Sets the value of the lin property.
     * 
     * @param value
     *     allowed object is
     *     {@link LINTYP }
     *     
     */
    public void setLIN(LINTYP value) {
        this.lin = value;
    }

    /**
     * Gets the value of the lnk property.
     * 
     * @return
     *     possible object is
     *     {@link LINKTYP }
     *     
     */
    public LINKTYP getLNK() {
        return lnk;
    }

    /**
     * Sets the value of the lnk property.
     * 
     * @param value
     *     allowed object is
     *     {@link LINKTYP }
     *     
     */
    public void setLNK(LINKTYP value) {
        this.lnk = value;
    }

    /**
     * Gets the value of the oml property.
     * 
     * @return
     *     possible object is
     *     {@link OMLTYP }
     *     
     */
    public OMLTYP getOML() {
        return oml;
    }

    /**
     * Sets the value of the oml property.
     * 
     * @param value
     *     allowed object is
     *     {@link OMLTYP }
     *     
     */
    public void setOML(OMLTYP value) {
        this.oml = value;
    }

    /**
     * Gets the value of the samlin property.
     * 
     * @return
     *     possible object is
     *     {@link SAMLINTYP }
     *     
     */
    public SAMLINTYP getSAMLIN() {
        return samlin;
    }

    /**
     * Sets the value of the samlin property.
     * 
     * @param value
     *     allowed object is
     *     {@link SAMLINTYP }
     *     
     */
    public void setSAMLIN(SAMLINTYP value) {
        this.samlin = value;
    }

    /**
     * Gets the value of the signal property.
     * 
     * @return
     *     possible object is
     *     {@link SIGNALTYP }
     *     
     */
    public SIGNALTYP getSIGNAL() {
        return signal;
    }

    /**
     * Sets the value of the signal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SIGNALTYP }
     *     
     */
    public void setSIGNAL(SIGNALTYP value) {
        this.signal = value;
    }

    /**
     * Gets the value of the stop property.
     * 
     * @return
     *     possible object is
     *     {@link STOPTYP }
     *     
     */
    public STOPTYP getSTOP() {
        return stop;
    }

    /**
     * Sets the value of the stop property.
     * 
     * @param value
     *     allowed object is
     *     {@link STOPTYP }
     *     
     */
    public void setSTOP(STOPTYP value) {
        this.stop = value;
    }

    /**
     * Gets the value of the timetable property.
     * 
     * @return
     *     possible object is
     *     {@link Timetables }
     *     
     */
    public Timetables getTimetable() {
        return timetable;
    }

    /**
     * Sets the value of the timetable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Timetables }
     *     
     */
    public void setTimetable(Timetables value) {
        this.timetable = value;
    }

    /**
     * Gets the value of the walklink property.
     * 
     * @return
     *     possible object is
     *     {@link WALKLINKTYP }
     *     
     */
    public WALKLINKTYP getWALKLINK() {
        return walklink;
    }

    /**
     * Sets the value of the walklink property.
     * 
     * @param value
     *     allowed object is
     *     {@link WALKLINKTYP }
     *     
     */
    public void setWALKLINK(WALKLINKTYP value) {
        this.walklink = value;
    }

    /**
     * Gets the value of the zon property.
     * 
     * @return
     *     possible object is
     *     {@link ZONTYP }
     *     
     */
    public ZONTYP getZON() {
        return zon;
    }

    /**
     * Sets the value of the zon property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZONTYP }
     *     
     */
    public void setZON(ZONTYP value) {
        this.zon = value;
    }

    /**
     * Gets the value of the zonavst property.
     * 
     * @return
     *     possible object is
     *     {@link ZONAVSTTYP }
     *     
     */
    public ZONAVSTTYP getZONAVST() {
        return zonavst;
    }

    /**
     * Sets the value of the zonavst property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZONAVSTTYP }
     *     
     */
    public void setZONAVST(ZONAVSTTYP value) {
        this.zonavst = value;
    }

    /**
     * Gets the value of the tom property.
     * 
     * @return
     *     possible object is
     *     {@link TOMTYP }
     *     
     */
    public TOMTYP getTOM() {
        return tom;
    }

    /**
     * Sets the value of the tom property.
     * 
     * @param value
     *     allowed object is
     *     {@link TOMTYP }
     *     
     */
    public void setTOM(TOMTYP value) {
        this.tom = value;
    }

    /**
     * Gets the value of the synonyms property.
     * 
     * @return
     *     possible object is
     *     {@link SynonymTYP }
     *     
     */
    public SynonymTYP getSYNONYMS() {
        return synonyms;
    }

    /**
     * Sets the value of the synonyms property.
     * 
     * @param value
     *     allowed object is
     *     {@link SynonymTYP }
     *     
     */
    public void setSYNONYMS(SynonymTYP value) {
        this.synonyms = value;
    }

    /**
     * Gets the value of the actlstlst property.
     * 
     * @return
     *     possible object is
     *     {@link ExportDocType1 .Actlstlst }
     *     
     */
    public ExportDocType1 .Actlstlst getActlstlst() {
        return actlstlst;
    }

    /**
     * Sets the value of the actlstlst property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportDocType1 .Actlstlst }
     *     
     */
    public void setActlstlst(ExportDocType1 .Actlstlst value) {
        this.actlstlst = value;
    }

    /**
     * Gets the value of the hentrep property.
     * 
     * @return
     *     possible object is
     *     {@link ExportDocType1 .Hentrep }
     *     
     */
    public ExportDocType1 .Hentrep getHentrep() {
        return hentrep;
    }

    /**
     * Sets the value of the hentrep property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportDocType1 .Hentrep }
     *     
     */
    public void setHentrep(ExportDocType1 .Hentrep value) {
        this.hentrep = value;
    }

    /**
     * Gets the value of the misc property.
     * 
     * @return
     *     possible object is
     *     {@link ExportDocType1 .Misc }
     *     
     */
    public ExportDocType1 .Misc getMisc() {
        return misc;
    }

    /**
     * Sets the value of the misc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportDocType1 .Misc }
     *     
     */
    public void setMisc(ExportDocType1 .Misc value) {
        this.misc = value;
    }

    /**
     * Gets the value of the samtrafik property.
     * 
     * @return
     *     possible object is
     *     {@link ExportDocType1 .Samtrafik }
     *     
     */
    public ExportDocType1 .Samtrafik getSamtrafik() {
        return samtrafik;
    }

    /**
     * Sets the value of the samtrafik property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportDocType1 .Samtrafik }
     *     
     */
    public void setSamtrafik(ExportDocType1 .Samtrafik value) {
        this.samtrafik = value;
    }

    /**
     * Gets the value of the fordon property.
     * 
     * @return
     *     possible object is
     *     {@link ExportDocType1 .Fordon }
     *     
     */
    public ExportDocType1 .Fordon getFordon() {
        return fordon;
    }

    /**
     * Sets the value of the fordon property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportDocType1 .Fordon }
     *     
     */
    public void setFordon(ExportDocType1 .Fordon value) {
        this.fordon = value;
    }

    /**
     * Gets the value of the statistics property.
     * 
     * @return
     *     possible object is
     *     {@link ExportDocType1 .Statistics }
     *     
     */
    public ExportDocType1 .Statistics getStatistics() {
        return statistics;
    }

    /**
     * Sets the value of the statistics property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportDocType1 .Statistics }
     *     
     */
    public void setStatistics(ExportDocType1 .Statistics value) {
        this.statistics = value;
    }

    /**
     * Konverteringtabell för SYD och MITT
     * 
     * @return
     *     possible object is
     *     {@link HPLKONVTYP }
     *     
     */
    public HPLKONVTYP getHPLKONV() {
        return hplkonv;
    }

    /**
     * Sets the value of the hplkonv property.
     * 
     * @param value
     *     allowed object is
     *     {@link HPLKONVTYP }
     *     
     * @see #getHPLKONV()
     */
    public void setHPLKONV(HPLKONVTYP value) {
        this.hplkonv = value;
    }

    /**
     * Konverteringstabell för SYD och MITT
     * 
     * @return
     *     possible object is
     *     {@link LINKONVTYP }
     *     
     */
    public LINKONVTYP getLINKONV() {
        return linkonv;
    }

    /**
     * Sets the value of the linkonv property.
     * 
     * @param value
     *     allowed object is
     *     {@link LINKONVTYP }
     *     
     * @see #getLINKONV()
     */
    public void setLINKONV(LINKONVTYP value) {
        this.linkonv = value;
    }

    /**
     * Gets the value of the stopPointFeatueDataTypes property.
     * 
     * @return
     *     possible object is
     *     {@link DataTypes }
     *     
     */
    public DataTypes getStopPointFeatueDataTypes() {
        return stopPointFeatueDataTypes;
    }

    /**
     * Sets the value of the stopPointFeatueDataTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataTypes }
     *     
     */
    public void setStopPointFeatueDataTypes(DataTypes value) {
        this.stopPointFeatueDataTypes = value;
    }

    /**
     * Gets the value of the perfotnot property.
     * 
     * @return
     *     possible object is
     *     {@link PERFOTTYP }
     *     
     */
    public PERFOTTYP getPERFOTNOT() {
        return perfotnot;
    }

    /**
     * Sets the value of the perfotnot property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERFOTTYP }
     *     
     */
    public void setPERFOTNOT(PERFOTTYP value) {
        this.perfotnot = value;
    }

    /**
     * Gets the value of the traffotnot property.
     * 
     * @return
     *     possible object is
     *     {@link TRAFFOTTYP }
     *     
     */
    public TRAFFOTTYP getTRAFFOTNOT() {
        return traffotnot;
    }

    /**
     * Sets the value of the traffotnot property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRAFFOTTYP }
     *     
     */
    public void setTRAFFOTNOT(TRAFFOTTYP value) {
        this.traffotnot = value;
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
     *       <sequence>
     *         <element name="Acts" type="{}ACTLST_TYP"/>
     *       </sequence>
     *       <attribute name="RebusVersion" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       <attribute name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "acts"
    })
    public static class Actlstlst {

        @XmlElement(name = "Acts", required = true)
        protected ACTLSTTYP acts;
        @XmlAttribute(name = "RebusVersion")
        @XmlSchemaType(name = "anySimpleType")
        protected String rebusVersion;
        @XmlAttribute(name = "CreatedDate")
        @XmlSchemaType(name = "anySimpleType")
        protected String createdDate;

        /**
         * Gets the value of the acts property.
         * 
         * @return
         *     possible object is
         *     {@link ACTLSTTYP }
         *     
         */
        public ACTLSTTYP getActs() {
            return acts;
        }

        /**
         * Sets the value of the acts property.
         * 
         * @param value
         *     allowed object is
         *     {@link ACTLSTTYP }
         *     
         */
        public void setActs(ACTLSTTYP value) {
            this.acts = value;
        }

        /**
         * Gets the value of the rebusVersion property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRebusVersion() {
            return rebusVersion;
        }

        /**
         * Sets the value of the rebusVersion property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRebusVersion(String value) {
            this.rebusVersion = value;
        }

        /**
         * Gets the value of the createdDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCreatedDate() {
            return createdDate;
        }

        /**
         * Sets the value of the createdDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCreatedDate(String value) {
            this.createdDate = value;
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
     *       <sequence maxOccurs="unbounded">
     *         <element name="FordSpec" type="{}Ford_TYP"/>
     *       </sequence>
     *       <attribute name="RebusVersion" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       <attribute name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fordSpec"
    })
    public static class Fordon {

        @XmlElement(name = "FordSpec", required = true)
        protected List<FordTYP> fordSpec;
        @XmlAttribute(name = "RebusVersion")
        @XmlSchemaType(name = "anySimpleType")
        protected String rebusVersion;
        @XmlAttribute(name = "CreatedDate")
        @XmlSchemaType(name = "anySimpleType")
        protected String createdDate;

        /**
         * Gets the value of the fordSpec property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fordSpec property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getFordSpec().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FordTYP }
         * </p>
         * 
         * 
         * @return
         *     The value of the fordSpec property.
         */
        public List<FordTYP> getFordSpec() {
            if (fordSpec == null) {
                fordSpec = new ArrayList<>();
            }
            return this.fordSpec;
        }

        /**
         * Gets the value of the rebusVersion property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRebusVersion() {
            return rebusVersion;
        }

        /**
         * Sets the value of the rebusVersion property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRebusVersion(String value) {
            this.rebusVersion = value;
        }

        /**
         * Gets the value of the createdDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCreatedDate() {
            return createdDate;
        }

        /**
         * Sets the value of the createdDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCreatedDate(String value) {
            this.createdDate = value;
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
     *       <sequence maxOccurs="unbounded">
     *         <element name="ENTREPRENOR" type="{}Entreprenor_typ"/>
     *       </sequence>
     *       <attribute name="RebusVersion" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       <attribute name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "entreprenor"
    })
    public static class Hentrep {

        @XmlElement(name = "ENTREPRENOR", required = true)
        protected List<EntreprenorTyp> entreprenor;
        @XmlAttribute(name = "RebusVersion")
        @XmlSchemaType(name = "anySimpleType")
        protected String rebusVersion;
        @XmlAttribute(name = "CreatedDate")
        @XmlSchemaType(name = "anySimpleType")
        protected String createdDate;

        /**
         * Gets the value of the entreprenor property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the entreprenor property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getENTREPRENOR().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EntreprenorTyp }
         * </p>
         * 
         * 
         * @return
         *     The value of the entreprenor property.
         */
        public List<EntreprenorTyp> getENTREPRENOR() {
            if (entreprenor == null) {
                entreprenor = new ArrayList<>();
            }
            return this.entreprenor;
        }

        /**
         * Gets the value of the rebusVersion property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRebusVersion() {
            return rebusVersion;
        }

        /**
         * Sets the value of the rebusVersion property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRebusVersion(String value) {
            this.rebusVersion = value;
        }

        /**
         * Gets the value of the createdDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCreatedDate() {
            return createdDate;
        }

        /**
         * Sets the value of the createdDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCreatedDate(String value) {
            this.createdDate = value;
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
     *       <sequence>
     *         <element name="KOMMUN">
     *           <complexType>
     *             <complexContent>
     *               <extension base="{}KOMMUN_TYP">
     *                 <sequence maxOccurs="unbounded">
     *                   <element name="KOMMUNSPEC" type="{}KOMMUNSPEC_TYP"/>
     *                 </sequence>
     *               </extension>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="THM">
     *           <complexType>
     *             <complexContent>
     *               <extension base="{}THM_TYP">
     *                 <sequence maxOccurs="unbounded">
     *                   <element name="THMSPEC" type="{}THMSPEC_TYP"/>
     *                 </sequence>
     *               </extension>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="Linjenatstyper">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence maxOccurs="unbounded">
     *                   <element name="LINJENATSTYP" type="{}LINJENATSTYPSPEC_TYP"/>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="Linjetyper">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence maxOccurs="unbounded">
     *                   <element name="LINJETYP" type="{}LINJETYPSPEC_TYP"/>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="NAMN" type="{}NAMN_TYP"/>
     *         <element name="DEST" type="{}DEST_TYP"/>
     *         <element name="DESTALL" type="{}DEST_TYP"/>
     *         <element name="Avtal">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence maxOccurs="unbounded" minOccurs="0">
     *                   <element name="AVTAL" type="{}AVTALSPEC_TYP"/>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="Taxetyp">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence maxOccurs="unbounded" minOccurs="0">
     *                   <element name="TAXETYP" type="{}TAXETYPSPEC_TYP"/>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="AdressMultipel" type="{}AdressMultipel_TYP"/>
     *         <element name="TRAFIKTYP" type="{}TRAFIKTYP_TYP"/>
     *         <element name="BorderPoints">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence maxOccurs="unbounded">
     *                   <element name="BorderPoint">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="BorderPointSPEC" type="{}BorderPointSPEC_TYP"/>
     *                           </sequence>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *       </sequence>
     *       <attribute name="RebusVersion" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       <attribute name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "kommun",
        "thm",
        "linjenatstyper",
        "linjetyper",
        "namn",
        "dest",
        "destall",
        "avtal",
        "taxetyp",
        "adressMultipel",
        "trafiktyp",
        "borderPoints"
    })
    public static class Misc {

        @XmlElement(name = "KOMMUN", required = true)
        protected ExportDocType1 .Misc.KOMMUN kommun;
        @XmlElement(name = "THM", required = true)
        protected ExportDocType1 .Misc.THM thm;
        @XmlElement(name = "Linjenatstyper", required = true)
        protected ExportDocType1 .Misc.Linjenatstyper linjenatstyper;
        @XmlElement(name = "Linjetyper", required = true)
        protected ExportDocType1 .Misc.Linjetyper linjetyper;
        @XmlElement(name = "NAMN", required = true)
        protected NAMNTYP namn;
        @XmlElement(name = "DEST", required = true)
        protected DESTTYP dest;
        @XmlElement(name = "DESTALL", required = true)
        protected DESTTYP destall;
        @XmlElement(name = "Avtal", required = true)
        protected ExportDocType1 .Misc.Avtal avtal;
        @XmlElement(name = "Taxetyp", required = true)
        protected ExportDocType1 .Misc.Taxetyp taxetyp;
        @XmlElement(name = "AdressMultipel", required = true)
        protected AdressMultipelTYP adressMultipel;
        @XmlElement(name = "TRAFIKTYP", required = true)
        protected TRAFIKTYPTYP trafiktyp;
        @XmlElement(name = "BorderPoints", required = true)
        protected ExportDocType1 .Misc.BorderPoints borderPoints;
        @XmlAttribute(name = "RebusVersion")
        @XmlSchemaType(name = "anySimpleType")
        protected String rebusVersion;
        @XmlAttribute(name = "CreatedDate")
        @XmlSchemaType(name = "anySimpleType")
        protected String createdDate;

        /**
         * Gets the value of the kommun property.
         * 
         * @return
         *     possible object is
         *     {@link ExportDocType1 .Misc.KOMMUN }
         *     
         */
        public ExportDocType1 .Misc.KOMMUN getKOMMUN() {
            return kommun;
        }

        /**
         * Sets the value of the kommun property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExportDocType1 .Misc.KOMMUN }
         *     
         */
        public void setKOMMUN(ExportDocType1 .Misc.KOMMUN value) {
            this.kommun = value;
        }

        /**
         * Gets the value of the thm property.
         * 
         * @return
         *     possible object is
         *     {@link ExportDocType1 .Misc.THM }
         *     
         */
        public ExportDocType1 .Misc.THM getTHM() {
            return thm;
        }

        /**
         * Sets the value of the thm property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExportDocType1 .Misc.THM }
         *     
         */
        public void setTHM(ExportDocType1 .Misc.THM value) {
            this.thm = value;
        }

        /**
         * Gets the value of the linjenatstyper property.
         * 
         * @return
         *     possible object is
         *     {@link ExportDocType1 .Misc.Linjenatstyper }
         *     
         */
        public ExportDocType1 .Misc.Linjenatstyper getLinjenatstyper() {
            return linjenatstyper;
        }

        /**
         * Sets the value of the linjenatstyper property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExportDocType1 .Misc.Linjenatstyper }
         *     
         */
        public void setLinjenatstyper(ExportDocType1 .Misc.Linjenatstyper value) {
            this.linjenatstyper = value;
        }

        /**
         * Gets the value of the linjetyper property.
         * 
         * @return
         *     possible object is
         *     {@link ExportDocType1 .Misc.Linjetyper }
         *     
         */
        public ExportDocType1 .Misc.Linjetyper getLinjetyper() {
            return linjetyper;
        }

        /**
         * Sets the value of the linjetyper property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExportDocType1 .Misc.Linjetyper }
         *     
         */
        public void setLinjetyper(ExportDocType1 .Misc.Linjetyper value) {
            this.linjetyper = value;
        }

        /**
         * Gets the value of the namn property.
         * 
         * @return
         *     possible object is
         *     {@link NAMNTYP }
         *     
         */
        public NAMNTYP getNAMN() {
            return namn;
        }

        /**
         * Sets the value of the namn property.
         * 
         * @param value
         *     allowed object is
         *     {@link NAMNTYP }
         *     
         */
        public void setNAMN(NAMNTYP value) {
            this.namn = value;
        }

        /**
         * Gets the value of the dest property.
         * 
         * @return
         *     possible object is
         *     {@link DESTTYP }
         *     
         */
        public DESTTYP getDEST() {
            return dest;
        }

        /**
         * Sets the value of the dest property.
         * 
         * @param value
         *     allowed object is
         *     {@link DESTTYP }
         *     
         */
        public void setDEST(DESTTYP value) {
            this.dest = value;
        }

        /**
         * Gets the value of the destall property.
         * 
         * @return
         *     possible object is
         *     {@link DESTTYP }
         *     
         */
        public DESTTYP getDESTALL() {
            return destall;
        }

        /**
         * Sets the value of the destall property.
         * 
         * @param value
         *     allowed object is
         *     {@link DESTTYP }
         *     
         */
        public void setDESTALL(DESTTYP value) {
            this.destall = value;
        }

        /**
         * Gets the value of the avtal property.
         * 
         * @return
         *     possible object is
         *     {@link ExportDocType1 .Misc.Avtal }
         *     
         */
        public ExportDocType1 .Misc.Avtal getAvtal() {
            return avtal;
        }

        /**
         * Sets the value of the avtal property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExportDocType1 .Misc.Avtal }
         *     
         */
        public void setAvtal(ExportDocType1 .Misc.Avtal value) {
            this.avtal = value;
        }

        /**
         * Gets the value of the taxetyp property.
         * 
         * @return
         *     possible object is
         *     {@link ExportDocType1 .Misc.Taxetyp }
         *     
         */
        public ExportDocType1 .Misc.Taxetyp getTaxetyp() {
            return taxetyp;
        }

        /**
         * Sets the value of the taxetyp property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExportDocType1 .Misc.Taxetyp }
         *     
         */
        public void setTaxetyp(ExportDocType1 .Misc.Taxetyp value) {
            this.taxetyp = value;
        }

        /**
         * Gets the value of the adressMultipel property.
         * 
         * @return
         *     possible object is
         *     {@link AdressMultipelTYP }
         *     
         */
        public AdressMultipelTYP getAdressMultipel() {
            return adressMultipel;
        }

        /**
         * Sets the value of the adressMultipel property.
         * 
         * @param value
         *     allowed object is
         *     {@link AdressMultipelTYP }
         *     
         */
        public void setAdressMultipel(AdressMultipelTYP value) {
            this.adressMultipel = value;
        }

        /**
         * Gets the value of the trafiktyp property.
         * 
         * @return
         *     possible object is
         *     {@link TRAFIKTYPTYP }
         *     
         */
        public TRAFIKTYPTYP getTRAFIKTYP() {
            return trafiktyp;
        }

        /**
         * Sets the value of the trafiktyp property.
         * 
         * @param value
         *     allowed object is
         *     {@link TRAFIKTYPTYP }
         *     
         */
        public void setTRAFIKTYP(TRAFIKTYPTYP value) {
            this.trafiktyp = value;
        }

        /**
         * Gets the value of the borderPoints property.
         * 
         * @return
         *     possible object is
         *     {@link ExportDocType1 .Misc.BorderPoints }
         *     
         */
        public ExportDocType1 .Misc.BorderPoints getBorderPoints() {
            return borderPoints;
        }

        /**
         * Sets the value of the borderPoints property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExportDocType1 .Misc.BorderPoints }
         *     
         */
        public void setBorderPoints(ExportDocType1 .Misc.BorderPoints value) {
            this.borderPoints = value;
        }

        /**
         * Gets the value of the rebusVersion property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRebusVersion() {
            return rebusVersion;
        }

        /**
         * Sets the value of the rebusVersion property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRebusVersion(String value) {
            this.rebusVersion = value;
        }

        /**
         * Gets the value of the createdDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCreatedDate() {
            return createdDate;
        }

        /**
         * Sets the value of the createdDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCreatedDate(String value) {
            this.createdDate = value;
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
         *         <element name="AVTAL" type="{}AVTALSPEC_TYP"/>
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
            "avtal"
        })
        public static class Avtal {

            @XmlElement(name = "AVTAL")
            protected List<AVTALSPECTYP> avtal;

            /**
             * Gets the value of the avtal property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the avtal property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getAVTAL().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AVTALSPECTYP }
             * </p>
             * 
             * 
             * @return
             *     The value of the avtal property.
             */
            public List<AVTALSPECTYP> getAVTAL() {
                if (avtal == null) {
                    avtal = new ArrayList<>();
                }
                return this.avtal;
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
         *       <sequence maxOccurs="unbounded">
         *         <element name="BorderPoint">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="BorderPointSPEC" type="{}BorderPointSPEC_TYP"/>
         *                 </sequence>
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
            "borderPoint"
        })
        public static class BorderPoints {

            @XmlElement(name = "BorderPoint", required = true)
            protected List<ExportDocType1 .Misc.BorderPoints.BorderPoint> borderPoint;

            /**
             * Gets the value of the borderPoint property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the borderPoint property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getBorderPoint().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ExportDocType1 .Misc.BorderPoints.BorderPoint }
             * </p>
             * 
             * 
             * @return
             *     The value of the borderPoint property.
             */
            public List<ExportDocType1 .Misc.BorderPoints.BorderPoint> getBorderPoint() {
                if (borderPoint == null) {
                    borderPoint = new ArrayList<>();
                }
                return this.borderPoint;
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
             *       <sequence>
             *         <element name="BorderPointSPEC" type="{}BorderPointSPEC_TYP"/>
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
                "borderPointSPEC"
            })
            public static class BorderPoint {

                @XmlElement(name = "BorderPointSPEC", required = true)
                protected BorderPointSPECTYP borderPointSPEC;

                /**
                 * Gets the value of the borderPointSPEC property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BorderPointSPECTYP }
                 *     
                 */
                public BorderPointSPECTYP getBorderPointSPEC() {
                    return borderPointSPEC;
                }

                /**
                 * Sets the value of the borderPointSPEC property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BorderPointSPECTYP }
                 *     
                 */
                public void setBorderPointSPEC(BorderPointSPECTYP value) {
                    this.borderPointSPEC = value;
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
         *     <extension base="{}KOMMUN_TYP">
         *       <sequence maxOccurs="unbounded">
         *         <element name="KOMMUNSPEC" type="{}KOMMUNSPEC_TYP"/>
         *       </sequence>
         *     </extension>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "kommunspec"
        })
        public static class KOMMUN
            extends KOMMUNTYP
        {

            @XmlElement(name = "KOMMUNSPEC", required = true)
            protected List<KOMMUNSPECTYP> kommunspec;

            /**
             * Gets the value of the kommunspec property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the kommunspec property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getKOMMUNSPEC().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link KOMMUNSPECTYP }
             * </p>
             * 
             * 
             * @return
             *     The value of the kommunspec property.
             */
            public List<KOMMUNSPECTYP> getKOMMUNSPEC() {
                if (kommunspec == null) {
                    kommunspec = new ArrayList<>();
                }
                return this.kommunspec;
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
         *       <sequence maxOccurs="unbounded">
         *         <element name="LINJENATSTYP" type="{}LINJENATSTYPSPEC_TYP"/>
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
            "linjenatstyp"
        })
        public static class Linjenatstyper {

            @XmlElement(name = "LINJENATSTYP", required = true)
            protected List<LINJENATSTYPSPECTYP> linjenatstyp;

            /**
             * Gets the value of the linjenatstyp property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the linjenatstyp property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getLINJENATSTYP().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link LINJENATSTYPSPECTYP }
             * </p>
             * 
             * 
             * @return
             *     The value of the linjenatstyp property.
             */
            public List<LINJENATSTYPSPECTYP> getLINJENATSTYP() {
                if (linjenatstyp == null) {
                    linjenatstyp = new ArrayList<>();
                }
                return this.linjenatstyp;
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
         *       <sequence maxOccurs="unbounded">
         *         <element name="LINJETYP" type="{}LINJETYPSPEC_TYP"/>
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
            "linjetyp"
        })
        public static class Linjetyper {

            @XmlElement(name = "LINJETYP", required = true)
            protected List<LINJETYPSPECTYP> linjetyp;

            /**
             * Gets the value of the linjetyp property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the linjetyp property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getLINJETYP().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link LINJETYPSPECTYP }
             * </p>
             * 
             * 
             * @return
             *     The value of the linjetyp property.
             */
            public List<LINJETYPSPECTYP> getLINJETYP() {
                if (linjetyp == null) {
                    linjetyp = new ArrayList<>();
                }
                return this.linjetyp;
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
         *         <element name="TAXETYP" type="{}TAXETYPSPEC_TYP"/>
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
            "taxetyp"
        })
        public static class Taxetyp {

            @XmlElement(name = "TAXETYP")
            protected List<TAXETYPSPECTYP> taxetyp;

            /**
             * Gets the value of the taxetyp property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the taxetyp property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getTAXETYP().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TAXETYPSPECTYP }
             * </p>
             * 
             * 
             * @return
             *     The value of the taxetyp property.
             */
            public List<TAXETYPSPECTYP> getTAXETYP() {
                if (taxetyp == null) {
                    taxetyp = new ArrayList<>();
                }
                return this.taxetyp;
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
         *     <extension base="{}THM_TYP">
         *       <sequence maxOccurs="unbounded">
         *         <element name="THMSPEC" type="{}THMSPEC_TYP"/>
         *       </sequence>
         *     </extension>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "thmspec"
        })
        public static class THM
            extends THMTYP
        {

            @XmlElement(name = "THMSPEC", required = true)
            protected List<THMSPECTYP> thmspec;

            /**
             * Gets the value of the thmspec property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the thmspec property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getTHMSPEC().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link THMSPECTYP }
             * </p>
             * 
             * 
             * @return
             *     The value of the thmspec property.
             */
            public List<THMSPECTYP> getTHMSPEC() {
                if (thmspec == null) {
                    thmspec = new ArrayList<>();
                }
                return this.thmspec;
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
     *       <sequence>
     *         <element name="SamtrafikregelTOT">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence maxOccurs="unbounded">
     *                   <element name="SAMTRAFIKREGELSPEC" type="{}SAMTRAFIKREGELSPEC_TYP"/>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="SAMTRAFIKREGEL" type="{}SAMTRAFIKREGEL_TYP"/>
     *         <element name="SAMTRAFIKRESULT" type="{}SAMTRAFIKRESULT_TYP"/>
     *       </sequence>
     *       <attribute name="RebusVersion" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       <attribute name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "samtrafikregelTOT",
        "samtrafikregel",
        "samtrafikresult"
    })
    public static class Samtrafik {

        /**
         * Innehåller samtlig samtrafik oavsett urval
         * 
         */
        @XmlElement(name = "SamtrafikregelTOT", required = true)
        protected ExportDocType1 .Samtrafik.SamtrafikregelTOT samtrafikregelTOT;
        /**
         * Innehåller enbart urvalets samtrafik
         * 
         */
        @XmlElement(name = "SAMTRAFIKREGEL", required = true)
        protected SAMTRAFIKREGELTYP samtrafikregel;
        @XmlElement(name = "SAMTRAFIKRESULT", required = true)
        protected SAMTRAFIKRESULTTYP samtrafikresult;
        @XmlAttribute(name = "RebusVersion")
        @XmlSchemaType(name = "anySimpleType")
        protected String rebusVersion;
        @XmlAttribute(name = "CreatedDate")
        @XmlSchemaType(name = "anySimpleType")
        protected String createdDate;

        /**
         * Innehåller samtlig samtrafik oavsett urval
         * 
         * @return
         *     possible object is
         *     {@link ExportDocType1 .Samtrafik.SamtrafikregelTOT }
         *     
         */
        public ExportDocType1 .Samtrafik.SamtrafikregelTOT getSamtrafikregelTOT() {
            return samtrafikregelTOT;
        }

        /**
         * Sets the value of the samtrafikregelTOT property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExportDocType1 .Samtrafik.SamtrafikregelTOT }
         *     
         * @see #getSamtrafikregelTOT()
         */
        public void setSamtrafikregelTOT(ExportDocType1 .Samtrafik.SamtrafikregelTOT value) {
            this.samtrafikregelTOT = value;
        }

        /**
         * Innehåller enbart urvalets samtrafik
         * 
         * @return
         *     possible object is
         *     {@link SAMTRAFIKREGELTYP }
         *     
         */
        public SAMTRAFIKREGELTYP getSAMTRAFIKREGEL() {
            return samtrafikregel;
        }

        /**
         * Sets the value of the samtrafikregel property.
         * 
         * @param value
         *     allowed object is
         *     {@link SAMTRAFIKREGELTYP }
         *     
         * @see #getSAMTRAFIKREGEL()
         */
        public void setSAMTRAFIKREGEL(SAMTRAFIKREGELTYP value) {
            this.samtrafikregel = value;
        }

        /**
         * Gets the value of the samtrafikresult property.
         * 
         * @return
         *     possible object is
         *     {@link SAMTRAFIKRESULTTYP }
         *     
         */
        public SAMTRAFIKRESULTTYP getSAMTRAFIKRESULT() {
            return samtrafikresult;
        }

        /**
         * Sets the value of the samtrafikresult property.
         * 
         * @param value
         *     allowed object is
         *     {@link SAMTRAFIKRESULTTYP }
         *     
         */
        public void setSAMTRAFIKRESULT(SAMTRAFIKRESULTTYP value) {
            this.samtrafikresult = value;
        }

        /**
         * Gets the value of the rebusVersion property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRebusVersion() {
            return rebusVersion;
        }

        /**
         * Sets the value of the rebusVersion property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRebusVersion(String value) {
            this.rebusVersion = value;
        }

        /**
         * Gets the value of the createdDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCreatedDate() {
            return createdDate;
        }

        /**
         * Sets the value of the createdDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCreatedDate(String value) {
            this.createdDate = value;
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
         *         <element name="SAMTRAFIKREGELSPEC" type="{}SAMTRAFIKREGELSPEC_TYP"/>
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
            "samtrafikregelspec"
        })
        public static class SamtrafikregelTOT {

            @XmlElement(name = "SAMTRAFIKREGELSPEC", required = true)
            protected List<SAMTRAFIKREGELSPECTYP> samtrafikregelspec;

            /**
             * Gets the value of the samtrafikregelspec property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the samtrafikregelspec property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getSAMTRAFIKREGELSPEC().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SAMTRAFIKREGELSPECTYP }
             * </p>
             * 
             * 
             * @return
             *     The value of the samtrafikregelspec property.
             */
            public List<SAMTRAFIKREGELSPECTYP> getSAMTRAFIKREGELSPEC() {
                if (samtrafikregelspec == null) {
                    samtrafikregelspec = new ArrayList<>();
                }
                return this.samtrafikregelspec;
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
     *       <sequence>
     *         <element name="NoStoparea" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         <element name="NoStopPoints" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         <element name="NoOfDays" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         <element name="NoTrips" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         <element name="NoLines" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         <element name="NoActivities" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         <element name="NoConnectedTraffic" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         <element name="NoFootnotes" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         <element name="NoPeriods" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         <element name="NoWalklinks" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         <element name="NoVehicles" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         <element name="NoEmptyRuns" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         <element name="NoMunicipalities" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         <element name="NoLinetypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         <element name="NoLinNatTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         <element name="NoNames" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         <element name="NoDestinations" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         <element name="NoContracts" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         <element name="NoTaxtypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         <element name="NoTraffictypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *       </sequence>
     *       <attribute name="RebusVersion" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       <attribute name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "noStoparea",
        "noStopPoints",
        "noOfDays",
        "noTrips",
        "noLines",
        "noActivities",
        "noConnectedTraffic",
        "noFootnotes",
        "noPeriods",
        "noWalklinks",
        "noVehicles",
        "noEmptyRuns",
        "noMunicipalities",
        "noLinetypes",
        "noLinNatTypes",
        "noNames",
        "noDestinations",
        "noContracts",
        "noTaxtypes",
        "noTraffictypes"
    })
    public static class Statistics {

        @XmlElement(name = "NoStoparea")
        protected int noStoparea;
        @XmlElement(name = "NoStopPoints")
        protected int noStopPoints;
        @XmlElement(name = "NoOfDays")
        protected int noOfDays;
        @XmlElement(name = "NoTrips")
        protected int noTrips;
        @XmlElement(name = "NoLines")
        protected int noLines;
        @XmlElement(name = "NoActivities")
        protected int noActivities;
        @XmlElement(name = "NoConnectedTraffic")
        protected int noConnectedTraffic;
        @XmlElement(name = "NoFootnotes")
        protected int noFootnotes;
        @XmlElement(name = "NoPeriods")
        protected int noPeriods;
        @XmlElement(name = "NoWalklinks")
        protected int noWalklinks;
        @XmlElement(name = "NoVehicles")
        protected int noVehicles;
        @XmlElement(name = "NoEmptyRuns")
        protected int noEmptyRuns;
        @XmlElement(name = "NoMunicipalities")
        protected int noMunicipalities;
        @XmlElement(name = "NoLinetypes")
        protected int noLinetypes;
        @XmlElement(name = "NoLinNatTypes")
        protected int noLinNatTypes;
        @XmlElement(name = "NoNames")
        protected int noNames;
        @XmlElement(name = "NoDestinations")
        protected int noDestinations;
        @XmlElement(name = "NoContracts")
        protected int noContracts;
        @XmlElement(name = "NoTaxtypes")
        protected int noTaxtypes;
        @XmlElement(name = "NoTraffictypes")
        protected int noTraffictypes;
        @XmlAttribute(name = "RebusVersion")
        @XmlSchemaType(name = "anySimpleType")
        protected String rebusVersion;
        @XmlAttribute(name = "CreatedDate")
        @XmlSchemaType(name = "anySimpleType")
        protected String createdDate;

        /**
         * Gets the value of the noStoparea property.
         * 
         */
        public int getNoStoparea() {
            return noStoparea;
        }

        /**
         * Sets the value of the noStoparea property.
         * 
         */
        public void setNoStoparea(int value) {
            this.noStoparea = value;
        }

        /**
         * Gets the value of the noStopPoints property.
         * 
         */
        public int getNoStopPoints() {
            return noStopPoints;
        }

        /**
         * Sets the value of the noStopPoints property.
         * 
         */
        public void setNoStopPoints(int value) {
            this.noStopPoints = value;
        }

        /**
         * Gets the value of the noOfDays property.
         * 
         */
        public int getNoOfDays() {
            return noOfDays;
        }

        /**
         * Sets the value of the noOfDays property.
         * 
         */
        public void setNoOfDays(int value) {
            this.noOfDays = value;
        }

        /**
         * Gets the value of the noTrips property.
         * 
         */
        public int getNoTrips() {
            return noTrips;
        }

        /**
         * Sets the value of the noTrips property.
         * 
         */
        public void setNoTrips(int value) {
            this.noTrips = value;
        }

        /**
         * Gets the value of the noLines property.
         * 
         */
        public int getNoLines() {
            return noLines;
        }

        /**
         * Sets the value of the noLines property.
         * 
         */
        public void setNoLines(int value) {
            this.noLines = value;
        }

        /**
         * Gets the value of the noActivities property.
         * 
         */
        public int getNoActivities() {
            return noActivities;
        }

        /**
         * Sets the value of the noActivities property.
         * 
         */
        public void setNoActivities(int value) {
            this.noActivities = value;
        }

        /**
         * Gets the value of the noConnectedTraffic property.
         * 
         */
        public int getNoConnectedTraffic() {
            return noConnectedTraffic;
        }

        /**
         * Sets the value of the noConnectedTraffic property.
         * 
         */
        public void setNoConnectedTraffic(int value) {
            this.noConnectedTraffic = value;
        }

        /**
         * Gets the value of the noFootnotes property.
         * 
         */
        public int getNoFootnotes() {
            return noFootnotes;
        }

        /**
         * Sets the value of the noFootnotes property.
         * 
         */
        public void setNoFootnotes(int value) {
            this.noFootnotes = value;
        }

        /**
         * Gets the value of the noPeriods property.
         * 
         */
        public int getNoPeriods() {
            return noPeriods;
        }

        /**
         * Sets the value of the noPeriods property.
         * 
         */
        public void setNoPeriods(int value) {
            this.noPeriods = value;
        }

        /**
         * Gets the value of the noWalklinks property.
         * 
         */
        public int getNoWalklinks() {
            return noWalklinks;
        }

        /**
         * Sets the value of the noWalklinks property.
         * 
         */
        public void setNoWalklinks(int value) {
            this.noWalklinks = value;
        }

        /**
         * Gets the value of the noVehicles property.
         * 
         */
        public int getNoVehicles() {
            return noVehicles;
        }

        /**
         * Sets the value of the noVehicles property.
         * 
         */
        public void setNoVehicles(int value) {
            this.noVehicles = value;
        }

        /**
         * Gets the value of the noEmptyRuns property.
         * 
         */
        public int getNoEmptyRuns() {
            return noEmptyRuns;
        }

        /**
         * Sets the value of the noEmptyRuns property.
         * 
         */
        public void setNoEmptyRuns(int value) {
            this.noEmptyRuns = value;
        }

        /**
         * Gets the value of the noMunicipalities property.
         * 
         */
        public int getNoMunicipalities() {
            return noMunicipalities;
        }

        /**
         * Sets the value of the noMunicipalities property.
         * 
         */
        public void setNoMunicipalities(int value) {
            this.noMunicipalities = value;
        }

        /**
         * Gets the value of the noLinetypes property.
         * 
         */
        public int getNoLinetypes() {
            return noLinetypes;
        }

        /**
         * Sets the value of the noLinetypes property.
         * 
         */
        public void setNoLinetypes(int value) {
            this.noLinetypes = value;
        }

        /**
         * Gets the value of the noLinNatTypes property.
         * 
         */
        public int getNoLinNatTypes() {
            return noLinNatTypes;
        }

        /**
         * Sets the value of the noLinNatTypes property.
         * 
         */
        public void setNoLinNatTypes(int value) {
            this.noLinNatTypes = value;
        }

        /**
         * Gets the value of the noNames property.
         * 
         */
        public int getNoNames() {
            return noNames;
        }

        /**
         * Sets the value of the noNames property.
         * 
         */
        public void setNoNames(int value) {
            this.noNames = value;
        }

        /**
         * Gets the value of the noDestinations property.
         * 
         */
        public int getNoDestinations() {
            return noDestinations;
        }

        /**
         * Sets the value of the noDestinations property.
         * 
         */
        public void setNoDestinations(int value) {
            this.noDestinations = value;
        }

        /**
         * Gets the value of the noContracts property.
         * 
         */
        public int getNoContracts() {
            return noContracts;
        }

        /**
         * Sets the value of the noContracts property.
         * 
         */
        public void setNoContracts(int value) {
            this.noContracts = value;
        }

        /**
         * Gets the value of the noTaxtypes property.
         * 
         */
        public int getNoTaxtypes() {
            return noTaxtypes;
        }

        /**
         * Sets the value of the noTaxtypes property.
         * 
         */
        public void setNoTaxtypes(int value) {
            this.noTaxtypes = value;
        }

        /**
         * Gets the value of the noTraffictypes property.
         * 
         */
        public int getNoTraffictypes() {
            return noTraffictypes;
        }

        /**
         * Sets the value of the noTraffictypes property.
         * 
         */
        public void setNoTraffictypes(int value) {
            this.noTraffictypes = value;
        }

        /**
         * Gets the value of the rebusVersion property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRebusVersion() {
            return rebusVersion;
        }

        /**
         * Sets the value of the rebusVersion property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRebusVersion(String value) {
            this.rebusVersion = value;
        }

        /**
         * Gets the value of the createdDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCreatedDate() {
            return createdDate;
        }

        /**
         * Sets the value of the createdDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCreatedDate(String value) {
            this.createdDate = value;
        }

    }

}
