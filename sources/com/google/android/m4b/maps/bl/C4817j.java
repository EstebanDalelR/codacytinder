package com.google.android.m4b.maps.bl;

/* renamed from: com.google.android.m4b.maps.bl.j */
public abstract class C4817j {
    /* renamed from: a */
    private final int f17605a;

    /* renamed from: a */
    public abstract float mo5051a();

    /* renamed from: a */
    public abstract void mo5052a(float f, float f2);

    /* renamed from: b */
    public abstract float mo5053b();

    /* renamed from: c */
    public abstract float mo5054c();

    public C4817j(int i) {
        this.f17605a = i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RotateEvent{eventType=");
        switch (this.f17605a) {
            case 0:
                stringBuilder.append("EVENT_TYPE_ON_ROTATE");
                break;
            case 1:
                stringBuilder.append("EVENT_TYPE_ON_ROTATE_BEGIN");
                break;
            case 2:
                stringBuilder.append("EVENT_TYPE_ON_ROTATE_END");
                break;
            default:
                break;
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
