import java.io.*;

import java.io.Serial;
import java.io.Serializable;

// class to describe any Nail
public abstract class Nails extends Fasteners implements Serializable {
    
	/**
	 * Auto Gen Serial UID
	 */
	@Serial
	private static final long serialVersionUID = 804906360164771740L;
	

    // all the attributes are declared as objects
	private final Object Gauge;
	private final Object Nail_Size;
    private final Object Nail_Length;
    

    // constructor method
    public Nails(Object size, Object length, Object gauge, Enum<?> finish, double unitPrice, int unitSize) throws IllegalFastener {
    	
    	// override Fastener constructor
        super(Materials.NailMaterials.Steel, finish, unitPrice, unitSize); //pass the material, only nail material is steel**

        // declare attributes
        Gauge = gauge;
        Nail_Size = size;
        Nail_Length = length;
        
    }// constructor;

    
    @Override
    public String toString() {//adding the attributes of the Nail to the ToString()
    	String string =  Nail_Size + "\" in size, " + Nail_Length + "\" in length, " + "gauge level " + Gauge + super.toString();
        return string;
    }




}//Nails end;
