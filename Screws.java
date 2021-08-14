import java.io.*;

import java.io.Serial;
import java.io.Serializable;

// extends Bolt or Screw
public abstract class Screws extends Male_Threaded implements Serializable {

    /**
	 * Auto Generated Serial UID
	 */
	@Serial
	private static final long serialVersionUID = -5435347233746163593L;
	
	// Declare attributes, once declared has to stay the same type
    private final ScrewDesigns.ScrewHeads Heads; 
	private final ScrewDesigns.ScrewDrive Drive;
	
	/**
	 * constructor method for any Screws
	 * @param length
	 * @param thread
	 * @param material
	 * @param finish
	 * @param heads
	 * @param drive
	 * @param unitprice
	 * @param unitsize
	 * @throws IllegalFastener
	 */
    public Screws(double length, Threads thread, Materials.ThreadedMaterials material, Finishes.ScrewFinish finish, ScrewDesigns.ScrewHeads heads, ScrewDesigns.ScrewDrive drive, double unitprice, int unitsize) throws IllegalFastener {
    	
        super(length, thread, material, finish, unitprice, unitsize); // override Male_Threaded constructor
        
        Drive = drive;
        Heads = heads;
    }//constructor;
    

    @Override
    public String toString(){ //update the ToString()
    	String string =  Drive + " drive, "+ Heads + " " + "head, " + super.toString();
    	return string;
    	}

}//Screws end;
