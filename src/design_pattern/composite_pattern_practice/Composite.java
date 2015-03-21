package design_pattern.composite_pattern_practice;

import java.util.ArrayList;
import java.util.List;
import design_pattern.JavaUtils;
/**
 * Created by Nianzu on 3/21/2015.
 */
public class Composite extends Component{
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
        System.out.println(JavaUtils.stringRepeat("-", depth));

        for (Component component : childrenList){
            component.display(depth + 2);
        }
    }
}
