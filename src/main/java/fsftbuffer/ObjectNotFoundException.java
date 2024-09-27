package fsftbuffer;

import java.util.UUID;

/**
 * The ObjectNotFoundException is thrown when an object cannot be found in the buffer.
 * This exception includes additional information, such as the UUID of the object that
 * was being searched for, to help with debugging.
 */
public class ObjectNotFoundException extends Exception {

    private final UUID id;

    /**
     * Constructs a new ObjectNotFoundException with the specified error message and object UUID.
     *
     * @param objectId The UUID of the object that could not be found.
     * @param errorMessage The error message describing the exception.
     */
    public ObjectNotFoundException(UUID id, String errorMessage) {
        super(String.format("Object with id %s not found: %s", id, errorMessage));
        this.id = id;
    }

    /**
     * Returns the UUID of the object that was not found.
     *
     * @return The UUID of the missing object.
     */
    public UUID getId() {
        return id;
    }

}