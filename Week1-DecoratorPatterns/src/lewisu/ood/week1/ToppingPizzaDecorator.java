package lewisu.ood.week1;

public abstract class ToppingPizzaDecorator {
	protected Pizza decoratedPizza;

	   public ToppingPizzaDecorator(Pizza decoratedPizza){
	      this.decoratedPizza = decoratedPizza;
	   }

	   public void getDescription(){
	      decoratedPizza.getDescription();
	   }	

}
