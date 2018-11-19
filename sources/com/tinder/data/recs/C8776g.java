package com.tinder.data.recs;

import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0005H\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/data/recs/RecsAlreadySwipedProvider;", "", "()V", "recIdsAlreadySwipedOn", "Ljava/util/HashSet;", "", "isRecAlreadySwipedOn", "", "recId", "markRecIdAsSwipedOn", "", "Companion", "engine_release"}, k = 1, mv = {1, 1, 9})
/* renamed from: com.tinder.data.recs.g */
public final class C8776g {
    /* renamed from: a */
    public static final C8775a f30828a = new C8775a();
    /* renamed from: c */
    private static final int f30829c = 50;
    /* renamed from: b */
    private final HashSet<String> f30830b = new HashSet(f30828a.m37379a());

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/data/recs/RecsAlreadySwipedProvider$Companion;", "", "()V", "SET_INITIAL_CAPACITY", "", "getSET_INITIAL_CAPACITY", "()I", "engine_release"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.data.recs.g$a */
    public static final class C8775a {
        private C8775a() {
        }

        /* renamed from: a */
        private final int m37379a() {
            return C8776g.f30829c;
        }
    }

    /* renamed from: a */
    public final synchronized void m37382a(@NotNull String str) {
        C2668g.b(str, "recId");
        this.f30830b.add(str);
    }

    /* renamed from: b */
    public final synchronized boolean m37383b(@NotNull String str) {
        C2668g.b(str, "recId");
        return this.f30830b.contains(str);
    }
}
