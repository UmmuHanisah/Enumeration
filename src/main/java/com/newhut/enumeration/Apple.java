package com.newhut.enumeration;

import java.util.EnumSet;

/**
 *
 * @author Ummu Hanisah
 * @since Apr 25, 2021 | 9:10:18 AM
 * @title Java Programming Tutorial - 44 - Enumeration by thenewboston
 * & Java Programming Tutorial - 45 - EnumSet range
 * @source https://www.youtube.com/watch?v=uFGrL5vyp54
 */
public class Apple {
    public static void main(String[] args) {
        
        // loop the enum
        for (Tuna people : Tuna.values()) { // values -> every time we create enumeration, java will takes the constant and create built-in array
            System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear()); // print object, description, year
            // %s -> name, %s -> description, %s -> age. \n -> go to the next person
        }
        
        System.out.println("\n And now for the range of constants!!!\n");
        for (Tuna people : EnumSet.range(Tuna.kelsey, Tuna.candy)) { // print range of constant from Kelsey to Candy 
            System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear()); // print object, description, year
        }
        
    }
    
    /* Output
       ******
        bucky	nice	22
        kelsey	cutie	10
        julia	bigmistake	12
        nicole	italian	13
        candy	different	14
        erin	iwish	16

         And now for the range of constants!!!

        kelsey	cutie	10
        julia	bigmistake	12
        nicole	italian	13
        candy	different	14
    */
}
