package com.foursquare.pilgrim;

import android.util.Pair;
import com.foursquare.api.FoursquareLocation;
import com.foursquare.api.types.Venue;
import com.foursquare.internal.network.C1932g;
import com.foursquare.pilgrim.PilgrimSdk.LogLevel;
import java.util.List;

/* renamed from: com.foursquare.pilgrim.w */
final class C1991w {
    /* renamed from: a */
    private final String f5390a;
    /* renamed from: b */
    private final boolean f5391b;
    /* renamed from: c */
    private final C1988b f5392c;
    /* renamed from: d */
    private final C1990d f5393d;
    /* renamed from: e */
    private final ak f5394e;
    /* renamed from: f */
    private final C1987a f5395f;
    /* renamed from: g */
    private final C1989c f5396g;
    /* renamed from: h */
    private final C1986v f5397h;

    /* renamed from: com.foursquare.pilgrim.w$a */
    interface C1987a {
        /* renamed from: a */
        void mo2064a(PilgrimSdkBackfillNotification pilgrimSdkBackfillNotification);
    }

    /* renamed from: com.foursquare.pilgrim.w$b */
    interface C1988b {
        /* renamed from: a */
        List<Pair<CurrentPlace, FoursquareLocation>> mo2060a();

        /* renamed from: a */
        void mo2061a(long j);

        /* renamed from: b */
        void mo2062b();
    }

    /* renamed from: com.foursquare.pilgrim.w$c */
    interface C1989c {
        /* renamed from: a */
        void mo2065a(LogLevel logLevel, String str);
    }

    /* renamed from: com.foursquare.pilgrim.w$d */
    interface C1990d {
        /* renamed from: a */
        List<ai> mo2063a();
    }

    C1991w(String str, boolean z, C1988b c1988b, C1990d c1990d, ak akVar, C1987a c1987a, C1989c c1989c, C1986v c1986v) {
        this.f5390a = str;
        this.f5391b = z;
        this.f5392c = c1988b;
        this.f5393d = c1990d;
        this.f5394e = akVar;
        this.f5395f = c1987a;
        this.f5396g = c1989c;
        this.f5397h = c1986v;
    }

    /* renamed from: a */
    void m7174a() {
        List a = this.f5392c.mo2060a();
        if (a.size() > 10) {
            a = a.subList(0, 10);
        } else {
            a.size();
        }
        List list = null;
        for (Pair pair : r2) {
            if (list == null) {
                list = r1.f5393d.mo2063a();
            }
            ai a2 = bb.m7070a(list, ((CurrentPlace) pair.first).getLocation());
            RegionType regionType = RegionType.NONE;
            if (a2 != null && a2.f5292d.isHomeOrWork()) {
                regionType = a2.f5292d;
            }
            ((CurrentPlace) pair.first).m6861a(regionType);
            ((CurrentPlace) pair.first).m6860a(regionType.isHomeOrWork() ? Confidence.HIGH : Confidence.NONE);
            try {
                C1932g a3 = r1.f5394e.mo2047a((FoursquareLocation) pair.second, (CurrentPlace) pair.first, ((CurrentPlace) pair.first).m6857a(), false, r1.f5390a, r1.f5391b);
                if (a3 == null || a3.m6772b() == null || a3.m6772b().getMeta() == null || a3.m6772b().getMeta().getCode() != 403) {
                    if (!(r1.f5395f == null || a3 == null)) {
                        if (a3.m6774c() != null) {
                            r1.f5392c.mo2061a(((CurrentPlace) pair.first).getArrival());
                            ay ayVar = (ay) a3.m6774c();
                            Venue i = ayVar.m16801i();
                            RegionType h = ayVar.m16800h();
                            long arrival = ((CurrentPlace) pair.first).getArrival();
                            Confidence g = ayVar.m16799g();
                            String e = ayVar.m16797e();
                            FoursquareLocation location = ((CurrentPlace) pair.first).getLocation();
                            String a4 = ((CurrentPlace) pair.first).m6857a();
                            List k = ayVar.m16803k();
                            boolean j = ayVar.m16802j();
                            CurrentPlace currentPlace = r6;
                            CurrentPlace currentPlace2 = new CurrentPlace(i, h, arrival, g, e, location, a4, k, j);
                            r1.f5396g.mo2065a(LogLevel.DEBUG, "Sending backfilled visit notification");
                            r1.f5395f.mo2064a(new PilgrimSdkBackfillNotification(currentPlace));
                        }
                    }
                    return;
                }
                PilgrimSdk.get().log(LogLevel.ERROR, "Your application is not authorized to use the Pilgrim SDK.");
                r1.f5392c.mo2062b();
                return;
            } catch (Exception e2) {
                r1.f5397h.reportException(e2);
            }
        }
    }
}
