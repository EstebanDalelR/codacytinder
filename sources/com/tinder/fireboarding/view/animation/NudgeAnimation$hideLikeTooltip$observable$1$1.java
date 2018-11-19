package com.tinder.fireboarding.view.animation;

import com.tinder.fireboarding.view.animation.C9607h.C11830c;
import io.reactivex.ObservableEmitter;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 10})
final class NudgeAnimation$hideLikeTooltip$observable$1$1 extends Lambda implements Function0<C15813i> {
    /* renamed from: a */
    final /* synthetic */ C11830c f44425a;
    /* renamed from: b */
    final /* synthetic */ ObservableEmitter f44426b;

    NudgeAnimation$hideLikeTooltip$observable$1$1(C11830c c11830c, ObservableEmitter observableEmitter) {
        this.f44425a = c11830c;
        this.f44426b = observableEmitter;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        m53682a();
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m53682a() {
        this.f44425a.f38569a.m39988c();
        this.f44426b.onComplete();
    }
}
