
package com.ridango.rebus2gtfs.rebus;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LINKSPEC_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="LINKSPEC_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FJourneyPatternPointGid" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="Fdesignation">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="8"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="fhplnr">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               <minInclusive value="-2147483648"/>
 *               <maxInclusive value="2147483647"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="TJourneyPatternPointGid" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="Tdesignation">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="8"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="thplnr">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               <minInclusive value="-2147483648"/>
 *               <maxInclusive value="2147483647"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="avst">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               <minInclusive value="-2147483648"/>
 *               <maxInclusive value="2147483647"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="hast">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               <minInclusive value="-2147483648"/>
 *               <maxInclusive value="2147483647"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="TransportModeTypeNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <sequence>
 *           <element name="GisLinks">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence maxOccurs="unbounded" minOccurs="0">
 *                     <element name="Gislink">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence maxOccurs="unbounded">
 *                               <element name="nd">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       <attribute name="seq" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                       <attribute name="N" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                       <attribute name="E" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                     </restriction>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                             </sequence>
 *                             <attribute name="CSystem" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                   </sequence>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *         </sequence>
 *         <sequence>
 *           <element name="Kommuns">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence maxOccurs="unbounded">
 *                     <element name="Kommunfordelning">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="Procent" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                               <element name="avstand" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                               <element name="Kommunkod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                   </sequence>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
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
@XmlType(name = "LINKSPEC_TYP", propOrder = {
    "fJourneyPatternPointGid",
    "fdesignation",
    "fhplnr",
    "tJourneyPatternPointGid",
    "tdesignation",
    "thplnr",
    "avst",
    "hast",
    "transportModeTypeNumber",
    "gisLinks",
    "kommuns"
})
public class LINKSPECTYP {

    @XmlElement(name = "FJourneyPatternPointGid")
    protected long fJourneyPatternPointGid;
    /**
     * Läge
     * 
     */
    @XmlElement(name = "Fdesignation", required = true, nillable = true)
    protected String fdesignation;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer fhplnr;
    @XmlElement(name = "TJourneyPatternPointGid")
    protected long tJourneyPatternPointGid;
    /**
     * Läge
     * 
     */
    @XmlElement(name = "Tdesignation", required = true, nillable = true)
    protected String tdesignation;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer thplnr;
    /**
     * Payed distance
     * 
     */
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer avst;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer hast;
    @XmlElement(name = "TransportModeTypeNumber")
    protected int transportModeTypeNumber;
    @XmlElement(name = "GisLinks", required = true)
    protected LINKSPECTYP.GisLinks gisLinks;
    @XmlElement(name = "Kommuns", required = true)
    protected LINKSPECTYP.Kommuns kommuns;

    /**
     * Gets the value of the fJourneyPatternPointGid property.
     * 
     */
    public long getFJourneyPatternPointGid() {
        return fJourneyPatternPointGid;
    }

    /**
     * Sets the value of the fJourneyPatternPointGid property.
     * 
     */
    public void setFJourneyPatternPointGid(long value) {
        this.fJourneyPatternPointGid = value;
    }

    /**
     * Läge
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFdesignation() {
        return fdesignation;
    }

    /**
     * Sets the value of the fdesignation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFdesignation()
     */
    public void setFdesignation(String value) {
        this.fdesignation = value;
    }

    /**
     * Gets the value of the fhplnr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFhplnr() {
        return fhplnr;
    }

    /**
     * Sets the value of the fhplnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFhplnr(Integer value) {
        this.fhplnr = value;
    }

    /**
     * Gets the value of the tJourneyPatternPointGid property.
     * 
     */
    public long getTJourneyPatternPointGid() {
        return tJourneyPatternPointGid;
    }

    /**
     * Sets the value of the tJourneyPatternPointGid property.
     * 
     */
    public void setTJourneyPatternPointGid(long value) {
        this.tJourneyPatternPointGid = value;
    }

    /**
     * Läge
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTdesignation() {
        return tdesignation;
    }

    /**
     * Sets the value of the tdesignation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTdesignation()
     */
    public void setTdesignation(String value) {
        this.tdesignation = value;
    }

    /**
     * Gets the value of the thplnr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getThplnr() {
        return thplnr;
    }

    /**
     * Sets the value of the thplnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setThplnr(Integer value) {
        this.thplnr = value;
    }

    /**
     * Payed distance
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAvst() {
        return avst;
    }

    /**
     * Sets the value of the avst property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getAvst()
     */
    public void setAvst(Integer value) {
        this.avst = value;
    }

    /**
     * Gets the value of the hast property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHast() {
        return hast;
    }

    /**
     * Sets the value of the hast property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHast(Integer value) {
        this.hast = value;
    }

    /**
     * Gets the value of the transportModeTypeNumber property.
     * 
     */
    public int getTransportModeTypeNumber() {
        return transportModeTypeNumber;
    }

    /**
     * Sets the value of the transportModeTypeNumber property.
     * 
     */
    public void setTransportModeTypeNumber(int value) {
        this.transportModeTypeNumber = value;
    }

    /**
     * Gets the value of the gisLinks property.
     * 
     * @return
     *     possible object is
     *     {@link LINKSPECTYP.GisLinks }
     *     
     */
    public LINKSPECTYP.GisLinks getGisLinks() {
        return gisLinks;
    }

    /**
     * Sets the value of the gisLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link LINKSPECTYP.GisLinks }
     *     
     */
    public void setGisLinks(LINKSPECTYP.GisLinks value) {
        this.gisLinks = value;
    }

    /**
     * Gets the value of the kommuns property.
     * 
     * @return
     *     possible object is
     *     {@link LINKSPECTYP.Kommuns }
     *     
     */
    public LINKSPECTYP.Kommuns getKommuns() {
        return kommuns;
    }

    /**
     * Sets the value of the kommuns property.
     * 
     * @param value
     *     allowed object is
     *     {@link LINKSPECTYP.Kommuns }
     *     
     */
    public void setKommuns(LINKSPECTYP.Kommuns value) {
        this.kommuns = value;
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
     *         <element name="Gislink">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence maxOccurs="unbounded">
     *                   <element name="nd">
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
        "gislink"
    })
    public static class GisLinks {

        @XmlElement(name = "Gislink")
        protected List<LINKSPECTYP.GisLinks.Gislink> gislink;

        /**
         * Gets the value of the gislink property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the gislink property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getGislink().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LINKSPECTYP.GisLinks.Gislink }
         * </p>
         * 
         * 
         * @return
         *     The value of the gislink property.
         */
        public List<LINKSPECTYP.GisLinks.Gislink> getGislink() {
            if (gislink == null) {
                gislink = new ArrayList<>();
            }
            return this.gislink;
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
         *         <element name="nd">
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
            "nd"
        })
        public static class Gislink {

            @XmlElement(required = true)
            protected List<LINKSPECTYP.GisLinks.Gislink.Nd> nd;
            /**
             * Koordinatsystemnummer
             * 
             */
            @XmlAttribute(name = "CSystem")
            protected Integer cSystem;

            /**
             * Gets the value of the nd property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the nd property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getNd().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link LINKSPECTYP.GisLinks.Gislink.Nd }
             * </p>
             * 
             * 
             * @return
             *     The value of the nd property.
             */
            public List<LINKSPECTYP.GisLinks.Gislink.Nd> getNd() {
                if (nd == null) {
                    nd = new ArrayList<>();
                }
                return this.nd;
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
            public static class Nd {

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
     *         <element name="Kommunfordelning">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="Procent" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *                   <element name="avstand" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   <element name="Kommunkod" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    @XmlType(name = "", propOrder = {
        "kommunfordelning"
    })
    public static class Kommuns {

        @XmlElement(name = "Kommunfordelning", required = true)
        protected List<LINKSPECTYP.Kommuns.Kommunfordelning> kommunfordelning;

        /**
         * Gets the value of the kommunfordelning property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the kommunfordelning property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getKommunfordelning().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LINKSPECTYP.Kommuns.Kommunfordelning }
         * </p>
         * 
         * 
         * @return
         *     The value of the kommunfordelning property.
         */
        public List<LINKSPECTYP.Kommuns.Kommunfordelning> getKommunfordelning() {
            if (kommunfordelning == null) {
                kommunfordelning = new ArrayList<>();
            }
            return this.kommunfordelning;
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
         *         <element name="Procent" type="{http://www.w3.org/2001/XMLSchema}double"/>
         *         <element name="avstand" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         <element name="Kommunkod" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
            "procent",
            "avstand",
            "kommunkod"
        })
        public static class Kommunfordelning {

            @XmlElement(name = "Procent")
            protected double procent;
            protected int avstand;
            @XmlElement(name = "Kommunkod")
            protected int kommunkod;

            /**
             * Gets the value of the procent property.
             * 
             */
            public double getProcent() {
                return procent;
            }

            /**
             * Sets the value of the procent property.
             * 
             */
            public void setProcent(double value) {
                this.procent = value;
            }

            /**
             * Gets the value of the avstand property.
             * 
             */
            public int getAvstand() {
                return avstand;
            }

            /**
             * Sets the value of the avstand property.
             * 
             */
            public void setAvstand(int value) {
                this.avstand = value;
            }

            /**
             * Gets the value of the kommunkod property.
             * 
             */
            public int getKommunkod() {
                return kommunkod;
            }

            /**
             * Sets the value of the kommunkod property.
             * 
             */
            public void setKommunkod(int value) {
                this.kommunkod = value;
            }

        }

    }

}
