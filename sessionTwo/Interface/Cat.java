package sessionTwo.Interface;

public class Cat extends Animal implements Pet { // extents Animal을 통해 상속을 받는다.
    public Cat(String name) {
        super(name); //super는 상속 받을 때 사용
    }

    @Override
    public void Cry() {
        System.out.println(name + "~~" + name + "~~");
    }

    @Override
    public void FoodCall() {
        System.out.println(name + "  밥~~  " + name + "  밥~~");
    }
}
