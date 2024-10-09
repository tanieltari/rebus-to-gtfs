
package com.ridango.rebus2gtfs.rebus;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Garage_typ complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Garage_typ">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Nr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Typ" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Namn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Adress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="HemmaAvst" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="Northing" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="Easting" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="Kommun" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="ParkingPointNr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="ParkingPointGid" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="Fordon" type="{}Ford_TYP" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Garage_typ", propOrder = {
    "nr",
    "typ",
    "namn",
    "adress",
    "hemmaAvst",
    "northing",
    "easting",
    "kommun",
    "parkingPointNr",
    "parkingPointGid",
    "fordon"
})
public class GarageTyp {

    @XmlElement(name = "Nr")
    protected int nr;
    @XmlElement(name = "Typ")
    protected int typ;
    @XmlElement(name = "Namn", required = true)
    protected String namn;
    @XmlElement(name = "Adress", required = true)
    protected String adress;
    @XmlElement(name = "HemmaAvst")
    protected long hemmaAvst;
    @XmlElement(name = "Northing")
    protected long northing;
    @XmlElement(name = "Easting")
    protected long easting;
    @XmlElement(name = "Kommun")
    protected long kommun;
    @XmlElement(name = "ParkingPointNr")
    protected int parkingPointNr;
    @XmlElement(name = "ParkingPointGid")
    protected long parkingPointGid;
    @XmlElement(name = "Fordon")
    protected List<FordTYP> fordon;

    /**
     * Gets the value of the nr property.
     * 
     */
    public int getNr() {
        return nr;
    }

    /**
     * Sets the value of the nr property.
     * 
     */
    public void setNr(int value) {
        this.nr = value;
    }

    /**
     * Gets the value of the typ property.
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
     * Gets the value of the namn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamn() {
        return namn;
    }

    /**
     * Sets the value of the namn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamn(String value) {
        this.namn = value;
    }

    /**
     * Gets the value of the adress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdress() {
        return adress;
    }

    /**
     * Sets the value of the adress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdress(String value) {
        this.adress = value;
    }

    /**
     * Gets the value of the hemmaAvst property.
     * 
     */
    public long getHemmaAvst() {
        return hemmaAvst;
    }

    /**
     * Sets the value of the hemmaAvst property.
     * 
     */
    public void setHemmaAvst(long value) {
        this.hemmaAvst = value;
    }

    /**
     * Gets the value of the northing property.
     * 
     */
    public long getNorthing() {
        return northing;
    }

    /**
     * Sets the value of the northing property.
     * 
     */
    public void setNorthing(long value) {
        this.northing = value;
    }

    /**
     * Gets the value of the easting property.
     * 
     */
    public long getEasting() {
        return easting;
    }

    /**
     * Sets the value of the easting property.
     * 
     */
    public void setEasting(long value) {
        this.easting = value;
    }

    /**
     * Gets the value of the kommun property.
     * 
     */
    public long getKommun() {
        return kommun;
    }

    /**
     * Sets the value of the kommun property.
     * 
     */
    public void setKommun(long value) {
        this.kommun = value;
    }

    /**
     * Gets the value of the parkingPointNr property.
     * 
     */
    public int getParkingPointNr() {
        return parkingPointNr;
    }

    /**
     * Sets the value of the parkingPointNr property.
     * 
     */
    public void setParkingPointNr(int value) {
        this.parkingPointNr = value;
    }

    /**
     * Gets the value of the parkingPointGid property.
     * 
     */
    public long getParkingPointGid() {
        return parkingPointGid;
    }

    /**
     * Sets the value of the parkingPointGid property.
     * 
     */
    public void setParkingPointGid(long value) {
        this.parkingPointGid = value;
    }

    /**
     * Gets the value of the fordon property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fordon property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFordon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FordTYP }
     * </p>
     * 
     * 
     * @return
     *     The value of the fordon property.
     */
    public List<FordTYP> getFordon() {
        if (fordon == null) {
            fordon = new ArrayList<>();
        }
        return this.fordon;
    }

}
