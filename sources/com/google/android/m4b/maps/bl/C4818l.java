package com.google.android.m4b.maps.bl;

/* renamed from: com.google.android.m4b.maps.bl.l */
public abstract class C4818l {
    /* renamed from: a */
    private final int f17606a;

    /* renamed from: a */
    public abstract float mo5055a();

    /* renamed from: b */
    public abstract float mo5056b();

    /* renamed from: c */
    public abstract float mo5057c();

    public C4818l(int i) {
        this.f17606a = i;
    }

    /* renamed from: d */
    public final boolean m21381d() {
        return this.f17606a == 0;
    }

    /* renamed from: e */
    public final boolean m21382e() {
        return this.f17606a == 3;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ScaleEvent{eventType=");
        switch (this.f17606a) {
            case 0:
                stringBuilder.append("EVENT_TYPE_ON_SCALING");
                break;
            case 1:
                stringBuilder.append("EVENT_TYPE_ON_SCALE_BEGIN");
                break;
            case 2:
                stringBuilder.append("EVENT_TYPE_ON_SCALE_END");
                break;
            case 3:
                stringBuilder.append("EVENT_TYPE_ON_TWO_FINGER_TAP");
                break;
            default:
                break;
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
