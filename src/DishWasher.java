public class DishWasher {

    private boolean hasWorkToDo;

    public DishWasher(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void setHasWorkToDo(boolean flag) {
        this.hasWorkToDo = flag;
    }

    public void doDishes() {
        if (hasWorkToDo) {
            System.out.println("Dishes are being washed");
        }
    }
}
