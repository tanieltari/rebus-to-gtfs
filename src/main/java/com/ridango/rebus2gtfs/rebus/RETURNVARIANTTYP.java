
package com.ridango.rebus2gtfs.rebus;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RETURNVARIANT_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RETURNVARIANT_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FK_TurID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Linje" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Rikt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Kvar" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RETURNVARIANT_TYP", propOrder = {
    "fkTurID",
    "linje",
    "rikt",
    "kvar"
})
public class RETURNVARIANTTYP {

    @XmlElement(name = "FK_TurID")
    protected int fkTurID;
    @XmlElement(name = "Linje")
    protected int linje;
    @XmlElement(name = "Rikt")
    protected int rikt;
    @XmlElement(name = "Kvar")
    protected int kvar;

    /**
     * Gets the value of the fkTurID property.
     * 
     */
    public int getFKTurID() {
        return fkTurID;
    }

    /**
     * Sets the value of the fkTurID property.
     * 
     */
    public void setFKTurID(int value) {
        this.fkTurID = value;
    }

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
     * Gets the value of the rikt property.
     * 
     */
    public int getRikt() {
        return rikt;
    }

    /**
     * Sets the value of the rikt property.
     * 
     */
    public void setRikt(int value) {
        this.rikt = value;
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

}
