
package com.ridango.rebus2gtfs.rebus;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdressMultipelSPEC_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AdressMultipelSPEC_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MultipelID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Multipel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Ort">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="40"/>
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
@XmlType(name = "AdressMultipelSPEC_TYP", propOrder = {
    "multipelID",
    "multipel",
    "ort"
})
public class AdressMultipelSPECTYP {

    @XmlElement(name = "MultipelID")
    protected int multipelID;
    @XmlElement(name = "Multipel")
    protected int multipel;
    @XmlElement(name = "Ort", required = true, nillable = true)
    protected String ort;

    /**
     * Gets the value of the multipelID property.
     * 
     */
    public int getMultipelID() {
        return multipelID;
    }

    /**
     * Sets the value of the multipelID property.
     * 
     */
    public void setMultipelID(int value) {
        this.multipelID = value;
    }

    /**
     * Gets the value of the multipel property.
     * 
     */
    public int getMultipel() {
        return multipel;
    }

    /**
     * Sets the value of the multipel property.
     * 
     */
    public void setMultipel(int value) {
        this.multipel = value;
    }

    /**
     * Gets the value of the ort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrt() {
        return ort;
    }

    /**
     * Sets the value of the ort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrt(String value) {
        this.ort = value;
    }

}
