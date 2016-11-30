package fr.alma.soa.boutique.presentation.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.alma.soa.boutique.application.ApplicationEntry;
import fr.alma.soa.boutique.application.webservice.BoutiqueWebServices;
import fr.alma.soa.boutique.application.webservice.impl.BoutiqueWebServicesImpl;
import fr.alma.soa.boutique.domaine.model.dto.CategoryDto;
import fr.alma.soa.boutique.domaine.model.dto.ProductDto;
import fr.alma.soa.boutique.domaine.service.ProductService;
import fr.alma.soa.boutique.domaine.service.impl.ProductServiceImpl;

/**
 * Servlet implementation class BoutiqueServlet
 */
public class BoutiqueServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoutiqueServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		ApplicationEntry entry = new ApplicationEntry();
		BoutiqueWebServices boutiqueWs = entry.getContext().getBean(BoutiqueWebServicesImpl.class);
		
		List<CategoryDto> allCategories = boutiqueWs.getAllCategories();	
		request.setAttribute("allCategories", allCategories);
		
		List<ProductDto> allProducts = boutiqueWs.getAllProductList();
		request.setAttribute("allProducts", allProducts);
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
