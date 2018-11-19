package com.tinder.recs.view.tappablecards;

import android.support.v4.view.C0592b;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0011\u0012B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bJ\u001e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f¨\u0006\u0013"}, d2 = {"Lcom/tinder/recs/view/tappablecards/TapRegionDetector;", "", "()V", "create", "Landroid/support/v4/view/GestureDetectorCompat;", "parent", "Landroid/view/View;", "onTap", "Lkotlin/Function1;", "Lcom/tinder/recs/view/tappablecards/TapRegionDetector$TapRegion;", "", "isOverTap", "", "region", "page", "", "count", "SingleTapListener", "TapRegion", "recs-cards_release"}, k = 1, mv = {1, 1, 10})
public final class TapRegionDetector {
    public static final TapRegionDetector INSTANCE = new TapRegionDetector();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0016R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/recs/view/tappablecards/TapRegionDetector$SingleTapListener;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "onSingleTap", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "", "(Lkotlin/jvm/functions/Function1;)V", "onDown", "", "e", "onSingleTapUp", "recs-cards_release"}, k = 1, mv = {1, 1, 10})
    private static final class SingleTapListener extends SimpleOnGestureListener {
        private final Function1<MotionEvent, C15813i> onSingleTap;

        public boolean onDown(@NotNull MotionEvent motionEvent) {
            C2668g.b(motionEvent, "e");
            return true;
        }

        public SingleTapListener(@NotNull Function1<? super MotionEvent, C15813i> function1) {
            C2668g.b(function1, "onSingleTap");
            this.onSingleTap = function1;
        }

        public boolean onSingleTapUp(@NotNull MotionEvent motionEvent) {
            C2668g.b(motionEvent, "e");
            this.onSingleTap.invoke(motionEvent);
            return true;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/tinder/recs/view/tappablecards/TapRegionDetector$TapRegion;", "", "(Ljava/lang/String;I)V", "LEFT", "RIGHT", "recs-cards_release"}, k = 1, mv = {1, 1, 10})
    public enum TapRegion {
    }

    private TapRegionDetector() {
    }

    @NotNull
    public final C0592b create(@NotNull View view, @NotNull Function1<? super TapRegion, C15813i> function1) {
        C2668g.b(view, "parent");
        C2668g.b(function1, "onTap");
        C0592b c0592b = new C0592b(view.getContext(), new SingleTapListener(new TapRegionDetector$create$1(view, function1)));
        c0592b.a(null);
        return c0592b;
    }

    public final boolean isOverTap(@NotNull TapRegion tapRegion, int i, int i2) {
        C2668g.b(tapRegion, "region");
        switch (tapRegion) {
            case LEFT:
                if (i != 0) {
                    return false;
                }
                break;
            case RIGHT:
                if (i == i2 - 1) {
                    break;
                }
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return true;
    }
}
