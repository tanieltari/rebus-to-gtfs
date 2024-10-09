
package com.ridango.rebus2gtfs.rebus;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OMRSPEC_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OMRSPEC_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="omrid">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="6"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="namnland">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="24"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="namnstad">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="24"/>
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
@XmlType(name = "OMRSPEC_TYP", propOrder = {
    "omrid",
    "namnland",
    "namnstad"
})
public class OMRSPECTYP {

    @XmlElement(required = true)
    protected String omrid;
    @XmlElement(required = true, nillable = true)
    protected String namnland;
    @XmlElement(required = true, nillable = true)
    protected String namnstad;

    /**
     * Gets the value of the omrid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOmrid() {
        return omrid;
    }

    /**
     * Sets the value of the omrid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOmrid(String value) {
        this.omrid = value;
    }

    /**
     * Gets the value of the namnland property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamnland() {
        return namnland;
    }

    /**
     * Sets the value of the namnland property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamnland(String value) {
        this.namnland = value;
    }

    /**
     * Gets the value of the namnstad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamnstad() {
        return namnstad;
    }

    /**
     * Sets the value of the namnstad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamnstad(String value) {
        this.namnstad = value;
    }

}
