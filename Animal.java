package animalpackage;

public class Animal {
	private String name;
	private int birthYear;
	private double weight;
	private char gender;
	
	public Animal() { //constructor
		name = "";
		birthYear = 1900;
		weight = 0.0;
		gender = 'u';
	}
	
	public Animal(String name, int birthYear, double weight, char gender) { //overloaded constructor
		this.name = name;
		this.birthYear = birthYear;
		//this.weight = weight;
		//this.gender = gender;
		
		if (weight >= 0) {
			this.weight = weight;
		} else {
			weight = -1;
			this.weight = weight;
		}
		
		if (gender =='f' || gender =='m' || gender == 'u') {
			this.gender = gender;
		} else {
			this.gender = 'u';
		}
		
	}
	
	//GETTER METHODS
	public String getName() {
		return name;
	}
	
	public int getBirthYear() {
		return birthYear;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public char getGender() {
		return gender;
	}
	
	//SETTER METHODS
	public void setName(String n) {
		name = n;
	}
	
	public void setBirthYear(int y) {
		birthYear = y;
	}
	
	public void setWeight(double w) {
		weight = w;
		
		if (weight < 0) {
			weight = -1;
		} else {
			weight = w;
		}
	}
	
	public void setGender(char g) {
		gender = g;
		
		if (gender =='f' || gender =='m' || gender == 'u') {
			gender = g;
		} else {
			gender = 'u';
		}
	}
	
	//Current age
	public int calculateAge(int currentYear) {
		int age = 0;
		age = currentYear - birthYear;
		
		if (birthYear > currentYear) {
			return -1;
		} else {
			return age;
		}
	}
	
	public boolean isMale() {
		if (gender == 'm' || gender == 'M') {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isFemale() {
		if (gender == 'f' || gender == 'F') {
			return true;
		} else {
			return false;
		}
	}
	
	//Print Details Method (similar to toString method)
	public String printDetails() {
		String a = "Name = " + name + ", Year = " + birthYear + ", Weight = " + weight + ", Gender = ";
		return a;
	}
	
	//Gain weight Methods
	public void gainWeight() {
		weight = weight + 1;
	}
	
	public void gainWeight(double amount) {
		weight = weight + amount;
		
		if (weight < 0) {
			weight = 0;
		}
		
	}
	
	//Lose Weight Methods
	public void loseWeight() {
		weight = weight - 1;
		
		if (weight < 0) {
			weight = 0;
		}
	}
	
	public void loseWeight(double amount) {
		weight = weight - amount;
		
		if (weight < 0) {
			weight = 0;
		}
	}
}
