package jp.co.cyberagent.android.gpuimage;

public class GPUImageNativeLibrary {
    public static native void YUVtoRBGA(byte[] bArr, int i, int i2, int[] iArr);

    static {
        System.loadLibrary("gpuimage-library");
    }
}
