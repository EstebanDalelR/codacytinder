package com.tinder.recs.view.loops.target;

import com.tinder.video.model.C17250a;
import com.tinder.video.model.C17251d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006H\u0016¨\u0006\n"}, d2 = {"Lcom/tinder/recs/view/loops/target/DefaultTappyLoopsCarouselTarget;", "Lcom/tinder/recs/view/loops/target/TappyLoopsCarouselTarget;", "()V", "showMedia", "", "videoViewModels", "", "Lcom/tinder/video/model/VideoViewModel;", "imageViewModels", "Lcom/tinder/video/model/ImageViewModel;", "recs-cards_release"}, k = 1, mv = {1, 1, 10})
public final class DefaultTappyLoopsCarouselTarget implements TappyLoopsCarouselTarget {
    public void showMedia(@NotNull List<C17251d> list, @NotNull List<C17250a> list2) {
        C2668g.b(list, "videoViewModels");
        C2668g.b(list2, "imageViewModels");
    }
}
