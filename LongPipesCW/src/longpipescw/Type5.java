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
        super(lengthOfPipe, diameterOfPipe, grade, chemResist, colour1, colour2, innerInsulation);
        super.pipeDetails();
        this.outerReinforcement = outerReinforcement;
        super.additionalCost += baseCost * 0.17;
    }
    public void setOuterReinforcement(Boolean outterReinforcement)
    {
        this.outerReinforcement = outterReinforcement;
    }
   
    public Boolean getOuterReinforcement()
    {
        return outerReinforcement;
    }
    
    public String pipeDetails(){
        super.pipeDetails += "Outer Reinforcement: " + outerReinforcement + "\n";
        return super.pipeDetails;
    }
}
