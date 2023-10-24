public class SmartKitchen {

    private CoffeeMaker brewMaster;
    private Refrigerator iceBox;
    private DishWasher dishWasher;

    public SmartKitchen(CoffeeMaker brewMaster, Refrigerator iceBox, DishWasher dishWasher) {
        this.brewMaster = brewMaster;
        this.iceBox = iceBox;
        this.dishWasher = dishWasher;
    }

    public void addWater(CoffeeMaker coffeeMaker) {
        brewMaster.setHasWorkToDo(true);
    }

    public void pourMilk(Refrigerator refrigerator) {
        iceBox.setHasWorkToDo(true);
    }

    public void loadDishWasher(DishWasher dishWasher) {
        dishWasher.setHasWorkToDo(true);
    }

    public void setKitchenState(boolean coffeeFlag, boolean refrigeratorFlag, boolean dishWasherFlag) {
        brewMaster.setHasWorkToDo(coffeeFlag);
        iceBox.setHasWorkToDo(refrigeratorFlag);
        dishWasher.setHasWorkToDo(dishWasherFlag);
    }

    public void doKitchenWork() {
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }


}

