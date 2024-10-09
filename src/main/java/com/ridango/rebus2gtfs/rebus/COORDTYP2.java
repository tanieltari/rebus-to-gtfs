
package com.ridango.rebus2gtfs.rebus;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.*;


/**
 * <p>Java class for COORD_TYP2 complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="COORD_TYP2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence maxOccurs="unbounded">
 *         <element name="COORD" type="{}COORDSPEC_TYP2"/>
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
@XmlRootElement(name = "COORD_TYP2")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COORD_TYP2", propOrder = {
    "coord"
})
public class COORDTYP2 {

    @XmlElement(name = "COORD", required = true)
    protected List<COORDSPECTYP2> coord;
    @XmlAttribute(name = "RebusVersion")
    @XmlSchemaType(name = "anySimpleType")
    protected String rebusVersion;
    @XmlAttribute(name = "CreatedDate")
    @XmlSchemaType(name = "anySimpleType")
    protected String createdDate;

    /**
     * Gets the value of the coord property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coord property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCOORD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COORDSPECTYP2 }
     * </p>
     * 
     * 
     * @return
     *     The value of the coord property.
     */
    public List<COORDSPECTYP2> getCOORD() {
        if (coord == null) {
            coord = new ArrayList<>();
        }
        return this.coord;
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
