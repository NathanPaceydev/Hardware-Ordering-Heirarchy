import java.io.*;
import java.io.Serial;
import java.io.Serializable;

// will not be extended ** its in the final form, no more evolutions**
public final class Wing_Nut extends Female_Threaded implements Serializable {

    /**
	 * Auto Generated Serial
	 */
	@Serial
	private static final long serialVersionUID = -1102327351973429576L;

    
	/**
	 * Constructor for Wing Nut
	 * @param thread
	 * @param material
	 * @param finish    // the finish is now a wing nut. finish
	 * @param unitprice
	 * @param unitsize
	 * @throws IllegalFastener
	 */
	public Wing_Nut(Threads thread, Materials.ThreadedMaterials material, Finishes.WingNutFinish finish, double unitprice, int unitsize) throws IllegalFastener {

        super(thread, material, finish, unitprice, unitsize); // override Female_Threaded constructor
    }
    

    @Override
    public String toString() { 
    	String string = "Wing nut, " + super.toString();
    	return string; 
    	}
}//Wing_Nut end;
