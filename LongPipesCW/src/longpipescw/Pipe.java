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
//Abstract class of pipe
abstract public class Pipe {
    protected double lengthOfPipe;
    protected double diameterOfPipe;
    protected double baseCost;
    protected double additionalCost;
    protected double totalCost;
    protected String pipeDetails;
    protected int pipeType;
    protected int grade;
    protected double quantity;
    protected double costPerQubicInch;
    protected Boolean chemResist;
    
    //super class with parameters that each sub class all have in common
    public Pipe(double lengthOfPipe, double diameterOfPipe, int grade, Boolean chemResist){
        this.grade = grade;
        this.lengthOfPipe = lengthOfPipe;
        this.diameterOfPipe = diameterOfPipe;
        this.chemResist = chemResist;
        
        //determins which cost a user will receive based on their choice
        switch(this.grade) {
            case 1 :
               costPerQubicInch = 0.4;
               break;
            case 2 :
                costPerQubicInch = 0.6;
                break;
            case 3 :
                costPerQubicInch = 0.75;
                break;
            case 4 :
                costPerQubicInch = 0.80;
                break;
            case 5 :
                costPerQubicInch = 0.95;
                break;
            default :
               System.out.println("USE FOR VALIDATION");
        }
        //call the base cost method so that additional cost can be calculated
        //then call total cost to retrieve the final total cost for that pipe
        baseCost();
        additionalCost();
        totalCost();
    }
    
    //gett methods
    public double getLengthOfPipe(){
        return lengthOfPipe;
    }
    
    public double diameterOfPipe(){
        return diameterOfPipe;
    }
    
    public double getQuantity(){
        return quantity;
    }
   
    public int getPipeType()
    {
        return pipeType;
    }
    
    //setter and getter for grade
    public void setGrade(int grade)
    {
        this.grade = grade;
    }
   
    public int getGrade()
    {
        return grade;
    }
    
    //setter and getter for costPerQubicInch
    public void setCostPerQubicInch(double costPerQubicInch)
    {
        this.costPerQubicInch = costPerQubicInch;
    }
   
    public double getCostPerQubicInch()
    {
        return costPerQubicInch;
    }
    
    //setter and getter for chemical resistance
    public void setChemResist(Boolean chemResist)
    {
        this.chemResist = chemResist;
    }
   
    public boolean getChemResist()
    {
        return chemResist;
    }
    
    //calculate the volume of the Pipe
    public double calculateVolumeOfPipe(){
        //conversion of meters to inches
        double lengthPipeInches = lengthOfPipe / 0.0254;
        
        double outerRadius = diameterOfPipe / 2;
        outerRadius = Math.pow(outerRadius,2);
        double outervolumeOfPipe = (Math.PI * outerRadius) * lengthPipeInches;
    
        //get the inner volume pi * r^2 * height
        double innerRadius = (diameterOfPipe / 2) * 0.9;
        innerRadius = Math.pow(innerRadius,2);
        double innervolumeOfPipe = (Math.PI * innerRadius) * lengthPipeInches; 
    
        //get the total volume of raw materials
        double totalVolume = outervolumeOfPipe - innervolumeOfPipe;
        
        return totalVolume;
    }
    
    //get the additional cost that each pipe will add to the base cost
    public double additionalCost(){
        //all pipes have chem resist in common so a first check will be required
        if(chemResist == true){
            additionalCost += baseCost * 0.14;
        }
        return additionalCost;
    }
    
    //base cost gets the volume of the pipe and times' it by the cost per qubic inch
    public double baseCost(){
        baseCost = calculateVolumeOfPipe() * getCostPerQubicInch();
        return baseCost;
    }
    
    //total cose will calculate off of the intitial base cost and the pipes additional
    //cost, it will then time it by the users inputted quantity.
    public double totalCost(){
        double calc = (baseCost + additionalCost) * quantity;
        //rounds to two decimal places
        totalCost = (double) Math.round(calc * 100) / 100;
        return totalCost;
    }
    
    //getting all the details of the pipe that each sub class have in common
    public String pipeDetails(){
        pipeDetails = "Diameter of pipe: " + Double.toString(diameterOfPipe) + " (Inches)\n"
                + "Length of pipe: " + Double.toString(lengthOfPipe) + " (Meters)\n"
                + "Grade: " + Integer.toString(grade) + "\n"
                + "Chemical Resistance: " + Boolean.toString(chemResist) + "\n";
        return pipeDetails;
    }
        
   
}
