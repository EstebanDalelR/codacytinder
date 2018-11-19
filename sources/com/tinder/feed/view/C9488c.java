package com.tinder.feed.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import com.tinder.C6250b.C6248a;
import com.tinder.R;
import com.tinder.feed.view.message.FeedCommentComposerView;
import com.tinder.feed.view.model.ActivityFeedViewModel;
import com.tinder.profile.p365d.C14398a;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u0012\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\u0003\u001a0\u0010\n\u001a\u00020\u000b*\u00020\b2\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f\u001a\u0012\u0010\u0010\u001a\u00020\u0001*\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u001a\u0010\u0011\u001a\u00020\u0001*\u00020\b2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003\u001a\f\u0010\u0004\u001a\u00020\u0005*\u00020\bH\u0002\u001a\u001c\u0010\u0012\u001a\u00020\u000b*\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u001a.\u0010\u0016\u001a\u00020\u000b*\u00020\b2\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¨\u0006\u0017"}, d2 = {"getBottomGuidelineYPosition", "", "view", "Landroid/view/View;", "rootView", "Landroid/view/ViewGroup;", "canOpenComposerWithAnchorViewsCurrentLocation", "", "Lcom/tinder/feed/view/FeedMainView;", "anchorView", "centerAnchorViewInsideFeedlist", "", "position", "itemView", "onCompletion", "Lkotlin/Function0;", "getCurrentDistanceFromBottomOfFeedlist", "getDownwardScrollOffset", "showComposerDialog", "feedItemId", "", "carouselItemId", "showComposerDialogForPosition", "Tinder_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.view.c */
public final class C9488c {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002JR\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0016¨\u0006\u0010"}, d2 = {"com/tinder/feed/view/FeedMainViewExtensionsKt$centerAnchorViewInsideFeedlist$1", "Landroid/view/View$OnLayoutChangeListener;", "(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V", "onLayoutChange", "", "view", "Landroid/view/View;", "left", "", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.c$a */
    public static final class C9487a implements OnLayoutChangeListener {
        /* renamed from: a */
        final /* synthetic */ View f31803a;
        /* renamed from: b */
        final /* synthetic */ Function0 f31804b;

        C9487a(View view, Function0 function0) {
            this.f31803a = view;
            this.f31804b = function0;
        }

        public void onLayoutChange(@Nullable View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.f31803a.removeOnLayoutChangeListener(this);
            this.f31804b.invoke();
        }
    }

    /* renamed from: a */
    public static final void m39672a(@NotNull FeedMainView feedMainView, @NotNull String str, @Nullable String str2) {
        C2668g.b(feedMainView, "$receiver");
        C2668g.b(str, "feedItemId");
        int positionForId = feedMainView.getFeedItemsAdapter$Tinder_release().positionForId(str);
        ViewHolder findViewHolderForAdapterPosition = ((RecyclerView) feedMainView.a(C6248a.feedList)).findViewHolderForAdapterPosition(positionForId);
        if (findViewHolderForAdapterPosition != null) {
            View findViewById = findViewHolderForAdapterPosition.itemView.findViewById(R.id.feedSendMessageButton);
            ViewGroup a = C9488c.m39669a(feedMainView);
            C2668g.a(findViewById, "anchorView");
            if (C9488c.m39674b(feedMainView, findViewById)) {
                C9488c.m39673b(feedMainView, positionForId, findViewById, a, str2);
            } else {
                View view = findViewHolderForAdapterPosition.itemView;
                C2668g.a(view, "viewHolder.itemView");
                C9488c.m39670a(feedMainView, positionForId, view, findViewById, (Function0) new FeedMainViewExtensionsKt$showComposerDialog$1(feedMainView, positionForId, findViewById, a, str2));
            }
        }
    }

    /* renamed from: a */
    public static final void m39670a(@NotNull FeedMainView feedMainView, int i, @NotNull View view, @NotNull View view2, @NotNull Function0<C15813i> function0) {
        C2668g.b(feedMainView, "$receiver");
        C2668g.b(view, "itemView");
        C2668g.b(view2, "anchorView");
        C2668g.b(function0, "onCompletion");
        feedMainView.getLayoutManager$Tinder_release().scrollToPositionWithOffset(i, C9488c.m39668a(feedMainView, view, view2));
        view.addOnLayoutChangeListener((OnLayoutChangeListener) new C9487a(view, function0));
    }

    /* renamed from: b */
    private static final void m39673b(@NotNull FeedMainView feedMainView, int i, View view, ViewGroup viewGroup, String str) {
        view = C9488c.m39666a(view, viewGroup);
        Context context = feedMainView.getContext();
        C2668g.a(context, "context");
        ViewGroup feedCommentComposerView = new FeedCommentComposerView(context, null);
        feedCommentComposerView.setGuidelineY(view);
        feedMainView = feedMainView.getFeedItemsAdapter$Tinder_release().m47488a(i);
        if (feedMainView == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.feed.view.model.ActivityFeedViewModel<*>");
        }
        feedCommentComposerView.m47654a((ActivityFeedViewModel) feedMainView, str);
        viewGroup.addView(feedCommentComposerView);
        feedCommentComposerView.m47653a();
    }

    /* renamed from: a */
    private static final int m39666a(View view, ViewGroup viewGroup) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[1];
        viewGroup.getLocationInWindow(iArr);
        return (i + view.getHeight()) - iArr[1];
    }

    /* renamed from: a */
    public static final int m39668a(@NotNull FeedMainView feedMainView, @NotNull View view, @NotNull View view2) {
        C2668g.b(feedMainView, "$receiver");
        C2668g.b(view, "itemView");
        C2668g.b(view2, "anchorView");
        int[] iArr = new int[2];
        Rect rect = new Rect();
        view.getLocationInWindow(iArr);
        int i = iArr[1];
        view2.getLocationInWindow(iArr);
        view = iArr[1];
        ((RecyclerView) feedMainView.a(C6248a.feedList)).getGlobalVisibleRect(rect);
        return (i - view) + (rect.height() / 2);
    }

    /* renamed from: a */
    public static final int m39667a(@NotNull FeedMainView feedMainView, @NotNull View view) {
        C2668g.b(feedMainView, "$receiver");
        C2668g.b(view, "view");
        int[] iArr = new int[2];
        Rect rect = new Rect();
        view.getLocationInWindow(iArr);
        int i = iArr[1];
        ((RecyclerView) feedMainView.a(C6248a.feedList)).getGlobalVisibleRect(rect);
        return rect.bottom - (i + view.getHeight());
    }

    /* renamed from: b */
    public static final boolean m39674b(@NotNull FeedMainView feedMainView, @NotNull View view) {
        C2668g.b(feedMainView, "$receiver");
        C2668g.b(view, "anchorView");
        Context context = feedMainView.getContext();
        C2668g.a(context, "context");
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.space_xxl);
        Rect rect = new Rect();
        ((RecyclerView) feedMainView.a(C6248a.feedList)).getGlobalVisibleRect(rect);
        int i = rect.bottom / 2;
        feedMainView = C9488c.m39667a(feedMainView, view);
        if (dimensionPixelOffset <= feedMainView) {
            if (i >= feedMainView) {
                return true;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static final ViewGroup m39669a(@NotNull FeedMainView feedMainView) {
        feedMainView = C14398a.a(feedMainView.getContext());
        if (feedMainView == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
        feedMainView = ((Activity) feedMainView).getWindow();
        C2668g.a(feedMainView, "(ActivityContextUtils.fi…vity)\n            .window");
        feedMainView = feedMainView.getDecorView();
        C2668g.a(feedMainView, "(ActivityContextUtils.fi…ow\n            .decorView");
        feedMainView = feedMainView.getRootView().findViewById(R.id.main_activity_container);
        C2668g.a(feedMainView, "(ActivityContextUtils.fi….main_activity_container)");
        return feedMainView;
    }
}
