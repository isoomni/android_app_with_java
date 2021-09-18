package sessionTwo.InterfaceOne;

public class Dog extends Animal implements Pet {

    public Dog(String name) {
        super(name); //super는 상속 받을 때 사용
    }
    
    @Override
    public void Cry() {
        System.out.println(name + "!" + name + "!");
    }

    @Override
    public void FoodCall() {
        System.out.println(name + "  밥!!!  " + name + "  밥!!!");
    }
}
