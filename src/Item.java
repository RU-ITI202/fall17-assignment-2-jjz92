
public class Item {
	private int barcode;
	private String name;
	private double cost;
	private char category; //3 category Food 'A', Clothes 'B', Other 'C'
	
	public Item(){

	}
	
	public Item(int barcode, String name, double cost, char category ){
		this.barcode = barcode;
		this.name = name;
		this.cost = cost;
		this.category = category;
	}
	
	public String toString(){
		return "not-implemented";	
	}
	//create get/set method to update Item once it is created
	
}
