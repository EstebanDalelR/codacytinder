package com.tinder.data.meta.p226a;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.api.model.profile.ProfileBoost;
import com.tinder.data.adapter.C2646o;
import com.tinder.domain.meta.model.BoostSettings;
import com.tinder.domain.meta.model.BoostSettings$Unit;
import java8.util.Objects;
import org.joda.time.DateTime;

/* renamed from: com.tinder.data.meta.a.a */
public class C10843a extends C2646o<BoostSettings, ProfileBoost> {
    /* renamed from: a */
    private static final BoostSettings$Unit f35460a = BoostSettings$Unit.WEEK;

    @Nullable
    /* renamed from: a */
    public BoostSettings m43307a(@NonNull ProfileBoost profileBoost) {
        int intValue = ((Integer) Objects.b(profileBoost.remaining(), Integer.valueOf(-1))).intValue();
        DateTime a = m43306a(profileBoost.resetAt());
        DateTime a2 = m43306a(profileBoost.expiredAt());
        String str = (String) Objects.b(profileBoost.boostId(), "");
        double doubleValue = ((Double) Objects.b(profileBoost.multiplier(), Double.valueOf(0.0d))).doubleValue();
        int intValue2 = ((Integer) Objects.b(profileBoost.refreshAmount(), Integer.valueOf(1))).intValue();
        int intValue3 = ((Integer) Objects.b(profileBoost.refreshInterval(), Integer.valueOf(1))).intValue();
        BoostSettings$Unit a3 = m43305a(profileBoost.refreshIntervalUnit());
        return BoostSettings.builder().remaining(intValue).resetAt(a).expireAt(a2).id(str).boostRefreshAmount(intValue2).boostRefreshInterval(intValue3).boostRefreshIntervalUnit(a3).multiplier(doubleValue).duration(((Long) Objects.b(profileBoost.duration(), Long.valueOf(0))).longValue()).build();
    }

    @android.support.annotation.NonNull
    /* renamed from: a */
    private com.tinder.domain.meta.model.BoostSettings$Unit m43305a(@android.support.annotation.Nullable java.lang.String r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = com.tinder.domain.meta.model.BoostSettings$Unit.from(r4);	 Catch:{ IllegalArgumentException -> 0x0005 }
        return r0;
    L_0x0005:
        r0 = "Cannot convert %s to Unit.";
        r1 = 1;
        r1 = new java.lang.Object[r1];
        r2 = 0;
        r1[r2] = r4;
        p000a.p001a.C0001a.e(r0, r1);
        r4 = f35460a;
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.meta.a.a.a(java.lang.String):com.tinder.domain.meta.model.BoostSettings$Unit");
    }

    @NonNull
    /* renamed from: a */
    private DateTime m43306a(@Nullable Long l) {
        if (l != null) {
            return new DateTime(l);
        }
        return DateTime.a();
    }
}
