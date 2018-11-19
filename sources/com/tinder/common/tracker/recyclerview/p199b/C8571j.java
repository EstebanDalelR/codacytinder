package com.tinder.common.tracker.recyclerview.p199b;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/tinder/common/tracker/recyclerview/model/VisibleItemState;", "", "position", "", "visiblePercentage", "", "(IF)V", "getPosition", "()I", "getVisiblePercentage", "()F", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.common.tracker.recyclerview.b.j */
public final class C8571j {
    /* renamed from: a */
    private final int f30324a;
    /* renamed from: b */
    private final float f30325b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8571j) {
            C8571j c8571j = (C8571j) obj;
            return (this.f30324a == c8571j.f30324a ? 1 : null) != null && Float.compare(this.f30325b, c8571j.f30325b) == 0;
        }
    }

    public int hashCode() {
        return (this.f30324a * 31) + Float.floatToIntBits(this.f30325b);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("VisibleItemState(position=");
        stringBuilder.append(this.f30324a);
        stringBuilder.append(", visiblePercentage=");
        stringBuilder.append(this.f30325b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C8571j(int i, float f) {
        this.f30324a = i;
        this.f30325b = f;
    }

    /* renamed from: a */
    public final int m36573a() {
        return this.f30324a;
    }

    /* renamed from: b */
    public final float m36574b() {
        return this.f30325b;
    }
}
