package com.tinder.feed.view.media;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.v4.view.C0600i;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tinder.R;
import com.tinder.api.ManagerWebServices;
import com.tinder.chat.view.model.C10636b;
import com.tinder.chat.view.model.C10639h;
import com.tinder.chat.view.model.C8494e;
import com.tinder.chat.view.model.C8499q;
import com.tinder.common.feed.view.FeedImageContentView;
import com.tinder.common.p191d.C8529a;
import com.tinder.common.view.extension.C8587g;
import com.tinder.feed.view.FeedCarouselView;
import com.tinder.feed.view.feed.C9492d;
import com.tinder.feed.view.p250a.C9478a;
import com.tinder.video.view.MediaView;
import com.tinder.video.view.MediaView.VideoMuteListener;
import com.viewpagerindicator.CirclePageIndicator;
import java.util.ArrayList;
import java.util.List;
import kotlin.C18451c;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u001a\u001bB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\"\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0019R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/tinder/feed/view/media/FeedInstagramMediaView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mediaViewPager", "Lcom/tinder/feed/view/FeedCarouselView;", "getMediaViewPager", "()Lcom/tinder/feed/view/FeedCarouselView;", "mediaViewPager$delegate", "Lkotlin/Lazy;", "titleIndicator", "Lcom/viewpagerindicator/CirclePageIndicator;", "getTitleIndicator", "()Lcom/viewpagerindicator/CirclePageIndicator;", "titleIndicator$delegate", "bind", "", "viewModel", "Lcom/tinder/feed/view/media/FeedInstagramMediaView$FeedInstagramMediaViewModel;", "videoMuteListener", "Lcom/tinder/video/view/MediaView$VideoMuteListener;", "onFeedItemDoubleTapListener", "Lcom/tinder/feed/view/media/OnFeedItemDoubleTapListener;", "FeedInstagramMediaAdapter", "FeedInstagramMediaViewModel", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class FeedInstagramMediaView extends FrameLayout {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f31845a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(FeedInstagramMediaView.class), "mediaViewPager", "getMediaViewPager()Lcom/tinder/feed/view/FeedCarouselView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(FeedInstagramMediaView.class), "titleIndicator", "getTitleIndicator()Lcom/viewpagerindicator/CirclePageIndicator;"))};
    /* renamed from: b */
    private final Lazy f31846b;
    /* renamed from: c */
    private final Lazy f31847c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/tinder/feed/view/media/FeedInstagramMediaView$FeedInstagramMediaViewModel;", "", "id", "", "media", "", "Lcom/tinder/chat/view/model/InstagramMediaViewModel;", "(Ljava/lang/String;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getMedia", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.media.FeedInstagramMediaView$b */
    public static final class C9506b {
        @NotNull
        /* renamed from: a */
        private final String f31843a;
        @NotNull
        /* renamed from: b */
        private final List<C8499q> f31844b;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C9506b) {
                    C9506b c9506b = (C9506b) obj;
                    if (C2668g.a(this.f31843a, c9506b.f31843a) && C2668g.a(this.f31844b, c9506b.f31844b)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.f31843a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            List list = this.f31844b;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("FeedInstagramMediaViewModel(id=");
            stringBuilder.append(this.f31843a);
            stringBuilder.append(", media=");
            stringBuilder.append(this.f31844b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C9506b(@NotNull String str, @NotNull List<C8499q> list) {
            C2668g.b(str, "id");
            C2668g.b(list, ManagerWebServices.PARAM_MEDIA);
            this.f31843a = str;
            this.f31844b = list;
        }

        @NotNull
        /* renamed from: a */
        public final String m39758a() {
            return this.f31843a;
        }

        @NotNull
        /* renamed from: b */
        public final List<C8499q> m39759b() {
            return this.f31844b;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0011H\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/tinder/feed/view/media/FeedInstagramMediaView$FeedInstagramMediaAdapter;", "Landroid/support/v4/view/PagerAdapter;", "mediaList", "", "Lcom/tinder/chat/view/model/InstagramMediaViewModel;", "videoMuteListener", "Lcom/tinder/video/view/MediaView$VideoMuteListener;", "onFeedItemDoubleTapListener", "Lcom/tinder/feed/view/media/OnFeedItemDoubleTapListener;", "(Ljava/util/List;Lcom/tinder/video/view/MediaView$VideoMuteListener;Lcom/tinder/feed/view/media/OnFeedItemDoubleTapListener;)V", "destroyItem", "", "collection", "Landroid/view/ViewGroup;", "position", "", "view", "", "getCount", "instantiateItem", "container", "isViewFromObject", "", "Landroid/view/View;", "object", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.media.FeedInstagramMediaView$a */
    public static final class C11758a extends C0600i {
        /* renamed from: a */
        private final List<C8499q> f38425a;
        /* renamed from: b */
        private final VideoMuteListener f38426b;
        /* renamed from: c */
        private final OnFeedItemDoubleTapListener f38427c;

        public boolean isViewFromObject(@NotNull View view, @NotNull Object obj) {
            C2668g.b(view, "view");
            C2668g.b(obj, "object");
            return view == obj;
        }

        public C11758a(@NotNull List<C8499q> list, @Nullable VideoMuteListener videoMuteListener, @NotNull OnFeedItemDoubleTapListener onFeedItemDoubleTapListener) {
            C2668g.b(list, "mediaList");
            C2668g.b(onFeedItemDoubleTapListener, "onFeedItemDoubleTapListener");
            this.f38425a = list;
            this.f38426b = videoMuteListener;
            this.f38427c = onFeedItemDoubleTapListener;
        }

        public int getCount() {
            return this.f38425a.size();
        }

        @NotNull
        public Object instantiateItem(@NotNull ViewGroup viewGroup, int i) {
            C2668g.b(viewGroup, "container");
            List arrayList = new ArrayList();
            List arrayList2 = new ArrayList();
            for (C8494e c8494e : ((C8499q) this.f38425a.get(i)).m36420b()) {
                if (c8494e instanceof C10636b) {
                    arrayList.add(c8494e);
                } else if (c8494e instanceof C10639h) {
                    arrayList2.add(c8494e);
                }
            }
            if ((arrayList.isEmpty() ^ 1) != 0) {
                i = FeedImageContentView.f34966a.m36509a(viewGroup, arrayList);
                viewGroup.addView((View) i);
                i = (ConstraintLayout) i;
            } else {
                i = MediaView.f56646c;
                Context context = viewGroup.getContext();
                C2668g.a(context, "container.context");
                i = i.a(context, C9492d.m39695b(arrayList2), C19301m.a());
                VideoMuteListener videoMuteListener = this.f38426b;
                if (videoMuteListener != null) {
                    i.setVideoMuteListener(videoMuteListener);
                }
                viewGroup.addView((View) i);
                i = (ConstraintLayout) i;
            }
            C9513e.m39771a(this.f38427c, (View) i);
            return i;
        }

        public void destroyItem(@NotNull ViewGroup viewGroup, int i, @NotNull Object obj) {
            C2668g.b(viewGroup, "collection");
            C2668g.b(obj, "view");
            viewGroup.removeView((View) obj);
        }
    }

    private final FeedCarouselView getMediaViewPager() {
        Lazy lazy = this.f31846b;
        KProperty kProperty = f31845a[0];
        return (FeedCarouselView) lazy.getValue();
    }

    private final CirclePageIndicator getTitleIndicator() {
        Lazy lazy = this.f31847c;
        KProperty kProperty = f31845a[1];
        return (CirclePageIndicator) lazy.getValue();
    }

    public /* synthetic */ FeedInstagramMediaView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public FeedInstagramMediaView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        this.f31846b = C18451c.a(LazyThreadSafetyMode.NONE, new FeedInstagramMediaView$$special$$inlined$bindView$1(this, R.id.feed_photo_view_pager));
        this.f31847c = C18451c.a(LazyThreadSafetyMode.NONE, new FeedInstagramMediaView$$special$$inlined$bindView$2(this, R.id.feed_photo_page_indicator));
        FrameLayout.inflate(context, R.layout.feed_carousel_media_container, this);
        setLayoutParams(C8529a.f30276a.m36494b());
    }

    /* renamed from: a */
    public static /* synthetic */ void m39760a(FeedInstagramMediaView feedInstagramMediaView, C9506b c9506b, VideoMuteListener videoMuteListener, OnFeedItemDoubleTapListener onFeedItemDoubleTapListener, int i, Object obj) {
        if ((i & 2) != 0) {
            videoMuteListener = null;
        }
        feedInstagramMediaView.m39761a(c9506b, videoMuteListener, onFeedItemDoubleTapListener);
    }

    /* renamed from: a */
    public final void m39761a(@NotNull C9506b c9506b, @Nullable VideoMuteListener videoMuteListener, @NotNull OnFeedItemDoubleTapListener onFeedItemDoubleTapListener) {
        C2668g.b(c9506b, "viewModel");
        C2668g.b(onFeedItemDoubleTapListener, "onFeedItemDoubleTapListener");
        getMediaViewPager().m51337a((C0600i) new C11758a(c9506b.m39759b(), videoMuteListener, onFeedItemDoubleTapListener), C9478a.m39641a(c9506b));
        getTitleIndicator().setViewPager(getMediaViewPager());
        View titleIndicator = getTitleIndicator();
        videoMuteListener = getMediaViewPager().getAdapter();
        if (videoMuteListener == null) {
            C2668g.a();
        }
        C2668g.a(videoMuteListener, "mediaViewPager.adapter!!");
        onFeedItemDoubleTapListener = true;
        if (videoMuteListener.getCount() <= 1) {
            onFeedItemDoubleTapListener = null;
        }
        C8587g.m36614a(titleIndicator, onFeedItemDoubleTapListener);
    }
}
