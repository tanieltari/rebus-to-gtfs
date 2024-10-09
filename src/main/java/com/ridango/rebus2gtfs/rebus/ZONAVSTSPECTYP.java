
package com.ridango.rebus2gtfs.rebus;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZONAVSTSPEC_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ZONAVSTSPEC_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="zonnr1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="zonnr2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="avst" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *       <attribute name="RebusVersion" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       <attribute name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZONAVSTSPEC_TYP", propOrder = {
    "zonnr1",
    "zonnr2",
    "avst"
})
public class ZONAVSTSPECTYP {

    protected int zonnr1;
    protected int zonnr2;
    protected int avst;
    @XmlAttribute(name = "RebusVersion")
    @XmlSchemaType(name = "anySimpleType")
    protected String rebusVersion;
    @XmlAttribute(name = "CreatedDate")
    @XmlSchemaType(name = "anySimpleType")
    protected String createdDate;

    /**
     * Gets the value of the zonnr1 property.
     * 
     */
    public int getZonnr1() {
        return zonnr1;
    }

    /**
     * Sets the value of the zonnr1 property.
     * 
     */
    public void setZonnr1(int value) {
        this.zonnr1 = value;
    }

    /**
     * Gets the value of the zonnr2 property.
     * 
     */
    public int getZonnr2() {
        return zonnr2;
    }

    /**
     * Sets the value of the zonnr2 property.
     * 
     */
    public void setZonnr2(int value) {
        this.zonnr2 = value;
    }

    /**
     * Gets the value of the avst property.
     * 
     */
    public int getAvst() {
        return avst;
    }

    /**
     * Sets the value of the avst property.
     * 
     */
    public void setAvst(int value) {
        this.avst = value;
    }

    /**
     * Gets the value of the rebusVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRebusVersion() {
        return rebusVersion;
    }

    /**
     * Sets the value of the rebusVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRebusVersion(String value) {
        this.rebusVersion = value;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedDate(String value) {
        this.createdDate = value;
    }

}
