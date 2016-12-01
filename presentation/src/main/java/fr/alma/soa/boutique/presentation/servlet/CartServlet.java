package fr.alma.soa.boutique.presentation.servlet;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.alma.soa.boutique.application.ApplicationEntry;
import fr.alma.soa.boutique.application.webservice.BoutiqueWebServices;
import fr.alma.soa.boutique.application.webservice.impl.BoutiqueWebServicesImpl;
import fr.alma.soa.boutique.domaine.model.dto.CustomerDto;
import fr.alma.soa.boutique.domaine.model.dto.ProductDto;
import fr.alma.soa.boutique.domaine.model.dto.ShoppingCartDto;
/**
 * Servlet implementation class CartServlet
 */
public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ApplicationEntry entry =  ApplicationEntry.getInstance();
		BoutiqueWebServices boutiqueWs = entry.getContext().getBean(BoutiqueWebServicesImpl.class);
		
		CustomerDto customer = boutiqueWs.getCustomers().get(0);
		
		ShoppingCartDto cart = null;
		if(request.getParameter("addToCart")!=null)
		{
			System.out.println("yes");
			String idString = request.getParameter("productId");
			if(idString !=null){
				int productId = Integer.parseInt(idString);
				System.out.println(idString);
				ProductDto newProduct =  boutiqueWs.getProductById(productId);
				cart = boutiqueWs.addProductToCart(customer, newProduct, 1);
			}
				
		}

		else
		{
			cart = boutiqueWs.getCustomers().get(0).getShoppingCart();
		}
		if(cart != null){
			request.setAttribute("products", cart.getProducts());
			request.setAttribute("cartSize", cart.getProducts().size());
		}
		
		
		request.getRequestDispatcher("cart.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
