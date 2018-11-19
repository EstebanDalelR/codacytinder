package com.tinder.common.tracker.recyclerview.p199b;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/tinder/common/tracker/recyclerview/model/ListVisibleItemsStateUpdate;", "", "firstVisible", "", "lastVisible", "visibleItems", "", "Lcom/tinder/common/tracker/recyclerview/model/VisibleItemState;", "(IILjava/util/List;)V", "getFirstVisible", "()I", "getLastVisible", "getVisibleItems", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.common.tracker.recyclerview.b.h */
public final class C8569h {
    /* renamed from: a */
    private final int f30319a;
    /* renamed from: b */
    private final int f30320b;
    @NotNull
    /* renamed from: c */
    private final List<C8571j> f30321c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8569h) {
            C8569h c8569h = (C8569h) obj;
            if ((this.f30319a == c8569h.f30319a ? 1 : null) != null) {
                return (this.f30320b == c8569h.f30320b ? 1 : null) != null && C2668g.a(this.f30321c, c8569h.f30321c);
            }
        }
    }

    public int hashCode() {
        int i = ((this.f30319a * 31) + this.f30320b) * 31;
        List list = this.f30321c;
        return i + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ListVisibleItemsStateUpdate(firstVisible=");
        stringBuilder.append(this.f30319a);
        stringBuilder.append(", lastVisible=");
        stringBuilder.append(this.f30320b);
        stringBuilder.append(", visibleItems=");
        stringBuilder.append(this.f30321c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C8569h(int i, int i2, @NotNull List<C8571j> list) {
        C2668g.b(list, "visibleItems");
        this.f30319a = i;
        this.f30320b = i2;
        this.f30321c = list;
    }

    @NotNull
    /* renamed from: a */
    public final List<C8571j> m36570a() {
        return this.f30321c;
    }
}
