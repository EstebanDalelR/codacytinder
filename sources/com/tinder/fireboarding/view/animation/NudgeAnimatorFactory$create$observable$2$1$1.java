package com.tinder.fireboarding.view.animation;

import com.tinder.fireboarding.view.animation.NudgeAnimatorFactory.C11826b.C118251;
import io.reactivex.ObservableEmitter;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 10})
final class NudgeAnimatorFactory$create$observable$2$1$1 extends Lambda implements Function0<C15813i> {
    /* renamed from: a */
    final /* synthetic */ C118251 f44439a;
    /* renamed from: b */
    final /* synthetic */ ObservableEmitter f44440b;

    NudgeAnimatorFactory$create$observable$2$1$1(C118251 c118251, ObservableEmitter observableEmitter) {
        this.f44439a = c118251;
        this.f44440b = observableEmitter;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        m53688a();
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m53688a() {
        this.f44439a.f38555a.f38562f.invoke();
        this.f44440b.onComplete();
    }
}
