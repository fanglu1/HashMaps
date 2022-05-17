package InterFaceInABox;

import java.util.ArrayList;

public class Box implements Packable{
    private ArrayList<Packable> packables = new ArrayList<>();
    private double max;

    public Box(double max){
        this.max = max;
    }
    public void add(Packable packable){
        if(weight() <= max) {
            this.packables.add(packable);
        }
        else {
            System.out.println("Too heavy");
        }
    }
    public String toString(){
        return "Box: " + packables.size() + ", total weight: " + weight() + " kg";
    }
    @Override
    public double weight() {
        double weight = 0;
        for (Packable packable : packables) {
                weight += packable.weight();
        }
        return weight;
    }
}
