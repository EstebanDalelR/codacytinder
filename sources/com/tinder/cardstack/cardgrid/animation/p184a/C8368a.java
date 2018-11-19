package com.tinder.cardstack.cardgrid.animation.p184a;

import com.tinder.cardstack.cardgrid.p183a.C8365a;
import com.tinder.cardstack.view.CardViewHolder;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/tinder/cardstack/cardgrid/animation/model/CardProperty;", "", "position", "Lcom/tinder/cardstack/cardgrid/model/Point;", "height", "", "width", "rotation", "(Lcom/tinder/cardstack/cardgrid/model/Point;FFF)V", "getHeight", "()F", "getPosition", "()Lcom/tinder/cardstack/cardgrid/model/Point;", "getRotation", "getWidth", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Factory", "cardstack_release"}, k = 1, mv = {1, 1, 9})
/* renamed from: com.tinder.cardstack.cardgrid.animation.a.a */
public final class C8368a {
    /* renamed from: a */
    public static final C8367a f29706a = new C8367a();
    @NotNull
    /* renamed from: f */
    private static final C8368a f29707f = new C8368a(C8365a.f29697a.m35602a(), 0.0f, 0.0f, 0.0f);
    @NotNull
    /* renamed from: b */
    private final C8365a f29708b;
    /* renamed from: c */
    private final float f29709c;
    /* renamed from: d */
    private final float f29710d;
    /* renamed from: e */
    private final float f29711e;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u00020\u00042\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/tinder/cardstack/cardgrid/animation/model/CardProperty$Factory;", "", "()V", "default", "Lcom/tinder/cardstack/cardgrid/animation/model/CardProperty;", "getDefault", "()Lcom/tinder/cardstack/cardgrid/animation/model/CardProperty;", "fromCardViewHolder", "cardViewHolder", "Lcom/tinder/cardstack/view/CardViewHolder;", "cardstack_release"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.cardstack.cardgrid.animation.a.a$a */
    public static final class C8367a {
        private C8367a() {
        }

        @NotNull
        /* renamed from: a */
        public final C8368a m35629a() {
            return C8368a.f29707f;
        }

        @NotNull
        /* renamed from: a */
        public final C8368a m35630a(@NotNull CardViewHolder<?> cardViewHolder) {
            C2668g.b(cardViewHolder, "cardViewHolder");
            cardViewHolder = cardViewHolder.itemView;
            C2668g.a(cardViewHolder, "view");
            return new C8368a(new C8365a(cardViewHolder.getTranslationX(), cardViewHolder.getTranslationY()), (float) cardViewHolder.getHeight(), (float) cardViewHolder.getWidth(), cardViewHolder.getRotation());
        }
    }

    @NotNull
    /* renamed from: a */
    public static /* bridge */ /* synthetic */ C8368a m35631a(C8368a c8368a, C8365a c8365a, float f, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            c8365a = c8368a.f29708b;
        }
        if ((i & 2) != 0) {
            f = c8368a.f29709c;
        }
        if ((i & 4) != 0) {
            f2 = c8368a.f29710d;
        }
        if ((i & 8) != 0) {
            f3 = c8368a.f29711e;
        }
        return c8368a.m35634a(c8365a, f, f2, f3);
    }

    @NotNull
    /* renamed from: a */
    public final C8368a m35634a(@NotNull C8365a c8365a, float f, float f2, float f3) {
        C2668g.b(c8365a, "position");
        return new C8368a(c8365a, f, f2, f3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8368a) {
                C8368a c8368a = (C8368a) obj;
                if (C2668g.a(this.f29708b, c8368a.f29708b) && Float.compare(this.f29709c, c8368a.f29709c) == 0 && Float.compare(this.f29710d, c8368a.f29710d) == 0 && Float.compare(this.f29711e, c8368a.f29711e) == 0) {
                }
            }
            return false;
        }
        return true;
    }

    @NotNull
    /* renamed from: f */
    public final C8365a m35638f() {
        return this.f29708b;
    }

    /* renamed from: g */
    public final float m35639g() {
        return this.f29709c;
    }

    /* renamed from: h */
    public final float m35640h() {
        return this.f29711e;
    }

    public int hashCode() {
        C8365a c8365a = this.f29708b;
        return ((((((c8365a != null ? c8365a.hashCode() : 0) * 31) + Float.floatToIntBits(this.f29709c)) * 31) + Float.floatToIntBits(this.f29710d)) * 31) + Float.floatToIntBits(this.f29711e);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CardProperty(position=");
        stringBuilder.append(this.f29708b);
        stringBuilder.append(", height=");
        stringBuilder.append(this.f29709c);
        stringBuilder.append(", width=");
        stringBuilder.append(this.f29710d);
        stringBuilder.append(", rotation=");
        stringBuilder.append(this.f29711e);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C8368a(@NotNull C8365a c8365a, float f, float f2, float f3) {
        C2668g.b(c8365a, "position");
        this.f29708b = c8365a;
        this.f29709c = f;
        this.f29710d = f2;
        this.f29711e = f3;
    }

    @NotNull
    /* renamed from: a */
    public final C8365a m35633a() {
        return this.f29708b;
    }

    /* renamed from: b */
    public final float m35635b() {
        return this.f29709c;
    }

    /* renamed from: c */
    public final float m35636c() {
        return this.f29710d;
    }

    /* renamed from: d */
    public final float m35637d() {
        return this.f29711e;
    }
}
