package com.tinder.discovery.domain;

import com.tinder.discovery.model.DiscoverySegment;
import com.tinder.domain.common.reactivex.usecase.CompletableUseCase;
import io.reactivex.C3956a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00020\u0001B\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\"\u0010\t\u001a\u00020\n2\u0018\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/discovery/domain/UpdateDiscoverySegments;", "Lcom/tinder/domain/common/reactivex/usecase/CompletableUseCase;", "", "Lkotlin/Pair;", "Lcom/tinder/discovery/model/DiscoverySegment;", "", "discoverySegmentRepository", "Lcom/tinder/discovery/domain/DiscoverySegmentRepository;", "(Lcom/tinder/discovery/domain/DiscoverySegmentRepository;)V", "execute", "Lio/reactivex/Completable;", "request", "discovery_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.discovery.domain.b */
public final class C11144b implements CompletableUseCase<List<? extends Pair<? extends DiscoverySegment, ? extends Boolean>>> {
    /* renamed from: a */
    private final DiscoverySegmentRepository f36033a;

    public C11144b(@NotNull DiscoverySegmentRepository discoverySegmentRepository) {
        C2668g.b(discoverySegmentRepository, "discoverySegmentRepository");
        this.f36033a = discoverySegmentRepository;
    }

    public /* synthetic */ C3956a execute(Object obj) {
        return m43887a((List) obj);
    }

    @NotNull
    /* renamed from: a */
    public C3956a m43887a(@NotNull List<? extends Pair<? extends DiscoverySegment, Boolean>> list) {
        C2668g.b(list, "request");
        for (Pair c : list) {
            Object obj;
            if (((DiscoverySegment) c.c()) != DiscoverySegment.RECS) {
                obj = 1;
                continue;
            } else {
                obj = null;
                continue;
            }
            if (obj == null) {
                list = new StringBuilder();
                list.append("Trying to update ");
                list.append(DiscoverySegment.RECS);
                throw new IllegalStateException(list.toString().toString());
            }
        }
        return this.f36033a.updateDiscoverySegments(list);
    }
}
