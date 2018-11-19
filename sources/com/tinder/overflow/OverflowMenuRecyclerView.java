package com.tinder.overflow;

import android.content.Context;
import android.databinding.BindingAdapter;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ItemDecoration;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import butterknife.BindDimen;
import butterknife.ButterKnife;
import com.tinder.adapters.C7294i;
import com.tinder.common.view.C10707b;
import com.tinder.p361b.C13630e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00102\u00020\u0001:\u0003\u0010\u0011\u0012B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0014\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eR\u0012\u0010\u0007\u001a\u00020\b8\u0000@\u0000X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/tinder/overflow/OverflowMenuRecyclerView;", "Landroid/support/v7/widget/RecyclerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "dividerHeight", "", "overflowMenuAdapter", "Lcom/tinder/overflow/OverflowMenuRecyclerView$OverflowMenuAdapter;", "setItems", "", "menuItems", "", "Lcom/tinder/overflow/MenuItem;", "Companion", "OverflowMenuAdapter", "OverflowMenuRecyclerViewLayoutManager", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class OverflowMenuRecyclerView extends RecyclerView {
    /* renamed from: a */
    public static final C10011a f44799a = new C10011a();
    /* renamed from: b */
    private final C13536b f44800b = new C13536b();
    @BindDimen(2131165792)
    @JvmField
    public int dividerHeight;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¨\u0006\n"}, d2 = {"Lcom/tinder/overflow/OverflowMenuRecyclerView$Companion;", "", "()V", "setItems", "", "overflowMenuRecyclerView", "Lcom/tinder/overflow/OverflowMenuRecyclerView;", "items", "", "Lcom/tinder/overflow/MenuItem;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.overflow.OverflowMenuRecyclerView$a */
    public static final class C10011a {
        private C10011a() {
        }

        @JvmStatic
        @BindingAdapter({"items"})
        /* renamed from: a */
        public final void m41027a(@NotNull OverflowMenuRecyclerView overflowMenuRecyclerView, @NotNull List<C10019a> list) {
            C2668g.b(overflowMenuRecyclerView, "overflowMenuRecyclerView");
            C2668g.b(list, "items");
            overflowMenuRecyclerView.setItems(list);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016¨\u0006\u0010"}, d2 = {"Lcom/tinder/overflow/OverflowMenuRecyclerView$OverflowMenuAdapter;", "Lcom/tinder/adapters/SimpleRecyclerViewAdapter;", "Lcom/tinder/overflow/MenuItem;", "Lcom/tinder/overflow/OverflowMenuRecyclerView$OverflowMenuAdapter$MenuItemViewHolder;", "()V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "MenuItemViewHolder", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.overflow.OverflowMenuRecyclerView$b */
    private static final class C13536b extends C7294i<C10019a, C12221a> {

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/overflow/OverflowMenuRecyclerView$OverflowMenuAdapter$MenuItemViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "binding", "Lcom/tinder/databinding/ViewOverflowMenuItemBinding;", "(Lcom/tinder/databinding/ViewOverflowMenuItemBinding;)V", "bindMenuItem", "", "menuItem", "Lcom/tinder/overflow/MenuItem;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.overflow.OverflowMenuRecyclerView$b$a */
        private static final class C12221a extends ViewHolder {
            /* renamed from: a */
            private final C13630e f39580a;

            @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
            /* renamed from: com.tinder.overflow.OverflowMenuRecyclerView$b$a$a */
            static final class C10012a implements OnClickListener {
                /* renamed from: a */
                final /* synthetic */ C10019a f32872a;

                C10012a(C10019a c10019a) {
                    this.f32872a = c10019a;
                }

                public final void onClick(View view) {
                    for (Function0 invoke : this.f32872a.m41050b()) {
                        invoke.invoke();
                    }
                }
            }

            public C12221a(@NotNull C13630e c13630e) {
                C2668g.b(c13630e, "binding");
                super(c13630e.d());
                this.f39580a = c13630e;
            }

            /* renamed from: a */
            public final void m48383a(@NotNull C10019a c10019a) {
                C2668g.b(c10019a, "menuItem");
                this.f39580a.m53148a(c10019a.m41049a());
                this.f39580a.m53147a((OnClickListener) new C10012a(c10019a));
            }
        }

        public /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
            m52916a((C12221a) viewHolder, i);
        }

        public /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return m52915a(viewGroup, i);
        }

        public int getItemCount() {
            return a().size();
        }

        /* renamed from: a */
        public void m52916a(@NotNull C12221a c12221a, int i) {
            C2668g.b(c12221a, "holder");
            i = a().get(i);
            C2668g.a(i, "items[position]");
            c12221a.m48383a((C10019a) i);
        }

        @NotNull
        /* renamed from: a */
        public C12221a m52915a(@NotNull ViewGroup viewGroup, int i) {
            C2668g.b(viewGroup, "parent");
            viewGroup = C13630e.m53145a(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C2668g.a(viewGroup, "ViewOverflowMenuItemBind….context), parent, false)");
            return new C12221a(viewGroup);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tinder/overflow/OverflowMenuRecyclerView$OverflowMenuRecyclerViewLayoutManager;", "Landroid/support/v7/widget/LinearLayoutManager;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.overflow.OverflowMenuRecyclerView$c */
    private static final class C13537c extends LinearLayoutManager {
        public C13537c(@NotNull Context context) {
            C2668g.b(context, "context");
            super(context);
        }
    }

    @JvmStatic
    @BindingAdapter({"items"})
    /* renamed from: a */
    public static final void m53832a(@NotNull OverflowMenuRecyclerView overflowMenuRecyclerView, @NotNull List<C10019a> list) {
        f44799a.m41027a(overflowMenuRecyclerView, list);
    }

    public OverflowMenuRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        ButterKnife.a(this);
        setAdapter((Adapter) this.f44800b);
        addItemDecoration((ItemDecoration) new C10707b(this.dividerHeight));
        setLayoutManager((LayoutManager) new C13537c(context));
        setHasFixedSize(true);
    }

    public final void setItems(@NotNull List<C10019a> list) {
        C2668g.b(list, "menuItems");
        this.f44800b.a(list);
    }
}
