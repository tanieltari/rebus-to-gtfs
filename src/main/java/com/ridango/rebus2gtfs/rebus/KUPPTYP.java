
package com.ridango.rebus2gtfs.rebus;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KUPP_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="KUPP_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence maxOccurs="unbounded">
 *         <element name="Kupp">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="ArbOmrID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   <element name="ArbOmrNamn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="gfallid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   <element name="gfallkod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="gfalltxt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="Omlopp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   <element name="Ftyptxt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="EntID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   <element name="Entreptxt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="HEntreptxt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="AvtalNr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   <element name="DelpaketNamn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <sequence>
 *                     <element name="Masks" type="{}MASK_TYP"/>
 *                   </sequence>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
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
@XmlType(name = "KUPP_TYP", propOrder = {
    "kupp"
})
public class KUPPTYP {

    @XmlElement(name = "Kupp", required = true)
    protected List<KUPPTYP.Kupp> kupp;

    /**
     * Gets the value of the kupp property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kupp property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getKupp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KUPPTYP.Kupp }
     * </p>
     * 
     * 
     * @return
     *     The value of the kupp property.
     */
    public List<KUPPTYP.Kupp> getKupp() {
        if (kupp == null) {
            kupp = new ArrayList<>();
        }
        return this.kupp;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="ArbOmrID" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         <element name="ArbOmrNamn" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         <element name="gfallid" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         <element name="gfallkod" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         <element name="gfalltxt" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         <element name="Omlopp" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         <element name="Ftyptxt" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         <element name="EntID" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         <element name="Entreptxt" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         <element name="HEntreptxt" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         <element name="AvtalNr" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         <element name="DelpaketNamn" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         <sequence>
     *           <element name="Masks" type="{}MASK_TYP"/>
     *         </sequence>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "arbOmrID",
        "arbOmrNamn",
        "gfallid",
        "gfallkod",
        "gfalltxt",
        "omlopp",
        "ftyptxt",
        "entID",
        "entreptxt",
        "hEntreptxt",
        "avtalNr",
        "delpaketNamn",
        "masks"
    })
    public static class Kupp {

        @XmlElement(name = "ArbOmrID")
        protected int arbOmrID;
        @XmlElement(name = "ArbOmrNamn", required = true)
        protected String arbOmrNamn;
        protected int gfallid;
        @XmlElement(required = true)
        protected String gfallkod;
        @XmlElement(required = true)
        protected String gfalltxt;
        @XmlElement(name = "Omlopp")
        protected int omlopp;
        @XmlElement(name = "Ftyptxt", required = true)
        protected String ftyptxt;
        @XmlElement(name = "EntID")
        protected int entID;
        @XmlElement(name = "Entreptxt", required = true)
        protected String entreptxt;
        @XmlElement(name = "HEntreptxt", required = true)
        protected String hEntreptxt;
        @XmlElement(name = "AvtalNr")
        protected int avtalNr;
        @XmlElement(name = "DelpaketNamn", required = true)
        protected String delpaketNamn;
        @XmlElement(name = "Masks", required = true)
        protected MASKTYP masks;

        /**
         * Gets the value of the arbOmrID property.
         * 
         */
        public int getArbOmrID() {
            return arbOmrID;
        }

        /**
         * Sets the value of the arbOmrID property.
         * 
         */
        public void setArbOmrID(int value) {
            this.arbOmrID = value;
        }

        /**
         * Gets the value of the arbOmrNamn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getArbOmrNamn() {
            return arbOmrNamn;
        }

        /**
         * Sets the value of the arbOmrNamn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setArbOmrNamn(String value) {
            this.arbOmrNamn = value;
        }

        /**
         * Gets the value of the gfallid property.
         * 
         */
        public int getGfallid() {
            return gfallid;
        }

        /**
         * Sets the value of the gfallid property.
         * 
         */
        public void setGfallid(int value) {
            this.gfallid = value;
        }

        /**
         * Gets the value of the gfallkod property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGfallkod() {
            return gfallkod;
        }

        /**
         * Sets the value of the gfallkod property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGfallkod(String value) {
            this.gfallkod = value;
        }

        /**
         * Gets the value of the gfalltxt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGfalltxt() {
            return gfalltxt;
        }

        /**
         * Sets the value of the gfalltxt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGfalltxt(String value) {
            this.gfalltxt = value;
        }

        /**
         * Gets the value of the omlopp property.
         * 
         */
        public int getOmlopp() {
            return omlopp;
        }

        /**
         * Sets the value of the omlopp property.
         * 
         */
        public void setOmlopp(int value) {
            this.omlopp = value;
        }

        /**
         * Gets the value of the ftyptxt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFtyptxt() {
            return ftyptxt;
        }

        /**
         * Sets the value of the ftyptxt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFtyptxt(String value) {
            this.ftyptxt = value;
        }

        /**
         * Gets the value of the entID property.
         * 
         */
        public int getEntID() {
            return entID;
        }

        /**
         * Sets the value of the entID property.
         * 
         */
        public void setEntID(int value) {
            this.entID = value;
        }

        /**
         * Gets the value of the entreptxt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEntreptxt() {
            return entreptxt;
        }

        /**
         * Sets the value of the entreptxt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEntreptxt(String value) {
            this.entreptxt = value;
        }

        /**
         * Gets the value of the hEntreptxt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHEntreptxt() {
            return hEntreptxt;
        }

        /**
         * Sets the value of the hEntreptxt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHEntreptxt(String value) {
            this.hEntreptxt = value;
        }

        /**
         * Gets the value of the avtalNr property.
         * 
         */
        public int getAvtalNr() {
            return avtalNr;
        }

        /**
         * Sets the value of the avtalNr property.
         * 
         */
        public void setAvtalNr(int value) {
            this.avtalNr = value;
        }

        /**
         * Gets the value of the delpaketNamn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDelpaketNamn() {
            return delpaketNamn;
        }

        /**
         * Sets the value of the delpaketNamn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDelpaketNamn(String value) {
            this.delpaketNamn = value;
        }

        /**
         * Gets the value of the masks property.
         * 
         * @return
         *     possible object is
         *     {@link MASKTYP }
         *     
         */
        public MASKTYP getMasks() {
            return masks;
        }

        /**
         * Sets the value of the masks property.
         * 
         * @param value
         *     allowed object is
         *     {@link MASKTYP }
         *     
         */
        public void setMasks(MASKTYP value) {
            this.masks = value;
        }

    }

}
