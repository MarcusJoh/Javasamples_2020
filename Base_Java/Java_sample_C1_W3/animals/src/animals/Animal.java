package animals;



public class Animal {

	public static void main(String[] args) {

		Dog ebony = new Dog("Ebony", "Cavalier", "Female", 14, 0,
				true, "Old and sleepy girl.");
		
		System.out.println(ebony.toString());
		System.out.println("Is she old? " + ebony.old());
		ebony.setHousetrained(false);
		System.out.println(ebony.toString());

	}
}

