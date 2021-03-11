package lewisu.ood.week1;

public class DecoratorPattern {
	   public static void main(String[] args) {

	      Pizza TCP = new ThinCrustPizza();

	      Pizza cheeseTop = new CheeseTopping(new ThinCrustPizza());

	      Pizza ThCP = new CheeseTopping(new ThickCrustPizza());
	      System.out.println("Thin Crust Pizza");
	      TCP.getDescription();

	      System.out.println("\n Thin Crust Cheese Topping");
	      cheeseTop.getDescription();

	      System.out.println("\n Thick Crust Cheese Topping");
	      ThCP.getDescription();
	   }
}
