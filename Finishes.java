
import java.io.Serial;
import java.io.Serializable;

// **Supplied for your use in Assignment 4.**
// added screw finish

public final class Finishes implements Serializable {

    /**
	 * Auto Gen Serial UID
	 */
	@Serial
	private static final long serialVersionUID = 3287198433875663480L;

    // added enum for screw finishes
    // ** can change order
    public enum ScrewFinish {
    	Chrome, 
    	Hot_Dipped_Galvanized, 
    	Plain, 
    	Yellow_Zinc, 
    	Zinc, 
    	Black_Phosphate, 
    	ACQ_1000_Hour, 
    	Lubricated
    	};

    public enum BoltFinish {Chrome, Hot_Dipped_Galvanized, Plain, Yellow_Zinc, Zinc};

    public enum WingNutFinish {Chrome, Hot_Dipped_Galvanized, Plain, Yellow_Zinc, Zinc};

    public enum CommonNailFinish {Bright, Hot_Dipped_Galvanized};

}
