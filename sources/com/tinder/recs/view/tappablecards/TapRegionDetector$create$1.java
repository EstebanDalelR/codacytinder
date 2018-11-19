package com.tinder.recs.view.tappablecards;

import android.view.MotionEvent;
import android.view.View;
import com.tinder.recs.view.tappablecards.TapRegionDetector.TapRegion;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "event", "Landroid/view/MotionEvent;", "invoke"}, k = 3, mv = {1, 1, 10})
final class TapRegionDetector$create$1 extends Lambda implements Function1<MotionEvent, C15813i> {
    final /* synthetic */ Function1 $onTap;
    final /* synthetic */ View $parent;

    TapRegionDetector$create$1(View view, Function1 function1) {
        this.$parent = view;
        this.$onTap = function1;
        super(1);
    }

    public final void invoke(@NotNull MotionEvent motionEvent) {
        C2668g.b(motionEvent, "event");
        this.$onTap.invoke(motionEvent.getX() < ((float) this.$parent.getWidth()) / 2.0f ? TapRegion.LEFT : TapRegion.RIGHT);
    }
}
