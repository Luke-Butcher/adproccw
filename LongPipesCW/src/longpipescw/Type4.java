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
public class Type4 extends Type3 {
    private Boolean innerInsulation;
    public Type4(double lengthOfPipe, double diameterOfPipe, int grade, Boolean chemResist, String colour1, String colour2, Boolean innerInsulation){
        //Obtain super class' information if Type4 is chosen
        super(lengthOfPipe, diameterOfPipe, grade, chemResist, colour1, colour2);
        super.pipeDetails();
        this.innerInsulation = innerInsulation;
        //add on another additional cost to the previously assigned additional cost
        super.additionalCost += baseCost * 0.13;
    }
    
    //setter and getter for InnerInsulation
    public void setInnerInsulation(Boolean innerInsulation){
        this.innerInsulation = innerInsulation;
    }
   
    public Boolean getInnerInsulation(){
        return innerInsulation;
    }
    
    //pipe details gets all the details from the super class and then adds our 
    //additional parameter of colour1
    public String pipeDetails(){
        super.pipeDetails += "Inner Insulation: " + innerInsulation + "\n";
        //returns our new varibale content back to the super class
        return super.pipeDetails;
    }
}
