package com.tinder.domain.tracker;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/tinder/domain/tracker/ListItemViewDurationData;", "", "itemId", "", "itemVisible", "", "firstVisibleTimeMs", "", "lastItemVisibleUpdateTimeMs", "lastItemNotVisibleUpdateTimeMs", "(Ljava/lang/String;ZJJJ)V", "getFirstVisibleTimeMs", "()J", "getItemId", "()Ljava/lang/String;", "getItemVisible", "()Z", "getLastItemNotVisibleUpdateTimeMs", "getLastItemVisibleUpdateTimeMs", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class ListItemViewDurationData {
    public static final Companion Companion = new Companion();
    private final long firstVisibleTimeMs;
    @NotNull
    private final String itemId;
    private final boolean itemVisible;
    private final long lastItemNotVisibleUpdateTimeMs;
    private final long lastItemVisibleUpdateTimeMs;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/tinder/domain/tracker/ListItemViewDurationData$Companion;", "", "()V", "default", "Lcom/tinder/domain/tracker/ListItemViewDurationData;", "id", "", "currentTimeMs", "", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        /* renamed from: default */
        public final ListItemViewDurationData m37727default(@NotNull String str, long j) {
            C2668g.b(str, "id");
            return new ListItemViewDurationData(str, false, j, j, 0);
        }
    }

    @NotNull
    public static /* synthetic */ ListItemViewDurationData copy$default(ListItemViewDurationData listItemViewDurationData, String str, boolean z, long j, long j2, long j3, int i, Object obj) {
        ListItemViewDurationData listItemViewDurationData2 = listItemViewDurationData;
        return listItemViewDurationData2.copy((i & 1) != 0 ? listItemViewDurationData2.itemId : str, (i & 2) != 0 ? listItemViewDurationData2.itemVisible : z, (i & 4) != 0 ? listItemViewDurationData2.firstVisibleTimeMs : j, (i & 8) != 0 ? listItemViewDurationData2.lastItemVisibleUpdateTimeMs : j2, (i & 16) != 0 ? listItemViewDurationData2.lastItemNotVisibleUpdateTimeMs : j3);
    }

    @NotNull
    public final String component1() {
        return this.itemId;
    }

    public final boolean component2() {
        return this.itemVisible;
    }

    public final long component3() {
        return this.firstVisibleTimeMs;
    }

    public final long component4() {
        return this.lastItemVisibleUpdateTimeMs;
    }

    public final long component5() {
        return this.lastItemNotVisibleUpdateTimeMs;
    }

    @NotNull
    public final ListItemViewDurationData copy(@NotNull String str, boolean z, long j, long j2, long j3) {
        String str2 = str;
        C2668g.b(str2, "itemId");
        return new ListItemViewDurationData(str2, z, j, j2, j3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ListItemViewDurationData) {
            ListItemViewDurationData listItemViewDurationData = (ListItemViewDurationData) obj;
            if (C2668g.a(this.itemId, listItemViewDurationData.itemId)) {
                if ((this.itemVisible == listItemViewDurationData.itemVisible ? 1 : null) != null) {
                    if ((this.firstVisibleTimeMs == listItemViewDurationData.firstVisibleTimeMs ? 1 : null) != null) {
                        if ((this.lastItemVisibleUpdateTimeMs == listItemViewDurationData.lastItemVisibleUpdateTimeMs ? 1 : null) != null) {
                            if ((this.lastItemNotVisibleUpdateTimeMs == listItemViewDurationData.lastItemNotVisibleUpdateTimeMs ? 1 : null) != null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.itemId;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        int i = this.itemVisible;
        if (i != 0) {
            i = 1;
        }
        hashCode = (hashCode + i) * 31;
        long j = this.firstVisibleTimeMs;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        j = this.lastItemVisibleUpdateTimeMs;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        j = this.lastItemNotVisibleUpdateTimeMs;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ListItemViewDurationData(itemId=");
        stringBuilder.append(this.itemId);
        stringBuilder.append(", itemVisible=");
        stringBuilder.append(this.itemVisible);
        stringBuilder.append(", firstVisibleTimeMs=");
        stringBuilder.append(this.firstVisibleTimeMs);
        stringBuilder.append(", lastItemVisibleUpdateTimeMs=");
        stringBuilder.append(this.lastItemVisibleUpdateTimeMs);
        stringBuilder.append(", lastItemNotVisibleUpdateTimeMs=");
        stringBuilder.append(this.lastItemNotVisibleUpdateTimeMs);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public ListItemViewDurationData(@NotNull String str, boolean z, long j, long j2, long j3) {
        C2668g.b(str, "itemId");
        this.itemId = str;
        this.itemVisible = z;
        this.firstVisibleTimeMs = j;
        this.lastItemVisibleUpdateTimeMs = j2;
        this.lastItemNotVisibleUpdateTimeMs = j3;
        str = null;
        if ((this.firstVisibleTimeMs >= null ? 1 : null) == null) {
            throw ((Throwable) new IllegalArgumentException("Failed requirement.".toString()));
        }
        if ((this.lastItemVisibleUpdateTimeMs >= 0 ? 1 : null) == null) {
            throw ((Throwable) new IllegalArgumentException("Failed requirement.".toString()));
        }
        if (this.lastItemNotVisibleUpdateTimeMs >= 0) {
            str = true;
        }
        if (str == null) {
            throw ((Throwable) new IllegalArgumentException("Failed requirement.".toString()));
        }
    }

    @NotNull
    public final String getItemId() {
        return this.itemId;
    }

    public final boolean getItemVisible() {
        return this.itemVisible;
    }

    public final long getFirstVisibleTimeMs() {
        return this.firstVisibleTimeMs;
    }

    public final long getLastItemVisibleUpdateTimeMs() {
        return this.lastItemVisibleUpdateTimeMs;
    }

    public final long getLastItemNotVisibleUpdateTimeMs() {
        return this.lastItemNotVisibleUpdateTimeMs;
    }
}
