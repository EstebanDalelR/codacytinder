package com.tinder.loops.data;

import com.tinder.loops.engine.creation.p277d.C9781a;
import io.reactivex.C3957b;
import io.reactivex.processors.BehaviorProcessor;
import io.reactivex.processors.C18430a;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0005H\u0016R\u001c\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/loops/data/LoopsEngineCroppingRectangleRepository;", "Lcom/tinder/loops/data/CroppingRectangleRepository;", "()V", "croppingRectangleProcessor", "Lio/reactivex/processors/FlowableProcessor;", "Lcom/tinder/loops/engine/creation/model/CroppingRectangle;", "kotlin.jvm.PlatformType", "clear", "", "observeCroppingRectangle", "Lio/reactivex/Flowable;", "update", "croppingRectangle", "loopsengine_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.loops.data.e */
public final class C11931e implements CroppingRectangleRepository {
    /* renamed from: a */
    private final C18430a<C9781a> f38832a = BehaviorProcessor.d(C9781a.f32416a.m40337a()).u();

    @NotNull
    public C3957b<C9781a> observeCroppingRectangle() {
        C3957b<C9781a> g = this.f38832a.g();
        C2668g.a(g, "croppingRectangleProcessor.hide()");
        return g;
    }

    public void update(@NotNull C9781a c9781a) {
        C2668g.b(c9781a, "croppingRectangle");
        this.f38832a.onNext(c9781a);
    }

    public void clear() {
        this.f38832a.onNext(C9781a.f32416a.m40337a());
    }
}
