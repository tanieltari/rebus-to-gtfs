
package com.ridango.rebus2gtfs.rebus;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Entreprenor complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Entreprenor">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence maxOccurs="unbounded">
 *         <element name="Entreprenortyp" type="{}Entreprenor_typ"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Entreprenor", propOrder = {
    "entreprenortyp"
})
public class Entreprenor {

    @XmlElement(name = "Entreprenortyp", required = true)
    protected List<EntreprenorTyp> entreprenortyp;

    /**
     * Gets the value of the entreprenortyp property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entreprenortyp property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getEntreprenortyp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntreprenorTyp }
     * </p>
     * 
     * 
     * @return
     *     The value of the entreprenortyp property.
     */
    public List<EntreprenorTyp> getEntreprenortyp() {
        if (entreprenortyp == null) {
            entreprenortyp = new ArrayList<>();
        }
        return this.entreprenortyp;
    }

}
