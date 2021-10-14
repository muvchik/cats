package cats;

public class Table extends Furniture implements Action, Talk{
private int legs;
public Table (int legs, Double length, Double height) {
super( length, height);
this.legs = legs;
}

	public void sound () {
		System. out .println ("скрипеть, пока хозяин пьют кофе");
	}
	
	public void play () {
		System. out .println ("ударить ногу хозяина");
		
	}



}