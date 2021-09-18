package Game;

// 상속을 해보자

public class PlayerCharacter extends Character {

    public PlayerCharacter(String name, int hp, int atk) {
        super(name, hp, atk);  // 부모인 Character class의 name, hp, atk 를 사용했다.
        //TODO Auto-generated constructor stub
    }

    
    public void Heal() {
        hp += 20;
        System.out.println(name + " 힐!");
        System.out.println(name + " HP: " + hp + "\n");
    }
}
