package com.tinder.recs.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/tinder/recs/model/AgeConfig;", "", "minAge", "", "maxAge", "(II)V", "getMaxAge", "()I", "getMinAge", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class AgeConfig {
    private final int maxAge;
    private final int minAge;

    @NotNull
    public static /* synthetic */ AgeConfig copy$default(AgeConfig ageConfig, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = ageConfig.minAge;
        }
        if ((i3 & 2) != 0) {
            i2 = ageConfig.maxAge;
        }
        return ageConfig.copy(i, i2);
    }

    public final int component1() {
        return this.minAge;
    }

    public final int component2() {
        return this.maxAge;
    }

    @NotNull
    public final AgeConfig copy(int i, int i2) {
        return new AgeConfig(i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AgeConfig) {
            AgeConfig ageConfig = (AgeConfig) obj;
            if ((this.minAge == ageConfig.minAge ? 1 : null) != null) {
                if ((this.maxAge == ageConfig.maxAge ? 1 : null) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.minAge * 31) + this.maxAge;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AgeConfig(minAge=");
        stringBuilder.append(this.minAge);
        stringBuilder.append(", maxAge=");
        stringBuilder.append(this.maxAge);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public AgeConfig(int i, int i2) {
        this.minAge = i;
        this.maxAge = i2;
    }

    public final int getMinAge() {
        return this.minAge;
    }

    public final int getMaxAge() {
        return this.maxAge;
    }
}
