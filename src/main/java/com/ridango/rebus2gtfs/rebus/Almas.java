
package com.ridango.rebus2gtfs.rebus;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.*;


/**
 * <p>Java class for Almas complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Almas">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Almadag" type="{}Almadag_TYP" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PeriodGrupper" type="{}PeriodGrupper_TYP" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlRootElement(name = "Almas")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Almas", propOrder = {
    "almadag",
    "periodGrupper"
})
public class Almas {

    @XmlElement(name = "Almadag")
    protected List<AlmadagTYP> almadag;
    @XmlElement(name = "PeriodGrupper")
    protected List<PeriodGrupperTYP> periodGrupper;
    @XmlAttribute(name = "RebusVersion")
    @XmlSchemaType(name = "anySimpleType")
    protected String rebusVersion;
    @XmlAttribute(name = "CreatedDate")
    @XmlSchemaType(name = "anySimpleType")
    protected String createdDate;

    /**
     * Gets the value of the almadag property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the almadag property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAlmadag().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlmadagTYP }
     * </p>
     * 
     * 
     * @return
     *     The value of the almadag property.
     */
    public List<AlmadagTYP> getAlmadag() {
        if (almadag == null) {
            almadag = new ArrayList<>();
        }
        return this.almadag;
    }

    /**
     * Gets the value of the periodGrupper property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the periodGrupper property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPeriodGrupper().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PeriodGrupperTYP }
     * </p>
     * 
     * 
     * @return
     *     The value of the periodGrupper property.
     */
    public List<PeriodGrupperTYP> getPeriodGrupper() {
        if (periodGrupper == null) {
            periodGrupper = new ArrayList<>();
        }
        return this.periodGrupper;
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
