package androidx.p012a.p013a;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u001a¦\u0001\u0010\u0000\u001a\u00020\u0001*\u00020\u00022%\b\u0002\u0010\u0003\u001a\u001f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00042%\b\u0002\u0010\t\u001a\u001f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00042%\b\u0002\u0010\n\u001a\u001f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00042%\b\u0002\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0004\u001aZ\u0010\f\u001a\u00020\r*\u00020\u00022%\b\u0002\u0010\u000e\u001a\u001f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00042%\b\u0002\u0010\u000f\u001a\u001f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0004H\u0007\u001a-\u0010\u0010\u001a\u00020\u0001*\u00020\u00022!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004\u001a-\u0010\u0012\u001a\u00020\u0001*\u00020\u00022!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004\u001a/\u0010\u0013\u001a\u00020\r*\u00020\u00022!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0007\u001a-\u0010\u0014\u001a\u00020\u0001*\u00020\u00022!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004\u001a/\u0010\u0015\u001a\u00020\r*\u00020\u00022!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0007\u001a-\u0010\u0016\u001a\u00020\u0001*\u00020\u00022!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004¨\u0006\u0017"}, d2 = {"addListener", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "onEnd", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "animator", "", "onStart", "onCancel", "onRepeat", "addPauseListener", "Landroid/animation/Animator$AnimatorPauseListener;", "onResume", "onPause", "doOnCancel", "action", "doOnEnd", "doOnPause", "doOnRepeat", "doOnResume", "doOnStart", "core-ktx_release"}, k = 2, mv = {1, 1, 9})
/* renamed from: androidx.a.a.a */
public final class C0745a {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\n"}, d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "onAnimationCancel", "", "animator", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "core-ktx_release"}, k = 1, mv = {1, 1, 9})
    /* renamed from: androidx.a.a.a$a */
    public static final class C0744a implements AnimatorListener {
        /* renamed from: a */
        final /* synthetic */ Function1 f2018a;
        /* renamed from: b */
        final /* synthetic */ Function1 f2019b;
        /* renamed from: c */
        final /* synthetic */ Function1 f2020c;
        /* renamed from: d */
        final /* synthetic */ Function1 f2021d;

        C0744a(Function1 function1, Function1 function12, Function1 function13, Function1 function14) {
            this.f2018a = function1;
            this.f2019b = function12;
            this.f2020c = function13;
            this.f2021d = function14;
        }

        public void onAnimationRepeat(@NotNull Animator animator) {
            Function1 function1 = this.f2018a;
            if (function1 != null) {
                C15813i c15813i = (C15813i) function1.invoke(animator);
            }
        }

        public void onAnimationEnd(@NotNull Animator animator) {
            Function1 function1 = this.f2019b;
            if (function1 != null) {
                C15813i c15813i = (C15813i) function1.invoke(animator);
            }
        }

        public void onAnimationCancel(@NotNull Animator animator) {
            Function1 function1 = this.f2020c;
            if (function1 != null) {
                C15813i c15813i = (C15813i) function1.invoke(animator);
            }
        }

        public void onAnimationStart(@NotNull Animator animator) {
            Function1 function1 = this.f2021d;
            if (function1 != null) {
                C15813i c15813i = (C15813i) function1.invoke(animator);
            }
        }
    }

    @NotNull
    /* renamed from: a */
    public static /* bridge */ /* synthetic */ AnimatorListener m2652a(Animator animator, Function1 function1, Function1 function12, Function1 function13, Function1 function14, int i, Object obj) {
        if ((i & 1) != null) {
            function1 = null;
        }
        if ((i & 2) != null) {
            function12 = null;
        }
        if ((i & 4) != null) {
            function13 = null;
        }
        if ((i & 8) != 0) {
            function14 = null;
        }
        return C0745a.m2651a(animator, function1, function12, function13, function14);
    }

    @NotNull
    /* renamed from: a */
    public static final AnimatorListener m2651a(@NotNull Animator animator, @Nullable Function1<? super Animator, C15813i> function1, @Nullable Function1<? super Animator, C15813i> function12, @Nullable Function1<? super Animator, C15813i> function13, @Nullable Function1<? super Animator, C15813i> function14) {
        AnimatorListener c0744a = new C0744a(function14, function1, function13, function12);
        animator.addListener(c0744a);
        return c0744a;
    }
}
