public class Refrigerator {

    private boolean hasWorkToDo;

    public Refrigerator(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void setHasWorkToDo(boolean flag) {
        this.hasWorkToDo = flag;
    }

    public void orderFood() {
        if (hasWorkToDo) {
            System.out.println("Food is being ordered");
        }
    }
}
