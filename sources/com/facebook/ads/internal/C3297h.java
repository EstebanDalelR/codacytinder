package com.facebook.ads.internal;

import android.content.Context;
import android.os.Handler;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AdSize;
import com.facebook.ads.NativeAd.MediaCacheFlag;
import com.facebook.ads.internal.adapters.AdAdapter;
import com.facebook.ads.internal.adapters.C1356e;
import com.facebook.ads.internal.adapters.C1369z;
import com.facebook.ads.internal.adapters.C3276y;
import com.facebook.ads.internal.p037d.C1389a;
import com.facebook.ads.internal.p040g.C1405a;
import com.facebook.ads.internal.p040g.C1409d;
import com.facebook.ads.internal.p040g.C1413g;
import com.facebook.ads.internal.p040g.C1416i;
import com.facebook.ads.internal.p041h.C3288g;
import com.facebook.ads.internal.p047k.C1495k;
import com.facebook.ads.internal.p047k.C1504q;
import com.facebook.ads.internal.p047k.af;
import com.facebook.ads.internal.p047k.ao;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.C1520a;
import com.facebook.ads.internal.protocol.C1521b;
import com.facebook.ads.internal.protocol.C1522c;
import com.facebook.ads.internal.server.AdPlacementType;
import com.facebook.ads.internal.server.C1527a;
import com.facebook.ads.internal.server.C1527a.C1526a;
import com.facebook.ads.internal.server.C3323f;
import com.tinder.api.ManagerWebServices;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.h */
public class C3297h implements C1526a {
    /* renamed from: a */
    private final Context f10066a;
    /* renamed from: b */
    private final String f10067b;
    /* renamed from: c */
    private final C1527a f10068c;
    /* renamed from: d */
    private final C1522c f10069d;
    /* renamed from: e */
    private final C1521b f10070e;
    /* renamed from: f */
    private final AdSize f10071f;
    /* renamed from: g */
    private final int f10072g;
    /* renamed from: h */
    private boolean f10073h = true;
    /* renamed from: i */
    private final Handler f10074i = new Handler();
    /* renamed from: j */
    private final Runnable f10075j = new C3283b(this);
    /* renamed from: k */
    private C1419a f10076k;
    /* renamed from: l */
    private C1409d f10077l;

    /* renamed from: com.facebook.ads.internal.h$a */
    public interface C1419a {
        /* renamed from: a */
        void mo1688a(C1373b c1373b);

        /* renamed from: a */
        void mo1689a(List<C3276y> list);
    }

    /* renamed from: com.facebook.ads.internal.h$b */
    private static final class C3283b extends ao<C3297h> {
        public C3283b(C3297h c3297h) {
            super(c3297h);
        }

        public void run() {
            C3297h c3297h = (C3297h) m5207a();
            if (c3297h != null) {
                if (C1504q.m5292a(c3297h.f10066a)) {
                    c3297h.m12721a();
                } else {
                    c3297h.f10074i.postDelayed(c3297h.f10075j, 5000);
                }
            }
        }
    }

    public C3297h(Context context, String str, C1522c c1522c, AdSize adSize, C1521b c1521b, int i, EnumSet<MediaCacheFlag> enumSet) {
        this.f10066a = context;
        this.f10067b = str;
        this.f10069d = c1522c;
        this.f10071f = adSize;
        this.f10070e = c1521b;
        this.f10072g = i;
        this.f10068c = new C1527a(context);
        this.f10068c.m5382a((C1526a) this);
        C1389a.m4826a(context).m4827a();
    }

    /* renamed from: d */
    private List<C3276y> m12720d() {
        C1409d c1409d = this.f10077l;
        final List<C3276y> arrayList = new ArrayList(c1409d.m4898c());
        for (C1405a d = c1409d.m4899d(); d != null; d = c1409d.m4899d()) {
            AdAdapter a = C1356e.m4747a(d.m4888a(), AdPlacementType.NATIVE);
            if (a != null && a.getPlacementType() == AdPlacementType.NATIVE) {
                Map hashMap = new HashMap();
                hashMap.put(ManagerWebServices.FB_DATA, d.m4890b());
                hashMap.put("definition", c1409d.m4895a());
                ((C3276y) a).mo3297a(this.f10066a, new C1369z(this) {
                    /* renamed from: b */
                    final /* synthetic */ C3297h f10054b;

                    /* renamed from: a */
                    public void mo1675a(C3276y c3276y) {
                        arrayList.add(c3276y);
                    }

                    /* renamed from: a */
                    public void mo1676a(C3276y c3276y, AdError adError) {
                    }

                    /* renamed from: b */
                    public void mo1677b(C3276y c3276y) {
                    }

                    /* renamed from: c */
                    public void mo1678c(C3276y c3276y) {
                    }
                }, C3288g.m12671a(this.f10066a), hashMap);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void m12721a() {
        try {
            this.f10068c.m5381a(new C1413g(this.f10066a, new C1416i(this.f10066a, false), this.f10067b, this.f10071f, this.f10069d, this.f10070e, this.f10072g, AdSettings.isTestMode(this.f10066a), new C1495k(this.f10066a, null, null, null), af.m5178a(this.f10066a)));
        } catch (C1520a e) {
            mo1715a(C1373b.m4794a(e));
        }
    }

    /* renamed from: a */
    public void mo1715a(C1373b c1373b) {
        if (this.f10073h) {
            this.f10074i.postDelayed(this.f10075j, 1800000);
        }
        if (this.f10076k != null) {
            this.f10076k.mo1688a(c1373b);
        }
    }

    /* renamed from: a */
    public void m12723a(C1419a c1419a) {
        this.f10076k = c1419a;
    }

    /* renamed from: a */
    public void mo1716a(C3323f c3323f) {
        C1409d a = c3323f.mo1784a();
        if (a == null) {
            throw new IllegalStateException("no placement in response");
        }
        if (this.f10073h) {
            long c = a.m4895a().m4903c();
            if (c == 0) {
                c = 1800000;
            }
            this.f10074i.postDelayed(this.f10075j, c);
        }
        this.f10077l = a;
        List d = m12720d();
        if (this.f10076k != null) {
            if (d.isEmpty()) {
                this.f10076k.mo1688a(C1373b.m4793a(AdErrorType.NO_FILL, ""));
                return;
            }
            this.f10076k.mo1689a(d);
        }
    }

    /* renamed from: b */
    public void m12725b() {
    }

    /* renamed from: c */
    public void m12726c() {
        this.f10073h = false;
        this.f10074i.removeCallbacks(this.f10075j);
    }
}
