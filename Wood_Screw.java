import java.io.*;

import java.io.Serial;
import java.io.Serializable;

// last class in screw
public final class Wood_Screw extends Screws implements Serializable {

    /**
	 * Auto Gen Serial UID
	 */
	@Serial
	private static final long serialVersionUID = -3520914669747238408L;
	
    private final ScrewDesigns.WoodScrewPoints Point;

    
    /**
     * Constructor Method for Wood Screw
     * @param length
     * @param thread
     * @param material  //Threaded Materials
     * @param finish    // Screw Finish
     * @param head
     * @param drive
     * @param point
     * @param unitprice
     * @param unitsize
     * @throws IllegalFastener
     */
    public Wood_Screw(double length, Threads thread, Materials.ThreadedMaterials material, Finishes.ScrewFinish finish, ScrewDesigns.ScrewHeads head, ScrewDesigns.ScrewDrive drive, ScrewDesigns.WoodScrewPoints point, double unitprice, int unitsize) throws IllegalFastener {

        super(length, thread, material, finish, head, drive, unitprice, unitsize); // Overrides Screw constructor
        
        Point = point; //assign point
    }
    

    @Override
    public String toString() { //Override the ToString()
    	String string = "Wood Screw with a, " + Point + " point, " + super.toString();
    	return string; 
    	}

}//Wood_Screw end;
