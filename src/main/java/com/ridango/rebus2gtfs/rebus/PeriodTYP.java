
package com.ridango.rebus2gtfs.rebus;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Period_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Period_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PeriodId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Period" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="PeriodKlartext" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="IsSchoolPeriod" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Period_TYP", propOrder = {
    "periodId",
    "period",
    "periodKlartext",
    "isSchoolPeriod"
})
public class PeriodTYP {

    @XmlElement(name = "PeriodId")
    protected int periodId;
    @XmlElement(name = "Period")
    protected int period;
    @XmlElement(name = "PeriodKlartext", required = true)
    protected String periodKlartext;
    @XmlElement(name = "IsSchoolPeriod")
    protected boolean isSchoolPeriod;

    /**
     * Gets the value of the periodId property.
     * 
     */
    public int getPeriodId() {
        return periodId;
    }

    /**
     * Sets the value of the periodId property.
     * 
     */
    public void setPeriodId(int value) {
        this.periodId = value;
    }

    /**
     * Gets the value of the period property.
     * 
     */
    public int getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     */
    public void setPeriod(int value) {
        this.period = value;
    }

    /**
     * Gets the value of the periodKlartext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodKlartext() {
        return periodKlartext;
    }

    /**
     * Sets the value of the periodKlartext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodKlartext(String value) {
        this.periodKlartext = value;
    }

    /**
     * Gets the value of the isSchoolPeriod property.
     * 
     */
    public boolean isIsSchoolPeriod() {
        return isSchoolPeriod;
    }

    /**
     * Sets the value of the isSchoolPeriod property.
     * 
     */
    public void setIsSchoolPeriod(boolean value) {
        this.isSchoolPeriod = value;
    }

}
