package com.tinder.cardstack.cardgrid.selection;

import android.view.View;
import com.tinder.cardstack.cardgrid.p183a.C8365a;
import com.tinder.cardstack.cardgrid.selection.p185a.C8375a;
import com.tinder.cardstack.cardgrid.swipe.p186a.C8378a;
import com.tinder.cardstack.view.CardViewHolder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\fJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00068F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR*\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bj\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r`\u000eX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/tinder/cardstack/cardgrid/selection/CardViewHolderSelector;", "", "cardViewHolderFinder", "Lcom/tinder/cardstack/cardgrid/selection/CardViewHolderSelector$CardViewHolderFinder;", "(Lcom/tinder/cardstack/cardgrid/selection/CardViewHolderSelector$CardViewHolderFinder;)V", "selectedCardViewHolders", "", "Lcom/tinder/cardstack/view/CardViewHolder;", "getSelectedCardViewHolders", "()Ljava/util/Set;", "selectionMap", "Ljava/util/HashMap;", "Lcom/tinder/cardstack/cardgrid/swipe/model/Pointer;", "Lcom/tinder/cardstack/cardgrid/selection/model/CardViewHolderSelection;", "Lkotlin/collections/HashMap;", "select", "pointer", "unselect", "CardViewHolderFinder", "cardstack_release"}, k = 1, mv = {1, 1, 9})
public final class CardViewHolderSelector {
    /* renamed from: a */
    private final HashMap<C8378a, C8375a> f29731a = new HashMap();
    /* renamed from: b */
    private final CardViewHolderFinder f29732b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/tinder/cardstack/cardgrid/selection/CardViewHolderSelector$CardViewHolderFinder;", "", "findCardViewHolder", "Lcom/tinder/cardstack/view/CardViewHolder;", "position", "Lcom/tinder/cardstack/cardgrid/model/Point;", "cardstack_release"}, k = 1, mv = {1, 1, 9})
    public interface CardViewHolderFinder {
        @Nullable
        CardViewHolder<?> findCardViewHolder(@NotNull C8365a c8365a);
    }

    public CardViewHolderSelector(@NotNull CardViewHolderFinder cardViewHolderFinder) {
        C2668g.b(cardViewHolderFinder, "cardViewHolderFinder");
        this.f29732b = cardViewHolderFinder;
    }

    @NotNull
    /* renamed from: a */
    public final Set<CardViewHolder<?>> m35693a() {
        Collection values = this.f29731a.values();
        C2668g.a(values, "selectionMap.values");
        Iterable<C8375a> iterable = values;
        Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
        for (C8375a g : iterable) {
            arrayList.add(g.m35703g());
        }
        return C19301m.n((List) arrayList);
    }

    @Nullable
    /* renamed from: a */
    public final C8375a m35692a(@NotNull C8378a c8378a) {
        C2668g.b(c8378a, "pointer");
        if (this.f29731a.containsKey(c8378a)) {
            c8378a = this.f29731a.get(c8378a);
            if (c8378a == null) {
                C2668g.a();
            }
            return (C8375a) c8378a;
        }
        CardViewHolder findCardViewHolder = this.f29732b.findCardViewHolder(c8378a.m35728b());
        C8375a c8375a = null;
        if (findCardViewHolder == null || !findCardViewHolder.isSwipable()) {
            return null;
        }
        Collection values = this.f29731a.values();
        C2668g.a(values, "selectionMap.values");
        for (C8375a next : values) {
            if (C2668g.a(next.m35703g(), findCardViewHolder)) {
                c8375a = next;
                break;
            }
        }
        c8375a = c8375a;
        if (c8375a != null) {
            c8375a.m35696a(c8378a);
            this.f29731a.put(c8378a, c8375a);
            return c8375a;
        }
        C8365a b = c8378a.m35728b();
        View view = findCardViewHolder.itemView;
        C2668g.a(view, "cardViewHolder.itemView");
        float x = view.getX();
        View view2 = findCardViewHolder.itemView;
        C2668g.a(view2, "cardViewHolder.itemView");
        C8375a c8375a2 = new C8375a(findCardViewHolder, b.m35609b(new C8365a(x, view2.getY())));
        c8375a2.m35696a(c8378a);
        this.f29731a.put(c8378a, c8375a2);
        return c8375a2;
    }

    @Nullable
    /* renamed from: b */
    public final C8375a m35694b(@NotNull C8378a c8378a) {
        C2668g.b(c8378a, "pointer");
        C8375a c8375a = (C8375a) this.f29731a.get(c8378a);
        if (c8375a == null) {
            return null;
        }
        c8375a.m35698b(c8378a);
        this.f29731a.remove(c8378a);
        return c8375a;
    }
}
