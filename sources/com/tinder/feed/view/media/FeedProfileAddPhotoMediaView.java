package com.tinder.feed.view.media;

import android.content.Context;
import android.support.v4.view.C0600i;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tinder.R;
import com.tinder.chat.view.model.C10638f;
import com.tinder.common.feed.view.FeedImageContentView;
import com.tinder.common.p191d.C8529a;
import com.tinder.common.view.extension.C8587g;
import com.tinder.feed.view.FeedCarouselView;
import com.tinder.feed.view.model.C13284m;
import com.tinder.feed.view.p250a.C9478a;
import com.viewpagerindicator.CirclePageIndicator;
import java.util.List;
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

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0018B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0019"}, d2 = {"Lcom/tinder/feed/view/media/FeedProfileAddPhotoMediaView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mediaViewPager", "Lcom/tinder/feed/view/FeedCarouselView;", "getMediaViewPager", "()Lcom/tinder/feed/view/FeedCarouselView;", "mediaViewPager$delegate", "Lkotlin/Lazy;", "titleIndicator", "Lcom/viewpagerindicator/CirclePageIndicator;", "getTitleIndicator", "()Lcom/viewpagerindicator/CirclePageIndicator;", "titleIndicator$delegate", "bind", "", "feedItem", "Lcom/tinder/feed/view/model/ProfileAddPhotoFeedViewModel;", "onFeedItemDoubleTapListener", "Lcom/tinder/feed/view/media/OnFeedItemDoubleTapListener;", "ProfileAddPhotoAdapter", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class FeedProfileAddPhotoMediaView extends FrameLayout {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f31851a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(FeedProfileAddPhotoMediaView.class), "mediaViewPager", "getMediaViewPager()Lcom/tinder/feed/view/FeedCarouselView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(FeedProfileAddPhotoMediaView.class), "titleIndicator", "getTitleIndicator()Lcom/viewpagerindicator/CirclePageIndicator;"))};
    /* renamed from: b */
    private final Lazy f31852b;
    /* renamed from: c */
    private final Lazy f31853c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0011H\u0016R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/tinder/feed/view/media/FeedProfileAddPhotoMediaView$ProfileAddPhotoAdapter;", "Landroid/support/v4/view/PagerAdapter;", "feedItem", "Lcom/tinder/feed/view/model/ProfileAddPhotoFeedViewModel;", "onFeedItemDoubleTapListener", "Lcom/tinder/feed/view/media/OnFeedItemDoubleTapListener;", "(Lcom/tinder/feed/view/model/ProfileAddPhotoFeedViewModel;Lcom/tinder/feed/view/media/OnFeedItemDoubleTapListener;)V", "mediaList", "", "Lcom/tinder/chat/view/model/ActivityFeedPhotoViewModel;", "destroyItem", "", "collection", "Landroid/view/ViewGroup;", "position", "", "view", "", "getCount", "instantiateItem", "container", "isViewFromObject", "", "Landroid/view/View;", "object", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.media.FeedProfileAddPhotoMediaView$a */
    public static final class C11760a extends C0600i {
        /* renamed from: a */
        private final List<C10638f> f38431a;
        /* renamed from: b */
        private final OnFeedItemDoubleTapListener f38432b;

        public boolean isViewFromObject(@NotNull View view, @NotNull Object obj) {
            C2668g.b(view, "view");
            C2668g.b(obj, "object");
            return view == obj;
        }

        public C11760a(@NotNull C13284m c13284m, @NotNull OnFeedItemDoubleTapListener onFeedItemDoubleTapListener) {
            C2668g.b(c13284m, "feedItem");
            C2668g.b(onFeedItemDoubleTapListener, "onFeedItemDoubleTapListener");
            this.f38432b = onFeedItemDoubleTapListener;
            this.f38431a = c13284m.m51404g().m42915c();
        }

        public int getCount() {
            return this.f38431a.size();
        }

        @NotNull
        public Object instantiateItem(@NotNull ViewGroup viewGroup, int i) {
            C2668g.b(viewGroup, "container");
            i = FeedImageContentView.f34966a.m36509a(viewGroup, ((C10638f) this.f38431a.get(i)).m42942a());
            View view = (View) i;
            C9513e.m39771a(this.f38432b, view);
            viewGroup.addView(view);
            return i;
        }

        public void destroyItem(@NotNull ViewGroup viewGroup, int i, @NotNull Object obj) {
            C2668g.b(viewGroup, "collection");
            C2668g.b(obj, "view");
            viewGroup.removeView((View) obj);
        }
    }

    private final FeedCarouselView getMediaViewPager() {
        Lazy lazy = this.f31852b;
        KProperty kProperty = f31851a[0];
        return (FeedCarouselView) lazy.getValue();
    }

    private final CirclePageIndicator getTitleIndicator() {
        Lazy lazy = this.f31853c;
        KProperty kProperty = f31851a[1];
        return (CirclePageIndicator) lazy.getValue();
    }

    public /* synthetic */ FeedProfileAddPhotoMediaView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public FeedProfileAddPhotoMediaView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        this.f31852b = C18451c.a(LazyThreadSafetyMode.NONE, new FeedProfileAddPhotoMediaView$$special$$inlined$bindView$1(this, R.id.feed_photo_view_pager));
        this.f31853c = C18451c.a(LazyThreadSafetyMode.NONE, new FeedProfileAddPhotoMediaView$$special$$inlined$bindView$2(this, R.id.feed_photo_page_indicator));
        FrameLayout.inflate(context, R.layout.feed_carousel_media_container, this);
        setLayoutParams(C8529a.f30276a.m36494b());
    }

    /* renamed from: a */
    public final void m39763a(@NotNull C13284m c13284m, @NotNull OnFeedItemDoubleTapListener onFeedItemDoubleTapListener) {
        C2668g.b(c13284m, "feedItem");
        C2668g.b(onFeedItemDoubleTapListener, "onFeedItemDoubleTapListener");
        getMediaViewPager().m51337a((C0600i) new C11760a(c13284m, onFeedItemDoubleTapListener), C9478a.m39644a(c13284m));
        getTitleIndicator().setViewPager(getMediaViewPager());
        View titleIndicator = getTitleIndicator();
        onFeedItemDoubleTapListener = getMediaViewPager().getAdapter();
        if (onFeedItemDoubleTapListener == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.feed.view.media.FeedProfileAddPhotoMediaView.ProfileAddPhotoAdapter");
        }
        boolean z = true;
        if (((C11760a) onFeedItemDoubleTapListener).getCount() <= 1) {
            z = false;
        }
        C8587g.m36614a(titleIndicator, z);
    }
}
