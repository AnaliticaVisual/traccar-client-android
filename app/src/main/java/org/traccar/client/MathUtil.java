package org.traccar.client;

import java.util.Random;

/**
 * Created by Kenji2 on 12/04/2017.
 */

public class MathUtil {
    public static long nextLong(Random rng, long n) {
        // error checking and 2^x checking removed for simplicity.
        long bits, val;
        do {
            bits = (rng.nextLong() << 1) >>> 1;
            val = bits % n;
        } while (bits-val+(n-1) < 0L);
        return val;
    }
}
