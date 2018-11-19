package com.tinder.common.feed.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.content.C0432b;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.tinder.C6250b.C6248a;
import com.tinder.C6250b.C6249b;
import com.tinder.R;
import com.tinder.api.ManagerWebServices;
import com.tinder.chat.view.model.C10636b;
import com.tinder.common.C8548p;
import com.tinder.common.feed.interfaces.OnFeedMediaContentLoadedListener;
import com.tinder.common.view.extension.C8587g;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J \u0010\r\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0013\u001a\u00020\fH\u0002J\b\u0010\u0014\u001a\u00020\fH\u0002J\b\u0010\u0015\u001a\u00020\fH\u0002J\u000e\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0007R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/tinder/common/feed/view/FeedNewMatchImageContentView;", "Lcom/tinder/common/feed/view/FeedImageContentView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "newMatchOverlayDrawable", "Landroid/graphics/drawable/Drawable;", "applyXmlStyling", "", "bind", "viewModels", "", "Lcom/tinder/chat/view/model/ActivityFeedImageViewModel;", "onFeedMediaContentLoadedListener", "Lcom/tinder/common/feed/interfaces/OnFeedMediaContentLoadedListener;", "bindItsAMatchText", "bindOverlayGradient", "resetViewState", "setOverlayDrawable", "drawableResId", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class FeedNewMatchImageContentView extends FeedImageContentView {
    /* renamed from: b */
    public static final C8536a f41163b = new C8536a();
    /* renamed from: c */
    private Drawable f41164c;
    /* renamed from: d */
    private HashMap f41165d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, d2 = {"Lcom/tinder/common/feed/view/FeedNewMatchImageContentView$Companion;", "", "()V", "createAndBind", "Lcom/tinder/common/feed/view/FeedNewMatchImageContentView;", "container", "Landroid/view/ViewGroup;", "images", "", "Lcom/tinder/chat/view/model/ActivityFeedImageViewModel;", "overlayDrawable", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.common.feed.view.FeedNewMatchImageContentView$a */
    public static final class C8536a {
        private C8536a() {
        }

        @NotNull
        /* renamed from: a */
        public final FeedNewMatchImageContentView m36510a(@NotNull ViewGroup viewGroup, @NotNull List<C10636b> list, int i) {
            C2668g.b(viewGroup, "container");
            C2668g.b(list, ManagerWebServices.PARAM_SPOTIFY_IMAGES);
            Context context = viewGroup.getContext();
            C2668g.a(context, "container.context");
            FeedImageContentView feedNewMatchImageContentView = new FeedNewMatchImageContentView(context, null, 0, 6, null);
            feedNewMatchImageContentView.setOverlayDrawable(i);
            FeedImageContentView.m42982a(feedNewMatchImageContentView, list, null, 2, null);
            return feedNewMatchImageContentView;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/tinder/common/feed/view/FeedNewMatchImageContentView$bind$onContentLoadedListener$1", "Lcom/tinder/common/feed/interfaces/OnFeedMediaContentLoadedListener;", "(Lcom/tinder/common/feed/view/FeedNewMatchImageContentView;Lcom/tinder/common/feed/interfaces/OnFeedMediaContentLoadedListener;)V", "onContentLoaded", "", "onErrorLoadingContent", "url", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.common.feed.view.FeedNewMatchImageContentView$b */
    public static final class C10662b implements OnFeedMediaContentLoadedListener {
        /* renamed from: a */
        final /* synthetic */ FeedNewMatchImageContentView f34977a;
        /* renamed from: b */
        final /* synthetic */ OnFeedMediaContentLoadedListener f34978b;

        C10662b(FeedNewMatchImageContentView feedNewMatchImageContentView, OnFeedMediaContentLoadedListener onFeedMediaContentLoadedListener) {
            this.f34977a = feedNewMatchImageContentView;
            this.f34978b = onFeedMediaContentLoadedListener;
        }

        public void onErrorLoadingContent(@NotNull String str) {
            C2668g.b(str, "url");
            OnFeedMediaContentLoadedListener onFeedMediaContentLoadedListener = this.f34978b;
            if (onFeedMediaContentLoadedListener != null) {
                onFeedMediaContentLoadedListener.onErrorLoadingContent(str);
            }
        }

        public void onContentLoaded() {
            this.f34977a.m50247d();
            this.f34977a.m50246c();
            OnFeedMediaContentLoadedListener onFeedMediaContentLoadedListener = this.f34978b;
            if (onFeedMediaContentLoadedListener != null) {
                onFeedMediaContentLoadedListener.onContentLoaded();
            }
        }
    }

    @JvmOverloads
    public FeedNewMatchImageContentView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public FeedNewMatchImageContentView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public View mo11001a(int i) {
        if (this.f41165d == null) {
            this.f41165d = new HashMap();
        }
        View view = (View) this.f41165d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f41165d.put(Integer.valueOf(i), view);
        return view;
    }

    @JvmOverloads
    public /* synthetic */ FeedNewMatchImageContentView(Context context, AttributeSet attributeSet, int i, int i2, C15823e c15823e) {
        if ((i2 & 2) != null) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    @JvmOverloads
    public FeedNewMatchImageContentView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        C2668g.b(context, "context");
        super(context, attributeSet, i);
        View.inflate(context, R.layout.activity_feed_new_match_image_content_view, this);
        setLayoutParams(new LayoutParams(-1, -2));
        if (attributeSet != null) {
            m50242a(attributeSet);
        }
    }

    public final void setOverlayDrawable(int i) {
        this.f41164c = C0432b.a(getContext(), i);
    }

    /* renamed from: a */
    public void mo11004a(@NotNull List<C10636b> list, @Nullable OnFeedMediaContentLoadedListener onFeedMediaContentLoadedListener) {
        C2668g.b(list, "viewModels");
        m50244b();
        super.mo11004a(list, new C10662b(this, onFeedMediaContentLoadedListener));
    }

    /* renamed from: b */
    private final void m50244b() {
        View a = mo11001a(C6248a.feedImageGradientOverlayView);
        C2668g.a(a, "feedImageGradientOverlayView");
        a.setBackground((Drawable) null);
        ImageView imageView = (ImageView) mo11001a(C6248a.feedNewMatchTitleImageView);
        C2668g.a(imageView, "feedNewMatchTitleImageView");
        imageView.setVisibility(8);
        TextView textView = (TextView) mo11001a(C6248a.feedNewMatchTitleTextView);
        C2668g.a(textView, "feedNewMatchTitleTextView");
        textView.setVisibility(8);
    }

    /* renamed from: a */
    private final void m50242a(AttributeSet attributeSet) {
        attributeSet = getContext().obtainStyledAttributes(attributeSet, C6249b.FeedNewMatchImageContentView);
        setOverlayDrawable(attributeSet.getResourceId(0, -1));
        attributeSet.recycle();
    }

    /* renamed from: c */
    private final void m50246c() {
        View a = mo11001a(C6248a.feedImageGradientOverlayView);
        C2668g.a(a, "feedImageGradientOverlayView");
        a.setBackground(this.f41164c);
    }

    /* renamed from: d */
    private final void m50247d() {
        Locale locale = Locale.getDefault();
        C2668g.a(locale, "Locale.getDefault()");
        boolean a = C8548p.m36531a(locale);
        ImageView imageView = (ImageView) mo11001a(C6248a.feedNewMatchTitleImageView);
        C2668g.a(imageView, "feedNewMatchTitleImageView");
        C8587g.m36614a(imageView, a);
        TextView textView = (TextView) mo11001a(C6248a.feedNewMatchTitleTextView);
        C2668g.a(textView, "feedNewMatchTitleTextView");
        C8587g.m36614a(textView, a ^ 1);
    }
}
