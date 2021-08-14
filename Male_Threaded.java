import java.io.*;
import java.io.Serial;

// would need to add length to BoltOrScrew

public abstract class Male_Threaded extends Has_Threads {

    /**
	 * Auto generated Serial UID
	 */
	@Serial
	private static final long serialVersionUID = 7552168544956913424L;
	
	private final double Length; // length attribute
	
	// constructor method - adds the length to the attribute
    Male_Threaded(double length, Threads thread, Materials.ThreadedMaterials material, Enum<?> finish, double unitprice, int unitsize) throws IllegalFastener {
       
        super(thread, material, finish, unitprice, unitsize); // Override has_threads constructor
        Length = length;

        // test for legal lengths based on Given Conditions
        // exception that the length must be greater than zero 
        if(length < 0) { 
        	throw new IllegalFastener("Illegal Input!: Can't have a negative length."); 
        	}
        
        // Needs to be between 0.5 and 20
        if (Double.compare(0.5, length) > 0 || Double.compare(20.0, length) < 0) {
        	throw new IllegalFastener("Illegal Input!: Length must be between 0.5 and 20."); 
        	} 
        
        // between 0.5 and 6, needs to be divisible by 0.25
        if (length % 0.25 != 0) {  // illegal length is not divisible by 1/4
        	throw new IllegalFastener("Illegal Input: Length between 0.5 and 6 must be in units of 1/4");
        	}
        
        // 6-11 needs to be divisible by 0.5
        if ((Double.compare(6, length) < 0) && (length % 0.5 != 0)) { //
        	throw new IllegalFastener("Illegal Input: Length between 6 and 11 must be in units of 1/2"); 
        	}
        
        // between 11 and 20 needs to be divisible by 1
        if ((Double.compare(11, length) < 0) && (length % 1 != 0)) { 
        	throw new IllegalFastener("Illegal Input: Length between 11 and 20 must be in units of 1"); 
        	}
 
    }//OuterThreaded end;
    
        
    
    @Override
    // Override the ToString from Fastener
    public String toString() { 
    	String string = Length + "\" in length, " + super.toString();
    	return string;
    	}



}//Male_Threaded end;
