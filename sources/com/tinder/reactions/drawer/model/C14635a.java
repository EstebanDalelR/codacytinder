package com.tinder.reactions.drawer.model;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/tinder/reactions/drawer/model/SlidingView;", "", "view", "Landroid/view/View;", "slideType", "Lcom/tinder/reactions/drawer/model/SlideType;", "yStartingPosition", "", "yOpenPosition", "(Landroid/view/View;Lcom/tinder/reactions/drawer/model/SlideType;FF)V", "getSlideType", "()Lcom/tinder/reactions/drawer/model/SlideType;", "getView", "()Landroid/view/View;", "getYOpenPosition", "()F", "getYStartingPosition", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.drawer.model.a */
public final class C14635a {
    @NotNull
    /* renamed from: a */
    private final View f46152a;
    @NotNull
    /* renamed from: b */
    private final SlideType f46153b;
    /* renamed from: c */
    private final float f46154c;
    /* renamed from: d */
    private final float f46155d;

    @NotNull
    /* renamed from: b */
    public final View m55816b() {
        return this.f46152a;
    }

    @NotNull
    /* renamed from: c */
    public final SlideType m55817c() {
        return this.f46153b;
    }

    /* renamed from: d */
    public final float m55818d() {
        return this.f46154c;
    }

    /* renamed from: e */
    public final float m55819e() {
        return this.f46155d;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C14635a) {
                C14635a c14635a = (C14635a) obj;
                if (C2668g.a(this.f46152a, c14635a.f46152a) && C2668g.a(this.f46153b, c14635a.f46153b) && Float.compare(this.f46154c, c14635a.f46154c) == 0 && Float.compare(this.f46155d, c14635a.f46155d) == 0) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        View view = this.f46152a;
        int i = 0;
        int hashCode = (view != null ? view.hashCode() : 0) * 31;
        SlideType slideType = this.f46153b;
        if (slideType != null) {
            i = slideType.hashCode();
        }
        return ((((hashCode + i) * 31) + Float.floatToIntBits(this.f46154c)) * 31) + Float.floatToIntBits(this.f46155d);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SlidingView(view=");
        stringBuilder.append(this.f46152a);
        stringBuilder.append(", slideType=");
        stringBuilder.append(this.f46153b);
        stringBuilder.append(", yStartingPosition=");
        stringBuilder.append(this.f46154c);
        stringBuilder.append(", yOpenPosition=");
        stringBuilder.append(this.f46155d);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C14635a(@NotNull View view, @NotNull SlideType slideType, float f, float f2) {
        C2668g.b(view, "view");
        C2668g.b(slideType, "slideType");
        this.f46152a = view;
        this.f46153b = slideType;
        this.f46154c = f;
        this.f46155d = f2;
    }

    @NotNull
    /* renamed from: a */
    public final View m55815a() {
        return this.f46152a;
    }

    public /* synthetic */ C14635a(View view, SlideType slideType, float f, float f2, int i, C15823e c15823e) {
        if ((i & 4) != null) {
            f = 0.0f;
        }
        if ((i & 8) != 0) {
            f2 = 0.0f;
        }
        this(view, slideType, f, f2);
    }
}
