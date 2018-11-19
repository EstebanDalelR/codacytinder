package com.facebook.accountkit;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.facebook.accountkit.internal.C1251w;
import com.tinder.api.ManagerWebServices;
import java.util.Date;

public final class AccessToken implements Parcelable {
    public static final Creator<AccessToken> CREATOR = new C11811();
    private static final long DEFAULT_TOKEN_REFRESH_INTERVAL = 604800;
    private static final int PARCEL_VERSION = 2;
    private final String accountId;
    private final String applicationId;
    private final Date lastRefresh;
    private final String token;
    private final long tokenRefreshIntervalInSeconds;

    /* renamed from: com.facebook.accountkit.AccessToken$1 */
    static class C11811 implements Creator<AccessToken> {
        C11811() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m4105a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m4106a(i);
        }

        /* renamed from: a */
        public AccessToken m4105a(Parcel parcel) {
            return new AccessToken(parcel);
        }

        /* renamed from: a */
        public AccessToken[] m4106a(int i) {
            return new AccessToken[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public AccessToken(@NonNull String str, @NonNull String str2, @NonNull String str3, long j, @Nullable Date date) {
        this.token = str;
        this.accountId = str2;
        this.applicationId = str3;
        this.tokenRefreshIntervalInSeconds = j;
        if (date == null) {
            date = new Date();
        }
        this.lastRefresh = date;
    }

    public String getAccountId() {
        return this.accountId;
    }

    public String getApplicationId() {
        return this.applicationId;
    }

    public Date getLastRefresh() {
        return this.lastRefresh;
    }

    public String getToken() {
        return this.token;
    }

    public long getTokenRefreshIntervalSeconds() {
        return this.tokenRefreshIntervalInSeconds;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{AccessToken token:");
        stringBuilder.append(tokenToString());
        stringBuilder.append(" accountId:");
        stringBuilder.append(this.accountId);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessToken)) {
            return false;
        }
        AccessToken accessToken = (AccessToken) obj;
        if (this.tokenRefreshIntervalInSeconds != accessToken.tokenRefreshIntervalInSeconds || !C1251w.m4505b(this.accountId, accessToken.accountId) || !C1251w.m4505b(this.applicationId, accessToken.applicationId) || !C1251w.m4505b(this.lastRefresh, accessToken.lastRefresh) || C1251w.m4505b(this.token, accessToken.token) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((((((527 + C1251w.m4481a(this.accountId)) * 31) + C1251w.m4481a(this.applicationId)) * 31) + C1251w.m4481a(this.lastRefresh)) * 31) + C1251w.m4481a(this.token)) * 31) + C1251w.m4481a(Long.valueOf(this.tokenRefreshIntervalInSeconds));
    }

    private String tokenToString() {
        if (this.token == null) {
            return ManagerWebServices.NULL_STRING_VALUE;
        }
        return AccountKit.m4109a().m4130a(LoggingBehavior.INCLUDE_ACCESS_TOKENS) ? this.token : "ACCESS_TOKEN_REMOVED";
    }

    private AccessToken(android.os.Parcel r5) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r4 = this;
        r4.<init>();
        r0 = r5.readInt();	 Catch:{ ClassCastException -> 0x0008 }
        goto L_0x0009;
    L_0x0008:
        r0 = 1;
    L_0x0009:
        r1 = r5.readString();	 Catch:{ ClassCastException -> 0x000e }
        goto L_0x0015;
    L_0x000e:
        r5.readLong();
        r1 = r5.readString();
    L_0x0015:
        r4.token = r1;
        r1 = r5.readString();
        r4.accountId = r1;
        r1 = new java.util.Date;
        r2 = r5.readLong();
        r1.<init>(r2);
        r4.lastRefresh = r1;
        r1 = r5.readString();
        r4.applicationId = r1;
        r1 = 2;
        if (r0 != r1) goto L_0x0038;
    L_0x0031:
        r0 = r5.readLong();
        r4.tokenRefreshIntervalInSeconds = r0;
        goto L_0x003d;
    L_0x0038:
        r0 = 604800; // 0x93a80 float:8.47505E-40 double:2.98811E-318;
        r4.tokenRefreshIntervalInSeconds = r0;
    L_0x003d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.accountkit.AccessToken.<init>(android.os.Parcel):void");
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(2);
        parcel.writeString(this.token);
        parcel.writeString(this.accountId);
        parcel.writeLong(this.lastRefresh.getTime());
        parcel.writeString(this.applicationId);
        parcel.writeLong(this.tokenRefreshIntervalInSeconds);
    }
}
