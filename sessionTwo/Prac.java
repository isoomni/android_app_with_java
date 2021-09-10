public class Prac{  

    static class Player {

        String name;
        int hp;
        int atk;

        public Player(String name, int hp, int atk){
            this.name = name;
            this.hp = hp;
            this.atk = atk;
        }

        public void attack(Enemy enemy){
            System.out.println(this.name + "이/가 " + enemy.name + "을/를 공격했습니다.");
            enemy.hp -= this.atk;
            System.out.println("공격: "+ this.atk+ "\n" + enemy.name + "의 hp: " +enemy.hp);
        }

        public boolean isLive(){
            if (hp <= 0){
                return false;
            } else{
                return true;
            }
        }

    }

    static class Enemy{
        String name;
        int hp;
        int atk;

        public Enemy(String name, int hp, int atk){
            this.name = name;
            this.hp = hp;
            this.atk = atk;
        }

        public void attack(Player player){
            System.out.println(this.name + "이/가 " + player.name + "을 공격했습니다.");
            player.hp -= this.atk;
            System.out.println("공격: "+ this.atk+ "\n" + player.name + "의 hp: " + player.hp);
        }

        public boolean isLive(){
            if (hp <= 0){
                return false;
            } else{
                return true;
            }
        }
    }

    public static void main(String[] args){
        Player player = new Player("soom", 100, 12); // player 객체 생성할 떄 값 초기화
        Enemy enemy = new Enemy("Orc", 80, 5);

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