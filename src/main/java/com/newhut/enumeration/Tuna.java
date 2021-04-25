
package com.newhut.enumeration;

/**
 *
 * @author Ummu Hanisah
 * @since Apr 25, 2021 | 9:09:15 AM
 */
public enum Tuna {
    
    //1: Declare a bunch of constant of the enum type - make a constant (a variable that never change)
    bucky("nice", "22"), // 'bucky' is an essence of object, 'nice' is a description
    kelsey("cutie", "10"), // each constant is an object and it's going to has its set of variable in this entire enumeration
    julia("bigmistake", "12"),
    nicole("italian", "13"),
    candy("different", "14"),
    erin("iwish", "16");
    
    //2: Declare 2 variables to represents 2 arguments
    private final String desc;
    private final String year;
    
    //3: Create an enumeration constructor
    Tuna(String description, String birthday) {
        desc = description; // Eg: This is what is going happen to bucky, for description pass in nice
        year = birthday; // for birhday, pass in year
    }
    
    public String getDesc() { //4: Create getter to get the variable for the constructor
        return desc;
    }
    
    public String getYear() {
        return year;
    }
}
