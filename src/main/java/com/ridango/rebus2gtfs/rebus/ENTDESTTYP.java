
package com.ridango.rebus2gtfs.rebus;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ENTDEST_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ENTDEST_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence maxOccurs="unbounded" minOccurs="0">
 *         <element name="ENTDESTSPEC" type="{}ENTDESTSPEC_TYP"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENTDEST_TYP", propOrder = {
    "entdestspec"
})
public class ENTDESTTYP {

    @XmlElement(name = "ENTDESTSPEC")
    protected List<ENTDESTSPECTYP> entdestspec;

    /**
     * Gets the value of the entdestspec property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entdestspec property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getENTDESTSPEC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ENTDESTSPECTYP }
     * </p>
     * 
     * 
     * @return
     *     The value of the entdestspec property.
     */
    public List<ENTDESTSPECTYP> getENTDESTSPEC() {
        if (entdestspec == null) {
            entdestspec = new ArrayList<>();
        }
        return this.entdestspec;
    }

}
