package com.tinder.feed.view.footer;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tinder.R;
import com.tinder.feed.view.feed.C9498i;
import com.tinder.feed.view.model.C13281i;
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

@Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016R\u001b\u0010\u0007\u001a\u00020\b8@X\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001e\u0010\r\u001a\u00020\u000e8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/tinder/feed/view/footer/FeedInstagramFooterDescriptionView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "descriptionView", "Landroid/widget/TextView;", "getDescriptionView$Tinder_release", "()Landroid/widget/TextView;", "descriptionView$delegate", "Lkotlin/Lazy;", "footerSpannableStringFormatter", "Lcom/tinder/feed/view/feed/FooterSpannableStringFormatter;", "getFooterSpannableStringFormatter$Tinder_release", "()Lcom/tinder/feed/view/feed/FooterSpannableStringFormatter;", "setFooterSpannableStringFormatter$Tinder_release", "(Lcom/tinder/feed/view/feed/FooterSpannableStringFormatter;)V", "bind", "", "feedItem", "Lcom/tinder/feed/view/model/InstagramMediaFeedViewModel;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class FeedInstagramFooterDescriptionView extends LinearLayout {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f31827a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(FeedInstagramFooterDescriptionView.class), "descriptionView", "getDescriptionView$Tinder_release()Landroid/widget/TextView;"))};
    @Inject
    @NotNull
    /* renamed from: b */
    public C9498i f31828b;
    @NotNull
    /* renamed from: c */
    private final Lazy f31829c;

    @NotNull
    public final TextView getDescriptionView$Tinder_release() {
        Lazy lazy = this.f31829c;
        KProperty kProperty = f31827a[0];
        return (TextView) lazy.getValue();
    }

    public /* synthetic */ FeedInstagramFooterDescriptionView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public FeedInstagramFooterDescriptionView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        this.f31829c = C18451c.a(LazyThreadSafetyMode.NONE, new FeedInstagramFooterDescriptionView$$special$$inlined$bindView$1(this, R.id.feedInstagramFooterDescriptionTextView));
        if (isInEditMode() == null) {
            attributeSet = C14398a.a(context);
            if (attributeSet == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.tinder.module.FeedViewComponentProvider");
            }
            ((FeedViewComponentProvider) attributeSet).provideFeedViewComponent().inject(this);
        }
        LinearLayout.inflate(context, R.layout.feed_instagram_footer_description, this);
    }

    @NotNull
    public final C9498i getFooterSpannableStringFormatter$Tinder_release() {
        C9498i c9498i = this.f31828b;
        if (c9498i == null) {
            C2668g.b("footerSpannableStringFormatter");
        }
        return c9498i;
    }

    public final void setFooterSpannableStringFormatter$Tinder_release(@NotNull C9498i c9498i) {
        C2668g.b(c9498i, "<set-?>");
        this.f31828b = c9498i;
    }

    /* renamed from: a */
    public final void m39738a(@NotNull C13281i c13281i) {
        C2668g.b(c13281i, "feedItem");
        C9500e.m39741a(this, c13281i);
    }
}
