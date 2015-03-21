package design_pattern.composite_pattern_practice;
import design_pattern.JavaUtils;

/**
 * Created by Nianzu on 3/21/2015.
 */
public class Leaf extends Component{

    String name;

    public Leaf (String name){
        super(name);
    }

    @Override
    public void add(Component c) {
        System.out.println("Cannot add to a leaf");
    }

    @Override
    public void remove(Component c) {
        System.out.println("Cannot remove from a leaf");
    }

    @Override
    public void display(int depth) {
        System.out.println(JavaUtils.stringRepeat("-", depth) + name);
    }
}
