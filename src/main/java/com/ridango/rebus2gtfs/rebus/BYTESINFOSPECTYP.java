
package com.ridango.rebus2gtfs.rebus;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BYTESINFOSPEC_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="BYTESINFOSPEC_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="tp">
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
 *         <element name="variant1">
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
 *         <element name="bytesinfo">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="50"/>
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
@XmlType(name = "BYTESINFOSPEC_TYP", propOrder = {
    "tp",
    "linje",
    "variant1",
    "hplnr",
    "bytesinfo"
})
public class BYTESINFOSPECTYP {

    @XmlElement(required = true, type = Short.class, nillable = true)
    protected Short tp;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer linje;
    @XmlElement(required = true, type = Short.class, nillable = true)
    protected Short variant1;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer hplnr;
    @XmlElement(required = true, nillable = true)
    protected String bytesinfo;

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
     * Gets the value of the variant1 property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getVariant1() {
        return variant1;
    }

    /**
     * Sets the value of the variant1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setVariant1(Short value) {
        this.variant1 = value;
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
     * Gets the value of the bytesinfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBytesinfo() {
        return bytesinfo;
    }

    /**
     * Sets the value of the bytesinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBytesinfo(String value) {
        this.bytesinfo = value;
    }

}
