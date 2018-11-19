package com.tinder.places.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.etl.event.qo;
import com.tinder.etl.event.qo.C9208a;
import com.tinder.utils.RxUtils;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.functions.Action0;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\tB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/places/analytics/AddPlacesOnboardingEvent;", "", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "(Lcom/tinder/analytics/fireworks/Fireworks;)V", "add", "", "step", "Lcom/tinder/places/analytics/AddPlacesOnboardingEvent$Step;", "Step", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class AddPlacesOnboardingEvent {
    /* renamed from: a */
    private final C2630h f33074a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/tinder/places/analytics/AddPlacesOnboardingEvent$Step;", "", "(Ljava/lang/String;I)V", "INTRO_SHORT", "INTRO_1", "INTRO_2", "INTRO_3", "INTRO_FINAL", "LOCATION", "FAQ", "SKIP", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public enum Step {
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.analytics.AddPlacesOnboardingEvent$a */
    static final class C14135a implements Action0 {
        /* renamed from: a */
        final /* synthetic */ AddPlacesOnboardingEvent f44849a;
        /* renamed from: b */
        final /* synthetic */ Step f44850b;

        C14135a(AddPlacesOnboardingEvent addPlacesOnboardingEvent, Step step) {
            this.f44849a = addPlacesOnboardingEvent;
            this.f44850b = step;
        }

        public final void call() {
            C9208a a = qo.m45932a();
            String name = this.f44850b.name();
            if (name == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            name = name.toLowerCase();
            C2668g.a(name, "(this as java.lang.String).toLowerCase()");
            this.f44849a.f33074a.a(a.m38625a(name).m38626a());
        }
    }

    @Inject
    public AddPlacesOnboardingEvent(@NotNull C2630h c2630h) {
        C2668g.b(c2630h, "fireworks");
        this.f33074a = c2630h;
    }

    /* renamed from: a */
    public final void m41310a(@NotNull Step step) {
        C2668g.b(step, "step");
        Completable.a(new C14135a(this, step)).b(RxUtils.a("AddPlacesOnboardingEvent failed"));
    }
}
