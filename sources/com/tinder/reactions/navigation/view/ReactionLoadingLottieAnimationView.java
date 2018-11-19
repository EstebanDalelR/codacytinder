package com.tinder.reactions.navigation.view;

import android.content.Context;
import android.util.AttributeSet;
import com.airbnb.lottie.C0792d;
import com.airbnb.lottie.LottieAnimationView;
import com.tinder.reactions.p389d.C14620b;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import io.reactivex.p453a.p455b.C15674a;
import io.reactivex.subjects.SingleSubject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u000eH\u0014J\u0006\u0010\u0013\u001a\u00020\u000eR\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/tinder/reactions/navigation/view/ReactionLoadingLottieAnimationView;", "Lcom/airbnb/lottie/LottieAnimationView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "drawableSubject", "Lio/reactivex/subjects/SingleSubject;", "Lcom/airbnb/lottie/LottieDrawable;", "kotlin.jvm.PlatformType", "startAnimationDisposable", "Lio/reactivex/disposables/Disposable;", "cacheDrawable", "", "cancelAnimation", "isAnimatingOrPending", "", "onDetachedFromWindow", "playAnimationWhenReady", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class ReactionLoadingLottieAnimationView extends LottieAnimationView {
    /* renamed from: a */
    private final SingleSubject<C0792d> f58258a = SingleSubject.m66604f();
    /* renamed from: b */
    private Disposable f58259b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/airbnb/lottie/LottieDrawable;", "test"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.navigation.view.ReactionLoadingLottieAnimationView$a */
    static final class C16382a<T> implements Predicate<C0792d> {
        /* renamed from: a */
        final /* synthetic */ ReactionLoadingLottieAnimationView f50932a;

        C16382a(ReactionLoadingLottieAnimationView reactionLoadingLottieAnimationView) {
            this.f50932a = reactionLoadingLottieAnimationView;
        }

        public /* synthetic */ boolean test(Object obj) {
            return m61758a((C0792d) obj);
        }

        /* renamed from: a */
        public final boolean m61758a(@NotNull C0792d c0792d) {
            C2668g.b(c0792d, "it");
            return this.f50932a.b() ^ 1;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/airbnb/lottie/LottieDrawable;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.navigation.view.ReactionLoadingLottieAnimationView$b */
    static final class C16383b<T> implements Consumer<C0792d> {
        /* renamed from: a */
        public static final C16383b f50933a = new C16383b();

        C16383b() {
        }

        public /* synthetic */ void accept(Object obj) {
            m61759a((C0792d) obj);
        }

        /* renamed from: a */
        public final void m61759a(C0792d c0792d) {
            c0792d.h();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.navigation.view.ReactionLoadingLottieAnimationView$c */
    static final class C16384c<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C16384c f50934a = new C16384c();

        C16384c() {
        }

        public /* synthetic */ void accept(Object obj) {
            m61760a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m61760a(Throwable th) {
            C0001a.c(th, "Failed to observe lottie drawable", new Object[0]);
        }
    }

    public ReactionLoadingLottieAnimationView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.b(context, "context");
        C2668g.b(attributeSet, "attrs");
        super(context, attributeSet);
        m67196j();
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m67198e();
    }

    /* renamed from: e */
    public void m67198e() {
        super.e();
        Disposable disposable = this.f58259b;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    /* renamed from: i */
    public final void m67199i() {
        if (!m67197k()) {
            Disposable disposable = this.f58259b;
            if (disposable != null) {
                disposable.dispose();
            }
            this.f58259b = this.f58258a.a(new C16382a(this)).a(C15674a.m58830a()).a(C16383b.f50933a, C16384c.f50934a);
        }
    }

    /* renamed from: j */
    private final void m67196j() {
        C14620b.f46124a.m55780a(this, "reactionsloading_0907_1801.json", new ReactionLoadingLottieAnimationView$cacheDrawable$1(this));
    }

    /* renamed from: k */
    private final boolean m67197k() {
        if (!b()) {
            Disposable disposable = this.f58259b;
            if (disposable == null || disposable.isDisposed()) {
                return false;
            }
        }
        return true;
    }
}
