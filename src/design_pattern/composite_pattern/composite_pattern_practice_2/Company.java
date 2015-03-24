package design_pattern.composite_pattern.composite_pattern_practice_2;

/**
 * Created by Nianzu on 3/23/2015.
 */
public abstract class Company {

    protected String name;

    public Company(String name){
        this.name = name;
    }

    /**
     * the pro of making "add method" as concrete method rather than abstract method is that
     * you do not need to implement this method at every concrete class
     */
    public void add(Company c){
        throw new UnsupportedOperationException();  // convenient
    };

    public void remove(Company c){
        throw new UnsupportedOperationException(); // convenient
    }

    public void display(int depth){
        throw new UnsupportedOperationException(); // convenient
    }

    // show the duty of different company or department
    public void LineOfDuty(){
        throw new UnsupportedOperationException();
    }
}
