
package com.ridango.rebus2gtfs.rebus;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LINJEUNION_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="LINJEUNION_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence maxOccurs="unbounded">
 *         <element name="LINJEUNIONSPEC" type="{}LINJEUNIONSPEC_TYP"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LINJEUNION_TYP", propOrder = {
    "linjeunionspec"
})
public class LINJEUNIONTYP {

    @XmlElement(name = "LINJEUNIONSPEC", required = true)
    protected List<LINJEUNIONSPECTYP> linjeunionspec;

    /**
     * Gets the value of the linjeunionspec property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linjeunionspec property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getLINJEUNIONSPEC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LINJEUNIONSPECTYP }
     * </p>
     * 
     * 
     * @return
     *     The value of the linjeunionspec property.
     */
    public List<LINJEUNIONSPECTYP> getLINJEUNIONSPEC() {
        if (linjeunionspec == null) {
            linjeunionspec = new ArrayList<>();
        }
        return this.linjeunionspec;
    }

}
