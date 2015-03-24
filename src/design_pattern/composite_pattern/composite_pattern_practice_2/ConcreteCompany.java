package design_pattern.composite_pattern.composite_pattern_practice_2;

import java.util.ArrayList;
import java.util.List;
import design_pattern.JavaUtils;

/**
 * Created by Nianzu on 3/23/2015.
 */
public class ConcreteCompany extends Company{

    private List<Company> children = new ArrayList<Company>();

    public ConcreteCompany(String name){
        super(name);
    }

    @Override
    public void add(Company c) {
        children.add(c);
    }

    @Override
    public void remove(Company c) {
        children.remove(c);
    }

    @Override
    public void display(int depth) {
        System.out.println(JavaUtils.stringRepeat("-", depth) + " " + name);

        for (Company child : children){
            child.display(depth + 2);
        }
    }

    @Override
    public void LineOfDuty() {
        for (Company child : children){
            child.LineOfDuty();
        }
    }
}
