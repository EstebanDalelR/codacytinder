package com.tinder.places.card.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 10})
final class PlaceCardAlternativesView$animateOutAlternatives$1 extends Lambda implements Function0<C15813i> {
    /* renamed from: a */
    final /* synthetic */ PlaceCardAlternativesView f44944a;
    /* renamed from: b */
    final /* synthetic */ Function0 f44945b;
    /* renamed from: c */
    final /* synthetic */ long f44946c;

    PlaceCardAlternativesView$animateOutAlternatives$1(PlaceCardAlternativesView placeCardAlternativesView, Function0 function0, long j) {
        this.f44944a = placeCardAlternativesView;
        this.f44945b = function0;
        this.f44946c = j;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        m53864a();
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m53864a() {
        this.f44945b.invoke();
        this.f44944a.f39857i = ObjectAnimator.ofFloat(this.f44944a, "alpha", new float[]{1.0f, 0.0f});
        Animator a = this.f44944a.f39857i;
        if (a != null) {
            a.addListener(new AnimatorListenerAdapter() {
                public void onAnimationEnd(@Nullable Animator animator) {
                    this.f44944a.setVisibility(8);
                    this.f44944a.setAlpha(1.0f);
                    this.f44944a.f39857i = (Animator) null;
                }
            });
        }
        a = this.f44944a.f39857i;
        if (a != null) {
            a.setDuration(this.f44946c);
        }
        a = this.f44944a.f39857i;
        if (a != null) {
            a.start();
        }
    }
}
