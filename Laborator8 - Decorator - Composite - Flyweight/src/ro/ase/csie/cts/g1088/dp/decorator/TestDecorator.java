package ro.ase.csie.cts.g1088.dp.decorator;

public class TestDecorator {

	public static void main(String[] args) {
		
		SuperErou dragon = new Dragon("Dragonul albastru", 1000);
		dragon.alearga();
		dragon.esteLovit(800);
		dragon.seVindeca(100);
		
		SuperErou dragon2 = new Dragon("Dragonul alben", 1000);
		dragon2.alearga();
		dragon2.esteLovit(200);
		dragon2.seVindeca(100);
		
		//aplicam decoratori pe primul dragon - un singur obiect se va modifica
		//SuperErou dragonCuArmura = new DecoratorArmura(dragon, 300);
		//dragonCuArmura.esteLovit(400);
		
		dragon = new DecoratorArmura(dragon, 300);
		dragon.esteLovit(400);
		
		dragon = new DecoratorEsteRanit(dragon);
		dragon.esteLovit(600);
		dragon.alearga();
	}

}
