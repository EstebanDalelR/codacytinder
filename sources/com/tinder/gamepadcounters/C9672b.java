package com.tinder.gamepadcounters;

import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/tinder/gamepadcounters/GamepadCounterSession;", "", "hasSeenGamePadCounter", "", "hasSeenFastMatchActivityCounter", "lastBackgroundTime", "Lorg/joda/time/DateTime;", "(ZZLorg/joda/time/DateTime;)V", "getHasSeenFastMatchActivityCounter", "()Z", "getHasSeenGamePadCounter", "getLastBackgroundTime", "()Lorg/joda/time/DateTime;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.gamepadcounters.b */
public final class C9672b {
    /* renamed from: a */
    private final boolean f32231a;
    /* renamed from: b */
    private final boolean f32232b;
    @Nullable
    /* renamed from: c */
    private final DateTime f32233c;

    public C9672b() {
        this(false, false, null, 7, null);
    }

    @NotNull
    /* renamed from: a */
    public static /* synthetic */ C9672b m40094a(C9672b c9672b, boolean z, boolean z2, DateTime dateTime, int i, Object obj) {
        if ((i & 1) != 0) {
            z = c9672b.f32231a;
        }
        if ((i & 2) != 0) {
            z2 = c9672b.f32232b;
        }
        if ((i & 4) != 0) {
            dateTime = c9672b.f32233c;
        }
        return c9672b.m40095a(z, z2, dateTime);
    }

    @NotNull
    /* renamed from: a */
    public final C9672b m40095a(boolean z, boolean z2, @Nullable DateTime dateTime) {
        return new C9672b(z, z2, dateTime);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9672b) {
            C9672b c9672b = (C9672b) obj;
            if ((this.f32231a == c9672b.f32231a ? 1 : null) != null) {
                return (this.f32232b == c9672b.f32232b ? 1 : null) != null && C2668g.a(this.f32233c, c9672b.f32233c);
            }
        }
    }

    public int hashCode() {
        int i = this.f32231a;
        int i2 = 1;
        if (i != 0) {
            i = 1;
        }
        i *= 31;
        boolean z = this.f32232b;
        if (!z) {
            i2 = z;
        }
        i = (i + i2) * 31;
        DateTime dateTime = this.f32233c;
        return i + (dateTime != null ? dateTime.hashCode() : 0);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("GamepadCounterSession(hasSeenGamePadCounter=");
        stringBuilder.append(this.f32231a);
        stringBuilder.append(", hasSeenFastMatchActivityCounter=");
        stringBuilder.append(this.f32232b);
        stringBuilder.append(", lastBackgroundTime=");
        stringBuilder.append(this.f32233c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C9672b(boolean z, boolean z2, @Nullable DateTime dateTime) {
        this.f32231a = z;
        this.f32232b = z2;
        this.f32233c = dateTime;
    }

    /* renamed from: a */
    public final boolean m40096a() {
        return this.f32231a;
    }

    /* renamed from: b */
    public final boolean m40097b() {
        return this.f32232b;
    }

    public /* synthetic */ C9672b(boolean z, boolean z2, DateTime dateTime, int i, C15823e c15823e) {
        if ((i & 1) != null) {
            z = false;
        }
        if ((i & 2) != null) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            dateTime = null;
        }
        this(z, z2, dateTime);
    }

    @Nullable
    /* renamed from: c */
    public final DateTime m40098c() {
        return this.f32233c;
    }
}
