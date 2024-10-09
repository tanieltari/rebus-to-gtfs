
package com.ridango.rebus2gtfs.rebus;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TRAFFOTSPEC_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TRAFFOTSPEC_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Trafiktyp">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <length value="50"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="Tp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Tpind" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Fotnot">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <length value="1"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
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
@XmlType(name = "TRAFFOTSPEC_TYP", propOrder = {
    "trafiktyp",
    "tp",
    "tpind",
    "fotnot",
    "scase"
})
public class TRAFFOTSPECTYP {

    @XmlElement(name = "Trafiktyp", required = true)
    protected String trafiktyp;
    @XmlElement(name = "Tp")
    protected int tp;
    @XmlElement(name = "Tpind")
    protected int tpind;
    @XmlElement(name = "Fotnot", required = true)
    protected String fotnot;
    protected boolean scase;

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
     * Gets the value of the tp property.
     * 
     */
    public int getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     */
    public void setTp(int value) {
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
