package com.tinder.data.adapter;

import android.support.annotation.NonNull;

public interface DatabaseModelAdapter<DATA, DOMAIN> {
    @NonNull
    DOMAIN fromModel(@NonNull DATA data);
}
