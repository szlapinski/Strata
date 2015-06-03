//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.20 at 01:28:29 PM CDT 
//


package com.opengamma.strata.examples.fpml.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A message indicating that the margin quote has been acted upon.
 * 
 * <p>Java class for MarginQuoteConfirmed complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarginQuoteConfirmed">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/pretrade}ResponseMessage">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;group ref="{http://www.fpml.org/FpML-5/pretrade}Events.model"/>
 *           &lt;element name="partyTradeIdentifier" type="{http://www.fpml.org/FpML-5/pretrade}PartyTradeIdentifier"/>
 *         &lt;/choice>
 *         &lt;element name="marginQuote" type="{http://www.fpml.org/FpML-5/pretrade}MarginQuote" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/pretrade}PartiesAndAccounts.model" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarginQuoteConfirmed", propOrder = {
    "tradePackage",
    "trade",
    "partyTradeIdentifier",
    "marginQuote",
    "party",
    "account"
})
public class MarginQuoteConfirmed
    extends ResponseMessage
{

    protected TradePackage tradePackage;
    protected Trade trade;
    protected PartyTradeIdentifier partyTradeIdentifier;
    protected List<MarginQuote> marginQuote;
    protected List<Party> party;
    protected List<Account> account;

    /**
     * Gets the value of the tradePackage property.
     * 
     * @return
     *     possible object is
     *     {@link TradePackage }
     *     
     */
    public TradePackage getTradePackage() {
        return tradePackage;
    }

    /**
     * Sets the value of the tradePackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePackage }
     *     
     */
    public void setTradePackage(TradePackage value) {
        this.tradePackage = value;
    }

    /**
     * Gets the value of the trade property.
     * 
     * @return
     *     possible object is
     *     {@link Trade }
     *     
     */
    public Trade getTrade() {
        return trade;
    }

    /**
     * Sets the value of the trade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Trade }
     *     
     */
    public void setTrade(Trade value) {
        this.trade = value;
    }

    /**
     * Gets the value of the partyTradeIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link PartyTradeIdentifier }
     *     
     */
    public PartyTradeIdentifier getPartyTradeIdentifier() {
        return partyTradeIdentifier;
    }

    /**
     * Sets the value of the partyTradeIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyTradeIdentifier }
     *     
     */
    public void setPartyTradeIdentifier(PartyTradeIdentifier value) {
        this.partyTradeIdentifier = value;
    }

    /**
     * Gets the value of the marginQuote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the marginQuote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarginQuote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarginQuote }
     * 
     * 
     */
    public List<MarginQuote> getMarginQuote() {
        if (marginQuote == null) {
            marginQuote = new ArrayList<MarginQuote>();
        }
        return this.marginQuote;
    }

    /**
     * Gets the value of the party property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the party property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Party }
     * 
     * 
     */
    public List<Party> getParty() {
        if (party == null) {
            party = new ArrayList<Party>();
        }
        return this.party;
    }

    /**
     * Gets the value of the account property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the account property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Account }
     * 
     * 
     */
    public List<Account> getAccount() {
        if (account == null) {
            account = new ArrayList<Account>();
        }
        return this.account;
    }

}