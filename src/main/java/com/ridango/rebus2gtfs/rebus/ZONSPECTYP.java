
package com.ridango.rebus2gtfs.rebus;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZONSPEC_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ZONSPEC_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="zonnr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="zonnrOrg" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="zongid" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="zonnamn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="storzon">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="6"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="zontyp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="zontypnamn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="kommunnr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="zonlikhet" type="{}ZONLIKHET_TYP"/>
 *         <element name="GisAreas">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence maxOccurs="unbounded" minOccurs="0">
 *                   <element name="GisArea">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence maxOccurs="unbounded">
 *                             <element name="nod">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <attribute name="seq" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                     <attribute name="N" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                     <attribute name="E" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                   </restriction>
 *                                 </complexContent>
 *                               </complexType>
 *                             </element>
 *                           </sequence>
 *                           <attribute name="CSystem" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="bZonPolyCalc" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZONSPEC_TYP", propOrder = {
    "zonnr",
    "zonnrOrg",
    "zongid",
    "zonnamn",
    "storzon",
    "zontyp",
    "zontypnamn",
    "kommunnr",
    "zonlikhet",
    "gisAreas",
    "bZonPolyCalc"
})
public class ZONSPECTYP {

    protected int zonnr;
    /**
     * Används enbart av SYD och MITT
     * 
     */
    protected int zonnrOrg;
    protected long zongid;
    @XmlElement(required = true, nillable = true)
    protected String zonnamn;
    @XmlElement(required = true, nillable = true)
    protected String storzon;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer zontyp;
    /**
     * Namnet på zontypen från enum.zontyp
     * 
     */
    @XmlElement(required = true)
    protected String zontypnamn;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer kommunnr;
    @XmlElement(required = true)
    protected ZONLIKHETTYP zonlikhet;
    @XmlElement(name = "GisAreas", required = true)
    protected ZONSPECTYP.GisAreas gisAreas;
    /**
     * Om true skall adressens koordinat zonberäknas ur zonens Gisarea vid närområde. Annars tas närområdets hållplats zon.
     * 
     */
    protected boolean bZonPolyCalc;

    /**
     * Gets the value of the zonnr property.
     * 
     */
    public int getZonnr() {
        return zonnr;
    }

    /**
     * Sets the value of the zonnr property.
     * 
     */
    public void setZonnr(int value) {
        this.zonnr = value;
    }

    /**
     * Används enbart av SYD och MITT
     * 
     */
    public int getZonnrOrg() {
        return zonnrOrg;
    }

    /**
     * Sets the value of the zonnrOrg property.
     * 
     */
    public void setZonnrOrg(int value) {
        this.zonnrOrg = value;
    }

    /**
     * Gets the value of the zongid property.
     * 
     */
    public long getZongid() {
        return zongid;
    }

    /**
     * Sets the value of the zongid property.
     * 
     */
    public void setZongid(long value) {
        this.zongid = value;
    }

    /**
     * Gets the value of the zonnamn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZonnamn() {
        return zonnamn;
    }

    /**
     * Sets the value of the zonnamn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZonnamn(String value) {
        this.zonnamn = value;
    }

    /**
     * Gets the value of the storzon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStorzon() {
        return storzon;
    }

    /**
     * Sets the value of the storzon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStorzon(String value) {
        this.storzon = value;
    }

    /**
     * Gets the value of the zontyp property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getZontyp() {
        return zontyp;
    }

    /**
     * Sets the value of the zontyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setZontyp(Integer value) {
        this.zontyp = value;
    }

    /**
     * Namnet på zontypen från enum.zontyp
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZontypnamn() {
        return zontypnamn;
    }

    /**
     * Sets the value of the zontypnamn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getZontypnamn()
     */
    public void setZontypnamn(String value) {
        this.zontypnamn = value;
    }

    /**
     * Gets the value of the kommunnr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKommunnr() {
        return kommunnr;
    }

    /**
     * Sets the value of the kommunnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKommunnr(Integer value) {
        this.kommunnr = value;
    }

    /**
     * Gets the value of the zonlikhet property.
     * 
     * @return
     *     possible object is
     *     {@link ZONLIKHETTYP }
     *     
     */
    public ZONLIKHETTYP getZonlikhet() {
        return zonlikhet;
    }

    /**
     * Sets the value of the zonlikhet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZONLIKHETTYP }
     *     
     */
    public void setZonlikhet(ZONLIKHETTYP value) {
        this.zonlikhet = value;
    }

    /**
     * Gets the value of the gisAreas property.
     * 
     * @return
     *     possible object is
     *     {@link ZONSPECTYP.GisAreas }
     *     
     */
    public ZONSPECTYP.GisAreas getGisAreas() {
        return gisAreas;
    }

    /**
     * Sets the value of the gisAreas property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZONSPECTYP.GisAreas }
     *     
     */
    public void setGisAreas(ZONSPECTYP.GisAreas value) {
        this.gisAreas = value;
    }

    /**
     * Om true skall adressens koordinat zonberäknas ur zonens Gisarea vid närområde. Annars tas närområdets hållplats zon.
     * 
     */
    public boolean isBZonPolyCalc() {
        return bZonPolyCalc;
    }

    /**
     * Sets the value of the bZonPolyCalc property.
     * 
     */
    public void setBZonPolyCalc(boolean value) {
        this.bZonPolyCalc = value;
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
     *       <sequence maxOccurs="unbounded" minOccurs="0">
     *         <element name="GisArea">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence maxOccurs="unbounded">
     *                   <element name="nod">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <attribute name="seq" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                           <attribute name="N" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                           <attribute name="E" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                 </sequence>
     *                 <attribute name="CSystem" type="{http://www.w3.org/2001/XMLSchema}int" />
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
    @XmlType(name = "", propOrder = {
        "gisArea"
    })
    public static class GisAreas {

        @XmlElement(name = "GisArea")
        protected List<ZONSPECTYP.GisAreas.GisArea> gisArea;

        /**
         * Gets the value of the gisArea property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the gisArea property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getGisArea().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZONSPECTYP.GisAreas.GisArea }
         * </p>
         * 
         * 
         * @return
         *     The value of the gisArea property.
         */
        public List<ZONSPECTYP.GisAreas.GisArea> getGisArea() {
            if (gisArea == null) {
                gisArea = new ArrayList<>();
            }
            return this.gisArea;
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
         *       <sequence maxOccurs="unbounded">
         *         <element name="nod">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <attribute name="seq" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                 <attribute name="N" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                 <attribute name="E" type="{http://www.w3.org/2001/XMLSchema}double" />
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *       </sequence>
         *       <attribute name="CSystem" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     </restriction>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "nod"
        })
        public static class GisArea {

            @XmlElement(required = true)
            protected List<ZONSPECTYP.GisAreas.GisArea.Nod> nod;
            /**
             * Koordinatsystemnummer
             * 
             */
            @XmlAttribute(name = "CSystem")
            protected Integer cSystem;

            /**
             * Gets the value of the nod property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the nod property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getNod().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ZONSPECTYP.GisAreas.GisArea.Nod }
             * </p>
             * 
             * 
             * @return
             *     The value of the nod property.
             */
            public List<ZONSPECTYP.GisAreas.GisArea.Nod> getNod() {
                if (nod == null) {
                    nod = new ArrayList<>();
                }
                return this.nod;
            }

            /**
             * Koordinatsystemnummer
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getCSystem() {
                return cSystem;
            }

            /**
             * Sets the value of the cSystem property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             * @see #getCSystem()
             */
            public void setCSystem(Integer value) {
                this.cSystem = value;
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
             *       <attribute name="seq" type="{http://www.w3.org/2001/XMLSchema}int" />
             *       <attribute name="N" type="{http://www.w3.org/2001/XMLSchema}double" />
             *       <attribute name="E" type="{http://www.w3.org/2001/XMLSchema}double" />
             *     </restriction>
             *   </complexContent>
             * </complexType>
             * }</pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Nod {

                @XmlAttribute(name = "seq")
                protected Integer seq;
                @XmlAttribute(name = "N")
                protected Double n;
                @XmlAttribute(name = "E")
                protected Double e;

                /**
                 * Gets the value of the seq property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getSeq() {
                    return seq;
                }

                /**
                 * Sets the value of the seq property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setSeq(Integer value) {
                    this.seq = value;
                }

                /**
                 * Gets the value of the n property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                public Double getN() {
                    return n;
                }

                /**
                 * Sets the value of the n property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                public void setN(Double value) {
                    this.n = value;
                }

                /**
                 * Gets the value of the e property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                public Double getE() {
                    return e;
                }

                /**
                 * Sets the value of the e property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                public void setE(Double value) {
                    this.e = value;
                }

            }

        }

    }

}
