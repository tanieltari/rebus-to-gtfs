
package com.ridango.rebus2gtfs.rebus;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SKAP_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SKAP_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="skap">
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
@XmlType(name = "SKAP_TYP", propOrder = {
    "skap"
})
public class SKAPTYP {

    @XmlElement(required = true)
    protected String skap;

    /**
     * Gets the value of the skap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkap() {
        return skap;
    }

    /**
     * Sets the value of the skap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkap(String value) {
        this.skap = value;
    }

}
