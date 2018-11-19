package com.tinder.common.p196h;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.OnScrollListener;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;
import rx.functions.Action0;
import rx.subjects.PublishSubject;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/tinder/common/rx/RxRecyclerView;", "", "()V", "onScroll", "Lrx/Observable;", "", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.common.h.c */
public final class C8542c {
    /* renamed from: a */
    public static final C8542c f30287a = new C8542c();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\n"}, d2 = {"com/tinder/common/rx/RxRecyclerView$onScroll$listener$1", "Landroid/support/v7/widget/RecyclerView$OnScrollListener;", "(Lrx/subjects/PublishSubject;)V", "onScrolled", "", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "dx", "", "dy", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.common.h.c$c */
    public static final class C10678c extends OnScrollListener {
        /* renamed from: a */
        final /* synthetic */ PublishSubject f35018a;

        C10678c(PublishSubject publishSubject) {
            this.f35018a = publishSubject;
        }

        public void onScrolled(@Nullable RecyclerView recyclerView, int i, int i2) {
            this.f35018a.onNext(C15813i.f49016a);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.common.h.c$a */
    static final class C13763a implements Action0 {
        /* renamed from: a */
        final /* synthetic */ RecyclerView f43747a;
        /* renamed from: b */
        final /* synthetic */ C10678c f43748b;

        C13763a(RecyclerView recyclerView, C10678c c10678c) {
            this.f43747a = recyclerView;
            this.f43748b = c10678c;
        }

        public final void call() {
            this.f43747a.addOnScrollListener(this.f43748b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.common.h.c$b */
    static final class C13764b implements Action0 {
        /* renamed from: a */
        final /* synthetic */ RecyclerView f43749a;
        /* renamed from: b */
        final /* synthetic */ C10678c f43750b;

        C13764b(RecyclerView recyclerView, C10678c c10678c) {
            this.f43749a = recyclerView;
            this.f43750b = c10678c;
        }

        public final void call() {
            this.f43749a.removeOnScrollListener(this.f43750b);
        }
    }

    private C8542c() {
    }

    @NotNull
    /* renamed from: a */
    public final Observable<C15813i> m36526a(@NotNull RecyclerView recyclerView) {
        C2668g.b(recyclerView, "recyclerView");
        PublishSubject w = PublishSubject.w();
        C10678c c10678c = new C10678c(w);
        recyclerView = w.e().b(new C13763a(recyclerView, c10678c)).d(new C13764b(recyclerView, c10678c));
        C2668g.a(recyclerView, "subject.asObservable()\n …rollListener(listener) })");
        return recyclerView;
    }
}
