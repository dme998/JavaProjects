public class Smartphone extends Machine {
	private double def_price = 200;
	private double def_weight = 0.3;
	
	
	@Override
	public void setPrice(double p) {
		if (p >= 220 && p <= 350)
			price = p;
		else
			price = def_price;
	}
	public void setWeight(double w) {
		if (w > 0.25 && w < 0.5)
			weight = w;
		else
			weight = def_weight;
	}
}