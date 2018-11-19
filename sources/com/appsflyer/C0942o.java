package com.appsflyer;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.appsflyer.o */
final class C0942o implements SensorEventListener {
    /* renamed from: a */
    private final int f2488a;
    @NonNull
    /* renamed from: b */
    private final String f2489b;
    @NonNull
    /* renamed from: c */
    private final String f2490c;
    /* renamed from: d */
    private final float[][] f2491d = new float[2][];
    /* renamed from: e */
    private final long[] f2492e = new long[2];
    /* renamed from: f */
    private final int f2493f;
    /* renamed from: g */
    private double f2494g;
    /* renamed from: h */
    private long f2495h;

    @NonNull
    /* renamed from: a */
    private static String m3213a(String str) {
        return str == null ? "" : str;
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    private C0942o(int i, @Nullable String str, @Nullable String str2) {
        this.f2488a = i;
        this.f2489b = C0942o.m3213a(str);
        this.f2490c = C0942o.m3213a(str2);
        this.f2493f = C0942o.m3217b(i, this.f2489b, this.f2490c);
    }

    /* renamed from: b */
    private static int m3217b(int i, @NonNull String str, @NonNull String str2) {
        return ((((i + 31) * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    /* renamed from: a */
    static C0942o m3212a(Sensor sensor) {
        return C0942o.m3211a(sensor.getType(), sensor.getName(), sensor.getVendor());
    }

    /* renamed from: a */
    static C0942o m3211a(int i, String str, String str2) {
        return new C0942o(i, str, str2);
    }

    /* renamed from: a */
    private static double m3210a(@NonNull float[] fArr, @NonNull float[] fArr2) {
        double d = 0.0d;
        for (int i = 0; i < Math.min(fArr.length, fArr2.length); i++) {
            d += StrictMath.pow((double) (fArr[i] - fArr2[i]), 2.0d);
        }
        return Math.sqrt(d);
    }

    /* renamed from: b */
    private static boolean m3218b(Sensor sensor) {
        return (sensor == null || sensor.getName() == null || sensor.getVendor() == null) ? null : true;
    }

    @NonNull
    /* renamed from: a */
    private static List<Float> m3214a(@NonNull float[] fArr) {
        List<Float> arrayList = new ArrayList(fArr.length);
        for (float valueOf : fArr) {
            arrayList.add(Float.valueOf(valueOf));
        }
        return arrayList;
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent != null && sensorEvent.values != null && C0942o.m3218b(sensorEvent.sensor)) {
            m3221a(sensorEvent.sensor.getType(), sensorEvent.sensor.getName(), sensorEvent.sensor.getVendor(), sensorEvent.timestamp, sensorEvent.values);
        }
    }

    /* renamed from: a */
    final void m3221a(int i, @NonNull String str, @NonNull String str2, long j, @NonNull float[] fArr) {
        if (m3219c(i, str, str2) != 0) {
            m3215a(j, fArr);
        }
    }

    /* renamed from: a */
    final void m3222a(@NonNull Map<C0942o, Map<String, Object>> map) {
        m3216a((Map) map, true);
    }

    /* renamed from: b */
    public final void m3224b(Map<C0942o, Map<String, Object>> map) {
        m3216a((Map) map, false);
    }

    /* renamed from: a */
    private void m3216a(@NonNull Map<C0942o, Map<String, Object>> map, boolean z) {
        if (m3225c()) {
            map.put(this, m3220a());
            if (z) {
                m3223b();
            }
        } else if (!map.containsKey(this)) {
            map.put(this, m3220a());
        }
    }

    /* renamed from: c */
    private boolean m3219c(int i, @NonNull String str, @NonNull String str2) {
        return (this.f2488a != i || this.f2489b.equals(str) == 0 || this.f2490c.equals(str2) == 0) ? false : true;
    }

    /* renamed from: a */
    private void m3215a(long j, @NonNull float[] fArr) {
        long currentTimeMillis = System.currentTimeMillis();
        float[] fArr2 = this.f2491d[0];
        if (fArr2 == null) {
            this.f2491d[0] = Arrays.copyOf(fArr, fArr.length);
            this.f2492e[0] = currentTimeMillis;
            return;
        }
        float[] fArr3 = this.f2491d[1];
        if (fArr3 == null) {
            float[] copyOf = Arrays.copyOf(fArr, fArr.length);
            this.f2491d[1] = copyOf;
            this.f2492e[1] = currentTimeMillis;
            this.f2494g = C0942o.m3210a(fArr2, copyOf);
            return;
        }
        if (50000000 <= j - this.f2495h) {
            this.f2495h = j;
            if (Arrays.equals(fArr3, fArr) != null) {
                this.f2492e[1] = currentTimeMillis;
                return;
            }
            j = C0942o.m3210a(fArr2, fArr);
            if (j > this.f2494g) {
                this.f2491d[1] = Arrays.copyOf(fArr, fArr.length);
                this.f2492e[1] = currentTimeMillis;
                this.f2494g = j;
            }
        }
    }

    @NonNull
    /* renamed from: a */
    final Map<String, Object> m3220a() {
        Map<String, Object> hashMap = new HashMap(7);
        hashMap.put("sT", Integer.valueOf(this.f2488a));
        hashMap.put("sN", this.f2489b);
        hashMap.put("sV", this.f2490c);
        float[] fArr = this.f2491d[0];
        if (fArr != null) {
            hashMap.put("sVS", C0942o.m3214a(fArr));
        }
        fArr = this.f2491d[1];
        if (fArr != null) {
            hashMap.put("sVE", C0942o.m3214a(fArr));
        }
        return hashMap;
    }

    /* renamed from: b */
    final void m3223b() {
        int length = this.f2491d.length;
        for (int i = 0; i < length; i++) {
            this.f2491d[i] = null;
        }
        length = this.f2492e.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.f2492e[i2] = 0;
        }
        this.f2494g = 0.0d;
        this.f2495h = 0;
    }

    /* renamed from: c */
    final boolean m3225c() {
        return this.f2491d[0] != null;
    }

    public final int hashCode() {
        return this.f2493f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0942o)) {
            return null;
        }
        C0942o c0942o = (C0942o) obj;
        return m3219c(c0942o.f2488a, c0942o.f2489b, c0942o.f2490c);
    }
}
