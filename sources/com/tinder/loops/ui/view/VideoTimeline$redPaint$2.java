package com.tinder.loops.ui.view;

import android.graphics.Paint;
import android.graphics.Paint.Style;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/Paint;", "invoke"}, k = 3, mv = {1, 1, 10})
final class VideoTimeline$redPaint$2 extends Lambda implements Function0<Paint> {
    /* renamed from: a */
    final /* synthetic */ VideoTimeline f44526a;

    VideoTimeline$redPaint$2(VideoTimeline videoTimeline) {
        this.f44526a = videoTimeline;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        return m53770a();
    }

    @NotNull
    /* renamed from: a */
    public final Paint m53770a() {
        Paint paint = new Paint();
        paint.setColor(-65536);
        paint.setStyle(Style.STROKE);
        paint.setStrokeWidth((float) this.f44526a.f44530c);
        return paint;
    }
}
