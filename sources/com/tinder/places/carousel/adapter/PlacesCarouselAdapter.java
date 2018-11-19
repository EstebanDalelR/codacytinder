package com.tinder.places.carousel.adapter;

import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tinder.R;
import com.tinder.places.card.view.C12321j;
import com.tinder.places.card.view.PlaceCardView;
import com.tinder.places.card.view.PlaceCardView.PlaceCarouselListener;
import com.tinder.places.viewmodel.C14349b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002+,B\u0005¢\u0006\u0002\u0010\u0003J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0006J(\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00112\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0002J\u0011\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0011H\u0002J\u000e\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u001bJ\b\u0010\u001c\u001a\u00020\u0011H\u0016J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u0011H\u0016J\u0006\u0010\u001f\u001a\u00020 J\u0018\u0010!\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0011H\u0016J&\u0010!\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016J\u0018\u0010\"\u001a\u00020\u00022\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0011H\u0016J\u0010\u0010&\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0002H\u0016J\u0010\u0010'\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0002H\u0016J\u0010\u0010(\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u000e\u0010)\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001bJ\u0019\u0010*\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0006H\u0002R\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006-"}, d2 = {"Lcom/tinder/places/carousel/adapter/PlacesCarouselAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "()V", "placeCards", "Ljava/util/ArrayList;", "Lcom/tinder/places/viewmodel/PlaceCardViewModel;", "Lkotlin/collections/ArrayList;", "placeCarouselListener", "Lcom/tinder/places/card/view/PlaceCardView$PlaceCarouselListener;", "getPlaceCarouselListener", "()Lcom/tinder/places/card/view/PlaceCardView$PlaceCarouselListener;", "setPlaceCarouselListener", "(Lcom/tinder/places/card/view/PlaceCardView$PlaceCarouselListener;)V", "add", "", "index", "", "item", "callBind", "holder", "position", "payloads", "", "", "get", "placeId", "", "getItemCount", "getItemId", "", "hasPlaceCards", "", "onBindViewHolder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onViewDetachedFromWindow", "onViewRecycled", "removeAt", "removePlace", "set", "PlaceCardViewHolder", "Update", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class PlacesCarouselAdapter extends Adapter<ViewHolder> {
    @NotNull
    /* renamed from: a */
    private PlaceCarouselListener f39897a = new C12321j();
    /* renamed from: b */
    private final ArrayList<C14349b> f39898b = new ArrayList();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/tinder/places/carousel/adapter/PlacesCarouselAdapter$Update;", "", "(Ljava/lang/String;I)V", "VISITED", "CORRECTED", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public enum Update {
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tinder/places/carousel/adapter/PlacesCarouselAdapter$PlaceCardViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "placeCard", "Lcom/tinder/places/card/view/PlaceCardView;", "getPlaceCard", "()Lcom/tinder/places/card/view/PlaceCardView;", "setPlaceCard", "(Lcom/tinder/places/card/view/PlaceCardView;)V", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.carousel.adapter.PlacesCarouselAdapter$a */
    public static final class C12325a extends ViewHolder {
        @NotNull
        /* renamed from: a */
        private PlaceCardView f39896a;

        public C12325a(@NotNull View view) {
            C2668g.b(view, "itemView");
            super(view);
            this.f39896a = (PlaceCardView) view;
        }

        @NotNull
        /* renamed from: a */
        public final PlaceCardView m48663a() {
            return this.f39896a;
        }
    }

    /* renamed from: a */
    public final void m48669a(@NotNull PlaceCarouselListener placeCarouselListener) {
        C2668g.b(placeCarouselListener, "<set-?>");
        this.f39897a = placeCarouselListener;
    }

    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        C2668g.b(viewGroup, "parent");
        viewGroup = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.view_place_card, viewGroup, false);
        C2668g.a(viewGroup, "view");
        return (ViewHolder) new C12325a(viewGroup);
    }

    public long getItemId(int i) {
        return m48670a() ? Long.parseLong(((C14349b) this.f39898b.get(i)).a()) : -1;
    }

    public int getItemCount() {
        return this.f39898b.size();
    }

    public void onBindViewHolder(@NotNull ViewHolder viewHolder, int i) {
        C2668g.b(viewHolder, "holder");
        m48664a(viewHolder, i, null);
    }

    public void onBindViewHolder(@NotNull ViewHolder viewHolder, int i, @NotNull List<? extends Object> list) {
        C2668g.b(viewHolder, "holder");
        C2668g.b(list, "payloads");
        m48664a(viewHolder, i, list);
    }

    public void onViewDetachedFromWindow(@NotNull ViewHolder viewHolder) {
        C2668g.b(viewHolder, "holder");
        if (!(viewHolder instanceof C12325a)) {
            viewHolder = null;
        }
        C12325a c12325a = (C12325a) viewHolder;
        if (c12325a != null) {
            viewHolder = c12325a.m48663a();
            if (viewHolder != null) {
                viewHolder.clearAnimation();
            }
        }
    }

    public void onViewRecycled(@NotNull ViewHolder viewHolder) {
        C2668g.b(viewHolder, "holder");
        if (!(viewHolder instanceof C12325a)) {
            viewHolder = null;
        }
        C12325a c12325a = (C12325a) viewHolder;
        if (c12325a != null) {
            viewHolder = c12325a.m48663a();
            if (viewHolder != null) {
                viewHolder.m48647a();
            }
        }
    }

    @NotNull
    /* renamed from: a */
    public final C14349b m48667a(int i) {
        i = this.f39898b.get(i);
        C2668g.a(i, "placeCards[position]");
        return (C14349b) i;
    }

    /* renamed from: a */
    public final int m48666a(@NotNull String str) {
        C2668g.b(str, "placeId");
        int i = 0;
        for (C14349b a : this.f39898b) {
            if (C2668g.a(a.a(), str)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: a */
    public final void m48668a(int i, @NotNull C14349b c14349b) {
        C2668g.b(c14349b, "item");
        C14349b c14349b2 = (C14349b) this.f39898b.get(i);
        this.f39898b.set(i, c14349b);
        if (!C2668g.a(c14349b2.a(), c14349b.a())) {
            notifyItemChanged(i, Update.CORRECTED);
        } else if (c14349b2.d() != c14349b.d()) {
            notifyItemChanged(i, Update.VISITED);
        }
    }

    /* renamed from: b */
    public final void m48671b(int i, @NotNull C14349b c14349b) {
        C2668g.b(c14349b, "item");
        this.f39898b.ensureCapacity(i);
        this.f39898b.add(i, c14349b);
        if (this.f39898b.size() == 1) {
            notifyDataSetChanged();
        } else {
            notifyItemInserted(i);
        }
    }

    /* renamed from: b */
    public final void m48672b(@NotNull String str) {
        C2668g.b(str, "placeId");
        m48665b(m48666a(str));
    }

    /* renamed from: b */
    private final void m48665b(int i) {
        this.f39898b.remove(i);
        notifyItemRemoved(i);
    }

    /* renamed from: a */
    public final boolean m48670a() {
        return this.f39898b.isEmpty() ^ 1;
    }

    /* renamed from: a */
    private final void m48664a(ViewHolder viewHolder, int i, List<? extends Object> list) {
        C14349b c14349b = (C14349b) this.f39898b.get(i);
        if (viewHolder == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.places.carousel.adapter.PlacesCarouselAdapter.PlaceCardViewHolder");
        }
        viewHolder = ((C12325a) viewHolder).m48663a();
        C2668g.a(c14349b, "placeCardViewModel");
        viewHolder.m48648a(c14349b, this.f39897a, (List) list);
    }
}
