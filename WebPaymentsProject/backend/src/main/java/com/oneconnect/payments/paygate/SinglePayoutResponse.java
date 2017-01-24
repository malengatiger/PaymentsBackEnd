
package com.oneconnect.payments.paygate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="CardPayoutResponse" type="{http://www.paygate.co.za/PayHOST}CardPayoutResponseType"/>
 *           &lt;element name="BankPayoutResponse" type="{http://www.paygate.co.za/PayHOST}BankPayoutResponseType"/>
 *           &lt;element name="WalletPayoutResponse" type="{http://www.paygate.co.za/PayHOST}WalletPayoutResponseType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cardPayoutResponse",
    "bankPayoutResponse",
    "walletPayoutResponse"
})
@XmlRootElement(name = "SinglePayoutResponse")
public class SinglePayoutResponse {

    @XmlElement(name = "CardPayoutResponse")
    protected CardPayoutResponseType cardPayoutResponse;
    @XmlElement(name = "BankPayoutResponse")
    protected BankPayoutResponseType bankPayoutResponse;
    @XmlElement(name = "WalletPayoutResponse")
    protected WalletPayoutResponseType walletPayoutResponse;

    /**
     * Gets the value of the cardPayoutResponse property.
     * 
     * @return
     *     possible object is
     *     {@link CardPayoutResponseType }
     *     
     */
    public CardPayoutResponseType getCardPayoutResponse() {
        return cardPayoutResponse;
    }

    /**
     * Sets the value of the cardPayoutResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPayoutResponseType }
     *     
     */
    public void setCardPayoutResponse(CardPayoutResponseType value) {
        this.cardPayoutResponse = value;
    }

    /**
     * Gets the value of the bankPayoutResponse property.
     * 
     * @return
     *     possible object is
     *     {@link BankPayoutResponseType }
     *     
     */
    public BankPayoutResponseType getBankPayoutResponse() {
        return bankPayoutResponse;
    }

    /**
     * Sets the value of the bankPayoutResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankPayoutResponseType }
     *     
     */
    public void setBankPayoutResponse(BankPayoutResponseType value) {
        this.bankPayoutResponse = value;
    }

    /**
     * Gets the value of the walletPayoutResponse property.
     * 
     * @return
     *     possible object is
     *     {@link WalletPayoutResponseType }
     *     
     */
    public WalletPayoutResponseType getWalletPayoutResponse() {
        return walletPayoutResponse;
    }

    /**
     * Sets the value of the walletPayoutResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link WalletPayoutResponseType }
     *     
     */
    public void setWalletPayoutResponse(WalletPayoutResponseType value) {
        this.walletPayoutResponse = value;
    }

}