package com.tinder.common.feed.view;

import android.content.Context;
import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tinder.C6250b.C6248a;
import com.tinder.C6250b.C6249b;
import com.tinder.R;
import com.tinder.api.ManagerWebServices;
import com.tinder.chat.view.model.C10636b;
import com.tinder.common.feed.interfaces.OnFeedMediaContentLoadedListener;
import com.tinder.common.p191d.C8529a;
import com.tinder.video.view.AspectRatioAwareImageView;
import com.tinder.views.CustomTextView;
import io.reactivex.C3959e;
import io.reactivex.functions.Predicate;
import io.reactivex.subjects.C19040a;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 32\u00020\u0001:\u00013B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010(\u001a\u00020)2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002J\"\u0010*\u001a\u00020)2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\nH\u0016J\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\r00J\u0012\u00101\u001a\u00020)2\b\b\u0001\u00102\u001a\u00020\u0007H\u0002R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R2\u0010\u000b\u001a&\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r \u000e*\u0012\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r\u0018\u00010\f0\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00020\u00078\u0002XD¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001eX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\"X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001e\u0010%\u001a\u00020\u00078\u0000@\u0000X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001a\"\u0004\b'\u0010\u001c¨\u00064"}, d2 = {"Lcom/tinder/common/feed/view/FeedImageContentView;", "Landroid/support/constraint/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "contentLoadedListener", "Lcom/tinder/common/feed/interfaces/OnFeedMediaContentLoadedListener;", "contentStateSubject", "Lio/reactivex/subjects/BehaviorSubject;", "Lcom/tinder/common/feed/view/FeedImageContentView$Companion$ContentState;", "kotlin.jvm.PlatformType", "defaultPlaceholderResId", "feedImageView", "Lcom/tinder/video/view/AspectRatioAwareImageView;", "getFeedImageView$Tinder_release", "()Lcom/tinder/video/view/AspectRatioAwareImageView;", "feedProgressLoaderView", "Landroid/widget/ProgressBar;", "getFeedProgressLoaderView$Tinder_release", "()Landroid/widget/ProgressBar;", "imageCornerRadius", "getImageCornerRadius$Tinder_release", "()I", "setImageCornerRadius$Tinder_release", "(I)V", "loadingErrorIconView", "Landroid/view/View;", "getLoadingErrorIconView$Tinder_release", "()Landroid/view/View;", "loadingErrorTextView", "Landroid/widget/TextView;", "getLoadingErrorTextView$Tinder_release", "()Landroid/widget/TextView;", "placeholderResourceId", "getPlaceholderResourceId$Tinder_release", "setPlaceholderResourceId$Tinder_release", "applyXmlAttributes", "", "bind", "viewModels", "", "Lcom/tinder/chat/view/model/ActivityFeedImageViewModel;", "onFeedMediaContentLoadedListener", "observeContentLoaded", "Lio/reactivex/Observable;", "setPlaceHolderResource", "resourceId", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public class FeedImageContentView extends ConstraintLayout {
    /* renamed from: a */
    public static final Companion f34966a = new Companion();
    @NotNull
    /* renamed from: b */
    private final AspectRatioAwareImageView f34967b;
    @NotNull
    /* renamed from: c */
    private final ProgressBar f34968c;
    @NotNull
    /* renamed from: d */
    private final TextView f34969d;
    @NotNull
    /* renamed from: e */
    private final View f34970e;
    /* renamed from: f */
    private int f34971f;
    @DrawableRes
    /* renamed from: g */
    private int f34972g;
    @ColorRes
    /* renamed from: h */
    private final int f34973h;
    /* renamed from: i */
    private C19040a<ContentState> f34974i;
    /* renamed from: j */
    private OnFeedMediaContentLoadedListener f34975j;
    /* renamed from: k */
    private HashMap f34976k;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\nB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¨\u0006\u000b"}, d2 = {"Lcom/tinder/common/feed/view/FeedImageContentView$Companion;", "", "()V", "createAndBind", "Lcom/tinder/common/feed/view/FeedImageContentView;", "container", "Landroid/view/ViewGroup;", "images", "", "Lcom/tinder/chat/view/model/ActivityFeedImageViewModel;", "ContentState", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public static final class Companion {

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/tinder/common/feed/view/FeedImageContentView$Companion$ContentState;", "", "(Ljava/lang/String;I)V", "UNINITIALIZED", "LOADED", "ERROR", "Tinder_release"}, k = 1, mv = {1, 1, 10})
        public enum ContentState {
        }

        private Companion() {
        }

        @NotNull
        /* renamed from: a */
        public final FeedImageContentView m36509a(@NotNull ViewGroup viewGroup, @NotNull List<C10636b> list) {
            C2668g.b(viewGroup, "container");
            C2668g.b(list, ManagerWebServices.PARAM_SPOTIFY_IMAGES);
            Context context = viewGroup.getContext();
            C2668g.a(context, "container.context");
            FeedImageContentView feedImageContentView = new FeedImageContentView(context, null, 0, 6, null);
            FeedImageContentView.m42982a(feedImageContentView, list, null, 2, null);
            return feedImageContentView;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/tinder/common/feed/view/FeedImageContentView$bind$1", "Lcom/tinder/common/feed/interfaces/OnFeedMediaContentLoadedListener;", "(Lcom/tinder/common/feed/view/FeedImageContentView;Lcom/tinder/common/feed/interfaces/OnFeedMediaContentLoadedListener;)V", "onContentLoaded", "", "onErrorLoadingContent", "url", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.common.feed.view.FeedImageContentView$a */
    public static final class C10660a implements OnFeedMediaContentLoadedListener {
        /* renamed from: a */
        final /* synthetic */ FeedImageContentView f34963a;
        /* renamed from: b */
        final /* synthetic */ OnFeedMediaContentLoadedListener f34964b;

        C10660a(FeedImageContentView feedImageContentView, OnFeedMediaContentLoadedListener onFeedMediaContentLoadedListener) {
            this.f34963a = feedImageContentView;
            this.f34964b = onFeedMediaContentLoadedListener;
        }

        public void onErrorLoadingContent(@NotNull String str) {
            C2668g.b(str, "url");
            OnFeedMediaContentLoadedListener onFeedMediaContentLoadedListener = this.f34964b;
            if (onFeedMediaContentLoadedListener != null) {
                onFeedMediaContentLoadedListener.onErrorLoadingContent(str);
            }
            this.f34963a.f34974i.onNext(ContentState.ERROR);
        }

        public void onContentLoaded() {
            OnFeedMediaContentLoadedListener onFeedMediaContentLoadedListener = this.f34964b;
            if (onFeedMediaContentLoadedListener != null) {
                onFeedMediaContentLoadedListener.onContentLoaded();
            }
            this.f34963a.f34974i.onNext(ContentState.LOADED);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/common/feed/view/FeedImageContentView$Companion$ContentState;", "test"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.common.feed.view.FeedImageContentView$b */
    static final class C10661b<T> implements Predicate<ContentState> {
        /* renamed from: a */
        public static final C10661b f34965a = new C10661b();

        C10661b() {
        }

        public /* synthetic */ boolean test(Object obj) {
            return m42979a((ContentState) obj);
        }

        /* renamed from: a */
        public final boolean m42979a(@NotNull ContentState contentState) {
            C2668g.b(contentState, "it");
            return contentState == ContentState.LOADED ? true : null;
        }
    }

    @JvmOverloads
    public FeedImageContentView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public FeedImageContentView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public View mo11001a(int i) {
        if (this.f34976k == null) {
            this.f34976k = new HashMap();
        }
        View view = (View) this.f34976k.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f34976k.put(Integer.valueOf(i), view);
        return view;
    }

    @JvmOverloads
    public /* synthetic */ FeedImageContentView(Context context, AttributeSet attributeSet, int i, int i2, C15823e c15823e) {
        if ((i2 & 2) != null) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    @JvmOverloads
    public FeedImageContentView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        C2668g.b(context, "context");
        super(context, attributeSet, i);
        this.f34973h = R.color.chat_image_default_background;
        this.f34974i = C19040a.a(ContentState.UNINITIALIZED);
        View.inflate(context, R.layout.activity_feed_image_content_view, this);
        setLayoutParams(C8529a.f30276a.m36494b());
        AspectRatioAwareImageView aspectRatioAwareImageView = (AspectRatioAwareImageView) mo11001a(C6248a.feedImage);
        C2668g.a(aspectRatioAwareImageView, "feedImage");
        this.f34967b = aspectRatioAwareImageView;
        ProgressBar progressBar = (ProgressBar) mo11001a(C6248a.feedProgressLoader);
        C2668g.a(progressBar, "feedProgressLoader");
        this.f34968c = progressBar;
        CustomTextView customTextView = (CustomTextView) mo11001a(C6248a.feedErrorStateText);
        C2668g.a(customTextView, "feedErrorStateText");
        this.f34969d = customTextView;
        context = mo11001a(C6248a.feedErrorStateImage);
        C2668g.a(context, "feedErrorStateImage");
        this.f34970e = context;
        this.f34972g = this.f34973h;
        m42981a(attributeSet);
    }

    @NotNull
    public final AspectRatioAwareImageView getFeedImageView$Tinder_release() {
        return this.f34967b;
    }

    @NotNull
    public final ProgressBar getFeedProgressLoaderView$Tinder_release() {
        return this.f34968c;
    }

    @NotNull
    public final TextView getLoadingErrorTextView$Tinder_release() {
        return this.f34969d;
    }

    @NotNull
    public final View getLoadingErrorIconView$Tinder_release() {
        return this.f34970e;
    }

    public final int getImageCornerRadius$Tinder_release() {
        return this.f34971f;
    }

    public final void setImageCornerRadius$Tinder_release(int i) {
        this.f34971f = i;
    }

    public final int getPlaceholderResourceId$Tinder_release() {
        return this.f34972g;
    }

    public final void setPlaceholderResourceId$Tinder_release(int i) {
        this.f34972g = i;
    }

    /* renamed from: a */
    public static /* synthetic */ void m42982a(FeedImageContentView feedImageContentView, List list, OnFeedMediaContentLoadedListener onFeedMediaContentLoadedListener, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bind");
        }
        if ((i & 2) != 0) {
            onFeedMediaContentLoadedListener = null;
        }
        feedImageContentView.mo11004a(list, onFeedMediaContentLoadedListener);
    }

    /* renamed from: a */
    public void mo11004a(@NotNull List<C10636b> list, @Nullable OnFeedMediaContentLoadedListener onFeedMediaContentLoadedListener) {
        C2668g.b(list, "viewModels");
        C10636b a = C8538a.m36514a((List) list);
        this.f34974i.onNext(ContentState.UNINITIALIZED);
        this.f34975j = new C10660a(this, onFeedMediaContentLoadedListener);
        String c = a != null ? a.m42938c() : null;
        if (c == null) {
            c = "";
        }
        C8538a.m36516a(this, c, C8538a.m36520c(list), C8538a.m36511a(a), this.f34975j);
    }

    @NotNull
    /* renamed from: a */
    public final C3959e<ContentState> m42984a() {
        C3959e<ContentState> filter = this.f34974i.hide().distinctUntilChanged().filter(C10661b.f34965a);
        C2668g.a(filter, "contentStateSubject.hide… == ContentState.LOADED }");
        return filter;
    }

    private final void setPlaceHolderResource(@DrawableRes int i) {
        this.f34972g = i;
    }

    /* renamed from: a */
    private final void m42981a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            attributeSet = getContext().obtainStyledAttributes(attributeSet, C6249b.FeedImageContentView);
            this.f34971f = attributeSet.getDimensionPixelSize(0, 0);
            setPlaceHolderResource(attributeSet.getResourceId(1, this.f34973h));
            attributeSet.recycle();
        }
    }
}
