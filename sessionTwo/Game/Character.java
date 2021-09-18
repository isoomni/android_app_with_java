package sessionTwo.Game;

public class Character {
    String name;
    int hp;
    int atk;

    public Character(String name, int hp, int atk){
        this.name = name;
        this.hp = hp;
        this.atk = atk;
    }

    
    public void attack(Character character){
        System.out.println(this.name + "이/가 공격했습니다.");
        character.hp -= this.atk;
        System.out.println(this.name + " 의 공격: "+ this.atk+ "\n" + character.name + "의 hp: " +character.hp+ "\n");
    }

    public boolean isLive(){
        if (hp <= 0){
            return false;
        } else{
            return true;
        }
    }
}