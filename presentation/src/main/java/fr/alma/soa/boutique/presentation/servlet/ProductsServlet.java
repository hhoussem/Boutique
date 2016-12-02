package fr.alma.soa.boutique.presentation.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import fr.alma.soa.boutique.application.webservice.impl.BoutiqueServices;
import fr.alma.soa.boutique.application.webservice.impl.BoutiqueServicesPortType;
import fr.alma.soa.boutique.domaine.model.dto.CategoryDto;
import fr.alma.soa.boutique.domaine.model.dto.CustomerDto;
import fr.alma.soa.boutique.domaine.model.dto.ProductDto;

/**
 * Servlet implementation class ProductsServlet
 */
public class ProductsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ProductsServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		BoutiqueServices boutiqueServices = BoutiqueServices.getInstance();
		BoutiqueServicesPortType boutiqueWs = boutiqueServices.getBoutiqueServicesHttpSoap11Endpoint();
		System.out.println("==> Et ICI?!!");
		boutiqueWs.getProductsByCategory(new CategoryDto());
		CategoryDto cat = boutiqueWs.getCategoryById(2345);

		List<CategoryDto> allCategories = boutiqueWs.getAllCategories();
		request.setAttribute("allCategories", allCategories);
		List<ProductDto> products = null;
		try {
			String idStr = request.getParameter("category");
			if(idStr!=null){
			int categoryId = Integer.parseInt(idStr);
			System.out.println(categoryId);
			if (categoryId != 0 ) {
				CategoryDto category = boutiqueWs.getCategoryById(categoryId);
				System.out.println(category.getName());
				products = boutiqueWs.getProductsByCategory(category);
			}
			}else {
				products = boutiqueWs.getAllProductList();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		CustomerDto customer = boutiqueWs.getCustomers().get(0);
		int cartSize = customer.getShoppingCart().getProducts().size();
		request.setAttribute("cartSize", cartSize);

		request.setAttribute("products", products);

		request.getRequestDispatcher("index.jsp").forward(request, response);
		// response.getWriter().append("Served at:
		// ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
