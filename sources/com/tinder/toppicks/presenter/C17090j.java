package com.tinder.toppicks.presenter;

import android.app.Activity;
import com.tinder.deadshot.DeadshotTarget;
import com.tinder.domain.injection.qualifiers.DefaultDateTimeProvider;
import com.tinder.domain.toppicks.model.TopPicksSession;
import com.tinder.domain.toppicks.usecase.ObserveTopPicksSession;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import com.tinder.paywall.legacy.ListenerPaywall;
import com.tinder.paywall.legacy.TopPicksPaywallSource;
import com.tinder.paywall.views.PaywallItemGroupView.PaywallItemSelectListener;
import com.tinder.purchase.domain.model.C14510e;
import com.tinder.purchase.domain.model.Transaction;
import com.tinder.purchase.domain.model.Transaction.Status;
import com.tinder.purchase.domain.model.TransactionFlowError;
import com.tinder.purchase.model.PurchaseFlowError;
import com.tinder.purchase.usecase.C14539e;
import com.tinder.toppicks.C15268f;
import com.tinder.toppicks.TopPicksPaywallViewTarget;
import com.tinder.toppicks.p430a.C16975a;
import com.tinder.toppicks.p430a.C16975a.C15222a;
import com.tinder.toppicks.p430a.C16977b;
import io.reactivex.disposables.C17356a;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.p453a.p455b.C15674a;
import io.reactivex.schedulers.C15756a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.DateTime;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B?\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u000e\b\u0001\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\u0010\u000fJ\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0002J\u0012\u0010\"\u001a\u00020\u001e2\b\u0010#\u001a\u0004\u0018\u00010$H\u0002J\u0010\u0010%\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020$H\u0002J!\u0010&\u001a\u00020\u001e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010'\u001a\u0004\u0018\u00010(H\u0002¢\u0006\u0002\u0010)J\u0010\u0010*\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u001fH\u0002J\u0012\u0010+\u001a\u00020\u001e2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u001a\u0010.\u001a\u00020\u001e2\b\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010/\u001a\u00020\u0015H\u0016J\u0010\u00100\u001a\u00020\u001e2\u0006\u00101\u001a\u000202H\u0002J\u0016\u00103\u001a\u00020\u001e2\u0006\u00104\u001a\u0002052\u0006\u0010'\u001a\u00020(J\u0010\u00106\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0018\u00107\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010'\u001a\u00020(H\u0002J\u001a\u00108\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u001f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u0018\u00109\u001a\u00020\u001e2\u0006\u00104\u001a\u0002052\u0006\u0010'\u001a\u00020(H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0004\n\u0002\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006:"}, d2 = {"Lcom/tinder/toppicks/presenter/TopPicksPaywallPresenter;", "Lcom/tinder/paywall/views/PaywallItemGroupView$PaywallItemSelectListener;", "makePurchase", "Lcom/tinder/purchase/usecase/MakePurchase;", "paywallViewModelFactory", "Lcom/tinder/toppicks/TopPicksPaywallViewModelFactory;", "addTopPicksPaywallViewEvent", "Lcom/tinder/toppicks/analytics/AddTopPicksPaywallViewEvent;", "addTopPicksPurchaseEvent", "Lcom/tinder/toppicks/analytics/AddTopPicksPaywallPurchaseEvent;", "observeTopPicksSession", "Lcom/tinder/domain/toppicks/usecase/ObserveTopPicksSession;", "dateTimeProvider", "Lkotlin/Function0;", "Lorg/joda/time/DateTime;", "(Lcom/tinder/purchase/usecase/MakePurchase;Lcom/tinder/toppicks/TopPicksPaywallViewModelFactory;Lcom/tinder/toppicks/analytics/AddTopPicksPaywallViewEvent;Lcom/tinder/toppicks/analytics/AddTopPicksPaywallPurchaseEvent;Lcom/tinder/domain/toppicks/usecase/ObserveTopPicksSession;Lkotlin/jvm/functions/Function0;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "paywallListener", "Lcom/tinder/paywall/legacy/ListenerPaywall;", "source", "", "Ljava/lang/Integer;", "target", "Lcom/tinder/toppicks/TopPicksPaywallViewTarget;", "getTarget$Tinder_release", "()Lcom/tinder/toppicks/TopPicksPaywallViewTarget;", "setTarget$Tinder_release", "(Lcom/tinder/toppicks/TopPicksPaywallViewTarget;)V", "bindViewModel", "", "Lcom/tinder/paywall/legacy/TopPicksPaywallSource;", "topPicksSession", "Lcom/tinder/domain/toppicks/model/TopPicksSession;", "handleFailedTransaction", "transactionFlowError", "Lcom/tinder/purchase/domain/model/TransactionFlowError;", "handleNonNullTransactionError", "handleSuccessfulTransaction", "productId", "", "(Ljava/lang/Integer;Ljava/lang/String;)V", "observeSession", "onPaywallItemInFocusTap", "offer", "Lcom/tinder/purchase/domain/model/Offer;", "onPaywallItemSelected", "position", "onTransactionReceived", "transaction", "Lcom/tinder/purchase/domain/model/Transaction;", "purchase", "activity", "Landroid/app/Activity;", "sendPaywallViewEvent", "sendPurchaseEvent", "setupView", "startPurchaseProcess", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.toppicks.presenter.j */
public final class C17090j implements PaywallItemSelectListener {
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public TopPicksPaywallViewTarget f52590a;
    /* renamed from: b */
    private final C17356a f52591b = new C17356a();
    /* renamed from: c */
    private Integer f52592c;
    /* renamed from: d */
    private ListenerPaywall f52593d;
    /* renamed from: e */
    private final C14539e f52594e;
    /* renamed from: f */
    private final C15268f f52595f;
    /* renamed from: g */
    private final C16977b f52596g;
    /* renamed from: h */
    private final C16975a f52597h;
    /* renamed from: i */
    private final ObserveTopPicksSession f52598i;
    /* renamed from: j */
    private final Function0<DateTime> f52599j;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/toppicks/model/TopPicksSession;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.presenter.j$a */
    static final class C17084a<T> implements Consumer<TopPicksSession> {
        /* renamed from: a */
        final /* synthetic */ C17090j f52583a;
        /* renamed from: b */
        final /* synthetic */ TopPicksPaywallSource f52584b;

        C17084a(C17090j c17090j, TopPicksPaywallSource topPicksPaywallSource) {
            this.f52583a = c17090j;
            this.f52584b = topPicksPaywallSource;
        }

        public /* synthetic */ void accept(Object obj) {
            m62949a((TopPicksSession) obj);
        }

        /* renamed from: a */
        public final void m62949a(TopPicksSession topPicksSession) {
            C17090j c17090j = this.f52583a;
            TopPicksPaywallSource topPicksPaywallSource = this.f52584b;
            C2668g.a(topPicksSession, "it");
            c17090j.m62957a(topPicksPaywallSource, topPicksSession);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.presenter.j$b */
    static final class C17085b<T> implements Consumer<Throwable> {
        /* renamed from: a */
        final /* synthetic */ C17090j f52585a;

        C17085b(C17090j c17090j) {
            this.f52585a = c17090j;
        }

        public /* synthetic */ void accept(Object obj) {
            m62950a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m62950a(Throwable th) {
            this.f52585a.m62965a().dismissPaywall();
            C0001a.c(th, "Error observing top picks session", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.presenter.j$c */
    static final class C17086c implements Action {
        /* renamed from: a */
        public static final C17086c f52586a = new C17086c();

        C17086c() {
        }

        public final void run() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.presenter.j$d */
    static final class C17087d<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C17087d f52587a = new C17087d();

        C17087d() {
        }

        public /* synthetic */ void accept(Object obj) {
            m62951a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m62951a(Throwable th) {
            C0001a.c(th, "Error sending addTopPicksPaywallViewEvent", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/purchase/domain/model/Transaction;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.presenter.j$e */
    static final class C17088e<T> implements Consumer<Transaction> {
        /* renamed from: a */
        final /* synthetic */ C17090j f52588a;

        C17088e(C17090j c17090j) {
            this.f52588a = c17090j;
        }

        public /* synthetic */ void accept(Object obj) {
            m62952a((Transaction) obj);
        }

        /* renamed from: a */
        public final void m62952a(Transaction transaction) {
            C17090j c17090j = this.f52588a;
            C2668g.a(transaction, "it");
            c17090j.m62958a(transaction);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.presenter.j$f */
    static final class C17089f<T> implements Consumer<Throwable> {
        /* renamed from: a */
        final /* synthetic */ C17090j f52589a;

        C17089f(C17090j c17090j) {
            this.f52589a = c17090j;
        }

        public /* synthetic */ void accept(Object obj) {
            m62953a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m62953a(Throwable th) {
            C0001a.c(th);
            this.f52589a.m62965a().onPurchaseFailure(PurchaseFlowError.GENERIC.getUserFacingMessageResId());
        }
    }

    public void onPaywallItemSelected(@Nullable C14510e c14510e, int i) {
    }

    @Inject
    public C17090j(@NotNull C14539e c14539e, @NotNull C15268f c15268f, @NotNull C16977b c16977b, @NotNull C16975a c16975a, @NotNull ObserveTopPicksSession observeTopPicksSession, @NotNull @DefaultDateTimeProvider Function0<DateTime> function0) {
        C2668g.b(c14539e, "makePurchase");
        C2668g.b(c15268f, "paywallViewModelFactory");
        C2668g.b(c16977b, "addTopPicksPaywallViewEvent");
        C2668g.b(c16975a, "addTopPicksPurchaseEvent");
        C2668g.b(observeTopPicksSession, "observeTopPicksSession");
        C2668g.b(function0, "dateTimeProvider");
        this.f52594e = c14539e;
        this.f52595f = c15268f;
        this.f52596g = c16977b;
        this.f52597h = c16975a;
        this.f52598i = observeTopPicksSession;
        this.f52599j = function0;
    }

    @NotNull
    /* renamed from: a */
    public final TopPicksPaywallViewTarget m62965a() {
        TopPicksPaywallViewTarget topPicksPaywallViewTarget = this.f52590a;
        if (topPicksPaywallViewTarget == null) {
            C2668g.b("target");
        }
        return topPicksPaywallViewTarget;
    }

    /* renamed from: a */
    public final void m62967a(@NotNull TopPicksPaywallSource topPicksPaywallSource, @Nullable ListenerPaywall listenerPaywall) {
        C2668g.b(topPicksPaywallSource, "source");
        this.f52593d = listenerPaywall;
        this.f52592c = Integer.valueOf(topPicksPaywallSource.getAnalyticsSource());
        m62954a(topPicksPaywallSource.getAnalyticsSource());
        m62956a(topPicksPaywallSource);
    }

    /* renamed from: a */
    public final void m62966a(@NotNull Activity activity, @NotNull String str) {
        C2668g.b(activity, "activity");
        C2668g.b(str, "productId");
        if (this.f52593d != null) {
            activity = this.f52593d;
            if (activity != null) {
                activity.onPayClicked(str);
                return;
            }
            return;
        }
        m62963b(activity, str);
    }

    public void onPaywallItemInFocusTap(@Nullable C14510e c14510e) {
        TopPicksPaywallViewTarget topPicksPaywallViewTarget = this.f52590a;
        if (topPicksPaywallViewTarget == null) {
            C2668g.b("target");
        }
        topPicksPaywallViewTarget.onPaywallItemInFocusTap(c14510e);
    }

    /* renamed from: b */
    private final void m62963b(Activity activity, String str) {
        this.f52591b.add(RxJavaInteropExtKt.toV2Single(this.f52594e.m55538a(activity, str)).a(C15674a.m58830a()).a((Consumer) new C17088e(this), new C17089f(this)));
    }

    /* renamed from: a */
    private final void m62958a(Transaction transaction) {
        if (transaction.mo11878a() == Status.SUCCESS) {
            m62962a(this.f52592c, transaction.mo11881d());
        } else {
            m62959a(transaction.mo11880c());
        }
    }

    /* renamed from: a */
    private final void m62962a(Integer num, String str) {
        TopPicksPaywallViewTarget topPicksPaywallViewTarget = this.f52590a;
        if (topPicksPaywallViewTarget == null) {
            C2668g.b("target");
        }
        topPicksPaywallViewTarget.onPurchaseSuccess();
        if (num != null && str != null) {
            m62955a(num.intValue(), str);
        }
    }

    /* renamed from: a */
    private final void m62959a(TransactionFlowError transactionFlowError) {
        if (transactionFlowError == null) {
            transactionFlowError = this.f52590a;
            if (transactionFlowError == null) {
                C2668g.b("target");
            }
            transactionFlowError.onPurchaseFailure(PurchaseFlowError.GENERIC.getUserFacingMessageResId());
            return;
        }
        m62964b(transactionFlowError);
    }

    /* renamed from: b */
    private final void m62964b(TransactionFlowError transactionFlowError) {
        TopPicksPaywallViewTarget topPicksPaywallViewTarget;
        switch (C15290k.f47434a[transactionFlowError.getReportType().ordinal()]) {
            case 1:
                topPicksPaywallViewTarget = this.f52590a;
                if (topPicksPaywallViewTarget == null) {
                    C2668g.b("target");
                }
                topPicksPaywallViewTarget.onPurchaseFailure(transactionFlowError.getUserFacingMessageResId());
                return;
            case 2:
                topPicksPaywallViewTarget = this.f52590a;
                if (topPicksPaywallViewTarget == null) {
                    C2668g.b("target");
                }
                topPicksPaywallViewTarget.onPurchaseFailureNonFatal(transactionFlowError.getUserFacingMessageResId());
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    private final void m62955a(int i, String str) {
        RxJavaInteropExtKt.toV2Completable(this.f52597h.m62742a(new C15222a(i, str))).b(C15756a.m59010b()).d();
    }

    /* renamed from: a */
    private final void m62956a(TopPicksPaywallSource topPicksPaywallSource) {
        this.f52591b.add(this.f52598i.execute().b(C15756a.m59010b()).a(C15674a.m58830a()).d().a(new C17084a(this, topPicksPaywallSource), (Consumer) new C17085b(this)));
    }

    /* renamed from: a */
    private final void m62957a(TopPicksPaywallSource topPicksPaywallSource, TopPicksSession topPicksSession) {
        topPicksPaywallSource = this.f52595f.m57372a(topPicksPaywallSource, this, topPicksSession.getRefreshTime().getMillis() - ((DateTime) this.f52599j.invoke()).getMillis());
        topPicksSession = topPicksPaywallSource.m57285f();
        if (topPicksSession != null) {
            topPicksSession = topPicksSession.b();
            if (topPicksSession != null && topPicksSession.isEmpty() == 1) {
                topPicksSession = this.f52590a;
                if (topPicksSession == null) {
                    C2668g.b("target");
                }
                topPicksSession.showEmptyState(topPicksPaywallSource);
                return;
            }
        }
        topPicksSession = this.f52590a;
        if (topPicksSession == null) {
            C2668g.b("target");
        }
        topPicksSession.bind(topPicksPaywallSource);
    }

    /* renamed from: a */
    private final void m62954a(int i) {
        this.f52591b.add(this.f52596g.m62745a(i).a(C17086c.f52586a, C17087d.f52587a));
    }
}
