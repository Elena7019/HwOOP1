package OOP.HwOOP1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// создание класса автомата горячих напитков
public class HotDrinksCoffeMashine implements CoffeeMashine {
    private List<HotDrink> hotDrinks;

    // конструктор
    public HotDrinksCoffeMashine() {
        this.hotDrinks = new ArrayList<>();
    }

    // добавление горячего напитка в список
    public void addHotDrinks(HotDrink hotDrink) {
        hotDrinks.add(hotDrink);
    }

    public List<HotDrink> getHotDrinks() {
        return hotDrinks;
    }

    @Override
    public void acceptingMoney() {
        System.out.println("Деньги приняты");
    }

    @Override
    public void productDelivery() {
        System.out.print("Товар выдан:");
    }

    @Override
    public void deliveryOfChange() {
        System.out.println("Сдача выдана");
    }

    public void shopHotDrinks() {
        try (Scanner scn = new Scanner(System.in)) {
            System.out.println("\nВведите выбранный товар\nиз перечисленных");
            for (HotDrink hotDrink2 : hotDrinks) {
                System.out.print(hotDrink2.getDrink() + "  ");
            }
            System.out.print("\n");
            String inputHotDrink = scn.nextLine();
            for (HotDrink hotDrink : hotDrinks) {
                if (hotDrink.getDrink().equals(inputHotDrink)) {
                    System.out.println("Внесите деньги\nСтоимость товара = " + hotDrink.getPrice());
                    System.out.print("Внесено: ");
                    String enterMoney = scn.nextLine();
                    int intMoney = Integer.parseInt(enterMoney);
                    if (intMoney >= hotDrink.getPrice()) {
                        acceptingMoney();
                        productDelivery();
                        System.out.println(hotDrink);
                        int change = intMoney - hotDrink.getPrice();
                        deliveryOfChange();
                        System.out.println("Сдача = " + change);
                    } else {
                        acceptingMoney();
                        System.out.println("Недостаточно средств");
                    }

                }

            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

    }

}
