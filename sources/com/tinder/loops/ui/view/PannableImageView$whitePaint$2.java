package com.tinder.loops.ui.view;

import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/Paint;", "invoke"}, k = 3, mv = {1, 1, 10})
final class PannableImageView$whitePaint$2 extends Lambda implements Function0<Paint> {
    /* renamed from: a */
    public static final PannableImageView$whitePaint$2 f44520a = new PannableImageView$whitePaint$2();

    PannableImageView$whitePaint$2() {
        super(0);
    }

    public /* synthetic */ Object invoke() {
        return m53761a();
    }

    @NotNull
    /* renamed from: a */
    public final Paint m53761a() {
        Paint paint = new Paint();
        paint.setDither(true);
        paint.setColor(-1);
        paint.setStyle(Style.STROKE);
        paint.setStrokeJoin(Join.ROUND);
        paint.setStrokeCap(Cap.ROUND);
        paint.setStrokeWidth(2.0f);
        return paint;
    }
}
