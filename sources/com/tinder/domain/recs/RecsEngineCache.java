package com.tinder.domain.recs;

import com.tinder.domain.recs.model.Rec$Source;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.Metadata;
import kotlin.collections.ae;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.subjects.C19785a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\tH\u0007J\u0014\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\tH\u0007J\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\t0\u0010J\"\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0013H\u0007R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000Rb\u0010\u0007\u001aV\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006 \n*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t0\t \n**\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006 \n*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t0\t\u0018\u00010\b0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/tinder/domain/recs/RecsEngineCache;", "", "()V", "recsEngines", "", "Lcom/tinder/domain/recs/model/Rec$Source;", "Lcom/tinder/domain/recs/RecsEngine;", "recsEnginesSubject", "Lrx/subjects/BehaviorSubject;", "", "kotlin.jvm.PlatformType", "addEngines", "", "modifiedEngines", "getEngines", "observeEngines", "Lrx/Observable;", "removeEngines", "modifiedRecSources", "", "engine_release"}, k = 1, mv = {1, 1, 9})
public final class RecsEngineCache {
    private final Map<Rec$Source, RecsEngine> recsEngines = new LinkedHashMap();
    private final C19785a<Map<Rec$Source, RecsEngine>> recsEnginesSubject = C19785a.f(ae.b(this.recsEngines));

    @NotNull
    public final synchronized Map<Rec$Source, RecsEngine> getEngines() {
        return ae.b(this.recsEngines);
    }

    @NotNull
    public final Observable<Map<Rec$Source, RecsEngine>> observeEngines() {
        Observable<Map<Rec$Source, RecsEngine>> g = this.recsEnginesSubject.e().k().g();
        C2668g.a(g, "recsEnginesSubject.asObs…  .distinctUntilChanged()");
        return g;
    }

    @NotNull
    public final synchronized Map<Rec$Source, RecsEngine> removeEngines(@NotNull Collection<? extends Rec$Source> collection) {
        Map linkedHashMap;
        C2668g.b(collection, "modifiedRecSources");
        linkedHashMap = new LinkedHashMap();
        for (Rec$Source rec$Source : collection) {
            RecsEngine recsEngine = (RecsEngine) this.recsEngines.remove(rec$Source);
            if (recsEngine != null) {
                linkedHashMap.put(rec$Source, recsEngine);
            }
        }
        this.recsEnginesSubject.onNext(ae.b(this.recsEngines));
        return ae.b(linkedHashMap);
    }

    public final synchronized void addEngines(@NotNull Map<Rec$Source, RecsEngine> map) {
        C2668g.b(map, "modifiedEngines");
        map = map.entrySet().iterator();
        while (map.hasNext()) {
            Entry entry = (Entry) map.next();
            this.recsEngines.put((Rec$Source) entry.getKey(), (RecsEngine) entry.getValue());
        }
        this.recsEnginesSubject.onNext(ae.b(this.recsEngines));
    }
}
