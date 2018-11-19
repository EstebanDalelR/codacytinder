package com.tinder.shimmy;

import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u000e"}, d2 = {"Lcom/tinder/shimmy/ShimmerFrameLayout$Config;", "", "isShimmerEnabled", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "shimmy_release"}, k = 1, mv = {1, 1, 9})
public final class ShimmerFrameLayout$b {
    /* renamed from: a */
    private final boolean f46660a;

    public ShimmerFrameLayout$b() {
        this(false, 1, null);
    }

    @NotNull
    /* renamed from: a */
    public final ShimmerFrameLayout$b m56434a(boolean z) {
        return new ShimmerFrameLayout$b(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ShimmerFrameLayout$b) {
            if ((this.f46660a == ((ShimmerFrameLayout$b) obj).f46660a ? 1 : null) != null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        boolean z = this.f46660a;
        return z ? 1 : z;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Config(isShimmerEnabled=");
        stringBuilder.append(this.f46660a);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public ShimmerFrameLayout$b(boolean z) {
        this.f46660a = z;
    }

    public /* synthetic */ ShimmerFrameLayout$b(boolean z, int i, C15823e c15823e) {
        if ((i & 1) != 0) {
            z = true;
        }
        this(z);
    }

    /* renamed from: a */
    public final boolean m56435a() {
        return this.f46660a;
    }
}
