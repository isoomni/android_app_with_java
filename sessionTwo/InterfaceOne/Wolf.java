package sessionTwo.InterfaceOne;

public class Wolf extends Animal{
    public Wolf(String name) {
        super(name); //super는 상속 받을 때 사용
    }

    @Override
    public void Cry() {
        System.out.println(name + "~~~~" + name + "~~~~");
    }
}
