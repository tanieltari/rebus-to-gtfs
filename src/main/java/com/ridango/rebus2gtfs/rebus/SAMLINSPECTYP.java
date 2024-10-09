
package com.ridango.rebus2gtfs.rebus;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SAMLINSPEC_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SAMLINSPEC_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="thm">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               <minInclusive value="-32768"/>
 *               <maxInclusive value="32767"/>
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
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte">
 *               <minInclusive value="0"/>
 *               <maxInclusive value="255"/>
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
 *         <element name="hplnamn">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="24"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="frantill">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="1"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="seq">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               <minInclusive value="-32768"/>
 *               <maxInclusive value="32767"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="tp">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               <minInclusive value="-32768"/>
 *               <maxInclusive value="32767"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="hpllage">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="8"/>
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
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SAMLINSPEC_TYP", propOrder = {
    "thm",
    "linje",
    "rikt",
    "hplnr",
    "hplnamn",
    "frantill",
    "seq",
    "tp",
    "hpllage",
    "hpltyp"
})
public class SAMLINSPECTYP {

    @XmlElement(required = true, type = Short.class, nillable = true)
    protected Short thm;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer linje;
    @XmlElement(required = true, type = Short.class, nillable = true)
    protected Short rikt;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer hplnr;
    @XmlElement(required = true, nillable = true)
    protected String hplnamn;
    @XmlElement(required = true, nillable = true)
    protected String frantill;
    @XmlElement(required = true, type = Short.class, nillable = true)
    protected Short seq;
    @XmlElement(required = true, type = Short.class, nillable = true)
    protected Short tp;
    @XmlElement(required = true, nillable = true)
    protected String hpllage;
    @XmlElement(required = true, nillable = true)
    protected String hpltyp;

    /**
     * Gets the value of the thm property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getThm() {
        return thm;
    }

    /**
     * Sets the value of the thm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setThm(Short value) {
        this.thm = value;
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
     * Gets the value of the rikt property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getRikt() {
        return rikt;
    }

    /**
     * Sets the value of the rikt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setRikt(Short value) {
        this.rikt = value;
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
     * Gets the value of the hplnamn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHplnamn() {
        return hplnamn;
    }

    /**
     * Sets the value of the hplnamn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHplnamn(String value) {
        this.hplnamn = value;
    }

    /**
     * Gets the value of the frantill property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrantill() {
        return frantill;
    }

    /**
     * Sets the value of the frantill property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrantill(String value) {
        this.frantill = value;
    }

    /**
     * Gets the value of the seq property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getSeq() {
        return seq;
    }

    /**
     * Sets the value of the seq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setSeq(Short value) {
        this.seq = value;
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
     * Gets the value of the hpllage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHpllage() {
        return hpllage;
    }

    /**
     * Sets the value of the hpllage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHpllage(String value) {
        this.hpllage = value;
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

}
