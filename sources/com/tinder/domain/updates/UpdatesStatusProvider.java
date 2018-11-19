package com.tinder.domain.updates;

import io.reactivex.C3957b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0005J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&¨\u0006\u0006"}, d2 = {"Lcom/tinder/domain/updates/UpdatesStatusProvider;", "", "observeUpdatesStatus", "Lio/reactivex/Flowable;", "Lcom/tinder/domain/updates/UpdatesStatusProvider$Status;", "Status", "domain_release"}, k = 1, mv = {1, 1, 10})
public interface UpdatesStatusProvider {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/tinder/domain/updates/UpdatesStatusProvider$Status;", "", "isInitiatedByNudge", "", "hasData", "(ZZ)V", "getHasData", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class Status {
        private final boolean hasData;
        private final boolean isInitiatedByNudge;

        @NotNull
        public static /* synthetic */ Status copy$default(Status status, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = status.isInitiatedByNudge;
            }
            if ((i & 2) != 0) {
                z2 = status.hasData;
            }
            return status.copy(z, z2);
        }

        public final boolean component1() {
            return this.isInitiatedByNudge;
        }

        public final boolean component2() {
            return this.hasData;
        }

        @NotNull
        public final Status copy(boolean z, boolean z2) {
            return new Status(z, z2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Status) {
                Status status = (Status) obj;
                if ((this.isInitiatedByNudge == status.isInitiatedByNudge ? 1 : null) != null) {
                    if ((this.hasData == status.hasData ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            int i = this.isInitiatedByNudge;
            int i2 = 1;
            if (i != 0) {
                i = 1;
            }
            i *= 31;
            boolean z = this.hasData;
            if (!z) {
                i2 = z;
            }
            return i + i2;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Status(isInitiatedByNudge=");
            stringBuilder.append(this.isInitiatedByNudge);
            stringBuilder.append(", hasData=");
            stringBuilder.append(this.hasData);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public Status(boolean z, boolean z2) {
            this.isInitiatedByNudge = z;
            this.hasData = z2;
        }

        public final boolean isInitiatedByNudge() {
            return this.isInitiatedByNudge;
        }

        public final boolean getHasData() {
            return this.hasData;
        }
    }

    @NotNull
    C3957b<Status> observeUpdatesStatus();
}
