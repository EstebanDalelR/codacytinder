package com.tinder.domain.profile.model;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\u0003HÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/tinder/domain/profile/model/FacebookInformation;", "", "connectionCount", "", "(I)V", "getConnectionCount", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class FacebookInformation {
    public static final Companion Companion = new Companion();
    @NotNull
    @JvmField
    public static final FacebookInformation DEFAULT = new FacebookInformation(0);
    private final int connectionCount;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tinder/domain/profile/model/FacebookInformation$Companion;", "", "()V", "DEFAULT", "Lcom/tinder/domain/profile/model/FacebookInformation;", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class Companion {
        private Companion() {
        }
    }

    @NotNull
    public static /* synthetic */ FacebookInformation copy$default(FacebookInformation facebookInformation, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = facebookInformation.connectionCount;
        }
        return facebookInformation.copy(i);
    }

    public final int component1() {
        return this.connectionCount;
    }

    @NotNull
    public final FacebookInformation copy(int i) {
        return new FacebookInformation(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FacebookInformation) {
            if ((this.connectionCount == ((FacebookInformation) obj).connectionCount ? 1 : null) != null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.connectionCount;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FacebookInformation(connectionCount=");
        stringBuilder.append(this.connectionCount);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public FacebookInformation(int i) {
        this.connectionCount = i;
    }

    public final int getConnectionCount() {
        return this.connectionCount;
    }
}
