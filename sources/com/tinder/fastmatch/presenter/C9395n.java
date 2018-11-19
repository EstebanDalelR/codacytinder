package com.tinder.fastmatch.presenter;

import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.deadshot.Take;
import com.tinder.domain.fastmatch.model.FastMatchStatus;
import com.tinder.domain.fastmatch.model.FastMatchStatus.Source;
import com.tinder.domain.fastmatch.provider.FastMatchStatusProvider;
import com.tinder.fastmatch.analytics.C11617e;
import com.tinder.fastmatch.analytics.C9372g;
import com.tinder.fastmatch.target.FastMatchToolbarTarget;
import com.tinder.fastmatch.viewmodel.C9421b;
import io.reactivex.disposables.C17356a;
import io.reactivex.functions.Consumer;
import io.reactivex.p453a.p455b.C15674a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0016\u001a\u00020\u0012H\u0007J\b\u0010\u0017\u001a\u00020\u0012H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0018"}, d2 = {"Lcom/tinder/fastmatch/presenter/FastMatchToolbarPresenter;", "", "fastMatchStatusProvider", "Lcom/tinder/domain/fastmatch/provider/FastMatchStatusProvider;", "addLikesYouPillCountCheckEvent", "Lcom/tinder/fastmatch/analytics/AddLikesYouPillCountCheckEvent;", "fastMatchSessionManager", "Lcom/tinder/fastmatch/analytics/FastMatchSessionManager;", "(Lcom/tinder/domain/fastmatch/provider/FastMatchStatusProvider;Lcom/tinder/fastmatch/analytics/AddLikesYouPillCountCheckEvent;Lcom/tinder/fastmatch/analytics/FastMatchSessionManager;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "target", "Lcom/tinder/fastmatch/target/FastMatchToolbarTarget;", "getTarget", "()Lcom/tinder/fastmatch/target/FastMatchToolbarTarget;", "setTarget", "(Lcom/tinder/fastmatch/target/FastMatchToolbarTarget;)V", "handleAnalyticsEvent", "", "fastMatchStatus", "Lcom/tinder/domain/fastmatch/model/FastMatchStatus;", "handleFastMatchStatus", "subscribe", "unsubscribe", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.fastmatch.presenter.n */
public final class C9395n {
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public FastMatchToolbarTarget f31503a;
    /* renamed from: b */
    private final C17356a f31504b = new C17356a();
    /* renamed from: c */
    private final FastMatchStatusProvider f31505c;
    /* renamed from: d */
    private final C11617e f31506d;
    /* renamed from: e */
    private final C9372g f31507e;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/fastmatch/model/FastMatchStatus;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.presenter.n$a */
    static final class C11650a<T> implements Consumer<FastMatchStatus> {
        /* renamed from: a */
        final /* synthetic */ C9395n f38116a;

        C11650a(C9395n c9395n) {
            this.f38116a = c9395n;
        }

        public /* synthetic */ void accept(Object obj) {
            m47452a((FastMatchStatus) obj);
        }

        /* renamed from: a */
        public final void m47452a(FastMatchStatus fastMatchStatus) {
            C9395n c9395n = this.f38116a;
            C2668g.a(fastMatchStatus, "it");
            c9395n.m39314a(fastMatchStatus);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.presenter.n$b */
    static final class C11651b<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C11651b f38117a = new C11651b();

        C11651b() {
        }

        public /* synthetic */ void accept(Object obj) {
            m47453a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m47453a(Throwable th) {
            C0001a.c(th);
        }
    }

    @Inject
    public C9395n(@NotNull FastMatchStatusProvider fastMatchStatusProvider, @NotNull C11617e c11617e, @NotNull C9372g c9372g) {
        C2668g.b(fastMatchStatusProvider, "fastMatchStatusProvider");
        C2668g.b(c11617e, "addLikesYouPillCountCheckEvent");
        C2668g.b(c9372g, "fastMatchSessionManager");
        this.f31505c = fastMatchStatusProvider;
        this.f31506d = c11617e;
        this.f31507e = c9372g;
    }

    @Take
    /* renamed from: a */
    public final void m39317a() {
        this.f31504b.add(this.f31505c.observe().observeOn(C15674a.a()).subscribe(new C11650a(this), C11651b.f38117a));
    }

    @Drop
    /* renamed from: b */
    public final void m39318b() {
        this.f31504b.a();
    }

    /* renamed from: a */
    private final void m39314a(FastMatchStatus fastMatchStatus) {
        if (fastMatchStatus.getSource() != Source.PREVIEW) {
            C9421b c9421b = new C9421b(fastMatchStatus.getCount(), fastMatchStatus.isRange());
            FastMatchToolbarTarget fastMatchToolbarTarget = this.f31503a;
            if (fastMatchToolbarTarget == null) {
                C2668g.b("target");
            }
            fastMatchToolbarTarget.showToolbar(c9421b);
            m39316b(fastMatchStatus);
        }
    }

    /* renamed from: b */
    private final void m39316b(FastMatchStatus fastMatchStatus) {
        this.f31507e.m39250b(fastMatchStatus.getCount());
        this.f31506d.execute();
    }
}
