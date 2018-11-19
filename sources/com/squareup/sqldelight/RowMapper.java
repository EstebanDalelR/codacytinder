package com.squareup.sqldelight;

import android.database.Cursor;
import android.support.annotation.CheckResult;
import android.support.annotation.NonNull;

public interface RowMapper<T> {
    @CheckResult
    @NonNull
    T map(@NonNull Cursor cursor);
}
