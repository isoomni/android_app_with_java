import java.util.Random;

public class FirstSectionLoop{
    // http://goo.gl/wlU5R9
    // Variables, Comments

    public static void main(String[] args){
        
        Random random = new Random();
        int money = 10000;
        int count = 0;

        while(money >= 500 ){
            money -= 500;
            count += 1;
            int num = random.nextInt(100);
            int lottoMoney = buyLotto(num);
            System.out.println(count + "번째 시도입니다");
            System.out.println("내 숫자는 " + num + "입니다");

            if (lottoMoney == 0){
                System.out.println("당첨 되지 않으셨습니다.");
            } else{
                System.out.println("당첨 금액은 " + lottoMoney + "만원 입니다.");
                money += lottoMoney;
            }
            if (money == 0){
                System.out.println("현재 잔액은  " + money + "원 입니다\n"+"---------------");
            } else{
                System.out.println("현재 잔액은  " + money + "만원 입니다\n"+"---------------");
            }

        } System.out.println("더 이상 로또를 구매하실 수 없습니다.");


    }

    static int buyLotto(int num){
        int[] lotto = new int[100];

        for(int i = 0; i < lotto.length; i++){
            lotto[i] = 0;
        }
        lotto[2] = 100;
        lotto[75] = 2000;
        lotto[99] = 300;

        return lotto[num];

    }

}