package com.tinder.typingindicator.usecase;

import com.tinder.domain.injection.qualifiers.ComputationScheduler;
import com.tinder.typingindicator.model.C15326a;
import io.reactivex.C15679f;
import io.reactivex.C3957b;
import io.reactivex.FlowableTransformer;
import io.reactivex.functions.Function;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.reactivestreams.Publisher;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/typingindicator/usecase/TypingEmissionsThrottler;", "Lio/reactivex/FlowableTransformer;", "Lcom/tinder/typingindicator/model/Heartbeat;", "", "observeTypingEmissions", "Lcom/tinder/typingindicator/usecase/ObserveTypingEmissions;", "typingThrottlingScheduler", "Lio/reactivex/Scheduler;", "(Lcom/tinder/typingindicator/usecase/ObserveTypingEmissions;Lio/reactivex/Scheduler;)V", "apply", "Lorg/reactivestreams/Publisher;", "heartbeatFlowable", "Lio/reactivex/Flowable;", "domain_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.typingindicator.usecase.r */
public final class C17190r implements FlowableTransformer<C15326a, C15813i> {
    /* renamed from: a */
    private final C17180j f52739a;
    /* renamed from: b */
    private final C15679f f52740b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Flowable;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lcom/tinder/typingindicator/model/Heartbeat;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.typingindicator.usecase.r$a */
    static final class C17189a<T, R> implements Function<T, Publisher<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ C17190r f52738a;

        C17189a(C17190r c17190r) {
            this.f52738a = c17190r;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m63061a((C15326a) obj);
        }

        /* renamed from: a */
        public final C3957b<C15813i> m63061a(@NotNull C15326a c15326a) {
            C2668g.b(c15326a, "<name for destructuring parameter 0>");
            return this.f52738a.f52739a.execute().d(c15326a.m57508a(), c15326a.m57509b(), this.f52738a.f52740b);
        }
    }

    @Inject
    public C17190r(@NotNull C17180j c17180j, @NotNull @ComputationScheduler C15679f c15679f) {
        C2668g.b(c17180j, "observeTypingEmissions");
        C2668g.b(c15679f, "typingThrottlingScheduler");
        this.f52739a = c17180j;
        this.f52740b = c15679f;
    }

    @NotNull
    public Publisher<C15813i> apply(@NotNull C3957b<C15326a> c3957b) {
        C2668g.b(c3957b, "heartbeatFlowable");
        c3957b = c3957b.i(new C17189a(this));
        C2668g.a(c3957b, "heartbeatFlowable.switch…tlingScheduler)\n        }");
        return c3957b;
    }
}
