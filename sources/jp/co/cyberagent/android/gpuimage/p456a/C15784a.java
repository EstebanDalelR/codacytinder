package jp.co.cyberagent.android.gpuimage.p456a;

import jp.co.cyberagent.android.gpuimage.Rotation;

/* renamed from: jp.co.cyberagent.android.gpuimage.a.a */
public class C15784a {
    /* renamed from: a */
    public static final float[] f48946a = new float[]{0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};
    /* renamed from: b */
    public static final float[] f48947b = new float[]{1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f};
    /* renamed from: c */
    public static final float[] f48948c = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f};
    /* renamed from: d */
    public static final float[] f48949d = new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: a */
    private static float m59752a(float f) {
        return f == 0.0f ? 1.0f : 0.0f;
    }

    /* renamed from: a */
    public static float[] m59753a(Rotation rotation, boolean z, boolean z2) {
        switch (rotation) {
            case ROTATION_90:
                rotation = f48947b;
                break;
            case ROTATION_180:
                rotation = f48948c;
                break;
            case ROTATION_270:
                rotation = f48949d;
                break;
            default:
                rotation = f48946a;
                break;
        }
        if (z) {
            rotation = new float[]{C15784a.m59752a(rotation[0]), rotation[1], C15784a.m59752a(rotation[2]), rotation[3], C15784a.m59752a(rotation[4]), rotation[5], C15784a.m59752a(rotation[6]), rotation[7]};
        }
        if (!z2) {
            return rotation;
        }
        return new float[]{rotation[0], C15784a.m59752a(rotation[1]), rotation[2], C15784a.m59752a(rotation[3]), rotation[4], C15784a.m59752a(rotation[5]), rotation[6], C15784a.m59752a(rotation[7])};
    }
}
