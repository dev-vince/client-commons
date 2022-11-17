package dev.vince.commons.util;

/**
 * The Stopwatch class is a utility class used to measure time.
 * It is recommended to use this class instead of the System class.
 * It is also recommended to use this class for timing
 *
 * @author dev-vince
 */
public final class Stopwatch {
    private long lastMS = System.currentTimeMillis();

    /**
     * Resets the stopwatch
     */
    public void reset() {
        this.lastMS = System.currentTimeMillis();
    }

    /**
     * Checks if the stopwatch has reached the specified delay
     * @param delay the delay
     * @return true if the stopwatch has reached the specified delay, false otherwise
     */
    public boolean hasReached(final double delay) {
        return System.currentTimeMillis() - this.lastMS >= delay;
    }

    /**
     * Checks if the stopwatch has reached the specified delay
     * @param delay the delay
     * @return true if the stopwatch has reached the specified delay, false otherwise
     */
    public boolean hasReached(final long delay) {
        return System.currentTimeMillis() - this.lastMS >= delay;
    }

    /**
     * Gets the time elapsed since the stopwatch was last reset
     * @return the time elapsed since the stopwatch was last reset
     */
    public long getTime() {
        return System.currentTimeMillis() - this.lastMS;
    }

    /**
     * Sets the time elapsed since the stopwatch was last reset
     * @param i the time elapsed since the stopwatch was last reset
     */
    public void setTime(final int i) {
        this.lastMS = System.currentTimeMillis() + i;
    }
}
