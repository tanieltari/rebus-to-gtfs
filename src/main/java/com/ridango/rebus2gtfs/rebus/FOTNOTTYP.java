
package com.ridango.rebus2gtfs.rebus;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FOTNOT_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FOTNOT_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence maxOccurs="unbounded">
 *         <element name="FOTNOTSPEC" type="{}FOTNOTSPEC_TYP"/>
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
@XmlType(name = "FOTNOT_TYP", propOrder = {
    "fotnotspec"
})
public class FOTNOTTYP {

    @XmlElement(name = "FOTNOTSPEC", required = true)
    protected List<FOTNOTSPECTYP> fotnotspec;
    @XmlAttribute(name = "RebusVersion")
    @XmlSchemaType(name = "anySimpleType")
    protected String rebusVersion;
    @XmlAttribute(name = "CreatedDate")
    @XmlSchemaType(name = "anySimpleType")
    protected String createdDate;

    /**
     * Gets the value of the fotnotspec property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fotnotspec property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFOTNOTSPEC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FOTNOTSPECTYP }
     * </p>
     * 
     * 
     * @return
     *     The value of the fotnotspec property.
     */
    public List<FOTNOTSPECTYP> getFOTNOTSPEC() {
        if (fotnotspec == null) {
            fotnotspec = new ArrayList<>();
        }
        return this.fotnotspec;
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
