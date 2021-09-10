public class EnemyCharacter extends Character {

    public EnemyCharacter(String name, int hp, int atk) {
        super(name, hp, atk);
        //TODO Auto-generated constructor stub
    }

    // 추가적으로 더 하고 싶음
    @Override  //무시하고 덮어쓴다. 이것은 어디선가 상속받은 메소드이다. 라고 설명해준다.
    public void attack(Character enemy){
        if (hp <= 20){
            System.out.println(name + " is Angry...!!!");
            atk += 15;
            System.out.println( name + "의 공격력(+15) : " + atk+ "\n") ;
        }

        super.attack(enemy);

        PlayerCharacter player = (PlayerCharacter)enemy;

        if (player.hp <= 30){
            player.Heal();
        }
        
    }
    
}
