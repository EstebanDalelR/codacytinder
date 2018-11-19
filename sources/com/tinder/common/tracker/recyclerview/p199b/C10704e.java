package com.tinder.common.tracker.recyclerview.p199b;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0000HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0016\u0010\u0003\u001a\u00028\u0000X\u0004¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/tinder/common/tracker/recyclerview/model/ListPlayableItemActive;", "T", "Lcom/tinder/common/tracker/recyclerview/model/ListPlayableItemUpdate;", "item", "(Ljava/lang/Object;)V", "getItem", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/tinder/common/tracker/recyclerview/model/ListPlayableItemActive;", "equals", "", "other", "", "hashCode", "", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.common.tracker.recyclerview.b.e */
public final class C10704e<T> extends C8568g<T> {
    /* renamed from: a */
    private final T f35058a;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C10704e) {
                if (C2668g.a(m43039a(), ((C10704e) obj).m43039a())) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object a = m43039a();
        return a != null ? a.hashCode() : 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ListPlayableItemActive(item=");
        stringBuilder.append(m43039a());
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public T m43039a() {
        return this.f35058a;
    }

    public C10704e(T t) {
        super();
        this.f35058a = t;
    }
}
