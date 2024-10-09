
package com.ridango.rebus2gtfs.rebus;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SAMTRAFIKRESULT_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SAMTRAFIKRESULT_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence maxOccurs="unbounded">
 *         <element name="SAMTRAFIKRESULTSPEC" type="{}SAMTRAFIKSPEC_TYP"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SAMTRAFIKRESULT_TYP", propOrder = {
    "samtrafikresultspec"
})
public class SAMTRAFIKRESULTTYP {

    @XmlElement(name = "SAMTRAFIKRESULTSPEC", required = true)
    protected List<SAMTRAFIKSPECTYP> samtrafikresultspec;

    /**
     * Gets the value of the samtrafikresultspec property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the samtrafikresultspec property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSAMTRAFIKRESULTSPEC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SAMTRAFIKSPECTYP }
     * </p>
     * 
     * 
     * @return
     *     The value of the samtrafikresultspec property.
     */
    public List<SAMTRAFIKSPECTYP> getSAMTRAFIKRESULTSPEC() {
        if (samtrafikresultspec == null) {
            samtrafikresultspec = new ArrayList<>();
        }
        return this.samtrafikresultspec;
    }

}
