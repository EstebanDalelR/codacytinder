package com.facebook;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.facebook.internal.C1749x;
import com.facebook.internal.Utility;
import com.facebook.internal.Utility.GraphMeRequestWithCacheCallback;
import com.google.android.exoplayer2.Format;
import com.tinder.api.ManagerWebServices;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class AccessToken implements Parcelable {
    public static final String ACCESS_TOKEN_KEY = "access_token";
    private static final String APPLICATION_ID_KEY = "application_id";
    public static final Creator<AccessToken> CREATOR = new C11642();
    private static final int CURRENT_JSON_FORMAT = 1;
    private static final String DECLINED_PERMISSIONS_KEY = "declined_permissions";
    private static final AccessTokenSource DEFAULT_ACCESS_TOKEN_SOURCE = AccessTokenSource.FACEBOOK_APPLICATION_WEB;
    private static final Date DEFAULT_EXPIRATION_TIME = MAX_DATE;
    private static final Date DEFAULT_LAST_REFRESH_TIME = new Date();
    private static final String EXPIRES_AT_KEY = "expires_at";
    public static final String EXPIRES_IN_KEY = "expires_in";
    private static final String LAST_REFRESH_KEY = "last_refresh";
    private static final Date MAX_DATE = new Date(Format.OFFSET_SAMPLE_RELATIVE);
    private static final String PERMISSIONS_KEY = "permissions";
    private static final String SOURCE_KEY = "source";
    private static final String TOKEN_KEY = "token";
    public static final String USER_ID_KEY = "user_id";
    private static final String VERSION_KEY = "version";
    private final String applicationId;
    private final Set<String> declinedPermissions;
    private final Date expires;
    private final Date lastRefresh;
    private final Set<String> permissions;
    private final AccessTokenSource source;
    private final String token;
    private final String userId;

    /* renamed from: com.facebook.AccessToken$2 */
    static class C11642 implements Creator {
        C11642() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m3966a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m3967a(i);
        }

        /* renamed from: a */
        public AccessToken m3966a(Parcel parcel) {
            return new AccessToken(parcel);
        }

        /* renamed from: a */
        public AccessToken[] m3967a(int i) {
            return new AccessToken[i];
        }
    }

    public interface AccessTokenCreationCallback {
        void onError(FacebookException facebookException);

        void onSuccess(AccessToken accessToken);
    }

    public interface AccessTokenRefreshCallback {
        void OnTokenRefreshFailed(FacebookException facebookException);

        void OnTokenRefreshed(AccessToken accessToken);
    }

    public int describeContents() {
        return 0;
    }

    public AccessToken(String str, String str2, String str3, @Nullable Collection<String> collection, @Nullable Collection<String> collection2, @Nullable AccessTokenSource accessTokenSource, @Nullable Date date, @Nullable Date date2) {
        C1749x.m6065a(str, "accessToken");
        C1749x.m6065a(str2, "applicationId");
        C1749x.m6065a(str3, ManagerWebServices.PARAM_USER_ID);
        if (date == null) {
            date = DEFAULT_EXPIRATION_TIME;
        }
        this.expires = date;
        this.permissions = Collections.unmodifiableSet(collection != null ? new HashSet(collection) : new HashSet());
        this.declinedPermissions = Collections.unmodifiableSet(collection2 != null ? new HashSet(collection2) : new HashSet());
        this.token = str;
        if (accessTokenSource == null) {
            accessTokenSource = DEFAULT_ACCESS_TOKEN_SOURCE;
        }
        this.source = accessTokenSource;
        if (date2 == null) {
            date2 = DEFAULT_LAST_REFRESH_TIME;
        }
        this.lastRefresh = date2;
        this.applicationId = str2;
        this.userId = str3;
    }

    public static AccessToken getCurrentAccessToken() {
        return C1662b.m5631a().m5642b();
    }

    public static boolean isCurrentAccessTokenActive() {
        AccessToken b = C1662b.m5631a().m5642b();
        return (b == null || b.isExpired()) ? false : true;
    }

    static void expireCurrentAccessToken() {
        AccessToken b = C1662b.m5631a().m5642b();
        if (b != null) {
            setCurrentAccessToken(createExpired(b));
        }
    }

    public static void setCurrentAccessToken(AccessToken accessToken) {
        C1662b.m5631a().m5641a(accessToken);
    }

    public static void refreshCurrentAccessTokenAsync() {
        C1662b.m5631a().m5640a(null);
    }

    public static void refreshCurrentAccessTokenAsync(AccessTokenRefreshCallback accessTokenRefreshCallback) {
        C1662b.m5631a().m5640a(accessTokenRefreshCallback);
    }

    public String getToken() {
        return this.token;
    }

    public Date getExpires() {
        return this.expires;
    }

    public Set<String> getPermissions() {
        return this.permissions;
    }

    public Set<String> getDeclinedPermissions() {
        return this.declinedPermissions;
    }

    public AccessTokenSource getSource() {
        return this.source;
    }

    public Date getLastRefresh() {
        return this.lastRefresh;
    }

    public String getApplicationId() {
        return this.applicationId;
    }

    public String getUserId() {
        return this.userId;
    }

    public static void createFromNativeLinkingIntent(Intent intent, final String str, final AccessTokenCreationCallback accessTokenCreationCallback) {
        C1749x.m6064a((Object) intent, "intent");
        if (intent.getExtras() == null) {
            accessTokenCreationCallback.onError(new FacebookException("No extras found on intent"));
            return;
        }
        final Bundle bundle = new Bundle(intent.getExtras());
        String string = bundle.getString("access_token");
        if (string != null) {
            if (!string.isEmpty()) {
                String string2 = bundle.getString("user_id");
                if (string2 != null) {
                    if (!string2.isEmpty()) {
                        accessTokenCreationCallback.onSuccess(createFromBundle(null, bundle, AccessTokenSource.FACEBOOK_APPLICATION_WEB, new Date(), str));
                        return;
                    }
                }
                Utility.m5776a(string, new GraphMeRequestWithCacheCallback() {
                    public void onSuccess(org.json.JSONObject r6) {
                        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                        /*
                        r5 = this;
                        r0 = "id";	 Catch:{ JSONException -> 0x0023 }
                        r6 = r6.getString(r0);	 Catch:{ JSONException -> 0x0023 }
                        r0 = r0;	 Catch:{ JSONException -> 0x0023 }
                        r1 = "user_id";	 Catch:{ JSONException -> 0x0023 }
                        r0.putString(r1, r6);	 Catch:{ JSONException -> 0x0023 }
                        r6 = r5;	 Catch:{ JSONException -> 0x0023 }
                        r0 = 0;	 Catch:{ JSONException -> 0x0023 }
                        r1 = r0;	 Catch:{ JSONException -> 0x0023 }
                        r2 = com.facebook.AccessTokenSource.FACEBOOK_APPLICATION_WEB;	 Catch:{ JSONException -> 0x0023 }
                        r3 = new java.util.Date;	 Catch:{ JSONException -> 0x0023 }
                        r3.<init>();	 Catch:{ JSONException -> 0x0023 }
                        r4 = r4;	 Catch:{ JSONException -> 0x0023 }
                        r0 = com.facebook.AccessToken.createFromBundle(r0, r1, r2, r3, r4);	 Catch:{ JSONException -> 0x0023 }
                        r6.onSuccess(r0);	 Catch:{ JSONException -> 0x0023 }
                        goto L_0x002f;
                    L_0x0023:
                        r6 = r5;
                        r0 = new com.facebook.FacebookException;
                        r1 = "Unable to generate access token due to missing user id";
                        r0.<init>(r1);
                        r6.onError(r0);
                    L_0x002f:
                        return;
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.facebook.AccessToken.1.onSuccess(org.json.JSONObject):void");
                    }

                    public void onFailure(FacebookException facebookException) {
                        accessTokenCreationCallback.onError(facebookException);
                    }
                });
                return;
            }
        }
        accessTokenCreationCallback.onError(new FacebookException("No access token found on intent"));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{AccessToken");
        stringBuilder.append(" token:");
        stringBuilder.append(tokenToString());
        appendPermissions(stringBuilder);
        stringBuilder.append("}");
        return stringBuilder.toString();
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
        r1 = r5 instanceof com.facebook.AccessToken;
        r2 = 0;
        if (r1 != 0) goto L_0x000a;
    L_0x0009:
        return r2;
    L_0x000a:
        r5 = (com.facebook.AccessToken) r5;
        r1 = r4.expires;
        r3 = r5.expires;
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0062;
    L_0x0016:
        r1 = r4.permissions;
        r3 = r5.permissions;
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0062;
    L_0x0020:
        r1 = r4.declinedPermissions;
        r3 = r5.declinedPermissions;
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0062;
    L_0x002a:
        r1 = r4.token;
        r3 = r5.token;
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0062;
    L_0x0034:
        r1 = r4.source;
        r3 = r5.source;
        if (r1 != r3) goto L_0x0062;
    L_0x003a:
        r1 = r4.lastRefresh;
        r3 = r5.lastRefresh;
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0062;
    L_0x0044:
        r1 = r4.applicationId;
        if (r1 != 0) goto L_0x004d;
    L_0x0048:
        r1 = r5.applicationId;
        if (r1 != 0) goto L_0x0062;
    L_0x004c:
        goto L_0x0057;
    L_0x004d:
        r1 = r4.applicationId;
        r3 = r5.applicationId;
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0062;
    L_0x0057:
        r1 = r4.userId;
        r5 = r5.userId;
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x0062;
    L_0x0061:
        goto L_0x0063;
    L_0x0062:
        r0 = 0;
    L_0x0063:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.AccessToken.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return ((((((((((((((527 + this.expires.hashCode()) * 31) + this.permissions.hashCode()) * 31) + this.declinedPermissions.hashCode()) * 31) + this.token.hashCode()) * 31) + this.source.hashCode()) * 31) + this.lastRefresh.hashCode()) * 31) + (this.applicationId == null ? 0 : this.applicationId.hashCode())) * 31) + this.userId.hashCode();
    }

    @SuppressLint({"FieldGetter"})
    static AccessToken createFromRefresh(AccessToken accessToken, Bundle bundle) {
        if (accessToken.source == AccessTokenSource.FACEBOOK_APPLICATION_WEB || accessToken.source == AccessTokenSource.FACEBOOK_APPLICATION_NATIVE || accessToken.source == AccessTokenSource.FACEBOOK_APPLICATION_SERVICE) {
            Date a = Utility.m5766a(bundle, "expires_in", new Date(0));
            String string = bundle.getString("access_token");
            if (Utility.m5785a(string) != null) {
                return null;
            }
            return new AccessToken(string, accessToken.applicationId, accessToken.getUserId(), accessToken.getPermissions(), accessToken.getDeclinedPermissions(), accessToken.source, a, new Date());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid token source: ");
        stringBuilder.append(accessToken.source);
        throw new FacebookException(stringBuilder.toString());
    }

    static AccessToken createExpired(AccessToken accessToken) {
        return new AccessToken(accessToken.token, accessToken.applicationId, accessToken.getUserId(), accessToken.getPermissions(), accessToken.getDeclinedPermissions(), accessToken.source, new Date(), new Date());
    }

    static com.facebook.AccessToken createFromLegacyCache(android.os.Bundle r10) {
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
        r0 = "com.facebook.TokenCachingStrategy.Permissions";
        r5 = getPermissionsFromBundle(r10, r0);
        r0 = "com.facebook.TokenCachingStrategy.DeclinedPermissions";
        r6 = getPermissionsFromBundle(r10, r0);
        r0 = com.facebook.C1681f.m5694d(r10);
        r1 = com.facebook.internal.Utility.m5785a(r0);
        if (r1 == 0) goto L_0x001a;
    L_0x0016:
        r0 = com.facebook.FacebookSdk.m3998i();
    L_0x001a:
        r3 = r0;
        r2 = com.facebook.C1681f.m5692b(r10);
        r0 = com.facebook.internal.Utility.m5801d(r2);
        r1 = "id";	 Catch:{ JSONException -> 0x0040 }
        r4 = r0.getString(r1);	 Catch:{ JSONException -> 0x0040 }
        r0 = new com.facebook.AccessToken;
        r7 = com.facebook.C1681f.m5693c(r10);
        r1 = "com.facebook.TokenCachingStrategy.ExpirationDate";
        r8 = com.facebook.C1681f.m5689a(r10, r1);
        r1 = "com.facebook.TokenCachingStrategy.LastRefreshDate";
        r9 = com.facebook.C1681f.m5689a(r10, r1);
        r1 = r0;
        r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9);
        return r0;
    L_0x0040:
        r10 = 0;
        return r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.AccessToken.createFromLegacyCache(android.os.Bundle):com.facebook.AccessToken");
    }

    static List<String> getPermissionsFromBundle(Bundle bundle, String str) {
        bundle = bundle.getStringArrayList(str);
        if (bundle == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(new ArrayList(bundle));
    }

    public boolean isExpired() {
        return new Date().after(this.expires);
    }

    JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(VERSION_KEY, 1);
        jSONObject.put("token", this.token);
        jSONObject.put("expires_at", this.expires.getTime());
        jSONObject.put(PERMISSIONS_KEY, new JSONArray(this.permissions));
        jSONObject.put(DECLINED_PERMISSIONS_KEY, new JSONArray(this.declinedPermissions));
        jSONObject.put(LAST_REFRESH_KEY, this.lastRefresh.getTime());
        jSONObject.put("source", this.source.name());
        jSONObject.put(APPLICATION_ID_KEY, this.applicationId);
        jSONObject.put("user_id", this.userId);
        return jSONObject;
    }

    static AccessToken createFromJSONObject(JSONObject jSONObject) throws JSONException {
        if (jSONObject.getInt(VERSION_KEY) > 1) {
            throw new FacebookException("Unknown AccessToken serialization format.");
        }
        String string = jSONObject.getString("token");
        Date date = new Date(jSONObject.getLong("expires_at"));
        JSONArray jSONArray = jSONObject.getJSONArray(PERMISSIONS_KEY);
        JSONArray jSONArray2 = jSONObject.getJSONArray(DECLINED_PERMISSIONS_KEY);
        Date date2 = new Date(jSONObject.getLong(LAST_REFRESH_KEY));
        return new AccessToken(string, jSONObject.getString(APPLICATION_ID_KEY), jSONObject.getString("user_id"), Utility.m5768a(jSONArray), Utility.m5768a(jSONArray2), AccessTokenSource.valueOf(jSONObject.getString("source")), date, date2);
    }

    private static AccessToken createFromBundle(List<String> list, Bundle bundle, AccessTokenSource accessTokenSource, Date date, String str) {
        String string = bundle.getString("access_token");
        Date a = Utility.m5766a(bundle, "expires_in", date);
        String string2 = bundle.getString("user_id");
        if (Utility.m5785a(string) == null) {
            if (a != null) {
                return new AccessToken(string, str, string2, list, null, accessTokenSource, a, new Date());
            }
        }
        return null;
    }

    private String tokenToString() {
        if (this.token == null) {
            return ManagerWebServices.NULL_STRING_VALUE;
        }
        return FacebookSdk.m3986a(LoggingBehavior.INCLUDE_ACCESS_TOKENS) ? this.token : "ACCESS_TOKEN_REMOVED";
    }

    private void appendPermissions(StringBuilder stringBuilder) {
        stringBuilder.append(" permissions:");
        if (this.permissions == null) {
            stringBuilder.append(ManagerWebServices.NULL_STRING_VALUE);
            return;
        }
        stringBuilder.append("[");
        stringBuilder.append(TextUtils.join(", ", this.permissions));
        stringBuilder.append("]");
    }

    AccessToken(Parcel parcel) {
        this.expires = new Date(parcel.readLong());
        Collection arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        this.permissions = Collections.unmodifiableSet(new HashSet(arrayList));
        arrayList.clear();
        parcel.readStringList(arrayList);
        this.declinedPermissions = Collections.unmodifiableSet(new HashSet(arrayList));
        this.token = parcel.readString();
        this.source = AccessTokenSource.valueOf(parcel.readString());
        this.lastRefresh = new Date(parcel.readLong());
        this.applicationId = parcel.readString();
        this.userId = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.expires.getTime());
        parcel.writeStringList(new ArrayList(this.permissions));
        parcel.writeStringList(new ArrayList(this.declinedPermissions));
        parcel.writeString(this.token);
        parcel.writeString(this.source.name());
        parcel.writeLong(this.lastRefresh.getTime());
        parcel.writeString(this.applicationId);
        parcel.writeString(this.userId);
    }
}
