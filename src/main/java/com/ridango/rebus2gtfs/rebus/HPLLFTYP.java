
package com.ridango.rebus2gtfs.rebus;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HPLLF_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HPLLF_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence maxOccurs="unbounded">
 *         <element name="HPLLFSPEC" type="{}HPLLFSPEC_TYP"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HPLLF_TYP", propOrder = {
    "hpllfspec"
})
public class HPLLFTYP {

    @XmlElement(name = "HPLLFSPEC", required = true)
    protected List<HPLLFSPECTYP> hpllfspec;

    /**
     * Gets the value of the hpllfspec property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hpllfspec property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHPLLFSPEC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HPLLFSPECTYP }
     * </p>
     * 
     * 
     * @return
     *     The value of the hpllfspec property.
     */
    public List<HPLLFSPECTYP> getHPLLFSPEC() {
        if (hpllfspec == null) {
            hpllfspec = new ArrayList<>();
        }
        return this.hpllfspec;
    }

}
