
package com.ridango.rebus2gtfs.rebus;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LINJENATSTYP_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="LINJENATSTYP_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="LINJENATSTYPSPEC" type="{}LINJENATSTYPSPEC_TYP"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LINJENATSTYP_TYP", propOrder = {
    "linjenatstypspec"
})
public class LINJENATSTYPTYP {

    @XmlElement(name = "LINJENATSTYPSPEC", required = true)
    protected LINJENATSTYPSPECTYP linjenatstypspec;

    /**
     * Gets the value of the linjenatstypspec property.
     * 
     * @return
     *     possible object is
     *     {@link LINJENATSTYPSPECTYP }
     *     
     */
    public LINJENATSTYPSPECTYP getLINJENATSTYPSPEC() {
        return linjenatstypspec;
    }

    /**
     * Sets the value of the linjenatstypspec property.
     * 
     * @param value
     *     allowed object is
     *     {@link LINJENATSTYPSPECTYP }
     *     
     */
    public void setLINJENATSTYPSPEC(LINJENATSTYPSPECTYP value) {
        this.linjenatstypspec = value;
    }

}
