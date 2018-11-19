package com.bumptech.glide.load.model;

import android.content.Context;

public interface ModelLoaderFactory<T, Y> {
    ModelLoader<T, Y> build(Context context, C1035c c1035c);

    void teardown();
}
