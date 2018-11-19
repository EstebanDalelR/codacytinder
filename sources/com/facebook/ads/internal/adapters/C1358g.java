package com.facebook.ads.internal.adapters;

import com.facebook.ads.internal.p042i.C1431a;
import com.facebook.ads.internal.server.AdPlacementType;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.internal.adapters.g */
public enum C1358g {
    ANBANNER(C4142j.class, C1357f.AN, AdPlacementType.BANNER),
    ANINTERSTITIAL(C4144l.class, C1357f.AN, AdPlacementType.INTERSTITIAL),
    ADMOBNATIVE(C4141d.class, C1357f.ADMOB, AdPlacementType.NATIVE),
    ANNATIVE(C4145n.class, C1357f.AN, AdPlacementType.NATIVE),
    ANINSTREAMVIDEO(C4143k.class, C1357f.AN, AdPlacementType.INSTREAM),
    ANREWARDEDVIDEO(C4146o.class, C1357f.AN, AdPlacementType.REWARDED_VIDEO),
    INMOBINATIVE(C4148s.class, C1357f.INMOBI, AdPlacementType.NATIVE),
    YAHOONATIVE(C4147p.class, C1357f.YAHOO, AdPlacementType.NATIVE);
    
    /* renamed from: m */
    private static List<C1358g> f3659m;
    /* renamed from: i */
    public Class<?> f3661i;
    /* renamed from: j */
    public String f3662j;
    /* renamed from: k */
    public C1357f f3663k;
    /* renamed from: l */
    public AdPlacementType f3664l;

    private C1358g(Class<?> cls, C1357f c1357f, AdPlacementType adPlacementType) {
        this.f3661i = cls;
        this.f3663k = c1357f;
        this.f3664l = adPlacementType;
    }

    /* renamed from: a */
    public static List<C1358g> m4751a() {
        if (f3659m == null) {
            synchronized (C1358g.class) {
                f3659m = new ArrayList();
                f3659m.add(ANBANNER);
                f3659m.add(ANINTERSTITIAL);
                f3659m.add(ANNATIVE);
                f3659m.add(ANINSTREAMVIDEO);
                f3659m.add(ANREWARDEDVIDEO);
                if (C1431a.m5002a(C1357f.YAHOO)) {
                    f3659m.add(YAHOONATIVE);
                }
                if (C1431a.m5002a(C1357f.INMOBI)) {
                    f3659m.add(INMOBINATIVE);
                }
                if (C1431a.m5002a(C1357f.ADMOB)) {
                    f3659m.add(ADMOBNATIVE);
                }
            }
        }
        return f3659m;
    }
}
