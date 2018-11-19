package android.support.transition;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* renamed from: android.support.transition.m */
class C0347m<T> extends Property<T, Float> {
    /* renamed from: a */
    private final Property<T, PointF> f1181a;
    /* renamed from: b */
    private final PathMeasure f1182b;
    /* renamed from: c */
    private final float f1183c;
    /* renamed from: d */
    private final float[] f1184d = new float[2];
    /* renamed from: e */
    private final PointF f1185e = new PointF();
    /* renamed from: f */
    private float f1186f;

    public /* synthetic */ Object get(Object obj) {
        return m1288a(obj);
    }

    public /* synthetic */ void set(Object obj, Object obj2) {
        m1289a(obj, (Float) obj2);
    }

    C0347m(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f1181a = property;
        this.f1182b = new PathMeasure(path, false);
        this.f1183c = this.f1182b.getLength();
    }

    /* renamed from: a */
    public Float m1288a(T t) {
        return Float.valueOf(this.f1186f);
    }

    /* renamed from: a */
    public void m1289a(T t, Float f) {
        this.f1186f = f.floatValue();
        this.f1182b.getPosTan(this.f1183c * f.floatValue(), this.f1184d, null);
        this.f1185e.x = this.f1184d[0];
        this.f1185e.y = this.f1184d[1];
        this.f1181a.set(t, this.f1185e);
    }
}
