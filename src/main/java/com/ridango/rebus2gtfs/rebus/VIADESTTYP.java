
package com.ridango.rebus2gtfs.rebus;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VIADEST_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VIADEST_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ViaDestkod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="FK_DestID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Sekv" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="PTmeanSecDest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Destkod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Destination" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Dest16" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Thm" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VIADEST_TYP", propOrder = {
    "viaDestkod",
    "fkDestID",
    "sekv",
    "pTmeanSecDest",
    "destkod",
    "destination",
    "dest16",
    "thm"
})
public class VIADESTTYP {

    @XmlElement(name = "ViaDestkod", required = true)
    protected String viaDestkod;
    @XmlElement(name = "FK_DestID")
    protected int fkDestID;
    @XmlElement(name = "Sekv")
    protected int sekv;
    @XmlElement(name = "PTmeanSecDest")
    protected int pTmeanSecDest;
    @XmlElement(name = "Destkod", required = true)
    protected String destkod;
    @XmlElement(name = "Destination", required = true)
    protected String destination;
    @XmlElement(name = "Dest16", required = true)
    protected String dest16;
    @XmlElement(name = "Thm")
    protected int thm;

    /**
     * Gets the value of the viaDestkod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViaDestkod() {
        return viaDestkod;
    }

    /**
     * Sets the value of the viaDestkod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViaDestkod(String value) {
        this.viaDestkod = value;
    }

    /**
     * Gets the value of the fkDestID property.
     * 
     */
    public int getFKDestID() {
        return fkDestID;
    }

    /**
     * Sets the value of the fkDestID property.
     * 
     */
    public void setFKDestID(int value) {
        this.fkDestID = value;
    }

    /**
     * Gets the value of the sekv property.
     * 
     */
    public int getSekv() {
        return sekv;
    }

    /**
     * Sets the value of the sekv property.
     * 
     */
    public void setSekv(int value) {
        this.sekv = value;
    }

    /**
     * Gets the value of the pTmeanSecDest property.
     * 
     */
    public int getPTmeanSecDest() {
        return pTmeanSecDest;
    }

    /**
     * Sets the value of the pTmeanSecDest property.
     * 
     */
    public void setPTmeanSecDest(int value) {
        this.pTmeanSecDest = value;
    }

    /**
     * Gets the value of the destkod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestkod() {
        return destkod;
    }

    /**
     * Sets the value of the destkod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestkod(String value) {
        this.destkod = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Gets the value of the dest16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDest16() {
        return dest16;
    }

    /**
     * Sets the value of the dest16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDest16(String value) {
        this.dest16 = value;
    }

    /**
     * Gets the value of the thm property.
     * 
     */
    public int getThm() {
        return thm;
    }

    /**
     * Sets the value of the thm property.
     * 
     */
    public void setThm(int value) {
        this.thm = value;
    }

}
