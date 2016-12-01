package fr.alma.soa.boutique.presentation.boot;

import fr.alma.soa.boutique.application.webservice.BoutiqueWebServices;
import fr.alma.soa.boutique.application.webservice.impl.BoutiqueWebServicesImpl;
import fr.alma.soa.boutique.domaine.model.dto.CategoryDto;

public class Boot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PresentationEntry entry = new PresentationEntry();
		BoutiqueWebServices boutiqueWs = entry.getContext().getBean(BoutiqueWebServicesImpl.class);
		boutiqueWs.getProductsByCategory(new CategoryDto());
		CategoryDto cat = boutiqueWs.getCategoryById(2345);
	}

}
