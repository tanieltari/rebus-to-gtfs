
package com.ridango.rebus2gtfs.rebus;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.*;


/**
 * <p>Java class for STOP_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="STOP_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence maxOccurs="unbounded">
 *         <element name="STOPAREALST" type="{}STOPAREA_TYP"/>
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
@XmlRootElement(name = "STOP_TYP")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STOP_TYP", propOrder = {
    "stoparealst"
})
public class STOPTYP {

    @XmlElement(name = "STOPAREALST", required = true)
    protected List<STOPAREATYP> stoparealst;
    @XmlAttribute(name = "RebusVersion")
    @XmlSchemaType(name = "anySimpleType")
    protected String rebusVersion;
    @XmlAttribute(name = "CreatedDate")
    @XmlSchemaType(name = "anySimpleType")
    protected String createdDate;

    /**
     * Gets the value of the stoparealst property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stoparealst property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSTOPAREALST().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link STOPAREATYP }
     * </p>
     * 
     * 
     * @return
     *     The value of the stoparealst property.
     */
    public List<STOPAREATYP> getSTOPAREALST() {
        if (stoparealst == null) {
            stoparealst = new ArrayList<>();
        }
        return this.stoparealst;
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
