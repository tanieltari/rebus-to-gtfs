
package com.ridango.rebus2gtfs.rebus;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NAMNSPEC_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="NAMNSPEC_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="namnkod">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               <minInclusive value="-2147483648"/>
 *               <maxInclusive value="2147483647"/>
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
 *         <element name="namntext">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="10"/>
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
@XmlType(name = "NAMNSPEC_TYP", propOrder = {
    "namnkod",
    "extnr",
    "extnr2",
    "talkod",
    "namntext"
})
public class NAMNSPECTYP {

    protected int namnkod;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer extnr;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer extnr2;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer talkod;
    @XmlElement(required = true, nillable = true)
    protected String namntext;

    /**
     * Gets the value of the namnkod property.
     * 
     */
    public int getNamnkod() {
        return namnkod;
    }

    /**
     * Sets the value of the namnkod property.
     * 
     */
    public void setNamnkod(int value) {
        this.namnkod = value;
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
     * Gets the value of the namntext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamntext() {
        return namntext;
    }

    /**
     * Sets the value of the namntext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamntext(String value) {
        this.namntext = value;
    }

}
