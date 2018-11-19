package com.tinder.recsads;

import com.tinder.addy.Ad;
import com.tinder.recsads.analytics.C16440t;
import com.tinder.recsads.analytics.C16440t.C14747a;
import com.tinder.recsads.model.C16464a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/recsads/NativeDfpAdCardAnalyticsListener;", "Lcom/tinder/recsads/NativeCardListener;", "addAdViewEvent", "Lcom/tinder/recsads/analytics/AddAdViewEvent;", "(Lcom/tinder/recsads/analytics/AddAdViewEvent;)V", "onCardMovedToTop", "", "adRec", "Lcom/tinder/recsads/model/AdRec;", "onClickthroughClicked", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.recsads.f */
public final class C16458f implements NativeCardListener {
    /* renamed from: a */
    private final C16440t f51043a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.recsads.f$a */
    static final class C18777a implements Action0 {
        /* renamed from: a */
        public static final C18777a f58288a = new C18777a();

        C18777a() {
        }

        public final void call() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.recsads.f$b */
    static final class C18778b<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C18778b f58289a = new C18778b();

        C18778b() {
        }

        public /* synthetic */ void call(Object obj) {
            m67219a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m67219a(Throwable th) {
            C0001a.c(th);
        }
    }

    public void onClickthroughClicked(@NotNull C16464a c16464a) {
        C2668g.b(c16464a, "adRec");
    }

    @Inject
    public C16458f(@NotNull C16440t c16440t) {
        C2668g.b(c16440t, "addAdViewEvent");
        this.f51043a = c16440t;
    }

    public void onCardMovedToTop(@NotNull C16464a c16464a) {
        C2668g.b(c16464a, "adRec");
        this.f51043a.m56002a((Object) C14747a.m56021e().mo12151a(), (Ad) c16464a.m61877c()).b(Schedulers.io()).a(C18777a.f58288a, C18778b.f58289a);
    }
}
