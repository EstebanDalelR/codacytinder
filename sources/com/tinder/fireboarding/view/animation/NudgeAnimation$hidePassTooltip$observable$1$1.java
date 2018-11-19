package com.tinder.fireboarding.view.animation;

import com.tinder.fireboarding.view.animation.C9607h.C11831d;
import io.reactivex.ObservableEmitter;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 10})
final class NudgeAnimation$hidePassTooltip$observable$1$1 extends Lambda implements Function0<C15813i> {
    /* renamed from: a */
    final /* synthetic */ C11831d f44427a;
    /* renamed from: b */
    final /* synthetic */ ObservableEmitter f44428b;

    NudgeAnimation$hidePassTooltip$observable$1$1(C11831d c11831d, ObservableEmitter observableEmitter) {
        this.f44427a = c11831d;
        this.f44428b = observableEmitter;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        m53683a();
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m53683a() {
        this.f44427a.f38570a.m39996e();
        this.f44428b.onComplete();
    }
}
