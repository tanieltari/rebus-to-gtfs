
package com.ridango.rebus2gtfs.rebus;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TOMSPEC_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TOMSPEC_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="StopareaDepa1" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="StopArea2" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="Lage1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Lage2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Typ" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="TidL" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="TidH" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Avst" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Hast" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Kvalite" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TOMSPEC_TYP", propOrder = {
    "stopareaDepa1",
    "stopArea2",
    "lage1",
    "lage2",
    "typ",
    "tidL",
    "tidH",
    "avst",
    "hast",
    "kvalite"
})
public class TOMSPECTYP {

    @XmlElement(name = "StopareaDepa1")
    protected long stopareaDepa1;
    @XmlElement(name = "StopArea2")
    protected long stopArea2;
    /**
     * Endast angivet vid interna tomkörningar
     * 
     */
    @XmlElement(name = "Lage1", required = true)
    protected String lage1;
    /**
     * Endast angivet vid interna tomkörningar
     * 
     */
    @XmlElement(name = "Lage2", required = true)
    protected String lage2;
    /**
     *  0 = Depå 1 = Extern 2=Intern Tomkörning (Todo)
     * 
     */
    @XmlElement(name = "Typ")
    protected int typ;
    /**
     * Tid i minuter Lågtrafik
     * 
     */
    @XmlElement(name = "TidL")
    protected int tidL;
    /**
     * Tid i minuter Högtrafik
     * 
     */
    @XmlElement(name = "TidH")
    protected int tidH;
    /**
     * Avstånd i meter
     * 
     */
    @XmlElement(name = "Avst")
    protected int avst;
    @XmlElement(name = "Hast")
    protected int hast;
    @XmlElement(name = "Kvalite")
    protected int kvalite;

    /**
     * Gets the value of the stopareaDepa1 property.
     * 
     */
    public long getStopareaDepa1() {
        return stopareaDepa1;
    }

    /**
     * Sets the value of the stopareaDepa1 property.
     * 
     */
    public void setStopareaDepa1(long value) {
        this.stopareaDepa1 = value;
    }

    /**
     * Gets the value of the stopArea2 property.
     * 
     */
    public long getStopArea2() {
        return stopArea2;
    }

    /**
     * Sets the value of the stopArea2 property.
     * 
     */
    public void setStopArea2(long value) {
        this.stopArea2 = value;
    }

    /**
     * Endast angivet vid interna tomkörningar
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLage1() {
        return lage1;
    }

    /**
     * Sets the value of the lage1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getLage1()
     */
    public void setLage1(String value) {
        this.lage1 = value;
    }

    /**
     * Endast angivet vid interna tomkörningar
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLage2() {
        return lage2;
    }

    /**
     * Sets the value of the lage2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getLage2()
     */
    public void setLage2(String value) {
        this.lage2 = value;
    }

    /**
     *  0 = Depå 1 = Extern 2=Intern Tomkörning (Todo)
     * 
     */
    public int getTyp() {
        return typ;
    }

    /**
     * Sets the value of the typ property.
     * 
     */
    public void setTyp(int value) {
        this.typ = value;
    }

    /**
     * Tid i minuter Lågtrafik
     * 
     */
    public int getTidL() {
        return tidL;
    }

    /**
     * Sets the value of the tidL property.
     * 
     */
    public void setTidL(int value) {
        this.tidL = value;
    }

    /**
     * Tid i minuter Högtrafik
     * 
     */
    public int getTidH() {
        return tidH;
    }

    /**
     * Sets the value of the tidH property.
     * 
     */
    public void setTidH(int value) {
        this.tidH = value;
    }

    /**
     * Avstånd i meter
     * 
     */
    public int getAvst() {
        return avst;
    }

    /**
     * Sets the value of the avst property.
     * 
     */
    public void setAvst(int value) {
        this.avst = value;
    }

    /**
     * Gets the value of the hast property.
     * 
     */
    public int getHast() {
        return hast;
    }

    /**
     * Sets the value of the hast property.
     * 
     */
    public void setHast(int value) {
        this.hast = value;
    }

    /**
     * Gets the value of the kvalite property.
     * 
     */
    public int getKvalite() {
        return kvalite;
    }

    /**
     * Sets the value of the kvalite property.
     * 
     */
    public void setKvalite(int value) {
        this.kvalite = value;
    }

}
