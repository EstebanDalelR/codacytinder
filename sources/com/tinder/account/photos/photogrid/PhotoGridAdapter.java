package com.tinder.account.photos.photogrid;

import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tinder.account.C2612a.C2609f;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.collections.C19301m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0016J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0012H\u0016J&\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00122\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0016J\u0018\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0012H\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006 "}, d2 = {"Lcom/tinder/account/photos/photogrid/PhotoGridAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/tinder/account/photos/photogrid/PhotoGridViewHolder;", "()V", "listener", "Lcom/tinder/account/photos/photogrid/PhotoGridAdapter$Listener;", "getListener", "()Lcom/tinder/account/photos/photogrid/PhotoGridAdapter$Listener;", "setListener", "(Lcom/tinder/account/photos/photogrid/PhotoGridAdapter$Listener;)V", "photos", "", "Lcom/tinder/account/photos/photogrid/PhotoGridEntry;", "getPhotos", "()Ljava/util/List;", "setPhotos", "(Ljava/util/List;)V", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "", "holder", "payloads", "", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Listener", "account_release"}, k = 1, mv = {1, 1, 10})
public final class PhotoGridAdapter extends Adapter<C3915f> {
    @NotNull
    /* renamed from: a */
    private List<? extends C2626d> f12170a = C19301m.a();
    @Nullable
    /* renamed from: b */
    private Listener f12171b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/tinder/account/photos/photogrid/PhotoGridAdapter$Listener;", "", "onAddClicked", "", "viewHolder", "Lcom/tinder/account/photos/photogrid/PhotoGridViewHolder;", "onDeleteClicked", "account_release"}, k = 1, mv = {1, 1, 10})
    public interface Listener {
        void onAddClicked(@NotNull C3915f c3915f);

        void onDeleteClicked(@NotNull C3915f c3915f);
    }

    public /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
        m14655a((C3915f) viewHolder, i);
    }

    public /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i, List list) {
        m14656a((C3915f) viewHolder, i, list);
    }

    public /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m14652a(viewGroup, i);
    }

    @NotNull
    /* renamed from: a */
    public final List<C2626d> m14653a() {
        return this.f12170a;
    }

    /* renamed from: a */
    public final void m14657a(@NotNull List<? extends C2626d> list) {
        C2668g.m10309b(list, "<set-?>");
        this.f12170a = list;
    }

    /* renamed from: a */
    public final void m14654a(@Nullable Listener listener) {
        this.f12171b = listener;
    }

    @Nullable
    /* renamed from: b */
    public final Listener m14658b() {
        return this.f12171b;
    }

    /* renamed from: a */
    public void m14655a(@NotNull C3915f c3915f, int i) {
        C2668g.m10309b(c3915f, "holder");
        C2626d c2626d = (C2626d) this.f12170a.get(i);
        View view = c3915f.itemView;
        if (view == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.account.photos.photogrid.PhotoItemView");
        }
        PhotoItemView photoItemView = (PhotoItemView) view;
        if (c2626d instanceof C3914c) {
            C3914c c3914c = (C3914c) c2626d;
            photoItemView.m9807a(c3914c.m14675b(), c3914c.m14674a(), c3915f.getItemViewType(), c3914c.m14676c(), (Function0) new PhotoGridAdapter$onBindViewHolder$1(this, c3915f));
        } else if (c2626d instanceof C3912a) {
            PhotoItemView.m9801a(photoItemView, null, ((C3912a) c2626d).m14671a(), c3915f.getItemViewType(), false, (Function0) new PhotoGridAdapter$onBindViewHolder$2(this, c3915f), 1, null);
        } else if (c2626d instanceof C3913b) {
            PhotoItemView.m9801a(photoItemView, null, ((C3913b) c2626d).m14673a(), c3915f.getItemViewType(), false, (Function0) PhotoGridAdapter$onBindViewHolder$3.f14632a, 1, null);
        }
    }

    /* renamed from: a */
    public void m14656a(@NotNull C3915f c3915f, int i, @NotNull List<Object> list) {
        C2668g.m10309b(c3915f, "holder");
        C2668g.m10309b(list, "payloads");
        if (list.contains("label")) {
            C2626d c2626d = (C2626d) this.f12170a.get(i);
            c3915f = c3915f.itemView;
            if (c3915f == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.tinder.account.photos.photogrid.PhotoItemView");
            }
            ((PhotoItemView) c3915f).setLabel(c2626d.m9845d());
            return;
        }
        super.onBindViewHolder(c3915f, i, list);
    }

    public int getItemViewType(int i) {
        C2626d c2626d = (C2626d) this.f12170a.get(i);
        if (c2626d instanceof C3914c) {
            return 1;
        }
        if (c2626d instanceof C3912a) {
            return 2;
        }
        if ((c2626d instanceof C3913b) != 0) {
            return 3;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    /* renamed from: a */
    public C3915f m14652a(@NotNull ViewGroup viewGroup, int i) {
        C2668g.m10309b(viewGroup, "parent");
        viewGroup = LayoutInflater.from(viewGroup.getContext()).inflate(C2609f.photo_item_view, viewGroup, false);
        if (viewGroup != null) {
            return new C3915f((PhotoItemView) viewGroup);
        }
        throw new TypeCastException("null cannot be cast to non-null type com.tinder.account.photos.photogrid.PhotoItemView");
    }

    public int getItemCount() {
        return this.f12170a.size();
    }
}
