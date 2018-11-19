package com.google.android.gms.location;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.C2507w;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.internal.oj;
import com.google.android.gms.internal.ok;
import com.google.android.gms.internal.zzbfm;
import com.google.android.gms.internal.zzbfq;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ActivityRecognitionResult extends zzbfm implements ReflectedParcelable {
    public static final Creator<ActivityRecognitionResult> CREATOR = new C4494o();
    private Bundle extras;
    private List<DetectedActivity> zziii;
    private long zziij;
    private long zziik;
    private int zziil;

    public ActivityRecognitionResult(DetectedActivity detectedActivity, long j, long j2) {
        this(detectedActivity, j, j2, 0, null);
    }

    private ActivityRecognitionResult(DetectedActivity detectedActivity, long j, long j2, int i, Bundle bundle) {
        this(Collections.singletonList(detectedActivity), j, j2, 0, null);
    }

    public ActivityRecognitionResult(List<DetectedActivity> list, long j, long j2) {
        this((List) list, j, j2, 0, null);
    }

    public ActivityRecognitionResult(List<DetectedActivity> list, long j, long j2, int i, Bundle bundle) {
        boolean z = false;
        boolean z2 = list != null && list.size() > 0;
        ad.b(z2, "Must have at least 1 detected activity");
        if (j > 0 && j2 > 0) {
            z = true;
        }
        ad.b(z, "Must set times");
        this.zziii = list;
        this.zziij = j;
        this.zziik = j2;
        this.zziil = i;
        this.extras = bundle;
    }

    public static ActivityRecognitionResult extractResult(Intent intent) {
        ActivityRecognitionResult activityRecognitionResult;
        if (hasResult(intent)) {
            zzbfq zzbfq = intent.getExtras().get("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT");
            if (zzbfq instanceof byte[]) {
                zzbfq = ok.m20114a((byte[]) zzbfq, CREATOR);
            } else if (zzbfq instanceof ActivityRecognitionResult) {
            }
            activityRecognitionResult = (ActivityRecognitionResult) zzbfq;
            if (activityRecognitionResult != null) {
                return activityRecognitionResult;
            }
            List zzl = zzl(intent);
            return (zzl == null || zzl.isEmpty()) ? null : (ActivityRecognitionResult) zzl.get(zzl.size() - 1);
        }
        activityRecognitionResult = null;
        if (activityRecognitionResult != null) {
            return activityRecognitionResult;
        }
        List zzl2 = zzl(intent);
        if (zzl2 == null) {
            return null;
        }
    }

    public static boolean hasResult(Intent intent) {
        if (intent == null) {
            return false;
        }
        if (intent == null ? false : intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT")) {
            return true;
        }
        List zzl = zzl(intent);
        return (zzl == null || zzl.isEmpty()) ? false : true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean zzc(android.os.Bundle r5, android.os.Bundle r6) {
        /*
        r0 = 1;
        if (r5 != 0) goto L_0x0006;
    L_0x0003:
        if (r6 != 0) goto L_0x0006;
    L_0x0005:
        return r0;
    L_0x0006:
        r1 = 0;
        if (r5 != 0) goto L_0x000b;
    L_0x0009:
        if (r6 != 0) goto L_0x000f;
    L_0x000b:
        if (r5 == 0) goto L_0x0010;
    L_0x000d:
        if (r6 != 0) goto L_0x0010;
    L_0x000f:
        return r1;
    L_0x0010:
        r2 = r5.size();
        r3 = r6.size();
        if (r2 == r3) goto L_0x001b;
    L_0x001a:
        return r1;
    L_0x001b:
        r2 = r5.keySet();
        r2 = r2.iterator();
    L_0x0023:
        r3 = r2.hasNext();
        if (r3 == 0) goto L_0x0069;
    L_0x0029:
        r3 = r2.next();
        r3 = (java.lang.String) r3;
        r4 = r6.containsKey(r3);
        if (r4 != 0) goto L_0x0036;
    L_0x0035:
        return r1;
    L_0x0036:
        r4 = r5.get(r3);
        if (r4 != 0) goto L_0x0043;
    L_0x003c:
        r3 = r6.get(r3);
        if (r3 == 0) goto L_0x0023;
    L_0x0042:
        return r1;
    L_0x0043:
        r4 = r5.get(r3);
        r4 = r4 instanceof android.os.Bundle;
        if (r4 == 0) goto L_0x005a;
    L_0x004b:
        r4 = r5.getBundle(r3);
        r3 = r6.getBundle(r3);
        r3 = zzc(r4, r3);
        if (r3 != 0) goto L_0x0023;
    L_0x0059:
        return r1;
    L_0x005a:
        r4 = r5.get(r3);
        r3 = r6.get(r3);
        r3 = r4.equals(r3);
        if (r3 != 0) goto L_0x0023;
    L_0x0068:
        return r1;
    L_0x0069:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.ActivityRecognitionResult.zzc(android.os.Bundle, android.os.Bundle):boolean");
    }

    @Nullable
    private static List<ActivityRecognitionResult> zzl(Intent intent) {
        return !(intent == null ? false : intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT_LIST")) ? null : ok.m20117b(intent, "com.google.android.location.internal.EXTRA_ACTIVITY_RESULT_LIST", CREATOR);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) obj;
        return this.zziij == activityRecognitionResult.zziij && this.zziik == activityRecognitionResult.zziik && this.zziil == activityRecognitionResult.zziil && C2507w.a(this.zziii, activityRecognitionResult.zziii) && zzc(this.extras, activityRecognitionResult.extras);
    }

    public int getActivityConfidence(int i) {
        for (DetectedActivity detectedActivity : this.zziii) {
            if (detectedActivity.getType() == i) {
                return detectedActivity.getConfidence();
            }
        }
        return 0;
    }

    public long getElapsedRealtimeMillis() {
        return this.zziik;
    }

    public DetectedActivity getMostProbableActivity() {
        return (DetectedActivity) this.zziii.get(0);
    }

    public List<DetectedActivity> getProbableActivities() {
        return this.zziii;
    }

    public long getTime() {
        return this.zziij;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zziij), Long.valueOf(this.zziik), Integer.valueOf(this.zziil), this.zziii, this.extras});
    }

    public String toString() {
        String valueOf = String.valueOf(this.zziii);
        long j = this.zziij;
        long j2 = this.zziik;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 124);
        stringBuilder.append("ActivityRecognitionResult [probableActivities=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", timeMillis=");
        stringBuilder.append(j);
        stringBuilder.append(", elapsedRealtimeMillis=");
        stringBuilder.append(j2);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        i = oj.m20087a(parcel);
        oj.m20112c(parcel, 1, this.zziii, false);
        oj.m20092a(parcel, 2, this.zziij);
        oj.m20092a(parcel, 3, this.zziik);
        oj.m20091a(parcel, 4, this.zziil);
        oj.m20093a(parcel, 5, this.extras, false);
        oj.m20088a(parcel, i);
    }
}
