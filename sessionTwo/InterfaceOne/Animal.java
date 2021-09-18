package sessionTwo.InterfaceOne;

public abstract class Animal {   // class 앞에 abstract 를 붙여 추상클래스로 만든다.
    
    public String name;
    public Animal(String name){  //name은 모든 동물 마다 다 있다. 그러므로 this로 받아준다.
        this.name = name;
    }
    public abstract void Cry(); // abstract 키워드를 붙이면 된다.
}