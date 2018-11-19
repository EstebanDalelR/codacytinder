package com.tinder.domain.common.model;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/tinder/domain/common/model/ConnectivityInfo;", "", "connectivityStatus", "Lcom/tinder/domain/common/model/ConnectivityStatus;", "(Lcom/tinder/domain/common/model/ConnectivityStatus;)V", "getConnectivityStatus", "()Lcom/tinder/domain/common/model/ConnectivityStatus;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class ConnectivityInfo {
    @NotNull
    private final ConnectivityStatus connectivityStatus;

    @NotNull
    public static /* synthetic */ ConnectivityInfo copy$default(ConnectivityInfo connectivityInfo, ConnectivityStatus connectivityStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            connectivityStatus = connectivityInfo.connectivityStatus;
        }
        return connectivityInfo.copy(connectivityStatus);
    }

    @NotNull
    public final ConnectivityStatus component1() {
        return this.connectivityStatus;
    }

    @NotNull
    public final ConnectivityInfo copy(@NotNull ConnectivityStatus connectivityStatus) {
        C2668g.b(connectivityStatus, "connectivityStatus");
        return new ConnectivityInfo(connectivityStatus);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConnectivityInfo) {
                if (C2668g.a(this.connectivityStatus, ((ConnectivityInfo) obj).connectivityStatus)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        ConnectivityStatus connectivityStatus = this.connectivityStatus;
        return connectivityStatus != null ? connectivityStatus.hashCode() : 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ConnectivityInfo(connectivityStatus=");
        stringBuilder.append(this.connectivityStatus);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public ConnectivityInfo(@NotNull ConnectivityStatus connectivityStatus) {
        C2668g.b(connectivityStatus, "connectivityStatus");
        this.connectivityStatus = connectivityStatus;
    }

    @NotNull
    public final ConnectivityStatus getConnectivityStatus() {
        return this.connectivityStatus;
    }
}
