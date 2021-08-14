import java.io.*;
import java.io.Serial;
import java.io.Serializable;
/**
 * 
 * @author Nathan Pacey
 * Student ID: 18njp
 * Student Number: 20153310
 *
 */
// top of the hierarchy class
public abstract class Fasteners implements Serializable {

    /**
	 * Auto Generated Serial UID
	 */
	@Serial
	private static final long serialVersionUID = -4444182302958225223L;
	
	// Declaring the Generic Enumerators and attributes
	private final Enum<?> Finish;
	private final Enum<?> Material_Type;
    
    private final int Size;
    private final double Cost;
    


    // constructor method, throws illegal fastener class
    public Fasteners(Enum<?> material, Enum<?> finish, double cost, int size) throws IllegalFastener {

    	// assign attributes
    	Finish = finish;
        Material_Type = material;
        Size = size;
        Cost = cost;

        // test to check if the attributes are illegal, throwing the illegalFasters if illegal
        if(size < 0 || size > 10000) { 
        	throw new IllegalFastener("Illegal Input!: Invalid Unit Size"); 
        	}
        if(Cost < 0) { 
        	throw new IllegalFastener("Illegal Input!: Invalid Cost"); 
        	}
        
        	
        // checking for the illegal fastener condition where a threaded fastener with stainless steel and brass are not plain
        if (( Material_Type == Materials.ThreadedMaterials.Brass || Material_Type == Materials.ThreadedMaterials.Stainless_Steel )
            && ((finish != Finishes.WingNutFinish.Plain) && finish != Finishes.ScrewFinish.Plain && finish != Finishes.BoltFinish.Plain)){ 
        	
        	throw new IllegalFastener("Illegal Input: The Material you selected does not have that finish"); 
        	}

    }//Fasteners Method end;

    

   // Top of the hierarchy ToString
    public String toString() {
    	// Given String output:
    	String string = ", " + Material_Type + " Material" + ", with a " + Finish + " finish. " + Size + " in a unit, $" + Cost + " per unit.\n";
        return string;
    }

    // decided to put this at the top of the hierarchy, so the code does not have to be changed with the addition of materials 
    public double getOrderCost(int units) { 
    	double price = units*(this.Cost); 
    	return price;
    	}




}//Fasteners end;
