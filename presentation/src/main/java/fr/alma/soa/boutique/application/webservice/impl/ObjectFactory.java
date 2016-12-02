
package fr.alma.soa.boutique.application.webservice.impl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import fr.alma.soa.boutique.domaine.model.dto.CategoryDto;
import fr.alma.soa.boutique.domaine.model.dto.CustomerDto;
import fr.alma.soa.boutique.domaine.model.dto.ProductDto;
import fr.alma.soa.boutique.domaine.model.dto.ShoppingCartDto;
import fr.alma.soa.boutique.domaine.service.xsd.CategoryService;
import fr.alma.soa.boutique.domaine.service.xsd.CustomerService;
import fr.alma.soa.boutique.domaine.service.xsd.ProductService;
import fr.alma.soa.boutique.domaine.service.xsd.ShoppingCartService;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.alma.soa.boutique.application.webservice.impl package. 
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

    private final static QName _SetCustomerServiceCustomerService_QNAME = new QName("", "customerService");
    private final static QName _GetCustomerByEmailResponseReturn_QNAME = new QName("", "return");
    private final static QName _GetCustomerByEmailEmail_QNAME = new QName("", "email");
    private final static QName _GetProductsByCategoryCategory_QNAME = new QName("", "category");
    private final static QName _SetShoppingCartServiceShoppingCartService_QNAME = new QName("", "shoppingCartService");
    private final static QName _SetProductServiceProductService_QNAME = new QName("", "productService");
    private final static QName _ChangeCurrencyCartDto_QNAME = new QName("", "cartDto");
    private final static QName _ChangeCurrencyNewCurrency_QNAME = new QName("", "newCurrency");
    private final static QName _AddProductToCartProduct_QNAME = new QName("", "product");
    private final static QName _AddProductToCartCustomer_QNAME = new QName("", "customer");
    private final static QName _SetCategoryServiceCategoryService_QNAME = new QName("", "categoryService");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.alma.soa.boutique.application.webservice.impl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddProductToCartResponse }
     * 
     */
    public AddProductToCartResponse createAddProductToCartResponse() {
        return new AddProductToCartResponse();
    }

    /**
     * Create an instance of {@link RemoveProductFromCart }
     * 
     */
    public RemoveProductFromCart createRemoveProductFromCart() {
        return new RemoveProductFromCart();
    }

    /**
     * Create an instance of {@link GetCustomers }
     * 
     */
    public GetCustomers createGetCustomers() {
        return new GetCustomers();
    }

    /**
     * Create an instance of {@link SetCategoryService }
     * 
     */
    public SetCategoryService createSetCategoryService() {
        return new SetCategoryService();
    }

    /**
     * Create an instance of {@link GetAllProductListResponse }
     * 
     */
    public GetAllProductListResponse createGetAllProductListResponse() {
        return new GetAllProductListResponse();
    }

    /**
     * Create an instance of {@link ChangeCurrency }
     * 
     */
    public ChangeCurrency createChangeCurrency() {
        return new ChangeCurrency();
    }

    /**
     * Create an instance of {@link RemoveProductFromCartResponse }
     * 
     */
    public RemoveProductFromCartResponse createRemoveProductFromCartResponse() {
        return new RemoveProductFromCartResponse();
    }

    /**
     * Create an instance of {@link GetCustomerByEmail }
     * 
     */
    public GetCustomerByEmail createGetCustomerByEmail() {
        return new GetCustomerByEmail();
    }

    /**
     * Create an instance of {@link AddProductToCart }
     * 
     */
    public AddProductToCart createAddProductToCart() {
        return new AddProductToCart();
    }

    /**
     * Create an instance of {@link GetAllCategories }
     * 
     */
    public GetAllCategories createGetAllCategories() {
        return new GetAllCategories();
    }

    /**
     * Create an instance of {@link GetProductByIdResponse }
     * 
     */
    public GetProductByIdResponse createGetProductByIdResponse() {
        return new GetProductByIdResponse();
    }

    /**
     * Create an instance of {@link GetProductById }
     * 
     */
    public GetProductById createGetProductById() {
        return new GetProductById();
    }

    /**
     * Create an instance of {@link GetProductsByCategoryResponse }
     * 
     */
    public GetProductsByCategoryResponse createGetProductsByCategoryResponse() {
        return new GetProductsByCategoryResponse();
    }

    /**
     * Create an instance of {@link SetCustomerService }
     * 
     */
    public SetCustomerService createSetCustomerService() {
        return new SetCustomerService();
    }

    /**
     * Create an instance of {@link SetShoppingCartService }
     * 
     */
    public SetShoppingCartService createSetShoppingCartService() {
        return new SetShoppingCartService();
    }

    /**
     * Create an instance of {@link SetProductService }
     * 
     */
    public SetProductService createSetProductService() {
        return new SetProductService();
    }

    /**
     * Create an instance of {@link GetCustomersResponse }
     * 
     */
    public GetCustomersResponse createGetCustomersResponse() {
        return new GetCustomersResponse();
    }

    /**
     * Create an instance of {@link GetCustomerByEmailResponse }
     * 
     */
    public GetCustomerByEmailResponse createGetCustomerByEmailResponse() {
        return new GetCustomerByEmailResponse();
    }

    /**
     * Create an instance of {@link GetAllCategoriesResponse }
     * 
     */
    public GetAllCategoriesResponse createGetAllCategoriesResponse() {
        return new GetAllCategoriesResponse();
    }

    /**
     * Create an instance of {@link GetCategoryById }
     * 
     */
    public GetCategoryById createGetCategoryById() {
        return new GetCategoryById();
    }

    /**
     * Create an instance of {@link GetAllProductList }
     * 
     */
    public GetAllProductList createGetAllProductList() {
        return new GetAllProductList();
    }

    /**
     * Create an instance of {@link GetProductsByCategory }
     * 
     */
    public GetProductsByCategory createGetProductsByCategory() {
        return new GetProductsByCategory();
    }

    /**
     * Create an instance of {@link GetCategoryByIdResponse }
     * 
     */
    public GetCategoryByIdResponse createGetCategoryByIdResponse() {
        return new GetCategoryByIdResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "customerService", scope = SetCustomerService.class)
    public JAXBElement<CustomerService> createSetCustomerServiceCustomerService(CustomerService value) {
        return new JAXBElement<CustomerService>(_SetCustomerServiceCustomerService_QNAME, CustomerService.class, SetCustomerService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "return", scope = GetCustomerByEmailResponse.class)
    public JAXBElement<CustomerDto> createGetCustomerByEmailResponseReturn(CustomerDto value) {
        return new JAXBElement<CustomerDto>(_GetCustomerByEmailResponseReturn_QNAME, CustomerDto.class, GetCustomerByEmailResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShoppingCartDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "return", scope = AddProductToCartResponse.class)
    public JAXBElement<ShoppingCartDto> createAddProductToCartResponseReturn(ShoppingCartDto value) {
        return new JAXBElement<ShoppingCartDto>(_GetCustomerByEmailResponseReturn_QNAME, ShoppingCartDto.class, AddProductToCartResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShoppingCartDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "return", scope = RemoveProductFromCartResponse.class)
    public JAXBElement<ShoppingCartDto> createRemoveProductFromCartResponseReturn(ShoppingCartDto value) {
        return new JAXBElement<ShoppingCartDto>(_GetCustomerByEmailResponseReturn_QNAME, ShoppingCartDto.class, RemoveProductFromCartResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "email", scope = GetCustomerByEmail.class)
    public JAXBElement<String> createGetCustomerByEmailEmail(String value) {
        return new JAXBElement<String>(_GetCustomerByEmailEmail_QNAME, String.class, GetCustomerByEmail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoryDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "category", scope = GetProductsByCategory.class)
    public JAXBElement<CategoryDto> createGetProductsByCategoryCategory(CategoryDto value) {
        return new JAXBElement<CategoryDto>(_GetProductsByCategoryCategory_QNAME, CategoryDto.class, GetProductsByCategory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShoppingCartService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "shoppingCartService", scope = SetShoppingCartService.class)
    public JAXBElement<ShoppingCartService> createSetShoppingCartServiceShoppingCartService(ShoppingCartService value) {
        return new JAXBElement<ShoppingCartService>(_SetShoppingCartServiceShoppingCartService_QNAME, ShoppingCartService.class, SetShoppingCartService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "productService", scope = SetProductService.class)
    public JAXBElement<ProductService> createSetProductServiceProductService(ProductService value) {
        return new JAXBElement<ProductService>(_SetProductServiceProductService_QNAME, ProductService.class, SetProductService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShoppingCartDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "cartDto", scope = ChangeCurrency.class)
    public JAXBElement<ShoppingCartDto> createChangeCurrencyCartDto(ShoppingCartDto value) {
        return new JAXBElement<ShoppingCartDto>(_ChangeCurrencyCartDto_QNAME, ShoppingCartDto.class, ChangeCurrency.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "newCurrency", scope = ChangeCurrency.class)
    public JAXBElement<String> createChangeCurrencyNewCurrency(String value) {
        return new JAXBElement<String>(_ChangeCurrencyNewCurrency_QNAME, String.class, ChangeCurrency.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "product", scope = AddProductToCart.class)
    public JAXBElement<ProductDto> createAddProductToCartProduct(ProductDto value) {
        return new JAXBElement<ProductDto>(_AddProductToCartProduct_QNAME, ProductDto.class, AddProductToCart.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "customer", scope = AddProductToCart.class)
    public JAXBElement<CustomerDto> createAddProductToCartCustomer(CustomerDto value) {
        return new JAXBElement<CustomerDto>(_AddProductToCartCustomer_QNAME, CustomerDto.class, AddProductToCart.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "product", scope = RemoveProductFromCart.class)
    public JAXBElement<ProductDto> createRemoveProductFromCartProduct(ProductDto value) {
        return new JAXBElement<ProductDto>(_AddProductToCartProduct_QNAME, ProductDto.class, RemoveProductFromCart.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "customer", scope = RemoveProductFromCart.class)
    public JAXBElement<CustomerDto> createRemoveProductFromCartCustomer(CustomerDto value) {
        return new JAXBElement<CustomerDto>(_AddProductToCartCustomer_QNAME, CustomerDto.class, RemoveProductFromCart.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoryService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "categoryService", scope = SetCategoryService.class)
    public JAXBElement<CategoryService> createSetCategoryServiceCategoryService(CategoryService value) {
        return new JAXBElement<CategoryService>(_SetCategoryServiceCategoryService_QNAME, CategoryService.class, SetCategoryService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "return", scope = GetProductByIdResponse.class)
    public JAXBElement<ProductDto> createGetProductByIdResponseReturn(ProductDto value) {
        return new JAXBElement<ProductDto>(_GetCustomerByEmailResponseReturn_QNAME, ProductDto.class, GetProductByIdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoryDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "return", scope = GetCategoryByIdResponse.class)
    public JAXBElement<CategoryDto> createGetCategoryByIdResponseReturn(CategoryDto value) {
        return new JAXBElement<CategoryDto>(_GetCustomerByEmailResponseReturn_QNAME, CategoryDto.class, GetCategoryByIdResponse.class, value);
    }

}
