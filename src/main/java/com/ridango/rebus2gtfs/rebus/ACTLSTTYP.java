
package com.ridango.rebus2gtfs.rebus;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ACTLST_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ACTLST_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence maxOccurs="unbounded" minOccurs="0">
 *         <element name="ACT_TYP">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="ActLstID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   <element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="FiktivNod" type="{}ACTFIKTIVNOD_TYP" maxOccurs="unbounded" minOccurs="0"/>
 *                   <element name="Dest" type="{}ACTDEST_TYP" maxOccurs="unbounded" minOccurs="0"/>
 *                   <element name="InfoText" type="{}ACTINFOTEXT_TYP" maxOccurs="unbounded" minOccurs="0"/>
 *                   <element name="Tagnummer" type="{}ACTTAGNUMMER_TYP" maxOccurs="unbounded" minOccurs="0"/>
 *                   <element name="TagPunkt" type="{}ACTTAGPUNKT_TYP" maxOccurs="unbounded" minOccurs="0"/>
 *                   <element name="SignalPrio" type="{}ACTSIGNALPRIO_TYP" maxOccurs="unbounded" minOccurs="0"/>
 *                   <element name="RadioPunkt" type="{}ACTRADIOPUNKT_TYP" maxOccurs="unbounded" minOccurs="0"/>
 *                   <element name="InternNr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   <element name="BorderActs" type="{}ACTBORDER_TYP" maxOccurs="unbounded" minOccurs="0"/>
 *                   <element name="WheelLubeActs" type="{}ACTWHEELLUBE_TYP" maxOccurs="unbounded" minOccurs="0"/>
 *                   <element name="RouteMessages" type="{}RouteMessage" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ACTLST_TYP", propOrder = {
    "acttyp"
})
public class ACTLSTTYP {

    @XmlElement(name = "ACT_TYP")
    protected List<ACTLSTTYP.ACTTYP> acttyp;

    /**
     * Gets the value of the acttyp property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acttyp property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getACTTYP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ACTLSTTYP.ACTTYP }
     * </p>
     * 
     * 
     * @return
     *     The value of the acttyp property.
     */
    public List<ACTLSTTYP.ACTTYP> getACTTYP() {
        if (acttyp == null) {
            acttyp = new ArrayList<>();
        }
        return this.acttyp;
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
     *         <element name="ActLstID" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         <element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         <element name="FiktivNod" type="{}ACTFIKTIVNOD_TYP" maxOccurs="unbounded" minOccurs="0"/>
     *         <element name="Dest" type="{}ACTDEST_TYP" maxOccurs="unbounded" minOccurs="0"/>
     *         <element name="InfoText" type="{}ACTINFOTEXT_TYP" maxOccurs="unbounded" minOccurs="0"/>
     *         <element name="Tagnummer" type="{}ACTTAGNUMMER_TYP" maxOccurs="unbounded" minOccurs="0"/>
     *         <element name="TagPunkt" type="{}ACTTAGPUNKT_TYP" maxOccurs="unbounded" minOccurs="0"/>
     *         <element name="SignalPrio" type="{}ACTSIGNALPRIO_TYP" maxOccurs="unbounded" minOccurs="0"/>
     *         <element name="RadioPunkt" type="{}ACTRADIOPUNKT_TYP" maxOccurs="unbounded" minOccurs="0"/>
     *         <element name="InternNr" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         <element name="BorderActs" type="{}ACTBORDER_TYP" maxOccurs="unbounded" minOccurs="0"/>
     *         <element name="WheelLubeActs" type="{}ACTWHEELLUBE_TYP" maxOccurs="unbounded" minOccurs="0"/>
     *         <element name="RouteMessages" type="{}RouteMessage" maxOccurs="unbounded" minOccurs="0"/>
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
        "actLstID",
        "text",
        "fiktivNod",
        "dest",
        "infoText",
        "tagnummer",
        "tagPunkt",
        "signalPrio",
        "radioPunkt",
        "internNr",
        "borderActs",
        "wheelLubeActs",
        "routeMessages"
    })
    public static class ACTTYP {

        @XmlElement(name = "ActLstID")
        protected int actLstID;
        @XmlElement(name = "Text", required = true)
        protected String text;
        @XmlElement(name = "FiktivNod")
        protected List<ACTFIKTIVNODTYP> fiktivNod;
        @XmlElement(name = "Dest")
        protected List<ACTDESTTYP> dest;
        @XmlElement(name = "InfoText")
        protected List<ACTINFOTEXTTYP> infoText;
        @XmlElement(name = "Tagnummer")
        protected List<ACTTAGNUMMERTYP> tagnummer;
        @XmlElement(name = "TagPunkt")
        protected List<ACTTAGPUNKTTYP> tagPunkt;
        @XmlElement(name = "SignalPrio")
        protected List<ACTSIGNALPRIOTYP> signalPrio;
        @XmlElement(name = "RadioPunkt")
        protected List<ACTRADIOPUNKTTYP> radioPunkt;
        /**
         * Används för Komframexporten
         * 
         */
        @XmlElement(name = "InternNr")
        protected int internNr;
        @XmlElement(name = "BorderActs")
        protected List<ACTBORDERTYP> borderActs;
        @XmlElement(name = "WheelLubeActs")
        protected List<ACTWHEELLUBETYP> wheelLubeActs;
        @XmlElement(name = "RouteMessages")
        protected List<RouteMessage> routeMessages;

        /**
         * Gets the value of the actLstID property.
         * 
         */
        public int getActLstID() {
            return actLstID;
        }

        /**
         * Sets the value of the actLstID property.
         * 
         */
        public void setActLstID(int value) {
            this.actLstID = value;
        }

        /**
         * Gets the value of the text property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getText() {
            return text;
        }

        /**
         * Sets the value of the text property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setText(String value) {
            this.text = value;
        }

        /**
         * Gets the value of the fiktivNod property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fiktivNod property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getFiktivNod().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ACTFIKTIVNODTYP }
         * </p>
         * 
         * 
         * @return
         *     The value of the fiktivNod property.
         */
        public List<ACTFIKTIVNODTYP> getFiktivNod() {
            if (fiktivNod == null) {
                fiktivNod = new ArrayList<>();
            }
            return this.fiktivNod;
        }

        /**
         * Gets the value of the dest property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dest property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getDest().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ACTDESTTYP }
         * </p>
         * 
         * 
         * @return
         *     The value of the dest property.
         */
        public List<ACTDESTTYP> getDest() {
            if (dest == null) {
                dest = new ArrayList<>();
            }
            return this.dest;
        }

        /**
         * Gets the value of the infoText property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the infoText property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getInfoText().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ACTINFOTEXTTYP }
         * </p>
         * 
         * 
         * @return
         *     The value of the infoText property.
         */
        public List<ACTINFOTEXTTYP> getInfoText() {
            if (infoText == null) {
                infoText = new ArrayList<>();
            }
            return this.infoText;
        }

        /**
         * Gets the value of the tagnummer property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tagnummer property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getTagnummer().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ACTTAGNUMMERTYP }
         * </p>
         * 
         * 
         * @return
         *     The value of the tagnummer property.
         */
        public List<ACTTAGNUMMERTYP> getTagnummer() {
            if (tagnummer == null) {
                tagnummer = new ArrayList<>();
            }
            return this.tagnummer;
        }

        /**
         * Gets the value of the tagPunkt property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tagPunkt property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getTagPunkt().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ACTTAGPUNKTTYP }
         * </p>
         * 
         * 
         * @return
         *     The value of the tagPunkt property.
         */
        public List<ACTTAGPUNKTTYP> getTagPunkt() {
            if (tagPunkt == null) {
                tagPunkt = new ArrayList<>();
            }
            return this.tagPunkt;
        }

        /**
         * Gets the value of the signalPrio property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the signalPrio property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getSignalPrio().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ACTSIGNALPRIOTYP }
         * </p>
         * 
         * 
         * @return
         *     The value of the signalPrio property.
         */
        public List<ACTSIGNALPRIOTYP> getSignalPrio() {
            if (signalPrio == null) {
                signalPrio = new ArrayList<>();
            }
            return this.signalPrio;
        }

        /**
         * Gets the value of the radioPunkt property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the radioPunkt property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getRadioPunkt().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ACTRADIOPUNKTTYP }
         * </p>
         * 
         * 
         * @return
         *     The value of the radioPunkt property.
         */
        public List<ACTRADIOPUNKTTYP> getRadioPunkt() {
            if (radioPunkt == null) {
                radioPunkt = new ArrayList<>();
            }
            return this.radioPunkt;
        }

        /**
         * Används för Komframexporten
         * 
         */
        public int getInternNr() {
            return internNr;
        }

        /**
         * Sets the value of the internNr property.
         * 
         */
        public void setInternNr(int value) {
            this.internNr = value;
        }

        /**
         * Gets the value of the borderActs property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the borderActs property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getBorderActs().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ACTBORDERTYP }
         * </p>
         * 
         * 
         * @return
         *     The value of the borderActs property.
         */
        public List<ACTBORDERTYP> getBorderActs() {
            if (borderActs == null) {
                borderActs = new ArrayList<>();
            }
            return this.borderActs;
        }

        /**
         * Gets the value of the wheelLubeActs property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the wheelLubeActs property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getWheelLubeActs().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ACTWHEELLUBETYP }
         * </p>
         * 
         * 
         * @return
         *     The value of the wheelLubeActs property.
         */
        public List<ACTWHEELLUBETYP> getWheelLubeActs() {
            if (wheelLubeActs == null) {
                wheelLubeActs = new ArrayList<>();
            }
            return this.wheelLubeActs;
        }

        /**
         * Gets the value of the routeMessages property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the routeMessages property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getRouteMessages().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RouteMessage }
         * </p>
         * 
         * 
         * @return
         *     The value of the routeMessages property.
         */
        public List<RouteMessage> getRouteMessages() {
            if (routeMessages == null) {
                routeMessages = new ArrayList<>();
            }
            return this.routeMessages;
        }

    }

}
