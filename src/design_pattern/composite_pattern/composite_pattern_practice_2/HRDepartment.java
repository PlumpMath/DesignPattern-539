package design_pattern.composite_pattern.composite_pattern_practice_2;

import design_pattern.JavaUtils;

/**
 * Created by Nianzu on 3/23/2015.
 */
public class HRDepartment extends Company{

    public HRDepartment(String name){
        super(name);
    }

    @Override
    public void display(int depth) {
        System.out.println(JavaUtils.stringRepeat("-", depth) + " " + name);
    }

    @Override
    public void LineOfDuty() {
        System.out.println(name + " hiring new employee.");
    }

}
