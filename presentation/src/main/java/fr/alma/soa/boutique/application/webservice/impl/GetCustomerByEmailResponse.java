
package fr.alma.soa.boutique.application.webservice.impl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import fr.alma.soa.boutique.domaine.model.dto.CustomerDto;


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
 *         &lt;element name="return" type="{http://dto.model.domaine.boutique.soa.alma.fr/xsd}CustomerDto" minOccurs="0"/>
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
    "_return"
})
@XmlRootElement(name = "getCustomerByEmailResponse")
public class GetCustomerByEmailResponse {

    @XmlElementRef(name = "return", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomerDto> _return;

    /**
     * Obtient la valeur de la propriété return.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CustomerDto }{@code >}
     *     
     */
    public JAXBElement<CustomerDto> getReturn() {
        return _return;
    }

    /**
     * Définit la valeur de la propriété return.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CustomerDto }{@code >}
     *     
     */
    public void setReturn(JAXBElement<CustomerDto> value) {
        this._return = value;
    }

}
