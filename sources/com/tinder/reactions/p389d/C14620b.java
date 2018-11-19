package com.tinder.reactions.p389d;

import com.airbnb.lottie.C0788c;
import com.airbnb.lottie.C0788c.C0787a;
import com.airbnb.lottie.C0792d;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.OnCompositionLoadedListener;
import com.tinder.utils.RxUtils;
import java.util.concurrent.Callable;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;
import rx.Single;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J9\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00040\nJ\u0012\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002¨\u0006\u0014"}, d2 = {"Lcom/tinder/reactions/utils/LottieUtils;", "", "()V", "loadLottieDrawable", "", "animationView", "Lcom/airbnb/lottie/LottieAnimationView;", "animationFileName", "", "onDrawableReadyAction", "Lkotlin/Function1;", "Lcom/airbnb/lottie/LottieDrawable;", "Lkotlin/ParameterName;", "name", "lottieDrawable", "makeDrawableAndSetComposition", "composition", "Lcom/airbnb/lottie/LottieComposition;", "observeLottieDrawablePreparation", "Lrx/Single;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.d.b */
public final class C14620b {
    /* renamed from: a */
    public static final C14620b f46124a = new C14620b();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/airbnb/lottie/LottieDrawable;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.d.b$b */
    static final class C14619b<V> implements Callable<T> {
        /* renamed from: a */
        final /* synthetic */ C0788c f46123a;

        C14619b(C0788c c0788c) {
            this.f46123a = c0788c;
        }

        public /* synthetic */ Object call() {
            return m55775a();
        }

        @NotNull
        /* renamed from: a */
        public final C0792d m55775a() {
            return C14620b.f46124a.m55778b(this.f46123a);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "composition", "Lcom/airbnb/lottie/LottieComposition;", "onCompositionLoaded"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.d.b$a */
    static final class C16314a implements OnCompositionLoadedListener {
        /* renamed from: a */
        final /* synthetic */ Function1 f50752a;
        /* renamed from: b */
        final /* synthetic */ String f50753b;

        C16314a(Function1 function1, String str) {
            this.f50752a = function1;
            this.f50753b = str;
        }

        public final void onCompositionLoaded(@Nullable C0788c c0788c) {
            C14620b.f46124a.m55776a(c0788c).a(RxUtils.a().m67518a()).a(new Action1<C0792d>() {
                public /* synthetic */ void call(Object obj) {
                    m67127a((C0792d) obj);
                }

                /* renamed from: a */
                public final void m67127a(C0792d c0792d) {
                    Function1 function1 = this.f50752a;
                    C2668g.a(c0792d, "lottieDrawable");
                    function1.invoke(c0792d);
                }
            }, new Action1<Throwable>() {
                public /* synthetic */ void call(Object obj) {
                    m67128a((Throwable) obj);
                }

                /* renamed from: a */
                public final void m67128a(Throwable th) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Couldn't set ");
                    stringBuilder.append(this.f50753b);
                    stringBuilder.append(" animation asynchronously");
                    C0001a.c(th, stringBuilder.toString(), new Object[0]);
                }
            });
        }
    }

    private C14620b() {
    }

    /* renamed from: a */
    public final void m55780a(@NotNull LottieAnimationView lottieAnimationView, @NotNull String str, @NotNull Function1<? super C0792d, C15813i> function1) {
        C2668g.b(lottieAnimationView, "animationView");
        C2668g.b(str, "animationFileName");
        C2668g.b(function1, "onDrawableReadyAction");
        C0787a.a(lottieAnimationView.getContext(), str, new C16314a(function1, str));
    }

    /* renamed from: a */
    private final Single<C0792d> m55776a(C0788c c0788c) {
        c0788c = Single.a(new C14619b(c0788c));
        C2668g.a(c0788c, "Single.fromCallable({\n  …n(composition)\n        })");
        return c0788c;
    }

    /* renamed from: b */
    private final C0792d m55778b(C0788c c0788c) {
        C0792d c0792d = new C0792d();
        c0792d.a(c0788c);
        return c0792d;
    }
}
