package Reader;

/**
 * Parent class for Read-classes.
 *
 * @author Alexey Gudinsky
 */
public abstract class Reader {
    /**
     * Common method for child-classes which reads and parses file for arguments
     *
     * @return get ArrayList or list of instructions's arguments
     */
    abstract String readInstructions();

}


