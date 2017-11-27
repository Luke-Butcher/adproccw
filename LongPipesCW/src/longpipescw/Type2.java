/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longpipescw;

/**
 *
 * @author conorfarrell
 */
public class Type2 extends Pipe {
    private String colour1;
    public Type2(double lengthOfPipe, double diameterOfPipe, int grade, Boolean chemResist, String colour1){
        //Obtain super class' information if Type2 is chosen
        super(lengthOfPipe, diameterOfPipe, grade, chemResist);
        super.pipeDetails();
        this.colour1 = colour1;
        //add on another additional cost to the previously assigned additional cost
        super.additionalCost += baseCost * 0.12;
    }
    
    //setter and getter for colour1
    public void setColour1(String colour1){
        this.colour1 = colour1;
    }

    public String getColour1(){
        return colour1;
    }
    
    //pipe details gets all the details from the super class and then adds our 
    //additional parameter of colour1
    public String pipeDetails(){
        super.pipeDetails += "Colour 1: " + colour1 + "\n";
        //returns our new varibale content back to the super class
        return super.pipeDetails;
    }
    
}
