package cats;

public class Cat implements Talk{
    protected String name, gender, breed, colour;
    protected double weight;
    protected int age;
    private double length;
    private double height;

    public Cat(String name, String gender, String breed, String colour, double weight, int age,double length, double height) {
        this.name = name;
        this.gender = gender;
        this.breed = breed;
        this.colour = colour;
        this.weight = weight;
        this.age = age;
        
        this.length = length;
        this.height = height;
    }

    public Cat() {
    }
 
 public Cat(int number) {
   this.name="Vasy"+Integer.toString(number);
    }

public void setName(String name) { this.name = name; }
public void setBreed(String breed) { this.breed = breed; }

public String getName() { return name; }
public String getBreed() { return breed; }

void eat(String name) {
   System.out.print(name);
System.out.println(" ам-ам");
 }  

@Override
public void sound() {
	System. out .println ("мяу"); 
}

    public String toString() {
        
        return "Cat's \n" +
                "Name: " + name + "\n" +
                "Gender: " + gender + "\n" +
                "Breed: " + breed + "\n" +
                "Colour: " + colour + "\n" +
                "Weight: " + weight + "\n" +
                "Age: " + age + "\n" ;
    }
    
    public double jumpTo() {
    	if ((length * height * 6.5 / weight) > 2 || (length * height * 6.5 / weight) < 0.5)
    	return (20 * length * height * 0.5);
    	return (20 * length * height);
    	}
}