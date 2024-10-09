
package com.ridango.rebus2gtfs.rebus;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TRIP_TYP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TRIP_TYP">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence maxOccurs="unbounded">
 *         <element name="Trip">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Turnr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   <element name="turx">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                         <minInclusive value="-2147483648"/>
 *                         <maxInclusive value="2147483647"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                   <element name="turxTxt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="Varianten" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   <element name="Avstand" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   <element name="hsek">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                         <minInclusive value="-2147483648"/>
 *                         <maxInclusive value="2147483647"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                   <element name="Turanm123" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="Avghplnr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   <element name="Ankhplnr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   <element name="AvgStopAreaGid" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   <element name="AnkStopAreaGid" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   <element name="AvgStopPointGid" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   <element name="AnkStopPointGid" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   <element name="AvgLage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="AnkLage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="Avgtid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   <element name="Anktid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   <element name="Avgtidsek" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   <element name="Anktidsek" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   <element name="Turkod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="Turkodtxt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="Trafiktyp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="Trafiktyptxt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="TrafiktypDBID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   <element name="Period" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   <element name="PeriodNamn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="InsPer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   <element name="InsPerNamn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="PeriodGrupp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   <element name="PeriodGruppNamn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="EntrepDefaultKod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="EntrepDefaultNamn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="Dagar" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="Dagtyp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   <element name="Kvar" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   <element name="KvarTxt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="FK_ReturnVariantTripId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   <element name="Svar" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="AvtalsNr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   <element name="AvtalsNamn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="PubtransInfPassCondDII3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="PubtransPrintMedia" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   <element name="PubtransProduct" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="ViaDests" type="{}VIADEST_TYP" maxOccurs="unbounded"/>
 *                   <element name="ReturnVariants" type="{}RETURNVARIANT_TYP" maxOccurs="unbounded"/>
 *                   <element name="Tagnr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   <element name="TRV_TrainNr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   <element name="TRV_TrainVariant" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   <element name="DestKod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   <element name="DestTxt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="DestTxtShort" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="DestExtnr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   <element name="DestExtnr2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   <element name="FranDestKod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   <element name="FranDestTxt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="FranDestShortTxt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="FtypKravTyp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="FtypKravTxt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="Taxetyp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="TaxetypNamn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="AnmTxt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="Startdatum" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   <element name="FreeAttributes" type="{}FreeAttributes"/>
 *                   <sequence>
 *                     <element name="Masks" type="{}MASK_TYP"/>
 *                   </sequence>
 *                   <sequence>
 *                     <element name="Kupps" type="{}KUPP_TYP"/>
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
@XmlType(name = "TRIP_TYP", propOrder = {
    "trip"
})
public class TRIPTYP {

    @XmlElement(name = "Trip", required = true)
    protected List<TRIPTYP.Trip> trip;

    /**
     * Gets the value of the trip property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trip property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTrip().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TRIPTYP.Trip }
     * </p>
     * 
     * 
     * @return
     *     The value of the trip property.
     */
    public List<TRIPTYP.Trip> getTrip() {
        if (trip == null) {
            trip = new ArrayList<>();
        }
        return this.trip;
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
     *         <element name="Turnr" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         <element name="turx">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *               <minInclusive value="-2147483648"/>
     *               <maxInclusive value="2147483647"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element name="turxTxt" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         <element name="Varianten" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         <element name="Avstand" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         <element name="hsek">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *               <minInclusive value="-2147483648"/>
     *               <maxInclusive value="2147483647"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element name="Turanm123" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         <element name="Avghplnr" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         <element name="Ankhplnr" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         <element name="AvgStopAreaGid" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         <element name="AnkStopAreaGid" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         <element name="AvgStopPointGid" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         <element name="AnkStopPointGid" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         <element name="AvgLage" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         <element name="AnkLage" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         <element name="Avgtid" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         <element name="Anktid" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         <element name="Avgtidsek" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         <element name="Anktidsek" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         <element name="Turkod" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         <element name="Turkodtxt" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         <element name="Trafiktyp" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         <element name="Trafiktyptxt" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         <element name="TrafiktypDBID" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         <element name="Period" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         <element name="PeriodNamn" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         <element name="InsPer" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         <element name="InsPerNamn" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         <element name="PeriodGrupp" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         <element name="PeriodGruppNamn" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         <element name="EntrepDefaultKod" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         <element name="EntrepDefaultNamn" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         <element name="Dagar" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         <element name="Dagtyp" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         <element name="Kvar" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         <element name="KvarTxt" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         <element name="FK_ReturnVariantTripId" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         <element name="Svar" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         <element name="AvtalsNr" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         <element name="AvtalsNamn" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         <element name="PubtransInfPassCondDII3" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         <element name="PubtransPrintMedia" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         <element name="PubtransProduct" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         <element name="ViaDests" type="{}VIADEST_TYP" maxOccurs="unbounded"/>
     *         <element name="ReturnVariants" type="{}RETURNVARIANT_TYP" maxOccurs="unbounded"/>
     *         <element name="Tagnr" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         <element name="TRV_TrainNr" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         <element name="TRV_TrainVariant" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         <element name="DestKod" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         <element name="DestTxt" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         <element name="DestTxtShort" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         <element name="DestExtnr" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         <element name="DestExtnr2" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         <element name="FranDestKod" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         <element name="FranDestTxt" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         <element name="FranDestShortTxt" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         <element name="FtypKravTyp" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         <element name="FtypKravTxt" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         <element name="Taxetyp" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         <element name="TaxetypNamn" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         <element name="AnmTxt" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         <element name="Startdatum" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         <element name="FreeAttributes" type="{}FreeAttributes"/>
     *         <sequence>
     *           <element name="Masks" type="{}MASK_TYP"/>
     *         </sequence>
     *         <sequence>
     *           <element name="Kupps" type="{}KUPP_TYP"/>
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
        "turnr",
        "turx",
        "turxTxt",
        "varianten",
        "avstand",
        "hsek",
        "turanm123",
        "avghplnr",
        "ankhplnr",
        "avgStopAreaGid",
        "ankStopAreaGid",
        "avgStopPointGid",
        "ankStopPointGid",
        "avgLage",
        "ankLage",
        "avgtid",
        "anktid",
        "avgtidsek",
        "anktidsek",
        "turkod",
        "turkodtxt",
        "trafiktyp",
        "trafiktyptxt",
        "trafiktypDBID",
        "period",
        "periodNamn",
        "insPer",
        "insPerNamn",
        "periodGrupp",
        "periodGruppNamn",
        "entrepDefaultKod",
        "entrepDefaultNamn",
        "dagar",
        "dagtyp",
        "kvar",
        "kvarTxt",
        "fkReturnVariantTripId",
        "svar",
        "avtalsNr",
        "avtalsNamn",
        "pubtransInfPassCondDII3",
        "pubtransPrintMedia",
        "pubtransProduct",
        "viaDests",
        "returnVariants",
        "tagnr",
        "trvTrainNr",
        "trvTrainVariant",
        "destKod",
        "destTxt",
        "destTxtShort",
        "destExtnr",
        "destExtnr2",
        "franDestKod",
        "franDestTxt",
        "franDestShortTxt",
        "ftypKravTyp",
        "ftypKravTxt",
        "taxetyp",
        "taxetypNamn",
        "anmTxt",
        "startdatum",
        "freeAttributes",
        "masks",
        "kupps"
    })
    public static class Trip {

        @XmlElement(name = "Turnr")
        protected int turnr;
        /**
         *  1=F 2=P 3=T 4=X
         * 
         */
        protected int turx;
        @XmlElement(required = true)
        protected String turxTxt;
        @XmlElement(name = "Varianten")
        protected int varianten;
        /**
         * Turens totala avstånd
         * 
         */
        @XmlElement(name = "Avstand")
        protected int avstand;
        /**
         * Håller reda på horisontell sorteringsordning i turlistan
         * 
         */
        protected int hsek;
        /**
         * Här ligger de tre turanmärkningarna i rätt ordning och plats
         * 
         */
        @XmlElement(name = "Turanm123", required = true)
        protected String turanm123;
        @XmlElement(name = "Avghplnr")
        protected int avghplnr;
        @XmlElement(name = "Ankhplnr")
        protected int ankhplnr;
        @XmlElement(name = "AvgStopAreaGid")
        protected long avgStopAreaGid;
        @XmlElement(name = "AnkStopAreaGid")
        protected long ankStopAreaGid;
        @XmlElement(name = "AvgStopPointGid")
        protected long avgStopPointGid;
        @XmlElement(name = "AnkStopPointGid")
        protected long ankStopPointGid;
        @XmlElement(name = "AvgLage", required = true)
        protected String avgLage;
        @XmlElement(name = "AnkLage", required = true)
        protected String ankLage;
        @XmlElement(name = "Avgtid")
        protected int avgtid;
        @XmlElement(name = "Anktid")
        protected int anktid;
        @XmlElement(name = "Avgtidsek")
        protected int avgtidsek;
        @XmlElement(name = "Anktidsek")
        protected int anktidsek;
        @XmlElement(name = "Turkod", required = true)
        protected String turkod;
        @XmlElement(name = "Turkodtxt", required = true)
        protected String turkodtxt;
        @XmlElement(name = "Trafiktyp", required = true)
        protected String trafiktyp;
        @XmlElement(name = "Trafiktyptxt", required = true)
        protected String trafiktyptxt;
        @XmlElement(name = "TrafiktypDBID")
        protected int trafiktypDBID;
        @XmlElement(name = "Period")
        protected int period;
        @XmlElement(name = "PeriodNamn", required = true)
        protected String periodNamn;
        @XmlElement(name = "InsPer")
        protected int insPer;
        @XmlElement(name = "InsPerNamn", required = true)
        protected String insPerNamn;
        @XmlElement(name = "PeriodGrupp")
        protected int periodGrupp;
        @XmlElement(name = "PeriodGruppNamn", required = true)
        protected String periodGruppNamn;
        @XmlElement(name = "EntrepDefaultKod", required = true)
        protected String entrepDefaultKod;
        @XmlElement(name = "EntrepDefaultNamn", required = true)
        protected String entrepDefaultNamn;
        @XmlElement(name = "Dagar", required = true)
        protected String dagar;
        @XmlElement(name = "Dagtyp")
        protected int dagtyp;
        @XmlElement(name = "Kvar")
        protected int kvar;
        @XmlElement(name = "KvarTxt", required = true)
        protected String kvarTxt;
        @XmlElement(name = "FK_ReturnVariantTripId")
        protected int fkReturnVariantTripId;
        @XmlElement(name = "Svar", required = true)
        protected String svar;
        @XmlElement(name = "AvtalsNr")
        protected int avtalsNr;
        @XmlElement(name = "AvtalsNamn", required = true)
        protected String avtalsNamn;
        @XmlElement(name = "PubtransInfPassCondDII3", required = true)
        protected String pubtransInfPassCondDII3;
        @XmlElement(name = "PubtransPrintMedia")
        protected boolean pubtransPrintMedia;
        @XmlElement(name = "PubtransProduct", required = true)
        protected String pubtransProduct;
        @XmlElement(name = "ViaDests", required = true)
        protected List<VIADESTTYP> viaDests;
        @XmlElement(name = "ReturnVariants", required = true)
        protected List<RETURNVARIANTTYP> returnVariants;
        @XmlElement(name = "Tagnr")
        protected int tagnr;
        @XmlElement(name = "TRV_TrainNr")
        protected int trvTrainNr;
        @XmlElement(name = "TRV_TrainVariant")
        protected int trvTrainVariant;
        @XmlElement(name = "DestKod")
        protected int destKod;
        @XmlElement(name = "DestTxt", required = true)
        protected String destTxt;
        @XmlElement(name = "DestTxtShort", required = true)
        protected String destTxtShort;
        @XmlElement(name = "DestExtnr")
        protected int destExtnr;
        @XmlElement(name = "DestExtnr2")
        protected int destExtnr2;
        @XmlElement(name = "FranDestKod")
        protected int franDestKod;
        @XmlElement(name = "FranDestTxt", required = true)
        protected String franDestTxt;
        @XmlElement(name = "FranDestShortTxt", required = true)
        protected String franDestShortTxt;
        @XmlElement(name = "FtypKravTyp", required = true)
        protected String ftypKravTyp;
        @XmlElement(name = "FtypKravTxt", required = true)
        protected String ftypKravTxt;
        @XmlElement(name = "Taxetyp", required = true)
        protected String taxetyp;
        @XmlElement(name = "TaxetypNamn", required = true)
        protected String taxetypNamn;
        @XmlElement(name = "AnmTxt", required = true)
        protected String anmTxt;
        /**
         * Startdatum för alla turens maskar inklusive Kupps
         * 
         */
        @XmlElement(name = "Startdatum", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar startdatum;
        @XmlElement(name = "FreeAttributes", required = true)
        protected FreeAttributes freeAttributes;
        /**
         * Turens giltighet
         * 
         */
        @XmlElement(name = "Masks", required = true)
        protected MASKTYP masks;
        @XmlElement(name = "Kupps", required = true)
        protected KUPPTYP kupps;

        /**
         * Gets the value of the turnr property.
         * 
         */
        public int getTurnr() {
            return turnr;
        }

        /**
         * Sets the value of the turnr property.
         * 
         */
        public void setTurnr(int value) {
            this.turnr = value;
        }

        /**
         *  1=F 2=P 3=T 4=X
         * 
         */
        public int getTurx() {
            return turx;
        }

        /**
         * Sets the value of the turx property.
         * 
         */
        public void setTurx(int value) {
            this.turx = value;
        }

        /**
         * Gets the value of the turxTxt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTurxTxt() {
            return turxTxt;
        }

        /**
         * Sets the value of the turxTxt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTurxTxt(String value) {
            this.turxTxt = value;
        }

        /**
         * Gets the value of the varianten property.
         * 
         */
        public int getVarianten() {
            return varianten;
        }

        /**
         * Sets the value of the varianten property.
         * 
         */
        public void setVarianten(int value) {
            this.varianten = value;
        }

        /**
         * Turens totala avstånd
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
         * Håller reda på horisontell sorteringsordning i turlistan
         * 
         */
        public int getHsek() {
            return hsek;
        }

        /**
         * Sets the value of the hsek property.
         * 
         */
        public void setHsek(int value) {
            this.hsek = value;
        }

        /**
         * Här ligger de tre turanmärkningarna i rätt ordning och plats
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTuranm123() {
            return turanm123;
        }

        /**
         * Sets the value of the turanm123 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getTuranm123()
         */
        public void setTuranm123(String value) {
            this.turanm123 = value;
        }

        /**
         * Gets the value of the avghplnr property.
         * 
         */
        public int getAvghplnr() {
            return avghplnr;
        }

        /**
         * Sets the value of the avghplnr property.
         * 
         */
        public void setAvghplnr(int value) {
            this.avghplnr = value;
        }

        /**
         * Gets the value of the ankhplnr property.
         * 
         */
        public int getAnkhplnr() {
            return ankhplnr;
        }

        /**
         * Sets the value of the ankhplnr property.
         * 
         */
        public void setAnkhplnr(int value) {
            this.ankhplnr = value;
        }

        /**
         * Gets the value of the avgStopAreaGid property.
         * 
         */
        public long getAvgStopAreaGid() {
            return avgStopAreaGid;
        }

        /**
         * Sets the value of the avgStopAreaGid property.
         * 
         */
        public void setAvgStopAreaGid(long value) {
            this.avgStopAreaGid = value;
        }

        /**
         * Gets the value of the ankStopAreaGid property.
         * 
         */
        public long getAnkStopAreaGid() {
            return ankStopAreaGid;
        }

        /**
         * Sets the value of the ankStopAreaGid property.
         * 
         */
        public void setAnkStopAreaGid(long value) {
            this.ankStopAreaGid = value;
        }

        /**
         * Gets the value of the avgStopPointGid property.
         * 
         */
        public long getAvgStopPointGid() {
            return avgStopPointGid;
        }

        /**
         * Sets the value of the avgStopPointGid property.
         * 
         */
        public void setAvgStopPointGid(long value) {
            this.avgStopPointGid = value;
        }

        /**
         * Gets the value of the ankStopPointGid property.
         * 
         */
        public long getAnkStopPointGid() {
            return ankStopPointGid;
        }

        /**
         * Sets the value of the ankStopPointGid property.
         * 
         */
        public void setAnkStopPointGid(long value) {
            this.ankStopPointGid = value;
        }

        /**
         * Gets the value of the avgLage property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAvgLage() {
            return avgLage;
        }

        /**
         * Sets the value of the avgLage property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAvgLage(String value) {
            this.avgLage = value;
        }

        /**
         * Gets the value of the ankLage property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAnkLage() {
            return ankLage;
        }

        /**
         * Sets the value of the ankLage property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAnkLage(String value) {
            this.ankLage = value;
        }

        /**
         * Gets the value of the avgtid property.
         * 
         */
        public int getAvgtid() {
            return avgtid;
        }

        /**
         * Sets the value of the avgtid property.
         * 
         */
        public void setAvgtid(int value) {
            this.avgtid = value;
        }

        /**
         * Gets the value of the anktid property.
         * 
         */
        public int getAnktid() {
            return anktid;
        }

        /**
         * Sets the value of the anktid property.
         * 
         */
        public void setAnktid(int value) {
            this.anktid = value;
        }

        /**
         * Gets the value of the avgtidsek property.
         * 
         */
        public int getAvgtidsek() {
            return avgtidsek;
        }

        /**
         * Sets the value of the avgtidsek property.
         * 
         */
        public void setAvgtidsek(int value) {
            this.avgtidsek = value;
        }

        /**
         * Gets the value of the anktidsek property.
         * 
         */
        public int getAnktidsek() {
            return anktidsek;
        }

        /**
         * Sets the value of the anktidsek property.
         * 
         */
        public void setAnktidsek(int value) {
            this.anktidsek = value;
        }

        /**
         * Gets the value of the turkod property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTurkod() {
            return turkod;
        }

        /**
         * Sets the value of the turkod property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTurkod(String value) {
            this.turkod = value;
        }

        /**
         * Gets the value of the turkodtxt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTurkodtxt() {
            return turkodtxt;
        }

        /**
         * Sets the value of the turkodtxt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTurkodtxt(String value) {
            this.turkodtxt = value;
        }

        /**
         * Gets the value of the trafiktyp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTrafiktyp() {
            return trafiktyp;
        }

        /**
         * Sets the value of the trafiktyp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTrafiktyp(String value) {
            this.trafiktyp = value;
        }

        /**
         * Gets the value of the trafiktyptxt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTrafiktyptxt() {
            return trafiktyptxt;
        }

        /**
         * Sets the value of the trafiktyptxt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTrafiktyptxt(String value) {
            this.trafiktyptxt = value;
        }

        /**
         * Gets the value of the trafiktypDBID property.
         * 
         */
        public int getTrafiktypDBID() {
            return trafiktypDBID;
        }

        /**
         * Sets the value of the trafiktypDBID property.
         * 
         */
        public void setTrafiktypDBID(int value) {
            this.trafiktypDBID = value;
        }

        /**
         * Gets the value of the period property.
         * 
         */
        public int getPeriod() {
            return period;
        }

        /**
         * Sets the value of the period property.
         * 
         */
        public void setPeriod(int value) {
            this.period = value;
        }

        /**
         * Gets the value of the periodNamn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPeriodNamn() {
            return periodNamn;
        }

        /**
         * Sets the value of the periodNamn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPeriodNamn(String value) {
            this.periodNamn = value;
        }

        /**
         * Gets the value of the insPer property.
         * 
         */
        public int getInsPer() {
            return insPer;
        }

        /**
         * Sets the value of the insPer property.
         * 
         */
        public void setInsPer(int value) {
            this.insPer = value;
        }

        /**
         * Gets the value of the insPerNamn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInsPerNamn() {
            return insPerNamn;
        }

        /**
         * Sets the value of the insPerNamn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInsPerNamn(String value) {
            this.insPerNamn = value;
        }

        /**
         * Gets the value of the periodGrupp property.
         * 
         */
        public int getPeriodGrupp() {
            return periodGrupp;
        }

        /**
         * Sets the value of the periodGrupp property.
         * 
         */
        public void setPeriodGrupp(int value) {
            this.periodGrupp = value;
        }

        /**
         * Gets the value of the periodGruppNamn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPeriodGruppNamn() {
            return periodGruppNamn;
        }

        /**
         * Sets the value of the periodGruppNamn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPeriodGruppNamn(String value) {
            this.periodGruppNamn = value;
        }

        /**
         * Gets the value of the entrepDefaultKod property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEntrepDefaultKod() {
            return entrepDefaultKod;
        }

        /**
         * Sets the value of the entrepDefaultKod property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEntrepDefaultKod(String value) {
            this.entrepDefaultKod = value;
        }

        /**
         * Gets the value of the entrepDefaultNamn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEntrepDefaultNamn() {
            return entrepDefaultNamn;
        }

        /**
         * Sets the value of the entrepDefaultNamn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEntrepDefaultNamn(String value) {
            this.entrepDefaultNamn = value;
        }

        /**
         * Gets the value of the dagar property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDagar() {
            return dagar;
        }

        /**
         * Sets the value of the dagar property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDagar(String value) {
            this.dagar = value;
        }

        /**
         * Gets the value of the dagtyp property.
         * 
         */
        public int getDagtyp() {
            return dagtyp;
        }

        /**
         * Sets the value of the dagtyp property.
         * 
         */
        public void setDagtyp(int value) {
            this.dagtyp = value;
        }

        /**
         * Gets the value of the kvar property.
         * 
         */
        public int getKvar() {
            return kvar;
        }

        /**
         * Sets the value of the kvar property.
         * 
         */
        public void setKvar(int value) {
            this.kvar = value;
        }

        /**
         * Gets the value of the kvarTxt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKvarTxt() {
            return kvarTxt;
        }

        /**
         * Sets the value of the kvarTxt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKvarTxt(String value) {
            this.kvarTxt = value;
        }

        /**
         * Gets the value of the fkReturnVariantTripId property.
         * 
         */
        public int getFKReturnVariantTripId() {
            return fkReturnVariantTripId;
        }

        /**
         * Sets the value of the fkReturnVariantTripId property.
         * 
         */
        public void setFKReturnVariantTripId(int value) {
            this.fkReturnVariantTripId = value;
        }

        /**
         * Gets the value of the svar property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSvar() {
            return svar;
        }

        /**
         * Sets the value of the svar property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSvar(String value) {
            this.svar = value;
        }

        /**
         * Gets the value of the avtalsNr property.
         * 
         */
        public int getAvtalsNr() {
            return avtalsNr;
        }

        /**
         * Sets the value of the avtalsNr property.
         * 
         */
        public void setAvtalsNr(int value) {
            this.avtalsNr = value;
        }

        /**
         * Gets the value of the avtalsNamn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAvtalsNamn() {
            return avtalsNamn;
        }

        /**
         * Sets the value of the avtalsNamn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAvtalsNamn(String value) {
            this.avtalsNamn = value;
        }

        /**
         * Gets the value of the pubtransInfPassCondDII3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPubtransInfPassCondDII3() {
            return pubtransInfPassCondDII3;
        }

        /**
         * Sets the value of the pubtransInfPassCondDII3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPubtransInfPassCondDII3(String value) {
            this.pubtransInfPassCondDII3 = value;
        }

        /**
         * Gets the value of the pubtransPrintMedia property.
         * 
         */
        public boolean isPubtransPrintMedia() {
            return pubtransPrintMedia;
        }

        /**
         * Sets the value of the pubtransPrintMedia property.
         * 
         */
        public void setPubtransPrintMedia(boolean value) {
            this.pubtransPrintMedia = value;
        }

        /**
         * Gets the value of the pubtransProduct property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPubtransProduct() {
            return pubtransProduct;
        }

        /**
         * Sets the value of the pubtransProduct property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPubtransProduct(String value) {
            this.pubtransProduct = value;
        }

        /**
         * Gets the value of the viaDests property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the viaDests property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getViaDests().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VIADESTTYP }
         * </p>
         * 
         * 
         * @return
         *     The value of the viaDests property.
         */
        public List<VIADESTTYP> getViaDests() {
            if (viaDests == null) {
                viaDests = new ArrayList<>();
            }
            return this.viaDests;
        }

        /**
         * Gets the value of the returnVariants property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the returnVariants property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getReturnVariants().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RETURNVARIANTTYP }
         * </p>
         * 
         * 
         * @return
         *     The value of the returnVariants property.
         */
        public List<RETURNVARIANTTYP> getReturnVariants() {
            if (returnVariants == null) {
                returnVariants = new ArrayList<>();
            }
            return this.returnVariants;
        }

        /**
         * Gets the value of the tagnr property.
         * 
         */
        public int getTagnr() {
            return tagnr;
        }

        /**
         * Sets the value of the tagnr property.
         * 
         */
        public void setTagnr(int value) {
            this.tagnr = value;
        }

        /**
         * Gets the value of the trvTrainNr property.
         * 
         */
        public int getTRVTrainNr() {
            return trvTrainNr;
        }

        /**
         * Sets the value of the trvTrainNr property.
         * 
         */
        public void setTRVTrainNr(int value) {
            this.trvTrainNr = value;
        }

        /**
         * Gets the value of the trvTrainVariant property.
         * 
         */
        public int getTRVTrainVariant() {
            return trvTrainVariant;
        }

        /**
         * Sets the value of the trvTrainVariant property.
         * 
         */
        public void setTRVTrainVariant(int value) {
            this.trvTrainVariant = value;
        }

        /**
         * Gets the value of the destKod property.
         * 
         */
        public int getDestKod() {
            return destKod;
        }

        /**
         * Sets the value of the destKod property.
         * 
         */
        public void setDestKod(int value) {
            this.destKod = value;
        }

        /**
         * Gets the value of the destTxt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDestTxt() {
            return destTxt;
        }

        /**
         * Sets the value of the destTxt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDestTxt(String value) {
            this.destTxt = value;
        }

        /**
         * Gets the value of the destTxtShort property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDestTxtShort() {
            return destTxtShort;
        }

        /**
         * Sets the value of the destTxtShort property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDestTxtShort(String value) {
            this.destTxtShort = value;
        }

        /**
         * Gets the value of the destExtnr property.
         * 
         */
        public int getDestExtnr() {
            return destExtnr;
        }

        /**
         * Sets the value of the destExtnr property.
         * 
         */
        public void setDestExtnr(int value) {
            this.destExtnr = value;
        }

        /**
         * Gets the value of the destExtnr2 property.
         * 
         */
        public int getDestExtnr2() {
            return destExtnr2;
        }

        /**
         * Sets the value of the destExtnr2 property.
         * 
         */
        public void setDestExtnr2(int value) {
            this.destExtnr2 = value;
        }

        /**
         * Gets the value of the franDestKod property.
         * 
         */
        public int getFranDestKod() {
            return franDestKod;
        }

        /**
         * Sets the value of the franDestKod property.
         * 
         */
        public void setFranDestKod(int value) {
            this.franDestKod = value;
        }

        /**
         * Gets the value of the franDestTxt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFranDestTxt() {
            return franDestTxt;
        }

        /**
         * Sets the value of the franDestTxt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFranDestTxt(String value) {
            this.franDestTxt = value;
        }

        /**
         * Gets the value of the franDestShortTxt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFranDestShortTxt() {
            return franDestShortTxt;
        }

        /**
         * Sets the value of the franDestShortTxt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFranDestShortTxt(String value) {
            this.franDestShortTxt = value;
        }

        /**
         * Gets the value of the ftypKravTyp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFtypKravTyp() {
            return ftypKravTyp;
        }

        /**
         * Sets the value of the ftypKravTyp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFtypKravTyp(String value) {
            this.ftypKravTyp = value;
        }

        /**
         * Gets the value of the ftypKravTxt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFtypKravTxt() {
            return ftypKravTxt;
        }

        /**
         * Sets the value of the ftypKravTxt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFtypKravTxt(String value) {
            this.ftypKravTxt = value;
        }

        /**
         * Gets the value of the taxetyp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTaxetyp() {
            return taxetyp;
        }

        /**
         * Sets the value of the taxetyp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTaxetyp(String value) {
            this.taxetyp = value;
        }

        /**
         * Gets the value of the taxetypNamn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTaxetypNamn() {
            return taxetypNamn;
        }

        /**
         * Sets the value of the taxetypNamn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTaxetypNamn(String value) {
            this.taxetypNamn = value;
        }

        /**
         * Gets the value of the anmTxt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAnmTxt() {
            return anmTxt;
        }

        /**
         * Sets the value of the anmTxt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAnmTxt(String value) {
            this.anmTxt = value;
        }

        /**
         * Startdatum för alla turens maskar inklusive Kupps
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getStartdatum() {
            return startdatum;
        }

        /**
         * Sets the value of the startdatum property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getStartdatum()
         */
        public void setStartdatum(XMLGregorianCalendar value) {
            this.startdatum = value;
        }

        /**
         * Gets the value of the freeAttributes property.
         * 
         * @return
         *     possible object is
         *     {@link FreeAttributes }
         *     
         */
        public FreeAttributes getFreeAttributes() {
            return freeAttributes;
        }

        /**
         * Sets the value of the freeAttributes property.
         * 
         * @param value
         *     allowed object is
         *     {@link FreeAttributes }
         *     
         */
        public void setFreeAttributes(FreeAttributes value) {
            this.freeAttributes = value;
        }

        /**
         * Turens giltighet
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
         * @see #getMasks()
         */
        public void setMasks(MASKTYP value) {
            this.masks = value;
        }

        /**
         * Gets the value of the kupps property.
         * 
         * @return
         *     possible object is
         *     {@link KUPPTYP }
         *     
         */
        public KUPPTYP getKupps() {
            return kupps;
        }

        /**
         * Sets the value of the kupps property.
         * 
         * @param value
         *     allowed object is
         *     {@link KUPPTYP }
         *     
         */
        public void setKupps(KUPPTYP value) {
            this.kupps = value;
        }

    }

}
