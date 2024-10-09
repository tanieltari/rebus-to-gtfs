
package com.ridango.rebus2gtfs.rebus;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Ford_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Ford_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FordNamn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Antal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="typ" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="FunkR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="FunkS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="FunkH" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="TransportModeType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="TransportModeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="TransportModeSwedishName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="TransportModeNameSamtrafiken" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="CO2Faktor" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         <element name="Anm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ford_TYP", propOrder = {
    "fordNamn",
    "antal",
    "typ",
    "funkR",
    "funkS",
    "funkH",
    "transportModeType",
    "transportModeName",
    "transportModeSwedishName",
    "transportModeNameSamtrafiken",
    "co2Faktor",
    "anm"
})
public class FordTYP {

    @XmlElement(name = "FordNamn", required = true)
    protected String fordNamn;
    /**
     * Antal passagerare
     * 
     */
    @XmlElement(name = "Antal")
    protected int antal;
    @XmlElement(required = true)
    protected String typ;
    @XmlElement(name = "FunkR", required = true)
    protected String funkR;
    @XmlElement(name = "FunkS", required = true)
    protected String funkS;
    @XmlElement(name = "FunkH", required = true)
    protected String funkH;
    @XmlElement(name = "TransportModeType")
    protected int transportModeType;
    @XmlElement(name = "TransportModeName", required = true)
    protected String transportModeName;
    @XmlElement(name = "TransportModeSwedishName", required = true)
    protected String transportModeSwedishName;
    @XmlElement(name = "TransportModeNameSamtrafiken", required = true)
    protected String transportModeNameSamtrafiken;
    @XmlElement(name = "CO2Faktor")
    protected float co2Faktor;
    @XmlElement(name = "Anm", required = true)
    protected String anm;

    /**
     * Gets the value of the fordNamn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFordNamn() {
        return fordNamn;
    }

    /**
     * Sets the value of the fordNamn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFordNamn(String value) {
        this.fordNamn = value;
    }

    /**
     * Antal passagerare
     * 
     */
    public int getAntal() {
        return antal;
    }

    /**
     * Sets the value of the antal property.
     * 
     */
    public void setAntal(int value) {
        this.antal = value;
    }

    /**
     * Gets the value of the typ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTyp() {
        return typ;
    }

    /**
     * Sets the value of the typ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTyp(String value) {
        this.typ = value;
    }

    /**
     * Gets the value of the funkR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunkR() {
        return funkR;
    }

    /**
     * Sets the value of the funkR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunkR(String value) {
        this.funkR = value;
    }

    /**
     * Gets the value of the funkS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunkS() {
        return funkS;
    }

    /**
     * Sets the value of the funkS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunkS(String value) {
        this.funkS = value;
    }

    /**
     * Gets the value of the funkH property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunkH() {
        return funkH;
    }

    /**
     * Sets the value of the funkH property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunkH(String value) {
        this.funkH = value;
    }

    /**
     * Gets the value of the transportModeType property.
     * 
     */
    public int getTransportModeType() {
        return transportModeType;
    }

    /**
     * Sets the value of the transportModeType property.
     * 
     */
    public void setTransportModeType(int value) {
        this.transportModeType = value;
    }

    /**
     * Gets the value of the transportModeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportModeName() {
        return transportModeName;
    }

    /**
     * Sets the value of the transportModeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportModeName(String value) {
        this.transportModeName = value;
    }

    /**
     * Gets the value of the transportModeSwedishName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportModeSwedishName() {
        return transportModeSwedishName;
    }

    /**
     * Sets the value of the transportModeSwedishName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportModeSwedishName(String value) {
        this.transportModeSwedishName = value;
    }

    /**
     * Gets the value of the transportModeNameSamtrafiken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportModeNameSamtrafiken() {
        return transportModeNameSamtrafiken;
    }

    /**
     * Sets the value of the transportModeNameSamtrafiken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportModeNameSamtrafiken(String value) {
        this.transportModeNameSamtrafiken = value;
    }

    /**
     * Gets the value of the co2Faktor property.
     * 
     */
    public float getCO2Faktor() {
        return co2Faktor;
    }

    /**
     * Sets the value of the co2Faktor property.
     * 
     */
    public void setCO2Faktor(float value) {
        this.co2Faktor = value;
    }

    /**
     * Gets the value of the anm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnm() {
        return anm;
    }

    /**
     * Sets the value of the anm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnm(String value) {
        this.anm = value;
    }

}
