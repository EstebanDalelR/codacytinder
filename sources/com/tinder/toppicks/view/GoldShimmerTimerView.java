package com.tinder.toppicks.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tinder.toppicks.C15235b.C15229e;
import com.tinder.toppicks.C15235b.C15230f;
import com.tinder.toppicks.C15236c;
import com.tinder.toppicks.C15256e;
import com.tinder.toppicks.C16995d;
import com.tinder.toppicks.di.TopPicksInjector$Factory;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.p453a.p455b.C15674a;
import io.reactivex.schedulers.C15756a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\nH\u0002J\b\u0010!\u001a\u00020\u001dH\u0014J\b\u0010\"\u001a\u00020\u001dH\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006#"}, d2 = {"Lcom/tinder/toppicks/view/GoldShimmerTimerView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "expirationTime", "Landroid/widget/TextView;", "expirationTimeInMills", "", "Ljava/lang/Long;", "syncDisposable", "Lio/reactivex/disposables/Disposable;", "timerContent", "Lcom/tinder/toppicks/TimerContent;", "topPicksExpirationTimeSynchronizer", "Lcom/tinder/toppicks/TopPicksExpirationTimeSynchronizer;", "getTopPicksExpirationTimeSynchronizer", "()Lcom/tinder/toppicks/TopPicksExpirationTimeSynchronizer;", "setTopPicksExpirationTimeSynchronizer", "(Lcom/tinder/toppicks/TopPicksExpirationTimeSynchronizer;)V", "topPicksMapper", "Lcom/tinder/toppicks/TopPicksExpirationTimeMapper;", "getTopPicksMapper$toppicks_release", "()Lcom/tinder/toppicks/TopPicksExpirationTimeMapper;", "setTopPicksMapper$toppicks_release", "(Lcom/tinder/toppicks/TopPicksExpirationTimeMapper;)V", "bind", "", "getDisplayTime", "", "currentTime", "onAttachedToWindow", "onDetachedFromWindow", "toppicks_release"}, k = 1, mv = {1, 1, 10})
public final class GoldShimmerTimerView extends FrameLayout {
    @Inject
    @NotNull
    /* renamed from: a */
    public C16995d f47474a;
    @Inject
    @NotNull
    /* renamed from: b */
    public C15256e f47475b;
    /* renamed from: c */
    private TextView f47476c;
    /* renamed from: d */
    private C15236c f47477d;
    /* renamed from: e */
    private Long f47478e;
    /* renamed from: f */
    private Disposable f47479f;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "currentTime", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.view.GoldShimmerTimerView$a */
    static final class C17147a<T> implements Consumer<String> {
        /* renamed from: a */
        final /* synthetic */ GoldShimmerTimerView f52658a;

        C17147a(GoldShimmerTimerView goldShimmerTimerView) {
            this.f52658a = goldShimmerTimerView;
        }

        public /* synthetic */ void accept(Object obj) {
            m63014a((String) obj);
        }

        /* renamed from: a */
        public final void m63014a(String str) {
            this.f52658a.f47476c.setText(str);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.view.GoldShimmerTimerView$b */
    static final class C17148b<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C17148b f52659a = new C17148b();

        C17148b() {
        }

        public /* synthetic */ void accept(Object obj) {
            m63015a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m63015a(Throwable th) {
            C0001a.c(th, "Failed when observing top picks expiration timer sync", new Object[0]);
        }
    }

    public GoldShimmerTimerView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.b(context, "context");
        C2668g.b(attributeSet, "attrs");
        super(context, attributeSet);
        this.f47477d = new C15236c(context, 0);
        ((TopPicksInjector$Factory) context).provideTopPicksInjector().inject(this);
        FrameLayout.inflate(context, C15230f.top_picks_card_timer_view, this);
        context = findViewById(C15229e.top_picks_expiration_time);
        C2668g.a(context, "findViewById(R.id.top_picks_expiration_time)");
        this.f47476c = (TextView) context;
    }

    @NotNull
    public final C16995d getTopPicksMapper$toppicks_release() {
        C16995d c16995d = this.f47474a;
        if (c16995d == null) {
            C2668g.b("topPicksMapper");
        }
        return c16995d;
    }

    public final void setTopPicksMapper$toppicks_release(@NotNull C16995d c16995d) {
        C2668g.b(c16995d, "<set-?>");
        this.f47474a = c16995d;
    }

    @NotNull
    public final C15256e getTopPicksExpirationTimeSynchronizer() {
        C15256e c15256e = this.f47475b;
        if (c15256e == null) {
            C2668g.b("topPicksExpirationTimeSynchronizer");
        }
        return c15256e;
    }

    public final void setTopPicksExpirationTimeSynchronizer(@NotNull C15256e c15256e) {
        C2668g.b(c15256e, "<set-?>");
        this.f47475b = c15256e;
    }

    /* renamed from: a */
    public final void m57459a(long j) {
        this.f47478e = Long.valueOf(j);
    }

    /* renamed from: b */
    private final String m57458b(long j) {
        Long l = this.f47478e;
        if (l != null) {
            this.f47477d.m57300a(l.longValue() - j);
            j = this.f47474a;
            if (j == null) {
                C2668g.b("topPicksMapper");
            }
            j = j.m62761a(this.f47477d);
            if (j != null) {
                return j;
            }
        }
        return "";
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C15256e c15256e = this.f47475b;
        if (c15256e == null) {
            C2668g.b("topPicksExpirationTimeSynchronizer");
        }
        this.f47479f = c15256e.m57345a().subscribeOn(C15756a.m59010b()).map(new C17149b(new GoldShimmerTimerView$onAttachedToWindow$1(this))).observeOn(C15674a.m58830a()).subscribe(new C17147a(this), C17148b.f52659a);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Disposable disposable = this.f47479f;
        if (disposable != null) {
            disposable.dispose();
        }
        this.f47479f = (Disposable) null;
    }
}
