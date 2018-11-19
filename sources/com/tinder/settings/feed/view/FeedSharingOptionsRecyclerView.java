package com.tinder.settings.feed.view;

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
import android.view.ViewGroup;
import butterknife.BindDimen;
import butterknife.ButterKnife;
import com.tinder.R;
import com.tinder.adapters.C7966f;
import com.tinder.common.view.C10707b;
import com.tinder.domain.settings.feed.model.FeedSharingOption;
import com.tinder.p361b.C13627b;
import com.tinder.settings.feed.view.FeedSharingOptionItemView.OnFeedSharingOptionChangedListener;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u00152\u00020\u0001:\u0003\u0015\u0016\u0017B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0014\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012J\u0012\u0010\u0013\u001a\u00020\u0014*\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002R\u0012\u0010\u0007\u001a\u00020\b8\u0000@\u0000X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/tinder/settings/feed/view/FeedSharingOptionsRecyclerView;", "Landroid/support/v7/widget/RecyclerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "dividerHeight", "", "feedSharingOptionHeaderAdapter", "Lcom/tinder/settings/feed/view/FeedSharingOptionsRecyclerView$FeedSharingOptionsHeaderAdapter;", "setItems", "", "feedSharingOptions", "", "Lcom/tinder/domain/settings/feed/model/FeedSharingOption;", "setOnFeedSharingOptionChangedListener", "onFeedSharingOptionChangedListener", "Lcom/tinder/settings/feed/view/FeedSharingOptionItemView$OnFeedSharingOptionChangedListener;", "areAllOptionsDisabled", "", "Companion", "FeedSharingOptionsHeaderAdapter", "FeedSharingOptionsRecyclerViewLayoutManager", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class FeedSharingOptionsRecyclerView extends RecyclerView {
    /* renamed from: a */
    public static final C14882a f58396a = new C14882a();
    /* renamed from: b */
    private final C18843b f58397b = new C18843b();
    @BindDimen(2131166210)
    @JvmField
    public int dividerHeight;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u000e"}, d2 = {"Lcom/tinder/settings/feed/view/FeedSharingOptionsRecyclerView$Companion;", "", "()V", "setItems", "", "feedSharingOptionsRecyclerView", "Lcom/tinder/settings/feed/view/FeedSharingOptionsRecyclerView;", "items", "", "Lcom/tinder/domain/settings/feed/model/FeedSharingOption;", "setOnFeedSharingOptionChangedListener", "feedSharingOptionRecyclerView", "onFeedSharingOptionChangedListener", "Lcom/tinder/settings/feed/view/FeedSharingOptionItemView$OnFeedSharingOptionChangedListener;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.feed.view.FeedSharingOptionsRecyclerView$a */
    public static final class C14882a {
        private C14882a() {
        }

        @JvmStatic
        @BindingAdapter({"items"})
        /* renamed from: a */
        public final void m56327a(@NotNull FeedSharingOptionsRecyclerView feedSharingOptionsRecyclerView, @NotNull List<FeedSharingOption> list) {
            C2668g.b(feedSharingOptionsRecyclerView, "feedSharingOptionsRecyclerView");
            C2668g.b(list, "items");
            feedSharingOptionsRecyclerView.setItems(list);
        }

        @JvmStatic
        @BindingAdapter({"onFeedSharingOptionChangedListener"})
        /* renamed from: a */
        public final void m56326a(@NotNull FeedSharingOptionsRecyclerView feedSharingOptionsRecyclerView, @NotNull OnFeedSharingOptionChangedListener onFeedSharingOptionChangedListener) {
            C2668g.b(feedSharingOptionsRecyclerView, "feedSharingOptionRecyclerView");
            C2668g.b(onFeedSharingOptionChangedListener, "onFeedSharingOptionChangedListener");
            feedSharingOptionsRecyclerView.setOnFeedSharingOptionChangedListener(onFeedSharingOptionChangedListener);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tinder/settings/feed/view/FeedSharingOptionsRecyclerView$FeedSharingOptionsRecyclerViewLayoutManager;", "Landroid/support/v7/widget/LinearLayoutManager;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.feed.view.FeedSharingOptionsRecyclerView$c */
    private static final class C18071c extends LinearLayoutManager {
        public C18071c(@NotNull Context context) {
            C2668g.b(context, "context");
            super(context);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0002\u0016\u0017B\u0005¢\u0006\u0002\u0010\u0005J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u0016J\u0018\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/tinder/settings/feed/view/FeedSharingOptionsRecyclerView$FeedSharingOptionsHeaderAdapter;", "Lcom/tinder/adapters/HeaderRecyclerViewAdapter;", "Lcom/tinder/domain/settings/feed/model/FeedSharingOption;", "Lcom/tinder/settings/feed/view/FeedSharingOptionsRecyclerView$FeedSharingOptionsHeaderAdapter$FeedSharingOptionViewHolder;", "Lcom/tinder/settings/feed/view/FeedSharingOptionsRecyclerView$FeedSharingOptionsHeaderAdapter$FeedSharingOptionHeaderViewHolder;", "()V", "onFeedSharingOptionChangedListener", "Lcom/tinder/settings/feed/view/FeedSharingOptionItemView$OnFeedSharingOptionChangedListener;", "getOnFeedSharingOptionChangedListener", "()Lcom/tinder/settings/feed/view/FeedSharingOptionItemView$OnFeedSharingOptionChangedListener;", "setOnFeedSharingOptionChangedListener", "(Lcom/tinder/settings/feed/view/FeedSharingOptionItemView$OnFeedSharingOptionChangedListener;)V", "onBindHeaderViewHolder", "", "holder", "onBindItemViewHolder", "itemPosition", "", "onCreateHeaderViewHolder", "parent", "Landroid/view/ViewGroup;", "onCreateItemViewHolder", "FeedSharingOptionHeaderViewHolder", "FeedSharingOptionViewHolder", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.feed.view.FeedSharingOptionsRecyclerView$b */
    private static final class C18843b extends C7966f<FeedSharingOption, C16638b, C16637a> {
        @NotNull
        /* renamed from: a */
        public OnFeedSharingOptionChangedListener f58395a;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tinder/settings/feed/view/FeedSharingOptionsRecyclerView$FeedSharingOptionsHeaderAdapter$FeedSharingOptionHeaderViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "Tinder_release"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.settings.feed.view.FeedSharingOptionsRecyclerView$b$a */
        private static final class C16637a extends ViewHolder {
            public C16637a(@NotNull View view) {
                C2668g.b(view, "itemView");
                super(view);
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/settings/feed/view/FeedSharingOptionsRecyclerView$FeedSharingOptionsHeaderAdapter$FeedSharingOptionViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "binding", "Lcom/tinder/databinding/RowViewFeedSharingOptionItemBinding;", "onFeedSharingOptionChangedListener", "Lcom/tinder/settings/feed/view/FeedSharingOptionItemView$OnFeedSharingOptionChangedListener;", "(Lcom/tinder/databinding/RowViewFeedSharingOptionItemBinding;Lcom/tinder/settings/feed/view/FeedSharingOptionItemView$OnFeedSharingOptionChangedListener;)V", "bind", "", "feedSharingOption", "Lcom/tinder/domain/settings/feed/model/FeedSharingOption;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.settings.feed.view.FeedSharingOptionsRecyclerView$b$b */
        private static final class C16638b extends ViewHolder {
            /* renamed from: a */
            private final C13627b f51516a;
            /* renamed from: b */
            private final OnFeedSharingOptionChangedListener f51517b;

            public C16638b(@NotNull C13627b c13627b, @NotNull OnFeedSharingOptionChangedListener onFeedSharingOptionChangedListener) {
                C2668g.b(c13627b, "binding");
                C2668g.b(onFeedSharingOptionChangedListener, "onFeedSharingOptionChangedListener");
                super(c13627b.d());
                this.f51516a = c13627b;
                this.f51517b = onFeedSharingOptionChangedListener;
            }

            /* renamed from: a */
            public final void m62097a(@NotNull FeedSharingOption feedSharingOption) {
                C2668g.b(feedSharingOption, "feedSharingOption");
                this.f51516a.a(feedSharingOption);
                this.f51516a.a(this.f51517b);
            }
        }

        /* renamed from: a */
        public void m67288a(@Nullable C16637a c16637a) {
        }

        /* renamed from: a */
        public /* synthetic */ ViewHolder m67284a(ViewGroup viewGroup) {
            return m67292d(viewGroup);
        }

        /* renamed from: b */
        public /* synthetic */ ViewHolder m67290b(ViewGroup viewGroup) {
            return m67291c(viewGroup);
        }

        /* renamed from: a */
        public final void m67287a(@NotNull OnFeedSharingOptionChangedListener onFeedSharingOptionChangedListener) {
            C2668g.b(onFeedSharingOptionChangedListener, "<set-?>");
            this.f58395a = onFeedSharingOptionChangedListener;
        }

        @NotNull
        /* renamed from: c */
        public C16637a m67291c(@NotNull ViewGroup viewGroup) {
            C2668g.b(viewGroup, "parent");
            viewGroup = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_view_feed_sharing_option_header, viewGroup, false);
            C2668g.a(viewGroup, "LayoutInflater.from(pare…on_header, parent, false)");
            return new C16637a(viewGroup);
        }

        @NotNull
        /* renamed from: d */
        public C16638b m67292d(@NotNull ViewGroup viewGroup) {
            C2668g.b(viewGroup, "parent");
            viewGroup = C13627b.a(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C2668g.a(viewGroup, "RowViewFeedSharingOption….context), parent, false)");
            OnFeedSharingOptionChangedListener onFeedSharingOptionChangedListener = this.f58395a;
            if (onFeedSharingOptionChangedListener == null) {
                C2668g.b("onFeedSharingOptionChangedListener");
            }
            return new C16638b(viewGroup, onFeedSharingOptionChangedListener);
        }

        /* renamed from: a */
        public void m67289a(@NotNull C16638b c16638b, int i) {
            C2668g.b(c16638b, "holder");
            i = a().get(i);
            C2668g.a(i, "items[itemPosition]");
            c16638b.m62097a((FeedSharingOption) i);
        }
    }

    @JvmStatic
    @BindingAdapter({"onFeedSharingOptionChangedListener"})
    /* renamed from: a */
    public static final void m67293a(@NotNull FeedSharingOptionsRecyclerView feedSharingOptionsRecyclerView, @NotNull OnFeedSharingOptionChangedListener onFeedSharingOptionChangedListener) {
        f58396a.m56326a(feedSharingOptionsRecyclerView, onFeedSharingOptionChangedListener);
    }

    @JvmStatic
    @BindingAdapter({"items"})
    /* renamed from: a */
    public static final void m67294a(@NotNull FeedSharingOptionsRecyclerView feedSharingOptionsRecyclerView, @NotNull List<FeedSharingOption> list) {
        f58396a.m56327a(feedSharingOptionsRecyclerView, (List) list);
    }

    public FeedSharingOptionsRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        ButterKnife.a(this);
        setLayoutManager((LayoutManager) new C18071c(context));
        setAdapter((Adapter) this.f58397b);
        addItemDecoration((ItemDecoration) new C10707b(this.dividerHeight));
        setHasFixedSize(true);
    }

    public final void setItems(@NotNull List<FeedSharingOption> list) {
        C2668g.b(list, "feedSharingOptions");
        this.f58397b.a(list);
        if (m67295a(list) != null) {
            setVisibility(4);
        } else {
            setVisibility(null);
        }
    }

    public final void setOnFeedSharingOptionChangedListener(@NotNull OnFeedSharingOptionChangedListener onFeedSharingOptionChangedListener) {
        C2668g.b(onFeedSharingOptionChangedListener, "onFeedSharingOptionChangedListener");
        this.f58397b.m67287a(onFeedSharingOptionChangedListener);
    }

    /* renamed from: a */
    private final boolean m67295a(@NotNull List<FeedSharingOption> list) {
        Iterable<FeedSharingOption> iterable = list;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        for (FeedSharingOption enabled : iterable) {
            if ((enabled.getEnabled() ^ 1) == 0) {
                return false;
            }
        }
        return true;
    }
}
