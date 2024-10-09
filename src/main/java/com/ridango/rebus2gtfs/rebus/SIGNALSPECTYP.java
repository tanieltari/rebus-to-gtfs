
package com.ridango.rebus2gtfs.rebus;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SIGNALSPEC_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SIGNALSPEC_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="actlistID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="korsid">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               <minInclusive value="-2147483648"/>
 *               <maxInclusive value="2147483647"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="KorsningsExternNummer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="tp">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               <minInclusive value="-32768"/>
 *               <maxInclusive value="32767"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="tpind" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="linje">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               <minInclusive value="-2147483648"/>
 *               <maxInclusive value="2147483647"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="hplnr1">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               <minInclusive value="-2147483648"/>
 *               <maxInclusive value="2147483647"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="lage1">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="8"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="hplnr2">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               <minInclusive value="-2147483648"/>
 *               <maxInclusive value="2147483647"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="lage2">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="8"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="prioritetskod">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               <minInclusive value="-2147483648"/>
 *               <maxInclusive value="2147483647"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="pa">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               <minInclusive value="-2147483648"/>
 *               <maxInclusive value="2147483647"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="av">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               <minInclusive value="-2147483648"/>
 *               <maxInclusive value="2147483647"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="pre">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               <minInclusive value="-2147483648"/>
 *               <maxInclusive value="2147483647"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="Municipality" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SIGNALSPEC_TYP", propOrder = {
    "actlistID",
    "korsid",
    "korsningsExternNummer",
    "tp",
    "tpind",
    "linje",
    "hplnr1",
    "lage1",
    "hplnr2",
    "lage2",
    "prioritetskod",
    "pa",
    "av",
    "pre",
    "municipality"
})
public class SIGNALSPECTYP {

    protected int actlistID;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer korsid;
    @XmlElement(name = "KorsningsExternNummer")
    protected int korsningsExternNummer;
    @XmlElement(required = true, type = Short.class, nillable = true)
    protected Short tp;
    protected int tpind;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer linje;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer hplnr1;
    @XmlElement(required = true, nillable = true)
    protected String lage1;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer hplnr2;
    @XmlElement(required = true, nillable = true)
    protected String lage2;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer prioritetskod;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer pa;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer av;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer pre;
    @XmlElement(name = "Municipality")
    protected int municipality;

    /**
     * Gets the value of the actlistID property.
     * 
     */
    public int getActlistID() {
        return actlistID;
    }

    /**
     * Sets the value of the actlistID property.
     * 
     */
    public void setActlistID(int value) {
        this.actlistID = value;
    }

    /**
     * Gets the value of the korsid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKorsid() {
        return korsid;
    }

    /**
     * Sets the value of the korsid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKorsid(Integer value) {
        this.korsid = value;
    }

    /**
     * Gets the value of the korsningsExternNummer property.
     * 
     */
    public int getKorsningsExternNummer() {
        return korsningsExternNummer;
    }

    /**
     * Sets the value of the korsningsExternNummer property.
     * 
     */
    public void setKorsningsExternNummer(int value) {
        this.korsningsExternNummer = value;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setTp(Short value) {
        this.tp = value;
    }

    /**
     * Gets the value of the tpind property.
     * 
     */
    public int getTpind() {
        return tpind;
    }

    /**
     * Sets the value of the tpind property.
     * 
     */
    public void setTpind(int value) {
        this.tpind = value;
    }

    /**
     * Gets the value of the linje property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLinje() {
        return linje;
    }

    /**
     * Sets the value of the linje property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLinje(Integer value) {
        this.linje = value;
    }

    /**
     * Gets the value of the hplnr1 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHplnr1() {
        return hplnr1;
    }

    /**
     * Sets the value of the hplnr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHplnr1(Integer value) {
        this.hplnr1 = value;
    }

    /**
     * Gets the value of the lage1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLage1() {
        return lage1;
    }

    /**
     * Sets the value of the lage1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLage1(String value) {
        this.lage1 = value;
    }

    /**
     * Gets the value of the hplnr2 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHplnr2() {
        return hplnr2;
    }

    /**
     * Sets the value of the hplnr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHplnr2(Integer value) {
        this.hplnr2 = value;
    }

    /**
     * Gets the value of the lage2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLage2() {
        return lage2;
    }

    /**
     * Sets the value of the lage2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLage2(String value) {
        this.lage2 = value;
    }

    /**
     * Gets the value of the prioritetskod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrioritetskod() {
        return prioritetskod;
    }

    /**
     * Sets the value of the prioritetskod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrioritetskod(Integer value) {
        this.prioritetskod = value;
    }

    /**
     * Gets the value of the pa property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPa() {
        return pa;
    }

    /**
     * Sets the value of the pa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPa(Integer value) {
        this.pa = value;
    }

    /**
     * Gets the value of the av property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAv() {
        return av;
    }

    /**
     * Sets the value of the av property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAv(Integer value) {
        this.av = value;
    }

    /**
     * Gets the value of the pre property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPre() {
        return pre;
    }

    /**
     * Sets the value of the pre property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPre(Integer value) {
        this.pre = value;
    }

    /**
     * Gets the value of the municipality property.
     * 
     */
    public int getMunicipality() {
        return municipality;
    }

    /**
     * Sets the value of the municipality property.
     * 
     */
    public void setMunicipality(int value) {
        this.municipality = value;
    }

}
