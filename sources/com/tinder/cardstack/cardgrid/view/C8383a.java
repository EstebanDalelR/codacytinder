package com.tinder.cardstack.cardgrid.view;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bJ\u000e\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/tinder/cardstack/cardgrid/view/CardDragSessionDetector;", "", "()V", "dragSessionListener", "Lcom/tinder/cardstack/cardgrid/view/DragSessionListener;", "getDragSessionListener", "()Lcom/tinder/cardstack/cardgrid/view/DragSessionListener;", "setDragSessionListener", "(Lcom/tinder/cardstack/cardgrid/view/DragSessionListener;)V", "pointerSet", "", "", "addDragPointer", "", "pointerId", "removeDragPointer", "cardstack_release"}, k = 1, mv = {1, 1, 9})
/* renamed from: com.tinder.cardstack.cardgrid.view.a */
public final class C8383a {
    @Nullable
    /* renamed from: a */
    private DragSessionListener f29757a;
    /* renamed from: b */
    private final Set<Integer> f29758b = new LinkedHashSet();

    /* renamed from: a */
    public final void m35744a(@Nullable DragSessionListener dragSessionListener) {
        this.f29757a = dragSessionListener;
    }

    /* renamed from: a */
    public final void m35743a(int i) {
        if (!this.f29758b.contains(Integer.valueOf(i))) {
            if (this.f29758b.isEmpty()) {
                DragSessionListener dragSessionListener = this.f29757a;
                if (dragSessionListener != null) {
                    dragSessionListener.onDragStarted();
                }
            }
            this.f29758b.add(Integer.valueOf(i));
            C0001a.a("Pointer added, size: %d", new Object[]{Integer.valueOf(this.f29758b.size())});
        }
    }

    /* renamed from: b */
    public final void m35745b(int i) {
        i = this.f29758b.remove(Integer.valueOf(i));
        if (this.f29758b.isEmpty() && i != 0) {
            i = this.f29757a;
            if (i != 0) {
                i.onDragEnded();
            }
        }
        C0001a.a("Pointer removed, size: %d", new Object[]{Integer.valueOf(this.f29758b.size())});
    }
}
