
package com.ridango.rebus2gtfs.rebus;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LINSPEC_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="LINSPEC_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Linje" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Variantnr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Kvar" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Kvartxt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Startdestinationkod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Startdestinationtext" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Frandestinationkod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Frandestinationtext" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="LINSPECSTOP" type="{}LINSPECSTOP_TYP" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LINSPEC_TYP", propOrder = {
    "linje",
    "variantnr",
    "kvar",
    "kvartxt",
    "startdestinationkod",
    "startdestinationtext",
    "frandestinationkod",
    "frandestinationtext",
    "linspecstop"
})
public class LINSPECTYP {

    @XmlElement(name = "Linje")
    protected int linje;
    @XmlElement(name = "Variantnr")
    protected int variantnr;
    @XmlElement(name = "Kvar")
    protected int kvar;
    @XmlElement(name = "Kvartxt", required = true)
    protected String kvartxt;
    @XmlElement(name = "Startdestinationkod")
    protected int startdestinationkod;
    @XmlElement(name = "Startdestinationtext", required = true)
    protected String startdestinationtext;
    @XmlElement(name = "Frandestinationkod")
    protected int frandestinationkod;
    @XmlElement(name = "Frandestinationtext", required = true)
    protected String frandestinationtext;
    @XmlElement(name = "LINSPECSTOP", required = true)
    protected List<LINSPECSTOPTYP> linspecstop;

    /**
     * Gets the value of the linje property.
     * 
     */
    public int getLinje() {
        return linje;
    }

    /**
     * Sets the value of the linje property.
     * 
     */
    public void setLinje(int value) {
        this.linje = value;
    }

    /**
     * Gets the value of the variantnr property.
     * 
     */
    public int getVariantnr() {
        return variantnr;
    }

    /**
     * Sets the value of the variantnr property.
     * 
     */
    public void setVariantnr(int value) {
        this.variantnr = value;
    }

    /**
     * Gets the value of the kvar property.
     * 
     */
    public int getKvar() {
        return kvar;
    }

    /**
     * Sets the value of the kvar property.
     * 
     */
    public void setKvar(int value) {
        this.kvar = value;
    }

    /**
     * Gets the value of the kvartxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKvartxt() {
        return kvartxt;
    }

    /**
     * Sets the value of the kvartxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKvartxt(String value) {
        this.kvartxt = value;
    }

    /**
     * Gets the value of the startdestinationkod property.
     * 
     */
    public int getStartdestinationkod() {
        return startdestinationkod;
    }

    /**
     * Sets the value of the startdestinationkod property.
     * 
     */
    public void setStartdestinationkod(int value) {
        this.startdestinationkod = value;
    }

    /**
     * Gets the value of the startdestinationtext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartdestinationtext() {
        return startdestinationtext;
    }

    /**
     * Sets the value of the startdestinationtext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartdestinationtext(String value) {
        this.startdestinationtext = value;
    }

    /**
     * Gets the value of the frandestinationkod property.
     * 
     */
    public int getFrandestinationkod() {
        return frandestinationkod;
    }

    /**
     * Sets the value of the frandestinationkod property.
     * 
     */
    public void setFrandestinationkod(int value) {
        this.frandestinationkod = value;
    }

    /**
     * Gets the value of the frandestinationtext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrandestinationtext() {
        return frandestinationtext;
    }

    /**
     * Sets the value of the frandestinationtext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrandestinationtext(String value) {
        this.frandestinationtext = value;
    }

    /**
     * Gets the value of the linspecstop property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linspecstop property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getLINSPECSTOP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LINSPECSTOPTYP }
     * </p>
     * 
     * 
     * @return
     *     The value of the linspecstop property.
     */
    public List<LINSPECSTOPTYP> getLINSPECSTOP() {
        if (linspecstop == null) {
            linspecstop = new ArrayList<>();
        }
        return this.linspecstop;
    }

}
