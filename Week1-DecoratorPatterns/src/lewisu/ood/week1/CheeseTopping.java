package lewisu.ood.week1;

public class CheeseTopping extends ToppingPizzaDecorator {

	   public CheeseTopping(Pizza decoratedPizza) {
	      super(decoratedPizza);		
	   }

	   @Override
	   public void getDescription() {
	      decoratedPizza.getDescription();	       
	      setCheeseTopping(decoratedPizza);
	   }

	   private void setCheeseTopping(Pizza decoratedPizza){
	      System.out.println("CheeseTopping");
	   }
}
