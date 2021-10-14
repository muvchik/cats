package cats;
public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Pixy", "female", "persian", "white", 3.6, 4,0.5,0.3);
        Cat cat2 = new Cat("Redpaw", "male", "bengal", "ginger", 4.7, 7,0.7,0.45);
      
        System.out.println(cat1.toString());
        System.out.println(cat2.toString());  

   for (int i=1; i<10; i++){     
   Cat cat = new Cat(i);  
   System.out.println("My cat is:  " + cat ); 
}

Cat cat3=new Cat();
cat3.setName("Василий");
cat3.setBreed("дворовой");

System.out.println(cat3.getBreed()+ " " +  cat3.getName());

MaineCoon cat4 = new MaineCoon();
      cat3.eat("Василий");
      cat4.eat("Мася");

      MaineCoon cat5 = new MaineCoon("Мася", "female", "white", 13.6, 4, 1.5,0.6);
      
      Table table = new Table(4, 2.0, 1.2);
      if (cat1.jumpTo() < table.getHeight())
      System.out.println("Бройлер 747 удачно приземлился");
      else
      System.out.println("Бройлер 747 потерпел крушение");

      if (cat5.jumpTo() < table.getHeight())
          System.out.println("Бройлер 747 удачно приземлился");
          else
          System.out.println("Бройлер 747 потерпел крушение");
      
      
      cat2.sound();
      cat5.sound();
      table.play();
      table.sound();
      
    }
}
