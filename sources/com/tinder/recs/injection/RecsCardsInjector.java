package com.tinder.recs.injection;

import com.tinder.recs.view.loops.TappyLoopsCarouselView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/tinder/recs/injection/RecsCardsInjector;", "", "inject", "", "tappyLoopsCarouselView", "Lcom/tinder/recs/view/loops/TappyLoopsCarouselView;", "Factory", "recs-cards_release"}, k = 1, mv = {1, 1, 10})
public interface RecsCardsInjector {
    void inject(@NotNull TappyLoopsCarouselView tappyLoopsCarouselView);
}
