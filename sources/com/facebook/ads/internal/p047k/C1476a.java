package com.facebook.ads.internal.p047k;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Environment;
import android.os.StatFs;
import com.foursquare.pilgrim.C1993z;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.facebook.ads.internal.k.a */
public class C1476a {
    /* renamed from: a */
    private static SensorManager f4042a;
    /* renamed from: b */
    private static Sensor f4043b;
    /* renamed from: c */
    private static Sensor f4044c;
    /* renamed from: d */
    private static volatile float[] f4045d;
    /* renamed from: e */
    private static volatile float[] f4046e;
    /* renamed from: f */
    private static Map<String, String> f4047f = new ConcurrentHashMap();
    /* renamed from: g */
    private static String[] f4048g = new String[]{"x", "y", C1993z.f5398a};
    /* renamed from: h */
    private static SensorEventListener f4049h;
    /* renamed from: i */
    private static SensorEventListener f4050i;

    /* renamed from: com.facebook.ads.internal.k.a$a */
    private static class C1472a implements SensorEventListener {
        private C1472a() {
        }

        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            C1476a.f4045d = sensorEvent.values;
            C1476a.m5170d();
        }
    }

    /* renamed from: com.facebook.ads.internal.k.a$b */
    private static class C1473b implements SensorEventListener {
        private C1473b() {
        }

        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            C1476a.f4046e = sensorEvent.values;
            C1476a.m5172e();
        }
    }

    /* renamed from: a */
    public static Map<String, String> m5161a() {
        Map hashMap = new HashMap();
        hashMap.putAll(f4047f);
        C1476a.m5163a(hashMap);
        return hashMap;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public static synchronized void m5162a(android.content.Context r5) {
        /*
        r0 = com.facebook.ads.internal.p047k.C1476a.class;
        monitor-enter(r0);
        com.facebook.ads.internal.p047k.C1476a.m5166b(r5);	 Catch:{ all -> 0x006e }
        com.facebook.ads.internal.p047k.C1476a.m5169c(r5);	 Catch:{ all -> 0x006e }
        com.facebook.ads.internal.p047k.C1476a.m5171d(r5);	 Catch:{ all -> 0x006e }
        r1 = f4042a;	 Catch:{ all -> 0x006e }
        if (r1 != 0) goto L_0x0020;
    L_0x0010:
        r1 = "sensor";
        r5 = r5.getSystemService(r1);	 Catch:{ all -> 0x006e }
        r5 = (android.hardware.SensorManager) r5;	 Catch:{ all -> 0x006e }
        f4042a = r5;	 Catch:{ all -> 0x006e }
        r5 = f4042a;	 Catch:{ all -> 0x006e }
        if (r5 != 0) goto L_0x0020;
    L_0x001e:
        monitor-exit(r0);
        return;
    L_0x0020:
        r5 = f4043b;	 Catch:{ all -> 0x006e }
        if (r5 != 0) goto L_0x002d;
    L_0x0024:
        r5 = f4042a;	 Catch:{ all -> 0x006e }
        r1 = 1;
        r5 = r5.getDefaultSensor(r1);	 Catch:{ all -> 0x006e }
        f4043b = r5;	 Catch:{ all -> 0x006e }
    L_0x002d:
        r5 = f4044c;	 Catch:{ all -> 0x006e }
        if (r5 != 0) goto L_0x003a;
    L_0x0031:
        r5 = f4042a;	 Catch:{ all -> 0x006e }
        r1 = 4;
        r5 = r5.getDefaultSensor(r1);	 Catch:{ all -> 0x006e }
        f4044c = r5;	 Catch:{ all -> 0x006e }
    L_0x003a:
        r5 = f4049h;	 Catch:{ all -> 0x006e }
        r1 = 3;
        r2 = 0;
        if (r5 != 0) goto L_0x0054;
    L_0x0040:
        r5 = new com.facebook.ads.internal.k.a$a;	 Catch:{ all -> 0x006e }
        r5.<init>();	 Catch:{ all -> 0x006e }
        f4049h = r5;	 Catch:{ all -> 0x006e }
        r5 = f4043b;	 Catch:{ all -> 0x006e }
        if (r5 == 0) goto L_0x0054;
    L_0x004b:
        r5 = f4042a;	 Catch:{ all -> 0x006e }
        r3 = f4049h;	 Catch:{ all -> 0x006e }
        r4 = f4043b;	 Catch:{ all -> 0x006e }
        r5.registerListener(r3, r4, r1);	 Catch:{ all -> 0x006e }
    L_0x0054:
        r5 = f4050i;	 Catch:{ all -> 0x006e }
        if (r5 != 0) goto L_0x006c;
    L_0x0058:
        r5 = new com.facebook.ads.internal.k.a$b;	 Catch:{ all -> 0x006e }
        r5.<init>();	 Catch:{ all -> 0x006e }
        f4050i = r5;	 Catch:{ all -> 0x006e }
        r5 = f4044c;	 Catch:{ all -> 0x006e }
        if (r5 == 0) goto L_0x006c;
    L_0x0063:
        r5 = f4042a;	 Catch:{ all -> 0x006e }
        r2 = f4050i;	 Catch:{ all -> 0x006e }
        r3 = f4044c;	 Catch:{ all -> 0x006e }
        r5.registerListener(r2, r3, r1);	 Catch:{ all -> 0x006e }
    L_0x006c:
        monitor-exit(r0);
        return;
    L_0x006e:
        r5 = move-exception;
        monitor-exit(r0);
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.k.a.a(android.content.Context):void");
    }

    /* renamed from: a */
    private static void m5163a(Map<String, String> map) {
        float[] fArr = f4045d;
        float[] fArr2 = f4046e;
        if (fArr != null) {
            int min = Math.min(f4048g.length, fArr.length);
            for (int i = 0; i < min; i++) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("accelerometer_");
                stringBuilder.append(f4048g[i]);
                map.put(stringBuilder.toString(), String.valueOf(fArr[i]));
            }
        }
        if (fArr2 != null) {
            int min2 = Math.min(f4048g.length, fArr2.length);
            for (int i2 = 0; i2 < min2; i2++) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("rotation_");
                stringBuilder2.append(f4048g[i2]);
                map.put(stringBuilder2.toString(), String.valueOf(fArr2[i2]));
            }
        }
    }

    /* renamed from: b */
    private static void m5166b(Context context) {
        MemoryInfo memoryInfo = new MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        f4047f.put("available_memory", String.valueOf(memoryInfo.availMem));
    }

    /* renamed from: c */
    private static void m5169c(Context context) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long availableBlocks = (long) statFs.getAvailableBlocks();
        f4047f.put("free_space", String.valueOf(availableBlocks * ((long) statFs.getBlockSize())));
    }

    /* renamed from: d */
    private static synchronized void m5170d() {
        synchronized (C1476a.class) {
            if (f4042a != null) {
                f4042a.unregisterListener(f4049h);
            }
            f4049h = null;
        }
    }

    /* renamed from: d */
    private static void m5171d(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            Object obj;
            float f;
            int intExtra = registerReceiver.getIntExtra("level", -1);
            int intExtra2 = registerReceiver.getIntExtra("scale", -1);
            int intExtra3 = registerReceiver.getIntExtra("status", -1);
            if (intExtra3 != 2) {
                if (intExtra3 != 5) {
                    obj = null;
                    f = 0.0f;
                    if (intExtra2 > 0) {
                        f = 100.0f * (((float) intExtra) / ((float) intExtra2));
                    }
                    f4047f.put("battery", String.valueOf(f));
                    f4047f.put("charging", obj == null ? "1" : "0");
                }
            }
            obj = 1;
            f = 0.0f;
            if (intExtra2 > 0) {
                f = 100.0f * (((float) intExtra) / ((float) intExtra2));
            }
            f4047f.put("battery", String.valueOf(f));
            if (obj == null) {
            }
            f4047f.put("charging", obj == null ? "1" : "0");
        }
    }

    /* renamed from: e */
    private static synchronized void m5172e() {
        synchronized (C1476a.class) {
            if (f4042a != null) {
                f4042a.unregisterListener(f4050i);
            }
            f4050i = null;
        }
    }
}
