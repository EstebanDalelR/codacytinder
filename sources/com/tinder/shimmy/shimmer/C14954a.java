package com.tinder.shimmy.shimmer;

import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.subjects.PublishSubject;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\rJ\b\u0010\u000e\u001a\u00020\nH\u0007J\b\u0010\u000f\u001a\u00020\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R2\u0010\u0005\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tinder/shimmy/shimmer/FrameCallbackProvider;", "Landroid/view/Choreographer$FrameCallback;", "()V", "count", "", "subject", "Lrx/subjects/PublishSubject;", "", "kotlin.jvm.PlatformType", "doFrame", "", "frameTimeNanos", "observe", "Lrx/Observable;", "start", "stop", "Companion", "shimmy_release"}, k = 1, mv = {1, 1, 9})
/* renamed from: com.tinder.shimmy.shimmer.a */
public final class C14954a implements FrameCallback {
    /* renamed from: a */
    public static final C14953a f46688a = new C14953a();
    /* renamed from: d */
    private static C14954a f46689d;
    /* renamed from: b */
    private final PublishSubject<Long> f46690b;
    /* renamed from: c */
    private int f46691c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\u0004H\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/tinder/shimmy/shimmer/FrameCallbackProvider$Companion;", "", "()V", "sharedInstance", "Lcom/tinder/shimmy/shimmer/FrameCallbackProvider;", "getSharedInstance", "()Lcom/tinder/shimmy/shimmer/FrameCallbackProvider;", "setSharedInstance", "(Lcom/tinder/shimmy/shimmer/FrameCallbackProvider;)V", "getInstance", "shimmy_release"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.shimmy.shimmer.a$a */
    public static final class C14953a {
        private C14953a() {
        }

        /* renamed from: a */
        private final void m56481a(C14954a c14954a) {
            C14954a.f46689d = c14954a;
        }

        /* renamed from: b */
        private final C14954a m56482b() {
            return C14954a.f46689d;
        }

        @NotNull
        /* renamed from: a */
        public final synchronized C14954a m56483a() {
            C14954a b;
            if (m56482b() == null) {
                m56481a(new C14954a());
            }
            b = m56482b();
            if (b == null) {
                C2668g.a();
            }
            return b;
        }
    }

    private C14954a() {
        this.f46690b = PublishSubject.w();
    }

    /* renamed from: a */
    public final synchronized void m56486a() {
        if (this.f46691c == 0) {
            Choreographer.getInstance().postFrameCallback(this);
        }
        this.f46691c++;
    }

    /* renamed from: b */
    public final synchronized void m56487b() {
        this.f46691c--;
        if (this.f46691c == 0) {
            Choreographer.getInstance().removeFrameCallback(this);
        }
    }

    @NotNull
    /* renamed from: c */
    public final Observable<Long> m56488c() {
        Observable<Long> e = this.f46690b.l().e();
        C2668g.a(e, "subject.onBackpressureDr…          .asObservable()");
        return e;
    }

    public void doFrame(long j) {
        Choreographer.getInstance().postFrameCallback(this);
        this.f46690b.onNext(Long.valueOf(j));
    }
}
