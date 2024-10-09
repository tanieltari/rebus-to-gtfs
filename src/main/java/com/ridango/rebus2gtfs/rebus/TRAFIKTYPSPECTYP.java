
package com.ridango.rebus2gtfs.rebus;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TRAFIKTYPSPEC_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TRAFIKTYPSPEC_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="tp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Tpind" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="trafiktyp">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="8"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="namn">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="80"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="fotnot">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="1"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="anropstyrd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="TrafiktypDbID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TRAFIKTYPSPEC_TYP", propOrder = {
    "tp",
    "tpind",
    "trafiktyp",
    "namn",
    "fotnot",
    "anropstyrd",
    "trafiktypDbID"
})
public class TRAFIKTYPSPECTYP {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer tp;
    @XmlElement(name = "Tpind")
    protected int tpind;
    @XmlElement(required = true, nillable = true)
    protected String trafiktyp;
    @XmlElement(required = true, nillable = true)
    protected String namn;
    @XmlElement(required = true, nillable = true)
    protected String fotnot;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean anropstyrd;
    @XmlElement(name = "TrafiktypDbID")
    protected int trafiktypDbID;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTp(Integer value) {
        this.tp = value;
    }

    /**
     * Gets the value of the tpind property.
     * 
     */
    public int getTpind() {
        return tpind;
    }

    /**
     * Sets the value of the tpind property.
     * 
     */
    public void setTpind(int value) {
        this.tpind = value;
    }

    /**
     * Gets the value of the trafiktyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrafiktyp() {
        return trafiktyp;
    }

    /**
     * Sets the value of the trafiktyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrafiktyp(String value) {
        this.trafiktyp = value;
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
     * Gets the value of the fotnot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFotnot() {
        return fotnot;
    }

    /**
     * Sets the value of the fotnot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFotnot(String value) {
        this.fotnot = value;
    }

    /**
     * Gets the value of the anropstyrd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAnropstyrd() {
        return anropstyrd;
    }

    /**
     * Sets the value of the anropstyrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAnropstyrd(Boolean value) {
        this.anropstyrd = value;
    }

    /**
     * Gets the value of the trafiktypDbID property.
     * 
     */
    public int getTrafiktypDbID() {
        return trafiktypDbID;
    }

    /**
     * Sets the value of the trafiktypDbID property.
     * 
     */
    public void setTrafiktypDbID(int value) {
        this.trafiktypDbID = value;
    }

}
