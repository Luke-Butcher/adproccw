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
    private Boolean outterReinforcement;
    public Type5(double lengthOfPipe, double diameterOfPipe, int grade, Boolean chemResist, String colour1, String colour2, Boolean innerInsulation, Boolean outterReinforcement){
        super(lengthOfPipe, diameterOfPipe, grade, chemResist, colour1, colour2, innerInsulation);
        super.pipeDetails();
        this.outterReinforcement = outterReinforcement;
        super.additionalCost += baseCost * 0.17;
    }
    public void setOutterReinforcement(Boolean outterReinforcement)
    {
        this.outterReinforcement = outterReinforcement;
    }
   
    public Boolean getOutterReinforcement()
    {
        return outterReinforcement;
    }
    
    public String pipeDetails(){
        super.pipeDetails += "Outer Reinforcement: " + outterReinforcement + "\n";
        return super.pipeDetails;
    }
}
