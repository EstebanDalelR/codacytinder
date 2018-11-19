package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C2507w;
import com.google.android.gms.internal.oj;
import com.google.android.gms.internal.zzbfm;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONObject;

public final class WebImage extends zzbfm {
    public static final Creator<WebImage> CREATOR = new C2496d();
    private final int zzalv;
    private final int zzalw;
    private int zzeck;
    private final Uri zzfap;

    WebImage(int i, Uri uri, int i2, int i3) {
        this.zzeck = i;
        this.zzfap = uri;
        this.zzalv = i2;
        this.zzalw = i3;
    }

    public WebImage(Uri uri) throws IllegalArgumentException {
        this(uri, 0, 0);
    }

    public WebImage(Uri uri, int i, int i2) throws IllegalArgumentException {
        this(1, uri, i, i2);
        if (uri == null) {
            throw new IllegalArgumentException("url cannot be null");
        }
        if (i >= 0) {
            if (i2 >= 0) {
                return;
            }
        }
        throw new IllegalArgumentException("width and height must not be negative");
    }

    public WebImage(JSONObject jSONObject) throws IllegalArgumentException {
        this(zzy(jSONObject), jSONObject.optInt("width", 0), jSONObject.optInt("height", 0));
    }

    private static android.net.Uri zzy(org.json.JSONObject r1) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r0 = "url";
        r0 = r1.has(r0);
        if (r0 == 0) goto L_0x0013;
    L_0x0008:
        r0 = "url";	 Catch:{ JSONException -> 0x0013 }
        r1 = r1.getString(r0);	 Catch:{ JSONException -> 0x0013 }
        r1 = android.net.Uri.parse(r1);	 Catch:{ JSONException -> 0x0013 }
        return r1;
    L_0x0013:
        r1 = 0;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.images.WebImage.zzy(org.json.JSONObject):android.net.Uri");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof WebImage)) {
            return false;
        }
        WebImage webImage = (WebImage) obj;
        return C2507w.m9173a(this.zzfap, webImage.zzfap) && this.zzalv == webImage.zzalv && this.zzalw == webImage.zzalw;
    }

    public final int getHeight() {
        return this.zzalw;
    }

    public final Uri getUrl() {
        return this.zzfap;
    }

    public final int getWidth() {
        return this.zzalv;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zzfap, Integer.valueOf(this.zzalv), Integer.valueOf(this.zzalw)});
    }

    public final org.json.JSONObject toJson() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r3 = this;
        r0 = new org.json.JSONObject;
        r0.<init>();
        r1 = "url";	 Catch:{ JSONException -> 0x001e }
        r2 = r3.zzfap;	 Catch:{ JSONException -> 0x001e }
        r2 = r2.toString();	 Catch:{ JSONException -> 0x001e }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x001e }
        r1 = "width";	 Catch:{ JSONException -> 0x001e }
        r2 = r3.zzalv;	 Catch:{ JSONException -> 0x001e }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x001e }
        r1 = "height";	 Catch:{ JSONException -> 0x001e }
        r2 = r3.zzalw;	 Catch:{ JSONException -> 0x001e }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x001e }
    L_0x001e:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.images.WebImage.toJson():org.json.JSONObject");
    }

    public final String toString() {
        return String.format(Locale.US, "Image %dx%d %s", new Object[]{Integer.valueOf(this.zzalv), Integer.valueOf(this.zzalw), this.zzfap.toString()});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = oj.a(parcel);
        oj.a(parcel, 1, this.zzeck);
        oj.a(parcel, 2, getUrl(), i, false);
        oj.a(parcel, 3, getWidth());
        oj.a(parcel, 4, getHeight());
        oj.a(parcel, a);
    }
}
