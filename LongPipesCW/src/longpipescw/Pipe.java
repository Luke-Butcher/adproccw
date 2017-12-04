/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longpipescw;
import java.text.DecimalFormat;
/**
 *
 * @author conorfarrell
 */
//Abstract class of pipe
abstract public class Pipe {
    private double lengthOfPipe;
    private double diameterOfPipe;
    private double baseCost;
    private double additionalCost;
    private double totalCost;
    private String pipeDetails = "";
    private int grade;
    private int quantity;
    private Boolean chemResist;
    private final double chemResistCost = 0.14;
    private final double[] gradeCost = {0.4, 0.6, 0.75, 0.8, 0.95};
    private DecimalFormat df = new DecimalFormat("###.##");
    
    
    //super class with parameters that each sub class all have in common
    public Pipe(double diameterOfPipe, double lengthOfPipe, int grade, Boolean chemResist, int quantity){
        this.grade = grade;
        this.lengthOfPipe = lengthOfPipe;
        this.diameterOfPipe = diameterOfPipe;
        this.chemResist = chemResist;
        this.quantity = quantity;

        //call the base cost method so that additional cost can be calculated
        //then call total cost to retrieve the final total cost for that pipe
        baseCost();
        additionalCost();
        totalCost();
    }
    
    //get methods
    public double getLengthOfPipe(){
        return lengthOfPipe;
    }
    
    public double diameterOfPipe(){
        return diameterOfPipe;
    }
    
    public double getQuantity(){
        return quantity;
    }
    
    public int getGrade()
    {
        return grade;
    }
    
    public double getBaseCost()
    {
        return baseCost;
    }
    
    public double getAdditionalCost()
    {
        return additionalCost;
    }
    
    public boolean getChemResist()
    {
        return chemResist;
    }
    
    //Calls the relvant Pipe details class and returns the variable value
    public String getPipeDetails()
    {
        pipeDetails();
        return pipeDetails;
    }
    
    //setters
    public void setChemResist(Boolean chemResist)
    {
        this.chemResist = chemResist;
    }
    
    public void setGrade(int grade)
    {
        this.grade = grade;
    }
    
    //adds Value to the additional pipe costs
    public void addAdditionalCost(double percent)
    {
        additionalCost += baseCost * percent;
    }
    
    //adds extra details to the pipe Details
    public void addPipeDetails(String detail)
    {
        pipeDetails += detail;
    }
    
    //calculate the volume of the Pipe
    public double circleArea(double circleDiameter)
    {
        return Math.PI * Math.pow(circleDiameter/2, 2);
    }
    
    public double calculateVolumeOfPipe(){
        //conversion of meters to inches
        double lengthPipeInches = lengthOfPipe / 0.0254;

        double totalVolume = circleArea(diameterOfPipe) - circleArea(diameterOfPipe*0.9);
        return totalVolume* lengthPipeInches;
        
    }
    
    //get the additional cost that each pipe will add to the base cost
    public double additionalCost(){
        //all pipes have chem resist in common so a first check will be required
        if(chemResist){
            additionalCost += baseCost * chemResistCost;
        }
        return additionalCost;
    }
    
    //base cost gets the volume of the pipe and times' it by the cost per qubic inch
    public double baseCost(){
        baseCost = calculateVolumeOfPipe() * gradeCost[grade - 1];
        return baseCost;
    }
    
    //total cose will calculate off of the intitial base cost and the pipes additional
    //cost, it will then time it by the users inputted quantity.
    public double totalCost(){
        double calc = (baseCost + additionalCost) * quantity;
        //rounds to two decimal places
        totalCost = Double.parseDouble(df.format(calc));
        return totalCost;
    }
    
    //getting all the details of the pipe that each sub class have in common
    public void pipeDetails(){
        addPipeDetails("Diameter of pipe: " + Double.toString(diameterOfPipe) + " (Inches)\n"
                + "Length of pipe: " + Double.toString(lengthOfPipe) + " (Meters)\n"
                + "Grade: " + Integer.toString(grade) + "\n"
                + "Chemical Resistance: " + Boolean.toString(chemResist) + "\n");
        //return pipeDetails;
    }
        
   
}
