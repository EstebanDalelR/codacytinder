package com.google.android.m4b.maps.p120t;

import android.os.Parcel;
import com.google.android.m4b.maps.p110j.C5461u;
import com.google.android.m4b.maps.p110j.C5462v;
import com.google.android.m4b.maps.p111k.C5468c;
import java.util.Arrays;

/* renamed from: com.google.android.m4b.maps.t.a */
public final class C6770a implements C5468c {
    public static final C5520b CREATOR = new C5520b();
    /* renamed from: a */
    public final int f25336a;
    /* renamed from: b */
    public final String f25337b;
    /* renamed from: c */
    public final int f25338c;
    /* renamed from: d */
    public final int f25339d;
    /* renamed from: e */
    public final String f25340e;
    /* renamed from: f */
    public final String f25341f;
    /* renamed from: g */
    public final boolean f25342g;
    /* renamed from: h */
    public final String f25343h;
    /* renamed from: i */
    public final boolean f25344i;

    public final int describeContents() {
        return 0;
    }

    public C6770a(int i, String str, int i2, int i3, String str2, String str3, boolean z, String str4, boolean z2) {
        this.f25336a = i;
        this.f25337b = str;
        this.f25338c = i2;
        this.f25339d = i3;
        this.f25340e = str2;
        this.f25341f = str3;
        this.f25342g = z;
        this.f25343h = str4;
        this.f25344i = z2;
    }

    public C6770a(String str, int i, int i2, String str2, String str3, String str4, boolean z) {
        this.f25336a = 1;
        this.f25337b = (String) C5462v.m23767a((Object) str);
        this.f25338c = i;
        this.f25339d = i2;
        this.f25343h = str2;
        this.f25340e = str3;
        this.f25341f = str4;
        this.f25342g = z ^ 1;
        this.f25344i = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C5520b.m24028a(this, parcel);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f25336a), this.f25337b, Integer.valueOf(this.f25338c), Integer.valueOf(this.f25339d), this.f25343h, this.f25340e, this.f25341f, Boolean.valueOf(this.f25342g), Boolean.valueOf(this.f25344i)});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6770a)) {
            return false;
        }
        C6770a c6770a = (C6770a) obj;
        return this.f25336a == c6770a.f25336a && this.f25337b.equals(c6770a.f25337b) && this.f25338c == c6770a.f25338c && this.f25339d == c6770a.f25339d && C5461u.m23766a(this.f25343h, c6770a.f25343h) && C5461u.m23766a(this.f25340e, c6770a.f25340e) && C5461u.m23766a(this.f25341f, c6770a.f25341f) && this.f25342g == c6770a.f25342g && this.f25344i == c6770a.f25344i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PlayLoggerContext[");
        stringBuilder.append("versionCode=");
        stringBuilder.append(this.f25336a);
        stringBuilder.append(',');
        stringBuilder.append("package=");
        stringBuilder.append(this.f25337b);
        stringBuilder.append(',');
        stringBuilder.append("packageVersionCode=");
        stringBuilder.append(this.f25338c);
        stringBuilder.append(',');
        stringBuilder.append("logSource=");
        stringBuilder.append(this.f25339d);
        stringBuilder.append(',');
        stringBuilder.append("logSourceName=");
        stringBuilder.append(this.f25343h);
        stringBuilder.append(',');
        stringBuilder.append("uploadAccount=");
        stringBuilder.append(this.f25340e);
        stringBuilder.append(',');
        stringBuilder.append("loggingId=");
        stringBuilder.append(this.f25341f);
        stringBuilder.append(',');
        stringBuilder.append("logAndroidId=");
        stringBuilder.append(this.f25342g);
        stringBuilder.append(',');
        stringBuilder.append("isAnonymous=");
        stringBuilder.append(this.f25344i);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
