
package fr.alma.soa.boutique.application.webservice.impl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import fr.alma.soa.boutique.domaine.service.xsd.CategoryService;


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
 *         &lt;element name="categoryService" type="{http://service.domaine.boutique.soa.alma.fr/xsd}CategoryService" minOccurs="0"/>
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
    "categoryService"
})
@XmlRootElement(name = "setCategoryService")
public class SetCategoryService {

    @XmlElementRef(name = "categoryService", type = JAXBElement.class, required = false)
    protected JAXBElement<CategoryService> categoryService;

    /**
     * Obtient la valeur de la propriété categoryService.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CategoryService }{@code >}
     *     
     */
    public JAXBElement<CategoryService> getCategoryService() {
        return categoryService;
    }

    /**
     * Définit la valeur de la propriété categoryService.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CategoryService }{@code >}
     *     
     */
    public void setCategoryService(JAXBElement<CategoryService> value) {
        this.categoryService = value;
    }

}
