
package com.ridango.rebus2gtfs.rebus;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DESTSPEC_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DESTSPEC_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="destkod">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               <minInclusive value="-2147483648"/>
 *               <maxInclusive value="2147483647"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="desttext">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="64"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="desttext16">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="16"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="extnr">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               <minInclusive value="-2147483648"/>
 *               <maxInclusive value="2147483647"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="extnr2">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               <minInclusive value="-2147483648"/>
 *               <maxInclusive value="2147483647"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="talkod">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               <minInclusive value="-2147483648"/>
 *               <maxInclusive value="2147483647"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="thm">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               <minInclusive value="-2147483648"/>
 *               <maxInclusive value="2147483647"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="Entre" type="{}ENTDEST_TYP"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DESTSPEC_TYP", propOrder = {
    "destkod",
    "desttext",
    "desttext16",
    "extnr",
    "extnr2",
    "talkod",
    "thm",
    "entre"
})
public class DESTSPECTYP {

    protected int destkod;
    @XmlElement(required = true, nillable = true)
    protected String desttext;
    @XmlElement(required = true, nillable = true)
    protected String desttext16;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer extnr;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer extnr2;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer talkod;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer thm;
    @XmlElement(name = "Entre", required = true)
    protected ENTDESTTYP entre;

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
     * Gets the value of the desttext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesttext() {
        return desttext;
    }

    /**
     * Sets the value of the desttext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesttext(String value) {
        this.desttext = value;
    }

    /**
     * Gets the value of the desttext16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesttext16() {
        return desttext16;
    }

    /**
     * Sets the value of the desttext16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesttext16(String value) {
        this.desttext16 = value;
    }

    /**
     * Gets the value of the extnr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExtnr() {
        return extnr;
    }

    /**
     * Sets the value of the extnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExtnr(Integer value) {
        this.extnr = value;
    }

    /**
     * Gets the value of the extnr2 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExtnr2() {
        return extnr2;
    }

    /**
     * Sets the value of the extnr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExtnr2(Integer value) {
        this.extnr2 = value;
    }

    /**
     * Gets the value of the talkod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTalkod() {
        return talkod;
    }

    /**
     * Sets the value of the talkod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTalkod(Integer value) {
        this.talkod = value;
    }

    /**
     * Gets the value of the thm property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getThm() {
        return thm;
    }

    /**
     * Sets the value of the thm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setThm(Integer value) {
        this.thm = value;
    }

    /**
     * Gets the value of the entre property.
     * 
     * @return
     *     possible object is
     *     {@link ENTDESTTYP }
     *     
     */
    public ENTDESTTYP getEntre() {
        return entre;
    }

    /**
     * Sets the value of the entre property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENTDESTTYP }
     *     
     */
    public void setEntre(ENTDESTTYP value) {
        this.entre = value;
    }

}
