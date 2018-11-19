package com.tinder.profile.presenter;

import com.tinder.account.analytics.AccountThirdPartyIntegrationEventFactory.IntegrationAction;
import com.tinder.account.analytics.AccountThirdPartyIntegrationEventFactory.IntegrationFrom;
import com.tinder.account.analytics.AccountThirdPartyIntegrationEventFactory.IntegrationPartner;
import com.tinder.account.analytics.C3874a;
import com.tinder.account.analytics.C3874a.C2613a;
import com.tinder.bitmoji.BitmojiAuthStatus;
import com.tinder.bitmoji.C10376d;
import com.tinder.bitmoji.C10378h;
import com.tinder.bitmoji.C10380k;
import com.tinder.bitmoji.C3922i;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.deadshot.Take;
import com.tinder.domain.injection.qualifiers.IoScheduler;
import com.tinder.injection.qualifiers.MainThreadScheduler;
import com.tinder.profile.target.BitmojiAuthTarget;
import com.tinder.pushnotifications.C14550a;
import com.tinder.pushnotifications.model.TinderNotification;
import com.tinder.pushnotifications.p380a.C14548a;
import com.tinder.pushnotifications.view.InAppNotificationView.Listener;
import io.reactivex.C15679f;
import io.reactivex.disposables.C17356a;
import io.reactivex.functions.Consumer;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001Be\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0013¢\u0006\u0002\u0010\u0016J\r\u0010\u001f\u001a\u00020 H\u0001¢\u0006\u0002\b!J\u0006\u0010\u0006\u001a\u00020 J\r\u0010\"\u001a\u00020 H\u0001¢\u0006\u0002\b#J\u0010\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020&H\u0002J\r\u0010\n\u001a\u00020 H\u0001¢\u0006\u0002\b'J\u0006\u0010(\u001a\u00020 J\u0010\u0010)\u001a\u00020 2\u0006\u0010%\u001a\u00020&H\u0002J\u0018\u0010*\u001a\u00020 2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020&H\u0002J\r\u0010.\u001a\u00020 H\u0001¢\u0006\u0002\b/J\r\u00100\u001a\u00020 H\u0001¢\u0006\u0002\b1R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\u00020\u001a8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/tinder/profile/presenter/BitmojiAuthPresenter;", "", "abTestUtility", "Lcom/tinder/core/experiment/AbTestUtility;", "connectBitmoji", "Lcom/tinder/bitmoji/ConnectBitmoji;", "disconnectBitmoji", "Lcom/tinder/bitmoji/DisconnectBitmoji;", "checkBitmojiConnected", "Lcom/tinder/bitmoji/CheckBitmojiConnected;", "observeBitmojiAuthStatus", "Lcom/tinder/bitmoji/ObserveBitmojiAuthStatus;", "tinderNotificationFactory", "Lcom/tinder/pushnotifications/factory/TinderNotificationFactory;", "notificationDispatcher", "Lcom/tinder/pushnotifications/NotificationDispatcher;", "addAccountThirdPartyIntegrationEvent", "Lcom/tinder/account/analytics/AddAccountThirdPartyIntegrationEvent;", "ioScheduler", "Lio/reactivex/Scheduler;", "mainThreadScheduler", "delayScheduler", "(Lcom/tinder/core/experiment/AbTestUtility;Lcom/tinder/bitmoji/ConnectBitmoji;Lcom/tinder/bitmoji/DisconnectBitmoji;Lcom/tinder/bitmoji/CheckBitmojiConnected;Lcom/tinder/bitmoji/ObserveBitmojiAuthStatus;Lcom/tinder/pushnotifications/factory/TinderNotificationFactory;Lcom/tinder/pushnotifications/NotificationDispatcher;Lcom/tinder/account/analytics/AddAccountThirdPartyIntegrationEvent;Lio/reactivex/Scheduler;Lio/reactivex/Scheduler;Lio/reactivex/Scheduler;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "target", "Lcom/tinder/profile/target/BitmojiAuthTarget;", "getTarget$Tinder_release", "()Lcom/tinder/profile/target/BitmojiAuthTarget;", "setTarget$Tinder_release", "(Lcom/tinder/profile/target/BitmojiAuthTarget;)V", "checkBitmojiAuthStatusToSendInAppNotification", "", "checkBitmojiAuthStatusToSendInAppNotification$Tinder_release", "dispose", "dispose$Tinder_release", "handleInAppNotificationClicked", "didConnect", "", "observeBitmojiAuthStatus$Tinder_release", "onBitmojiAuthClick", "sendBitmojiInAppNotification", "sendBitmojiIntegrationAnalyticsEvent", "integrationAction", "Lcom/tinder/account/analytics/AccountThirdPartyIntegrationEventFactory$IntegrationAction;", "integrationSuccess", "setBitmojiDisplayState", "setBitmojiDisplayState$Tinder_release", "setInitialBitmojiAuthStatus", "setInitialBitmojiAuthStatus$Tinder_release", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.profile.presenter.e */
public final class C14426e {
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public BitmojiAuthTarget f45694a;
    /* renamed from: b */
    private C17356a f45695b = new C17356a();
    /* renamed from: c */
    private final AbTestUtility f45696c;
    /* renamed from: d */
    private final C10378h f45697d;
    /* renamed from: e */
    private final C3922i f45698e;
    /* renamed from: f */
    private final C10376d f45699f;
    /* renamed from: g */
    private final C10380k f45700g;
    /* renamed from: h */
    private final C14548a f45701h;
    /* renamed from: i */
    private final C14550a f45702i;
    /* renamed from: j */
    private final C3874a f45703j;
    /* renamed from: k */
    private final C15679f f45704k;
    /* renamed from: l */
    private final C15679f f45705l;
    /* renamed from: m */
    private final C15679f f45706m;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "authStatus", "Lcom/tinder/bitmoji/BitmojiAuthStatus;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.profile.presenter.e$a */
    static final class C16113a<T> implements Consumer<BitmojiAuthStatus> {
        /* renamed from: a */
        final /* synthetic */ C14426e f50184a;

        C16113a(C14426e c14426e) {
            this.f50184a = c14426e;
        }

        public /* synthetic */ void accept(Object obj) {
            m61002a((BitmojiAuthStatus) obj);
        }

        /* renamed from: a */
        public final void m61002a(BitmojiAuthStatus bitmojiAuthStatus) {
            if (bitmojiAuthStatus != null) {
                switch (C14427f.f45708b[bitmojiAuthStatus.ordinal()]) {
                    case 1:
                        this.f50184a.m55061a(true);
                        this.f50184a.m55058a(IntegrationAction.CONNECT, true);
                        return;
                    case 2:
                        this.f50184a.m55061a(false);
                        this.f50184a.m55058a(IntegrationAction.CONNECT, false);
                        return;
                    case 3:
                        this.f50184a.m55058a(IntegrationAction.DISCONNECT, true);
                        return;
                    default:
                        return;
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "authStatus", "Lcom/tinder/bitmoji/BitmojiAuthStatus;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.profile.presenter.e$b */
    static final class C16114b<T> implements Consumer<BitmojiAuthStatus> {
        /* renamed from: a */
        final /* synthetic */ C14426e f50185a;

        C16114b(C14426e c14426e) {
            this.f50185a = c14426e;
        }

        public /* synthetic */ void accept(Object obj) {
            m61003a((BitmojiAuthStatus) obj);
        }

        /* renamed from: a */
        public final void m61003a(BitmojiAuthStatus bitmojiAuthStatus) {
            if (bitmojiAuthStatus != null) {
                switch (C14427f.f45707a[bitmojiAuthStatus.ordinal()]) {
                    case 1:
                        this.f50185a.m55064a().showBitmojiConnected();
                        return;
                    case 2:
                    case 3:
                        this.f50185a.m55064a().showBitmojiDisconnected();
                        return;
                    default:
                        return;
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"com/tinder/profile/presenter/BitmojiAuthPresenter$sendBitmojiInAppNotification$1", "Lcom/tinder/pushnotifications/view/InAppNotificationView$Listener;", "(Lcom/tinder/profile/presenter/BitmojiAuthPresenter;Z)V", "onInAppNotificationClicked", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.profile.presenter.e$c */
    public static final class C16115c implements Listener {
        /* renamed from: a */
        final /* synthetic */ C14426e f50186a;
        /* renamed from: b */
        final /* synthetic */ boolean f50187b;

        C16115c(C14426e c14426e, boolean z) {
            this.f50186a = c14426e;
            this.f50187b = z;
        }

        public void onInAppNotificationClicked() {
            this.f50186a.m55063b(this.f50187b);
        }
    }

    @Inject
    public C14426e(@NotNull AbTestUtility abTestUtility, @NotNull C10378h c10378h, @NotNull C3922i c3922i, @NotNull C10376d c10376d, @NotNull C10380k c10380k, @NotNull C14548a c14548a, @NotNull C14550a c14550a, @NotNull C3874a c3874a, @NotNull @IoScheduler C15679f c15679f, @NotNull @MainThreadScheduler C15679f c15679f2, @NotNull @IoScheduler C15679f c15679f3) {
        C2668g.b(abTestUtility, "abTestUtility");
        C2668g.b(c10378h, "connectBitmoji");
        C2668g.b(c3922i, "disconnectBitmoji");
        C2668g.b(c10376d, "checkBitmojiConnected");
        C2668g.b(c10380k, "observeBitmojiAuthStatus");
        C2668g.b(c14548a, "tinderNotificationFactory");
        C2668g.b(c14550a, "notificationDispatcher");
        C2668g.b(c3874a, "addAccountThirdPartyIntegrationEvent");
        C2668g.b(c15679f, "ioScheduler");
        C2668g.b(c15679f2, "mainThreadScheduler");
        C2668g.b(c15679f3, "delayScheduler");
        this.f45696c = abTestUtility;
        this.f45697d = c10378h;
        this.f45698e = c3922i;
        this.f45699f = c10376d;
        this.f45700g = c10380k;
        this.f45701h = c14548a;
        this.f45702i = c14550a;
        this.f45703j = c3874a;
        this.f45704k = c15679f;
        this.f45705l = c15679f2;
        this.f45706m = c15679f3;
    }

    @NotNull
    /* renamed from: a */
    public final BitmojiAuthTarget m55064a() {
        BitmojiAuthTarget bitmojiAuthTarget = this.f45694a;
        if (bitmojiAuthTarget == null) {
            C2668g.b("target");
        }
        return bitmojiAuthTarget;
    }

    @Take
    /* renamed from: b */
    public final void m55065b() {
        BitmojiAuthTarget bitmojiAuthTarget;
        if (this.f45699f.a().booleanValue()) {
            bitmojiAuthTarget = this.f45694a;
            if (bitmojiAuthTarget == null) {
                C2668g.b("target");
            }
            bitmojiAuthTarget.showBitmojiConnected();
            return;
        }
        bitmojiAuthTarget = this.f45694a;
        if (bitmojiAuthTarget == null) {
            C2668g.b("target");
        }
        bitmojiAuthTarget.showBitmojiDisconnected();
    }

    @Take
    /* renamed from: c */
    public final void m55066c() {
        this.f45695b.add(this.f45700g.execute().distinctUntilChanged().observeOn(this.f45705l).subscribeOn(this.f45704k).subscribe(new C16114b(this)));
    }

    @Take
    /* renamed from: d */
    public final void m55067d() {
        BitmojiAuthTarget bitmojiAuthTarget;
        if (this.f45696c.isBitmojiEnabled()) {
            bitmojiAuthTarget = this.f45694a;
            if (bitmojiAuthTarget == null) {
                C2668g.b("target");
            }
            bitmojiAuthTarget.showBitmojiContainer();
            return;
        }
        bitmojiAuthTarget = this.f45694a;
        if (bitmojiAuthTarget == null) {
            C2668g.b("target");
        }
        bitmojiAuthTarget.hideBitmojiContainer();
    }

    @Take
    /* renamed from: e */
    public final void m55068e() {
        this.f45695b.add(this.f45700g.execute().delay(1, TimeUnit.SECONDS, this.f45706m).distinctUntilChanged().observeOn(this.f45705l).subscribeOn(this.f45704k).subscribe(new C16113a(this)));
    }

    @Drop
    /* renamed from: f */
    public final void m55069f() {
        this.f45695b.m63446a();
    }

    /* renamed from: g */
    public final void m55070g() {
        if (this.f45699f.a().booleanValue()) {
            BitmojiAuthTarget bitmojiAuthTarget = this.f45694a;
            if (bitmojiAuthTarget == null) {
                C2668g.b("target");
            }
            bitmojiAuthTarget.showBitmojiDisconnectDialog();
            return;
        }
        this.f45697d.execute();
    }

    /* renamed from: h */
    public final void m55071h() {
        this.f45698e.execute();
    }

    /* renamed from: a */
    private final void m55061a(boolean z) {
        TinderNotification a = this.f45701h.m55564a(z);
        a.m55582a((Listener) new C16115c(this, z));
        this.f45702i.m55573a(a);
    }

    /* renamed from: b */
    private final void m55063b(boolean z) {
        if (z) {
            z = this.f45694a;
            if (!z) {
                C2668g.b("target");
            }
            z.navigateToMatchList();
            return;
        }
        m55070g();
    }

    /* renamed from: a */
    private final void m55058a(IntegrationAction integrationAction, boolean z) {
        this.f45703j.a(new C2613a(integrationAction, IntegrationFrom.SETTINGS, IntegrationPartner.SNAPCHAT, z));
    }
}
