package com.tinder.data.adapter;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.api.model.common.ProcessedFile;
import com.tinder.domain.common.model.Photo.Render;
import java8.util.Objects;

public class ab extends C2646o<Render, ProcessedFile> {
    @Nullable
    /* renamed from: a */
    public Render m43078a(@NonNull ProcessedFile processedFile) {
        String str = (String) Objects.b(processedFile.url(), "");
        if (str.isEmpty()) {
            return null;
        }
        return Render.builder().url(str).width(((Integer) Objects.b(processedFile.width(), Integer.valueOf(0))).intValue()).height(((Integer) Objects.b(processedFile.height(), Integer.valueOf(0))).intValue()).build();
    }
}
