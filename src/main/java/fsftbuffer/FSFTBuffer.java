package fsftbuffer;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/**
 * The FSFTBuffer class is a finite-space finite-time buffer that stores objects of type T, where T
 * extends the Bufferable interface. Each object is associated with a unique ID (UUID) and a timeout time.
 * The buffer has a limited capacity and objects are only stored for a finite amount of time unless they
 * are accessed or updated.
 *
 * This implementation uses a ConcurrentHashMap to ensure thread safety, meaning multiple threads can
 * safely access or modify the buffer concurrently without corrupting the data structure.
 *
 * @param <T> The type of object that this buffer will store. It must implement the Bufferable interface.
 */
public class FSFTBuffer<T extends Bufferable> {

    // A thread-safe map that holds UUIDs as keys and their corresponding BufferableWrapper objects as values.
    private ConcurrentHashMap<UUID, BufferableWrapper> buffer;

    // The maximum number of elements that the buffer can store at any given time.
    private final int capacity;

    // The maximum time (in milliseconds) that an object can stay in the buffer before expiring.
    private final long timeoutTime;

    /**
     * Constructs a new FSFTBuffer with a specified capacity and timeout duration.
     *
     * @param capacity The maximum number of objects that can be stored in the buffer.
     * @param timeoutTime The duration in milliseconds that an object can remain in the buffer
     *                    before it is considered expired.
     */
    public FSFTBuffer(int capacity, long timeoutTime) {
        buffer = new ConcurrentHashMap<>();
        this.capacity = capacity;
        this.timeoutTime = timeoutTime;
    }

    public synchronized boolean put(T element) {

    }

    public synchronized T get(UUID id) throws ObjectNotFoundException {

    }

    public synchronized boolean refreshTimeout(UUID id) {

    }

    public synchronized boolean update(T element) {

    }

}