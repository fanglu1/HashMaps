package Interface.tacos;

import Interface.tacos.TacoBox;

public class TripleTacoBox implements TacoBox {
    private int tacos;

    public TripleTacoBox() {
        tacos = 3;
    }
    @Override
    public int tacosRemaining() {
        return tacos;
    }

    @Override
    public void eat() {
        tacos--;
    }
}
