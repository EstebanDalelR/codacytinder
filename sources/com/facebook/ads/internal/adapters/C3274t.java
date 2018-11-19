package com.facebook.ads.internal.adapters;

import android.content.Context;
import android.os.Bundle;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.internal.p041h.C1425f;
import com.facebook.ads.internal.p047k.ag;
import com.facebook.ads.internal.server.AdPlacementType;
import com.facebook.ads.p033a.C1341a;
import java.util.EnumSet;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.adapters.t */
public abstract class C3274t implements AdAdapter, ag<Bundle> {
    /* renamed from: a */
    public abstract void mo3329a(Context context, C1341a c1341a, Map<String, Object> map, C1425f c1425f, EnumSet<CacheFlag> enumSet);

    /* renamed from: e */
    public abstract boolean mo3330e();

    public AdPlacementType getPlacementType() {
        return AdPlacementType.INSTREAM;
    }
}
