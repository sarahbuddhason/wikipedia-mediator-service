package fsftbuffer;

import java.util.UUID;

/**
 * The Bufferable interface represents an entity that can be stored in a buffer
 * with a unique identifier.
 */
public interface Bufferable {

    /**
     * Returns a unique UUID for the instance implementing this interface.
     *
     * Implementing classes should ensure that each instance has a globally unique ID,
     * typically generated using {@code UUID.randomUUID()}.
     *
     * @return A UUID representing the unique ID of the instance.
     */
    UUID id();

}