
package com.ridango.rebus2gtfs.rebus;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ACTSIGNALPRIO_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ACTSIGNALPRIO_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Korsningsnummer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="KorsningsExternNummer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Typ" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Priokod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="MetersBeforeAfter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Sekv" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Municipality" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACTSIGNALPRIO_TYP", propOrder = {
    "korsningsnummer",
    "korsningsExternNummer",
    "typ",
    "priokod",
    "metersBeforeAfter",
    "sekv",
    "municipality"
})
public class ACTSIGNALPRIOTYP {

    @XmlElement(name = "Korsningsnummer")
    protected int korsningsnummer;
    @XmlElement(name = "KorsningsExternNummer")
    protected int korsningsExternNummer;
    /**
     *  1:Preaktivering 2:Påaktivering 3:Avaktivering
     * 
     */
    @XmlElement(name = "Typ")
    protected int typ;
    @XmlElement(name = "Priokod")
    protected int priokod;
    @XmlElement(name = "MetersBeforeAfter")
    protected int metersBeforeAfter;
    @XmlElement(name = "Sekv")
    protected int sekv;
    @XmlElement(name = "Municipality")
    protected int municipality;

    /**
     * Gets the value of the korsningsnummer property.
     * 
     */
    public int getKorsningsnummer() {
        return korsningsnummer;
    }

    /**
     * Sets the value of the korsningsnummer property.
     * 
     */
    public void setKorsningsnummer(int value) {
        this.korsningsnummer = value;
    }

    /**
     * Gets the value of the korsningsExternNummer property.
     * 
     */
    public int getKorsningsExternNummer() {
        return korsningsExternNummer;
    }

    /**
     * Sets the value of the korsningsExternNummer property.
     * 
     */
    public void setKorsningsExternNummer(int value) {
        this.korsningsExternNummer = value;
    }

    /**
     *  1:Preaktivering 2:Påaktivering 3:Avaktivering
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
     * Gets the value of the priokod property.
     * 
     */
    public int getPriokod() {
        return priokod;
    }

    /**
     * Sets the value of the priokod property.
     * 
     */
    public void setPriokod(int value) {
        this.priokod = value;
    }

    /**
     * Gets the value of the metersBeforeAfter property.
     * 
     */
    public int getMetersBeforeAfter() {
        return metersBeforeAfter;
    }

    /**
     * Sets the value of the metersBeforeAfter property.
     * 
     */
    public void setMetersBeforeAfter(int value) {
        this.metersBeforeAfter = value;
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
     * Gets the value of the municipality property.
     * 
     */
    public int getMunicipality() {
        return municipality;
    }

    /**
     * Sets the value of the municipality property.
     * 
     */
    public void setMunicipality(int value) {
        this.municipality = value;
    }

}
