package com.tinder.common.tracker.recyclerview.p199b;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/tinder/common/tracker/recyclerview/model/ItemVisible;", "Lcom/tinder/common/tracker/recyclerview/model/ListItemVisibleUpdate;", "position", "", "(I)V", "getPosition", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.common.tracker.recyclerview.b.b */
public final class C10703b extends C8567d {
    /* renamed from: a */
    private final int f35057a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10703b) {
            if ((mo9447a() == ((C10703b) obj).mo9447a() ? 1 : null) != null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return mo9447a();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ItemVisible(position=");
        stringBuilder.append(mo9447a());
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public int mo9447a() {
        return this.f35057a;
    }

    public C10703b(int i) {
        super();
        this.f35057a = i;
    }
}
