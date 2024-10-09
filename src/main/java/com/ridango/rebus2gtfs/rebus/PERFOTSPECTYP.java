
package com.ridango.rebus2gtfs.rebus;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PERFOTSPEC_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PERFOTSPEC_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Periodnr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="TP" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="TPind" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Fotnot">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <length value="1"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="Positiv" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="scase" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PERFOTSPEC_TYP", propOrder = {
    "periodnr",
    "tp",
    "tPind",
    "fotnot",
    "positiv",
    "scase"
})
public class PERFOTSPECTYP {

    @XmlElement(name = "Periodnr")
    protected int periodnr;
    @XmlElement(name = "TP")
    protected int tp;
    @XmlElement(name = "TPind")
    protected int tPind;
    @XmlElement(name = "Fotnot", required = true)
    protected String fotnot;
    @XmlElement(name = "Positiv")
    protected boolean positiv;
    protected boolean scase;

    /**
     * Gets the value of the periodnr property.
     * 
     */
    public int getPeriodnr() {
        return periodnr;
    }

    /**
     * Sets the value of the periodnr property.
     * 
     */
    public void setPeriodnr(int value) {
        this.periodnr = value;
    }

    /**
     * Gets the value of the tp property.
     * 
     */
    public int getTP() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     */
    public void setTP(int value) {
        this.tp = value;
    }

    /**
     * Gets the value of the tPind property.
     * 
     */
    public int getTPind() {
        return tPind;
    }

    /**
     * Sets the value of the tPind property.
     * 
     */
    public void setTPind(int value) {
        this.tPind = value;
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
     * Gets the value of the positiv property.
     * 
     */
    public boolean isPositiv() {
        return positiv;
    }

    /**
     * Sets the value of the positiv property.
     * 
     */
    public void setPositiv(boolean value) {
        this.positiv = value;
    }

    /**
     * Gets the value of the scase property.
     * 
     */
    public boolean isScase() {
        return scase;
    }

    /**
     * Sets the value of the scase property.
     * 
     */
    public void setScase(boolean value) {
        this.scase = value;
    }

}
