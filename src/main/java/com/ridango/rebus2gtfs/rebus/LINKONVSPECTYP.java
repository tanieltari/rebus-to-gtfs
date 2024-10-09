
package com.ridango.rebus2gtfs.rebus;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LINKONVSPEC_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="LINKONVSPEC_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="LokalIss">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               <minInclusive value="-2147483648"/>
 *               <maxInclusive value="2147483647"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="LokalLinjenr">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               <minInclusive value="-2147483648"/>
 *               <maxInclusive value="2147483647"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="RsimIss" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="RsimLinjenr">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               <minInclusive value="-2147483648"/>
 *               <maxInclusive value="2147483647"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LINKONVSPEC_TYP", propOrder = {
    "lokalIss",
    "lokalLinjenr",
    "rsimIss",
    "rsimLinjenr"
})
public class LINKONVSPECTYP {

    @XmlElement(name = "LokalIss")
    protected int lokalIss;
    /**
     * Lokalt linjenummer
     * 
     */
    @XmlElement(name = "LokalLinjenr")
    protected int lokalLinjenr;
    @XmlElement(name = "RsimIss")
    protected int rsimIss;
    /**
     * Linjenummer med prefix
     * 
     */
    @XmlElement(name = "RsimLinjenr")
    protected int rsimLinjenr;

    /**
     * Gets the value of the lokalIss property.
     * 
     */
    public int getLokalIss() {
        return lokalIss;
    }

    /**
     * Sets the value of the lokalIss property.
     * 
     */
    public void setLokalIss(int value) {
        this.lokalIss = value;
    }

    /**
     * Lokalt linjenummer
     * 
     */
    public int getLokalLinjenr() {
        return lokalLinjenr;
    }

    /**
     * Sets the value of the lokalLinjenr property.
     * 
     */
    public void setLokalLinjenr(int value) {
        this.lokalLinjenr = value;
    }

    /**
     * Gets the value of the rsimIss property.
     * 
     */
    public int getRsimIss() {
        return rsimIss;
    }

    /**
     * Sets the value of the rsimIss property.
     * 
     */
    public void setRsimIss(int value) {
        this.rsimIss = value;
    }

    /**
     * Linjenummer med prefix
     * 
     */
    public int getRsimLinjenr() {
        return rsimLinjenr;
    }

    /**
     * Sets the value of the rsimLinjenr property.
     * 
     */
    public void setRsimLinjenr(int value) {
        this.rsimLinjenr = value;
    }

}
