
package com.ridango.rebus2gtfs.rebus;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ANROPINFO_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ANROPINFO_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Telefon" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Timme" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Minut" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Dygn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="fkl" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Dagar" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ANROPINFO_TYP", propOrder = {
    "telefon",
    "timme",
    "minut",
    "dygn",
    "fkl",
    "dagar"
})
public class ANROPINFOTYP {

    @XmlElement(name = "Telefon", required = true)
    protected String telefon;
    @XmlElement(name = "Timme")
    protected int timme;
    @XmlElement(name = "Minut")
    protected int minut;
    @XmlElement(name = "Dygn")
    protected int dygn;
    protected int fkl;
    @XmlElement(name = "Dagar", required = true)
    protected String dagar;

    /**
     * Gets the value of the telefon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefon() {
        return telefon;
    }

    /**
     * Sets the value of the telefon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefon(String value) {
        this.telefon = value;
    }

    /**
     * Gets the value of the timme property.
     * 
     */
    public int getTimme() {
        return timme;
    }

    /**
     * Sets the value of the timme property.
     * 
     */
    public void setTimme(int value) {
        this.timme = value;
    }

    /**
     * Gets the value of the minut property.
     * 
     */
    public int getMinut() {
        return minut;
    }

    /**
     * Sets the value of the minut property.
     * 
     */
    public void setMinut(int value) {
        this.minut = value;
    }

    /**
     * Gets the value of the dygn property.
     * 
     */
    public int getDygn() {
        return dygn;
    }

    /**
     * Sets the value of the dygn property.
     * 
     */
    public void setDygn(int value) {
        this.dygn = value;
    }

    /**
     * Gets the value of the fkl property.
     * 
     */
    public int getFkl() {
        return fkl;
    }

    /**
     * Sets the value of the fkl property.
     * 
     */
    public void setFkl(int value) {
        this.fkl = value;
    }

    /**
     * Gets the value of the dagar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDagar() {
        return dagar;
    }

    /**
     * Sets the value of the dagar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDagar(String value) {
        this.dagar = value;
    }

}
