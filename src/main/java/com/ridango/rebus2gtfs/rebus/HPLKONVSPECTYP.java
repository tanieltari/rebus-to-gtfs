
package com.ridango.rebus2gtfs.rebus;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HPLKONVSPEC_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HPLKONVSPEC_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Hpltyp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Hplnam" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="iss">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               <minInclusive value="-2147483648"/>
 *               <maxInclusive value="2147483647"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="Hplnr">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               <minInclusive value="-2147483648"/>
 *               <maxInclusive value="2147483647"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="Rsimnr">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               <minInclusive value="-2147483648"/>
 *               <maxInclusive value="2147483647"/>
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
@XmlType(name = "HPLKONVSPEC_TYP", propOrder = {
    "hpltyp",
    "hplnam",
    "iss",
    "hplnr",
    "rsimnr"
})
public class HPLKONVSPECTYP {

    @XmlElement(name = "Hpltyp", required = true)
    protected String hpltyp;
    @XmlElement(name = "Hplnam", required = true)
    protected String hplnam;
    protected int iss;
    @XmlElement(name = "Hplnr")
    protected int hplnr;
    @XmlElement(name = "Rsimnr")
    protected int rsimnr;

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
     * Gets the value of the iss property.
     * 
     */
    public int getIss() {
        return iss;
    }

    /**
     * Sets the value of the iss property.
     * 
     */
    public void setIss(int value) {
        this.iss = value;
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
     * Gets the value of the rsimnr property.
     * 
     */
    public int getRsimnr() {
        return rsimnr;
    }

    /**
     * Sets the value of the rsimnr property.
     * 
     */
    public void setRsimnr(int value) {
        this.rsimnr = value;
    }

}
