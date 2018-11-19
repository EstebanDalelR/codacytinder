package com.tinder.fireboarding.domain;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\"\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003`\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R*\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003`\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/fireboarding/domain/LevelSwipeCountAdapter;", "", "injectionMargin", "", "orderedLevelIntervals", "Ljava/util/LinkedHashMap;", "Lcom/tinder/fireboarding/domain/Level;", "Lkotlin/collections/LinkedHashMap;", "(ILjava/util/LinkedHashMap;)V", "getLevelForSwipeCount", "swipeCount", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.fireboarding.domain.m */
public final class C9567m {
    /* renamed from: a */
    private final int f31968a;
    /* renamed from: b */
    private final LinkedHashMap<Level, Integer> f31969b;

    public C9567m(int i, @NotNull LinkedHashMap<Level, Integer> linkedHashMap) {
        C2668g.b(linkedHashMap, "orderedLevelIntervals");
        this.f31968a = i;
        this.f31969b = linkedHashMap;
    }

    @NotNull
    /* renamed from: a */
    public final Level m39872a(int i) {
        if ((i >= 0 ? 1 : null) == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Negative swipeCount:");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString().toString());
        }
        for (Entry entry : this.f31969b.entrySet()) {
            Level level = (Level) entry.getKey();
            if (i <= ((Number) entry.getValue()).intValue() - this.f31968a) {
                return level;
            }
        }
        i = this.f31969b.keySet();
        C2668g.a(i, "orderedLevelIntervals.keys");
        i = C19301m.d((Iterable) i);
        C2668g.a(i, "orderedLevelIntervals.keys.last()");
        return (Level) i;
    }
}
