package com.tinder.toppicks.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.content.C0432b;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.C3082c;
import com.tinder.recs.view.BitmapKt;
import com.tinder.toppicks.C15235b.C15225a;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J(\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/toppicks/view/GoldGradientImageFilterTransformer;", "Lcom/bumptech/glide/load/resource/bitmap/BitmapTransformation;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getId", "", "transform", "Landroid/graphics/Bitmap;", "pool", "Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;", "toTransform", "outWidth", "", "outHeight", "toppicks_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.toppicks.view.a */
public final class C18244a extends C3082c {
    /* renamed from: a */
    private final Context f56559a;

    @NotNull
    public String getId() {
        return "com.tinder.toppicks.view.GoldGradientImageFilterTransformer";
    }

    public C18244a(@NotNull Context context) {
        C2668g.b(context, "context");
        super(context);
        this.f56559a = context;
    }

    @NotNull
    /* renamed from: a */
    protected Bitmap m66122a(@NotNull BitmapPool bitmapPool, @NotNull Bitmap bitmap, int i, int i2) {
        C2668g.b(bitmapPool, "pool");
        C2668g.b(bitmap, "toTransform");
        return BitmapKt.applyGradientFilter$default(bitmap, 0.0f, C0432b.c(this.f56559a, C15225a.tp_gold_two), C0432b.c(this.f56559a, C15225a.tp_gold_three), 1, null);
    }
}
