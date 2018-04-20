
public class TestMachine {

	public static void main(String[] args) {
		
		/* create array of 10 objects */
		Machine[] arr = new Machine[10];

        arr[0] = new Printer();
        arr[0].setName("Printer A");
        arr[0].setDescription("This is a laser printer");
        arr[0].setPrice(199);
        arr[0].setWeight(30);

        arr[1] = new Printer();
        arr[1].setName("Printer B");
        arr[1].setDescription("This is an inkjet printer");
        arr[1].setPrice(40);
        arr[1].setWeight(1.5);

        arr[2] = new Printer();
        arr[2].setName("Printer C");
        arr[2].setDescription("This is a slow inkjet printer");
        arr[2].setPrice(70);
        arr[2].setWeight(6);
        
        arr[3] = new Printer();
        arr[3].setName("Printer D");
        arr[3].setDescription("This is a fast inkjet printer");
        arr[3].setPrice(50);
        arr[3].setWeight(7);
        
        arr[4] = new Scanner();
        arr[4].setName("Scanner A");
        arr[4].setDescription("This is black and white scanner");
        arr[4].setPrice(70);
        arr[4].setWeight(4);
        
        arr[5] = new Scanner();
        arr[5].setName("Scanner B");
        arr[5].setDescription("This a color scanner");
        arr[5].setPrice(80);
        arr[5].setWeight(20);
        
        arr[6] = new Scanner();
        arr[6].setName("Scanner C");
        arr[6].setDescription("This scanner is both color and black/white");
        arr[6].setPrice(250);
        arr[6].setWeight(20);
        
        arr[7] = new Smartphone();
        arr[7].setName("Smartphone A");
        arr[7].setDescription("This smartphone has Marshmallow operating system");
        arr[7].setPrice(230);
        arr[7].setWeight(0.4);
        
        arr[8] = new Smartphone();
        arr[8].setName("Smartphone B");
        arr[8].setDescription("This smartphone has KitKat operating sytem");
        arr[8].setPrice(240);
        arr[8].setWeight(0.3);
        
        arr[9] = new Smartphone();
        arr[9].setName("Smartphone C");
        arr[9].setDescription("This smartphone has Jelly Bean operating sytem");
        arr[9].setPrice(235);
        arr[9].setWeight(0.45);
        
        
        /* Print Data */
        for(int i = 0; i < arr.length; i++) {
            System.out.println("Machine: " + (i + 1));
            System.out.println("Name: " + arr[i].getName());
            System.out.println("Description: " + arr[i].getDescription());
            System.out.println("Price: " + arr[i].getPrice());
            System.out.println("Weight: " + arr[i].getWeight() + "\n");
        }
    }
}