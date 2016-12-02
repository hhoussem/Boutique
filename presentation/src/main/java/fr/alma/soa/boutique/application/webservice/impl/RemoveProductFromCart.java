
package fr.alma.soa.boutique.application.webservice.impl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import fr.alma.soa.boutique.domaine.model.dto.CustomerDto;
import fr.alma.soa.boutique.domaine.model.dto.ProductDto;


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
 *         &lt;element name="customer" type="{http://dto.model.domaine.boutique.soa.alma.fr/xsd}CustomerDto" minOccurs="0"/>
 *         &lt;element name="product" type="{http://dto.model.domaine.boutique.soa.alma.fr/xsd}ProductDto" minOccurs="0"/>
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
    "customer",
    "product"
})
@XmlRootElement(name = "removeProductFromCart")
public class RemoveProductFromCart {

    @XmlElementRef(name = "customer", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomerDto> customer;
    @XmlElementRef(name = "product", type = JAXBElement.class, required = false)
    protected JAXBElement<ProductDto> product;

    /**
     * Obtient la valeur de la propriété customer.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CustomerDto }{@code >}
     *     
     */
    public JAXBElement<CustomerDto> getCustomer() {
        return customer;
    }

    /**
     * Définit la valeur de la propriété customer.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CustomerDto }{@code >}
     *     
     */
    public void setCustomer(JAXBElement<CustomerDto> value) {
        this.customer = value;
    }

    /**
     * Obtient la valeur de la propriété product.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProductDto }{@code >}
     *     
     */
    public JAXBElement<ProductDto> getProduct() {
        return product;
    }

    /**
     * Définit la valeur de la propriété product.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProductDto }{@code >}
     *     
     */
    public void setProduct(JAXBElement<ProductDto> value) {
        this.product = value;
    }

}
