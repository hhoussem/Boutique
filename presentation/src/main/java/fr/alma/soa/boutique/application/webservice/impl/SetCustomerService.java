
package fr.alma.soa.boutique.application.webservice.impl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import fr.alma.soa.boutique.domaine.service.xsd.CustomerService;


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
 *         &lt;element name="customerService" type="{http://service.domaine.boutique.soa.alma.fr/xsd}CustomerService" minOccurs="0"/>
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
    "customerService"
})
@XmlRootElement(name = "setCustomerService")
public class SetCustomerService {

    @XmlElementRef(name = "customerService", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomerService> customerService;

    /**
     * Obtient la valeur de la propriété customerService.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CustomerService }{@code >}
     *     
     */
    public JAXBElement<CustomerService> getCustomerService() {
        return customerService;
    }

    /**
     * Définit la valeur de la propriété customerService.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CustomerService }{@code >}
     *     
     */
    public void setCustomerService(JAXBElement<CustomerService> value) {
        this.customerService = value;
    }

}
