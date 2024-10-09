
package com.ridango.rebus2gtfs.rebus;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnderEntreprenor_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="UnderEntreprenor_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="EntId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="EntKod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="EntNamn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="EntAdress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="EntTel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="TryKod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Radio" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Aktiv" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="AktDatum" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="Garage" type="{}Garages"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnderEntreprenor_TYP", propOrder = {
    "entId",
    "entKod",
    "entNamn",
    "entAdress",
    "entTel",
    "tryKod",
    "radio",
    "aktiv",
    "aktDatum",
    "garage"
})
public class UnderEntreprenorTYP {

    @XmlElement(name = "EntId")
    protected int entId;
    @XmlElement(name = "EntKod", required = true)
    protected String entKod;
    @XmlElement(name = "EntNamn", required = true)
    protected String entNamn;
    @XmlElement(name = "EntAdress", required = true)
    protected String entAdress;
    @XmlElement(name = "EntTel", required = true)
    protected String entTel;
    @XmlElement(name = "TryKod", required = true)
    protected String tryKod;
    @XmlElement(name = "Radio")
    protected int radio;
    @XmlElement(name = "Aktiv")
    protected boolean aktiv;
    @XmlElement(name = "AktDatum", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar aktDatum;
    @XmlElement(name = "Garage", required = true)
    protected Garages garage;

    /**
     * Gets the value of the entId property.
     * 
     */
    public int getEntId() {
        return entId;
    }

    /**
     * Sets the value of the entId property.
     * 
     */
    public void setEntId(int value) {
        this.entId = value;
    }

    /**
     * Gets the value of the entKod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntKod() {
        return entKod;
    }

    /**
     * Sets the value of the entKod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntKod(String value) {
        this.entKod = value;
    }

    /**
     * Gets the value of the entNamn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntNamn() {
        return entNamn;
    }

    /**
     * Sets the value of the entNamn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntNamn(String value) {
        this.entNamn = value;
    }

    /**
     * Gets the value of the entAdress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntAdress() {
        return entAdress;
    }

    /**
     * Sets the value of the entAdress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntAdress(String value) {
        this.entAdress = value;
    }

    /**
     * Gets the value of the entTel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntTel() {
        return entTel;
    }

    /**
     * Sets the value of the entTel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntTel(String value) {
        this.entTel = value;
    }

    /**
     * Gets the value of the tryKod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTryKod() {
        return tryKod;
    }

    /**
     * Sets the value of the tryKod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTryKod(String value) {
        this.tryKod = value;
    }

    /**
     * Gets the value of the radio property.
     * 
     */
    public int getRadio() {
        return radio;
    }

    /**
     * Sets the value of the radio property.
     * 
     */
    public void setRadio(int value) {
        this.radio = value;
    }

    /**
     * Gets the value of the aktiv property.
     * 
     */
    public boolean isAktiv() {
        return aktiv;
    }

    /**
     * Sets the value of the aktiv property.
     * 
     */
    public void setAktiv(boolean value) {
        this.aktiv = value;
    }

    /**
     * Gets the value of the aktDatum property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAktDatum() {
        return aktDatum;
    }

    /**
     * Sets the value of the aktDatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAktDatum(XMLGregorianCalendar value) {
        this.aktDatum = value;
    }

    /**
     * Gets the value of the garage property.
     * 
     * @return
     *     possible object is
     *     {@link Garages }
     *     
     */
    public Garages getGarage() {
        return garage;
    }

    /**
     * Sets the value of the garage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Garages }
     *     
     */
    public void setGarage(Garages value) {
        this.garage = value;
    }

}
