public class Game{

    public static void main(String[] args){
        PlayerCharacter player = new PlayerCharacter("soom", 70, 12); // player 객체 생성할 떄 값 초기화
        EnemyCharacter enemy = new EnemyCharacter("Orc", 80, 5);

        while(player.isLive() && enemy.isLive()){
            player.attack(enemy);
            if (!enemy.isLive()){ // 적이 죽음
                    break;
            }
            enemy.attack(player);
        }
        if (player.isLive()){
            System.out.println(player.name + "이 승리했습니다.");
        }

        if (enemy.isLive()){
            System.out.println(enemy.name + "이 승리했습니다.");
        }
    }
}
