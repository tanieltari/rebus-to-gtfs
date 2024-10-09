
package com.ridango.rebus2gtfs.rebus;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HPLANMSPEC_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HPLANMSPEC_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="hplnr">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               <minInclusive value="-2147483648"/>
 *               <maxInclusive value="2147483647"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="anm">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="255"/>
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
@XmlType(name = "HPLANMSPEC_TYP", propOrder = {
    "hplnr",
    "anm"
})
public class HPLANMSPECTYP {

    protected int hplnr;
    @XmlElement(required = true, nillable = true)
    protected String anm;

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
     * Gets the value of the anm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnm() {
        return anm;
    }

    /**
     * Sets the value of the anm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnm(String value) {
        this.anm = value;
    }

}
