package com.tinder.account.photos.photogrid;

import android.content.Context;
import android.support.v7.util.DiffUtil;
import android.support.v7.util.DiffUtil.DiffResult;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.tinder.account.photos.C3890c;
import java.util.List;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0019\u001aB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0014\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016J\u0016\u0010\u0018\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/tinder/account/photos/photogrid/PhotoGridView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "adapter", "Lcom/tinder/account/photos/photogrid/PhotoGridAdapter;", "layoutManager", "Landroid/support/v7/widget/GridLayoutManager;", "listener", "Lcom/tinder/account/photos/photogrid/PhotoGridView$Listener;", "getListener", "()Lcom/tinder/account/photos/photogrid/PhotoGridView$Listener;", "setListener", "(Lcom/tinder/account/photos/photogrid/PhotoGridView$Listener;)V", "recycler", "Landroid/support/v7/widget/RecyclerView;", "bind", "", "photos", "", "Lcom/tinder/account/photos/photogrid/PhotoGridEntry;", "setPhotos", "Listener", "PhotoGridTouchCallback", "account_release"}, k = 1, mv = {1, 1, 10})
public final class PhotoGridView extends FrameLayout {
    /* renamed from: a */
    private final RecyclerView f8163a;
    /* renamed from: b */
    private final GridLayoutManager f8164b;
    /* renamed from: c */
    private final PhotoGridAdapter f8165c = new PhotoGridAdapter();
    @Nullable
    /* renamed from: d */
    private Listener f8166d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H&¨\u0006\n"}, d2 = {"Lcom/tinder/account/photos/photogrid/PhotoGridView$Listener;", "", "onAdd", "", "index", "", "onDelete", "onMove", "fromIndex", "toIndex", "account_release"}, k = 1, mv = {1, 1, 10})
    public interface Listener {
        void onAdd(int i);

        void onDelete(int i);

        void onMove(int i, int i2);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J\u001a\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\fH\u0016J\b\u0010\u0011\u001a\u00020\bH\u0016J\b\u0010\u0012\u001a\u00020\bH\u0016J \u0010\u0002\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J\u001a\u0010\u0013\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0014\u001a\u00020\u0004H\u0016J\u001a\u0010\u0015\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0016\u001a\u00020\u0004H\u0016R \u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/tinder/account/photos/photogrid/PhotoGridView$PhotoGridTouchCallback;", "Landroid/support/v7/widget/helper/ItemTouchHelper$Callback;", "onMove", "Lkotlin/Function2;", "", "", "(Lkotlin/jvm/functions/Function2;)V", "canDropOver", "", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "current", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "target", "clearView", "viewHolder", "getMovementFlags", "isItemViewSwipeEnabled", "isLongPressDragEnabled", "onSelectedChanged", "actionState", "onSwiped", "direction", "account_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.account.photos.photogrid.PhotoGridView$a */
    private static final class C3893a extends Callback {
        /* renamed from: a */
        private final Function2<Integer, Integer, C15813i> f12173a;

        public boolean isItemViewSwipeEnabled() {
            return false;
        }

        public boolean isLongPressDragEnabled() {
            return true;
        }

        public void onSwiped(@Nullable ViewHolder viewHolder, int i) {
        }

        public C3893a(@NotNull Function2<? super Integer, ? super Integer, C15813i> function2) {
            C2668g.m10309b(function2, "onMove");
            this.f12173a = function2;
        }

        public int getMovementFlags(@NotNull RecyclerView recyclerView, @NotNull ViewHolder viewHolder) {
            C2668g.m10309b(recyclerView, "recyclerView");
            C2668g.m10309b(viewHolder, "viewHolder");
            return Callback.makeMovementFlags(viewHolder.getItemViewType() != 1 ? null : 15, null);
        }

        public void onSelectedChanged(@Nullable ViewHolder viewHolder, int i) {
            super.onSelectedChanged(viewHolder, i);
            if (i != 0) {
                if ((viewHolder instanceof C3915f) == 0) {
                    viewHolder = null;
                }
                C3915f c3915f = (C3915f) viewHolder;
                if (c3915f != null) {
                    viewHolder = c3915f.m14677a();
                    if (viewHolder != null) {
                        viewHolder.m9806a();
                    }
                }
            }
        }

        public void clearView(@NotNull RecyclerView recyclerView, @Nullable ViewHolder viewHolder) {
            C2668g.m10309b(recyclerView, "recyclerView");
            super.clearView(recyclerView, viewHolder);
            if ((viewHolder instanceof C3915f) == null) {
                viewHolder = null;
            }
            C3915f c3915f = (C3915f) viewHolder;
            if (c3915f != null) {
                recyclerView = c3915f.m14677a();
                if (recyclerView != null) {
                    recyclerView.m9808b();
                }
            }
        }

        public boolean onMove(@NotNull RecyclerView recyclerView, @NotNull ViewHolder viewHolder, @NotNull ViewHolder viewHolder2) {
            C2668g.m10309b(recyclerView, "recyclerView");
            C2668g.m10309b(viewHolder, "viewHolder");
            C2668g.m10309b(viewHolder2, "target");
            this.f12173a.invoke(Integer.valueOf(viewHolder.getAdapterPosition()), Integer.valueOf(viewHolder2.getAdapterPosition()));
            return true;
        }

        public boolean canDropOver(@NotNull RecyclerView recyclerView, @NotNull ViewHolder viewHolder, @NotNull ViewHolder viewHolder2) {
            C2668g.m10309b(recyclerView, "recyclerView");
            C2668g.m10309b(viewHolder, "current");
            C2668g.m10309b(viewHolder2, "target");
            return viewHolder2.getItemViewType() != 2 ? true : null;
        }
    }

    public PhotoGridView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.m10309b(context, "context");
        super(context, attributeSet);
        this.f8163a = new RecyclerView(context);
        this.f8164b = new GridLayoutManager(context, 3);
        this.f8163a.setAdapter((Adapter) this.f8165c);
        this.f8163a.setLayoutManager((LayoutManager) this.f8164b);
        this.f8163a.setNestedScrollingEnabled(null);
        addView((View) this.f8163a);
        new ItemTouchHelper((Callback) new C3893a(new PhotoGridView$itemTouchHelper$1(this))).attachToRecyclerView(this.f8163a);
        this.f8165c.m14654a((com.tinder.account.photos.photogrid.PhotoGridAdapter.Listener) new com.tinder.account.photos.photogrid.PhotoGridAdapter.Listener() {
            public void onAddClicked(@NotNull C3915f c3915f) {
                C2668g.m10309b(c3915f, "viewHolder");
                Listener listener = this.getListener();
                if (listener != null) {
                    listener.onAdd(c3915f.getAdapterPosition());
                }
            }

            public void onDeleteClicked(@NotNull C3915f c3915f) {
                C2668g.m10309b(c3915f, "viewHolder");
                Listener listener = this.getListener();
                if (listener != null) {
                    listener.onDelete(c3915f.getAdapterPosition());
                }
            }
        });
    }

    @Nullable
    public final Listener getListener() {
        return this.f8166d;
    }

    public final void setListener(@Nullable Listener listener) {
        this.f8166d = listener;
    }

    /* renamed from: a */
    public final void m9799a(@NotNull List<? extends C2626d> list) {
        C2668g.m10309b(list, "photos");
        setPhotos(list);
    }

    private final void setPhotos(List<? extends C2626d> list) {
        DiffResult calculateDiff = DiffUtil.calculateDiff(new C3890c(this.f8165c.m14653a(), list));
        this.f8165c.m14657a((List) list);
        calculateDiff.dispatchUpdatesTo((Adapter) this.f8165c);
    }
}
