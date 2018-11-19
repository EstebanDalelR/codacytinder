package com.bumptech.glide.request.target;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.load.resource.p028a.C1041b;

/* renamed from: com.bumptech.glide.request.target.f */
public class C1070f {
    /* renamed from: a */
    public <Z> Target<Z> m3678a(ImageView imageView, Class<Z> cls) {
        if (C1041b.class.isAssignableFrom(cls)) {
            return new C4457d(imageView);
        }
        if (Bitmap.class.equals(cls)) {
            return new C4455b(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new C4456c(imageView);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unhandled class: ");
        stringBuilder.append(cls);
        stringBuilder.append(", try .as*(Class).transcode(ResourceTranscoder)");
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
