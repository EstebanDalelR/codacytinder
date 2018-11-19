package com.tinder.smsauth.core;

import com.tinder.common.logger.Logger;
import com.tinder.common.reactivex.schedulers.Schedulers;
import com.tinder.common.statemachine.C8561a;
import com.tinder.common.statemachine.C8561a.C8560e;
import com.tinder.common.statemachine.C8561a.C8560e.C10700b;
import com.tinder.smsauth.core.di.scope.SmsAuthScope;
import com.tinder.smsauth.entity.C14976d;
import com.tinder.smsauth.entity.C14977f;
import com.tinder.smsauth.entity.C14980h;
import com.tinder.smsauth.entity.C14982j;
import com.tinder.smsauth.entity.Flow.C14972a;
import com.tinder.smsauth.entity.Flow.C14972a.C16725a;
import com.tinder.smsauth.entity.Flow.C14972a.C16726b;
import com.tinder.smsauth.entity.Flow.C14972a.C16727c;
import com.tinder.smsauth.entity.Flow.C14972a.C16728d;
import com.tinder.smsauth.entity.Flow.C14972a.C16729e;
import com.tinder.smsauth.entity.Flow.C14972a.C16730f;
import com.tinder.smsauth.entity.Flow.C14972a.C16731g;
import com.tinder.smsauth.entity.Flow.C14972a.C16732h;
import com.tinder.smsauth.entity.Flow.C14972a.C16733i;
import com.tinder.smsauth.entity.Flow.C14972a.C16734j;
import com.tinder.smsauth.entity.Flow.C14972a.C16736l;
import com.tinder.smsauth.entity.Flow.C14973b;
import com.tinder.smsauth.entity.Flow.C14973b.C16737a;
import com.tinder.smsauth.entity.Flow.C14973b.C16738b;
import com.tinder.smsauth.entity.Flow.C14974c;
import com.tinder.smsauth.entity.SmsAuthRepository;
import io.reactivex.C3957b;
import io.reactivex.disposables.C17356a;
import io.reactivex.functions.Consumer;
import io.reactivex.processors.BehaviorProcessor;
import io.reactivex.processors.C18430a;
import io.reactivex.processors.PublishProcessor;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@SmsAuthScope
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010\u0016\u001a\u00020\u0017J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000fH\u0002J\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001bJ\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00130\u001bJ\u0006\u0010\u001d\u001a\u00020\u0017J\u0006\u0010\u001e\u001a\u00020\u0017J\u0010\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020!H\u0002J\u0006\u0010\"\u001a\u00020\u0017J\u000e\u0010#\u001a\u00020\u00172\u0006\u0010$\u001a\u00020%J\u0018\u0010&\u001a\u00020\u00172\u0006\u0010'\u001a\u00020%2\b\b\u0002\u0010(\u001a\u00020)J\u0018\u0010*\u001a\u00020\u00172\u0006\u0010 \u001a\u00020%2\b\b\u0002\u0010(\u001a\u00020)J\u0018\u0010+\u001a\u00020\u00172\u0006\u0010 \u001a\u00020!2\u0006\u0010,\u001a\u00020%H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u000f0\u000f0\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R \u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00140\u0012X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0015\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u00130\u00130\u000eX\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/tinder/smsauth/core/SmsAuthFlowCoordinator;", "", "smsAuthFlowStateMachineFactory", "Lcom/tinder/smsauth/core/SmsAuthFlowStateMachineFactory;", "smsAuthRepository", "Lcom/tinder/smsauth/entity/SmsAuthRepository;", "schedulers", "Lcom/tinder/common/reactivex/schedulers/Schedulers;", "logger", "Lcom/tinder/common/logger/Logger;", "(Lcom/tinder/smsauth/core/SmsAuthFlowStateMachineFactory;Lcom/tinder/smsauth/entity/SmsAuthRepository;Lcom/tinder/common/reactivex/schedulers/Schedulers;Lcom/tinder/common/logger/Logger;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "eventRxProcessor", "Lio/reactivex/processors/FlowableProcessor;", "Lcom/tinder/smsauth/entity/Flow$Event;", "kotlin.jvm.PlatformType", "stateMachine", "Lcom/tinder/common/statemachine/StateMachine;", "Lcom/tinder/smsauth/entity/Flow$State;", "Lcom/tinder/smsauth/entity/Flow$SideEffect;", "stateRxProcessor", "goBackToPreviousStep", "", "handleEvent", "event", "observeEvents", "Lio/reactivex/Flowable;", "observeStateUpdates", "proceedToNextStep", "requestCountryCodeList", "requestOneTimePassword", "phoneNumber", "Lcom/tinder/smsauth/entity/PhoneNumber;", "resendOneTimePasswordCode", "updateCountryCode", "newRegionCode", "", "updateOneTimePasswordCodeText", "newOneTimePasswordCode", "isAutoPopulated", "", "updatePhoneNumberText", "verifyOneTimePassword", "oneTimePassword", "core"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.smsauth.core.a */
public final class C14964a {
    /* renamed from: a */
    private final C8561a<C14974c, C14972a, C14973b> f46720a;
    /* renamed from: b */
    private final C18430a<C14974c> f46721b = BehaviorProcessor.m67653d(this.f46720a.a()).m66603u();
    /* renamed from: c */
    private final C18430a<C14972a> f46722c = PublishProcessor.m67663q().m66603u();
    /* renamed from: d */
    private final C17356a f46723d = new C17356a();
    /* renamed from: e */
    private final SmsAuthRepository f46724e;
    /* renamed from: f */
    private final Schedulers f46725f;
    /* renamed from: g */
    private final Logger f46726g;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "oneTimePasswordInfo", "Lcom/tinder/smsauth/entity/OneTimePasswordInfo;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.core.a$a */
    static final class C16713a<T> implements Consumer<C14977f> {
        /* renamed from: a */
        final /* synthetic */ C14964a f51702a;

        C16713a(C14964a c14964a) {
            this.f51702a = c14964a;
        }

        public /* synthetic */ void accept(Object obj) {
            m62225a((C14977f) obj);
        }

        /* renamed from: a */
        public final void m62225a(C14977f c14977f) {
            C14964a c14964a = this.f51702a;
            C2668g.a(c14977f, "oneTimePasswordInfo");
            c14964a.m56529a((C14972a) new C16730f(c14977f));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.core.a$b */
    static final class C16714b<T> implements Consumer<Throwable> {
        /* renamed from: a */
        final /* synthetic */ C14964a f51703a;

        C16714b(C14964a c14964a) {
            this.f51703a = c14964a;
        }

        public /* synthetic */ void accept(Object obj) {
            m62226a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m62226a(Throwable th) {
            Logger a = this.f51703a.f46726g;
            C2668g.a(th, "throwable");
            a.error(th, "Failed to request one-time password.");
            this.f51703a.m56529a((C14972a) new C16729e(th));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "loginCredentials", "Lcom/tinder/smsauth/entity/LoginCredentials;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.core.a$c */
    static final class C16715c<T> implements Consumer<C14976d> {
        /* renamed from: a */
        final /* synthetic */ C14964a f51704a;

        C16715c(C14964a c14964a) {
            this.f51704a = c14964a;
        }

        public /* synthetic */ void accept(Object obj) {
            m62227a((C14976d) obj);
        }

        /* renamed from: a */
        public final void m62227a(C14976d c14976d) {
            C14964a c14964a = this.f51704a;
            C2668g.a(c14976d, "loginCredentials");
            c14964a.m56529a((C14972a) new C16733i(c14976d));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.core.a$d */
    static final class C16716d<T> implements Consumer<Throwable> {
        /* renamed from: a */
        final /* synthetic */ C14964a f51705a;

        C16716d(C14964a c14964a) {
            this.f51705a = c14964a;
        }

        public /* synthetic */ void accept(Object obj) {
            m62228a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m62228a(Throwable th) {
            Logger a = this.f51705a.f46726g;
            C2668g.a(th, "throwable");
            a.error(th, "Failed to verify one-time password.");
            this.f51705a.m56529a((C14972a) new C16732h(th));
        }
    }

    @Inject
    public C14964a(@NotNull C14965c c14965c, @NotNull SmsAuthRepository smsAuthRepository, @NotNull Schedulers schedulers, @NotNull Logger logger) {
        C2668g.b(c14965c, "smsAuthFlowStateMachineFactory");
        C2668g.b(smsAuthRepository, "smsAuthRepository");
        C2668g.b(schedulers, "schedulers");
        C2668g.b(logger, "logger");
        this.f46724e = smsAuthRepository;
        this.f46725f = schedulers;
        this.f46726g = logger;
        this.f46720a = c14965c.m56544a();
    }

    @NotNull
    /* renamed from: a */
    public final C3957b<C14974c> m56532a() {
        C3957b<C14974c> g = this.f46721b.h().g();
        C2668g.a(g, "stateRxProcessor.onBackpressureBuffer().hide()");
        return g;
    }

    @NotNull
    /* renamed from: b */
    public final C3957b<C14972a> m56535b() {
        C3957b<C14972a> g = this.f46722c.h().g();
        C2668g.a(g, "eventRxProcessor.onBackpressureBuffer().hide()");
        return g;
    }

    /* renamed from: a */
    public final void m56534a(@NotNull String str, boolean z) {
        C2668g.b(str, "phoneNumber");
        m56529a((C14972a) new C16734j(str, z));
    }

    /* renamed from: c */
    public final void m56537c() {
        m56529a((C14972a) C16727c.f51719a);
    }

    /* renamed from: a */
    public final void m56533a(@NotNull String str) {
        C2668g.b(str, "newRegionCode");
        m56529a((C14972a) new C16726b(str));
    }

    /* renamed from: b */
    public final void m56536b(@NotNull String str, boolean z) {
        C2668g.b(str, "newOneTimePasswordCode");
        m56529a((C14972a) new C16728d(str, z));
    }

    /* renamed from: d */
    public final void m56538d() {
        m56529a((C14972a) C16736l.f51730a);
    }

    /* renamed from: e */
    public final void m56539e() {
        m56529a((C14972a) C16731g.f51724a);
    }

    /* renamed from: f */
    public final void m56540f() {
        this.f46723d.m63446a();
        m56529a((C14972a) C16725a.f51717a);
    }

    /* renamed from: a */
    private final void m56530a(C14980h c14980h) {
        this.f46723d.add(this.f46724e.requestOneTimePasswordViaSms(c14980h).b(this.f46725f.io()).a(this.f46725f.mainThread()).a(new C16713a(this), new C16714b(this)));
    }

    /* renamed from: a */
    private final void m56531a(C14980h c14980h, String str) {
        this.f46723d.add(this.f46724e.verifyOneTimePassword(new C14982j(c14980h, str)).b(this.f46725f.io()).a(this.f46725f.mainThread()).a((Consumer) new C16715c(this), new C16716d(this)));
    }

    /* renamed from: a */
    private final void m56529a(C14972a c14972a) {
        C8560e a = this.f46720a.a(c14972a);
        if (a instanceof C10700b) {
            this.f46722c.onNext(a.a());
            C10700b c10700b = (C10700b) a;
            this.f46721b.onNext(c10700b.c());
            C14973b c14973b = (C14973b) c10700b.d();
            if (c14973b instanceof C16737a) {
                m56530a(((C16737a) c14973b).m62244a());
                return;
            } else if (c14973b instanceof C16738b) {
                C16738b c16738b = (C16738b) c14973b;
                m56531a(c16738b.m62245a(), c16738b.m62246b());
                return;
            } else {
                Logger logger = this.f46726g;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unhandled sideEffect: ");
                stringBuilder.append(c14973b);
                logger.error(stringBuilder.toString());
                return;
            }
        }
        Logger logger2 = this.f46726g;
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Invalid transition: ");
        stringBuilder2.append(a);
        stringBuilder2.append(" caused by event ");
        stringBuilder2.append(c14972a);
        logger2.error(stringBuilder2.toString());
    }
}
