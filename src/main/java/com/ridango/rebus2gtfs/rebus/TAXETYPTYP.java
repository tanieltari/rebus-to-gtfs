
package com.ridango.rebus2gtfs.rebus;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TAXETYP_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TAXETYP_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence maxOccurs="unbounded">
 *         <element name="TAXETYPSPEC" type="{}TAXETYPSPEC_TYP"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TAXETYP_TYP", propOrder = {
    "taxetypspec"
})
public class TAXETYPTYP {

    @XmlElement(name = "TAXETYPSPEC", required = true)
    protected List<TAXETYPSPECTYP> taxetypspec;

    /**
     * Gets the value of the taxetypspec property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxetypspec property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTAXETYPSPEC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TAXETYPSPECTYP }
     * </p>
     * 
     * 
     * @return
     *     The value of the taxetypspec property.
     */
    public List<TAXETYPSPECTYP> getTAXETYPSPEC() {
        if (taxetypspec == null) {
            taxetypspec = new ArrayList<>();
        }
        return this.taxetypspec;
    }

}
