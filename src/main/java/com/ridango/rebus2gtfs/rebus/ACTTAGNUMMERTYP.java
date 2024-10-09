
package com.ridango.rebus2gtfs.rebus;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ACTTAGNUMMER_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ACTTAGNUMMER_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TagNrId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="AktListElemId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Tagnummer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="MetersBeforeAfter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Sekv" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACTTAGNUMMER_TYP", propOrder = {
    "tagNrId",
    "aktListElemId",
    "tagnummer",
    "metersBeforeAfter",
    "sekv"
})
public class ACTTAGNUMMERTYP {

    @XmlElement(name = "TagNrId")
    protected int tagNrId;
    @XmlElement(name = "AktListElemId")
    protected int aktListElemId;
    @XmlElement(name = "Tagnummer")
    protected int tagnummer;
    @XmlElement(name = "MetersBeforeAfter")
    protected int metersBeforeAfter;
    @XmlElement(name = "Sekv")
    protected int sekv;

    /**
     * Gets the value of the tagNrId property.
     * 
     */
    public int getTagNrId() {
        return tagNrId;
    }

    /**
     * Sets the value of the tagNrId property.
     * 
     */
    public void setTagNrId(int value) {
        this.tagNrId = value;
    }

    /**
     * Gets the value of the aktListElemId property.
     * 
     */
    public int getAktListElemId() {
        return aktListElemId;
    }

    /**
     * Sets the value of the aktListElemId property.
     * 
     */
    public void setAktListElemId(int value) {
        this.aktListElemId = value;
    }

    /**
     * Gets the value of the tagnummer property.
     * 
     */
    public int getTagnummer() {
        return tagnummer;
    }

    /**
     * Sets the value of the tagnummer property.
     * 
     */
    public void setTagnummer(int value) {
        this.tagnummer = value;
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

}
