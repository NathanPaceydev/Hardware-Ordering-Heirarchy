import java.io.*;
import java.io.Serial;
import java.io.Serializable;

// extends Male_Threaded, defines a class for bolts
public abstract class Bolts extends Male_Threaded implements Serializable {
    /**
	 * Auto generated Serial
	 */
	@Serial
	private static final long serialVersionUID = 7052976520161840554L;

	/**
	 * Constructor method, throws illegalFastener
	 * @param length
	 * @param size
	 * @param material
	 * @param finish
	 * @param unitPrice
	 * @param unitSize
	 * @throws IllegalFastener
	 */
    public Bolts(double length, Threads size, Materials.ThreadedMaterials material, Finishes.BoltFinish finish, double unitPrice, int unitSize) throws IllegalFastener {

        super(length, size, material, finish, unitPrice, unitSize); //Overrides Bolt constructor
    }

  

} // Bolts end;
