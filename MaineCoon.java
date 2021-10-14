package cats;

public class MaineCoon extends Cat{
    private int size;
    MaineCoon(int size) 
    { 
    super();  
    this.size=size;
    }
  
      MaineCoon() 
    { 
    super();  
    }
      
      public MaineCoon(String name, String gender, String colour, double weight, int age,double length, double height) {
    	  super();    
      }
    
  @Override
  public void eat(String name) 
  {
    System.out.print(name);
  for (int i = 1; i <= 10; i++) 
  {
  System.out.println(" ам-ам");
  }
  }
  
  @Override
  public void sound() {
  	System. out .println ("мяуууууууууу"); 
  }
  }