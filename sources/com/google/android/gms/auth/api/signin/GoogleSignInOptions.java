package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.internal.C2454o;
import com.google.android.gms.auth.api.signin.internal.zzn;
import com.google.android.gms.common.api.Api.ApiOptions.Optional;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.internal.oj;
import com.google.android.gms.internal.zzbfm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GoogleSignInOptions extends zzbfm implements Optional, ReflectedParcelable {
    public static final Creator<GoogleSignInOptions> CREATOR = new C2449e();
    public static final GoogleSignInOptions DEFAULT_GAMES_SIGN_IN = new C2445a().m8810a(SCOPE_GAMES_LITE, new Scope[0]).m8812c();
    public static final GoogleSignInOptions DEFAULT_SIGN_IN = new C2445a().m8809a().m8811b().m8812c();
    public static final Scope SCOPE_GAMES = new Scope("https://www.googleapis.com/auth/games");
    public static final Scope SCOPE_GAMES_LITE = new Scope("https://www.googleapis.com/auth/games_lite");
    public static final Scope zzehi = new Scope("profile");
    public static final Scope zzehj = new Scope("email");
    public static final Scope zzehk = new Scope("openid");
    private static Comparator<Scope> zzehr = new C2448d();
    private int versionCode;
    private Account zzebz;
    private boolean zzefl;
    private String zzefm;
    private final ArrayList<Scope> zzehl;
    private final boolean zzehm;
    private final boolean zzehn;
    private String zzeho;
    private ArrayList<zzn> zzehp;
    private Map<Integer, zzn> zzehq;

    /* renamed from: com.google.android.gms.auth.api.signin.GoogleSignInOptions$a */
    public static final class C2445a {
        /* renamed from: a */
        private Set<Scope> f7382a = new HashSet();
        /* renamed from: b */
        private boolean f7383b;
        /* renamed from: c */
        private boolean f7384c;
        /* renamed from: d */
        private boolean f7385d;
        /* renamed from: e */
        private String f7386e;
        /* renamed from: f */
        private Account f7387f;
        /* renamed from: g */
        private String f7388g;
        /* renamed from: h */
        private Map<Integer, zzn> f7389h = new HashMap();

        public C2445a(@NonNull GoogleSignInOptions googleSignInOptions) {
            ad.m9045a((Object) googleSignInOptions);
            this.f7382a = new HashSet(googleSignInOptions.zzehl);
            this.f7383b = googleSignInOptions.zzehm;
            this.f7384c = googleSignInOptions.zzehn;
            this.f7385d = googleSignInOptions.zzefl;
            this.f7386e = googleSignInOptions.zzefm;
            this.f7387f = googleSignInOptions.zzebz;
            this.f7388g = googleSignInOptions.zzeho;
            this.f7389h = GoogleSignInOptions.zzx(googleSignInOptions.zzehp);
        }

        /* renamed from: a */
        public final C2445a m8809a() {
            this.f7382a.add(GoogleSignInOptions.zzehk);
            return this;
        }

        /* renamed from: a */
        public final C2445a m8810a(Scope scope, Scope... scopeArr) {
            this.f7382a.add(scope);
            this.f7382a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        /* renamed from: b */
        public final C2445a m8811b() {
            this.f7382a.add(GoogleSignInOptions.zzehi);
            return this;
        }

        /* renamed from: c */
        public final GoogleSignInOptions m8812c() {
            if (this.f7382a.contains(GoogleSignInOptions.SCOPE_GAMES) && this.f7382a.contains(GoogleSignInOptions.SCOPE_GAMES_LITE)) {
                this.f7382a.remove(GoogleSignInOptions.SCOPE_GAMES_LITE);
            }
            if (this.f7385d && (this.f7387f == null || !this.f7382a.isEmpty())) {
                m8809a();
            }
            return new GoogleSignInOptions(new ArrayList(this.f7382a), this.f7387f, this.f7385d, this.f7383b, this.f7384c, this.f7386e, this.f7388g, this.f7389h);
        }
    }

    GoogleSignInOptions(int i, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, ArrayList<zzn> arrayList2) {
        this(i, (ArrayList) arrayList, account, z, z2, z3, str, str2, zzx(arrayList2));
    }

    private GoogleSignInOptions(int i, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map<Integer, zzn> map) {
        this.versionCode = i;
        this.zzehl = arrayList;
        this.zzebz = account;
        this.zzefl = z;
        this.zzehm = z2;
        this.zzehn = z3;
        this.zzefm = str;
        this.zzeho = str2;
        this.zzehp = new ArrayList(map.values());
        this.zzehq = map;
    }

    private final JSONObject toJsonObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.zzehl, zzehr);
            ArrayList arrayList = this.zzehl;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                jSONArray.put(((Scope) obj).zzagw());
            }
            jSONObject.put("scopes", jSONArray);
            if (this.zzebz != null) {
                jSONObject.put("accountName", this.zzebz.name);
            }
            jSONObject.put("idTokenRequested", this.zzefl);
            jSONObject.put("forceCodeForRefreshToken", this.zzehn);
            jSONObject.put("serverAuthRequested", this.zzehm);
            if (!TextUtils.isEmpty(this.zzefm)) {
                jSONObject.put("serverClientId", this.zzefm);
            }
            if (!TextUtils.isEmpty(this.zzeho)) {
                jSONObject.put("hostedDomain", this.zzeho);
            }
            return jSONObject;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    @Nullable
    public static GoogleSignInOptions zzev(@Nullable String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        Collection hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        Object optString = jSONObject.optString("accountName", null);
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(optString) ? new Account(optString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.optString("serverClientId", null), jSONObject.optString("hostedDomain", null), new HashMap());
    }

    private static Map<Integer, zzn> zzx(@Nullable List<zzn> list) {
        Map<Integer, zzn> hashMap = new HashMap();
        if (list == null) {
            return hashMap;
        }
        for (zzn zzn : list) {
            hashMap.put(Integer.valueOf(zzn.getType()), zzn);
        }
        return hashMap;
    }

    public boolean equals(java.lang.Object r4) {
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
        r0 = 0;
        if (r4 != 0) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4;	 Catch:{ ClassCastException -> 0x0076 }
        r1 = r3.zzehp;	 Catch:{ ClassCastException -> 0x0076 }
        r1 = r1.size();	 Catch:{ ClassCastException -> 0x0076 }
        if (r1 > 0) goto L_0x0076;	 Catch:{ ClassCastException -> 0x0076 }
    L_0x000e:
        r1 = r4.zzehp;	 Catch:{ ClassCastException -> 0x0076 }
        r1 = r1.size();	 Catch:{ ClassCastException -> 0x0076 }
        if (r1 <= 0) goto L_0x0017;	 Catch:{ ClassCastException -> 0x0076 }
    L_0x0016:
        return r0;	 Catch:{ ClassCastException -> 0x0076 }
    L_0x0017:
        r1 = r3.zzehl;	 Catch:{ ClassCastException -> 0x0076 }
        r1 = r1.size();	 Catch:{ ClassCastException -> 0x0076 }
        r2 = r4.zzabe();	 Catch:{ ClassCastException -> 0x0076 }
        r2 = r2.size();	 Catch:{ ClassCastException -> 0x0076 }
        if (r1 != r2) goto L_0x0076;	 Catch:{ ClassCastException -> 0x0076 }
    L_0x0027:
        r1 = r3.zzehl;	 Catch:{ ClassCastException -> 0x0076 }
        r2 = r4.zzabe();	 Catch:{ ClassCastException -> 0x0076 }
        r1 = r1.containsAll(r2);	 Catch:{ ClassCastException -> 0x0076 }
        if (r1 != 0) goto L_0x0034;	 Catch:{ ClassCastException -> 0x0076 }
    L_0x0033:
        return r0;	 Catch:{ ClassCastException -> 0x0076 }
    L_0x0034:
        r1 = r3.zzebz;	 Catch:{ ClassCastException -> 0x0076 }
        if (r1 != 0) goto L_0x003d;	 Catch:{ ClassCastException -> 0x0076 }
    L_0x0038:
        r1 = r4.zzebz;	 Catch:{ ClassCastException -> 0x0076 }
        if (r1 != 0) goto L_0x0076;	 Catch:{ ClassCastException -> 0x0076 }
    L_0x003c:
        goto L_0x0047;	 Catch:{ ClassCastException -> 0x0076 }
    L_0x003d:
        r1 = r3.zzebz;	 Catch:{ ClassCastException -> 0x0076 }
        r2 = r4.zzebz;	 Catch:{ ClassCastException -> 0x0076 }
        r1 = r1.equals(r2);	 Catch:{ ClassCastException -> 0x0076 }
        if (r1 == 0) goto L_0x0076;	 Catch:{ ClassCastException -> 0x0076 }
    L_0x0047:
        r1 = r3.zzefm;	 Catch:{ ClassCastException -> 0x0076 }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ ClassCastException -> 0x0076 }
        if (r1 == 0) goto L_0x0058;	 Catch:{ ClassCastException -> 0x0076 }
    L_0x004f:
        r1 = r4.zzefm;	 Catch:{ ClassCastException -> 0x0076 }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ ClassCastException -> 0x0076 }
        if (r1 == 0) goto L_0x0076;	 Catch:{ ClassCastException -> 0x0076 }
    L_0x0057:
        goto L_0x0062;	 Catch:{ ClassCastException -> 0x0076 }
    L_0x0058:
        r1 = r3.zzefm;	 Catch:{ ClassCastException -> 0x0076 }
        r2 = r4.zzefm;	 Catch:{ ClassCastException -> 0x0076 }
        r1 = r1.equals(r2);	 Catch:{ ClassCastException -> 0x0076 }
        if (r1 == 0) goto L_0x0076;	 Catch:{ ClassCastException -> 0x0076 }
    L_0x0062:
        r1 = r3.zzehn;	 Catch:{ ClassCastException -> 0x0076 }
        r2 = r4.zzehn;	 Catch:{ ClassCastException -> 0x0076 }
        if (r1 != r2) goto L_0x0076;	 Catch:{ ClassCastException -> 0x0076 }
    L_0x0068:
        r1 = r3.zzefl;	 Catch:{ ClassCastException -> 0x0076 }
        r2 = r4.zzefl;	 Catch:{ ClassCastException -> 0x0076 }
        if (r1 != r2) goto L_0x0076;	 Catch:{ ClassCastException -> 0x0076 }
    L_0x006e:
        r1 = r3.zzehm;	 Catch:{ ClassCastException -> 0x0076 }
        r4 = r4.zzehm;	 Catch:{ ClassCastException -> 0x0076 }
        if (r1 != r4) goto L_0x0076;
    L_0x0074:
        r4 = 1;
        return r4;
    L_0x0076:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public final Account getAccount() {
        return this.zzebz;
    }

    public Scope[] getScopeArray() {
        return (Scope[]) this.zzehl.toArray(new Scope[this.zzehl.size()]);
    }

    public final String getServerClientId() {
        return this.zzefm;
    }

    public int hashCode() {
        Object arrayList = new ArrayList();
        ArrayList arrayList2 = this.zzehl;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            arrayList.add(((Scope) obj).zzagw());
        }
        Collections.sort(arrayList);
        return new C2454o().m8826a(arrayList).m8826a(this.zzebz).m8826a(this.zzefm).m8827a(this.zzehn).m8827a(this.zzefl).m8827a(this.zzehm).m8825a();
    }

    public final boolean isIdTokenRequested() {
        return this.zzefl;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = oj.a(parcel);
        oj.a(parcel, 1, this.versionCode);
        oj.c(parcel, 2, zzabe(), false);
        oj.a(parcel, 3, this.zzebz, i, false);
        oj.a(parcel, 4, this.zzefl);
        oj.a(parcel, 5, this.zzehm);
        oj.a(parcel, 6, this.zzehn);
        oj.a(parcel, 7, this.zzefm, false);
        oj.a(parcel, 8, this.zzeho, false);
        oj.c(parcel, 9, this.zzehp, false);
        oj.a(parcel, a);
    }

    public final ArrayList<Scope> zzabe() {
        return new ArrayList(this.zzehl);
    }

    public final boolean zzabf() {
        return this.zzehm;
    }

    public final String zzabg() {
        return toJsonObject().toString();
    }
}
