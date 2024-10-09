
package com.ridango.rebus2gtfs.rebus;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TRAFIKTYP_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TRAFIKTYP_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence maxOccurs="unbounded" minOccurs="0">
 *         <element name="TRAFIKTYPSPEC" type="{}TRAFIKTYPSPEC_TYP"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TRAFIKTYP_TYP", propOrder = {
    "trafiktypspec"
})
public class TRAFIKTYPTYP {

    @XmlElement(name = "TRAFIKTYPSPEC")
    protected List<TRAFIKTYPSPECTYP> trafiktypspec;

    /**
     * Gets the value of the trafiktypspec property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trafiktypspec property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTRAFIKTYPSPEC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TRAFIKTYPSPECTYP }
     * </p>
     * 
     * 
     * @return
     *     The value of the trafiktypspec property.
     */
    public List<TRAFIKTYPSPECTYP> getTRAFIKTYPSPEC() {
        if (trafiktypspec == null) {
            trafiktypspec = new ArrayList<>();
        }
        return this.trafiktypspec;
    }

}
