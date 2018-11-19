package com.tinder.passport.p093d;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.android.volley.C3001b;
import com.android.volley.Request;
import com.android.volley.Request.Priority;
import com.android.volley.VolleyError;
import com.google.android.m4b.maps.model.Marker;
import com.tinder.api.EnvironmentProvider;
import com.tinder.api.ManagerNetwork;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.PriorityJsonObjectRequestHeader;
import com.tinder.api.TinderApiClient;
import com.tinder.listeners.ListenerMapMarkerSearch;
import com.tinder.managers.C2652a;
import com.tinder.p071a.C3863f;
import com.tinder.p257g.C9647d;
import com.tinder.passport.model.C10043a;
import com.tinder.passport.model.C10044b;
import com.tinder.passport.model.PassportLocation;
import com.tinder.passport.p301b.C10038a;
import com.tinder.passport.provider.PassportLocationProvider;
import com.tinder.utils.ab;
import com.tinder.utils.ad;
import de.greenrobot.event.C2664c;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java8.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import p000a.p001a.C0001a;
import retrofit2.Response;
import rx.Observable;
import rx.subjects.PublishSubject;

/* renamed from: com.tinder.passport.d.a */
public class C3945a implements PassportLocationProvider {
    /* renamed from: a */
    private static final Pattern f12434a = Pattern.compile(" ", 16);
    /* renamed from: b */
    private static List<PassportLocation> f12435b;
    /* renamed from: c */
    private List<PassportLocation> f12436c = new ArrayList(0);
    @Nullable
    /* renamed from: d */
    private PassportLocation f12437d;
    /* renamed from: e */
    private C3863f f12438e;
    /* renamed from: f */
    private final ManagerWebServices f12439f;
    /* renamed from: g */
    private final ManagerNetwork f12440g;
    /* renamed from: h */
    private final C2664c f12441h;
    /* renamed from: i */
    private final PublishSubject<C10044b> f12442i;
    /* renamed from: j */
    private boolean f12443j;
    /* renamed from: k */
    private TinderApiClient f12444k;
    /* renamed from: l */
    private PriorityJsonObjectRequestHeader f12445l;
    /* renamed from: m */
    private PriorityJsonObjectRequestHeader f12446m;
    /* renamed from: n */
    private final EnvironmentProvider f12447n;

    /* renamed from: a */
    static final /* synthetic */ void m15062a(VolleyError volleyError) {
    }

    public C3945a(ManagerWebServices managerWebServices, ManagerNetwork managerNetwork, C2664c c2664c, TinderApiClient tinderApiClient, EnvironmentProvider environmentProvider) {
        this.f12440g = managerNetwork;
        f12435b = new ArrayList(0);
        this.f12438e = new C3863f();
        this.f12444k = tinderApiClient;
        this.f12439f = managerWebServices;
        this.f12441h = c2664c;
        this.f12442i = PublishSubject.w();
        this.f12447n = environmentProvider;
    }

    public Observable<C10044b> observeUpdates() {
        return this.f12442i.g().e();
    }

    public PassportLocation currentPassportLocation() {
        return this.f12437d;
    }

    @NonNull
    /* renamed from: a */
    public Observable<Response<C10043a>> m15068a() {
        return this.f12444k.getPopularLocations(ab.a());
    }

    /* renamed from: a */
    public rx.Observable<java.util.List<com.tinder.passport.model.PassportLocation>> m15069a(@android.support.annotation.NonNull java.lang.String r2, java.lang.Object r3) {
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
        r1 = this;
        r3 = "utf-8";	 Catch:{ UnsupportedEncodingException -> 0x0007 }
        r3 = java.net.URLEncoder.encode(r2, r3);	 Catch:{ UnsupportedEncodingException -> 0x0007 }
        goto L_0x0013;
    L_0x0007:
        r3 = f12434a;
        r2 = r3.matcher(r2);
        r3 = "+";
        r3 = r2.replaceAll(r3);
    L_0x0013:
        r2 = r1.f12444k;
        r0 = com.tinder.utils.ab.a();
        r2 = r2.searchLocation(r0, r3);
        r3 = com.tinder.passport.p093d.C13542b.f43262a;
        r2 = r2.k(r3);
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.passport.d.a.a(java.lang.String, java.lang.Object):rx.Observable<java.util.List<com.tinder.passport.model.PassportLocation>>");
    }

    /* renamed from: a */
    public void m15070a(double d, double d2, @NonNull ListenerMapMarkerSearch listenerMapMarkerSearch, Marker marker) {
        ListenerMapMarkerSearch listenerMapMarkerSearch2 = listenerMapMarkerSearch;
        Marker marker2 = marker;
        Locale locale = Locale.ENGLISH;
        ManagerWebServices managerWebServices = this.f12439f;
        String format = String.format(locale, ManagerWebServices.URL_LOCATION_GEO_SEARCH, new Object[]{ab.a(), Double.valueOf(d), Double.valueOf(d2)});
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("url ");
        stringBuilder.append(format);
        stringBuilder.append(" with lat ");
        stringBuilder.append(d);
        stringBuilder.append(" , ");
        stringBuilder.append(d2);
        ad.m10190a(stringBuilder.toString());
        Request priorityJsonObjectRequestHeader = new PriorityJsonObjectRequestHeader(Priority.IMMEDIATE, 0, format, null, new C12255c(listenerMapMarkerSearch2, marker2), new C12256d(listenerMapMarkerSearch2, marker2), C2652a.m10116a());
        priorityJsonObjectRequestHeader.setTag(marker2);
        priorityJsonObjectRequestHeader.setRetryPolicy(new C3001b());
        this.f12440g.addRequest(priorityJsonObjectRequestHeader);
    }

    /* renamed from: a */
    static final /* synthetic */ void m15064a(@NonNull ListenerMapMarkerSearch listenerMapMarkerSearch, Marker marker, JSONObject jSONObject) {
        ad.m10190a("ENTER ");
        ad.m10190a(jSONObject.toString());
        try {
            listenerMapMarkerSearch.onLocationMarkerResult(C9647d.a(jSONObject), marker);
        } catch (JSONObject jSONObject2) {
            ad.m10197c(jSONObject2.toString());
            listenerMapMarkerSearch.onLocationMarkerError(marker);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m15063a(@NonNull ListenerMapMarkerSearch listenerMapMarkerSearch, Marker marker, VolleyError volleyError) {
        ad.m10189a();
        listenerMapMarkerSearch.onLocationMarkerError(marker);
    }

    @Nullable
    /* renamed from: b */
    public PassportLocation m15074b() {
        return this.f12437d;
    }

    /* renamed from: a */
    public void m15071a(@Nullable PassportLocation passportLocation) {
        m15065a(passportLocation, true);
    }

    /* renamed from: b */
    public void m15075b(@Nullable PassportLocation passportLocation) {
        m15065a(passportLocation, false);
    }

    /* renamed from: c */
    public void m15077c(@Nullable PassportLocation passportLocation) {
        if (passportLocation != null) {
            long currentTimeMillis = System.currentTimeMillis();
            passportLocation.setLastSeenDate(currentTimeMillis);
            if (!this.f12438e.m14580a(passportLocation)) {
                this.f12438e.m14579a(passportLocation, currentTimeMillis);
            }
        }
    }

    /* renamed from: d */
    public void m15078d(@NonNull PassportLocation passportLocation) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ENTER ");
        stringBuilder.append(passportLocation.getLatitude());
        stringBuilder.append(" , ");
        stringBuilder.append(passportLocation.getLongitude());
        ad.m10190a(stringBuilder.toString());
        m15077c(passportLocation);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ManagerWebServices.PARAM_LAT, passportLocation.getLatitude());
            jSONObject.put(ManagerWebServices.PARAM_LON, passportLocation.getLongitude());
        } catch (JSONException e) {
            ad.m10197c(e.toString());
        }
        this.f12445l = new PriorityJsonObjectRequestHeader(Priority.IMMEDIATE, 1, ManagerWebServices.URL_PASSPORT_TRAVEL, jSONObject, new C12257e(this, passportLocation), C12258f.f39669a, C2652a.m10116a());
        this.f12445l.setTag("travel_request");
        this.f12445l.setRetryPolicy(new C3001b(ManagerWebServices.TIMEOUT_DEFAULT_MS, 0, 1.0f));
        this.f12440g.addRequest(this.f12445l);
    }

    /* renamed from: a */
    final /* synthetic */ void m15072a(@NonNull PassportLocation passportLocation, JSONObject jSONObject) {
        m15071a(passportLocation);
        if (this.f12436c.contains(passportLocation) == null) {
            this.f12436c.add(passportLocation);
        }
        this.f12441h.m10261e(new C10038a(null, true));
        this.f12443j = true;
    }

    /* renamed from: c */
    public void m15076c() {
        this.f12446m = new PriorityJsonObjectRequestHeader(Priority.IMMEDIATE, 1, ManagerWebServices.URL_PASSPORT_RESET, new JSONObject(), new C12259g(this), C12260h.f39671a, C2652a.m10116a());
        this.f12446m.setTag("travel_request");
        this.f12446m.setRetryPolicy(new C3001b(ManagerWebServices.TIMEOUT_DEFAULT_MS, 0, 1.0f));
        this.f12440g.addRequest(this.f12446m);
    }

    /* renamed from: a */
    final /* synthetic */ void m15073a(JSONObject jSONObject) {
        m15071a(null);
        this.f12441h.m10261e(new C10038a(null, true));
        this.f12443j = true;
    }

    /* renamed from: d */
    public boolean m15079d() {
        return this.f12437d != null;
    }

    @NonNull
    /* renamed from: a */
    public List<PassportLocation> m15067a(int i) {
        if (i < 1) {
            return new ArrayList(0);
        }
        List<PassportLocation> e = this.f12438e.m14583e();
        if (e.size() < i) {
            return e;
        }
        return e.subList(0, i);
    }

    /* renamed from: e */
    public void m15080e() {
        this.f12443j = false;
    }

    /* renamed from: f */
    public boolean m15081f() {
        return this.f12443j;
    }

    /* renamed from: a */
    private void m15065a(@Nullable PassportLocation passportLocation, boolean z) {
        C0001a.m25b("setActivePassportFromUserAction(): %s", passportLocation);
        if (!Objects.a(passportLocation, this.f12437d)) {
            C0001a.m25b("Notifying passport location update: %s", passportLocation);
            this.f12442i.onNext(new C10044b(passportLocation, z));
        }
        this.f12437d = passportLocation;
    }
}
