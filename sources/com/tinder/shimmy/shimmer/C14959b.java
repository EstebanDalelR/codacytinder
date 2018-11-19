package com.tinder.shimmy.shimmer;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;
import rx.schedulers.Schedulers;
import rx.subjects.C19785a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001e\u001fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019J\b\u0010\u001b\u001a\u00020\u001cH\u0007J\b\u0010\u001d\u001a\u00020\u001cH\u0007R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0004¢\u0006\u0002\n\u0000R2\u0010\u0014\u001a&\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00160\u0016 \u0017*\u0012\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00160\u0016\u0018\u00010\u00150\u0015X\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/tinder/shimmy/shimmer/RollAngleTracker;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "count", "", "isAvailable", "", "()Z", "rollAngleFinder", "Lcom/tinder/shimmy/shimmer/RollAngleTracker$RollAngleFinder;", "rotationVectorSensor", "Landroid/hardware/Sensor;", "sensorEventListener", "Landroid/hardware/SensorEventListener;", "getSensorEventListener", "()Landroid/hardware/SensorEventListener;", "sensorManager", "Landroid/hardware/SensorManager;", "subject", "Lrx/subjects/BehaviorSubject;", "", "kotlin.jvm.PlatformType", "observe", "Lrx/Observable;", "", "start", "", "stop", "Companion", "RollAngleFinder", "shimmy_release"}, k = 1, mv = {1, 1, 9})
/* renamed from: com.tinder.shimmy.shimmer.b */
public final class C14959b {
    /* renamed from: a */
    public static final C14955a f46697a = new C14955a();
    /* renamed from: i */
    private static C14959b f46698i;
    /* renamed from: b */
    private final SensorManager f46699b;
    /* renamed from: c */
    private final Sensor f46700c;
    /* renamed from: d */
    private final C19785a<float[]> f46701d;
    /* renamed from: e */
    private final C14957b f46702e;
    /* renamed from: f */
    private int f46703f;
    /* renamed from: g */
    private final boolean f46704g;
    @NotNull
    /* renamed from: h */
    private final SensorEventListener f46705h;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/tinder/shimmy/shimmer/RollAngleTracker$Companion;", "", "()V", "ROLL_ANGLE_INDEX", "", "sharedInstance", "Lcom/tinder/shimmy/shimmer/RollAngleTracker;", "getSharedInstance", "()Lcom/tinder/shimmy/shimmer/RollAngleTracker;", "setSharedInstance", "(Lcom/tinder/shimmy/shimmer/RollAngleTracker;)V", "getInstance", "context", "Landroid/content/Context;", "shimmy_release"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.shimmy.shimmer.b$a */
    public static final class C14955a {
        private C14955a() {
        }

        /* renamed from: a */
        private final C14959b m56489a() {
            return C14959b.f46698i;
        }

        /* renamed from: a */
        private final void m56490a(C14959b c14959b) {
            C14959b.f46698i = c14959b;
        }

        @NotNull
        /* renamed from: a */
        public final synchronized C14959b m56491a(@NotNull Context context) {
            C2668g.b(context, "context");
            if (m56489a() == null) {
                m56490a(new C14959b(context));
            }
            context = m56489a();
            if (context == null) {
                C2668g.a();
            }
            return context;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0016\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/tinder/shimmy/shimmer/RollAngleTracker$RollAngleFinder;", "", "()V", "orientationAngles", "", "rotationMatrix", "smoothedOrientationAngles", "findRollAngle", "", "sensorValues", "lowPass", "input", "output", "Companion", "shimmy_release"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.shimmy.shimmer.b$b */
    private static final class C14957b {
        @Deprecated
        /* renamed from: a */
        public static final C14956a f46692a = new C14956a();
        /* renamed from: b */
        private final float[] f46693b = new float[9];
        /* renamed from: c */
        private final float[] f46694c = new float[3];
        /* renamed from: d */
        private final float[] f46695d = new float[3];

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tinder/shimmy/shimmer/RollAngleTracker$RollAngleFinder$Companion;", "", "()V", "ALPHA", "", "shimmy_release"}, k = 1, mv = {1, 1, 9})
        /* renamed from: com.tinder.shimmy.shimmer.b$b$a */
        private static final class C14956a {
            private C14956a() {
            }
        }

        /* renamed from: a */
        public final synchronized float m56492a(@NotNull float[] fArr) {
            C2668g.b(fArr, "sensorValues");
            SensorManager.getRotationMatrixFromVector(this.f46693b, fArr);
            SensorManager.getOrientation(this.f46693b, this.f46694c);
            m56493a(this.f46694c, this.f46695d);
            return this.f46695d[2];
        }

        @NotNull
        /* renamed from: a */
        public final float[] m56493a(@NotNull float[] fArr, @NotNull float[] fArr2) {
            C2668g.b(fArr, "input");
            C2668g.b(fArr2, "output");
            int length = fArr.length;
            for (int i = 0; i < length; i++) {
                fArr2[i] = fArr2[i] + ((fArr[i] - fArr2[i]) * 0.15f);
            }
            return fArr2;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/tinder/shimmy/shimmer/RollAngleTracker$sensorEventListener$1", "Landroid/hardware/SensorEventListener;", "(Lcom/tinder/shimmy/shimmer/RollAngleTracker;)V", "onAccuracyChanged", "", "sensor", "Landroid/hardware/Sensor;", "accuracy", "", "onSensorChanged", "sensorEvent", "Landroid/hardware/SensorEvent;", "shimmy_release"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.shimmy.shimmer.b$c */
    public static final class C14958c implements SensorEventListener {
        /* renamed from: a */
        final /* synthetic */ C14959b f46696a;

        public void onAccuracyChanged(@Nullable Sensor sensor, int i) {
        }

        C14958c(C14959b c14959b) {
            this.f46696a = c14959b;
        }

        public void onSensorChanged(@NotNull SensorEvent sensorEvent) {
            C2668g.b(sensorEvent, "sensorEvent");
            Sensor sensor = sensorEvent.sensor;
            C2668g.a(sensor, "sensorEvent.sensor");
            if (sensor.getType() == 11) {
                this.f46696a.f46701d.onNext(sensorEvent.values);
            }
        }
    }

    private C14959b(Context context) {
        this.f46699b = (SensorManager) context.getApplicationContext().getSystemService("sensor");
        context = this.f46699b;
        this.f46700c = context != null ? context.getDefaultSensor(11) : null;
        this.f46701d = C19785a.w();
        this.f46702e = new C14957b();
        context = (this.f46699b == null || this.f46700c == null) ? null : true;
        this.f46704g = context;
        this.f46705h = (SensorEventListener) new C14958c(this);
    }

    /* renamed from: a */
    public final boolean m56497a() {
        return this.f46704g;
    }

    /* renamed from: b */
    public final synchronized void m56498b() {
        if (this.f46703f == 0) {
            SensorManager sensorManager = this.f46699b;
            if (sensorManager != null) {
                sensorManager.unregisterListener(this.f46705h);
            }
            sensorManager = this.f46699b;
            if (sensorManager != null) {
                sensorManager.registerListener(this.f46705h, this.f46700c, 1);
            }
        }
        this.f46703f++;
    }

    /* renamed from: c */
    public final synchronized void m56499c() {
        this.f46703f--;
        if (this.f46703f == 0) {
            SensorManager sensorManager = this.f46699b;
            if (sensorManager != null) {
                sensorManager.unregisterListener(this.f46705h);
            }
        }
    }

    @NotNull
    /* renamed from: d */
    public final Observable<Float> m56500d() {
        Observable<Float> e = this.f46701d.l().a(Schedulers.computation()).l().k(new C18082c(new RollAngleTracker$observe$1(this.f46702e))).e();
        C2668g.a(e, "subject.onBackpressureDr…          .asObservable()");
        return e;
    }
}
