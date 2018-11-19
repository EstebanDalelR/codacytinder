package com.tinder.domain.updates.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u000e"}, d2 = {"Lcom/tinder/domain/updates/model/UpdateSignal;", "", "isFromNudge", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class UpdateSignal {
    private final boolean isFromNudge;

    @NotNull
    public static /* synthetic */ UpdateSignal copy$default(UpdateSignal updateSignal, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = updateSignal.isFromNudge;
        }
        return updateSignal.copy(z);
    }

    public final boolean component1() {
        return this.isFromNudge;
    }

    @NotNull
    public final UpdateSignal copy(boolean z) {
        return new UpdateSignal(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UpdateSignal) {
            if ((this.isFromNudge == ((UpdateSignal) obj).isFromNudge ? 1 : null) != null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        boolean z = this.isFromNudge;
        return z ? 1 : z;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("UpdateSignal(isFromNudge=");
        stringBuilder.append(this.isFromNudge);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public UpdateSignal(boolean z) {
        this.isFromNudge = z;
    }

    public final boolean isFromNudge() {
        return this.isFromNudge;
    }
}
