package machine;

import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {
        // To make one cup you need
        int water = 200; //ml
        int milk = 50; //ml
        int beans = 15; //g

        int nWater;
        int nMilk;
        int nBeans;
        int nCups;
        int cups = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Write how many cups of ml of water the coffee machine has: ");
        nWater = s.nextInt();
        System.out.println("Write how many cups of ml of milk the coffee machine has: ");
        nMilk = s.nextInt();
        System.out.println("Write how many grams of beans the coffee machine has: ");
        nBeans = s.nextInt();
        System.out.println("Write how many cups of coffee you will need: ");
        nCups = s.nextInt();

        if (nWater * nCups > water  * nCups || nMilk * nCups > milk * nCups ||
                nBeans * nCups > beans * nCups) {

            cups =;

            System.out.println("No I can only make " + cups + " cups of coffee");
        } else {

        }
    }
}
