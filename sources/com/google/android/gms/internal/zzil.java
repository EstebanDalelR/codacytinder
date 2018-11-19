package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.ar;
import java.util.List;

@zzzv
public final class zzil extends zzbfm {
    public static final Creator<zzil> CREATOR = new ahs();
    @Nullable
    public final String url;
    private long zzbay;
    private String zzbaz;
    private String zzbba;
    private String zzbbb;
    private Bundle zzbbc;
    private boolean zzbbd;
    private long zzbbe;

    zzil(@Nullable String str, long j, String str2, String str3, String str4, Bundle bundle, boolean z, long j2) {
        this.url = str;
        this.zzbay = j;
        if (str2 == null) {
            str2 = "";
        }
        this.zzbaz = str2;
        if (str3 == null) {
            str3 = "";
        }
        this.zzbba = str3;
        if (str4 == null) {
            str4 = "";
        }
        this.zzbbb = str4;
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.zzbbc = bundle;
        this.zzbbd = z;
        this.zzbbe = j2;
    }

    @Nullable
    public static zzil zzab(String str) {
        return zzd(Uri.parse(str));
    }

    @Nullable
    public static zzil zzd(Uri uri) {
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                int size = pathSegments.size();
                StringBuilder stringBuilder = new StringBuilder(62);
                stringBuilder.append("Expected 2 path parts for namespace and id, found :");
                stringBuilder.append(size);
                hx.m19916e(stringBuilder.toString());
                return null;
            }
            String str = (String) pathSegments.get(0);
            String str2 = (String) pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("url");
            boolean equals = "1".equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            long parseLong = queryParameter2 == null ? 0 : Long.parseLong(queryParameter2);
            Bundle bundle = new Bundle();
            for (String str3 : ar.g().mo6864a(uri)) {
                if (str3.startsWith("tag.")) {
                    bundle.putString(str3.substring(4), uri.getQueryParameter(str3));
                }
            }
            return new zzil(queryParameter, parseLong, host, str, str2, bundle, equals, 0);
        } catch (Throwable e) {
            hx.m19914c("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = oj.m20087a(parcel);
        oj.m20098a(parcel, 2, this.url, false);
        oj.m20092a(parcel, 3, this.zzbay);
        oj.m20098a(parcel, 4, this.zzbaz, false);
        oj.m20098a(parcel, 5, this.zzbba, false);
        oj.m20098a(parcel, 6, this.zzbbb, false);
        oj.m20093a(parcel, 7, this.zzbbc, false);
        oj.m20101a(parcel, 8, this.zzbbd);
        oj.m20092a(parcel, 9, this.zzbbe);
        oj.m20088a(parcel, i);
    }
}
