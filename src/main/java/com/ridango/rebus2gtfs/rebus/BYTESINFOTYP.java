
package com.ridango.rebus2gtfs.rebus;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BYTESINFO_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="BYTESINFO_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence maxOccurs="unbounded">
 *         <element name="BYTESINFOSPEC" type="{}BYTESINFOSPEC_TYP"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BYTESINFO_TYP", propOrder = {
    "bytesinfospec"
})
public class BYTESINFOTYP {

    @XmlElement(name = "BYTESINFOSPEC", required = true)
    protected List<BYTESINFOSPECTYP> bytesinfospec;

    /**
     * Gets the value of the bytesinfospec property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bytesinfospec property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getBYTESINFOSPEC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BYTESINFOSPECTYP }
     * </p>
     * 
     * 
     * @return
     *     The value of the bytesinfospec property.
     */
    public List<BYTESINFOSPECTYP> getBYTESINFOSPEC() {
        if (bytesinfospec == null) {
            bytesinfospec = new ArrayList<>();
        }
        return this.bytesinfospec;
    }

}
