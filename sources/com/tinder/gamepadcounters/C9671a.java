package com.tinder.gamepadcounters;

import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/tinder/gamepadcounters/GamePadButtonCounterInfo;", "", "superLikeCount", "", "boostCount", "shouldShowSuperLikeCount", "", "shouldShowBoostCount", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "getBoostCount", "()Ljava/lang/String;", "getShouldShowBoostCount", "()Z", "getShouldShowSuperLikeCount", "getSuperLikeCount", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.gamepadcounters.a */
public final class C9671a {
    @NotNull
    /* renamed from: a */
    private final String f32227a;
    @NotNull
    /* renamed from: b */
    private final String f32228b;
    /* renamed from: c */
    private final boolean f32229c;
    /* renamed from: d */
    private final boolean f32230d;

    public C9671a() {
        this(null, null, false, false, 15, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9671a) {
            C9671a c9671a = (C9671a) obj;
            if (C2668g.a(this.f32227a, c9671a.f32227a) && C2668g.a(this.f32228b, c9671a.f32228b)) {
                if ((this.f32229c == c9671a.f32229c ? 1 : null) != null) {
                    if ((this.f32230d == c9671a.f32230d ? 1 : null) != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f32227a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f32228b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        hashCode = (hashCode + i) * 31;
        i = this.f32229c;
        if (i != 0) {
            i = 1;
        }
        hashCode = (hashCode + i) * 31;
        i = this.f32230d;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("GamePadButtonCounterInfo(superLikeCount=");
        stringBuilder.append(this.f32227a);
        stringBuilder.append(", boostCount=");
        stringBuilder.append(this.f32228b);
        stringBuilder.append(", shouldShowSuperLikeCount=");
        stringBuilder.append(this.f32229c);
        stringBuilder.append(", shouldShowBoostCount=");
        stringBuilder.append(this.f32230d);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C9671a(@NotNull String str, @NotNull String str2, boolean z, boolean z2) {
        C2668g.b(str, "superLikeCount");
        C2668g.b(str2, "boostCount");
        this.f32227a = str;
        this.f32228b = str2;
        this.f32229c = z;
        this.f32230d = z2;
    }

    @NotNull
    /* renamed from: a */
    public final String m40090a() {
        return this.f32227a;
    }

    @NotNull
    /* renamed from: b */
    public final String m40091b() {
        return this.f32228b;
    }

    /* renamed from: c */
    public final boolean m40092c() {
        return this.f32229c;
    }

    public /* synthetic */ C9671a(String str, String str2, boolean z, boolean z2, int i, C15823e c15823e) {
        if ((i & 1) != null) {
            str = "";
        }
        if ((i & 2) != null) {
            str2 = "";
        }
        if ((i & 4) != null) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        this(str, str2, z, z2);
    }

    /* renamed from: d */
    public final boolean m40093d() {
        return this.f32230d;
    }
}
