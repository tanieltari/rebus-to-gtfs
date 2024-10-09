
package com.ridango.rebus2gtfs.rebus;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AVTALSPEC_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AVTALSPEC_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="avtal">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               <minInclusive value="-2147483648"/>
 *               <maxInclusive value="2147483647"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="avtaltext">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="1080"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="Entkod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="entreptext">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="30"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="Fran" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Till" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Bevakning" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AVTALSPEC_TYP", propOrder = {
    "avtal",
    "avtaltext",
    "entkod",
    "entreptext",
    "fran",
    "till",
    "bevakning"
})
public class AVTALSPECTYP {

    protected int avtal;
    @XmlElement(required = true, nillable = true)
    protected String avtaltext;
    @XmlElement(name = "Entkod", required = true)
    protected String entkod;
    @XmlElement(required = true, nillable = true)
    protected String entreptext;
    @XmlElement(name = "Fran", required = true)
    protected String fran;
    @XmlElement(name = "Till", required = true)
    protected String till;
    @XmlElement(name = "Bevakning", required = true)
    protected String bevakning;

    /**
     * Gets the value of the avtal property.
     * 
     */
    public int getAvtal() {
        return avtal;
    }

    /**
     * Sets the value of the avtal property.
     * 
     */
    public void setAvtal(int value) {
        this.avtal = value;
    }

    /**
     * Gets the value of the avtaltext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvtaltext() {
        return avtaltext;
    }

    /**
     * Sets the value of the avtaltext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvtaltext(String value) {
        this.avtaltext = value;
    }

    /**
     * Gets the value of the entkod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntkod() {
        return entkod;
    }

    /**
     * Sets the value of the entkod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntkod(String value) {
        this.entkod = value;
    }

    /**
     * Gets the value of the entreptext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntreptext() {
        return entreptext;
    }

    /**
     * Sets the value of the entreptext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntreptext(String value) {
        this.entreptext = value;
    }

    /**
     * Gets the value of the fran property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFran() {
        return fran;
    }

    /**
     * Sets the value of the fran property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFran(String value) {
        this.fran = value;
    }

    /**
     * Gets the value of the till property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTill() {
        return till;
    }

    /**
     * Sets the value of the till property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTill(String value) {
        this.till = value;
    }

    /**
     * Gets the value of the bevakning property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBevakning() {
        return bevakning;
    }

    /**
     * Sets the value of the bevakning property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBevakning(String value) {
        this.bevakning = value;
    }

}
