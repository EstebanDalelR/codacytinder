package com.tinder.p238f.p239a;

import android.text.TextUtils;
import com.tinder.analytics.C2634g;
import com.tinder.api.ManagerWebServices;
import com.tinder.auth.interactor.C8279j;
import com.tinder.auth.model.AuthType;
import com.tinder.bitmoji.C10376d;
import com.tinder.bitmoji.C10377f;
import com.tinder.domain.common.model.Subscription;
import com.tinder.domain.config.TopPicksConfig;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import com.tinder.domain.fastmatch.provider.FastMatchStatusProvider;
import com.tinder.enums.Gender;
import com.tinder.managers.bk;
import com.tinder.model.Career;
import com.tinder.model.InstagramDataSet;
import com.tinder.model.User;
import com.tinder.model.UserMeta;
import com.tinder.tinderplus.p428a.C15193i;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001BO\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u000e\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u001eJ\u0010\u0010!\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\u0006\u0010\"\u001a\u00020\u0016R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/tinder/meta/analytics/CrmAttributesReporter;", "", "tinderPlusInteractor", "Lcom/tinder/tinderplus/interactors/TinderPlusInteractor;", "sharedPreferences", "Lcom/tinder/managers/ManagerSharedPreferences;", "crmUserAttributeTracker", "Lcom/tinder/analytics/CrmUserAttributeTracker;", "fastMatchConfigProvider", "Lcom/tinder/domain/fastmatch/provider/FastMatchConfigProvider;", "fastMatchStatusProvider", "Lcom/tinder/domain/fastmatch/provider/FastMatchStatusProvider;", "topPicksConfig", "Lcom/tinder/domain/config/TopPicksConfig;", "authInteractor", "Lcom/tinder/auth/interactor/AuthInteractor2;", "checkBitmojiConnected", "Lcom/tinder/bitmoji/CheckBitmojiConnected;", "checkUserBitmojiAvatarAvailable", "Lcom/tinder/bitmoji/CheckUserBitmojiAvatarAvailable;", "(Lcom/tinder/tinderplus/interactors/TinderPlusInteractor;Lcom/tinder/managers/ManagerSharedPreferences;Lcom/tinder/analytics/CrmUserAttributeTracker;Lcom/tinder/domain/fastmatch/provider/FastMatchConfigProvider;Lcom/tinder/domain/fastmatch/provider/FastMatchStatusProvider;Lcom/tinder/domain/config/TopPicksConfig;Lcom/tinder/auth/interactor/AuthInteractor2;Lcom/tinder/bitmoji/CheckBitmojiConnected;Lcom/tinder/bitmoji/CheckUserBitmojiAvatarAvailable;)V", "reportFastMatchAttributes", "", "userMeta", "Lcom/tinder/model/UserMeta;", "reportFastMatchPushNotificationFrequency", "newFrequency", "", "reportPlacesAvailable", "isPlacesAvailable", "", "reportPlacesEnabled", "isPlacesEnabled", "reportUserAttributes", "sendPendingChanges", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.f.a.a */
public final class C9363a {
    /* renamed from: a */
    private final C15193i f31418a;
    /* renamed from: b */
    private final bk f31419b;
    /* renamed from: c */
    private final C2634g f31420c;
    /* renamed from: d */
    private final FastMatchConfigProvider f31421d;
    /* renamed from: e */
    private final FastMatchStatusProvider f31422e;
    /* renamed from: f */
    private final TopPicksConfig f31423f;
    /* renamed from: g */
    private final C8279j f31424g;
    /* renamed from: h */
    private final C10376d f31425h;
    /* renamed from: i */
    private final C10377f f31426i;

    @Inject
    public C9363a(@NotNull C15193i c15193i, @NotNull bk bkVar, @NotNull C2634g c2634g, @NotNull FastMatchConfigProvider fastMatchConfigProvider, @NotNull FastMatchStatusProvider fastMatchStatusProvider, @NotNull TopPicksConfig topPicksConfig, @NotNull C8279j c8279j, @NotNull C10376d c10376d, @NotNull C10377f c10377f) {
        C2668g.b(c15193i, "tinderPlusInteractor");
        C2668g.b(bkVar, "sharedPreferences");
        C2668g.b(c2634g, "crmUserAttributeTracker");
        C2668g.b(fastMatchConfigProvider, "fastMatchConfigProvider");
        C2668g.b(fastMatchStatusProvider, "fastMatchStatusProvider");
        C2668g.b(topPicksConfig, "topPicksConfig");
        C2668g.b(c8279j, "authInteractor");
        C2668g.b(c10376d, "checkBitmojiConnected");
        C2668g.b(c10377f, "checkUserBitmojiAvatarAvailable");
        this.f31418a = c15193i;
        this.f31419b = bkVar;
        this.f31420c = c2634g;
        this.f31421d = fastMatchConfigProvider;
        this.f31422e = fastMatchStatusProvider;
        this.f31423f = topPicksConfig;
        this.f31424g = c8279j;
        this.f31425h = c10376d;
        this.f31426i = c10377f;
    }

    /* renamed from: a */
    public final void m39205a() {
        this.f31420c.a();
    }

    /* renamed from: a */
    public final void m39206a(int i) {
        this.f31420c.d(i);
    }

    /* renamed from: a */
    public final void m39208a(boolean z) {
        this.f31420c.s(z);
    }

    /* renamed from: b */
    public final void m39209b(boolean z) {
        this.f31420c.t(z);
    }

    /* renamed from: a */
    public final void m39207a(@Nullable UserMeta userMeta) {
        if (userMeta != null) {
            User user = userMeta.getUser();
            C2634g c2634g = this.f31420c;
            C2668g.a(user, ManagerWebServices.PARAM_USER);
            c2634g.a(user.getId());
            c2634g.a(this.f31419b.C());
            c2634g.b(this.f31419b.h());
            c2634g.c(this.f31419b.i());
            c2634g.d(this.f31419b.j());
            c2634g.e(this.f31419b.e());
            c2634g.a((float) user.getDistanceFilter());
            boolean z = true;
            c2634g.f(TextUtils.isEmpty(user.getBio()) ^ true);
            Gender gender = user.getGender();
            if (gender != null) {
                c2634g.a(gender.getBackendId());
                c2634g.g(TextUtils.isEmpty(gender.getMoreGender()) ^ true);
            }
            c2634g.b(user.getSeekGender());
            c2634g.c(user.getAgeInt());
            c2634g.h(this.f31418a.a());
            c2634g.l(user.isTinderSelectMember());
            c2634g.m(user.isSpotifyConnected());
            c2634g.n(user.hasSpotifyAnthemConnected());
            c2634g.o(this.f31419b.S());
            c2634g.f(user.getPhotoCount());
            c2634g.c(user.getCreateDate());
            c2634g.g(user.getAgeFilterMin());
            c2634g.h(user.getAgeFilterMax());
            c2634g.q(user.isDiscoverable());
            AuthType a = this.f31424g.m35341a();
            if (a != null) {
                c2634g.a(a);
            }
            if (this.f31423f.isEnabled()) {
                c2634g.j(true);
            }
            Career career = user.getCareer();
            C2668g.a(career, "career");
            if (career.getMyJob() == null) {
                z = false;
            }
            c2634g.w(z);
            c2634g.r(career.hasDisplayedSchool());
            InstagramDataSet instagramDataSet = user.getInstagramDataSet();
            if (instagramDataSet != null) {
                c2634g.d(instagramDataSet.username);
            }
            c2634g.p(userMeta.isSquadsDiscoverable());
            c2634g.u(this.f31425h.m42204a().booleanValue());
            c2634g.v(this.f31426i.m42205a().booleanValue());
            m39204b(userMeta);
        }
    }

    /* renamed from: b */
    private final void m39204b(UserMeta userMeta) {
        C2634g c2634g = this.f31420c;
        Subscription subscription = userMeta.getSubscription();
        boolean z = false;
        boolean isGold = subscription != null ? subscription.isGold() : false;
        userMeta = userMeta.getGlobalConfig();
        if (userMeta != null) {
            if (userMeta.isFastMatchEnabled() != null && isGold) {
                z = true;
            }
            c2634g.i(z);
            c2634g.k(z);
        }
        c2634g.d(this.f31421d.get().getCurrentPushNotificationFrequency());
        c2634g.e(this.f31422e.get().getCount());
    }
}
