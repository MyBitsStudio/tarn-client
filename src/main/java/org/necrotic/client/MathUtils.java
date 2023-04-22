package org.necrotic.client;

public class MathUtils {

    public static float map(float value, float istart, float istop, float ostart, float ostop) {
        return ostart + (ostop - ostart) * ((value - istart) / (istop - istart));
    }

    public static float smoothstep(float edge0, float edge1, float x) {
        // Scale, bias and saturate x to 0..1 range
        x = constrain((x - edge0) / (edge1 - edge0), 0.0f, 1.0f);
        // Evaluate polynomial
        return x * x * (3 - 2 * x);
    }

    public static float constrain(float value, float min, float max) {
        return Math.min(Math.max(value,  min), max);
    }

    public static float dist(int x1, int y1, int x2, int y2) {
        return (float) Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
    }

    public static int blend(int a, int b, float ratio) {
        int mask1 = 0x00ff00ff;
        int mask2 = 0xff00ff00;

        int f2 = (int) (256 * ratio);
        int f1 = 256 - f2;
        return (((((a & mask1) * f1) + ((b & mask1) * f2)) >> 8) & mask1) | (((((a & mask2) * f1) + ((b & mask2) * f2)) >> 8) & mask2);
    }

}
