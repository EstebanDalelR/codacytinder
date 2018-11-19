package com.tinder.reactions.navigation.viewmodel;

import com.tinder.reactions.gestures.viewmodel.C14678h;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0019B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/tinder/reactions/navigation/viewmodel/GrandGestureNavigationItem;", "", "tabDrawableResId", "", "type", "Lcom/tinder/reactions/navigation/viewmodel/GrandGestureNavigationItem$Type;", "viewModel", "Lcom/tinder/reactions/gestures/viewmodel/GrandGestureViewModel;", "(ILcom/tinder/reactions/navigation/viewmodel/GrandGestureNavigationItem$Type;Lcom/tinder/reactions/gestures/viewmodel/GrandGestureViewModel;)V", "getTabDrawableResId", "()I", "getType", "()Lcom/tinder/reactions/navigation/viewmodel/GrandGestureNavigationItem$Type;", "getViewModel", "()Lcom/tinder/reactions/gestures/viewmodel/GrandGestureViewModel;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "Type", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class GrandGestureNavigationItem {
    /* renamed from: a */
    private final int f46292a;
    @NotNull
    /* renamed from: b */
    private final Type f46293b;
    @NotNull
    /* renamed from: c */
    private final C14678h f46294c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/tinder/reactions/navigation/viewmodel/GrandGestureNavigationItem$Type;", "", "(Ljava/lang/String;I)V", "HEART", "LAUGH", "CLAP", "MARTINI", "CHAT_BUBBLE", "EYEROLL", "BALL_IN_COURT", "STRIKE", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public enum Type {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GrandGestureNavigationItem) {
            GrandGestureNavigationItem grandGestureNavigationItem = (GrandGestureNavigationItem) obj;
            return (this.f46292a == grandGestureNavigationItem.f46292a ? 1 : null) != null && C2668g.a(this.f46293b, grandGestureNavigationItem.f46293b) && C2668g.a(this.f46294c, grandGestureNavigationItem.f46294c);
        }
    }

    public int hashCode() {
        int i = this.f46292a * 31;
        Type type = this.f46293b;
        int i2 = 0;
        i = (i + (type != null ? type.hashCode() : 0)) * 31;
        C14678h c14678h = this.f46294c;
        if (c14678h != null) {
            i2 = c14678h.hashCode();
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("GrandGestureNavigationItem(tabDrawableResId=");
        stringBuilder.append(this.f46292a);
        stringBuilder.append(", type=");
        stringBuilder.append(this.f46293b);
        stringBuilder.append(", viewModel=");
        stringBuilder.append(this.f46294c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public GrandGestureNavigationItem(int i, @NotNull Type type, @NotNull C14678h c14678h) {
        C2668g.b(type, "type");
        C2668g.b(c14678h, "viewModel");
        this.f46292a = i;
        this.f46293b = type;
        this.f46294c = c14678h;
    }

    /* renamed from: a */
    public final int m55965a() {
        return this.f46292a;
    }

    @NotNull
    /* renamed from: b */
    public final Type m55966b() {
        return this.f46293b;
    }

    @NotNull
    /* renamed from: c */
    public final C14678h m55967c() {
        return this.f46294c;
    }
}
