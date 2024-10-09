
package com.ridango.rebus2gtfs.rebus;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LINJEUNIONSPEC_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="LINJEUNIONSPEC_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ynhpl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="hplnr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="hpllage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="vsek" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LINJEUNIONSPEC_TYP", propOrder = {
    "ynhpl",
    "hplnr",
    "hpllage",
    "vsek"
})
public class LINJEUNIONSPECTYP {

    /**
     * Innehåller strängen Y eller N
     * 
     */
    @XmlElement(required = true, nillable = true)
    protected String ynhpl;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer hplnr;
    @XmlElement(required = true, nillable = true)
    protected String hpllage;
    @XmlElement(required = true, type = Short.class, nillable = true)
    protected Short vsek;

    /**
     * Innehåller strängen Y eller N
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYnhpl() {
        return ynhpl;
    }

    /**
     * Sets the value of the ynhpl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getYnhpl()
     */
    public void setYnhpl(String value) {
        this.ynhpl = value;
    }

    /**
     * Gets the value of the hplnr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHplnr() {
        return hplnr;
    }

    /**
     * Sets the value of the hplnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHplnr(Integer value) {
        this.hplnr = value;
    }

    /**
     * Gets the value of the hpllage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHpllage() {
        return hpllage;
    }

    /**
     * Sets the value of the hpllage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHpllage(String value) {
        this.hpllage = value;
    }

    /**
     * Gets the value of the vsek property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getVsek() {
        return vsek;
    }

    /**
     * Sets the value of the vsek property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setVsek(Short value) {
        this.vsek = value;
    }

}
