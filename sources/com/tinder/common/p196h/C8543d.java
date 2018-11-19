package com.tinder.common.p196h;

import com.facebook.rebound.C1811f;
import com.facebook.rebound.SpringListener;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Completable;
import rx.Subscription;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.subjects.PublishSubject;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/common/rx/RxSpringView;", "", "()V", "onSpringAtRest", "Lrx/Completable;", "spring", "Lcom/facebook/rebound/Spring;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.common.h.d */
public final class C8543d {
    /* renamed from: a */
    public static final C8543d f30288a = new C8543d();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\n"}, d2 = {"com/tinder/common/rx/RxSpringView$onSpringAtRest$listener$1", "Lcom/facebook/rebound/SpringListener;", "(Lrx/subjects/PublishSubject;)V", "onSpringActivate", "", "spring", "Lcom/facebook/rebound/Spring;", "onSpringAtRest", "onSpringEndStateChange", "onSpringUpdate", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.common.h.d$c */
    public static final class C10679c implements SpringListener {
        /* renamed from: a */
        final /* synthetic */ PublishSubject f35019a;

        public void onSpringActivate(@Nullable C1811f c1811f) {
        }

        public void onSpringEndStateChange(@Nullable C1811f c1811f) {
        }

        public void onSpringUpdate(@Nullable C1811f c1811f) {
        }

        C10679c(PublishSubject publishSubject) {
            this.f35019a = publishSubject;
        }

        public void onSpringAtRest(@Nullable C1811f c1811f) {
            this.f35019a.onCompleted();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lrx/Subscription;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.common.h.d$a */
    static final class C13765a<T> implements Action1<Subscription> {
        /* renamed from: a */
        final /* synthetic */ C1811f f43751a;
        /* renamed from: b */
        final /* synthetic */ C10679c f43752b;

        C13765a(C1811f c1811f, C10679c c10679c) {
            this.f43751a = c1811f;
            this.f43752b = c10679c;
        }

        public /* synthetic */ void call(Object obj) {
            m53342a((Subscription) obj);
        }

        /* renamed from: a */
        public final void m53342a(Subscription subscription) {
            this.f43751a.a(this.f43752b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.common.h.d$b */
    static final class C13766b implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C1811f f43753a;
        /* renamed from: b */
        final /* synthetic */ C10679c f43754b;

        C13766b(C1811f c1811f, C10679c c10679c) {
            this.f43753a = c1811f;
            this.f43754b = c10679c;
        }

        public final void call() {
            this.f43753a.b(this.f43754b);
        }
    }

    private C8543d() {
    }

    @NotNull
    /* renamed from: a */
    public final Completable m36527a(@NotNull C1811f c1811f) {
        C2668g.b(c1811f, "spring");
        PublishSubject w = PublishSubject.w();
        C10679c c10679c = new C10679c(w);
        c1811f = w.b().d(new C13765a(c1811f, c10679c)).c(new C13766b(c1811f, c10679c));
        C2668g.a(c1811f, "subject.toCompletable()\n…moveListener(listener) })");
        return c1811f;
    }
}
