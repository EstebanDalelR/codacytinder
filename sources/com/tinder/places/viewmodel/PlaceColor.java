package com.tinder.places.viewmodel;

import android.content.Context;
import android.support.annotation.ColorRes;
import android.support.v4.content.C0432b;
import com.tinder.places.p312g.p313a.C10211a;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0001\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0019\u001aB-\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u001b"}, d2 = {"Lcom/tinder/places/viewmodel/PlaceColor;", "", "primary", "", "backgroundGradient", "Lcom/tinder/places/viewmodel/PlaceColor$PlacesGradient;", "pin", "toolbarBackground", "(Ljava/lang/String;IILcom/tinder/places/viewmodel/PlaceColor$PlacesGradient;II)V", "getBackgroundGradient", "()Lcom/tinder/places/viewmodel/PlaceColor$PlacesGradient;", "getPin", "()I", "getPrimary", "getToolbarBackground", "BLUE", "NAVY", "GREEN", "AQUA", "PURPLE_LIGHT", "PURPLE_DARK", "PINK", "YELLOW", "RED", "ORANGE", "Companion", "PlacesGradient", "places_release"}, k = 1, mv = {1, 1, 10})
public enum PlaceColor {
    ;
    
    public static final C14345a Companion = null;
    @NotNull
    private final C14346b backgroundGradient;
    private final int pin;
    private final int primary;
    private final int toolbarBackground;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lcom/tinder/places/viewmodel/PlaceColor$Companion;", "", "()V", "get", "Lcom/tinder/places/viewmodel/PlaceColor;", "placeId", "", "getColorIndex", "places_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.viewmodel.PlaceColor$a */
    public static final class C14345a {
        private C14345a() {
        }

        @NotNull
        /* renamed from: a */
        public final PlaceColor m54648a(long j) {
            PlaceColor[] values = PlaceColor.values();
            return values[(int) (j % ((long) values.length))];
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/tinder/places/viewmodel/PlaceColor$PlacesGradient;", "", "startColor", "", "endColor", "(II)V", "getEndColor", "()I", "getStartColor", "component1", "component2", "copy", "equals", "", "other", "getGradientDrawable", "Lcom/tinder/places/view/util/PlacesGradientDrawable;", "context", "Landroid/content/Context;", "hashCode", "toString", "", "places_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.viewmodel.PlaceColor$b */
    public static final class C14346b {
        /* renamed from: a */
        private final int f45510a;
        /* renamed from: b */
        private final int f45511b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C14346b) {
                C14346b c14346b = (C14346b) obj;
                if ((this.f45510a == c14346b.f45510a ? 1 : null) != null) {
                    if ((this.f45511b == c14346b.f45511b ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f45510a * 31) + this.f45511b;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("PlacesGradient(startColor=");
            stringBuilder.append(this.f45510a);
            stringBuilder.append(", endColor=");
            stringBuilder.append(this.f45511b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C14346b(@ColorRes int i, @ColorRes int i2) {
            this.f45510a = i;
            this.f45511b = i2;
        }

        @NotNull
        /* renamed from: a */
        public final C10211a m54649a(@NotNull Context context) {
            C2668g.b(context, "context");
            return new C10211a(C0432b.c(context, this.f45510a), C0432b.c(context, this.f45511b));
        }
    }

    protected PlaceColor(int i, C14346b c14346b, @ColorRes int i2, @NotNull int i3) {
        C2668g.b(c14346b, "backgroundGradient");
        this.primary = i;
        this.backgroundGradient = c14346b;
        this.pin = i2;
        this.toolbarBackground = i3;
    }

    public final int getPrimary() {
        return this.primary;
    }

    @NotNull
    public final C14346b getBackgroundGradient() {
        return this.backgroundGradient;
    }

    public final int getPin() {
        return this.pin;
    }

    public final int getToolbarBackground() {
        return this.toolbarBackground;
    }

    static {
        Companion = new C14345a();
    }
}
