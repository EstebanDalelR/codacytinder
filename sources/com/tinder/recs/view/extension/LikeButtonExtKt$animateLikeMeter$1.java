package com.tinder.recs.view.extension;

import com.facebook.rebound.C1811f;
import com.facebook.rebound.C3442e;
import com.tinder.recs.view.LikeMeter;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"com/tinder/recs/view/extension/LikeButtonExtKt$animateLikeMeter$1", "Lcom/facebook/rebound/SimpleSpringListener;", "(Lcom/tinder/recs/view/LikeMeter;)V", "onSpringAtRest", "", "spring", "Lcom/facebook/rebound/Spring;", "onSpringUpdate", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class LikeButtonExtKt$animateLikeMeter$1 extends C3442e {
    final /* synthetic */ LikeMeter $meterView;

    LikeButtonExtKt$animateLikeMeter$1(LikeMeter likeMeter) {
        this.$meterView = likeMeter;
    }

    public void onSpringUpdate(@NotNull C1811f c1811f) {
        C2668g.b(c1811f, "spring");
        LikeMeter likeMeter = this.$meterView;
        if (likeMeter != null) {
            likeMeter.setPercentFull((float) c1811f.c());
        }
    }

    public void onSpringAtRest(@NotNull C1811f c1811f) {
        C2668g.b(c1811f, "spring");
        c1811f.a();
    }
}
