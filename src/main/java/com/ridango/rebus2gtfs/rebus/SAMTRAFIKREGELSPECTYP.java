
package com.ridango.rebus2gtfs.rebus;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SAMTRAFIKREGELSPEC_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SAMTRAFIKREGELSPEC_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="flinje">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               <minInclusive value="-2147483648"/>
 *               <maxInclusive value="2147483647"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="frikt">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               <minInclusive value="-32768"/>
 *               <maxInclusive value="32767"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="tlinje">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               <minInclusive value="-2147483648"/>
 *               <maxInclusive value="2147483647"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="trikt">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               <minInclusive value="-32768"/>
 *               <maxInclusive value="32767"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="hplnr">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               <minInclusive value="-2147483648"/>
 *               <maxInclusive value="2147483647"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="ftid">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               <minInclusive value="-2147483648"/>
 *               <maxInclusive value="2147483647"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="ttid">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               <minInclusive value="-2147483648"/>
 *               <maxInclusive value="2147483647"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="vtid">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               <minInclusive value="-2147483648"/>
 *               <maxInclusive value="2147483647"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="minvtid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="bytesmarg" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="minutdiff" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="dagtyp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="hplnr2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="FromThm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="ToThm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="ContinuingVehicle" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="FromDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="ToDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SAMTRAFIKREGELSPEC_TYP", propOrder = {
    "flinje",
    "frikt",
    "tlinje",
    "trikt",
    "hplnr",
    "ftid",
    "ttid",
    "vtid",
    "minvtid",
    "bytesmarg",
    "minutdiff",
    "dagtyp",
    "hplnr2",
    "fromThm",
    "toThm",
    "continuingVehicle",
    "fromDate",
    "toDate"
})
public class SAMTRAFIKREGELSPECTYP {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer flinje;
    @XmlElement(required = true, type = Short.class, nillable = true)
    protected Short frikt;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer tlinje;
    @XmlElement(required = true, type = Short.class, nillable = true)
    protected Short trikt;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer hplnr;
    /**
     * fråntid i klockslagsformat tex 0400
     * 
     */
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer ftid;
    /**
     * Tilltid
     * 
     */
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer ttid;
    /**
     * Max Väntetid i minuter
     * 
     */
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer vtid;
    /**
     * Min väntetid i minuter
     * 
     */
    protected int minvtid;
    protected int bytesmarg;
    protected int minutdiff;
    @XmlElement(required = true)
    protected String dagtyp;
    protected int hplnr2;
    @XmlElement(name = "FromThm", required = true)
    protected String fromThm;
    @XmlElement(name = "ToThm", required = true)
    protected String toThm;
    /**
     * Is set to true when the same vehicle is continuing on the connecting line, i.e. the trips are in the same block.
     * 
     */
    @XmlElement(name = "ContinuingVehicle")
    protected boolean continuingVehicle;
    @XmlElement(name = "FromDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fromDate;
    @XmlElement(name = "ToDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar toDate;

    /**
     * Gets the value of the flinje property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFlinje() {
        return flinje;
    }

    /**
     * Sets the value of the flinje property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFlinje(Integer value) {
        this.flinje = value;
    }

    /**
     * Gets the value of the frikt property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getFrikt() {
        return frikt;
    }

    /**
     * Sets the value of the frikt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setFrikt(Short value) {
        this.frikt = value;
    }

    /**
     * Gets the value of the tlinje property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTlinje() {
        return tlinje;
    }

    /**
     * Sets the value of the tlinje property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTlinje(Integer value) {
        this.tlinje = value;
    }

    /**
     * Gets the value of the trikt property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getTrikt() {
        return trikt;
    }

    /**
     * Sets the value of the trikt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setTrikt(Short value) {
        this.trikt = value;
    }

    /**
     * Gets the value of the hplnr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHplnr() {
        return hplnr;
    }

    /**
     * Sets the value of the hplnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHplnr(Integer value) {
        this.hplnr = value;
    }

    /**
     * fråntid i klockslagsformat tex 0400
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFtid() {
        return ftid;
    }

    /**
     * Sets the value of the ftid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getFtid()
     */
    public void setFtid(Integer value) {
        this.ftid = value;
    }

    /**
     * Tilltid
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTtid() {
        return ttid;
    }

    /**
     * Sets the value of the ttid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getTtid()
     */
    public void setTtid(Integer value) {
        this.ttid = value;
    }

    /**
     * Max Väntetid i minuter
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVtid() {
        return vtid;
    }

    /**
     * Sets the value of the vtid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getVtid()
     */
    public void setVtid(Integer value) {
        this.vtid = value;
    }

    /**
     * Min väntetid i minuter
     * 
     */
    public int getMinvtid() {
        return minvtid;
    }

    /**
     * Sets the value of the minvtid property.
     * 
     */
    public void setMinvtid(int value) {
        this.minvtid = value;
    }

    /**
     * Gets the value of the bytesmarg property.
     * 
     */
    public int getBytesmarg() {
        return bytesmarg;
    }

    /**
     * Sets the value of the bytesmarg property.
     * 
     */
    public void setBytesmarg(int value) {
        this.bytesmarg = value;
    }

    /**
     * Gets the value of the minutdiff property.
     * 
     */
    public int getMinutdiff() {
        return minutdiff;
    }

    /**
     * Sets the value of the minutdiff property.
     * 
     */
    public void setMinutdiff(int value) {
        this.minutdiff = value;
    }

    /**
     * Gets the value of the dagtyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDagtyp() {
        return dagtyp;
    }

    /**
     * Sets the value of the dagtyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDagtyp(String value) {
        this.dagtyp = value;
    }

    /**
     * Gets the value of the hplnr2 property.
     * 
     */
    public int getHplnr2() {
        return hplnr2;
    }

    /**
     * Sets the value of the hplnr2 property.
     * 
     */
    public void setHplnr2(int value) {
        this.hplnr2 = value;
    }

    /**
     * Gets the value of the fromThm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromThm() {
        return fromThm;
    }

    /**
     * Sets the value of the fromThm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromThm(String value) {
        this.fromThm = value;
    }

    /**
     * Gets the value of the toThm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToThm() {
        return toThm;
    }

    /**
     * Sets the value of the toThm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToThm(String value) {
        this.toThm = value;
    }

    /**
     * Is set to true when the same vehicle is continuing on the connecting line, i.e. the trips are in the same block.
     * 
     */
    public boolean isContinuingVehicle() {
        return continuingVehicle;
    }

    /**
     * Sets the value of the continuingVehicle property.
     * 
     */
    public void setContinuingVehicle(boolean value) {
        this.continuingVehicle = value;
    }

    /**
     * Gets the value of the fromDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFromDate() {
        return fromDate;
    }

    /**
     * Sets the value of the fromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFromDate(XMLGregorianCalendar value) {
        this.fromDate = value;
    }

    /**
     * Gets the value of the toDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getToDate() {
        return toDate;
    }

    /**
     * Sets the value of the toDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setToDate(XMLGregorianCalendar value) {
        this.toDate = value;
    }

}
