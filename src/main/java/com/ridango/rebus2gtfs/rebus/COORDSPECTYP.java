
package com.ridango.rebus2gtfs.rebus;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COORDSPEC_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="COORDSPEC_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CoordinateSystemNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="CoordinateSystemName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Current" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="Northing" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="Easting" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COORDSPEC_TYP", propOrder = {
    "coordinateSystemNumber",
    "coordinateSystemName",
    "current",
    "northing",
    "easting"
})
public class COORDSPECTYP {

    @XmlElement(name = "CoordinateSystemNumber")
    protected int coordinateSystemNumber;
    @XmlElement(name = "CoordinateSystemName", required = true)
    protected String coordinateSystemName;
    @XmlElement(name = "Current")
    protected boolean current;
    @XmlElement(name = "Northing")
    protected double northing;
    @XmlElement(name = "Easting")
    protected double easting;

    /**
     * Gets the value of the coordinateSystemNumber property.
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
     * Gets the value of the current property.
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

    /**
     * Gets the value of the northing property.
     * 
     */
    public double getNorthing() {
        return northing;
    }

    /**
     * Sets the value of the northing property.
     * 
     */
    public void setNorthing(double value) {
        this.northing = value;
    }

    /**
     * Gets the value of the easting property.
     * 
     */
    public double getEasting() {
        return easting;
    }

    /**
     * Sets the value of the easting property.
     * 
     */
    public void setEasting(double value) {
        this.easting = value;
    }

}
