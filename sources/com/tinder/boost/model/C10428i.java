package com.tinder.boost.model;

import android.support.annotation.NonNull;
import com.google.gson.annotations.SerializedName;
import com.tinder.domain.boost.model.BoostStatus;
import com.tinder.domain.meta.model.BoostSettings$Unit;
import java.util.Locale;

/* renamed from: com.tinder.boost.model.i */
public class C10428i implements BoostStatus {
    @SerializedName("remaining")
    /* renamed from: a */
    private int f33996a;
    @SerializedName("resets_at")
    /* renamed from: b */
    private long f33997b;
    @SerializedName("expires_at")
    /* renamed from: c */
    private long f33998c;
    @SerializedName("boost_id")
    /* renamed from: d */
    private String f33999d;
    @SerializedName("multiplier")
    /* renamed from: e */
    private double f34000e;
    @SerializedName("boost_ended")
    /* renamed from: f */
    private boolean f34001f;
    @SerializedName("result_viewed_at")
    /* renamed from: g */
    private long f34002g;
    @SerializedName("still_in_boost")
    /* renamed from: h */
    private boolean f34003h;
    @SerializedName("consumed_from")
    /* renamed from: i */
    private int f34004i;
    @SerializedName("boost_refresh_amount")
    /* renamed from: j */
    private int f34005j;
    @SerializedName("boost_refresh_interval")
    /* renamed from: k */
    private int f34006k;
    @SerializedName("boost_refresh_interval_unit")
    /* renamed from: l */
    private String f34007l;

    public int getRemaining() {
        return this.f33996a;
    }

    public long getResetAt() {
        return this.f33997b;
    }

    public long getExpiresAt() {
        return this.f33998c;
    }

    public String getBoostId() {
        return this.f33999d;
    }

    public double getMultiplier() {
        return this.f34000e;
    }

    public boolean isBoostEnded() {
        return this.f34001f;
    }

    public long getResultViewedAt() {
        return this.f34002g;
    }

    public boolean isStillInBoost() {
        return this.f34003h;
    }

    public int getConsumedFrom() {
        return this.f34004i;
    }

    public int getRefreshAmount() {
        if (this.f34005j <= 0) {
            return 1;
        }
        return this.f34005j;
    }

    public int getRefreshInterval() {
        if (this.f34006k <= 0) {
            return 1;
        }
        return this.f34006k;
    }

    @NonNull
    public BoostSettings$Unit getRefreshIntervalUnit() {
        return BoostSettings$Unit.from(this.f34007l);
    }

    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof C10428i) {
                if (this.f33999d == null) {
                    return false;
                }
                return this.f33999d.equals(((BoostStatus) obj).getBoostId());
            }
        }
        return false;
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "remaining[%d] expires_at[%d] boost_id[%s]", new Object[]{Integer.valueOf(this.f33996a), Long.valueOf(this.f33998c), this.f33999d});
    }
}
