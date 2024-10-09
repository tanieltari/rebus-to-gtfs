
package com.ridango.rebus2gtfs.rebus;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ACTRADIOPUNKT_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ACTRADIOPUNKT_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RadioPunktID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="AktListElemId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Namn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="MetersAfterStop" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="DataKanal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="RadioKanal" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "ACTRADIOPUNKT_TYP", propOrder = {
    "radioPunktID",
    "aktListElemId",
    "namn",
    "metersAfterStop",
    "dataKanal",
    "radioKanal",
    "sekv"
})
public class ACTRADIOPUNKTTYP {

    @XmlElement(name = "RadioPunktID")
    protected int radioPunktID;
    @XmlElement(name = "AktListElemId")
    protected int aktListElemId;
    @XmlElement(name = "Namn", required = true)
    protected String namn;
    @XmlElement(name = "MetersAfterStop")
    protected int metersAfterStop;
    @XmlElement(name = "DataKanal")
    protected int dataKanal;
    @XmlElement(name = "RadioKanal")
    protected int radioKanal;
    @XmlElement(name = "Sekv")
    protected int sekv;

    /**
     * Gets the value of the radioPunktID property.
     * 
     */
    public int getRadioPunktID() {
        return radioPunktID;
    }

    /**
     * Sets the value of the radioPunktID property.
     * 
     */
    public void setRadioPunktID(int value) {
        this.radioPunktID = value;
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
     * Gets the value of the metersAfterStop property.
     * 
     */
    public int getMetersAfterStop() {
        return metersAfterStop;
    }

    /**
     * Sets the value of the metersAfterStop property.
     * 
     */
    public void setMetersAfterStop(int value) {
        this.metersAfterStop = value;
    }

    /**
     * Gets the value of the dataKanal property.
     * 
     */
    public int getDataKanal() {
        return dataKanal;
    }

    /**
     * Sets the value of the dataKanal property.
     * 
     */
    public void setDataKanal(int value) {
        this.dataKanal = value;
    }

    /**
     * Gets the value of the radioKanal property.
     * 
     */
    public int getRadioKanal() {
        return radioKanal;
    }

    /**
     * Sets the value of the radioKanal property.
     * 
     */
    public void setRadioKanal(int value) {
        this.radioKanal = value;
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
