public class Printer extends Machine {
	private double def_price = 25;
    private double def_weight = 90;

    
    @Override
    public void setPrice(double p) {
        if (p >= 40 && p <= 200)
            price = p;
        else
            price = def_price;
    }
    public void setWeight(double w) {
        if(w > 0 && w < 50)
            weight = w;
        else
        	weight = def_weight;
    }
}