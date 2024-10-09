
package com.ridango.rebus2gtfs.rebus;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for STOLPE_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="STOLPE_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="stolpe">
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
@XmlType(name = "STOLPE_TYP", propOrder = {
    "stolpe"
})
public class STOLPETYP {

    @XmlElement(required = true)
    protected String stolpe;

    /**
     * Gets the value of the stolpe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStolpe() {
        return stolpe;
    }

    /**
     * Sets the value of the stolpe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStolpe(String value) {
        this.stolpe = value;
    }

}
