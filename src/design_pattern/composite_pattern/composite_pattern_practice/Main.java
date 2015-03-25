package design_pattern.composite_pattern_practice;

/**
 * Created by Nianzu on 3/23/2015.
 */
public class Main {

    public static void main(String[] args) {

        Composite root = new Composite("root");

        root.add(new Leaf("Leaf_A"));
        root.add(new Leaf("Leaf_B"));

        Composite comp = new Composite("Composite X");
        comp.add(new Leaf("Leaf_XA"));
        comp.add(new Leaf("Leaf_XB"));

        root.add(comp);

        Composite comp2 = new Composite("Composite XY");
        comp2.add(new Leaf("Leaf XYA"));
        comp2.add(new Leaf("Leaf XYB"));

        comp.add(comp2);

        // add leaf_C and then it is blow away by wind
        Leaf leaf = new Leaf("Leaf_C");
        root.add(leaf);
        root.remove(leaf);

        // add Leaf_D
        root.add(new Leaf("Leaf_D"));

        root.display(1);
    }
}
