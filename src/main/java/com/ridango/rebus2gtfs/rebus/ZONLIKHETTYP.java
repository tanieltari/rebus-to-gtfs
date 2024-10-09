
package com.ridango.rebus2gtfs.rebus;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZONLIKHET_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ZONLIKHET_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence maxOccurs="unbounded" minOccurs="0">
 *         <element name="ZONLIKHETSPEC" type="{}ZONLIKHETSPEC_TYP"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZONLIKHET_TYP", propOrder = {
    "zonlikhetspec"
})
public class ZONLIKHETTYP {

    @XmlElement(name = "ZONLIKHETSPEC")
    protected List<ZONLIKHETSPECTYP> zonlikhetspec;

    /**
     * Gets the value of the zonlikhetspec property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zonlikhetspec property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getZONLIKHETSPEC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZONLIKHETSPECTYP }
     * </p>
     * 
     * 
     * @return
     *     The value of the zonlikhetspec property.
     */
    public List<ZONLIKHETSPECTYP> getZONLIKHETSPEC() {
        if (zonlikhetspec == null) {
            zonlikhetspec = new ArrayList<>();
        }
        return this.zonlikhetspec;
    }

}
