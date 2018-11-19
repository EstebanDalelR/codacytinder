package com.tinder.presenters;

import android.content.Context;
import com.tinder.account.analytics.C3874a;
import com.tinder.account.provider.UpdateAccountPasswordLastShownDateProvider;
import com.tinder.analytics.C7311a;
import com.tinder.analytics.chat.C7318a;
import com.tinder.apprating.p166e.C10314b;
import com.tinder.auth.interactor.AddSmsValidateEvent;
import com.tinder.auth.interactor.C10333h;
import com.tinder.auth.interactor.C10336s;
import com.tinder.bitmoji.C10376d;
import com.tinder.bitmoji.C10378h;
import com.tinder.bitmoji.C10380k;
import com.tinder.chat.activity.C8406b;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.crashindicator.p321c.C10713a;
import com.tinder.deeplink.TinderSchemaParser;
import com.tinder.discovery.p234c.C8890a;
import com.tinder.domain.deviceinfo.usecase.LoadAndUpdateDeviceInfo;
import com.tinder.domain.deviceinfo.usecase.ObserveDeviceInfo;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import com.tinder.domain.match.usecase.CountMatches;
import com.tinder.domain.match.usecase.GetMatchByUserId;
import com.tinder.domain.meta.usecase.GetCurrentUser;
import com.tinder.domain.profile.usecase.CheckTutorialViewed;
import com.tinder.domain.profile.usecase.ConfirmTutorialsViewed;
import com.tinder.domain.profile.usecase.LoadProfileOptionData;
import com.tinder.feed.p341b.C11695a;
import com.tinder.interactors.C9714e;
import com.tinder.interactors.TutorialsInteractor;
import com.tinder.main.model.MainPage;
import com.tinder.managers.ManagerAnalytics;
import com.tinder.managers.ManagerDeepLinking;
import com.tinder.managers.UserMetaManager;
import com.tinder.managers.bk;
import com.tinder.match.provider.C9879g;
import com.tinder.places.p156a.C7343b;
import com.tinder.purchase.usecase.C16246h;
import com.tinder.pushnotifications.C14550a;
import com.tinder.pushnotifications.p380a.C14548a;
import com.tinder.recs.analytics.RecsSessionTracker;
import com.tinder.session.p474a.C16576a;
import com.tinder.session.usecase.C14838f;
import com.tinder.settings.p404b.C14864a;
import com.tinder.tindergold.p481c.C16923a;
import com.tinder.usecase.C15346o;
import com.tinder.usecase.C17221d;
import com.tinder.usecase.C17224h;
import com.tinder.utils.ar;
import com.tinder.verification.usecase.C15390a;
import com.tinder.verification.usecase.C15391b;
import com.tinder.verification.usecase.C15392c;
import com.tinder.verification.worker.C15393a;
import dagger.internal.Factory;
import io.reactivex.C15679f;
import io.reactivex.subjects.C18432c;
import java.util.List;
import javax.inject.Provider;

public final class ge implements Factory<df> {
    /* renamed from: A */
    private final Provider<C9879g> f55320A;
    /* renamed from: B */
    private final Provider<C11695a> f55321B;
    /* renamed from: C */
    private final Provider<C15346o> f55322C;
    /* renamed from: D */
    private final Provider<C8890a> f55323D;
    /* renamed from: E */
    private final Provider<CheckTutorialViewed> f55324E;
    /* renamed from: F */
    private final Provider<LoadProfileOptionData> f55325F;
    /* renamed from: G */
    private final Provider<C16246h> f55326G;
    /* renamed from: H */
    private final Provider<C17221d> f55327H;
    /* renamed from: I */
    private final Provider<C14838f> f55328I;
    /* renamed from: J */
    private final Provider<C16576a> f55329J;
    /* renamed from: K */
    private final Provider<C7343b> f55330K;
    /* renamed from: L */
    private final Provider<C10336s> f55331L;
    /* renamed from: M */
    private final Provider<List<MainPage>> f55332M;
    /* renamed from: N */
    private final Provider<C18432c<Boolean>> f55333N;
    /* renamed from: O */
    private final Provider<C10380k> f55334O;
    /* renamed from: P */
    private final Provider<C14548a> f55335P;
    /* renamed from: Q */
    private final Provider<C10378h> f55336Q;
    /* renamed from: R */
    private final Provider<C14550a> f55337R;
    /* renamed from: S */
    private final Provider<C3874a> f55338S;
    /* renamed from: T */
    private final Provider<ConfirmTutorialsViewed> f55339T;
    /* renamed from: U */
    private final Provider<C15392c> f55340U;
    /* renamed from: V */
    private final Provider<C15391b> f55341V;
    /* renamed from: W */
    private final Provider<C15390a> f55342W;
    /* renamed from: X */
    private final Provider<AddSmsValidateEvent> f55343X;
    /* renamed from: Y */
    private final Provider<C10376d> f55344Y;
    /* renamed from: Z */
    private final Provider<C17224h> f55345Z;
    /* renamed from: a */
    private final Provider<C9714e> f55346a;
    private final Provider<C15393a> aa;
    private final Provider<C15679f> ab;
    /* renamed from: b */
    private final Provider<TutorialsInteractor> f55347b;
    /* renamed from: c */
    private final Provider<ManagerAnalytics> f55348c;
    /* renamed from: d */
    private final Provider<C10333h> f55349d;
    /* renamed from: e */
    private final Provider<AbTestUtility> f55350e;
    /* renamed from: f */
    private final Provider<UserMetaManager> f55351f;
    /* renamed from: g */
    private final Provider<UpdateAccountPasswordLastShownDateProvider> f55352g;
    /* renamed from: h */
    private final Provider<FastMatchConfigProvider> f55353h;
    /* renamed from: i */
    private final Provider<TinderSchemaParser> f55354i;
    /* renamed from: j */
    private final Provider<Context> f55355j;
    /* renamed from: k */
    private final Provider<C8406b> f55356k;
    /* renamed from: l */
    private final Provider<C16923a> f55357l;
    /* renamed from: m */
    private final Provider<ar> f55358m;
    /* renamed from: n */
    private final Provider<CountMatches> f55359n;
    /* renamed from: o */
    private final Provider<C10314b> f55360o;
    /* renamed from: p */
    private final Provider<C7311a> f55361p;
    /* renamed from: q */
    private final Provider<C14864a> f55362q;
    /* renamed from: r */
    private final Provider<bk> f55363r;
    /* renamed from: s */
    private final Provider<LoadAndUpdateDeviceInfo> f55364s;
    /* renamed from: t */
    private final Provider<C10713a> f55365t;
    /* renamed from: u */
    private final Provider<ObserveDeviceInfo> f55366u;
    /* renamed from: v */
    private final Provider<ManagerDeepLinking> f55367v;
    /* renamed from: w */
    private final Provider<GetMatchByUserId> f55368w;
    /* renamed from: x */
    private final Provider<GetCurrentUser> f55369x;
    /* renamed from: y */
    private final Provider<C7318a> f55370y;
    /* renamed from: z */
    private final Provider<RecsSessionTracker> f55371z;

    public /* synthetic */ Object get() {
        return m64867a();
    }

    /* renamed from: a */
    public df m64867a() {
        Provider provider = this.f55346a;
        Provider provider2 = this.f55347b;
        Provider provider3 = this.f55348c;
        Provider provider4 = this.f55349d;
        Provider provider5 = this.f55350e;
        Provider provider6 = this.f55351f;
        Provider provider7 = this.f55352g;
        Provider provider8 = this.f55353h;
        Provider provider9 = this.f55354i;
        Provider provider10 = this.f55355j;
        Provider provider11 = this.f55356k;
        Provider provider12 = this.f55357l;
        Provider provider13 = this.f55358m;
        Provider provider14 = this.f55359n;
        Provider provider15 = this.f55360o;
        return m64866a(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, this.f55361p, this.f55362q, this.f55363r, this.f55364s, this.f55365t, this.f55366u, this.f55367v, this.f55368w, this.f55369x, this.f55370y, this.f55371z, this.f55320A, this.f55321B, this.f55322C, this.f55323D, this.f55324E, this.f55325F, this.f55326G, this.f55327H, this.f55328I, this.f55329J, this.f55330K, this.f55331L, this.f55332M, this.f55333N, this.f55334O, this.f55335P, this.f55336Q, this.f55337R, this.f55338S, this.f55339T, this.f55340U, this.f55341V, this.f55342W, this.f55343X, this.f55344Y, this.f55345Z, this.aa, this.ab);
    }

    /* renamed from: a */
    public static df m64866a(Provider<C9714e> provider, Provider<TutorialsInteractor> provider2, Provider<ManagerAnalytics> provider3, Provider<C10333h> provider4, Provider<AbTestUtility> provider5, Provider<UserMetaManager> provider6, Provider<UpdateAccountPasswordLastShownDateProvider> provider7, Provider<FastMatchConfigProvider> provider8, Provider<TinderSchemaParser> provider9, Provider<Context> provider10, Provider<C8406b> provider11, Provider<C16923a> provider12, Provider<ar> provider13, Provider<CountMatches> provider14, Provider<C10314b> provider15, Provider<C7311a> provider16, Provider<C14864a> provider17, Provider<bk> provider18, Provider<LoadAndUpdateDeviceInfo> provider19, Provider<C10713a> provider20, Provider<ObserveDeviceInfo> provider21, Provider<ManagerDeepLinking> provider22, Provider<GetMatchByUserId> provider23, Provider<GetCurrentUser> provider24, Provider<C7318a> provider25, Provider<RecsSessionTracker> provider26, Provider<C9879g> provider27, Provider<C11695a> provider28, Provider<C15346o> provider29, Provider<C8890a> provider30, Provider<CheckTutorialViewed> provider31, Provider<LoadProfileOptionData> provider32, Provider<C16246h> provider33, Provider<C17221d> provider34, Provider<C14838f> provider35, Provider<C16576a> provider36, Provider<C7343b> provider37, Provider<C10336s> provider38, Provider<List<MainPage>> provider39, Provider<C18432c<Boolean>> provider40, Provider<C10380k> provider41, Provider<C14548a> provider42, Provider<C10378h> provider43, Provider<C14550a> provider44, Provider<C3874a> provider45, Provider<ConfirmTutorialsViewed> provider46, Provider<C15392c> provider47, Provider<C15391b> provider48, Provider<C15390a> provider49, Provider<AddSmsValidateEvent> provider50, Provider<C10376d> provider51, Provider<C17224h> provider52, Provider<C15393a> provider53, Provider<C15679f> provider54) {
        return new df((C9714e) provider.get(), (TutorialsInteractor) provider2.get(), (ManagerAnalytics) provider3.get(), (C10333h) provider4.get(), (AbTestUtility) provider5.get(), (UserMetaManager) provider6.get(), (UpdateAccountPasswordLastShownDateProvider) provider7.get(), (FastMatchConfigProvider) provider8.get(), (TinderSchemaParser) provider9.get(), (Context) provider10.get(), (C8406b) provider11.get(), (C16923a) provider12.get(), (ar) provider13.get(), (CountMatches) provider14.get(), (C10314b) provider15.get(), (C7311a) provider16.get(), (C14864a) provider17.get(), (bk) provider18.get(), (LoadAndUpdateDeviceInfo) provider19.get(), (C10713a) provider20.get(), (ObserveDeviceInfo) provider21.get(), (ManagerDeepLinking) provider22.get(), (GetMatchByUserId) provider23.get(), (GetCurrentUser) provider24.get(), (C7318a) provider25.get(), (RecsSessionTracker) provider26.get(), (C9879g) provider27.get(), (C11695a) provider28.get(), (C15346o) provider29.get(), (C8890a) provider30.get(), (CheckTutorialViewed) provider31.get(), (LoadProfileOptionData) provider32.get(), (C16246h) provider33.get(), (C17221d) provider34.get(), (C14838f) provider35.get(), (C16576a) provider36.get(), (C7343b) provider37.get(), (C10336s) provider38.get(), (List) provider39.get(), (C18432c) provider40.get(), (C10380k) provider41.get(), (C14548a) provider42.get(), (C10378h) provider43.get(), (C14550a) provider44.get(), (C3874a) provider45.get(), (ConfirmTutorialsViewed) provider46.get(), (C15392c) provider47.get(), (C15391b) provider48.get(), (C15390a) provider49.get(), (AddSmsValidateEvent) provider50.get(), (C10376d) provider51.get(), (C17224h) provider52.get(), (C15393a) provider53.get(), (C15679f) provider54.get());
    }

    /* renamed from: a */
    public static df m64865a(C9714e c9714e, TutorialsInteractor tutorialsInteractor, ManagerAnalytics managerAnalytics, C10333h c10333h, AbTestUtility abTestUtility, UserMetaManager userMetaManager, UpdateAccountPasswordLastShownDateProvider updateAccountPasswordLastShownDateProvider, FastMatchConfigProvider fastMatchConfigProvider, TinderSchemaParser tinderSchemaParser, Context context, C8406b c8406b, C16923a c16923a, ar arVar, CountMatches countMatches, C10314b c10314b, C7311a c7311a, C14864a c14864a, bk bkVar, LoadAndUpdateDeviceInfo loadAndUpdateDeviceInfo, C10713a c10713a, ObserveDeviceInfo observeDeviceInfo, ManagerDeepLinking managerDeepLinking, GetMatchByUserId getMatchByUserId, GetCurrentUser getCurrentUser, C7318a c7318a, RecsSessionTracker recsSessionTracker, C9879g c9879g, C11695a c11695a, C15346o c15346o, C8890a c8890a, CheckTutorialViewed checkTutorialViewed, LoadProfileOptionData loadProfileOptionData, C16246h c16246h, C17221d c17221d, C14838f c14838f, C16576a c16576a, C7343b c7343b, C10336s c10336s, List<MainPage> list, C18432c<Boolean> c18432c, C10380k c10380k, C14548a c14548a, C10378h c10378h, C14550a c14550a, C3874a c3874a, ConfirmTutorialsViewed confirmTutorialsViewed, C15392c c15392c, C15391b c15391b, C15390a c15390a, AddSmsValidateEvent addSmsValidateEvent, C10376d c10376d, C17224h c17224h, C15393a c15393a, C15679f c15679f) {
        return new df(c9714e, tutorialsInteractor, managerAnalytics, c10333h, abTestUtility, userMetaManager, updateAccountPasswordLastShownDateProvider, fastMatchConfigProvider, tinderSchemaParser, context, c8406b, c16923a, arVar, countMatches, c10314b, c7311a, c14864a, bkVar, loadAndUpdateDeviceInfo, c10713a, observeDeviceInfo, managerDeepLinking, getMatchByUserId, getCurrentUser, c7318a, recsSessionTracker, c9879g, c11695a, c15346o, c8890a, checkTutorialViewed, loadProfileOptionData, c16246h, c17221d, c14838f, c16576a, c7343b, c10336s, list, c18432c, c10380k, c14548a, c10378h, c14550a, c3874a, confirmTutorialsViewed, c15392c, c15391b, c15390a, addSmsValidateEvent, c10376d, c17224h, c15393a, c15679f);
    }
}
