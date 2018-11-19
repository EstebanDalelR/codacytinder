package com.tinder.recs.view.extension;

import com.facebook.rebound.C1811f;
import com.facebook.rebound.C1812g;
import com.tinder.gamepad.view.animation.C9661a;
import com.tinder.recs.view.LikeButton;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"animateLikeMeter", "", "Lcom/tinder/recs/view/LikeButton;", "percentFull", "", "Tinder_release"}, k = 2, mv = {1, 1, 10})
public final class LikeButtonExtKt {
    public static final void animateLikeMeter(@NotNull LikeButton likeButton, int i) {
        C2668g.b(likeButton, "$receiver");
        i = Math.max(15, i);
        likeButton = likeButton.getLikeMeter();
        float percentFull = likeButton != null ? likeButton.getPercentFull() : 0.0f;
        i = ((float) i) / 1120403456;
        C1811f a = C9661a.a();
        C1812g a2 = C1812g.a((double) 68, (double) 4);
        C2668g.a(a, "spring");
        a.a(a2);
        a.a(new LikeButtonExtKt$animateLikeMeter$1(likeButton));
        a.a((double) percentFull);
        a.b((double) i);
    }
}
