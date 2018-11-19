package com.tinder.feed.view.media;

import android.content.Context;
import android.support.v4.view.C0600i;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tinder.R;
import com.tinder.chat.view.model.C10637d;
import com.tinder.chat.view.model.C10638f;
import com.tinder.chat.view.model.PhotoMediaViewModel;
import com.tinder.common.feed.view.FeedNewMatchImageContentView;
import com.tinder.common.p191d.C8529a;
import com.tinder.common.view.extension.C8587g;
import com.tinder.feed.view.FeedCarouselView;
import com.tinder.feed.view.feed.C9492d;
import com.tinder.feed.view.model.ActivityFeedViewModel.Attribution;
import com.tinder.feed.view.model.C13282k;
import com.tinder.feed.view.p250a.C9478a;
import com.tinder.video.view.MediaView;
import com.tinder.video.view.MediaView.C15417a;
import com.viewpagerindicator.CirclePageIndicator;
import java.util.List;
import kotlin.C18451c;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0018B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0019"}, d2 = {"Lcom/tinder/feed/view/media/FeedNewMatchMediaView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mediaViewPager", "Lcom/tinder/feed/view/FeedCarouselView;", "getMediaViewPager", "()Lcom/tinder/feed/view/FeedCarouselView;", "mediaViewPager$delegate", "Lkotlin/Lazy;", "titleIndicator", "Lcom/viewpagerindicator/CirclePageIndicator;", "getTitleIndicator", "()Lcom/viewpagerindicator/CirclePageIndicator;", "titleIndicator$delegate", "bind", "", "viewModel", "Lcom/tinder/feed/view/model/NewMatchFeedViewModel;", "onFeedItemDoubleTapListener", "Lcom/tinder/feed/view/media/OnFeedItemDoubleTapListener;", "FeedNewMatchMediaAdapter", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class FeedNewMatchMediaView extends FrameLayout {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f31848a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(FeedNewMatchMediaView.class), "mediaViewPager", "getMediaViewPager()Lcom/tinder/feed/view/FeedCarouselView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(FeedNewMatchMediaView.class), "titleIndicator", "getTitleIndicator()Lcom/viewpagerindicator/CirclePageIndicator;"))};
    /* renamed from: b */
    private final Lazy f31849b;
    /* renamed from: c */
    private final Lazy f31850c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0011H\u0016J\u0018\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0013H\u0016J\b\u0010\u001b\u001a\u00020\u0011H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/tinder/feed/view/media/FeedNewMatchMediaView$FeedNewMatchMediaAdapter;", "Landroid/support/v4/view/PagerAdapter;", "feedItem", "Lcom/tinder/feed/view/model/NewMatchFeedViewModel;", "onFeedItemDoubleTapListener", "Lcom/tinder/feed/view/media/OnFeedItemDoubleTapListener;", "(Lcom/tinder/feed/view/model/NewMatchFeedViewModel;Lcom/tinder/feed/view/media/OnFeedItemDoubleTapListener;)V", "matchType", "Lcom/tinder/feed/view/model/ActivityFeedViewModel$Attribution;", "mediaList", "", "Lcom/tinder/chat/view/model/PhotoMediaViewModel;", "destroyItem", "", "collection", "Landroid/view/ViewGroup;", "position", "", "view", "", "getCount", "instantiateItem", "container", "isViewFromObject", "", "Landroid/view/View;", "object", "toOverlayDrawable", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.media.FeedNewMatchMediaView$a */
    public static final class C11759a extends C0600i {
        /* renamed from: a */
        private final Attribution f38428a;
        /* renamed from: b */
        private final List<PhotoMediaViewModel> f38429b;
        /* renamed from: c */
        private final OnFeedItemDoubleTapListener f38430c;

        public boolean isViewFromObject(@NotNull View view, @NotNull Object obj) {
            C2668g.b(view, "view");
            C2668g.b(obj, "object");
            return view == obj;
        }

        public C11759a(@NotNull C13282k c13282k, @NotNull OnFeedItemDoubleTapListener onFeedItemDoubleTapListener) {
            C2668g.b(c13282k, "feedItem");
            C2668g.b(onFeedItemDoubleTapListener, "onFeedItemDoubleTapListener");
            this.f38430c = onFeedItemDoubleTapListener;
            this.f38428a = c13282k.mo11141c();
            this.f38429b = c13282k.mo11143e().m39805c();
        }

        public int getCount() {
            return this.f38429b.size();
        }

        @NotNull
        public Object instantiateItem(@NotNull ViewGroup viewGroup, int i) {
            C2668g.b(viewGroup, "container");
            PhotoMediaViewModel photoMediaViewModel = (PhotoMediaViewModel) this.f38429b.get(i);
            if (photoMediaViewModel instanceof C10638f) {
                i = FeedNewMatchImageContentView.f41163b.m36510a(viewGroup, ((C10638f) photoMediaViewModel).m42942a(), m47642a());
            } else if (photoMediaViewModel instanceof C10637d) {
                C15417a c15417a = MediaView.f56646c;
                Context context = viewGroup.getContext();
                C2668g.a(context, "container.context");
                C10637d c10637d = (C10637d) photoMediaViewModel;
                i = c15417a.a(context, C9492d.m39695b(c10637d.m42941b()), C9492d.m39696c(c10637d.m42940a()));
            } else {
                throw ((Throwable) new IllegalArgumentException("FeedNewMatchMediaView accepts only ActivityFeedPhotoViewModel, ActivityFeedLoopViewModel"));
            }
            viewGroup.addView(i);
            C9513e.m39771a(this.f38430c, i);
            return i;
        }

        public void destroyItem(@NotNull ViewGroup viewGroup, int i, @NotNull Object obj) {
            C2668g.b(viewGroup, "collection");
            C2668g.b(obj, "view");
            viewGroup.removeView((View) obj);
        }

        /* renamed from: a */
        private final int m47642a() {
            return C9514f.f31867a[this.f38428a.ordinal()] != 1 ? R.drawable.feed_background_image_gradient_no_corner_radius : R.drawable.feed_background_image_gradient_superlike;
        }
    }

    private final FeedCarouselView getMediaViewPager() {
        Lazy lazy = this.f31849b;
        KProperty kProperty = f31848a[0];
        return (FeedCarouselView) lazy.getValue();
    }

    private final CirclePageIndicator getTitleIndicator() {
        Lazy lazy = this.f31850c;
        KProperty kProperty = f31848a[1];
        return (CirclePageIndicator) lazy.getValue();
    }

    public /* synthetic */ FeedNewMatchMediaView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public FeedNewMatchMediaView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        this.f31849b = C18451c.a(LazyThreadSafetyMode.NONE, new FeedNewMatchMediaView$$special$$inlined$bindView$1(this, R.id.feed_photo_view_pager));
        this.f31850c = C18451c.a(LazyThreadSafetyMode.NONE, new FeedNewMatchMediaView$$special$$inlined$bindView$2(this, R.id.feed_photo_page_indicator));
        FrameLayout.inflate(context, R.layout.feed_carousel_media_container, this);
        setLayoutParams(C8529a.f30276a.m36494b());
    }

    /* renamed from: a */
    public final void m39762a(@NotNull C13282k c13282k, @NotNull OnFeedItemDoubleTapListener onFeedItemDoubleTapListener) {
        C2668g.b(c13282k, "viewModel");
        C2668g.b(onFeedItemDoubleTapListener, "onFeedItemDoubleTapListener");
        getMediaViewPager().m51337a((C0600i) new C11759a(c13282k, onFeedItemDoubleTapListener), C9478a.m39643a(c13282k));
        getTitleIndicator().setViewPager(getMediaViewPager());
        View titleIndicator = getTitleIndicator();
        onFeedItemDoubleTapListener = getMediaViewPager().getAdapter();
        if (onFeedItemDoubleTapListener == null) {
            C2668g.a();
        }
        C2668g.a(onFeedItemDoubleTapListener, "mediaViewPager.adapter!!");
        boolean z = true;
        if (onFeedItemDoubleTapListener.getCount() <= 1) {
            z = false;
        }
        C8587g.m36614a(titleIndicator, z);
    }
}
