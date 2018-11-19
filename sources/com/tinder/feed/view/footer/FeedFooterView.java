package com.tinder.feed.view.footer;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tinder.R;
import com.tinder.feed.view.feed.C9496h;
import com.tinder.module.FeedViewComponentProvider;
import com.tinder.profile.p365d.C14398a;
import javax.inject.Inject;
import kotlin.C18451c;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016R\u001b\u0010\u0007\u001a\u00020\b8@X\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001e\u0010\r\u001a\u00020\u000e8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/tinder/feed/view/footer/FeedFooterView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "timeTextView", "Landroid/widget/TextView;", "getTimeTextView$Tinder_release", "()Landroid/widget/TextView;", "timeTextView$delegate", "Lkotlin/Lazy;", "timestampFormatter", "Lcom/tinder/feed/view/feed/FeedTimestampFormatter;", "getTimestampFormatter$Tinder_release", "()Lcom/tinder/feed/view/feed/FeedTimestampFormatter;", "setTimestampFormatter$Tinder_release", "(Lcom/tinder/feed/view/feed/FeedTimestampFormatter;)V", "bind", "", "feedItem", "Lcom/tinder/feed/view/footer/FeedFooterModel;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class FeedFooterView extends LinearLayout {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f31824a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(FeedFooterView.class), "timeTextView", "getTimeTextView$Tinder_release()Landroid/widget/TextView;"))};
    @Inject
    @NotNull
    /* renamed from: b */
    public C9496h f31825b;
    @NotNull
    /* renamed from: c */
    private final Lazy f31826c;

    @NotNull
    public final TextView getTimeTextView$Tinder_release() {
        Lazy lazy = this.f31826c;
        KProperty kProperty = f31824a[0];
        return (TextView) lazy.getValue();
    }

    public /* synthetic */ FeedFooterView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public FeedFooterView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        this.f31826c = C18451c.a(LazyThreadSafetyMode.NONE, new FeedFooterView$$special$$inlined$bindView$1(this, R.id.feedTimeAgo));
        if (isInEditMode() == null) {
            context = C14398a.a(context);
            if (context == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.tinder.module.FeedViewComponentProvider");
            }
            ((FeedViewComponentProvider) context).provideFeedViewComponent().inject(this);
        }
    }

    @NotNull
    public final C9496h getTimestampFormatter$Tinder_release() {
        C9496h c9496h = this.f31825b;
        if (c9496h == null) {
            C2668g.b("timestampFormatter");
        }
        return c9496h;
    }

    public final void setTimestampFormatter$Tinder_release(@NotNull C9496h c9496h) {
        C2668g.b(c9496h, "<set-?>");
        this.f31825b = c9496h;
    }

    /* renamed from: a */
    public final void m39737a(@NotNull C9499b c9499b) {
        C2668g.b(c9499b, "feedItem");
        C9500e.m39740a(this, c9499b);
    }
}
