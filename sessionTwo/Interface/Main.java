package sessionTwo.Interface;

public class Main {
    public static void main(String[] args){
        
        //Animal animal = new Animal(); // 추상클래스는 new() 객체 생성이 불가능하다.
        
        Animal dog = new Dog("baduk");
        Animal cat = new Cat("mew");
        Animal wolf = new Wolf("wolf");

        dog.Cry();
        cat.Cry();
        wolf.Cry();

        Pet pet1 = new Cat("mew");
        Pet pet2 = new Dog("baduk");

        pet1.FoodCall();
        pet2.FoodCall();
    }
}
