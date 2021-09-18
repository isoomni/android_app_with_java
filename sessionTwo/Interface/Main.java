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

        Pet pet1 = new Cat("nyang");
        Pet pet2 = new Dog("baduk");

        pet1.FoodCall();
        pet2.FoodCall();

        ((Cat)pet1).Cry();        // 형 변환을 통해서 클래스로 바로 형변환 할 수도 있다.
    }
}
