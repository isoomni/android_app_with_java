package sessionTwo.Interface;

public class Dog extends Animal {

    public Dog(String name) {
        super(name); //super는 상속 받을 때 사용
    }
    
    @Override
    public void Cry() {
        System.out.println(name + "!" + name + "!");
    }
}
