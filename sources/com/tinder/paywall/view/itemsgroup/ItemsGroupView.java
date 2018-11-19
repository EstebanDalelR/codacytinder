package com.tinder.paywall.view.itemsgroup;

import android.content.Context;
import android.support.v7.util.DiffUtil;
import android.support.v7.util.DiffUtil.Callback;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tinder.paywall.C10058d.C10053a;
import com.tinder.paywall.C10058d.C10054b;
import com.tinder.paywall.C10058d.C10055c;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0015\u0016B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\"\u0010\f\u001a\u00020\r\"\b\b\u0000\u0010\u000e*\u00020\u000f2\u0010\u0010\u0010\u001a\f\u0012\u0004\u0012\u0002H\u000e\u0012\u0002\b\u00030\u0011J\b\u0010\u0012\u001a\u00020\rH\u0014J\b\u0010\u0013\u001a\u00020\rH\u0014J\b\u0010\u0014\u001a\u00020\rH\u0016R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/tinder/paywall/view/itemsgroup/ItemsGroupView;", "Landroid/widget/FrameLayout;", "Lcom/tinder/paywall/view/itemsgroup/OnUpdateListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "adapter", "Lcom/tinder/paywall/view/itemsgroup/ItemsGroupView$ItemsRecylerAdapter;", "itemsList", "Landroid/support/v7/widget/RecyclerView;", "bindAdapter", "", "T", "Lcom/tinder/paywall/view/itemsgroup/ItemViewModel;", "itemsAdapter", "Lcom/tinder/paywall/view/itemsgroup/ItemsAdapter;", "onAttachedToWindow", "onDetachedFromWindow", "onItemsChanged", "ItemsRecylerAdapter", "SimpleViewHolder", "paywall_release"}, k = 1, mv = {1, 1, 10})
public final class ItemsGroupView extends FrameLayout implements OnUpdateListener {
    /* renamed from: a */
    private final RecyclerView f39734a;
    /* renamed from: b */
    private C12284a f39735b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u0015\u0012\u000e\u0010\u0003\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u0018\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000eH\u0016R\u0019\u0010\u0003\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/tinder/paywall/view/itemsgroup/ItemsGroupView$ItemsRecylerAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/tinder/paywall/view/itemsgroup/ItemsGroupView$SimpleViewHolder;", "itemsAdapter", "Lcom/tinder/paywall/view/itemsgroup/ItemsAdapter;", "(Lcom/tinder/paywall/view/itemsgroup/ItemsAdapter;)V", "getItemsAdapter", "()Lcom/tinder/paywall/view/itemsgroup/ItemsAdapter;", "oldElements", "", "Lcom/tinder/paywall/view/itemsgroup/ItemViewModel;", "dispatchUpdates", "", "getItemCount", "", "getItemId", "", "position", "getItemViewType", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "DiffUtilCallback", "paywall_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.paywall.view.itemsgroup.ItemsGroupView$a */
    private static final class C12284a extends Adapter<C12285b> {
        /* renamed from: a */
        private List<? extends ItemViewModel> f39732a = C19301m.l(this.f39733b.mo10503a());
        @NotNull
        /* renamed from: b */
        private final C10080a<?, ?> f39733b;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\b\u0000\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/paywall/view/itemsgroup/ItemsGroupView$ItemsRecylerAdapter$DiffUtilCallback;", "T", "Landroid/support/v7/util/DiffUtil$Callback;", "newList", "", "oldList", "(Ljava/util/List;Ljava/util/List;)V", "areContentsTheSame", "", "oldItemPosition", "", "newItemPosition", "areItemsTheSame", "getNewListSize", "getOldListSize", "paywall_release"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.paywall.view.itemsgroup.ItemsGroupView$a$a */
        private static final class C12283a<T> extends Callback {
            /* renamed from: a */
            private final List<T> f39730a;
            /* renamed from: b */
            private final List<T> f39731b;

            public C12283a(@NotNull List<? extends T> list, @NotNull List<? extends T> list2) {
                C2668g.b(list, "newList");
                C2668g.b(list2, "oldList");
                this.f39730a = list;
                this.f39731b = list2;
            }

            public int getOldListSize() {
                return this.f39731b.size();
            }

            public int getNewListSize() {
                return this.f39730a.size();
            }

            public boolean areItemsTheSame(int i, int i2) {
                return C2668g.a(this.f39731b.get(i), this.f39730a.get(i2));
            }

            public boolean areContentsTheSame(int i, int i2) {
                return C2668g.a(this.f39731b.get(i), this.f39730a.get(i2));
            }
        }

        public /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
            m48503a((C12285b) viewHolder, i);
        }

        public /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return m48501a(viewGroup, i);
        }

        @NotNull
        /* renamed from: b */
        public final C10080a<?, ?> m48504b() {
            return this.f39733b;
        }

        public C12284a(@NotNull C10080a<?, ?> c10080a) {
            C2668g.b(c10080a, "itemsAdapter");
            this.f39733b = c10080a;
            setHasStableIds(true);
        }

        @NotNull
        /* renamed from: a */
        public C12285b m48501a(@NotNull ViewGroup viewGroup, int i) {
            C2668g.b(viewGroup, "parent");
            return new C12285b(this.f39733b.mo10504b(viewGroup, i));
        }

        public int getItemCount() {
            return this.f39733b.mo10503a().size();
        }

        public long getItemId(int i) {
            return (long) ((ItemViewModel) this.f39733b.mo10503a().get(i)).getId().hashCode();
        }

        public int getItemViewType(int i) {
            return this.f39733b.m41197c();
        }

        /* renamed from: a */
        public void m48503a(@NotNull C12285b c12285b, int i) {
            C2668g.b(c12285b, "holder");
            c12285b = c12285b.itemView;
            if (c12285b == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.tinder.paywall.view.itemsgroup.Bindable<kotlin.Any>");
            }
            ((Bindable) c12285b).bind((ItemViewModel) this.f39733b.mo10503a().get(i));
        }

        /* renamed from: a */
        public final void m48502a() {
            DiffUtil.calculateDiff(new C12283a(this.f39733b.mo10503a(), this.f39732a)).dispatchUpdatesTo(this);
            this.f39732a = C19301m.l(this.f39733b.mo10503a());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tinder/paywall/view/itemsgroup/ItemsGroupView$SimpleViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "paywall_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.paywall.view.itemsgroup.ItemsGroupView$b */
    private static final class C12285b extends ViewHolder {
        public C12285b(@NotNull View view) {
            C2668g.b(view, "view");
            super(view);
        }
    }

    public /* synthetic */ ItemsGroupView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public ItemsGroupView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        FrameLayout.inflate(context, C10054b.items_group_view, this);
        setClipChildren(false);
        setClipToPadding(false);
        int i = 1;
        if (attributeSet != null) {
            attributeSet = context.getTheme().obtainStyledAttributes(attributeSet, C10055c.ItemsGroupView, 0, 0);
            try {
                i = attributeSet.getInt(C10055c.ItemsGroupView_pgv_span_count, 1);
            } finally {
                attributeSet.recycle();
            }
        }
        attributeSet = findViewById(C10053a.items_list);
        C2668g.a(attributeSet, "findViewById(R.id.items_list)");
        this.f39734a = (RecyclerView) attributeSet;
        this.f39734a.setLayoutManager(new GridLayoutManager(context, i));
    }

    /* renamed from: a */
    public final <T extends ItemViewModel> void m48505a(@NotNull C10080a<T, ?> c10080a) {
        C2668g.b(c10080a, "itemsAdapter");
        c10080a.m41193a(this);
        this.f39735b = new C12284a(c10080a);
        this.f39734a.setAdapter(this.f39735b);
    }

    public void onItemsChanged() {
        C12284a c12284a = this.f39735b;
        if (c12284a != null) {
            c12284a.m48502a();
        }
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C12284a c12284a = this.f39735b;
        if (c12284a != null) {
            C10080a b = c12284a.m48504b();
            if (b != null) {
                b.m41193a(this);
            }
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C12284a c12284a = this.f39735b;
        if (c12284a != null) {
            C10080a b = c12284a.m48504b();
            if (b != null) {
                b.m41196b(this);
            }
        }
    }
}
