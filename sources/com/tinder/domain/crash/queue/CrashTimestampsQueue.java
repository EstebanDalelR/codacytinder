package com.tinder.domain.crash.queue;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\u0002J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/tinder/domain/crash/queue/CrashTimestampsQueue;", "", "", "()V", "queue", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "size", "", "getSize", "()I", "clear", "", "dequeue", "enqueue", "", "crashTimestamp", "iterator", "", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class CrashTimestampsQueue implements Iterable<Long>, KMappedMarker {
    private final ConcurrentLinkedQueue<Long> queue = new ConcurrentLinkedQueue();

    public final boolean enqueue(long j) {
        return this.queue.add(Long.valueOf(j));
    }

    public final long dequeue() {
        Object remove = this.queue.remove();
        C2668g.a(remove, "queue.remove()");
        return ((Number) remove).longValue();
    }

    public final void clear() {
        this.queue.clear();
    }

    public final int getSize() {
        return this.queue.size();
    }

    @NotNull
    public Iterator<Long> iterator() {
        Iterator<Long> it = this.queue.iterator();
        C2668g.a(it, "queue.iterator()");
        return it;
    }
}
