
package com.ridango.rebus2gtfs.rebus;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TRAFFICSPEC_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TRAFFICSPEC_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="tp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="TPInd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="TabperId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="tptext" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="TabId">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               <minInclusive value="-2147483648"/>
 *               <maxInclusive value="2147483647"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="linje">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               <minInclusive value="-2147483648"/>
 *               <maxInclusive value="2147483647"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="rikt">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               <minInclusive value="-32768"/>
 *               <maxInclusive value="32767"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="status" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="radio">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               <minInclusive value="-32768"/>
 *               <maxInclusive value="32767"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="alias">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="16"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="linjetyp">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="24"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="nattyp">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="24"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="rtab">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="80"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="via">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="80"/>
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
 *         <element name="thmnr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="linjerubrik">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="80"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="TabAnm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Talkod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="TransportModeType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="TransportModeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="EntrepID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="EntrepKod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="EntrepNamn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <sequence>
 *           <element name="Trips" type="{}TRIP_TYP"/>
 *         </sequence>
 *         <sequence>
 *           <element name="LinjeUnion" type="{}LINJEUNION_TYP"/>
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
@XmlType(name = "TRAFFICSPEC_TYP", propOrder = {
    "tp",
    "tpInd",
    "tabperId",
    "tptext",
    "tabId",
    "linje",
    "rikt",
    "status",
    "radio",
    "alias",
    "linjetyp",
    "nattyp",
    "rtab",
    "via",
    "thm",
    "thmnr",
    "linjerubrik",
    "tabAnm",
    "talkod",
    "transportModeType",
    "transportModeName",
    "entrepID",
    "entrepKod",
    "entrepNamn",
    "trips",
    "linjeUnion"
})
public class TRAFFICSPECTYP {

    protected int tp;
    @XmlElement(name = "TPInd")
    protected int tpInd;
    @XmlElement(name = "TabperId")
    protected int tabperId;
    @XmlElement(required = true)
    protected String tptext;
    @XmlElement(name = "TabId")
    protected int tabId;
    protected int linje;
    protected short rikt;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean status;
    @XmlElement(required = true, type = Short.class, nillable = true)
    protected Short radio;
    @XmlElement(required = true, nillable = true)
    protected String alias;
    @XmlElement(required = true, nillable = true)
    protected String linjetyp;
    @XmlElement(required = true, nillable = true)
    protected String nattyp;
    @XmlElement(required = true, nillable = true)
    protected String rtab;
    @XmlElement(required = true, nillable = true)
    protected String via;
    @XmlElement(required = true, nillable = true)
    protected String thm;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer thmnr;
    @XmlElement(required = true, nillable = true)
    protected String linjerubrik;
    @XmlElement(name = "TabAnm", required = true)
    protected String tabAnm;
    @XmlElement(name = "Talkod")
    protected int talkod;
    @XmlElement(name = "TransportModeType")
    protected int transportModeType;
    @XmlElement(name = "TransportModeName", required = true)
    protected String transportModeName;
    @XmlElement(name = "EntrepID")
    protected int entrepID;
    @XmlElement(name = "EntrepKod", required = true)
    protected String entrepKod;
    @XmlElement(name = "EntrepNamn", required = true)
    protected String entrepNamn;
    @XmlElement(name = "Trips", required = true)
    protected TRIPTYP trips;
    @XmlElement(name = "LinjeUnion", required = true)
    protected LINJEUNIONTYP linjeUnion;

    /**
     * Gets the value of the tp property.
     * 
     */
    public int getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     */
    public void setTp(int value) {
        this.tp = value;
    }

    /**
     * Gets the value of the tpInd property.
     * 
     */
    public int getTPInd() {
        return tpInd;
    }

    /**
     * Sets the value of the tpInd property.
     * 
     */
    public void setTPInd(int value) {
        this.tpInd = value;
    }

    /**
     * Gets the value of the tabperId property.
     * 
     */
    public int getTabperId() {
        return tabperId;
    }

    /**
     * Sets the value of the tabperId property.
     * 
     */
    public void setTabperId(int value) {
        this.tabperId = value;
    }

    /**
     * Gets the value of the tptext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTptext() {
        return tptext;
    }

    /**
     * Sets the value of the tptext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTptext(String value) {
        this.tptext = value;
    }

    /**
     * Gets the value of the tabId property.
     * 
     */
    public int getTabId() {
        return tabId;
    }

    /**
     * Sets the value of the tabId property.
     * 
     */
    public void setTabId(int value) {
        this.tabId = value;
    }

    /**
     * Gets the value of the linje property.
     * 
     */
    public int getLinje() {
        return linje;
    }

    /**
     * Sets the value of the linje property.
     * 
     */
    public void setLinje(int value) {
        this.linje = value;
    }

    /**
     * Gets the value of the rikt property.
     * 
     */
    public short getRikt() {
        return rikt;
    }

    /**
     * Sets the value of the rikt property.
     * 
     */
    public void setRikt(short value) {
        this.rikt = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatus(Boolean value) {
        this.status = value;
    }

    /**
     * Gets the value of the radio property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getRadio() {
        return radio;
    }

    /**
     * Sets the value of the radio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setRadio(Short value) {
        this.radio = value;
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
     * Gets the value of the linjetyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinjetyp() {
        return linjetyp;
    }

    /**
     * Sets the value of the linjetyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinjetyp(String value) {
        this.linjetyp = value;
    }

    /**
     * Gets the value of the nattyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNattyp() {
        return nattyp;
    }

    /**
     * Sets the value of the nattyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNattyp(String value) {
        this.nattyp = value;
    }

    /**
     * Gets the value of the rtab property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRtab() {
        return rtab;
    }

    /**
     * Sets the value of the rtab property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRtab(String value) {
        this.rtab = value;
    }

    /**
     * Gets the value of the via property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVia() {
        return via;
    }

    /**
     * Sets the value of the via property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVia(String value) {
        this.via = value;
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
     * Gets the value of the thmnr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getThmnr() {
        return thmnr;
    }

    /**
     * Sets the value of the thmnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setThmnr(Integer value) {
        this.thmnr = value;
    }

    /**
     * Gets the value of the linjerubrik property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinjerubrik() {
        return linjerubrik;
    }

    /**
     * Sets the value of the linjerubrik property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinjerubrik(String value) {
        this.linjerubrik = value;
    }

    /**
     * Gets the value of the tabAnm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTabAnm() {
        return tabAnm;
    }

    /**
     * Sets the value of the tabAnm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTabAnm(String value) {
        this.tabAnm = value;
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
     * Gets the value of the transportModeType property.
     * 
     */
    public int getTransportModeType() {
        return transportModeType;
    }

    /**
     * Sets the value of the transportModeType property.
     * 
     */
    public void setTransportModeType(int value) {
        this.transportModeType = value;
    }

    /**
     * Gets the value of the transportModeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportModeName() {
        return transportModeName;
    }

    /**
     * Sets the value of the transportModeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportModeName(String value) {
        this.transportModeName = value;
    }

    /**
     * Gets the value of the entrepID property.
     * 
     */
    public int getEntrepID() {
        return entrepID;
    }

    /**
     * Sets the value of the entrepID property.
     * 
     */
    public void setEntrepID(int value) {
        this.entrepID = value;
    }

    /**
     * Gets the value of the entrepKod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntrepKod() {
        return entrepKod;
    }

    /**
     * Sets the value of the entrepKod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntrepKod(String value) {
        this.entrepKod = value;
    }

    /**
     * Gets the value of the entrepNamn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntrepNamn() {
        return entrepNamn;
    }

    /**
     * Sets the value of the entrepNamn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntrepNamn(String value) {
        this.entrepNamn = value;
    }

    /**
     * Gets the value of the trips property.
     * 
     * @return
     *     possible object is
     *     {@link TRIPTYP }
     *     
     */
    public TRIPTYP getTrips() {
        return trips;
    }

    /**
     * Sets the value of the trips property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRIPTYP }
     *     
     */
    public void setTrips(TRIPTYP value) {
        this.trips = value;
    }

    /**
     * Gets the value of the linjeUnion property.
     * 
     * @return
     *     possible object is
     *     {@link LINJEUNIONTYP }
     *     
     */
    public LINJEUNIONTYP getLinjeUnion() {
        return linjeUnion;
    }

    /**
     * Sets the value of the linjeUnion property.
     * 
     * @param value
     *     allowed object is
     *     {@link LINJEUNIONTYP }
     *     
     */
    public void setLinjeUnion(LINJEUNIONTYP value) {
        this.linjeUnion = value;
    }

}
