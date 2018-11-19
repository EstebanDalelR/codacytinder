package com.tinder.fireboarding.domain;

import com.tinder.domain.recs.model.Rec;
import com.tinder.domain.recs.model.Rec$Source;
import com.tinder.domain.recs.model.Rec$Type;
import com.tinder.domain.recs.model.RecSource.Core;
import com.tinder.domain.recs.model.RecType;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nXD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001e"}, d2 = {"Lcom/tinder/fireboarding/domain/FireboardingRec;", "Lcom/tinder/domain/recs/model/Rec;", "level", "Lcom/tinder/fireboarding/domain/Level;", "(Lcom/tinder/fireboarding/domain/Level;)V", "id", "", "getId", "()Ljava/lang/String;", "isRewindable", "", "()Z", "getLevel", "()Lcom/tinder/fireboarding/domain/Level;", "source", "Lcom/tinder/domain/recs/model/RecSource$Core;", "getSource", "()Lcom/tinder/domain/recs/model/RecSource$Core;", "type", "Lcom/tinder/domain/recs/model/RecType;", "getType", "()Lcom/tinder/domain/recs/model/RecType;", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.fireboarding.domain.i */
public final class C11803i implements Rec {
    @NotNull
    /* renamed from: a */
    private final String f38523a = this.f38527e.name();
    /* renamed from: b */
    private final boolean f38524b;
    @NotNull
    /* renamed from: c */
    private final Core f38525c = Core.INSTANCE;
    @NotNull
    /* renamed from: d */
    private final RecType f38526d = RecType.FIREBOARDING;
    @NotNull
    /* renamed from: e */
    private final Level f38527e;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C11803i) {
                if (C2668g.a(this.f38527e, ((C11803i) obj).f38527e)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Level level = this.f38527e;
        return level != null ? level.hashCode() : 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FireboardingRec(level=");
        stringBuilder.append(this.f38527e);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C11803i(@NotNull Level level) {
        C2668g.b(level, "level");
        this.f38527e = level;
    }

    @NotNull
    /* renamed from: c */
    public final Level m47720c() {
        return this.f38527e;
    }

    public /* synthetic */ Rec$Source getSource() {
        return m47718a();
    }

    public /* synthetic */ Rec$Type getType() {
        return m47719b();
    }

    @NotNull
    public String getId() {
        return this.f38523a;
    }

    public boolean isRewindable() {
        return this.f38524b;
    }

    @NotNull
    /* renamed from: a */
    public Core m47718a() {
        return this.f38525c;
    }

    @NotNull
    /* renamed from: b */
    public RecType m47719b() {
        return this.f38526d;
    }
}
