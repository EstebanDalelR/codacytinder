package com.facebook.ads.internal.adapters;

import android.content.Context;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.server.AdPlacementType;
import java.util.Map;

public abstract class aa implements AdAdapter {
    /* renamed from: a */
    protected RewardData f9967a;
    /* renamed from: b */
    protected int f9968b;

    /* renamed from: a */
    public void m12519a(int i) {
        this.f9968b = i;
    }

    /* renamed from: a */
    public abstract void mo3334a(Context context, ab abVar, Map<String, Object> map, boolean z);

    /* renamed from: a */
    public void m12521a(RewardData rewardData) {
        this.f9967a = rewardData;
    }

    /* renamed from: b */
    public abstract int mo3335b();

    /* renamed from: c */
    public abstract boolean mo3336c();

    public AdPlacementType getPlacementType() {
        return AdPlacementType.REWARDED_VIDEO;
    }
}
