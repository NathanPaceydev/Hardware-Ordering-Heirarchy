
import java.io.*;

import java.io.Serial;
import java.io.Serializable;

public final class Common_Nail extends Nails implements Serializable {

    /**
	 * Auto Gen Serial UID
	 */
	@Serial
	private static final long serialVersionUID = -7678313299627669938L;

	/**
	 * Constructor Method for common Nail
	 * @param size
	 * @param length
	 * @param gauge
	 * @param finish
	 * @param unitPrice
	 * @param unitSize
	 * @throws IllegalFastener
	 */
    public Common_Nail(NailDesigns.CommonNailSizes size, NailDesigns.CommonNailLengths length, NailDesigns.CommonNailGauges gauge, Finishes.CommonNailFinish finish, double unitPrice, int unitSize) throws IllegalFastener {
    	
        super(size, length, gauge, finish, unitPrice, unitSize); // override Nail constructor
    }

    @Override
    // Update the ToString() method
    public String toString() { 
    	String string = "Common Nail, " + super.toString();
    	return string; 
    	}

}//Common_Nail end;
