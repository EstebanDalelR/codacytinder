package com.tinder.analytics;

import android.support.annotation.NonNull;
import android.support.annotation.VisibleForTesting;
import android.text.TextUtils;
import com.leanplum.Leanplum;
import com.tinder.ads.source.dfp.DfpCustomTargetingValuesKt;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.networkperf.InstrumentationConstantsKt;
import com.tinder.auth.model.AuthType;
import com.tinder.utils.C15376y;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.tinder.analytics.k */
public class C6233k {
    /* renamed from: a */
    private Map<String, Object> f22801a = new ConcurrentHashMap();
    /* renamed from: b */
    private String f22802b;

    /* renamed from: a */
    void m26893a(@NonNull String str) {
        this.f22802b = C15376y.b(str);
        m26904d(this.f22802b);
        this.f22801a.put(InstrumentationConstantsKt.FIELD_UID, str);
    }

    /* renamed from: a */
    void m26889a() {
        if (!TextUtils.isEmpty(this.f22802b)) {
            if (!this.f22801a.isEmpty()) {
                if (Leanplum.hasStarted()) {
                    Leanplum.setUserAttributes(this.f22802b, this.f22801a);
                    this.f22801a.clear();
                }
            }
        }
    }

    /* renamed from: b */
    void m26895b() {
        m26904d(null);
        this.f22802b = null;
        this.f22801a.clear();
    }

    /* renamed from: b */
    void m26897b(String str) {
        this.f22801a.put("email", str);
    }

    /* renamed from: a */
    void m26894a(boolean z) {
        this.f22801a.put("settings_push", Boolean.valueOf(z));
    }

    /* renamed from: b */
    void m26898b(boolean z) {
        this.f22801a.put("new_matches_push", Boolean.valueOf(z));
    }

    /* renamed from: c */
    void m26902c(boolean z) {
        this.f22801a.put("messages_push", Boolean.valueOf(z));
    }

    /* renamed from: d */
    void m26905d(boolean z) {
        this.f22801a.put("message_like_push", Boolean.valueOf(z));
    }

    /* renamed from: e */
    void m26907e(boolean z) {
        this.f22801a.put("superlike_push", Boolean.valueOf(z));
    }

    /* renamed from: a */
    void m26890a(float f) {
        this.f22801a.put(ManagerWebServices.PARAM_DISTANCE_FILTER, Float.valueOf(f));
    }

    /* renamed from: f */
    void m26909f(boolean z) {
        this.f22801a.put("has_bio", Boolean.valueOf(z));
    }

    /* renamed from: a */
    void m26891a(int i) {
        this.f22801a.put("gender", Integer.valueOf(i));
    }

    /* renamed from: b */
    void m26896b(int i) {
        this.f22801a.put(ManagerWebServices.PARAM_GENDER_FILTER, Integer.valueOf(i));
    }

    /* renamed from: g */
    void m26911g(boolean z) {
        this.f22801a.put("has_custom_gender", Boolean.valueOf(z));
    }

    /* renamed from: c */
    void m26900c(int i) {
        this.f22801a.put(DfpCustomTargetingValuesKt.ADS_TARGETING_AGE, Integer.valueOf(i));
    }

    /* renamed from: h */
    void m26913h(boolean z) {
        this.f22801a.put("w1", Boolean.valueOf(z));
    }

    /* renamed from: i */
    void m26915i(boolean z) {
        this.f22801a.put("f1", Boolean.valueOf(z));
    }

    /* renamed from: j */
    void m26917j(boolean z) {
        this.f22801a.put("top_picks", Boolean.valueOf(z));
    }

    /* renamed from: d */
    void m26903d(int i) {
        this.f22801a.put("f2", Integer.valueOf(i));
    }

    /* renamed from: k */
    void m26918k(boolean z) {
        this.f22801a.put("w3", Boolean.valueOf(z));
    }

    /* renamed from: e */
    void m26906e(int i) {
        this.f22801a.put(ManagerWebServices.PARAM_LIKES_REMAINING, Integer.valueOf(i));
    }

    /* renamed from: l */
    void m26919l(boolean z) {
        this.f22801a.put("is_select", Boolean.valueOf(z));
    }

    /* renamed from: m */
    void m26920m(boolean z) {
        this.f22801a.put("spotify_connect", Boolean.valueOf(z));
    }

    /* renamed from: n */
    void m26921n(boolean z) {
        this.f22801a.put("anthem_connect", Boolean.valueOf(z));
    }

    /* renamed from: o */
    void m26922o(boolean z) {
        this.f22801a.put("smart_photos_connect", Boolean.valueOf(z));
    }

    /* renamed from: f */
    void m26908f(int i) {
        this.f22801a.put("b1", Integer.valueOf(i));
    }

    /* renamed from: c */
    void m26901c(String str) {
        this.f22801a.put("b2", str);
    }

    /* renamed from: g */
    void m26910g(int i) {
        this.f22801a.put("a1", Integer.valueOf(i));
    }

    /* renamed from: h */
    void m26912h(int i) {
        this.f22801a.put("a2", Integer.valueOf(i));
    }

    /* renamed from: p */
    void m26923p(boolean z) {
        this.f22801a.put("squads_discoverable", Boolean.valueOf(z));
    }

    /* renamed from: q */
    void m26924q(boolean z) {
        this.f22801a.put(ManagerWebServices.PARAM_DISCOVERABLE, Boolean.valueOf(z));
    }

    /* renamed from: r */
    void m26925r(boolean z) {
        this.f22801a.put("has_work", Boolean.valueOf(z));
    }

    /* renamed from: s */
    void m26926s(boolean z) {
        this.f22801a.put("has_education", Boolean.valueOf(z));
    }

    /* renamed from: t */
    void m26927t(boolean z) {
        this.f22801a.put("has_instagram", Boolean.valueOf(z));
    }

    /* renamed from: i */
    void m26914i(int i) {
        this.f22801a.put("paused_state", Integer.valueOf(i));
    }

    /* renamed from: u */
    void m26928u(boolean z) {
        this.f22801a.put("places_enabled", Boolean.valueOf(z));
    }

    /* renamed from: v */
    void m26929v(boolean z) {
        this.f22801a.put("places_available", Boolean.valueOf(z));
    }

    /* renamed from: j */
    void m26916j(int i) {
        this.f22801a.put("places_new_count", Integer.valueOf(i));
    }

    /* renamed from: a */
    void m26892a(AuthType authType) {
        this.f22801a.put("signup_source", authType.getKey());
    }

    /* renamed from: w */
    void m26930w(boolean z) {
        this.f22801a.put("has_snapchat", Boolean.valueOf(z));
    }

    /* renamed from: x */
    void m26931x(boolean z) {
        this.f22801a.put("has_bitmoji", Boolean.valueOf(z));
    }

    /* renamed from: c */
    void m26899c() {
        this.f22801a.put("likes_received", Integer.valueOf(0));
        this.f22801a.put("message_likes_received", Integer.valueOf(0));
        this.f22801a.put("messages_received", Integer.valueOf(0));
        this.f22801a.put("matches_received", Integer.valueOf(0));
    }

    @VisibleForTesting
    /* renamed from: d */
    void m26904d(String str) {
        Leanplum.setUserId(str);
    }
}
