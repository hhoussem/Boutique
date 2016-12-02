
package fr.alma.soa.boutique.application.webservice.impl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import fr.alma.soa.boutique.domaine.model.dto.ShoppingCartDto;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cartDto" type="{http://dto.model.domaine.boutique.soa.alma.fr/xsd}ShoppingCartDto" minOccurs="0"/>
 *         &lt;element name="newCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "cartDto",
    "newCurrency"
})
@XmlRootElement(name = "changeCurrency")
public class ChangeCurrency {

    @XmlElementRef(name = "cartDto", type = JAXBElement.class, required = false)
    protected JAXBElement<ShoppingCartDto> cartDto;
    @XmlElementRef(name = "newCurrency", type = JAXBElement.class, required = false)
    protected JAXBElement<String> newCurrency;

    /**
     * Obtient la valeur de la propriété cartDto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ShoppingCartDto }{@code >}
     *     
     */
    public JAXBElement<ShoppingCartDto> getCartDto() {
        return cartDto;
    }

    /**
     * Définit la valeur de la propriété cartDto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ShoppingCartDto }{@code >}
     *     
     */
    public void setCartDto(JAXBElement<ShoppingCartDto> value) {
        this.cartDto = value;
    }

    /**
     * Obtient la valeur de la propriété newCurrency.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNewCurrency() {
        return newCurrency;
    }

    /**
     * Définit la valeur de la propriété newCurrency.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNewCurrency(JAXBElement<String> value) {
        this.newCurrency = value;
    }

}
