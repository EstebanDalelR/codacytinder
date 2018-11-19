package com.tinder.domain.recs;

import com.tinder.domain.recs.RecsEngine.Configurator.Factory;
import com.tinder.domain.recs.model.Rec$Source;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.collections.ae;
import kotlin.collections.ak;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001bB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001f\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0014\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u0011J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\u0014J\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\f\u001a\u00020\rJ\u0018\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\u00140\u0016J\u000e\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rJ\u0014\u0010\u001a\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u0011R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/tinder/domain/recs/RecsEngineRegistry;", "", "recsEngineConfiguratorFactory", "Lcom/tinder/domain/recs/RecsEngine$Configurator$Factory;", "(Lcom/tinder/domain/recs/RecsEngine$Configurator$Factory;)V", "recsEngineCache", "Lcom/tinder/domain/recs/RecsEngineCache;", "recsEngineFactory", "Lcom/tinder/domain/recs/RecsEngine$Factory;", "(Lcom/tinder/domain/recs/RecsEngineCache;Lcom/tinder/domain/recs/RecsEngine$Configurator$Factory;Lcom/tinder/domain/recs/RecsEngine$Factory;)V", "addEngineIfAbsent", "Lcom/tinder/domain/recs/RecsEngine;", "recSource", "Lcom/tinder/domain/recs/model/Rec$Source;", "addEnginesIfAbsent", "", "modifiedRecSources", "", "getEngine", "getEngines", "", "observeEngineAvailabilityStatus", "Lrx/Observable;", "Lcom/tinder/domain/recs/RecsEngineRegistry$EngineAvailabilityStatus;", "observeEngines", "removeEngine", "removeEngines", "EngineAvailabilityStatus", "engine_release"}, k = 1, mv = {1, 1, 9})
public final class RecsEngineRegistry {
    private final RecsEngineCache recsEngineCache;
    private final Factory recsEngineConfiguratorFactory;
    private final RecsEngine.Factory recsEngineFactory;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/domain/recs/RecsEngineRegistry$EngineAvailabilityStatus;", "", "()V", "Available", "NotAvailable", "Lcom/tinder/domain/recs/RecsEngineRegistry$EngineAvailabilityStatus$Available;", "Lcom/tinder/domain/recs/RecsEngineRegistry$EngineAvailabilityStatus$NotAvailable;", "engine_release"}, k = 1, mv = {1, 1, 9})
    public static abstract class EngineAvailabilityStatus {

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/tinder/domain/recs/RecsEngineRegistry$EngineAvailabilityStatus$Available;", "Lcom/tinder/domain/recs/RecsEngineRegistry$EngineAvailabilityStatus;", "recsEngine", "Lcom/tinder/domain/recs/RecsEngine;", "(Lcom/tinder/domain/recs/RecsEngine;)V", "getRecsEngine", "()Lcom/tinder/domain/recs/RecsEngine;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "engine_release"}, k = 1, mv = {1, 1, 9})
        public static final class Available extends EngineAvailabilityStatus {
            @NotNull
            private final RecsEngine recsEngine;

            @NotNull
            public static /* synthetic */ Available copy$default(Available available, RecsEngine recsEngine, int i, Object obj) {
                if ((i & 1) != 0) {
                    recsEngine = available.recsEngine;
                }
                return available.copy(recsEngine);
            }

            @NotNull
            public final RecsEngine component1() {
                return this.recsEngine;
            }

            @NotNull
            public final Available copy(@NotNull RecsEngine recsEngine) {
                C2668g.b(recsEngine, "recsEngine");
                return new Available(recsEngine);
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof Available) {
                        if (C2668g.a(this.recsEngine, ((Available) obj).recsEngine)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                RecsEngine recsEngine = this.recsEngine;
                return recsEngine != null ? recsEngine.hashCode() : 0;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Available(recsEngine=");
                stringBuilder.append(this.recsEngine);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }

            public Available(@NotNull RecsEngine recsEngine) {
                C2668g.b(recsEngine, "recsEngine");
                super();
                this.recsEngine = recsEngine;
            }

            @NotNull
            public final RecsEngine getRecsEngine() {
                return this.recsEngine;
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/domain/recs/RecsEngineRegistry$EngineAvailabilityStatus$NotAvailable;", "Lcom/tinder/domain/recs/RecsEngineRegistry$EngineAvailabilityStatus;", "()V", "engine_release"}, k = 1, mv = {1, 1, 9})
        public static final class NotAvailable extends EngineAvailabilityStatus {
            public static final NotAvailable INSTANCE = new NotAvailable();

            private NotAvailable() {
                super();
            }
        }

        private EngineAvailabilityStatus() {
        }
    }

    public RecsEngineRegistry(@NotNull RecsEngineCache recsEngineCache, @NotNull Factory factory, @NotNull RecsEngine.Factory factory2) {
        C2668g.b(recsEngineCache, "recsEngineCache");
        C2668g.b(factory, "recsEngineConfiguratorFactory");
        C2668g.b(factory2, "recsEngineFactory");
        this.recsEngineCache = recsEngineCache;
        this.recsEngineConfiguratorFactory = factory;
        this.recsEngineFactory = factory2;
    }

    public RecsEngineRegistry(@NotNull Factory factory) {
        C2668g.b(factory, "recsEngineConfiguratorFactory");
        this(new RecsEngineCache(), factory, new RecsEngine.Factory());
    }

    @Nullable
    public final RecsEngine getEngine(@NotNull Rec$Source rec$Source) {
        C2668g.b(rec$Source, "recSource");
        return (RecsEngine) this.recsEngineCache.getEngines().get(rec$Source);
    }

    @NotNull
    public final Map<Rec$Source, RecsEngine> getEngines() {
        return this.recsEngineCache.getEngines();
    }

    @NotNull
    public final Observable<Map<Rec$Source, RecsEngine>> observeEngines() {
        return this.recsEngineCache.observeEngines();
    }

    @NotNull
    public final Observable<EngineAvailabilityStatus> observeEngineAvailabilityStatus(@NotNull Rec$Source rec$Source) {
        C2668g.b(rec$Source, "recSource");
        rec$Source = this.recsEngineCache.observeEngines().k(new RecsEngineRegistry$observeEngineAvailabilityStatus$1(rec$Source)).g();
        C2668g.a(rec$Source, "recsEngineCache.observeE…  .distinctUntilChanged()");
        return rec$Source;
    }

    @NotNull
    public final synchronized RecsEngine addEngineIfAbsent(@NotNull Rec$Source rec$Source) {
        C2668g.b(rec$Source, "recSource");
        addEnginesIfAbsent(ak.a(rec$Source));
        rec$Source = getEngine(rec$Source);
        if (rec$Source == null) {
            C2668g.a();
        }
        return rec$Source;
    }

    public final void addEnginesIfAbsent(@NotNull Collection<? extends Rec$Source> collection) {
        C2668g.b(collection, "modifiedRecSources");
        collection = C19301m.q(collection);
        collection.removeAll(this.recsEngineCache.getEngines().keySet());
        if (!collection.isEmpty()) {
            Iterable<Rec$Source> iterable = collection;
            Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
            for (Rec$Source create : iterable) {
                arrayList.add(this.recsEngineFactory.create(this.recsEngineConfiguratorFactory.create(create)));
            }
            this.recsEngineCache.addEngines(ae.a(C19301m.c(iterable, (List) arrayList)));
        }
    }

    public final void removeEngine(@NotNull Rec$Source rec$Source) {
        C2668g.b(rec$Source, "recSource");
        removeEngines(ak.a(rec$Source));
    }

    public final void removeEngines(@NotNull Collection<? extends Rec$Source> collection) {
        C2668g.b(collection, "modifiedRecSources");
        collection = C19301m.q(collection);
        collection.retainAll(this.recsEngineCache.getEngines().keySet());
        if (!collection.isEmpty()) {
            collection = this.recsEngineCache.removeEngines(collection).values().iterator();
            while (collection.hasNext()) {
                ((RecsEngine) collection.next()).dispose$engine_release();
            }
        }
    }
}
