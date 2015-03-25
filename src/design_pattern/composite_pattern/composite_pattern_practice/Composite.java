package design_pattern.composite_pattern_practice;

import java.util.ArrayList;
import java.util.List;
import design_pattern.JavaUtils;

/**
 * Created by Nianzu on 3/21/2015.
 */
public class Composite extends Component{

    public static void main(String[] args) {
        Composite com = new Composite("root");
        com.add(new Leaf("new_leaf"));

    }

    // set the list to private
    private List<Component> childrenList = new ArrayList<Component>();

    public Composite(String name){
        super(name);
    }

    @Override
    public void add(Component c) {
        childrenList.add(c);
    }

    @Override
    public void remove(Component c) {
        childrenList.remove(c);
    }

    @Override
    public void display(int depth) {
        System.out.println(JavaUtils.stringRepeat("-", depth) + name);

        for (Component child : childrenList){
            child.display(depth + 2);
        }
    }
}
