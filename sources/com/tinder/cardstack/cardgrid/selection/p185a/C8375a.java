package com.tinder.cardstack.cardgrid.selection.p185a;

import com.tinder.cardstack.cardgrid.p183a.C8365a;
import com.tinder.cardstack.cardgrid.swipe.p186a.C8378a;
import com.tinder.cardstack.view.CardViewHolder;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0015\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0011H\u0000¢\u0006\u0002\b!J\r\u0010\"\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002J\t\u0010#\u001a\u00020\u0005H\u0002J\u000b\u0010$\u001a\u0004\u0018\u00010\u0011H\u0002J\t\u0010%\u001a\u00020\u0005H\u0002J\u0013\u0010&\u001a\u00020\f2\b\u0010'\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010(\u001a\u00020)H\u0016J\u0015\u0010*\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0011H\u0000¢\u0006\u0002\b+R\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8@X\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u0012X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u00148@X\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00118@X\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\n\"\u0004\b\u001c\u0010\u001d¨\u0006,"}, d2 = {"Lcom/tinder/cardstack/cardgrid/selection/model/CardViewHolderSelection;", "", "cardViewHolder", "Lcom/tinder/cardstack/view/CardViewHolder;", "firstTouchPoint", "Lcom/tinder/cardstack/cardgrid/model/Point;", "(Lcom/tinder/cardstack/view/CardViewHolder;Lcom/tinder/cardstack/cardgrid/model/Point;)V", "getCardViewHolder", "()Lcom/tinder/cardstack/view/CardViewHolder;", "getFirstTouchPoint", "()Lcom/tinder/cardstack/cardgrid/model/Point;", "isEmpty", "", "isEmpty$cardstack_release", "()Z", "pointerSet", "Ljava/util/LinkedHashSet;", "Lcom/tinder/cardstack/cardgrid/swipe/model/Pointer;", "Lkotlin/collections/LinkedHashSet;", "pointers", "", "getPointers$cardstack_release", "()Ljava/util/Set;", "primaryPointer", "getPrimaryPointer$cardstack_release", "()Lcom/tinder/cardstack/cardgrid/swipe/model/Pointer;", "primaryPointerOffset", "getPrimaryPointerOffset$cardstack_release", "setPrimaryPointerOffset$cardstack_release", "(Lcom/tinder/cardstack/cardgrid/model/Point;)V", "addPointer", "", "pointer", "addPointer$cardstack_release", "component1", "component2", "component3", "component4", "equals", "other", "hashCode", "", "removePointer", "removePointer$cardstack_release", "cardstack_release"}, k = 1, mv = {1, 1, 9})
/* renamed from: com.tinder.cardstack.cardgrid.selection.a.a */
public final class C8375a {
    @NotNull
    /* renamed from: a */
    private C8365a f29733a = C8365a.f29697a.m35602a();
    /* renamed from: b */
    private final LinkedHashSet<C8378a> f29734b = new LinkedHashSet();
    @NotNull
    /* renamed from: c */
    private final CardViewHolder<?> f29735c;
    @NotNull
    /* renamed from: d */
    private final C8365a f29736d;

    public C8375a(@NotNull CardViewHolder<?> cardViewHolder, @NotNull C8365a c8365a) {
        C2668g.b(cardViewHolder, "cardViewHolder");
        C2668g.b(c8365a, "firstTouchPoint");
        this.f29735c = cardViewHolder;
        this.f29736d = c8365a;
    }

    @NotNull
    /* renamed from: g */
    public final CardViewHolder<?> m35703g() {
        return this.f29735c;
    }

    @Nullable
    /* renamed from: a */
    public final C8378a m35695a() {
        return (C8378a) C19301m.c(m35697b());
    }

    @NotNull
    /* renamed from: b */
    public final Set<C8378a> m35697b() {
        return C19301m.n(this.f29734b);
    }

    /* renamed from: a */
    public final void m35696a(@NotNull C8378a c8378a) {
        C2668g.b(c8378a, "pointer");
        this.f29734b.add(c8378a);
    }

    /* renamed from: b */
    public final void m35698b(@NotNull C8378a c8378a) {
        C2668g.b(c8378a, "pointer");
        boolean a = C2668g.a(m35695a(), c8378a);
        this.f29734b.remove(c8378a);
        if (!a) {
            return;
        }
        if (m35695a() == null) {
            this.f29733a = C8365a.f29697a.m35602a();
            return;
        }
        C8378a a2 = m35695a();
        if (a2 != null) {
            this.f29733a = this.f29733a.m35606a(c8378a.m35729c().m35609b(a2.m35729c()));
        }
    }

    public int hashCode() {
        return this.f29735c.hashCode();
    }

    public boolean equals(@Nullable Object obj) {
        return C2668g.a(this.f29735c, obj);
    }

    @NotNull
    /* renamed from: c */
    public final CardViewHolder<?> m35699c() {
        return this.f29735c;
    }

    @NotNull
    /* renamed from: d */
    public final C8365a m35700d() {
        return this.f29736d;
    }

    @Nullable
    /* renamed from: e */
    public final C8378a m35701e() {
        return m35695a();
    }

    @NotNull
    /* renamed from: f */
    public final C8365a m35702f() {
        return this.f29733a;
    }
}
