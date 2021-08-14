import java.io.*;
import java.io.Serial;
import java.io.Serializable;

// Class that represents a piece of hardware with internal threading , like a Nut
// Not entirely required since there is only one type of Nut in the hierarchy, but useful for adding additional items
public abstract class Female_Threaded extends Has_Threads implements Serializable {

    /**
	 * Auto Generated Serial
	 */
	@Serial
	private static final long serialVersionUID = 3365592552488345797L;

	// constructor method
    public Female_Threaded(Threads thread, Materials.ThreadedMaterials material, Enum<?> finish, double unitprice, int unitsize) throws IllegalFastener {
    	
        super(thread, material, finish, unitprice, unitsize); // threaded constructor Override

    }
    
    

}//Female_Threaded end;
