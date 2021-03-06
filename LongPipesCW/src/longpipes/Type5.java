package longpipes;
/**
 * Type 5 adds outer Reinforcement to Type 4.
 * @author GrD-10
 * @version 2.2
 */
public class Type5 extends Type4 {
    private Boolean outerReinforcement;
    private final double outerReinforcementCost = 0.17;    
    /**
     * Constructor for Type 5 Pipe.
     * @param diameterOfPipe The diameter of the Pipe in Inches.
     * @param lengthOfPipe The length of the Pipe in Meters.
     * @param grade The Grade of the Pipe.
     * @param chemResist Whether or not the Pipe has Chemical Resistance.
     * @param colour1 The Base colour of the Pipe.
     * @param colour2 The overlaid colour of the Pipe.
     * @param quantity How many similar Pipes are being ordered.
     */
    public Type5(double diameterOfPipe, double lengthOfPipe, int grade, Boolean chemResist, String colour1, String colour2, int quantity){
        super(diameterOfPipe, lengthOfPipe, grade, chemResist, colour1, colour2, quantity);
        this.outerReinforcement = true;
        addAdditionalCost(outerReinforcementCost);
    }
    /**
     * Sets Outer Reinforcement to a new Value.
     * @param outerReinforcement New Value for outer Reinforcement.
     */
    public void setOuterReinforcement(Boolean outerReinforcement){
        this.outerReinforcement = outerReinforcement;
    }   
    /**
     * Gets Value of Outer Reinforcement.
     * @return Outer Reinforcement.
     */
    public Boolean getOuterReinforcement(){
        return outerReinforcement;
    }
    /**
     * Calls the Pipe classDetails from the super class and adds 
     * outerReinforcement to Pipe Details and Calls the Type 4 Details.
     */
    public void pipeDetails(){
        super.pipeDetails();
        addPipeDetails("Outer Reinforcement: " + outerReinforcement + "\n");
    }
}