package com.tinder.loops.ui.view;

import android.graphics.Rect;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/Rect;", "invoke"}, k = 3, mv = {1, 1, 10})
final class VideoTimeline$selectionBox$2 extends Lambda implements Function0<Rect> {
    /* renamed from: a */
    final /* synthetic */ VideoTimeline f44527a;

    VideoTimeline$selectionBox$2(VideoTimeline videoTimeline) {
        this.f44527a = videoTimeline;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        return m53771a();
    }

    @NotNull
    /* renamed from: a */
    public final Rect m53771a() {
        return new Rect(this.f44527a.getWidth() / 2, this.f44527a.f44530c / 2, (this.f44527a.getWidth() / 2) + this.f44527a.f44532e, this.f44527a.getHeight() - (this.f44527a.f44530c / 2));
    }
}
