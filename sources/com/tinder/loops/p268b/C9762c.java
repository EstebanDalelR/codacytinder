package com.tinder.loops.p268b;

import com.tinder.loops.p269c.C9763a;
import com.tinder.loops.target.C11951c;
import com.tinder.loops.target.MediaTabsTarget;
import com.tinder.loops.views.MediaTabsView.MediaTab;
import io.reactivex.disposables.C17356a;
import io.reactivex.functions.Consumer;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u00020\u000eH\u0002J\u000e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\u0004\n\u0002\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/tinder/loops/presenter/MediaTabsPresenter;", "", "mediaTabSelectedProvider", "Lcom/tinder/loops/provider/MediaTabSelectedProvider;", "(Lcom/tinder/loops/provider/MediaTabSelectedProvider;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "mediaTabs", "", "Lcom/tinder/loops/views/MediaTabsView$MediaTab;", "[Lcom/tinder/loops/views/MediaTabsView$MediaTab;", "target", "Lcom/tinder/loops/target/MediaTabsTarget;", "drop", "", "observeTabSelections", "onTabSelected", "tabPosition", "", "take", "loops_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.loops.b.c */
public final class C9762c {
    /* renamed from: a */
    private MediaTabsTarget f32393a = ((MediaTabsTarget) new C11951c());
    /* renamed from: b */
    private final C17356a f32394b = new C17356a();
    /* renamed from: c */
    private final MediaTab[] f32395c = MediaTab.values();
    /* renamed from: d */
    private final C9763a f32396d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/loops/views/MediaTabsView$MediaTab;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.b.c$a */
    static final class C11924a<T> implements Consumer<MediaTab> {
        /* renamed from: a */
        final /* synthetic */ C9762c f38822a;

        C11924a(C9762c c9762c) {
            this.f38822a = c9762c;
        }

        public /* synthetic */ void accept(Object obj) {
            m47928a((MediaTab) obj);
        }

        /* renamed from: a */
        public final void m47928a(MediaTab mediaTab) {
            MediaTabsTarget a = this.f38822a.f32393a;
            C2668g.a(mediaTab, "it");
            a.showTab(mediaTab);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.b.c$b */
    static final class C11925b<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C11925b f38823a = new C11925b();

        C11925b() {
        }

        public /* synthetic */ void accept(Object obj) {
            m47929a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m47929a(Throwable th) {
            C0001a.c(th, "Error observing media tab selection events", new Object[0]);
        }
    }

    @Inject
    public C9762c(@NotNull C9763a c9763a) {
        C2668g.b(c9763a, "mediaTabSelectedProvider");
        this.f32396d = c9763a;
    }

    /* renamed from: a */
    public final void m40293a(@NotNull MediaTabsTarget mediaTabsTarget) {
        C2668g.b(mediaTabsTarget, "target");
        this.f32393a = mediaTabsTarget;
        m40290b();
    }

    /* renamed from: a */
    public final void m40291a() {
        this.f32393a = new C11951c();
        this.f32394b.a();
    }

    /* renamed from: a */
    public final void m40292a(int i) {
        i = this.f32395c[i];
        this.f32393a.showTab(i);
        this.f32396d.m40295a(i);
    }

    /* renamed from: b */
    private final void m40290b() {
        this.f32394b.add(this.f32396d.m40294a().distinctUntilChanged().subscribe(new C11924a(this), C11925b.f38823a));
    }
}
