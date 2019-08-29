
public class Cat extends Organism implements Cats {

	public Cat(int sleppingTime, String kindOfFun, String gender, String name) {
		super(sleppingTime, kindOfFun, gender, name);

	}

	public String toString() {
		return "Name: " + name + " Gender: " + gender + " Kind of fun: " + kindOfFun + " Type of food: " + eat
				+ " Sound: " + sound + " Slepping time: " + sleppingTime + "h";
	}

}
