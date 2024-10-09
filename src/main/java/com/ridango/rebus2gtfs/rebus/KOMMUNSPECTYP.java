
package com.ridango.rebus2gtfs.rebus;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KOMMUNSPEC_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="KOMMUNSPEC_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="kommunnr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="kommunnamn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="lannr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="taxelannr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Countynr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Countynamn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="TaxCountynr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="TaxCountynamn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KOMMUNSPEC_TYP", propOrder = {
    "kommunnr",
    "kommunnamn",
    "lannr",
    "taxelannr",
    "countynr",
    "countynamn",
    "taxCountynr",
    "taxCountynamn"
})
public class KOMMUNSPECTYP {

    protected int kommunnr;
    @XmlElement(required = true, nillable = true)
    protected String kommunnamn;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer lannr;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer taxelannr;
    @XmlElement(name = "Countynr")
    protected int countynr;
    @XmlElement(name = "Countynamn", required = true)
    protected String countynamn;
    @XmlElement(name = "TaxCountynr")
    protected int taxCountynr;
    @XmlElement(name = "TaxCountynamn", required = true)
    protected String taxCountynamn;

    /**
     * Gets the value of the kommunnr property.
     * 
     */
    public int getKommunnr() {
        return kommunnr;
    }

    /**
     * Sets the value of the kommunnr property.
     * 
     */
    public void setKommunnr(int value) {
        this.kommunnr = value;
    }

    /**
     * Gets the value of the kommunnamn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKommunnamn() {
        return kommunnamn;
    }

    /**
     * Sets the value of the kommunnamn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKommunnamn(String value) {
        this.kommunnamn = value;
    }

    /**
     * Gets the value of the lannr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLannr() {
        return lannr;
    }

    /**
     * Sets the value of the lannr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLannr(Integer value) {
        this.lannr = value;
    }

    /**
     * Gets the value of the taxelannr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTaxelannr() {
        return taxelannr;
    }

    /**
     * Sets the value of the taxelannr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTaxelannr(Integer value) {
        this.taxelannr = value;
    }

    /**
     * Gets the value of the countynr property.
     * 
     */
    public int getCountynr() {
        return countynr;
    }

    /**
     * Sets the value of the countynr property.
     * 
     */
    public void setCountynr(int value) {
        this.countynr = value;
    }

    /**
     * Gets the value of the countynamn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountynamn() {
        return countynamn;
    }

    /**
     * Sets the value of the countynamn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountynamn(String value) {
        this.countynamn = value;
    }

    /**
     * Gets the value of the taxCountynr property.
     * 
     */
    public int getTaxCountynr() {
        return taxCountynr;
    }

    /**
     * Sets the value of the taxCountynr property.
     * 
     */
    public void setTaxCountynr(int value) {
        this.taxCountynr = value;
    }

    /**
     * Gets the value of the taxCountynamn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxCountynamn() {
        return taxCountynamn;
    }

    /**
     * Sets the value of the taxCountynamn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxCountynamn(String value) {
        this.taxCountynamn = value;
    }

}
