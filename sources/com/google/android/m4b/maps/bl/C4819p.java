package com.google.android.m4b.maps.bl;

/* renamed from: com.google.android.m4b.maps.bl.p */
public abstract class C4819p {
    /* renamed from: a */
    private final int f17607a;

    /* renamed from: a */
    public abstract float mo5058a();

    public C4819p(int i) {
        this.f17607a = i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TiltEvent{eventType=");
        switch (this.f17607a) {
            case 0:
                stringBuilder.append("EVENT_TYPE_ON_TILTING");
                break;
            case 1:
                stringBuilder.append("EVENT_TYPE_ON_TILT_BEGIN");
                break;
            case 2:
                stringBuilder.append("EVENT_TYPE_ON_TILT_END");
                break;
            default:
                break;
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
