
package fr.alma.soa.boutique.application.webservice.impl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import fr.alma.soa.boutique.domaine.service.xsd.ShoppingCartService;


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
 *         &lt;element name="shoppingCartService" type="{http://service.domaine.boutique.soa.alma.fr/xsd}ShoppingCartService" minOccurs="0"/>
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
    "shoppingCartService"
})
@XmlRootElement(name = "setShoppingCartService")
public class SetShoppingCartService {

    @XmlElementRef(name = "shoppingCartService", type = JAXBElement.class, required = false)
    protected JAXBElement<ShoppingCartService> shoppingCartService;

    /**
     * Obtient la valeur de la propriété shoppingCartService.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ShoppingCartService }{@code >}
     *     
     */
    public JAXBElement<ShoppingCartService> getShoppingCartService() {
        return shoppingCartService;
    }

    /**
     * Définit la valeur de la propriété shoppingCartService.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ShoppingCartService }{@code >}
     *     
     */
    public void setShoppingCartService(JAXBElement<ShoppingCartService> value) {
        this.shoppingCartService = value;
    }

}
