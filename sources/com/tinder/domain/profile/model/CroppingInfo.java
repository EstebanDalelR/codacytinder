package com.tinder.domain.profile.model;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0006\u0010\u0011\u001a\u00020\rJ\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/tinder/domain/profile/model/CroppingInfo;", "", "offsetPercent", "Lcom/tinder/domain/profile/model/Coordinates;", "distancePercent", "(Lcom/tinder/domain/profile/model/Coordinates;Lcom/tinder/domain/profile/model/Coordinates;)V", "getDistancePercent", "()Lcom/tinder/domain/profile/model/Coordinates;", "getOffsetPercent", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "isMissingCroppingCoordinates", "toString", "", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class CroppingInfo {
    @NotNull
    private final Coordinates distancePercent;
    @NotNull
    private final Coordinates offsetPercent;

    @NotNull
    public static /* synthetic */ CroppingInfo copy$default(CroppingInfo croppingInfo, Coordinates coordinates, Coordinates coordinates2, int i, Object obj) {
        if ((i & 1) != 0) {
            coordinates = croppingInfo.offsetPercent;
        }
        if ((i & 2) != 0) {
            coordinates2 = croppingInfo.distancePercent;
        }
        return croppingInfo.copy(coordinates, coordinates2);
    }

    @NotNull
    public final Coordinates component1() {
        return this.offsetPercent;
    }

    @NotNull
    public final Coordinates component2() {
        return this.distancePercent;
    }

    @NotNull
    public final CroppingInfo copy(@NotNull Coordinates coordinates, @NotNull Coordinates coordinates2) {
        C2668g.b(coordinates, "offsetPercent");
        C2668g.b(coordinates2, "distancePercent");
        return new CroppingInfo(coordinates, coordinates2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CroppingInfo) {
                CroppingInfo croppingInfo = (CroppingInfo) obj;
                if (C2668g.a(this.offsetPercent, croppingInfo.offsetPercent) && C2668g.a(this.distancePercent, croppingInfo.distancePercent)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Coordinates coordinates = this.offsetPercent;
        int i = 0;
        int hashCode = (coordinates != null ? coordinates.hashCode() : 0) * 31;
        Coordinates coordinates2 = this.distancePercent;
        if (coordinates2 != null) {
            i = coordinates2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CroppingInfo(offsetPercent=");
        stringBuilder.append(this.offsetPercent);
        stringBuilder.append(", distancePercent=");
        stringBuilder.append(this.distancePercent);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public CroppingInfo(@NotNull Coordinates coordinates, @NotNull Coordinates coordinates2) {
        C2668g.b(coordinates, "offsetPercent");
        C2668g.b(coordinates2, "distancePercent");
        this.offsetPercent = coordinates;
        this.distancePercent = coordinates2;
    }

    @NotNull
    public final Coordinates getOffsetPercent() {
        return this.offsetPercent;
    }

    @NotNull
    public final Coordinates getDistancePercent() {
        return this.distancePercent;
    }

    public final boolean isMissingCroppingCoordinates() {
        double d = (double) -1.0f;
        if (!(this.offsetPercent.getX() == d || this.offsetPercent.getY() == d || this.distancePercent.getX() == d)) {
            if (this.distancePercent.getY() != d) {
                return false;
            }
        }
        return true;
    }
}
