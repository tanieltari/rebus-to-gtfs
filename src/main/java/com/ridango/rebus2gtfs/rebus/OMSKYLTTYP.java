
package com.ridango.rebus2gtfs.rebus;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OMSKYLT_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OMSKYLT_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence maxOccurs="unbounded">
 *         <element name="OMSKYLTSPEC" type="{}OMSKYLTSPEC_TYP"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OMSKYLT_TYP", propOrder = {
    "omskyltspec"
})
public class OMSKYLTTYP {

    @XmlElement(name = "OMSKYLTSPEC", required = true)
    protected List<OMSKYLTSPECTYP> omskyltspec;

    /**
     * Gets the value of the omskyltspec property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the omskyltspec property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOMSKYLTSPEC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OMSKYLTSPECTYP }
     * </p>
     * 
     * 
     * @return
     *     The value of the omskyltspec property.
     */
    public List<OMSKYLTSPECTYP> getOMSKYLTSPEC() {
        if (omskyltspec == null) {
            omskyltspec = new ArrayList<>();
        }
        return this.omskyltspec;
    }

}
