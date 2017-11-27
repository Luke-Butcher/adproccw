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
public class Type5 extends Type4 {
    private Boolean outerReinforcement;
    public Type5(double lengthOfPipe, double diameterOfPipe, int grade, Boolean chemResist, String colour1, String colour2, Boolean innerInsulation, Boolean outerReinforcement){
        //Obtain super class' information if Type5 is chosen
        super(lengthOfPipe, diameterOfPipe, grade, chemResist, colour1, colour2, innerInsulation);
        super.pipeDetails();
        this.outerReinforcement = outerReinforcement;
        //add on another additional cost to the previously assigned additional cost
        super.additionalCost += baseCost * 0.17;
    }
    
    //setter and getter for InnerInsulation
    public void setOuterReinforcement(Boolean outterReinforcement){
        this.outerReinforcement = outterReinforcement;
    }
   
    public Boolean getOuterReinforcement(){
        return outerReinforcement;
    }
    
    //pipe details gets all the details from the super class and then adds our 
    //additional parameter of colour1
    public String pipeDetails(){
        super.pipeDetails += "Outer Reinforcement: " + outerReinforcement + "\n";
        //returns our new varibale content back to the super class
        return super.pipeDetails;
    }
}
