package com.squareup.sqldelight;

import android.support.annotation.NonNull;

public interface ColumnAdapter<T, S> {
    @NonNull
    T decode(S s);

    S encode(@NonNull T t);
}
