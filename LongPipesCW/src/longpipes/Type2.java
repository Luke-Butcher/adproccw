package longpipes;
/**
 * Type 2 adds one Colour to the abstract class.
 * @author GrD-10
 * @version 2.2
 */
public class Type2 extends Pipe {
    private String colour1;
    private final double oneColourCost = 0.12;    
    /**
     * Constructor for Type 2 Pipe.
     * @param diameterOfPipe The diameter of the Pipe in Inches.
     * @param lengthOfPipe The length of the Pipe in Meters.
     * @param grade The Grade of the Pipe.
     * @param chemResist Whether or not the Pipe has Chemical Resistance.
     * @param colour1 The Base colour of the Pipe.
     * @param quantity How many Pipes are being ordered.
     */
    public Type2(double diameterOfPipe, double lengthOfPipe, int grade, Boolean chemResist, String colour1, int quantity){
        super(diameterOfPipe, lengthOfPipe, grade, chemResist, quantity);
        this.colour1 = colour1;
        addAdditionalCost(oneColourCost);
    }    
    /**
     * Sets new value for Colour 1.
     * @param colour1  New value of colour1.
     */
    public void setColour1(String colour1){
        this.colour1 = colour1;
    }
    /**
     * Gets value from Colour 1.
     * @return colour1.
     */
    public String getColour1(){
        return colour1;
    }    
    /**
     * Calls pipe details from the abstract class Pipe then adds 
     * colour1 to pipeDetails.
     */
    public void pipeDetails(){
        super.pipeDetails();
        addPipeDetails("Colour 1: " + colour1 + "\n");
    }    
}