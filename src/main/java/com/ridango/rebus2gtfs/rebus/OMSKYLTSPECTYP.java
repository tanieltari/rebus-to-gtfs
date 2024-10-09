
package com.ridango.rebus2gtfs.rebus;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OMSKYLTSPEC_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OMSKYLTSPEC_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="aktlistid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="aktlistaelemid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="metersbeforeafter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="destkod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="desttext" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="extnr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="extnr2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="talkod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OMSKYLTSPEC_TYP", propOrder = {
    "aktlistid",
    "aktlistaelemid",
    "metersbeforeafter",
    "destkod",
    "desttext",
    "extnr",
    "extnr2",
    "talkod"
})
public class OMSKYLTSPECTYP {

    protected int aktlistid;
    protected int aktlistaelemid;
    protected int metersbeforeafter;
    protected int destkod;
    @XmlElement(required = true)
    protected String desttext;
    protected int extnr;
    protected int extnr2;
    protected int talkod;

    /**
     * Gets the value of the aktlistid property.
     * 
     */
    public int getAktlistid() {
        return aktlistid;
    }

    /**
     * Sets the value of the aktlistid property.
     * 
     */
    public void setAktlistid(int value) {
        this.aktlistid = value;
    }

    /**
     * Gets the value of the aktlistaelemid property.
     * 
     */
    public int getAktlistaelemid() {
        return aktlistaelemid;
    }

    /**
     * Sets the value of the aktlistaelemid property.
     * 
     */
    public void setAktlistaelemid(int value) {
        this.aktlistaelemid = value;
    }

    /**
     * Gets the value of the metersbeforeafter property.
     * 
     */
    public int getMetersbeforeafter() {
        return metersbeforeafter;
    }

    /**
     * Sets the value of the metersbeforeafter property.
     * 
     */
    public void setMetersbeforeafter(int value) {
        this.metersbeforeafter = value;
    }

    /**
     * Gets the value of the destkod property.
     * 
     */
    public int getDestkod() {
        return destkod;
    }

    /**
     * Sets the value of the destkod property.
     * 
     */
    public void setDestkod(int value) {
        this.destkod = value;
    }

    /**
     * Gets the value of the desttext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesttext() {
        return desttext;
    }

    /**
     * Sets the value of the desttext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesttext(String value) {
        this.desttext = value;
    }

    /**
     * Gets the value of the extnr property.
     * 
     */
    public int getExtnr() {
        return extnr;
    }

    /**
     * Sets the value of the extnr property.
     * 
     */
    public void setExtnr(int value) {
        this.extnr = value;
    }

    /**
     * Gets the value of the extnr2 property.
     * 
     */
    public int getExtnr2() {
        return extnr2;
    }

    /**
     * Sets the value of the extnr2 property.
     * 
     */
    public void setExtnr2(int value) {
        this.extnr2 = value;
    }

    /**
     * Gets the value of the talkod property.
     * 
     */
    public int getTalkod() {
        return talkod;
    }

    /**
     * Sets the value of the talkod property.
     * 
     */
    public void setTalkod(int value) {
        this.talkod = value;
    }

}
