package com.mapbox.mapboxsdk.attribution;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.support.annotation.Nullable;

public class AttributionLayout {
    private PointF anchorPoint;
    private Bitmap logo;
    private boolean shortText;

    public AttributionLayout(@Nullable Bitmap bitmap, @Nullable PointF pointF, boolean z) {
        this.logo = bitmap;
        this.anchorPoint = pointF;
        this.shortText = z;
    }

    public Bitmap getLogo() {
        return this.logo;
    }

    public PointF getAnchorPoint() {
        return this.anchorPoint;
    }

    public boolean isShortText() {
        return this.shortText;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
        r4 = this;
        r0 = 1;
        if (r4 != r5) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = 0;
        if (r5 == 0) goto L_0x003c;
    L_0x0007:
        r2 = r4.getClass();
        r3 = r5.getClass();
        if (r2 == r3) goto L_0x0012;
    L_0x0011:
        goto L_0x003c;
    L_0x0012:
        r5 = (com.mapbox.mapboxsdk.attribution.AttributionLayout) r5;
        r2 = r4.logo;
        if (r2 == 0) goto L_0x0023;
    L_0x0018:
        r2 = r4.logo;
        r3 = r5.logo;
        r2 = r2.equals(r3);
        if (r2 != 0) goto L_0x0028;
    L_0x0022:
        goto L_0x0027;
    L_0x0023:
        r2 = r5.logo;
        if (r2 == 0) goto L_0x0028;
    L_0x0027:
        return r1;
    L_0x0028:
        r2 = r4.anchorPoint;
        if (r2 == 0) goto L_0x0035;
    L_0x002c:
        r0 = r4.anchorPoint;
        r5 = r5.anchorPoint;
        r0 = r0.equals(r5);
        goto L_0x003b;
    L_0x0035:
        r5 = r5.anchorPoint;
        if (r5 != 0) goto L_0x003a;
    L_0x0039:
        goto L_0x003b;
    L_0x003a:
        r0 = 0;
    L_0x003b:
        return r0;
    L_0x003c:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.attribution.AttributionLayout.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (this.logo != null ? this.logo.hashCode() : 0) * 31;
        if (this.anchorPoint != null) {
            i = this.anchorPoint.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AttributionLayout{logo=");
        stringBuilder.append(this.logo);
        stringBuilder.append(", anchorPoint=");
        stringBuilder.append(this.anchorPoint);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
