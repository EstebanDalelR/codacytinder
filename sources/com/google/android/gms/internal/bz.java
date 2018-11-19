package com.google.android.gms.internal;

import com.google.android.gms.ads.reward.RewardItem;

@zzzv
public final class bz implements RewardItem {
    /* renamed from: a */
    private final zzadh f23235a;

    public bz(zzadh zzadh) {
        this.f23235a = zzadh;
    }

    public final int getAmount() {
        if (this.f23235a == null) {
            return 0;
        }
        try {
            return this.f23235a.getAmount();
        } catch (Throwable e) {
            hx.m19914c("Could not forward getAmount to RewardItem", e);
            return 0;
        }
    }

    public final String getType() {
        if (this.f23235a == null) {
            return null;
        }
        try {
            return this.f23235a.getType();
        } catch (Throwable e) {
            hx.m19914c("Could not forward getType to RewardItem", e);
            return null;
        }
    }
}
