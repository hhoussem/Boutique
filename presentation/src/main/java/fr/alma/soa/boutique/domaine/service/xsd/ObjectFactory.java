
package fr.alma.soa.boutique.domaine.service.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.alma.soa.boutique.domaine.service.xsd package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CustomerServiceCustomers_QNAME = new QName("", "customers");
    private final static QName _CategoryServiceAllCategories_QNAME = new QName("", "allCategories");
    private final static QName _ProductServiceAllProduct_QNAME = new QName("", "allProduct");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.alma.soa.boutique.domaine.service.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "customers", scope = CustomerService.class)
    public JAXBElement<Object> createCustomerServiceCustomers(Object value) {
        return new JAXBElement<Object>(_CustomerServiceCustomers_QNAME, Object.class, CustomerService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "allCategories", scope = CategoryService.class)
    public JAXBElement<Object> createCategoryServiceAllCategories(Object value) {
        return new JAXBElement<Object>(_CategoryServiceAllCategories_QNAME, Object.class, CategoryService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "allProduct", scope = ProductService.class)
    public JAXBElement<Object> createProductServiceAllProduct(Object value) {
        return new JAXBElement<Object>(_ProductServiceAllProduct_QNAME, Object.class, ProductService.class, value);
    }

}
