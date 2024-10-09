
package com.ridango.rebus2gtfs.rebus;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KONV complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="KONV">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HPLKONV" type="{}HPLKONV_TYP"/>
 *         <element name="LINKONV" type="{}LINKONV_TYP"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KONV", propOrder = {
    "hplkonv",
    "linkonv"
})
public class KONV {

    @XmlElement(name = "HPLKONV", required = true)
    protected HPLKONVTYP hplkonv;
    @XmlElement(name = "LINKONV", required = true)
    protected LINKONVTYP linkonv;

    /**
     * Gets the value of the hplkonv property.
     * 
     * @return
     *     possible object is
     *     {@link HPLKONVTYP }
     *     
     */
    public HPLKONVTYP getHPLKONV() {
        return hplkonv;
    }

    /**
     * Sets the value of the hplkonv property.
     * 
     * @param value
     *     allowed object is
     *     {@link HPLKONVTYP }
     *     
     */
    public void setHPLKONV(HPLKONVTYP value) {
        this.hplkonv = value;
    }

    /**
     * Gets the value of the linkonv property.
     * 
     * @return
     *     possible object is
     *     {@link LINKONVTYP }
     *     
     */
    public LINKONVTYP getLINKONV() {
        return linkonv;
    }

    /**
     * Sets the value of the linkonv property.
     * 
     * @param value
     *     allowed object is
     *     {@link LINKONVTYP }
     *     
     */
    public void setLINKONV(LINKONVTYP value) {
        this.linkonv = value;
    }

}
