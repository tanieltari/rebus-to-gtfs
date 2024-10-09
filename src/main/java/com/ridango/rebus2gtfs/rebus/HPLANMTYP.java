
package com.ridango.rebus2gtfs.rebus;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HPLANM_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HPLANM_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence maxOccurs="unbounded">
 *         <element name="HPLANMSPEC" type="{}HPLANMSPEC_TYP"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HPLANM_TYP", propOrder = {
    "hplanmspec"
})
public class HPLANMTYP {

    @XmlElement(name = "HPLANMSPEC", required = true)
    protected List<HPLANMSPECTYP> hplanmspec;

    /**
     * Gets the value of the hplanmspec property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hplanmspec property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHPLANMSPEC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HPLANMSPECTYP }
     * </p>
     * 
     * 
     * @return
     *     The value of the hplanmspec property.
     */
    public List<HPLANMSPECTYP> getHPLANMSPEC() {
        if (hplanmspec == null) {
            hplanmspec = new ArrayList<>();
        }
        return this.hplanmspec;
    }

}
