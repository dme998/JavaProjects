public class Scanner extends Machine {
	private double def_price = 80;
	private double def_weight = 10;
	
	
	@Override
	public void setPrice(double p) {
		if (p >= 60 && p <= 300)
			price = p;
		else
			price = def_price;
	}
	public void setWeight(double w) {
		if (w > 2 && w < 25)
			weight = w;
		else
			weight = def_weight;
	}
}