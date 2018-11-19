package com.tinder.reactions.gestures.view;

import android.view.View;
import com.tinder.reactions.gestures.common.C16349a;
import com.tinder.reactions.gestures.common.FlingComponentPositionChangedListener;
import com.tinder.reactions.gestures.common.FlingInteractionEventListener;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002J\u000e\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0001J\u0006\u0010\u0011\u001a\u00020\rJ\u000e\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0015\u001a\u00020\rH\u0016J\b\u0010\u0016\u001a\u00020\rH\u0016J \u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0004H\u0016J \u0010\u001b\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0004H\u0016R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/tinder/reactions/gestures/view/GrandGestureFlingPositionMediator;", "Lcom/tinder/reactions/gestures/common/FlingComponentPositionChangedListener;", "Lcom/tinder/reactions/gestures/common/FlingInteractionEventListener;", "viewOriginalHeight", "", "viewOriginalWidth", "(FF)V", "interactionEventListeners", "", "positionChangedListeners", "touchDelegate", "Lcom/tinder/reactions/gestures/common/FlingAndResetViewOnTouchDelegate;", "addInteractionEventListener", "", "flingInteractionEventListener", "addPositionChangedListener", "flingComponentPositionChangedListener", "dispatchPositionReset", "setupFlingableComponent", "flingableComponent", "Landroid/view/View;", "verticalLimitNotReached", "verticalLimitReached", "verticalPositionChangedOnDrag", "currentY", "topYLimit", "bottomYLimit", "verticalPositionChangedOnGlide", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.gestures.view.b */
public final class C16356b implements FlingComponentPositionChangedListener, FlingInteractionEventListener {
    /* renamed from: a */
    private final List<FlingComponentPositionChangedListener> f50883a = ((List) new ArrayList());
    /* renamed from: b */
    private final List<FlingInteractionEventListener> f50884b = ((List) new ArrayList());
    /* renamed from: c */
    private C16349a f50885c;
    /* renamed from: d */
    private final float f50886d;
    /* renamed from: e */
    private final float f50887e;

    public C16356b(float f, float f2) {
        this.f50886d = f;
        this.f50887e = f2;
    }

    /* renamed from: a */
    public final void m61706a() {
        C16349a c16349a = this.f50885c;
        if (c16349a != null) {
            c16349a.m61680a();
        }
    }

    /* renamed from: a */
    public final void m61708a(@NotNull FlingComponentPositionChangedListener flingComponentPositionChangedListener) {
        C2668g.b(flingComponentPositionChangedListener, "flingComponentPositionChangedListener");
        this.f50883a.add(flingComponentPositionChangedListener);
    }

    /* renamed from: a */
    public final void m61709a(@NotNull FlingInteractionEventListener flingInteractionEventListener) {
        C2668g.b(flingInteractionEventListener, "flingInteractionEventListener");
        this.f50884b.add(flingInteractionEventListener);
    }

    /* renamed from: a */
    public final void m61707a(@NotNull View view) {
        C2668g.b(view, "flingableComponent");
        if (this == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.reactions.gestures.common.FlingComponentPositionChangedListener");
        }
        this.f50885c = new C16349a(view, this, this, this.f50886d, this.f50887e);
        view.setOnTouchListener(this.f50885c);
    }

    public void verticalLimitNotReached() {
        for (FlingInteractionEventListener verticalLimitNotReached : this.f50884b) {
            verticalLimitNotReached.verticalLimitNotReached();
        }
    }

    public void verticalLimitReached() {
        for (FlingInteractionEventListener verticalLimitReached : this.f50884b) {
            verticalLimitReached.verticalLimitReached();
        }
    }

    public void verticalPositionChangedOnDrag(float f, float f2, float f3) {
        if (f <= f3) {
            for (FlingComponentPositionChangedListener verticalPositionChangedOnDrag : this.f50883a) {
                verticalPositionChangedOnDrag.verticalPositionChangedOnDrag(f, f2, f3);
            }
        }
    }

    public void verticalPositionChangedOnGlide(float f, float f2, float f3) {
        if (f >= f2 && f <= f3) {
            for (FlingComponentPositionChangedListener verticalPositionChangedOnGlide : this.f50883a) {
                verticalPositionChangedOnGlide.verticalPositionChangedOnGlide(f, f2, f3);
            }
        }
    }
}
