
package com.ridango.rebus2gtfs.rebus;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ACTLSTOLD_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ACTLSTOLD_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence minOccurs="0">
 *         <element name="OMSKYLTTYP" type="{}OMSKYLT_TYP"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACTLSTOLD_TYP", propOrder = {
    "omskylttyp"
})
public class ACTLSTOLDTYP {

    @XmlElement(name = "OMSKYLTTYP")
    protected OMSKYLTTYP omskylttyp;

    /**
     * Gets the value of the omskylttyp property.
     * 
     * @return
     *     possible object is
     *     {@link OMSKYLTTYP }
     *     
     */
    public OMSKYLTTYP getOMSKYLTTYP() {
        return omskylttyp;
    }

    /**
     * Sets the value of the omskylttyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OMSKYLTTYP }
     *     
     */
    public void setOMSKYLTTYP(OMSKYLTTYP value) {
        this.omskylttyp = value;
    }

}
