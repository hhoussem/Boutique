package fr.alma.soa.boutique.domaine.model;

public interface IShoppingCart {

	public boolean addProduct(IProduct product, int qty);

	public void removeProduct(IProduct product);

	public boolean validateCart();

}
