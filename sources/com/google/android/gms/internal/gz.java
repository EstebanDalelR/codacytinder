package com.google.android.gms.internal;

import java.util.Map;

public final class gz extends aom<amz> {
    /* renamed from: a */
    private final iw<amz> f23311a;
    /* renamed from: b */
    private final Map<String, String> f23312b;
    /* renamed from: c */
    private final hq f23313c;

    public gz(String str, iw<amz> iwVar) {
        this(str, null, iwVar);
    }

    private gz(String str, Map<String, String> map, iw<amz> iwVar) {
        super(0, str, new ha(iwVar));
        this.f23312b = null;
        this.f23311a = iwVar;
        this.f23313c = new hq();
        this.f23313c.m19903a(str, "GET", null, null);
    }

    /* renamed from: a */
    protected final asu<amz> mo4623a(amz amz) {
        return asu.m19470a(amz, lh.m20028a(amz));
    }

    /* renamed from: a */
    protected final /* synthetic */ void mo4624a(Object obj) {
        amz amz = (amz) obj;
        this.f23313c.m19906a(amz.f15515c, amz.f15513a);
        hq hqVar = this.f23313c;
        byte[] bArr = amz.f15514b;
        if (hq.m19901c() && bArr != null) {
            hqVar.m19907a(bArr);
        }
        this.f23311a.m27364b(amz);
    }
}
