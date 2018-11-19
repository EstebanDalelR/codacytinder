package com.tinder.reactions.drawer.provider.event;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u0000 \u00192\u00020\u0001:\u0002\u0019\u001aB!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007B)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\nB+\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u000b\u001a\u00020\f8\u0006X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/tinder/reactions/drawer/provider/event/DrawerState;", "", "eventType", "Lcom/tinder/reactions/drawer/provider/event/DrawerState$EventType;", "drawerView", "Landroid/view/View;", "previousEventType", "(Lcom/tinder/reactions/drawer/provider/event/DrawerState$EventType;Landroid/view/View;Lcom/tinder/reactions/drawer/provider/event/DrawerState$EventType;)V", "slideOffset", "", "(Lcom/tinder/reactions/drawer/provider/event/DrawerState$EventType;Landroid/view/View;FLcom/tinder/reactions/drawer/provider/event/DrawerState$EventType;)V", "newState", "", "(Lcom/tinder/reactions/drawer/provider/event/DrawerState$EventType;Landroid/view/View;ILcom/tinder/reactions/drawer/provider/event/DrawerState$EventType;)V", "getDrawerView", "()Landroid/view/View;", "getEventType", "()Lcom/tinder/reactions/drawer/provider/event/DrawerState$EventType;", "newState$annotations", "()V", "getNewState", "()I", "getPreviousEventType", "getSlideOffset", "()F", "Companion", "EventType", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class DrawerState {
    /* renamed from: a */
    public static final Companion f46161a = new Companion();
    @NotNull
    /* renamed from: b */
    private final EventType f46162b;
    @Nullable
    /* renamed from: c */
    private final View f46163c;
    /* renamed from: d */
    private final float f46164d;
    /* renamed from: e */
    private final int f46165e;
    @NotNull
    /* renamed from: f */
    private final EventType f46166f;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/tinder/reactions/drawer/provider/event/DrawerState$Companion;", "", "()V", "STATE_DRAGGING", "", "STATE_IDLE", "STATE_SETTLING", "State", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public static final class Companion {
        private Companion() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/reactions/drawer/provider/event/DrawerState$EventType;", "", "(Ljava/lang/String;I)V", "OPENED", "CLOSED", "STATE_CHANGED", "SLIDE", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public enum EventType {
    }

    @NotNull
    /* renamed from: a */
    public final EventType m55825a() {
        return this.f46162b;
    }

    /* renamed from: b */
    public final float m55826b() {
        return this.f46164d;
    }

    /* renamed from: c */
    public final int m55827c() {
        return this.f46165e;
    }

    public DrawerState(@NotNull EventType eventType, @Nullable View view, @NotNull EventType eventType2) {
        C2668g.b(eventType, "eventType");
        C2668g.b(eventType2, "previousEventType");
        this.f46162b = eventType;
        this.f46163c = view;
        this.f46164d = -1.0f;
        this.f46165e = null;
        this.f46166f = eventType2;
    }

    public DrawerState(@NotNull EventType eventType, @Nullable View view, float f, @NotNull EventType eventType2) {
        C2668g.b(eventType, "eventType");
        C2668g.b(eventType2, "previousEventType");
        this.f46162b = eventType;
        this.f46163c = view;
        this.f46164d = f;
        this.f46165e = 1;
        this.f46166f = eventType2;
    }

    public DrawerState(@NotNull EventType eventType, @Nullable View view, int i, @NotNull EventType eventType2) {
        C2668g.b(eventType, "eventType");
        C2668g.b(eventType2, "previousEventType");
        this.f46162b = eventType;
        this.f46163c = view;
        this.f46164d = -1.0f;
        this.f46165e = i;
        this.f46166f = eventType2;
    }
}
