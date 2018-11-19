package com.tinder.domain.recs.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0012\u0013\u0014\u0015\u0016\u0017B;\b\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0002\u0010\nR\u0014\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0014\u0010\t\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f\u0001\u0006\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lcom/tinder/domain/recs/model/RecsUpdate;", "", "modifiedRecs", "", "Lcom/tinder/domain/recs/model/Rec;", "position", "", "availableRewindCount", "currentRecs", "orderIndex", "(Ljava/util/List;IILjava/util/List;I)V", "getAvailableRewindCount", "()I", "getCurrentRecs", "()Ljava/util/List;", "getModifiedRecs", "getOrderIndex", "getPosition", "ClearAll", "Consume", "Insert", "Remove", "Rewind", "RewindCancel", "Lcom/tinder/domain/recs/model/RecsUpdate$Insert;", "Lcom/tinder/domain/recs/model/RecsUpdate$Remove;", "Lcom/tinder/domain/recs/model/RecsUpdate$ClearAll;", "Lcom/tinder/domain/recs/model/RecsUpdate$Consume;", "Lcom/tinder/domain/recs/model/RecsUpdate$Rewind;", "Lcom/tinder/domain/recs/model/RecsUpdate$RewindCancel;", "engine_release"}, k = 1, mv = {1, 1, 9})
public abstract class RecsUpdate {
    private final int availableRewindCount;
    @NotNull
    private final List<Rec> currentRecs;
    @NotNull
    private final List<Rec> modifiedRecs;
    private final int orderIndex;
    private final int position;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B%\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0007\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/tinder/domain/recs/model/RecsUpdate$ClearAll;", "Lcom/tinder/domain/recs/model/RecsUpdate;", "availableRewindCount", "", "currentRecs", "", "Lcom/tinder/domain/recs/model/Rec;", "orderIndex", "(ILjava/util/List;I)V", "getAvailableRewindCount", "()I", "getCurrentRecs", "()Ljava/util/List;", "getOrderIndex", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "engine_release"}, k = 1, mv = {1, 1, 9})
    public static final class ClearAll extends RecsUpdate {
        private final int availableRewindCount;
        @NotNull
        private final List<Rec> currentRecs;
        private final int orderIndex;

        @NotNull
        public static /* synthetic */ ClearAll copy$default(ClearAll clearAll, int i, List list, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = clearAll.getAvailableRewindCount();
            }
            if ((i3 & 2) != 0) {
                list = clearAll.getCurrentRecs();
            }
            if ((i3 & 4) != 0) {
                i2 = clearAll.getOrderIndex();
            }
            return clearAll.copy(i, list, i2);
        }

        public final int component1() {
            return getAvailableRewindCount();
        }

        @NotNull
        public final List<Rec> component2() {
            return getCurrentRecs();
        }

        public final int component3() {
            return getOrderIndex();
        }

        @NotNull
        public final ClearAll copy(int i, @NotNull List<? extends Rec> list, int i2) {
            C2668g.b(list, "currentRecs");
            return new ClearAll(i, list, i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ClearAll) {
                ClearAll clearAll = (ClearAll) obj;
                if ((getAvailableRewindCount() == clearAll.getAvailableRewindCount() ? 1 : null) != null && C2668g.a(getCurrentRecs(), clearAll.getCurrentRecs())) {
                    if ((getOrderIndex() == clearAll.getOrderIndex() ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            int availableRewindCount = getAvailableRewindCount() * 31;
            List currentRecs = getCurrentRecs();
            return ((availableRewindCount + (currentRecs != null ? currentRecs.hashCode() : 0)) * 31) + getOrderIndex();
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ClearAll(availableRewindCount=");
            stringBuilder.append(getAvailableRewindCount());
            stringBuilder.append(", currentRecs=");
            stringBuilder.append(getCurrentRecs());
            stringBuilder.append(", orderIndex=");
            stringBuilder.append(getOrderIndex());
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public int getAvailableRewindCount() {
            return this.availableRewindCount;
        }

        @NotNull
        public List<Rec> getCurrentRecs() {
            return this.currentRecs;
        }

        public int getOrderIndex() {
            return this.orderIndex;
        }

        public ClearAll(int i, @NotNull List<? extends Rec> list, int i2) {
            C2668g.b(list, "currentRecs");
            super(C19301m.a(), 0, i, list, i2);
            this.availableRewindCount = i;
            this.currentRecs = list;
            this.orderIndex = i2;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B5\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003JA\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\n\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lcom/tinder/domain/recs/model/RecsUpdate$Consume;", "Lcom/tinder/domain/recs/model/RecsUpdate;", "swipe", "Lcom/tinder/domain/recs/model/Swipe;", "position", "", "availableRewindCount", "currentRecs", "", "Lcom/tinder/domain/recs/model/Rec;", "orderIndex", "(Lcom/tinder/domain/recs/model/Swipe;IILjava/util/List;I)V", "getAvailableRewindCount", "()I", "getCurrentRecs", "()Ljava/util/List;", "getOrderIndex", "getPosition", "getSwipe", "()Lcom/tinder/domain/recs/model/Swipe;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "", "engine_release"}, k = 1, mv = {1, 1, 9})
    public static final class Consume extends RecsUpdate {
        private final int availableRewindCount;
        @NotNull
        private final List<Rec> currentRecs;
        private final int orderIndex;
        private final int position;
        @NotNull
        private final Swipe swipe;

        @NotNull
        public static /* synthetic */ Consume copy$default(Consume consume, Swipe swipe, int i, int i2, List list, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                swipe = consume.swipe;
            }
            if ((i4 & 2) != 0) {
                i = consume.getPosition();
            }
            int i5 = i;
            if ((i4 & 4) != 0) {
                i2 = consume.getAvailableRewindCount();
            }
            int i6 = i2;
            if ((i4 & 8) != 0) {
                list = consume.getCurrentRecs();
            }
            List list2 = list;
            if ((i4 & 16) != 0) {
                i3 = consume.getOrderIndex();
            }
            return consume.copy(swipe, i5, i6, list2, i3);
        }

        @NotNull
        public final Swipe component1() {
            return this.swipe;
        }

        public final int component2() {
            return getPosition();
        }

        public final int component3() {
            return getAvailableRewindCount();
        }

        @NotNull
        public final List<Rec> component4() {
            return getCurrentRecs();
        }

        public final int component5() {
            return getOrderIndex();
        }

        @NotNull
        public final Consume copy(@NotNull Swipe swipe, int i, int i2, @NotNull List<? extends Rec> list, int i3) {
            C2668g.b(swipe, "swipe");
            C2668g.b(list, "currentRecs");
            return new Consume(swipe, i, i2, list, i3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Consume) {
                Consume consume = (Consume) obj;
                if (C2668g.a(this.swipe, consume.swipe)) {
                    if ((getPosition() == consume.getPosition() ? 1 : null) != null) {
                        if ((getAvailableRewindCount() == consume.getAvailableRewindCount() ? 1 : null) != null && C2668g.a(getCurrentRecs(), consume.getCurrentRecs())) {
                            if ((getOrderIndex() == consume.getOrderIndex() ? 1 : null) != null) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            Swipe swipe = this.swipe;
            int i = 0;
            int hashCode = (((((swipe != null ? swipe.hashCode() : 0) * 31) + getPosition()) * 31) + getAvailableRewindCount()) * 31;
            List currentRecs = getCurrentRecs();
            if (currentRecs != null) {
                i = currentRecs.hashCode();
            }
            return ((hashCode + i) * 31) + getOrderIndex();
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Consume(swipe=");
            stringBuilder.append(this.swipe);
            stringBuilder.append(", position=");
            stringBuilder.append(getPosition());
            stringBuilder.append(", availableRewindCount=");
            stringBuilder.append(getAvailableRewindCount());
            stringBuilder.append(", currentRecs=");
            stringBuilder.append(getCurrentRecs());
            stringBuilder.append(", orderIndex=");
            stringBuilder.append(getOrderIndex());
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        @NotNull
        public final Swipe getSwipe() {
            return this.swipe;
        }

        public int getPosition() {
            return this.position;
        }

        public int getAvailableRewindCount() {
            return this.availableRewindCount;
        }

        @NotNull
        public List<Rec> getCurrentRecs() {
            return this.currentRecs;
        }

        public int getOrderIndex() {
            return this.orderIndex;
        }

        public Consume(@NotNull Swipe swipe, int i, int i2, @NotNull List<? extends Rec> list, int i3) {
            C2668g.b(swipe, "swipe");
            C2668g.b(list, "currentRecs");
            super(C19301m.a(), i, i2, list, i3);
            this.swipe = swipe;
            this.position = i;
            this.availableRewindCount = i2;
            this.currentRecs = list;
            this.orderIndex = i3;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B;\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0002\u0010\nJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003JG\u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0014\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0014\u0010\t\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/tinder/domain/recs/model/RecsUpdate$Insert;", "Lcom/tinder/domain/recs/model/RecsUpdate;", "modifiedRecs", "", "Lcom/tinder/domain/recs/model/Rec;", "position", "", "availableRewindCount", "currentRecs", "orderIndex", "(Ljava/util/List;IILjava/util/List;I)V", "getAvailableRewindCount", "()I", "getCurrentRecs", "()Ljava/util/List;", "getModifiedRecs", "getOrderIndex", "getPosition", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "", "engine_release"}, k = 1, mv = {1, 1, 9})
    public static final class Insert extends RecsUpdate {
        private final int availableRewindCount;
        @NotNull
        private final List<Rec> currentRecs;
        @NotNull
        private final List<Rec> modifiedRecs;
        private final int orderIndex;
        private final int position;

        @NotNull
        public static /* synthetic */ Insert copy$default(Insert insert, List list, int i, int i2, List list2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                list = insert.getModifiedRecs();
            }
            if ((i4 & 2) != 0) {
                i = insert.getPosition();
            }
            int i5 = i;
            if ((i4 & 4) != 0) {
                i2 = insert.getAvailableRewindCount();
            }
            int i6 = i2;
            if ((i4 & 8) != 0) {
                list2 = insert.getCurrentRecs();
            }
            List list3 = list2;
            if ((i4 & 16) != 0) {
                i3 = insert.getOrderIndex();
            }
            return insert.copy(list, i5, i6, list3, i3);
        }

        @NotNull
        public final List<Rec> component1() {
            return getModifiedRecs();
        }

        public final int component2() {
            return getPosition();
        }

        public final int component3() {
            return getAvailableRewindCount();
        }

        @NotNull
        public final List<Rec> component4() {
            return getCurrentRecs();
        }

        public final int component5() {
            return getOrderIndex();
        }

        @NotNull
        public final Insert copy(@NotNull List<? extends Rec> list, int i, int i2, @NotNull List<? extends Rec> list2, int i3) {
            C2668g.b(list, "modifiedRecs");
            C2668g.b(list2, "currentRecs");
            return new Insert(list, i, i2, list2, i3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Insert) {
                Insert insert = (Insert) obj;
                if (C2668g.a(getModifiedRecs(), insert.getModifiedRecs())) {
                    if ((getPosition() == insert.getPosition() ? 1 : null) != null) {
                        if ((getAvailableRewindCount() == insert.getAvailableRewindCount() ? 1 : null) != null && C2668g.a(getCurrentRecs(), insert.getCurrentRecs())) {
                            if ((getOrderIndex() == insert.getOrderIndex() ? 1 : null) != null) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            List modifiedRecs = getModifiedRecs();
            int i = 0;
            int hashCode = (((((modifiedRecs != null ? modifiedRecs.hashCode() : 0) * 31) + getPosition()) * 31) + getAvailableRewindCount()) * 31;
            List currentRecs = getCurrentRecs();
            if (currentRecs != null) {
                i = currentRecs.hashCode();
            }
            return ((hashCode + i) * 31) + getOrderIndex();
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Insert(modifiedRecs=");
            stringBuilder.append(getModifiedRecs());
            stringBuilder.append(", position=");
            stringBuilder.append(getPosition());
            stringBuilder.append(", availableRewindCount=");
            stringBuilder.append(getAvailableRewindCount());
            stringBuilder.append(", currentRecs=");
            stringBuilder.append(getCurrentRecs());
            stringBuilder.append(", orderIndex=");
            stringBuilder.append(getOrderIndex());
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        @NotNull
        public List<Rec> getModifiedRecs() {
            return this.modifiedRecs;
        }

        public int getPosition() {
            return this.position;
        }

        public int getAvailableRewindCount() {
            return this.availableRewindCount;
        }

        @NotNull
        public List<Rec> getCurrentRecs() {
            return this.currentRecs;
        }

        public int getOrderIndex() {
            return this.orderIndex;
        }

        public Insert(@NotNull List<? extends Rec> list, int i, int i2, @NotNull List<? extends Rec> list2, int i3) {
            C2668g.b(list, "modifiedRecs");
            C2668g.b(list2, "currentRecs");
            super(list, i, i2, list2, i3);
            this.modifiedRecs = list;
            this.position = i;
            this.availableRewindCount = i2;
            this.currentRecs = list2;
            this.orderIndex = i3;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B5\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003JA\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\t\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006 "}, d2 = {"Lcom/tinder/domain/recs/model/RecsUpdate$Remove;", "Lcom/tinder/domain/recs/model/RecsUpdate;", "removedRec", "Lcom/tinder/domain/recs/model/Rec;", "position", "", "availableRewindCount", "currentRecs", "", "orderIndex", "(Lcom/tinder/domain/recs/model/Rec;IILjava/util/List;I)V", "getAvailableRewindCount", "()I", "getCurrentRecs", "()Ljava/util/List;", "getOrderIndex", "getPosition", "getRemovedRec", "()Lcom/tinder/domain/recs/model/Rec;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "", "engine_release"}, k = 1, mv = {1, 1, 9})
    public static final class Remove extends RecsUpdate {
        private final int availableRewindCount;
        @NotNull
        private final List<Rec> currentRecs;
        private final int orderIndex;
        private final int position;
        @NotNull
        private final Rec removedRec;

        @NotNull
        public static /* synthetic */ Remove copy$default(Remove remove, Rec rec, int i, int i2, List list, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                rec = remove.removedRec;
            }
            if ((i4 & 2) != 0) {
                i = remove.getPosition();
            }
            int i5 = i;
            if ((i4 & 4) != 0) {
                i2 = remove.getAvailableRewindCount();
            }
            int i6 = i2;
            if ((i4 & 8) != 0) {
                list = remove.getCurrentRecs();
            }
            List list2 = list;
            if ((i4 & 16) != 0) {
                i3 = remove.getOrderIndex();
            }
            return remove.copy(rec, i5, i6, list2, i3);
        }

        @NotNull
        public final Rec component1() {
            return this.removedRec;
        }

        public final int component2() {
            return getPosition();
        }

        public final int component3() {
            return getAvailableRewindCount();
        }

        @NotNull
        public final List<Rec> component4() {
            return getCurrentRecs();
        }

        public final int component5() {
            return getOrderIndex();
        }

        @NotNull
        public final Remove copy(@NotNull Rec rec, int i, int i2, @NotNull List<? extends Rec> list, int i3) {
            C2668g.b(rec, "removedRec");
            C2668g.b(list, "currentRecs");
            return new Remove(rec, i, i2, list, i3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Remove) {
                Remove remove = (Remove) obj;
                if (C2668g.a(this.removedRec, remove.removedRec)) {
                    if ((getPosition() == remove.getPosition() ? 1 : null) != null) {
                        if ((getAvailableRewindCount() == remove.getAvailableRewindCount() ? 1 : null) != null && C2668g.a(getCurrentRecs(), remove.getCurrentRecs())) {
                            if ((getOrderIndex() == remove.getOrderIndex() ? 1 : null) != null) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            Rec rec = this.removedRec;
            int i = 0;
            int hashCode = (((((rec != null ? rec.hashCode() : 0) * 31) + getPosition()) * 31) + getAvailableRewindCount()) * 31;
            List currentRecs = getCurrentRecs();
            if (currentRecs != null) {
                i = currentRecs.hashCode();
            }
            return ((hashCode + i) * 31) + getOrderIndex();
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Remove(removedRec=");
            stringBuilder.append(this.removedRec);
            stringBuilder.append(", position=");
            stringBuilder.append(getPosition());
            stringBuilder.append(", availableRewindCount=");
            stringBuilder.append(getAvailableRewindCount());
            stringBuilder.append(", currentRecs=");
            stringBuilder.append(getCurrentRecs());
            stringBuilder.append(", orderIndex=");
            stringBuilder.append(getOrderIndex());
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        @NotNull
        public final Rec getRemovedRec() {
            return this.removedRec;
        }

        public int getPosition() {
            return this.position;
        }

        public int getAvailableRewindCount() {
            return this.availableRewindCount;
        }

        @NotNull
        public List<Rec> getCurrentRecs() {
            return this.currentRecs;
        }

        public int getOrderIndex() {
            return this.orderIndex;
        }

        public Remove(@NotNull Rec rec, int i, int i2, @NotNull List<? extends Rec> list, int i3) {
            C2668g.b(rec, "removedRec");
            C2668g.b(list, "currentRecs");
            super(C19301m.a(rec), i, i2, list, i3);
            this.removedRec = rec;
            this.position = i;
            this.availableRewindCount = i2;
            this.currentRecs = list;
            this.orderIndex = i3;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001:\u0001&B=\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\fHÆ\u0003JK\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u0005HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\n\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006'"}, d2 = {"Lcom/tinder/domain/recs/model/RecsUpdate$Rewind;", "Lcom/tinder/domain/recs/model/RecsUpdate;", "swipe", "Lcom/tinder/domain/recs/model/Swipe;", "position", "", "availableRewindCount", "currentRecs", "", "Lcom/tinder/domain/recs/model/Rec;", "orderIndex", "reason", "Lcom/tinder/domain/recs/model/RecsUpdate$Rewind$Reason;", "(Lcom/tinder/domain/recs/model/Swipe;IILjava/util/List;ILcom/tinder/domain/recs/model/RecsUpdate$Rewind$Reason;)V", "getAvailableRewindCount", "()I", "getCurrentRecs", "()Ljava/util/List;", "getOrderIndex", "getPosition", "getReason", "()Lcom/tinder/domain/recs/model/RecsUpdate$Rewind$Reason;", "getSwipe", "()Lcom/tinder/domain/recs/model/Swipe;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "toString", "", "Reason", "engine_release"}, k = 1, mv = {1, 1, 9})
    public static final class Rewind extends RecsUpdate {
        private final int availableRewindCount;
        @NotNull
        private final List<Rec> currentRecs;
        private final int orderIndex;
        private final int position;
        @NotNull
        private final Reason reason;
        @NotNull
        private final Swipe swipe;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tinder/domain/recs/model/RecsUpdate$Rewind$Reason;", "", "engine_release"}, k = 1, mv = {1, 1, 9})
        public interface Reason {
        }

        @NotNull
        public static /* synthetic */ Rewind copy$default(Rewind rewind, Swipe swipe, int i, int i2, List list, int i3, Reason reason, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                swipe = rewind.swipe;
            }
            if ((i4 & 2) != 0) {
                i = rewind.getPosition();
            }
            int i5 = i;
            if ((i4 & 4) != 0) {
                i2 = rewind.getAvailableRewindCount();
            }
            int i6 = i2;
            if ((i4 & 8) != 0) {
                list = rewind.getCurrentRecs();
            }
            List list2 = list;
            if ((i4 & 16) != 0) {
                i3 = rewind.getOrderIndex();
            }
            int i7 = i3;
            if ((i4 & 32) != 0) {
                reason = rewind.reason;
            }
            return rewind.copy(swipe, i5, i6, list2, i7, reason);
        }

        @NotNull
        public final Swipe component1() {
            return this.swipe;
        }

        public final int component2() {
            return getPosition();
        }

        public final int component3() {
            return getAvailableRewindCount();
        }

        @NotNull
        public final List<Rec> component4() {
            return getCurrentRecs();
        }

        public final int component5() {
            return getOrderIndex();
        }

        @NotNull
        public final Reason component6() {
            return this.reason;
        }

        @NotNull
        public final Rewind copy(@NotNull Swipe swipe, int i, int i2, @NotNull List<? extends Rec> list, int i3, @NotNull Reason reason) {
            C2668g.b(swipe, "swipe");
            C2668g.b(list, "currentRecs");
            C2668g.b(reason, "reason");
            return new Rewind(swipe, i, i2, list, i3, reason);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Rewind) {
                Rewind rewind = (Rewind) obj;
                if (C2668g.a(this.swipe, rewind.swipe)) {
                    if ((getPosition() == rewind.getPosition() ? 1 : null) != null) {
                        if ((getAvailableRewindCount() == rewind.getAvailableRewindCount() ? 1 : null) != null && C2668g.a(getCurrentRecs(), rewind.getCurrentRecs())) {
                            return (getOrderIndex() == rewind.getOrderIndex() ? 1 : null) != null && C2668g.a(this.reason, rewind.reason);
                        }
                    }
                }
            }
        }

        public int hashCode() {
            Swipe swipe = this.swipe;
            int i = 0;
            int hashCode = (((((swipe != null ? swipe.hashCode() : 0) * 31) + getPosition()) * 31) + getAvailableRewindCount()) * 31;
            List currentRecs = getCurrentRecs();
            hashCode = (((hashCode + (currentRecs != null ? currentRecs.hashCode() : 0)) * 31) + getOrderIndex()) * 31;
            Reason reason = this.reason;
            if (reason != null) {
                i = reason.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Rewind(swipe=");
            stringBuilder.append(this.swipe);
            stringBuilder.append(", position=");
            stringBuilder.append(getPosition());
            stringBuilder.append(", availableRewindCount=");
            stringBuilder.append(getAvailableRewindCount());
            stringBuilder.append(", currentRecs=");
            stringBuilder.append(getCurrentRecs());
            stringBuilder.append(", orderIndex=");
            stringBuilder.append(getOrderIndex());
            stringBuilder.append(", reason=");
            stringBuilder.append(this.reason);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        @NotNull
        public final Swipe getSwipe() {
            return this.swipe;
        }

        public int getPosition() {
            return this.position;
        }

        public int getAvailableRewindCount() {
            return this.availableRewindCount;
        }

        @NotNull
        public List<Rec> getCurrentRecs() {
            return this.currentRecs;
        }

        public int getOrderIndex() {
            return this.orderIndex;
        }

        @NotNull
        public final Reason getReason() {
            return this.reason;
        }

        public Rewind(@NotNull Swipe swipe, int i, int i2, @NotNull List<? extends Rec> list, int i3, @NotNull Reason reason) {
            C2668g.b(swipe, "swipe");
            C2668g.b(list, "currentRecs");
            C2668g.b(reason, "reason");
            super(C19301m.a(), i, i2, list, i3);
            this.swipe = swipe;
            this.position = i;
            this.availableRewindCount = i2;
            this.currentRecs = list;
            this.orderIndex = i3;
            this.reason = reason;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B-\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\t\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/tinder/domain/recs/model/RecsUpdate$RewindCancel;", "Lcom/tinder/domain/recs/model/RecsUpdate;", "swipe", "Lcom/tinder/domain/recs/model/Swipe;", "availableRewindCount", "", "currentRecs", "", "Lcom/tinder/domain/recs/model/Rec;", "orderIndex", "(Lcom/tinder/domain/recs/model/Swipe;ILjava/util/List;I)V", "getAvailableRewindCount", "()I", "getCurrentRecs", "()Ljava/util/List;", "getOrderIndex", "getSwipe", "()Lcom/tinder/domain/recs/model/Swipe;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "", "engine_release"}, k = 1, mv = {1, 1, 9})
    public static final class RewindCancel extends RecsUpdate {
        private final int availableRewindCount;
        @NotNull
        private final List<Rec> currentRecs;
        private final int orderIndex;
        @NotNull
        private final Swipe swipe;

        @NotNull
        public static /* synthetic */ RewindCancel copy$default(RewindCancel rewindCancel, Swipe swipe, int i, List list, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                swipe = rewindCancel.swipe;
            }
            if ((i3 & 2) != 0) {
                i = rewindCancel.getAvailableRewindCount();
            }
            if ((i3 & 4) != 0) {
                list = rewindCancel.getCurrentRecs();
            }
            if ((i3 & 8) != 0) {
                i2 = rewindCancel.getOrderIndex();
            }
            return rewindCancel.copy(swipe, i, list, i2);
        }

        @NotNull
        public final Swipe component1() {
            return this.swipe;
        }

        public final int component2() {
            return getAvailableRewindCount();
        }

        @NotNull
        public final List<Rec> component3() {
            return getCurrentRecs();
        }

        public final int component4() {
            return getOrderIndex();
        }

        @NotNull
        public final RewindCancel copy(@NotNull Swipe swipe, int i, @NotNull List<? extends Rec> list, int i2) {
            C2668g.b(swipe, "swipe");
            C2668g.b(list, "currentRecs");
            return new RewindCancel(swipe, i, list, i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof RewindCancel) {
                RewindCancel rewindCancel = (RewindCancel) obj;
                if (C2668g.a(this.swipe, rewindCancel.swipe)) {
                    if ((getAvailableRewindCount() == rewindCancel.getAvailableRewindCount() ? 1 : null) != null && C2668g.a(getCurrentRecs(), rewindCancel.getCurrentRecs())) {
                        if ((getOrderIndex() == rewindCancel.getOrderIndex() ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            Swipe swipe = this.swipe;
            int i = 0;
            int hashCode = (((swipe != null ? swipe.hashCode() : 0) * 31) + getAvailableRewindCount()) * 31;
            List currentRecs = getCurrentRecs();
            if (currentRecs != null) {
                i = currentRecs.hashCode();
            }
            return ((hashCode + i) * 31) + getOrderIndex();
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("RewindCancel(swipe=");
            stringBuilder.append(this.swipe);
            stringBuilder.append(", availableRewindCount=");
            stringBuilder.append(getAvailableRewindCount());
            stringBuilder.append(", currentRecs=");
            stringBuilder.append(getCurrentRecs());
            stringBuilder.append(", orderIndex=");
            stringBuilder.append(getOrderIndex());
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        @NotNull
        public final Swipe getSwipe() {
            return this.swipe;
        }

        public int getAvailableRewindCount() {
            return this.availableRewindCount;
        }

        @NotNull
        public List<Rec> getCurrentRecs() {
            return this.currentRecs;
        }

        public int getOrderIndex() {
            return this.orderIndex;
        }

        public RewindCancel(@NotNull Swipe swipe, int i, @NotNull List<? extends Rec> list, int i2) {
            C2668g.b(swipe, "swipe");
            C2668g.b(list, "currentRecs");
            super(C19301m.a(), 0, i, list, i2);
            this.swipe = swipe;
            this.availableRewindCount = i;
            this.currentRecs = list;
            this.orderIndex = i2;
        }
    }

    private RecsUpdate(List<? extends Rec> list, int i, int i2, List<? extends Rec> list2, int i3) {
        this.modifiedRecs = list;
        this.position = i;
        this.availableRewindCount = i2;
        this.currentRecs = list2;
        this.orderIndex = i3;
    }

    @NotNull
    public List<Rec> getModifiedRecs() {
        return this.modifiedRecs;
    }

    public int getPosition() {
        return this.position;
    }

    public int getAvailableRewindCount() {
        return this.availableRewindCount;
    }

    @NotNull
    public List<Rec> getCurrentRecs() {
        return this.currentRecs;
    }

    public int getOrderIndex() {
        return this.orderIndex;
    }
}
