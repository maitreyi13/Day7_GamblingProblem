public class GamblingProblem {
    static int everydayStake=100;
    static int everygameBet=1;
    static int finalAmount=0;

    public static void main(String[] args){
        for (int i=1; i<=20; i++){
            int cashInHand = everydayStake;
            while (cashInHand > 50 && cashInHand < 150) {
                int gamble = (int) Math.floor(Math.random() * 10) % 2;

                switch (gamble) {
                    case 1:
                        System.out.println("You have won");
                        cashInHand = cashInHand + everygameBet;
                        System.out.println("Total Stake: " +cashInHand);
                        break;

                    case 0:
                        System.out.println("You have lost");
                        cashInHand = cashInHand - everygameBet;
                        System.out.println("Total Stake: " + cashInHand);
                        break;

                    default:
                        System.out.println("Play again");
                }
                if (gamble == 1){
                    System.out.println("Player has won");
                } else {
                    System.out.println("Player has lost");
                }
            }
            if (cashInHand == 50 || cashInHand == 150){
                System.out.println("Player has resigned for the day "+i);
            }
            if (cashInHand == 50){
                System.out.println("**** Player has lost by 50 for day "+i+" ****");
            } else if (cashInHand == 150) {
                System.out.println("**** Player has won by 150 for day "+i+" ****");
            }
            finalAmount = finalAmount + cashInHand;
        }
        System.out.println("Total amount won after 20 days: "+finalAmount);
    }
}
