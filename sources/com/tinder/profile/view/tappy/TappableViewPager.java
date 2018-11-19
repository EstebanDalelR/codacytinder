package com.tinder.profile.view.tappy;

import android.content.Context;
import android.support.v4.view.C0592b;
import android.support.v4.view.C0600i;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.tinder.recs.view.tappablecards.TapRegionDetector;
import com.tinder.recs.view.tappablecards.TapRegionDetector.TapRegion;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\tH\u0002J\u0010\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016Rg\u0010\u0007\u001aO\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\bj\u0004\u0018\u0001`\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/tinder/profile/view/tappy/TappableViewPager;", "Landroid/support/v4/view/ViewPager;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "onTapListener", "Lkotlin/Function3;", "Lcom/tinder/recs/view/tappablecards/TapRegionDetector$TapRegion;", "Lkotlin/ParameterName;", "name", "region", "", "selectedPage", "", "isOverTap", "", "Lcom/tinder/profile/view/tappy/OnTapListener;", "getOnTapListener", "()Lkotlin/jvm/functions/Function3;", "setOnTapListener", "(Lkotlin/jvm/functions/Function3;)V", "tapDetector", "Landroid/support/v4/view/GestureDetectorCompat;", "dispatchTapEvent", "onTouchEvent", "e", "Landroid/view/MotionEvent;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class TappableViewPager extends ViewPager {
    @Nullable
    /* renamed from: a */
    private Function3<? super TapRegion, ? super Integer, ? super Boolean, C15813i> f50346a;
    /* renamed from: b */
    private final C0592b f50347b = TapRegionDetector.INSTANCE.create(this, new TappableViewPager$tapDetector$1(this));

    public TappableViewPager(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.b(context, "context");
        C2668g.b(attributeSet, "attrs");
        super(context, attributeSet);
    }

    @Nullable
    public final Function3<TapRegion, Integer, Boolean, C15813i> getOnTapListener() {
        return this.f50346a;
    }

    public final void setOnTapListener(@Nullable Function3<? super TapRegion, ? super Integer, ? super Boolean, C15813i> function3) {
        this.f50346a = function3;
    }

    public boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        C2668g.b(motionEvent, "e");
        if (!this.f50347b.a(motionEvent)) {
            if (super.onTouchEvent(motionEvent) == null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: a */
    private final void m61087a(TapRegion tapRegion) {
        int currentItem = getCurrentItem();
        TapRegionDetector tapRegionDetector = TapRegionDetector.INSTANCE;
        C0600i adapter = getAdapter();
        boolean isOverTap = tapRegionDetector.isOverTap(tapRegion, currentItem, adapter != null ? adapter.getCount() : 0);
        if (!isOverTap) {
            currentItem += tapRegion == TapRegion.LEFT ? -1 : 1;
        }
        Function3 function3 = this.f50346a;
        if (function3 != null) {
            function3.invoke(tapRegion, Integer.valueOf(currentItem), Boolean.valueOf(isOverTap));
        }
    }
}
