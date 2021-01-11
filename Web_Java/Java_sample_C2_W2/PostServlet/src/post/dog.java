package post;

public class dog {

	private String name;
	private String race;
	private String gender;
	private int age;
	private int aggressiveLvl;
	private boolean housetrained;
	private String comment;

	public dog() {
		this.name = "";
		this.race = "";
		this.gender = "";
		this.age = 0;
		this.aggressiveLvl = 0;
		this.housetrained = true;
		this.comment = "";

	}

	public dog(String name, String race, String gender, int age, int aggressiveLvl, boolean housetrained,
			String comment) {

		this.name = name;
		this.race = race;
		this.gender = gender;
		this.age = age;
		this.aggressiveLvl = checkLevel(aggressiveLvl);
		this.housetrained = housetrained;
		this.comment = comment;
	}

	public int checkLevel(int aggressiveLvl) {

		if (aggressiveLvl < 1) {
			aggressiveLvl = 1;
		} else if (aggressiveLvl > 10) {
			aggressiveLvl = 10;
		}

		return aggressiveLvl;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAggressiveLvl() {
		return aggressiveLvl;
	}

	public void setAggressiveLvl(int aggressiveLvl) {
		this.aggressiveLvl = checkLevel(aggressiveLvl);
	}

	public boolean isHousetrained() {
		return housetrained;
	}

	public void setHousetrained(boolean housetrained) {
		this.housetrained = housetrained;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "Name:" + name + ", race: " + race + ", gender: " + gender + "\nAge= " + age + ", aggressiveLvl: "
				+ aggressiveLvl + ", housetrained: " + housetrained + "\nComment: " + comment;
	}

	public boolean old() {
		return age > 8;
	}

}
