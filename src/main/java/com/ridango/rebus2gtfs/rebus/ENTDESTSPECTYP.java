
package com.ridango.rebus2gtfs.rebus;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ENTDESTSPEC_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ENTDESTSPEC_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="entkod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="extnr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENTDESTSPEC_TYP", propOrder = {
    "entkod",
    "extnr"
})
public class ENTDESTSPECTYP {

    @XmlElement(required = true)
    protected String entkod;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer extnr;

    /**
     * Gets the value of the entkod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntkod() {
        return entkod;
    }

    /**
     * Sets the value of the entkod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntkod(String value) {
        this.entkod = value;
    }

    /**
     * Gets the value of the extnr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExtnr() {
        return extnr;
    }

    /**
     * Sets the value of the extnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExtnr(Integer value) {
        this.extnr = value;
    }

}
