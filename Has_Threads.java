import java.io.*;

import java.io.Serial;
import java.io.Serializable;

// Threaded class extends the Fastener class and uses Serial ID
public abstract class Has_Threads extends Fasteners implements Serializable {

    /**
	 * Auto Generated Serial ID
	 */
	@Serial
	private static final long serialVersionUID = 1561764710409134982L;
	
    private final Threads SizeThread; //final attribute

    // constructor method, overrides the constructor from fastener
    public Has_Threads(Threads size, Materials.ThreadedMaterials material, Enum<?> finish, double unitprice, int unitsize) throws IllegalFastener {
    	
        super(material, finish, unitprice, unitsize); // overriding, putting these attributes in fasteners constructor
        SizeThread = size;  // setting SizeThread to size, **can change the name of size**
    }

    
    @Override
    // another override, this time of the toStrin, fastener method
    public String toString() { 
    	String string = SizeThread.toString() + "\" in size" + super.toString();
    	return string; // adds Size size, to the String
    	}
    


} //end Has_Threads
