package com.tinder.cardstack.cardgrid.swipe.p186a;

import com.tinder.cardstack.cardgrid.p183a.C8365a;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0017\u001a\u00020\u0003H\u0016J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/tinder/cardstack/cardgrid/swipe/model/Pointer;", "", "id", "", "origin", "Lcom/tinder/cardstack/cardgrid/model/Point;", "displacement", "velocity", "(ILcom/tinder/cardstack/cardgrid/model/Point;Lcom/tinder/cardstack/cardgrid/model/Point;Lcom/tinder/cardstack/cardgrid/model/Point;)V", "getDisplacement", "()Lcom/tinder/cardstack/cardgrid/model/Point;", "getId", "()I", "getOrigin", "getVelocity", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "cardstack_release"}, k = 1, mv = {1, 1, 9})
/* renamed from: com.tinder.cardstack.cardgrid.swipe.a.a */
public final class C8378a {
    /* renamed from: a */
    private final int f29749a;
    @NotNull
    /* renamed from: b */
    private final C8365a f29750b;
    @NotNull
    /* renamed from: c */
    private final C8365a f29751c;
    @Nullable
    /* renamed from: d */
    private final C8365a f29752d;

    @NotNull
    /* renamed from: a */
    public static /* bridge */ /* synthetic */ C8378a m35725a(C8378a c8378a, int i, C8365a c8365a, C8365a c8365a2, C8365a c8365a3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = c8378a.f29749a;
        }
        if ((i2 & 2) != 0) {
            c8365a = c8378a.f29750b;
        }
        if ((i2 & 4) != 0) {
            c8365a2 = c8378a.f29751c;
        }
        if ((i2 & 8) != 0) {
            c8365a3 = c8378a.f29752d;
        }
        return c8378a.m35727a(i, c8365a, c8365a2, c8365a3);
    }

    @NotNull
    /* renamed from: a */
    public final C8378a m35727a(int i, @NotNull C8365a c8365a, @NotNull C8365a c8365a2, @Nullable C8365a c8365a3) {
        C2668g.b(c8365a, "origin");
        C2668g.b(c8365a2, "displacement");
        return new C8378a(i, c8365a, c8365a2, c8365a3);
    }

    @NotNull
    /* renamed from: e */
    public final C8365a m35731e() {
        return this.f29750b;
    }

    @NotNull
    /* renamed from: f */
    public final C8365a m35732f() {
        return this.f29751c;
    }

    @Nullable
    /* renamed from: g */
    public final C8365a m35733g() {
        return this.f29752d;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Pointer(id=");
        stringBuilder.append(this.f29749a);
        stringBuilder.append(", origin=");
        stringBuilder.append(this.f29750b);
        stringBuilder.append(", displacement=");
        stringBuilder.append(this.f29751c);
        stringBuilder.append(", velocity=");
        stringBuilder.append(this.f29752d);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C8378a(int i, @NotNull C8365a c8365a, @NotNull C8365a c8365a2, @Nullable C8365a c8365a3) {
        C2668g.b(c8365a, "origin");
        C2668g.b(c8365a2, "displacement");
        this.f29749a = i;
        this.f29750b = c8365a;
        this.f29751c = c8365a2;
        this.f29752d = c8365a3;
    }

    /* renamed from: a */
    public final int m35726a() {
        return this.f29749a;
    }

    public /* synthetic */ C8378a(int i, C8365a c8365a, C8365a c8365a2, C8365a c8365a3, int i2, C15823e c15823e) {
        if ((i2 & 2) != null) {
            c8365a = C8365a.f29697a.m35602a();
        }
        if ((i2 & 4) != null) {
            c8365a2 = C8365a.f29697a.m35602a();
        }
        if ((i2 & 8) != 0) {
            c8365a3 = null;
        }
        this(i, c8365a, c8365a2, c8365a3);
    }

    @NotNull
    /* renamed from: b */
    public final C8365a m35728b() {
        return this.f29750b;
    }

    @NotNull
    /* renamed from: c */
    public final C8365a m35729c() {
        return this.f29751c;
    }

    @Nullable
    /* renamed from: d */
    public final C8365a m35730d() {
        return this.f29752d;
    }

    public int hashCode() {
        return Integer.valueOf(this.f29749a).hashCode();
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C8378a)) {
            obj = null;
        }
        C8378a c8378a = (C8378a) obj;
        boolean z = false;
        if (c8378a == null) {
            return false;
        }
        if (this.f29749a == c8378a.f29749a) {
            z = true;
        }
        return z;
    }
}
