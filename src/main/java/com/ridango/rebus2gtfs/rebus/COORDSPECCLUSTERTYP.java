
package com.ridango.rebus2gtfs.rebus;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COORDSPECCLUSTER_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="COORDSPECCLUSTER_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Northing" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="Easting" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="CoordinateSystemNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COORDSPECCLUSTER_TYP", propOrder = {
    "northing",
    "easting",
    "sequence",
    "coordinateSystemNumber"
})
public class COORDSPECCLUSTERTYP {

    @XmlElement(name = "Northing")
    protected double northing;
    @XmlElement(name = "Easting")
    protected double easting;
    @XmlElement(name = "Sequence")
    protected int sequence;
    @XmlElement(name = "CoordinateSystemNumber")
    protected int coordinateSystemNumber;

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

    /**
     * Gets the value of the sequence property.
     * 
     */
    public int getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     */
    public void setSequence(int value) {
        this.sequence = value;
    }

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

}
