package com.tinder.loops.target;

import com.tinder.loops.analytics.TutorialAction;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"Lcom/tinder/loops/target/DefaultMediaSelectorViewTarget;", "Lcom/tinder/loops/target/MediaSelectorViewTarget;", "()V", "dismissTooltip", "", "tooltipAction", "Lcom/tinder/loops/analytics/TutorialAction;", "showMediaTooltip", "loops_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.loops.target.b */
public final class C11950b implements MediaSelectorViewTarget {
    public void dismissTooltip(@NotNull TutorialAction tutorialAction) {
        C2668g.b(tutorialAction, "tooltipAction");
    }

    public void showMediaTooltip() {
    }
}
