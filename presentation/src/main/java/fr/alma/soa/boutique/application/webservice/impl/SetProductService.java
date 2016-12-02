
package fr.alma.soa.boutique.application.webservice.impl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import fr.alma.soa.boutique.domaine.service.xsd.ProductService;


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
 *         &lt;element name="productService" type="{http://service.domaine.boutique.soa.alma.fr/xsd}ProductService" minOccurs="0"/>
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
    "productService"
})
@XmlRootElement(name = "setProductService")
public class SetProductService {

    @XmlElementRef(name = "productService", type = JAXBElement.class, required = false)
    protected JAXBElement<ProductService> productService;

    /**
     * Obtient la valeur de la propriété productService.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProductService }{@code >}
     *     
     */
    public JAXBElement<ProductService> getProductService() {
        return productService;
    }

    /**
     * Définit la valeur de la propriété productService.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProductService }{@code >}
     *     
     */
    public void setProductService(JAXBElement<ProductService> value) {
        this.productService = value;
    }

}
