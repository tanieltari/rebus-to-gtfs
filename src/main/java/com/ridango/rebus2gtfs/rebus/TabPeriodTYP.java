
package com.ridango.rebus2gtfs.rebus;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TabPeriod_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TabPeriod_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TP" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="TPind" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Periods" type="{}Period_TYP" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TabPeriod_TYP", propOrder = {
    "tp",
    "tPind",
    "periods"
})
public class TabPeriodTYP {

    @XmlElement(name = "TP")
    protected int tp;
    @XmlElement(name = "TPind")
    protected int tPind;
    @XmlElement(name = "Periods")
    protected List<PeriodTYP> periods;

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
     * Gets the value of the periods property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the periods property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPeriods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PeriodTYP }
     * </p>
     * 
     * 
     * @return
     *     The value of the periods property.
     */
    public List<PeriodTYP> getPeriods() {
        if (periods == null) {
            periods = new ArrayList<>();
        }
        return this.periods;
    }

}
