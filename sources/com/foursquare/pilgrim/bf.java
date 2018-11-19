package com.foursquare.pilgrim;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import com.foursquare.api.Add3rdPartyCheckinParams;
import com.foursquare.api.FoursquareLocation;
import com.foursquare.api.PilgrimSearchParams;
import com.foursquare.api.types.Empty;
import com.foursquare.api.types.FoursquareType;
import com.foursquare.internal.network.C1920b;
import com.foursquare.internal.network.C1923d;
import com.foursquare.internal.network.p059a.C1918a;
import com.foursquare.internal.network.request.FoursquareRequest;
import com.foursquare.internal.network.request.FoursquareRequest.C1935a;
import com.foursquare.internal.p058a.C1912a;
import com.foursquare.internal.util.C1942d;
import com.foursquare.internal.util.C1948m;
import com.tinder.api.ManagerWebServices;
import java.util.Locale;

@WorkerThread
final class bf {
    @Nullable
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: a */
    private static bf f5356a;
    @NonNull
    /* renamed from: b */
    private final Context f5357b;
    @NonNull
    /* renamed from: c */
    private final String f5358c;
    @NonNull
    /* renamed from: d */
    private final String f5359d;

    @NonNull
    /* renamed from: a */
    public static bf m7089a() {
        return (bf) ah.m6918a(f5356a, "Requests instance was not set via Requests.init before calling");
    }

    /* renamed from: a */
    static void m7090a(@NonNull Context context) {
        PackageInfo a = C1971b.m7055a(context);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Android package info could not be found for ");
        stringBuilder.append(context.getPackageName());
        a = (PackageInfo) ah.m6918a(a, stringBuilder.toString());
        f5356a = new bf(context, a.versionName, String.valueOf(a.versionCode));
    }

    private bf(@NonNull Context context, @NonNull String str, @NonNull String str2) {
        this.f5357b = context.getApplicationContext();
        this.f5358c = str;
        this.f5359d = str2;
    }

    @NonNull
    /* renamed from: a */
    FoursquareRequest<Empty> m7091a(@NonNull Add3rdPartyCheckinParams add3rdPartyCheckinParams) {
        String str;
        switch (add3rdPartyCheckinParams.venueIdType()) {
            case FOURSQUARE:
                str = "venueId";
                break;
            case HARMONIZED_THIRD_PARTY:
                str = "partnerVenueId";
                break;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unexpected enum value ");
                stringBuilder.append(add3rdPartyCheckinParams.venueIdType());
                throw new IllegalStateException(stringBuilder.toString());
        }
        FoursquareLocation ll = add3rdPartyCheckinParams.ll();
        C1935a a = m7088a(Empty.class);
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("/v2/");
        stringBuilder2.append(C1920b.m6688a().m6698c());
        stringBuilder2.append("/pilgrim/locationscan");
        return a.m6780a(stringBuilder2.toString()).m6781a(str, add3rdPartyCheckinParams.venueId()).m6779a(ll).m6781a("now", String.valueOf(add3rdPartyCheckinParams.now().getTime() / 1000)).m6781a("pilgrimVisitId", add3rdPartyCheckinParams.pilgrimVisitId()).m6781a("wifiScan", add3rdPartyCheckinParams.wifiScan()).m6781a("llTimestamp", String.valueOf(ll.getTime())).m6783a();
    }

    /* renamed from: a */
    FoursquareRequest<Empty> m7095a(@NonNull String str, @NonNull VisitFeedback visitFeedback, String str2) {
        C1935a a = m7088a(Empty.class);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("/v2/");
        stringBuilder.append(C1920b.m6688a().m6698c());
        stringBuilder.append("/pilgrim/visits/");
        stringBuilder.append(str);
        stringBuilder.append("/update");
        return a.m6780a(stringBuilder.toString()).m6781a("feedback", visitFeedback.toString()).m6781a("actualVenueId", str2).m6783a();
    }

    /* renamed from: b */
    FoursquareRequest<Empty> m7099b() {
        C1935a a = m7088a(Empty.class);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("/v2/");
        stringBuilder.append(C1920b.m6688a().m6698c());
        stringBuilder.append("/pilgrim/install");
        return a.m6780a(stringBuilder.toString()).m6779a(C1912a.m6645a().m6646b()).m6783a();
    }

    /* renamed from: c */
    FoursquareRequest<C3549d> m7100c() {
        return m7098a(false, false);
    }

    /* renamed from: a */
    FoursquareRequest<C3549d> m7098a(boolean z, boolean z2) {
        String str = z ? "enable" : "disable";
        C1935a a = m7088a(C3549d.class);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("/v2/");
        stringBuilder.append(C1920b.m6688a().m6698c());
        stringBuilder.append("/pilgrim/");
        stringBuilder.append(str);
        C1935a a2 = a.m6780a(stringBuilder.toString());
        z = z && z2;
        return a2.m6782a(z, "firstEnable", String.valueOf(z2)).m6779a(C1912a.m6645a().m6646b()).m6783a();
    }

    /* renamed from: d */
    FoursquareRequest<Empty> m7101d() {
        C1935a a = m7088a(Empty.class);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("/v2/");
        stringBuilder.append(C1920b.m6688a().m6698c());
        stringBuilder.append("/pilgrim/clear");
        return a.m6780a(stringBuilder.toString()).m6783a();
    }

    /* renamed from: e */
    FoursquareRequest<C3549d> m7102e() {
        C1935a a = m7088a(C3549d.class);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("/v2/");
        stringBuilder.append(C1920b.m6688a().m6698c());
        stringBuilder.append("/pilgrim/stillsailing");
        return a.m6780a(stringBuilder.toString()).m6779a(C1912a.m6645a().m6646b()).m6783a();
    }

    /* renamed from: a */
    FoursquareRequest<Empty> m7096a(String str, String str2) {
        C1935a a = m7088a(Empty.class);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("/v2/");
        stringBuilder.append(C1920b.m6688a().m6698c());
        stringBuilder.append("/pilgrim/event/report");
        return a.m6780a(stringBuilder.toString()).m6781a("events", str).m6781a("debugSymbolsUuid", str2).m6783a();
    }

    /* renamed from: a */
    FoursquareRequest<ay> m7093a(bm bmVar) {
        PilgrimUserInfo g = PilgrimSdk.get().f5255c.m6998g();
        C1935a a = m7088a(ay.class);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("/v2/");
        stringBuilder.append(C1920b.m6688a().m6698c());
        stringBuilder.append("/pilgrim/visits/add");
        String str = null;
        a = a.m6780a(stringBuilder.toString()).m6779a(bmVar.f5373a).m6781a("timestamp", String.valueOf(bmVar.f5373a.getTime())).m6781a("arrival", String.valueOf(bmVar.f5374b.getArrival())).m6781a("departure", String.valueOf(bmVar.f5374b.getDeparture())).m6781a("now", String.valueOf(System.currentTimeMillis())).m6781a("elapsedRealtimeNanos", String.valueOf(bmVar.f5373a.getElapsedRealtimeNanos())).m6781a("venueId", bmVar.f5374b.getVenue() == null ? null : bmVar.f5374b.getVenue().getId()).m6781a("locationType", bmVar.f5377e).m6781a("batteryStatus", bmVar.f5379g).m6781a("batteryStrength", String.valueOf(bmVar.f5378f)).m6781a("limitAdsTracking", Boolean.toString(bmVar.f5381i)).m6781a("pilgrimVisitId", bmVar.f5374b.getPilgrimVisitId());
        String str2 = "confidence";
        if (bmVar.f5374b.getConfidence() != null) {
            str = bmVar.f5374b.getConfidence().toString();
        }
        C1935a a2 = a.m6781a(str2, str).m6782a(TextUtils.isEmpty(bmVar.f5375c) ^ 1, "wifiScan", bmVar.f5375c).m6781a("arrivalLL", C1918a.m6681a(bmVar.f5374b.getLocation())).m6781a("arrivalLLHacc", C1918a.m6682b(bmVar.f5374b.getLocation())).m6781a("userInfo", ap.m6950a(g)).m6782a(TextUtils.isEmpty(bmVar.f5380h) ^ 1, "regionLL", bmVar.f5380h).m6782a(C1942d.m6824b(), "skipLogging", "true");
        if (bmVar.f5376d) {
            al.m6933a(a2, bmVar.f5373a, 1440);
        }
        return a2.m6783a();
    }

    /* renamed from: a */
    FoursquareRequest<bk> m7094a(String str, @NonNull Confidence confidence, @NonNull RegionType regionType, boolean z) {
        regionType = regionType.toString().toLowerCase(Locale.US);
        if (!TextUtils.isEmpty(str)) {
            regionType = "venue";
        }
        C1935a a = m7088a(bk.class);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("/v2/");
        stringBuilder.append(C1920b.m6688a().m6698c());
        stringBuilder.append("/pilgrim/config/test");
        return a.m6780a(stringBuilder.toString()).m6781a("venueId", str).m6781a("confidence", confidence.toString()).m6781a("locationType", regionType).m6781a("visitType", z ? "departure" : "arrival").m6783a();
    }

    @NonNull
    /* renamed from: a */
    FoursquareRequest<Empty> m7097a(@NonNull Throwable th, @NonNull String str) {
        C1935a a = m7088a(Empty.class);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("/v2/");
        stringBuilder.append(C1920b.m6688a().m6698c());
        stringBuilder.append("/pilgrim/exceptions/add");
        return a.m6780a(stringBuilder.toString()).m6781a("message", th.getMessage()).m6781a("stacktrace", C1948m.m6842a(th)).m6781a("breadcrumbs", str).m6783a();
    }

    @NonNull
    /* renamed from: a */
    FoursquareRequest<aw> m7092a(@NonNull PilgrimSearchParams pilgrimSearchParams) {
        C1935a a = m7088a(aw.class);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("/v2/");
        stringBuilder.append(C1920b.m6688a().m6698c());
        stringBuilder.append("/pilgrim/search");
        a = a.m6780a(stringBuilder.toString()).m6779a(pilgrimSearchParams.location()).m6781a("timestamp", String.valueOf(pilgrimSearchParams.location().getTime())).m6781a("now", String.valueOf(pilgrimSearchParams.now())).m6781a("elapsedRealtimeNanos", String.valueOf(pilgrimSearchParams.elapsedRealtimeNanos())).m6781a(ManagerWebServices.PARAM_LIMIT, String.valueOf(pilgrimSearchParams.limit())).m6781a("wifiScan", pilgrimSearchParams.wifiScan()).m6781a("limitAdsTracking", String.valueOf(pilgrimSearchParams.limitAdsTracking())).m6781a("checksum", pilgrimSearchParams.checksum()).m6781a("hasHomeWork", String.valueOf(pilgrimSearchParams.hasHomeWork())).m6781a("userInfo", ap.m6950a(pilgrimSearchParams.userInfo())).m6781a("locationType", pilgrimSearchParams.locationType().toString()).m6781a("nearbyTriggers", pilgrimSearchParams.nearbyTriggers()).m6781a("connectedSsid", C1923d.m6723a().m6738c()).m6782a(pilgrimSearchParams.skipLogging(), "skipLogging", String.valueOf(pilgrimSearchParams.skipLogging()));
        al.m6933a(a, pilgrimSearchParams.location(), 1440);
        return a.m6783a();
    }

    /* renamed from: a */
    private <T extends FoursquareType> C1935a<T> m7088a(@NonNull Class<T> cls) {
        return new C1935a(cls).m6781a("adId", al.m6931a(this.f5357b)).m6781a("installId", PilgrimSdk.getPilgrimInstallId()).m6781a("appVersion", this.f5358c).m6781a("appBuild", this.f5359d);
    }
}
