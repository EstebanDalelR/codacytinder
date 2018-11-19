package com.tinder.discovery.domain;

import com.tinder.discovery.model.DiscoverySegment;
import com.tinder.domain.common.reactivex.usecase.FlowableResultUseCase;
import io.reactivex.C3957b;
import io.reactivex.functions.Function;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/discovery/domain/ObserverDiscoverySegments;", "Lcom/tinder/domain/common/reactivex/usecase/FlowableResultUseCase;", "", "Lcom/tinder/discovery/model/DiscoverySegment;", "discoverySegmentRepository", "Lcom/tinder/discovery/domain/DiscoverySegmentRepository;", "discoverySegmentSequencer", "Lcom/tinder/discovery/domain/DiscoverySegmentSequencer;", "(Lcom/tinder/discovery/domain/DiscoverySegmentRepository;Lcom/tinder/discovery/domain/DiscoverySegmentSequencer;)V", "execute", "Lio/reactivex/Flowable;", "discovery_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.discovery.domain.a */
public final class C11143a implements FlowableResultUseCase<List<? extends DiscoverySegment>> {
    /* renamed from: a */
    private final DiscoverySegmentRepository f36031a;
    /* renamed from: b */
    private final DiscoverySegmentSequencer f36032b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lcom/tinder/discovery/model/DiscoverySegment;", "it", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.discovery.domain.a$a */
    static final class C11142a<T, R> implements Function<T, R> {
        /* renamed from: a */
        final /* synthetic */ C11143a f36030a;

        C11142a(C11143a c11143a) {
            this.f36030a = c11143a;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43885a((List) obj);
        }

        @NotNull
        /* renamed from: a */
        public final List<DiscoverySegment> m43885a(@NotNull List<? extends DiscoverySegment> list) {
            C2668g.b(list, "it");
            return this.f36030a.f36032b.sort(list);
        }
    }

    public C11143a(@NotNull DiscoverySegmentRepository discoverySegmentRepository, @NotNull DiscoverySegmentSequencer discoverySegmentSequencer) {
        C2668g.b(discoverySegmentRepository, "discoverySegmentRepository");
        C2668g.b(discoverySegmentSequencer, "discoverySegmentSequencer");
        this.f36031a = discoverySegmentRepository;
        this.f36032b = discoverySegmentSequencer;
    }

    @NotNull
    public C3957b<List<DiscoverySegment>> execute() {
        C3957b<List<DiscoverySegment>> f = this.f36031a.observeDiscoverySegments().f(new C11142a(this));
        C2668g.a(f, "discoverySegmentReposito…gmentSequencer.sort(it) }");
        return f;
    }
}
