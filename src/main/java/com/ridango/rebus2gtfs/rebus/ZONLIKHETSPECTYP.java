
package com.ridango.rebus2gtfs.rebus;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZONLIKHETSPEC_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ZONLIKHETSPEC_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Ltyp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="zonalias" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZONLIKHETSPEC_TYP", propOrder = {
    "ltyp",
    "zonalias"
})
public class ZONLIKHETSPECTYP {

    @XmlElement(name = "Ltyp", required = true, nillable = true)
    protected String ltyp;
    protected int zonalias;

    /**
     * Gets the value of the ltyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLtyp() {
        return ltyp;
    }

    /**
     * Sets the value of the ltyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLtyp(String value) {
        this.ltyp = value;
    }

    /**
     * Gets the value of the zonalias property.
     * 
     */
    public int getZonalias() {
        return zonalias;
    }

    /**
     * Sets the value of the zonalias property.
     * 
     */
    public void setZonalias(int value) {
        this.zonalias = value;
    }

}
