package com.tinder.superlikeable.lottie;

import com.airbnb.lottie.C0788c;
import com.tinder.superlikeable.lottie.SuperLikeableLogoLottieView.C15144a;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0018\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "p1", "Lcom/airbnb/lottie/LottieComposition;", "Lkotlin/ParameterName;", "name", "composition", "invoke"}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.superlikeable.lottie.SuperLikeableLogoLottieView$SuperLikeableLogoLottieViewDelegate$loadComposition$1 */
final class C19166xf102b84 extends FunctionReference implements Function1<C0788c, C15813i> {
    C19166xf102b84(C15144a c15144a) {
        super(1, c15144a);
    }

    public final String getName() {
        return "onLoaded";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.m59860a(C15144a.class);
    }

    public final String getSignature() {
        return "onLoaded(Lcom/airbnb/lottie/LottieComposition;)V";
    }

    public /* synthetic */ Object invoke(Object obj) {
        m68135a((C0788c) obj);
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m68135a(@Nullable C0788c c0788c) {
        ((C15144a) this.receiver).m56988a(c0788c);
    }
}
