package com.tinder.loops.p268b;

import com.tinder.loops.p269c.C9763a;
import com.tinder.loops.target.C11949a;
import com.tinder.loops.target.EmptyStateContainerTarget;
import com.tinder.loops.views.MediaTabsView.MediaTab;
import io.reactivex.disposables.C17356a;
import io.reactivex.functions.Consumer;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u000b\u001a\u00020\nH\u0002J\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/loops/presenter/EmptyStateContainerPresenter;", "", "mediaTabSelectedProvider", "Lcom/tinder/loops/provider/MediaTabSelectedProvider;", "(Lcom/tinder/loops/provider/MediaTabSelectedProvider;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "target", "Lcom/tinder/loops/target/EmptyStateContainerTarget;", "drop", "", "observeTabSelections", "take", "loops_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.loops.b.a */
public final class C9760a {
    /* renamed from: a */
    private EmptyStateContainerTarget f32382a = ((EmptyStateContainerTarget) new C11949a());
    /* renamed from: b */
    private final C17356a f32383b = new C17356a();
    /* renamed from: c */
    private final C9763a f32384c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/loops/views/MediaTabsView$MediaTab;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.b.a$a */
    static final class C11913a<T> implements Consumer<MediaTab> {
        /* renamed from: a */
        final /* synthetic */ C9760a f38811a;

        C11913a(C9760a c9760a) {
            this.f38811a = c9760a;
        }

        public /* synthetic */ void accept(Object obj) {
            m47918a((MediaTab) obj);
        }

        /* renamed from: a */
        public final void m47918a(MediaTab mediaTab) {
            EmptyStateContainerTarget a = this.f38811a.f32382a;
            C2668g.a(mediaTab, "it");
            a.showTab(mediaTab);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.b.a$b */
    static final class C11914b<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C11914b f38812a = new C11914b();

        C11914b() {
        }

        public /* synthetic */ void accept(Object obj) {
            m47919a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m47919a(Throwable th) {
            C0001a.c(th, "Error observing tab selection events", new Object[0]);
        }
    }

    @Inject
    public C9760a(@NotNull C9763a c9763a) {
        C2668g.b(c9763a, "mediaTabSelectedProvider");
        this.f32384c = c9763a;
    }

    /* renamed from: a */
    public final void m40280a(@NotNull EmptyStateContainerTarget emptyStateContainerTarget) {
        C2668g.b(emptyStateContainerTarget, "target");
        this.f32382a = emptyStateContainerTarget;
        m40278b();
    }

    /* renamed from: a */
    public final void m40279a() {
        this.f32382a = new C11949a();
        this.f32383b.a();
    }

    /* renamed from: b */
    private final void m40278b() {
        this.f32383b.add(this.f32384c.m40294a().distinctUntilChanged().subscribe(new C11913a(this), C11914b.f38812a));
    }
}
