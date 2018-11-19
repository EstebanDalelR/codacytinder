package com.tinder.recs.view.tappablecards;

import com.tinder.recs.view.tappablecards.TapRegionDetector.TapRegion;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "p1", "Lcom/tinder/recs/view/tappablecards/TapRegionDetector$TapRegion;", "Lkotlin/ParameterName;", "name", "tapRegion", "invoke"}, k = 3, mv = {1, 1, 10})
final class ImageDrawableTappableView$tapRegionDetector$1 extends FunctionReference implements Function1<TapRegion, C15813i> {
    ImageDrawableTappableView$tapRegionDetector$1(ImageDrawableTappableView imageDrawableTappableView) {
        super(1, imageDrawableTappableView);
    }

    public final String getName() {
        return "dispatchTapRegionEvent";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.m59860a(ImageDrawableTappableView.class);
    }

    public final String getSignature() {
        return "dispatchTapRegionEvent(Lcom/tinder/recs/view/tappablecards/TapRegionDetector$TapRegion;)V";
    }

    public final void invoke(@NotNull TapRegion tapRegion) {
        C2668g.b(tapRegion, "p1");
        ((ImageDrawableTappableView) this.receiver).dispatchTapRegionEvent(tapRegion);
    }
}
