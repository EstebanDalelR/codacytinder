package com.tinder.feed.view.footer;

import android.content.Context;
import android.widget.TextView;
import com.tinder.feed.view.feed.C9496h;
import com.tinder.feed.view.feed.C9498i;
import com.tinder.feed.view.feed.C9498i.C9497a;
import com.tinder.feed.view.model.C13281i;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0007¨\u0006\b"}, d2 = {"bindDescription", "", "Lcom/tinder/feed/view/footer/FeedInstagramFooterDescriptionView;", "viewModel", "Lcom/tinder/feed/view/model/InstagramMediaFeedViewModel;", "bindTimeStamp", "Lcom/tinder/feed/view/footer/FeedFooterView;", "Lcom/tinder/feed/view/footer/FeedFooterModel;", "Tinder_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.view.footer.e */
public final class C9500e {
    /* renamed from: a */
    public static final void m39740a(@NotNull FeedFooterView feedFooterView, @NotNull C9499b c9499b) {
        C2668g.b(feedFooterView, "$receiver");
        C2668g.b(c9499b, "viewModel");
        TextView timeTextView$Tinder_release = feedFooterView.getTimeTextView$Tinder_release();
        C9496h timestampFormatter$Tinder_release = feedFooterView.getTimestampFormatter$Tinder_release();
        Context context = feedFooterView.getTimeTextView$Tinder_release().getContext();
        C2668g.a(context, "timeTextView.context");
        timeTextView$Tinder_release.setText(timestampFormatter$Tinder_release.m39726a(context, c9499b.m39739a()));
    }

    /* renamed from: a */
    public static final void m39741a(@NotNull FeedInstagramFooterDescriptionView feedInstagramFooterDescriptionView, @NotNull C13281i c13281i) {
        C2668g.b(feedInstagramFooterDescriptionView, "$receiver");
        C2668g.b(c13281i, "viewModel");
        TextView descriptionView$Tinder_release = feedInstagramFooterDescriptionView.getDescriptionView$Tinder_release();
        C9498i footerSpannableStringFormatter$Tinder_release = feedInstagramFooterDescriptionView.getFooterSpannableStringFormatter$Tinder_release();
        feedInstagramFooterDescriptionView = feedInstagramFooterDescriptionView.getDescriptionView$Tinder_release().getContext();
        C2668g.a(feedInstagramFooterDescriptionView, "descriptionView.context");
        descriptionView$Tinder_release.setText(footerSpannableStringFormatter$Tinder_release.m39730a(feedInstagramFooterDescriptionView, new C9497a(c13281i.m51379g().m42954d(), c13281i.m51379g().m42955e())));
    }
}
