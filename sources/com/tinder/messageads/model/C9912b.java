package com.tinder.messageads.model;

import com.tinder.domain.match.model.MessageAdMatch.Type;
import java.util.Collection;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/tinder/messageads/model/MessageAdMatchSettings;", "", "typeOptInSettings", "", "Lcom/tinder/messageads/model/MessageAdMatchSettings$TypeOptInSetting;", "(Ljava/util/Set;)V", "enabled", "", "getEnabled", "()Z", "getTypeOptInSettings", "()Ljava/util/Set;", "component1", "copy", "equals", "other", "getOption", "type", "Lcom/tinder/domain/match/model/MessageAdMatch$Type;", "hashCode", "", "toString", "", "TypeOptInSetting", "message-ads_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.messageads.model.b */
public final class C9912b {
    @NotNull
    /* renamed from: a */
    private final Set<C9911a> f32768a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/tinder/messageads/model/MessageAdMatchSettings$TypeOptInSetting;", "", "type", "Lcom/tinder/domain/match/model/MessageAdMatch$Type;", "enabled", "", "(Lcom/tinder/domain/match/model/MessageAdMatch$Type;Z)V", "getEnabled", "()Z", "getType", "()Lcom/tinder/domain/match/model/MessageAdMatch$Type;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "message-ads_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.messageads.model.b$a */
    public static final class C9911a {
        @NotNull
        /* renamed from: a */
        private final Type f32766a;
        /* renamed from: b */
        private final boolean f32767b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C9911a) {
                C9911a c9911a = (C9911a) obj;
                if (C2668g.a(this.f32766a, c9911a.f32766a)) {
                    if ((this.f32767b == c9911a.f32767b ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            Type type = this.f32766a;
            int hashCode = (type != null ? type.hashCode() : 0) * 31;
            int i = this.f32767b;
            if (i != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("TypeOptInSetting(type=");
            stringBuilder.append(this.f32766a);
            stringBuilder.append(", enabled=");
            stringBuilder.append(this.f32767b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C9911a(@NotNull Type type, boolean z) {
            C2668g.b(type, "type");
            this.f32766a = type;
            this.f32767b = z;
        }

        @NotNull
        /* renamed from: a */
        public final Type m40750a() {
            return this.f32766a;
        }

        /* renamed from: b */
        public final boolean m40751b() {
            return this.f32767b;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9912b) {
                if (C2668g.a(this.f32768a, ((C9912b) obj).f32768a)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Set set = this.f32768a;
        return set != null ? set.hashCode() : 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MessageAdMatchSettings(typeOptInSettings=");
        stringBuilder.append(this.f32768a);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C9912b(@NotNull Set<C9911a> set) {
        C2668g.b(set, "typeOptInSettings");
        this.f32768a = set;
    }

    @NotNull
    /* renamed from: b */
    public final Set<C9911a> m40754b() {
        return this.f32768a;
    }

    /* renamed from: a */
    public final boolean m40753a() {
        Iterable<C9911a> iterable = this.f32768a;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (C9911a b : iterable) {
            if (b.m40751b()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    /* renamed from: a */
    public final C9911a m40752a(@NotNull Type type) {
        C2668g.b(type, "type");
        for (C9911a c9911a : this.f32768a) {
            Object obj;
            if (c9911a.m40750a() == type) {
                obj = 1;
                continue;
            } else {
                obj = null;
                continue;
            }
            if (obj != null) {
                return c9911a;
            }
        }
        throw ((Throwable) new NoSuchElementException("Collection contains no element matching the predicate."));
    }
}
