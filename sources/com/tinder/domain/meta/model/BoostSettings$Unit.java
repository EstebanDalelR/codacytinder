package com.tinder.domain.meta.model;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.facebook.ads.internal.C1391d;
import com.foursquare.internal.util.C1948m;

public enum BoostSettings$Unit {
    SECOND("s"),
    DAY(C1391d.f3780a),
    WEEK("w"),
    MONTH(C1948m.f5228a);
    
    private final String unitString;

    private BoostSettings$Unit(String str) {
        this.unitString = str;
    }

    private String unitString() {
        return this.unitString;
    }

    @NonNull
    public static BoostSettings$Unit from(@Nullable String str) throws IllegalArgumentException {
        if (str == null) {
            return WEEK;
        }
        for (BoostSettings$Unit boostSettings$Unit : values()) {
            if (boostSettings$Unit.unitString().equals(str)) {
                return boostSettings$Unit;
            }
        }
        throw new IllegalArgumentException();
    }
}
