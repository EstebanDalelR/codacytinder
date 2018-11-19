package com.tinder.discovery.p232b;

import com.tinder.discovery.domain.DiscoverySegmentDataStore;
import com.tinder.discovery.domain.DiscoverySegmentRepository;
import com.tinder.discovery.model.DiscoverySegment;
import io.reactivex.C3956a;
import io.reactivex.C3957b;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.processors.C18430a;
import io.reactivex.processors.PublishProcessor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u000bH\u0016J\"\u0010\r\u001a\u00020\u000e2\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00100\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tinder/discovery/data/DiscoverySegmentRepositoryImpl;", "Lcom/tinder/discovery/domain/DiscoverySegmentRepository;", "discoverySegmentDataStore", "Lcom/tinder/discovery/domain/DiscoverySegmentDataStore;", "(Lcom/tinder/discovery/domain/DiscoverySegmentDataStore;)V", "processor", "Lio/reactivex/processors/FlowableProcessor;", "", "Lcom/tinder/discovery/model/DiscoverySegment;", "", "observeDiscoverySegments", "Lio/reactivex/Flowable;", "", "updateDiscoverySegments", "Lio/reactivex/Completable;", "updates", "Lkotlin/Pair;", "discovery_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.discovery.b.c */
public final class C11135c implements DiscoverySegmentRepository {
    /* renamed from: a */
    private final C18430a<Map<DiscoverySegment, Boolean>> f36021a;
    /* renamed from: b */
    private final DiscoverySegmentDataStore f36022b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lcom/tinder/discovery/model/DiscoverySegment;", "it", "", "", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.discovery.b.c$a */
    static final class C11133a<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C11133a f36019a = new C11133a();

        C11133a() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43876a((Map) obj);
        }

        @NotNull
        /* renamed from: a */
        public final List<DiscoverySegment> m43876a(@NotNull Map<DiscoverySegment, Boolean> map) {
            C2668g.b(map, "it");
            Map linkedHashMap = new LinkedHashMap();
            map = map.entrySet().iterator();
            while (map.hasNext()) {
                Entry entry = (Entry) map.next();
                if (((Boolean) entry.getValue()).booleanValue()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Collection collection = (Collection) new ArrayList(linkedHashMap.size());
            for (Entry entry2 : linkedHashMap.entrySet()) {
                collection.add((DiscoverySegment) entry2.getKey());
            }
            return C19301m.l((List) collection);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "it", "", "Lcom/tinder/discovery/model/DiscoverySegment;", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.discovery.b.c$b */
    static final class C11134b<T> implements Consumer<Map<DiscoverySegment, ? extends Boolean>> {
        /* renamed from: a */
        final /* synthetic */ C11135c f36020a;

        C11134b(C11135c c11135c) {
            this.f36020a = c11135c;
        }

        public /* synthetic */ void accept(Object obj) {
            m43877a((Map) obj);
        }

        /* renamed from: a */
        public final void m43877a(Map<DiscoverySegment, Boolean> map) {
            this.f36020a.f36021a.onNext(map);
        }
    }

    public C11135c(@NotNull DiscoverySegmentDataStore discoverySegmentDataStore) {
        C2668g.b(discoverySegmentDataStore, "discoverySegmentDataStore");
        this.f36022b = discoverySegmentDataStore;
        discoverySegmentDataStore = PublishProcessor.q().u();
        C2668g.a(discoverySegmentDataStore, "PublishProcessor.create<…oolean>>().toSerialized()");
        this.f36021a = discoverySegmentDataStore;
    }

    @NotNull
    public C3957b<List<DiscoverySegment>> observeDiscoverySegments() {
        C3957b<List<DiscoverySegment>> f = this.f36022b.load().d().b(this.f36021a).f(C11133a.f36019a);
        C2668g.a(f, "discoverySegmentDataStor…  .toList()\n            }");
        return f;
    }

    @NotNull
    public C3956a updateDiscoverySegments(@NotNull List<? extends Pair<? extends DiscoverySegment, Boolean>> list) {
        C2668g.b(list, "updates");
        list = this.f36022b.update(list).a(this.f36022b.load()).b(new C11134b(this)).c();
        C2668g.a(list, "discoverySegmentDataStor…         .toCompletable()");
        return list;
    }
}
