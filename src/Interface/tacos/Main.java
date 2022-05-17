package Interface.tacos;

public class Main {
    public static void main(String[] args) {
        TripleTacoBox box = new TripleTacoBox();
        CustomTacoBox cBox = new CustomTacoBox(5);
        box.eat();
        System.out.println(box.tacosRemaining());
    }
}
