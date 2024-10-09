
package com.ridango.rebus2gtfs.rebus;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OMLSPEC_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OMLSPEC_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="omlopp">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               <minInclusive value="-2147483648"/>
 *               <maxInclusive value="2147483647"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="ArbomrID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="ArbOmr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="gfallid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="gfall" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="garid" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="gar">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               <minInclusive value="-2147483648"/>
 *               <maxInclusive value="2147483647"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="mintottid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="maxstilltidH" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="maxstilltidB" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="maxstillers" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="avtal">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               <minInclusive value="-2147483648"/>
 *               <maxInclusive value="2147483647"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="entrep">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="6"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="fordonstyp">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="5"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="ParkingPointGid" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="ParkingPointNr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OMLSPEC_TYP", propOrder = {
    "omlopp",
    "arbomrID",
    "arbOmr",
    "gfallid",
    "gfall",
    "garid",
    "gar",
    "mintottid",
    "maxstilltidH",
    "maxstilltidB",
    "maxstillers",
    "avtal",
    "entrep",
    "fordonstyp",
    "parkingPointGid",
    "parkingPointNr"
})
public class OMLSPECTYP {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer omlopp;
    @XmlElement(name = "ArbomrID")
    protected int arbomrID;
    @XmlElement(name = "ArbOmr", required = true)
    protected String arbOmr;
    protected int gfallid;
    @XmlElement(required = true, nillable = true)
    protected String gfall;
    protected long garid;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer gar;
    protected int mintottid;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer maxstilltidH;
    protected int maxstilltidB;
    protected int maxstillers;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer avtal;
    @XmlElement(required = true, nillable = true)
    protected String entrep;
    @XmlElement(required = true, nillable = true)
    protected String fordonstyp;
    @XmlElement(name = "ParkingPointGid")
    protected long parkingPointGid;
    @XmlElement(name = "ParkingPointNr")
    protected int parkingPointNr;

    /**
     * Gets the value of the omlopp property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOmlopp() {
        return omlopp;
    }

    /**
     * Sets the value of the omlopp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOmlopp(Integer value) {
        this.omlopp = value;
    }

    /**
     * Gets the value of the arbomrID property.
     * 
     */
    public int getArbomrID() {
        return arbomrID;
    }

    /**
     * Sets the value of the arbomrID property.
     * 
     */
    public void setArbomrID(int value) {
        this.arbomrID = value;
    }

    /**
     * Gets the value of the arbOmr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArbOmr() {
        return arbOmr;
    }

    /**
     * Sets the value of the arbOmr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArbOmr(String value) {
        this.arbOmr = value;
    }

    /**
     * Gets the value of the gfallid property.
     * 
     */
    public int getGfallid() {
        return gfallid;
    }

    /**
     * Sets the value of the gfallid property.
     * 
     */
    public void setGfallid(int value) {
        this.gfallid = value;
    }

    /**
     * Gets the value of the gfall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGfall() {
        return gfall;
    }

    /**
     * Sets the value of the gfall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGfall(String value) {
        this.gfall = value;
    }

    /**
     * Gets the value of the garid property.
     * 
     */
    public long getGarid() {
        return garid;
    }

    /**
     * Sets the value of the garid property.
     * 
     */
    public void setGarid(long value) {
        this.garid = value;
    }

    /**
     * Gets the value of the gar property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGar() {
        return gar;
    }

    /**
     * Sets the value of the gar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGar(Integer value) {
        this.gar = value;
    }

    /**
     * Gets the value of the mintottid property.
     * 
     */
    public int getMintottid() {
        return mintottid;
    }

    /**
     * Sets the value of the mintottid property.
     * 
     */
    public void setMintottid(int value) {
        this.mintottid = value;
    }

    /**
     * Gets the value of the maxstilltidH property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxstilltidH() {
        return maxstilltidH;
    }

    /**
     * Sets the value of the maxstilltidH property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxstilltidH(Integer value) {
        this.maxstilltidH = value;
    }

    /**
     * Gets the value of the maxstilltidB property.
     * 
     */
    public int getMaxstilltidB() {
        return maxstilltidB;
    }

    /**
     * Sets the value of the maxstilltidB property.
     * 
     */
    public void setMaxstilltidB(int value) {
        this.maxstilltidB = value;
    }

    /**
     * Gets the value of the maxstillers property.
     * 
     */
    public int getMaxstillers() {
        return maxstillers;
    }

    /**
     * Sets the value of the maxstillers property.
     * 
     */
    public void setMaxstillers(int value) {
        this.maxstillers = value;
    }

    /**
     * Gets the value of the avtal property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAvtal() {
        return avtal;
    }

    /**
     * Sets the value of the avtal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAvtal(Integer value) {
        this.avtal = value;
    }

    /**
     * Gets the value of the entrep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntrep() {
        return entrep;
    }

    /**
     * Sets the value of the entrep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntrep(String value) {
        this.entrep = value;
    }

    /**
     * Gets the value of the fordonstyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFordonstyp() {
        return fordonstyp;
    }

    /**
     * Sets the value of the fordonstyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFordonstyp(String value) {
        this.fordonstyp = value;
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

}
