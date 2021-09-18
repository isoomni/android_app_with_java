package sessionTwo.InterfaceOne;

public interface Pet {  // 개와 고양이는 애완동물이라는 공통점이 있다. -> 추상클래스를 인터페이스로 만든다.
    
    public void FoodCall(); 
    // abstract 추상메서드에서는 메서드 리턴타입 앞에 abstract를 붙여서 추상화했다. 
    // 하지만 interface에서는 메서드가 이미 추상화 되어 있기 때문에 구태여 다시 추상화 할 필요가 없다.




}
