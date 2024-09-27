package fsftbuffer;

/**
 * The BufferableWrapper class is a generic wrapper that holds an element and associates it with
 * a timeout time. This class is typically used to store elements in a buffer with an expiration
 * time, after which the element should no longer be valid or available for use.
 *
 * The class accepts any type of element (generic parameter {@code T}) and a timeout time in milliseconds.
 * This timeout time is used to track when the element should expire, relative to its creation or last update.
 *
 * @param <T> The type of element that this wrapper holds.
 */
public class BufferableWrapper<T> {

    private final T element;
    private long timeoutTime;

    /**
     * Constructs a new BufferableWrapper.
     *
     * @param element The element to be wrapped and stored.
     * @param timeoutTime The timeout time in milliseconds representing how long the element should
     *                    remain valid, starting from the moment this object is created or updated.
     */
    public BufferableWrapper(T element, long timeoutTime) {
        this.element = element;
        this.timeoutTime = timeoutTime;
    }

    /**
     * Returns the wrapped element.
     *
     * @return The element wrapped by this BufferableWrapper.
     */
    public T getElement() {
        return element;
    }

    /**
     * Returns the timeout time.
     *
     * @return The timeout time in milliseconds representing the remaining duration before this
     *         element should expire.
     */
    public long getTimeoutTime() {
        return timeoutTime;
    }

    /**
     * Sets a new timeout time for the element.
     *
     * @param timeoutTime The new timeout time in milliseconds representing how long the element should
     *                    remain valid from the current time.
     */
    public void setTimeoutTime(long timeoutTime) {
        this.timeoutTime = timeoutTime;
    }

}