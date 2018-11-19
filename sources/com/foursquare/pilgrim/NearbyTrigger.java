package com.foursquare.pilgrim;

import android.text.TextUtils;
import java.util.Locale;

public final class NearbyTrigger extends Trigger {
    /* renamed from: c */
    private final int f10584c;
    /* renamed from: d */
    private NearbyTriggerMotionType f10585d;
    /* renamed from: e */
    private NearbyTriggerConstraintType f10586e;

    private enum NearbyTriggerConstraintType {
        RADIUS
    }

    private enum NearbyTriggerMotionType {
        STOPPED
    }

    public NearbyTrigger(TriggerPlaceType triggerPlaceType, String str) {
        this(triggerPlaceType, str, -1);
    }

    public NearbyTrigger(TriggerPlaceType triggerPlaceType, String str, int i) {
        super(triggerPlaceType, str);
        if (str != null) {
            if (str.length() == 24) {
                this.f10585d = NearbyTriggerMotionType.STOPPED;
                this.f10586e = NearbyTriggerConstraintType.RADIUS;
                if (i > 100) {
                    if (i < 1609) {
                        this.f10584c = i;
                        return;
                    }
                }
                this.f10584c = -1;
                return;
            }
        }
        throw new RuntimeException("Invalid id");
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(48);
        stringBuilder.append(this.f10585d.toString().toLowerCase(Locale.US));
        stringBuilder.append(",");
        stringBuilder.append(this.a.toString().toLowerCase(Locale.US));
        stringBuilder.append(",");
        stringBuilder.append(this.b);
        stringBuilder.append(",");
        stringBuilder.append(this.f10586e.toString().toLowerCase(Locale.US));
        stringBuilder.append(",");
        stringBuilder.append(this.f10584c);
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                NearbyTrigger nearbyTrigger = (NearbyTrigger) obj;
                if (this.a != nearbyTrigger.a || !TextUtils.equals(this.b, nearbyTrigger.b)) {
                    return false;
                }
                if (this.f10585d != nearbyTrigger.f10585d) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (((-31 + (this.f10585d != null ? this.f10585d.hashCode() : 0)) * 31) + (this.a != null ? this.a.hashCode() : 0)) * 31;
        if (this.b != null) {
            i = this.b.hashCode();
        }
        return hashCode + i;
    }
}
