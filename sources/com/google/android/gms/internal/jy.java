package com.google.android.gms.internal;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;

@zzzv
final class jy implements SensorEventListener {
    /* renamed from: a */
    private final SensorManager f16233a;
    /* renamed from: b */
    private final Object f16234b = new Object();
    /* renamed from: c */
    private final Display f16235c;
    /* renamed from: d */
    private final float[] f16236d = new float[9];
    /* renamed from: e */
    private final float[] f16237e = new float[9];
    /* renamed from: f */
    private float[] f16238f;
    /* renamed from: g */
    private Handler f16239g;
    /* renamed from: h */
    private ka f16240h;

    jy(Context context) {
        this.f16233a = (SensorManager) context.getSystemService("sensor");
        this.f16235c = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    /* renamed from: a */
    private final void m19953a(int i, int i2) {
        float f = this.f16237e[i];
        this.f16237e[i] = this.f16237e[i2];
        this.f16237e[i2] = f;
    }

    /* renamed from: a */
    final void m19954a() {
        if (this.f16239g == null) {
            Sensor defaultSensor = this.f16233a.getDefaultSensor(11);
            if (defaultSensor == null) {
                hx.m19913c("No Sensor of TYPE_ROTATION_VECTOR");
                return;
            }
            HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
            handlerThread.start();
            this.f16239g = new Handler(handlerThread.getLooper());
            if (!this.f16233a.registerListener(this, defaultSensor, 0, this.f16239g)) {
                hx.m19913c("SensorManager.registerListener failed.");
                m19957b();
            }
        }
    }

    /* renamed from: a */
    final void m19955a(ka kaVar) {
        this.f16240h = kaVar;
    }

    /* renamed from: a */
    final boolean m19956a(float[] fArr) {
        synchronized (this.f16234b) {
            if (this.f16238f == null) {
                return false;
            }
            System.arraycopy(this.f16238f, 0, fArr, 0, this.f16238f.length);
            return true;
        }
    }

    /* renamed from: b */
    final void m19957b() {
        if (this.f16239g != null) {
            this.f16233a.unregisterListener(this);
            this.f16239g.post(new jz(this));
            this.f16239g = null;
        }
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] != 0.0f || fArr[1] != 0.0f || fArr[2] != 0.0f) {
            synchronized (this.f16234b) {
                if (this.f16238f == null) {
                    this.f16238f = new float[9];
                }
            }
            SensorManager.getRotationMatrixFromVector(this.f16236d, fArr);
            switch (this.f16235c.getRotation()) {
                case 1:
                    SensorManager.remapCoordinateSystem(this.f16236d, 2, 129, this.f16237e);
                    break;
                case 2:
                    SensorManager.remapCoordinateSystem(this.f16236d, 129, 130, this.f16237e);
                    break;
                case 3:
                    SensorManager.remapCoordinateSystem(this.f16236d, 130, 1, this.f16237e);
                    break;
                default:
                    System.arraycopy(this.f16236d, 0, this.f16237e, 0, 9);
                    break;
            }
            m19953a(1, 3);
            m19953a(2, 6);
            m19953a(5, 7);
            synchronized (this.f16234b) {
                System.arraycopy(this.f16237e, 0, this.f16238f, 0, 9);
            }
            if (this.f16240h != null) {
                this.f16240h.mo4646a();
            }
        }
    }
}
