package com.tinder.data.recs;

import com.tinder.domain.di.EngineScope;
import com.tinder.domain.recs.model.Rec$Source;
import com.tinder.domain.recs.model.Swipe;
import java.util.ArrayDeque;
import java.util.HashSet;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u0001 B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000bJ\u0006\u0010\u0015\u001a\u00020\u0013J\u0006\u0010\u0016\u001a\u00020\u0013J\u000e\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u000eJ\b\u0010\u0019\u001a\u0004\u0018\u00010\u000bJ\b\u0010\u001a\u001a\u0004\u0018\u00010\u000bJ\u000e\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000bJ\u000e\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000bJ\u0006\u0010\u001d\u001a\u00020\u001eJ\b\u0010\u001f\u001a\u00020\u0011H\u0002R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/tinder/data/recs/RewindStack;", "", "source", "Lcom/tinder/domain/recs/model/Rec$Source;", "(Lcom/tinder/domain/recs/model/Rec$Source;)V", "config", "Lcom/tinder/data/recs/RewindStack$Config;", "getConfig", "()Lcom/tinder/data/recs/RewindStack$Config;", "rewindDeque", "Ljava/util/ArrayDeque;", "Lcom/tinder/domain/recs/model/Swipe;", "rewoundRecIdSet", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "clear", "", "contains", "", "swipe", "containsRewound", "isEmpty", "isRewound", "recId", "peek", "pop", "push", "remove", "size", "", "trimRewindStackIfApplicable", "Config", "engine_release"}, k = 1, mv = {1, 1, 9})
@EngineScope
/* renamed from: com.tinder.data.recs.l */
public final class C8788l {
    @NotNull
    /* renamed from: a */
    private final C8787a f30853a = new C8787a(0, 1, null);
    /* renamed from: b */
    private final ArrayDeque<Swipe> f30854b = new ArrayDeque();
    /* renamed from: c */
    private final HashSet<String> f30855c = new HashSet();
    /* renamed from: d */
    private final Rec$Source f30856d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\u0003HÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/tinder/data/recs/RewindStack$Config;", "", "maxSize", "", "(I)V", "getMaxSize", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "engine_release"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.data.recs.l$a */
    public static final class C8787a {
        /* renamed from: a */
        private final int f30852a;

        public C8787a() {
            this(0, 1, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C8787a) {
                if ((this.f30852a == ((C8787a) obj).f30852a ? 1 : null) != null) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f30852a;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Config(maxSize=");
            stringBuilder.append(this.f30852a);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C8787a(int i) {
            this.f30852a = i;
        }

        public /* synthetic */ C8787a(int i, int i2, C15823e c15823e) {
            if ((i2 & 1) != 0) {
                i = 1;
            }
            this(i);
        }

        /* renamed from: a */
        public final int m37396a() {
            return this.f30852a;
        }
    }

    @Inject
    public C8788l(@NotNull Rec$Source rec$Source) {
        C2668g.b(rec$Source, "source");
        this.f30856d = rec$Source;
    }

    /* renamed from: a */
    public final void m37399a(@NotNull Swipe swipe) {
        C2668g.b(swipe, "swipe");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(this.f30856d);
        stringBuilder.append(" - push(): ");
        stringBuilder.append(swipe);
        C0001a.a(stringBuilder.toString(), new Object[0]);
        m37397d();
        this.f30854b.push(swipe);
        this.f30855c.remove(swipe.getRec().getId());
    }

    @Nullable
    /* renamed from: a */
    public final Swipe m37398a() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(this.f30856d);
        stringBuilder.append(" - peek()");
        C0001a.a(stringBuilder.toString(), new Object[0]);
        return (Swipe) this.f30854b.peek();
    }

    /* renamed from: b */
    public final boolean m37402b(@NotNull Swipe swipe) {
        C2668g.b(swipe, "swipe");
        return this.f30854b.contains(swipe);
    }

    /* renamed from: a */
    public final boolean m37400a(@NotNull String str) {
        C2668g.b(str, "recId");
        return this.f30855c.contains(str);
    }

    /* renamed from: c */
    public final void m37404c(@NotNull Swipe swipe) {
        C2668g.b(swipe, "swipe");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(this.f30856d);
        stringBuilder.append(" - remove(): ");
        stringBuilder.append(swipe);
        C0001a.a(stringBuilder.toString(), new Object[0]);
        this.f30854b.remove(swipe);
    }

    /* renamed from: b */
    public final void m37401b() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(this.f30856d);
        stringBuilder.append(" - clear()");
        C0001a.a(stringBuilder.toString(), new Object[0]);
        this.f30854b.clear();
        this.f30855c.clear();
    }

    /* renamed from: c */
    public final int m37403c() {
        return this.f30854b.size();
    }

    /* renamed from: d */
    private final void m37397d() {
        while (this.f30854b.size() >= this.f30853a.m37396a()) {
            this.f30854b.removeLast();
        }
    }
}
