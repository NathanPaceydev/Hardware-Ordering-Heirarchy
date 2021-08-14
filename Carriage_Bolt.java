import java.io.*;
import java.io.Serial;
import java.io.Serializable;

public final class Carriage_Bolt extends Bolts implements Serializable {
    /**
	 * Serial UID Auto Generated
	 */
	@Serial
	private static final long serialVersionUID = 1907539036913913949L;
	
	/** 
	 * Constructor method for Carriage Bolt
	 * @param length
	 * @param size
	 * @param material
	 * @param finish
	 * @param unitPrice
	 * @param unitSize
	 * @throws IllegalFastener
	 */
    public Carriage_Bolt(double length, Threads size, Materials.ThreadedMaterials material, Finishes.BoltFinish finish, double unitPrice, int unitSize) throws IllegalFastener {
    	
        super(length, size, material, finish, unitPrice, unitSize); // override constructor Bolt
    }
    
    @Override
    // can say carriage bolt
    // override the toString()
    public String toString() { 
    	String string = "Carriage bolt, " + super.toString();
    	return string; 
    	}


}// Carriage_Bolt end;
