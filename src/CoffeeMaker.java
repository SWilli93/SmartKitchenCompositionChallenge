public class CoffeeMaker {

    private boolean hasWorkToDo;

    public CoffeeMaker(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void setHasWorkToDo(boolean flag) {
        this.hasWorkToDo = flag;
    }

    public void brewCoffee() {
        if (hasWorkToDo) {
            System.out.println("Coffee is being made.");
        }
    }
}
