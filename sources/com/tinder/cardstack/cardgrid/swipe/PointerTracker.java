package com.tinder.cardstack.cardgrid.swipe;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import com.tinder.cardstack.cardgrid.p183a.C8365a;
import com.tinder.cardstack.cardgrid.swipe.p186a.C8378a;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 $2\u00020\u0001:\u0002$%B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u000bH\u0002J\u001a\u0010\u0019\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0017H\u0002J\r\u0010\u001b\u001a\u00020\u001cH\u0000¢\u0006\u0002\b\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0015\u001a\u00020\u000bH\u0002J\u0015\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!H\u0000¢\u0006\u0002\b\"J\u0010\u0010#\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!H\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR*\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nj\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f`\rX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000f8@X\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/tinder/cardstack/cardgrid/swipe/PointerTracker;", "", "()V", "listener", "Lcom/tinder/cardstack/cardgrid/swipe/PointerTracker$Listener;", "getListener$cardstack_release", "()Lcom/tinder/cardstack/cardgrid/swipe/PointerTracker$Listener;", "setListener$cardstack_release", "(Lcom/tinder/cardstack/cardgrid/swipe/PointerTracker$Listener;)V", "pointerMap", "Ljava/util/HashMap;", "", "Lcom/tinder/cardstack/cardgrid/swipe/model/Pointer;", "Lkotlin/collections/HashMap;", "pointers", "", "getPointers$cardstack_release", "()Ljava/util/Set;", "velocityTracker", "Landroid/view/VelocityTracker;", "addPointer", "pointerId", "origin", "Lcom/tinder/cardstack/cardgrid/model/Point;", "calculateVelocity", "movePointer", "position", "release", "", "release$cardstack_release", "removePointer", "track", "event", "Landroid/view/MotionEvent;", "track$cardstack_release", "trackVelocity", "Companion", "Listener", "cardstack_release"}, k = 1, mv = {1, 1, 9})
public final class PointerTracker {
    /* renamed from: a */
    public static final C8376a f29737a = new C8376a();
    /* renamed from: e */
    private static final int f29738e = 1000;
    @Nullable
    /* renamed from: b */
    private Listener f29739b;
    /* renamed from: c */
    private HashMap<Integer, C8378a> f29740c = new HashMap();
    /* renamed from: d */
    private VelocityTracker f29741d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\b"}, d2 = {"Lcom/tinder/cardstack/cardgrid/swipe/PointerTracker$Listener;", "", "onPointerDown", "", "pointer", "Lcom/tinder/cardstack/cardgrid/swipe/model/Pointer;", "onPointerMove", "onPointerUp", "cardstack_release"}, k = 1, mv = {1, 1, 9})
    public interface Listener {
        void onPointerDown(@NotNull C8378a c8378a);

        void onPointerMove(@NotNull C8378a c8378a);

        void onPointerUp(@NotNull C8378a c8378a);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/cardstack/cardgrid/swipe/PointerTracker$Companion;", "", "()V", "VELOCITY_UNIT_PIXELS_PER_SECOND", "", "getVELOCITY_UNIT_PIXELS_PER_SECOND", "()I", "cardstack_release"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.cardstack.cardgrid.swipe.PointerTracker$a */
    public static final class C8376a {
        private C8376a() {
        }

        /* renamed from: a */
        private final int m35704a() {
            return PointerTracker.f29738e;
        }
    }

    @NotNull
    /* renamed from: a */
    public final Set<C8378a> m35712a() {
        Collection values = this.f29740c.values();
        C2668g.a(values, "pointerMap.values");
        return C19301m.n(values);
    }

    /* renamed from: a */
    public final void m35714a(@Nullable Listener listener) {
        this.f29739b = listener;
    }

    /* renamed from: a */
    public final void m35713a(@NotNull MotionEvent motionEvent) {
        C2668g.b(motionEvent, "event");
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m35715b();
        }
        m35710b(motionEvent);
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        Listener listener;
        switch (actionMasked) {
            case 0:
            case 5:
                motionEvent = m35707a(pointerId, new C8365a(motionEvent.getX(actionIndex), motionEvent.getY(actionIndex)));
                listener = this.f29739b;
                if (listener != null) {
                    listener.onPointerDown(motionEvent);
                    return;
                }
                return;
            case 1:
            case 3:
            case 6:
                motionEvent = m35706a(pointerId);
                if (motionEvent != null) {
                    listener = this.f29739b;
                    if (listener != null) {
                        listener.onPointerUp(motionEvent);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                actionIndex = motionEvent.getPointerCount();
                for (actionMasked = 0; actionMasked < actionIndex; actionMasked++) {
                    C8378a b = m35709b(motionEvent.getPointerId(actionMasked), new C8365a(motionEvent.getX(actionMasked), motionEvent.getY(actionMasked)));
                    if (b != null) {
                        Listener listener2 = this.f29739b;
                        if (listener2 != null) {
                            listener2.onPointerMove(b);
                        }
                    }
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: b */
    public final void m35715b() {
        this.f29740c.clear();
        VelocityTracker velocityTracker = this.f29741d;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f29741d = (VelocityTracker) null;
    }

    /* renamed from: a */
    private final C8378a m35707a(int i, C8365a c8365a) {
        if (this.f29740c.containsKey(Integer.valueOf(i))) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Cannot add Pointer Id: ");
            stringBuilder.append(i);
            stringBuilder.append(" has already been tracked");
            throw ((Throwable) new IllegalStateException(stringBuilder.toString()));
        }
        C8378a c8378a = new C8378a(i, c8365a, null, null, 12, null);
        ((Map) this.f29740c).put(Integer.valueOf(i), c8378a);
        return c8378a;
    }

    /* renamed from: b */
    private final C8378a m35709b(int i, C8365a c8365a) {
        C8378a c8378a = (C8378a) this.f29740c.get(Integer.valueOf(i));
        if (c8378a == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Cannot move Pointer Id: ");
            stringBuilder.append(i);
            stringBuilder.append(" is not tracked");
            C0001a.c((Throwable) new IllegalStateException(stringBuilder.toString()));
            return 0;
        }
        c8365a = C8378a.m35725a(c8378a, 0, null, c8365a.m35609b(c8378a.m35731e()), null, 11, null);
        this.f29740c.put(Integer.valueOf(i), c8365a);
        return c8365a;
    }

    /* renamed from: a */
    private final C8378a m35706a(int i) {
        C8378a c8378a = (C8378a) this.f29740c.remove(Integer.valueOf(i));
        if (c8378a != null) {
            return C8378a.m35725a(c8378a, 0, null, null, m35708b(i), 7, null);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot remove Pointer Id: ");
        stringBuilder.append(i);
        stringBuilder.append(" is not tracked");
        C0001a.c(new IllegalStateException(stringBuilder.toString()));
        return 0;
    }

    /* renamed from: b */
    private final void m35710b(MotionEvent motionEvent) {
        if (this.f29741d == null) {
            this.f29741d = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker = this.f29741d;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
    }

    /* renamed from: b */
    private final C8365a m35708b(int i) {
        VelocityTracker velocityTracker = this.f29741d;
        if (velocityTracker == null) {
            return new C8365a(0.0f, 0.0f);
        }
        velocityTracker.computeCurrentVelocity(f29737a.m35704a());
        return new C8365a(velocityTracker.getXVelocity(i), velocityTracker.getYVelocity(i));
    }
}
