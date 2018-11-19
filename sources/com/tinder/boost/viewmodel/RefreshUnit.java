package com.tinder.boost.viewmodel;

import android.support.annotation.PluralsRes;
import com.tinder.R;

public enum RefreshUnit {
    SECONDS(R.plurals.seconds),
    DAYS(R.plurals.day),
    WEEKS(R.plurals.week),
    MONTHS(R.plurals.month);
    
    @PluralsRes
    private final int mStringRes;

    private RefreshUnit(int i) {
        this.mStringRes = i;
    }

    @PluralsRes
    public int getStringRes() {
        return this.mStringRes;
    }
}
