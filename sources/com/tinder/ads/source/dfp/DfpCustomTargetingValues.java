package com.tinder.ads.source.dfp;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/tinder/ads/source/dfp/DfpCustomTargetingValues;", "", "age", "", "genderId", "(Ljava/lang/String;Ljava/lang/String;)V", "getAge", "()Ljava/lang/String;", "getGenderId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "aggregator_release"}, k = 1, mv = {1, 1, 7})
public final class DfpCustomTargetingValues {
    @NotNull
    private final String age;
    @NotNull
    private final String genderId;

    @NotNull
    public static /* synthetic */ DfpCustomTargetingValues copy$default(DfpCustomTargetingValues dfpCustomTargetingValues, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dfpCustomTargetingValues.age;
        }
        if ((i & 2) != 0) {
            str2 = dfpCustomTargetingValues.genderId;
        }
        return dfpCustomTargetingValues.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.age;
    }

    @NotNull
    public final String component2() {
        return this.genderId;
    }

    @NotNull
    public final DfpCustomTargetingValues copy(@NotNull String str, @NotNull String str2) {
        C2668g.b(str, DfpCustomTargetingValuesKt.ADS_TARGETING_AGE);
        C2668g.b(str2, "genderId");
        return new DfpCustomTargetingValues(str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DfpCustomTargetingValues) {
                DfpCustomTargetingValues dfpCustomTargetingValues = (DfpCustomTargetingValues) obj;
                if (C2668g.a(this.age, dfpCustomTargetingValues.age) && C2668g.a(this.genderId, dfpCustomTargetingValues.genderId)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.age;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.genderId;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DfpCustomTargetingValues(age=");
        stringBuilder.append(this.age);
        stringBuilder.append(", genderId=");
        stringBuilder.append(this.genderId);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public DfpCustomTargetingValues(@NotNull String str, @NotNull String str2) {
        C2668g.b(str, DfpCustomTargetingValuesKt.ADS_TARGETING_AGE);
        C2668g.b(str2, "genderId");
        this.age = str;
        this.genderId = str2;
    }

    @NotNull
    public final String getAge() {
        return this.age;
    }

    @NotNull
    public final String getGenderId() {
        return this.genderId;
    }
}
