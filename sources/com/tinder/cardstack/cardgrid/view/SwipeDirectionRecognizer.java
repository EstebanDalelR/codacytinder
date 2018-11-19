package com.tinder.cardstack.cardgrid.view;

import com.mapbox.mapboxsdk.style.layers.Property;
import com.tinder.cardstack.cardgrid.p183a.C8365a;
import com.tinder.cardstack.model.SwipeDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import kotlin.ranges.ClosedRange;
import kotlin.ranges.ClosedRange.C15831a;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lcom/tinder/cardstack/cardgrid/view/SwipeDirectionRecognizer;", "", "()V", "findSwipeDirection", "Lcom/tinder/cardstack/model/SwipeDirection;", "point", "Lcom/tinder/cardstack/cardgrid/model/Point;", "RotationDegreeRange", "cardstack_release"}, k = 1, mv = {1, 1, 9})
public final class SwipeDirectionRecognizer {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0017\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\u0011\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0002R\u0014\u0010\u0005\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/tinder/cardstack/cardgrid/view/SwipeDirectionRecognizer$RotationDegreeRange;", "", "Lkotlin/ranges/ClosedRange;", "", "start", "endInclusive", "(Ljava/lang/String;IFF)V", "getEndInclusive", "()Ljava/lang/Float;", "getStart", "contains", "", "value", "RIGHT", "LEFT", "UP", "DOWN", "cardstack_release"}, k = 1, mv = {1, 1, 9})
    private enum RotationDegreeRange implements ClosedRange<Float> {
        ;
        
        private final float endInclusive;
        private final float start;

        protected RotationDegreeRange(float f, float f2) {
            this.start = f;
            this.endInclusive = f2;
        }

        public boolean isEmpty() {
            return C15831a.a(this);
        }

        @NotNull
        public Float getStart() {
            return Float.valueOf(this.start);
        }

        @NotNull
        public Float getEndInclusive() {
            return Float.valueOf(this.endInclusive);
        }

        public boolean contains(float f) {
            if (getStart().floatValue() <= getEndInclusive().floatValue()) {
                return C15831a.a(this, Float.valueOf(f));
            }
            if (f <= getStart().floatValue()) {
                if (f > getEndInclusive().floatValue()) {
                    f = 0.0f;
                    return f;
                }
            }
            f = Float.MIN_VALUE;
            return f;
        }
    }

    @NotNull
    /* renamed from: a */
    public final SwipeDirection m35742a(@NotNull C8365a c8365a) {
        C2668g.b(c8365a, Property.SYMBOL_PLACEMENT_POINT);
        float b = c8365a.m35607b();
        if (RotationDegreeRange.LEFT.contains(b)) {
            return SwipeDirection.LEFT;
        }
        if (RotationDegreeRange.RIGHT.contains(b)) {
            return SwipeDirection.RIGHT;
        }
        if (RotationDegreeRange.UP.contains(b)) {
            return SwipeDirection.UP;
        }
        if (RotationDegreeRange.DOWN.contains(b) != null) {
            return SwipeDirection.DOWN;
        }
        return SwipeDirection.NONE;
    }
}
