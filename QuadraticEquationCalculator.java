/*
Hello world
Created by Rexan Wong with Java on April 3, 2022
Started self - learning Java for a week
Trying my best to make this clean in the spirit of clean code
Everything will be printed onto the console
Notes at the bottom of code
*/

import java.util.Scanner;
import java.lang.Math;

class Main {
    public static void main(String[] args) { 


        //header statements
        System.out.println("Quadratic Equation Calculator.");
        System.out.println("");
        System.out.println("You can use it to: ");
        System.out.println("1. Find the roots / x intercepts of the quadratic");
        System.out.println("2. Find the Axis of symmetry of the quadratic parabola");
        System.out.println("3. Find the vertex of the quadratic");
        System.out.println("4. Find the y intercept of the quadratic");
        System.out.println("");

        System.out.println("Refer to the standard form : ax^2 + bx + c");
        System.out.println("");

        //create a Scanner that allows for user inputs on the console
        Scanner input = new Scanner(System.in);

        //read a double user inputted
        System.out.print("Value of a: ");
        double a = input.nextDouble();

        System.out.print("Value of b: ");
        double b = input.nextDouble();

        System.out.print("Value of c: ");
        double c = input.nextDouble();


        //bunch of variables used for calculating everything in this algorithim

        //these variables used for calculating the quadratic formula
        double denominator = 2.0 * a;
        double square_root_part = Math.sqrt(b * b -(4.0 * a * c));
        double first_root = ( ((0-b) + square_root_part) / denominator);
        double second_root = ( ((0-b) - square_root_part ) / denominator);

        //this variable used for calculating the axis of symmetry of the two roots
        double midpoint_roots = ((first_root + second_root) / 2.0 );

        //these variables used for calculating the vertex of the quadratic
        double a_times_x_squared = midpoint_roots * midpoint_roots * a;
        double b_times_x = midpoint_roots * b;
        double y_value_vertex = (a_times_x_squared + b_times_x + c);


        //print statements for running on console

        //provide the quadratic equation the user inputted before
        System.out.println("Your quadratic equation you wanted to calculate: " + a + "x^2" + " + " + b + "x" + " + " + c);
        System.out.println("-----------------------------------------------");
        System.out.println("");

        //provide the roots of the quadratic
        System.out.println("Roots / x intercepts = " + first_root + " & " + second_root);
        System.out.println("(" + first_root + " , " + "0.0" + ")" + " & " + "(" + second_root + " , " + "0.0" + ")");
        System.out.println("");

        //provide the axis of symmetry of the two roots of the quadratic
        System.out.println("Axis of symmetry of quadratic parabola = " + midpoint_roots);
        System.out.println("x = " + midpoint_roots);
        System.out.println("");


        //provide the vertex of the quadratic
        System.out.println("Vertex = " + "(" + midpoint_roots + " , " + y_value_vertex + ")");
        System.out.println("In vertex form: " + "y = " + "(" + "x + " + midpoint_roots + ")" + " + " + y_value_vertex);
        System.out.println("");

        //provide the y intercept of the quadratic
        System.out.println("y intercept of quadratic = " + c);
        System.out.println("(" + "0.0 , " + c + ")");

        System.out.println("");
        System.out.println("Hope you enjoyed!  Hope this helped!");


    }
}

//System.out.println("") is currently my method of creating spaces (using obviously the empty string) between print statements on the console.  I'm defitnely sure in Java there's a more logical and common way to do this but idk at the moment.  Lol.  Anyways hope you enjoyed this.  Have a good day.


