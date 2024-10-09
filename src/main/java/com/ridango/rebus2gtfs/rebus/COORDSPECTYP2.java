
package com.ridango.rebus2gtfs.rebus;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COORDSPEC_TYP2 complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="COORDSPEC_TYP2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CoordinateSystemNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="CoordinateSystemName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Current" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COORDSPEC_TYP2", propOrder = {
    "coordinateSystemNumber",
    "coordinateSystemName",
    "current"
})
public class COORDSPECTYP2 {

    /**
     * Contains  a list of the different Coordinatesystems in the actual export
     * 
     */
    @XmlElement(name = "CoordinateSystemNumber")
    protected int coordinateSystemNumber;
    @XmlElement(name = "CoordinateSystemName", required = true)
    protected String coordinateSystemName;
    /**
     * True if the coordinatesystem is the used by the Traffic company
     * 
     */
    @XmlElement(name = "Current")
    protected boolean current;

    /**
     * Contains  a list of the different Coordinatesystems in the actual export
     * 
     */
    public int getCoordinateSystemNumber() {
        return coordinateSystemNumber;
    }

    /**
     * Sets the value of the coordinateSystemNumber property.
     * 
     */
    public void setCoordinateSystemNumber(int value) {
        this.coordinateSystemNumber = value;
    }

    /**
     * Gets the value of the coordinateSystemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoordinateSystemName() {
        return coordinateSystemName;
    }

    /**
     * Sets the value of the coordinateSystemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoordinateSystemName(String value) {
        this.coordinateSystemName = value;
    }

    /**
     * True if the coordinatesystem is the used by the Traffic company
     * 
     */
    public boolean isCurrent() {
        return current;
    }

    /**
     * Sets the value of the current property.
     * 
     */
    public void setCurrent(boolean value) {
        this.current = value;
    }

}
