package com.tinder.domain.profile.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/tinder/domain/profile/model/Coordinates;", "", "x", "", "y", "(DD)V", "getX", "()D", "getY", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class Coordinates {
    /* renamed from: x */
    private final double f31206x;
    /* renamed from: y */
    private final double f31207y;

    @NotNull
    public static /* synthetic */ Coordinates copy$default(Coordinates coordinates, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = coordinates.f31206x;
        }
        if ((i & 2) != 0) {
            d2 = coordinates.f31207y;
        }
        return coordinates.copy(d, d2);
    }

    public final double component1() {
        return this.f31206x;
    }

    public final double component2() {
        return this.f31207y;
    }

    @NotNull
    public final Coordinates copy(double d, double d2) {
        return new Coordinates(d, d2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Coordinates) {
                Coordinates coordinates = (Coordinates) obj;
                if (Double.compare(this.f31206x, coordinates.f31206x) == 0 && Double.compare(this.f31207y, coordinates.f31207y) == 0) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f31206x);
        int i = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31;
        long doubleToLongBits2 = Double.doubleToLongBits(this.f31207y);
        return i + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Coordinates(x=");
        stringBuilder.append(this.f31206x);
        stringBuilder.append(", y=");
        stringBuilder.append(this.f31207y);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public Coordinates(double d, double d2) {
        this.f31206x = d;
        this.f31207y = d2;
    }

    public final double getX() {
        return this.f31206x;
    }

    public final double getY() {
        return this.f31207y;
    }
}
