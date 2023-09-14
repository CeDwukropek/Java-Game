import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        var wojownik1 = new CArcher(10f, "Najwiekszy Wojownik Swiata", "Archer");
        var wojownik2 = new CArcher(5f, "Najgordszy Wojownik Polski", "Archer");

        var sword = new CSword(20f, "Magiczny Miecz", true, false);
        var bow = new CBow(40f, "Wielki Luk", true, false, 1);

        System.out.println("Jestes wojownikiem. Twoje imie to " + wojownik1.getName());
        System.out.println("Walczysz z " + wojownik2.getName());

        while(wojownik1.getHealth() > 0 && wojownik2.getHealth() > 0)
        {
            CWeapon playerWeapon = wojownik1.getWeapon();

            System.out.println("Lista czynnosci:");
            System.out.println("1. Bij");
            System.out.println("2. Podnies bron: " + sword.getName());
            if(playerWeapon != null)
            {
                System.out.println("3. Ulepsz bron: " + playerWeapon.getName());
            }

            String option = myObj.nextLine();

            switch (option) {
                case "1":
                    wojownik1.makeDamage(wojownik2);
                    System.out.println("Wojownikowi " + wojownik2.getName() + " zostalo " + wojownik2.getHealth());
                    break;
                case "2":
                    try {
                        wojownik1.setWeapon(sword);
                    } catch (Exception e)
                    {
                        System.out.println("nie");
                    }

                    System.out.println("Podniesiono bron: " + sword.getName());
                    System.out.println("Twoje obrazenia wzrosly o " + wojownik1.getWeapon().getDamage() + " i wynosza: " + wojownik1.getDamage());
                    break;
                case "3":
                    if(playerWeapon == null) {
                        wojownik2.makeDamage(wojownik1);
                        System.out.println("Zostalo ci " + wojownik1.getHealth());
                        break;
                    }

                    if(wojownik1.getWeapon().upgradeWeapon(4.5f)) {
                        System.out.println("Ulepszono bron.");
                        System.out.println("Jej obrazenia wynosza: " + wojownik1.getWeapon().getDamage());
                    } else {
                        System.out.println("Nie mozna ulepszyc broni.");
                    }
                    break;

                default:
                    wojownik2.makeDamage(wojownik1);
                    System.out.println("Zostalo ci " + wojownik1.getHealth());
                    break;
            }
        }

        if(wojownik1.getHealth() == 0)
        {
            System.out.println("Przegrales");
        } else if(wojownik2.getHealth() == 0)
        {
            System.out.println("Pokonales " + wojownik2.getName());
        } else {
            System.out.println("Cos poszlo nie tak...");
        }
    }
}