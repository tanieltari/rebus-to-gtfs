
package com.ridango.rebus2gtfs.rebus;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SAMLIN_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SAMLIN_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence maxOccurs="unbounded">
 *         <element name="SAMLINSPEC" type="{}SAMLINSPEC_TYP"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SAMLIN_TYP", propOrder = {
    "samlinspec"
})
public class SAMLINTYP {

    @XmlElement(name = "SAMLINSPEC", required = true)
    protected List<SAMLINSPECTYP> samlinspec;

    /**
     * Gets the value of the samlinspec property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the samlinspec property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSAMLINSPEC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SAMLINSPECTYP }
     * </p>
     * 
     * 
     * @return
     *     The value of the samlinspec property.
     */
    public List<SAMLINSPECTYP> getSAMLINSPEC() {
        if (samlinspec == null) {
            samlinspec = new ArrayList<>();
        }
        return this.samlinspec;
    }

}
