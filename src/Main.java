public class Main {
    public static void main(String[] args) {
        CoffeeMaker brewMaster = new CoffeeMaker(false);
        DishWasher dishWasher = new DishWasher(false);
        Refrigerator iceBox = new Refrigerator(false);

        SmartKitchen smartKitchen = new SmartKitchen(brewMaster, iceBox, dishWasher);

        smartKitchen.setKitchenState(false, true, false);
        smartKitchen.doKitchenWork();
    }
}
