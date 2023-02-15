package OOP.HwOOP1;

public class Programm {
    public static void main(String[] args) {

        HotDrink espresso = new HotDrink("espresso", 0.1, false, 70, 120);
        HotDrink latte = new HotDrink("latte", 0.2, true, 60, 130);
        HotDrink cappuccino = new HotDrink("cappuccino", 0.25, true, 60, 150);
        HotDrink tea = new HotDrink("tea", 0.2, true, 80, 50);
        HotDrinksCoffeMashine hotDrVenMach = new HotDrinksCoffeMashine();
        hotDrVenMach.addHotDrinks(espresso);
        hotDrVenMach.addHotDrinks(latte);
        hotDrVenMach.addHotDrinks(cappuccino);
        hotDrVenMach.addHotDrinks(tea);

        System.out.println(hotDrVenMach.getHotDrinks());

        hotDrVenMach.shopHotDrinks();
    }
}
