package com.tinder.common.p196h;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.functions.Action0;
import rx.subjects.PublishSubject;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/tinder/common/rx/RxSwipeRefreshLayout;", "", "()V", "onSwipeRefresh", "Lrx/Observable;", "", "swipeRefreshLayout", "Landroid/support/v4/widget/SwipeRefreshLayout;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.common.h.e */
public final class C8544e {
    /* renamed from: a */
    public static final C8544e f30289a = new C8544e();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onRefresh"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.common.h.e$c */
    static final class C10680c implements OnRefreshListener {
        /* renamed from: a */
        final /* synthetic */ PublishSubject f35020a;

        C10680c(PublishSubject publishSubject) {
            this.f35020a = publishSubject;
        }

        public final void onRefresh() {
            this.f35020a.onNext(C15813i.f49016a);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.common.h.e$a */
    static final class C13767a implements Action0 {
        /* renamed from: a */
        final /* synthetic */ SwipeRefreshLayout f43755a;
        /* renamed from: b */
        final /* synthetic */ OnRefreshListener f43756b;

        C13767a(SwipeRefreshLayout swipeRefreshLayout, OnRefreshListener onRefreshListener) {
            this.f43755a = swipeRefreshLayout;
            this.f43756b = onRefreshListener;
        }

        public final void call() {
            this.f43755a.setOnRefreshListener(this.f43756b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.common.h.e$b */
    static final class C13768b implements Action0 {
        /* renamed from: a */
        final /* synthetic */ SwipeRefreshLayout f43757a;

        C13768b(SwipeRefreshLayout swipeRefreshLayout) {
            this.f43757a = swipeRefreshLayout;
        }

        public final void call() {
            this.f43757a.setOnRefreshListener(null);
        }
    }

    private C8544e() {
    }

    @NotNull
    /* renamed from: a */
    public final Observable<C15813i> m36528a(@NotNull SwipeRefreshLayout swipeRefreshLayout) {
        C2668g.b(swipeRefreshLayout, "swipeRefreshLayout");
        PublishSubject w = PublishSubject.w();
        swipeRefreshLayout = w.e().b(new C13767a(swipeRefreshLayout, new C10680c(w))).d(new C13768b(swipeRefreshLayout));
        C2668g.a(swipeRefreshLayout, "subject.asObservable()\n …nRefreshListener(null) })");
        return swipeRefreshLayout;
    }
}
