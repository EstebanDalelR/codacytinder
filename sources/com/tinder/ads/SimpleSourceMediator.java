package com.tinder.ads;

import com.tinder.ads.AdSource.Type;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\u0018\u0000 \u00112\u00020\u0001:\u0002\u0011\u0012B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\tH\u0016J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010H\u0016R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/tinder/ads/SimpleSourceMediator;", "Lcom/tinder/ads/SourceMediator;", "()V", "iterator", "", "Lcom/tinder/ads/AdSource;", "sources", "Ljava/util/Queue;", "addSource", "", "source", "nextSource", "removeSource", "type", "Lcom/tinder/ads/AdSource$Type;", "reset", "", "Companion", "SourceComparator", "aggregator_release"}, k = 1, mv = {1, 1, 7})
public final class SimpleSourceMediator implements SourceMediator {
    public static final Companion Companion = new Companion();
    private static final int INITIAL_SIZE = 5;
    private Iterator<? extends AdSource> iterator = this.sources.iterator();
    private final Queue<AdSource> sources = new PriorityQueue(Companion.getINITIAL_SIZE(), new SourceComparator(this, new PriorityComparator()));

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/ads/SimpleSourceMediator$Companion;", "", "()V", "INITIAL_SIZE", "", "getINITIAL_SIZE", "()I", "aggregator_release"}, k = 1, mv = {1, 1, 7})
    public static final class Companion {
        private Companion() {
        }

        private final int getINITIAL_SIZE() {
            return SimpleSourceMediator.INITIAL_SIZE;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/ads/SimpleSourceMediator$SourceComparator;", "Ljava/util/Comparator;", "Lcom/tinder/ads/AdSource;", "priorityComparator", "Lcom/tinder/ads/PriorityComparator;", "(Lcom/tinder/ads/SimpleSourceMediator;Lcom/tinder/ads/PriorityComparator;)V", "compare", "", "o1", "o2", "aggregator_release"}, k = 1, mv = {1, 1, 7})
    private final class SourceComparator implements Comparator<AdSource> {
        private final PriorityComparator priorityComparator;
        final /* synthetic */ SimpleSourceMediator this$0;

        public SourceComparator(SimpleSourceMediator simpleSourceMediator, @NotNull PriorityComparator priorityComparator) {
            C2668g.b(priorityComparator, "priorityComparator");
            this.this$0 = simpleSourceMediator;
            this.priorityComparator = priorityComparator;
        }

        public int compare(@NotNull AdSource adSource, @NotNull AdSource adSource2) {
            C2668g.b(adSource, "o1");
            C2668g.b(adSource2, "o2");
            return this.priorityComparator.compare(adSource.priority(), adSource2.priority());
        }
    }

    public SimpleSourceMediator() {
        this.sources.addAll(C19301m.a());
    }

    @Nullable
    public AdSource nextSource() {
        if (this.sources.isEmpty()) {
            return null;
        }
        synchronized (this) {
            Iterator it = this.iterator;
            if (it == null) {
                C2668g.a();
            }
            if (it.hasNext()) {
                it = this.iterator;
                if (it == null) {
                    C2668g.a();
                }
                AdSource adSource = (AdSource) it.next();
                if (adSource.isConfigured()) {
                    return adSource;
                }
                adSource = nextSource();
                return adSource;
            }
            this.iterator = this.sources.iterator();
            return null;
        }
    }

    public void reset() {
        synchronized (this) {
            this.iterator = this.sources.iterator();
            C15813i c15813i = C15813i.f49016a;
        }
    }

    @NotNull
    public Set<AdSource> sources() {
        return new HashSet(this.sources);
    }

    public void addSource(@NotNull AdSource adSource) {
        C2668g.b(adSource, "source");
        synchronized (this) {
            this.sources.add(adSource);
            this.iterator = this.sources.iterator();
            adSource = C15813i.f49016a;
        }
    }

    public void removeSource(@NotNull Type type) {
        C2668g.b(type, "type");
        synchronized (this) {
            type = this.sources.iterator();
            if (type.hasNext()) {
                this.sources.remove((AdSource) type.next());
            }
            this.iterator = this.sources.iterator();
            type = C15813i.f49016a;
        }
    }
}
