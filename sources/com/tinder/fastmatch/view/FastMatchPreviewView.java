package com.tinder.fastmatch.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bumptech.glide.C0994i;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.C4331i;
import com.bumptech.glide.request.target.Target;
import com.tinder.R;
import com.tinder.deadshot.Deadshot;
import com.tinder.fastmatch.presenter.C9385a;
import com.tinder.fastmatch.preview.C9404e;
import com.tinder.fastmatch.target.FastMatchPreviewTarget;
import com.tinder.fastmatch.viewmodel.FastMatchPreviewViewModel;
import com.tinder.managers.ManagerApp;
import com.tinder.views.AvatarView;
import com.tinder.views.FastMatchEntryLoadingBar;
import javax.inject.Inject;
import jp.wasabeef.glide.transformations.p487a.C18448b;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010H\u001a\u00020IH\u0002J\b\u0010J\u001a\u00020IH\u0014J\b\u0010K\u001a\u00020IH\u0014J\"\u0010L\u001a\u00020I2\b\u0010M\u001a\u0004\u0018\u00010N2\u0006\u0010O\u001a\u00020\u00102\u0006\u0010P\u001a\u00020QH\u0002J\b\u0010R\u001a\u00020IH\u0002J\b\u0010S\u001a\u00020IH\u0002J\b\u0010T\u001a\u00020IH\u0002J\u0010\u0010U\u001a\u00020I2\u0006\u0010V\u001a\u00020WH\u0016R\u001e\u0010\t\u001a\u00020\n8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u00168\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u001e\u0010\u001e\u001a\u00020\u001f8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010$\u001a\u00020%8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001e\u0010*\u001a\u00020\u00168\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0018\"\u0004\b,\u0010\u001aR\u001e\u0010-\u001a\u00020.8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001e\u00103\u001a\u00020\u00168\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0018\"\u0004\b5\u0010\u001aR\u001e\u00106\u001a\u00020\u00168\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0018\"\u0004\b8\u0010\u001aR\u001e\u00109\u001a\u00020:8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001e\u0010?\u001a\u00020\u00168\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0018\"\u0004\bA\u0010\u001aR\u001e\u0010B\u001a\u00020C8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010G¨\u0006X"}, d2 = {"Lcom/tinder/fastmatch/view/FastMatchPreviewView;", "Landroid/widget/RelativeLayout;", "Lcom/tinder/fastmatch/target/FastMatchPreviewTarget;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "avatarView", "Lcom/tinder/views/AvatarView;", "getAvatarView$Tinder_release", "()Lcom/tinder/views/AvatarView;", "setAvatarView$Tinder_release", "(Lcom/tinder/views/AvatarView;)V", "countRangeFormatString", "", "getCountRangeFormatString$Tinder_release", "()Ljava/lang/String;", "setCountRangeFormatString$Tinder_release", "(Ljava/lang/String;)V", "emptyCenterView", "Landroid/view/View;", "getEmptyCenterView$Tinder_release", "()Landroid/view/View;", "setEmptyCenterView$Tinder_release", "(Landroid/view/View;)V", "emptyFastMatchOverlay", "getEmptyFastMatchOverlay$Tinder_release", "setEmptyFastMatchOverlay$Tinder_release", "fastMatchOverlay", "Landroid/widget/FrameLayout;", "getFastMatchOverlay$Tinder_release", "()Landroid/widget/FrameLayout;", "setFastMatchOverlay$Tinder_release", "(Landroid/widget/FrameLayout;)V", "fastMatchPreviewImageCache", "Lcom/tinder/fastmatch/preview/FastMatchPreviewImageCache;", "getFastMatchPreviewImageCache$Tinder_release", "()Lcom/tinder/fastmatch/preview/FastMatchPreviewImageCache;", "setFastMatchPreviewImageCache$Tinder_release", "(Lcom/tinder/fastmatch/preview/FastMatchPreviewImageCache;)V", "innerCircleAvatar", "getInnerCircleAvatar$Tinder_release", "setInnerCircleAvatar$Tinder_release", "loadingBar", "Lcom/tinder/views/FastMatchEntryLoadingBar;", "getLoadingBar$Tinder_release", "()Lcom/tinder/views/FastMatchEntryLoadingBar;", "setLoadingBar$Tinder_release", "(Lcom/tinder/views/FastMatchEntryLoadingBar;)V", "matchIndicatorBackgroundView", "getMatchIndicatorBackgroundView$Tinder_release", "setMatchIndicatorBackgroundView$Tinder_release", "matchIndicatorView", "getMatchIndicatorView$Tinder_release", "setMatchIndicatorView$Tinder_release", "nonsubscriberLikesCount", "Landroid/widget/TextView;", "getNonsubscriberLikesCount$Tinder_release", "()Landroid/widget/TextView;", "setNonsubscriberLikesCount$Tinder_release", "(Landroid/widget/TextView;)V", "nonsubscriberLikesCountBackground", "getNonsubscriberLikesCountBackground$Tinder_release", "setNonsubscriberLikesCountBackground$Tinder_release", "presenter", "Lcom/tinder/fastmatch/presenter/FastMatchPreviewPresenter;", "getPresenter$Tinder_release", "()Lcom/tinder/fastmatch/presenter/FastMatchPreviewPresenter;", "setPresenter$Tinder_release", "(Lcom/tinder/fastmatch/presenter/FastMatchPreviewPresenter;)V", "clearViews", "", "onAttachedToWindow", "onDetachedFromWindow", "showAvatar", "byteArray", "", "cacheKey", "shouldPixelateView", "", "showEmptyState", "showLoadingState", "showMatchesState", "showPreview", "viewModel", "Lcom/tinder/fastmatch/viewmodel/FastMatchPreviewViewModel;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class FastMatchPreviewView extends RelativeLayout implements FastMatchPreviewTarget {
    @Inject
    @NotNull
    /* renamed from: a */
    public C9385a f38128a;
    @NotNull
    @BindView(2131362915)
    public AvatarView avatarView;
    @Inject
    @NotNull
    /* renamed from: b */
    public C9404e f38129b;
    @BindString(2131820871)
    @NotNull
    public String countRangeFormatString;
    @NotNull
    @BindView(2131362472)
    public View emptyCenterView;
    @NotNull
    @BindView(2131362401)
    public View emptyFastMatchOverlay;
    @NotNull
    @BindView(2131362476)
    public FrameLayout fastMatchOverlay;
    @NotNull
    @BindView(2131362471)
    public View innerCircleAvatar;
    @NotNull
    @BindView(2131362859)
    public FastMatchEntryLoadingBar loadingBar;
    @NotNull
    @BindView(2131362903)
    public View matchIndicatorBackgroundView;
    @NotNull
    @BindView(2131362902)
    public View matchIndicatorView;
    @NotNull
    @BindView(2131363013)
    public TextView nonsubscriberLikesCount;
    @NotNull
    @BindView(2131363014)
    public View nonsubscriberLikesCountBackground;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0010\u0010\b\u001a\f\u0012\u0006\b\u0000\u0012\u00020\u0003\u0018\u00010\tH\u0016¨\u0006\n"}, d2 = {"com/tinder/fastmatch/view/FastMatchPreviewView$showAvatar$1", "Lcom/bumptech/glide/request/target/ViewTarget;", "Lcom/tinder/views/AvatarView;", "Landroid/graphics/Bitmap;", "(Lcom/tinder/fastmatch/view/FastMatchPreviewView;Ljava/lang/String;Landroid/view/View;)V", "onResourceReady", "", "resource", "glideAnimation", "Lcom/bumptech/glide/request/animation/GlideAnimation;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.view.FastMatchPreviewView$a */
    public static final class C14309a extends C4331i<AvatarView, Bitmap> {
        /* renamed from: b */
        final /* synthetic */ FastMatchPreviewView f45318b;
        /* renamed from: c */
        final /* synthetic */ String f45319c;

        C14309a(FastMatchPreviewView fastMatchPreviewView, String str, View view) {
            this.f45318b = fastMatchPreviewView;
            this.f45319c = str;
            super(view);
        }

        public /* synthetic */ void onResourceReady(Object obj, GlideAnimation glideAnimation) {
            m54411a((Bitmap) obj, glideAnimation);
        }

        /* renamed from: a */
        public void m54411a(@Nullable Bitmap bitmap, @Nullable GlideAnimation<? super Bitmap> glideAnimation) {
            if (bitmap != null) {
                ((AvatarView) this.a).setSingleAvatar(new BitmapDrawable(this.f45318b.getResources(), bitmap));
                this.f45318b.getFastMatchPreviewImageCache$Tinder_release().m39353a(this.f45319c, bitmap);
            }
        }
    }

    public FastMatchPreviewView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        RelativeLayout.inflate(context, R.layout.view_fast_match_preview, this);
        ButterKnife.a(this);
        context = context.getApplicationContext();
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.managers.ManagerApp");
        }
        ((ManagerApp) context).h().inject(this);
        context = this.avatarView;
        if (context == null) {
            C2668g.b("avatarView");
        }
        context.setGroupAvatarsView(new int[]{R.drawable.ic_match_placeholder});
        m47460b();
    }

    public FastMatchPreviewView(@NotNull Context context) {
        C2668g.b(context, "context");
        this(context, null);
    }

    @NotNull
    public final String getCountRangeFormatString$Tinder_release() {
        String str = this.countRangeFormatString;
        if (str == null) {
            C2668g.b("countRangeFormatString");
        }
        return str;
    }

    public final void setCountRangeFormatString$Tinder_release(@NotNull String str) {
        C2668g.b(str, "<set-?>");
        this.countRangeFormatString = str;
    }

    @NotNull
    public final FrameLayout getFastMatchOverlay$Tinder_release() {
        FrameLayout frameLayout = this.fastMatchOverlay;
        if (frameLayout == null) {
            C2668g.b("fastMatchOverlay");
        }
        return frameLayout;
    }

    public final void setFastMatchOverlay$Tinder_release(@NotNull FrameLayout frameLayout) {
        C2668g.b(frameLayout, "<set-?>");
        this.fastMatchOverlay = frameLayout;
    }

    @NotNull
    public final View getEmptyFastMatchOverlay$Tinder_release() {
        View view = this.emptyFastMatchOverlay;
        if (view == null) {
            C2668g.b("emptyFastMatchOverlay");
        }
        return view;
    }

    public final void setEmptyFastMatchOverlay$Tinder_release(@NotNull View view) {
        C2668g.b(view, "<set-?>");
        this.emptyFastMatchOverlay = view;
    }

    @NotNull
    public final FastMatchEntryLoadingBar getLoadingBar$Tinder_release() {
        FastMatchEntryLoadingBar fastMatchEntryLoadingBar = this.loadingBar;
        if (fastMatchEntryLoadingBar == null) {
            C2668g.b("loadingBar");
        }
        return fastMatchEntryLoadingBar;
    }

    public final void setLoadingBar$Tinder_release(@NotNull FastMatchEntryLoadingBar fastMatchEntryLoadingBar) {
        C2668g.b(fastMatchEntryLoadingBar, "<set-?>");
        this.loadingBar = fastMatchEntryLoadingBar;
    }

    @NotNull
    public final AvatarView getAvatarView$Tinder_release() {
        AvatarView avatarView = this.avatarView;
        if (avatarView == null) {
            C2668g.b("avatarView");
        }
        return avatarView;
    }

    public final void setAvatarView$Tinder_release(@NotNull AvatarView avatarView) {
        C2668g.b(avatarView, "<set-?>");
        this.avatarView = avatarView;
    }

    @NotNull
    public final View getMatchIndicatorBackgroundView$Tinder_release() {
        View view = this.matchIndicatorBackgroundView;
        if (view == null) {
            C2668g.b("matchIndicatorBackgroundView");
        }
        return view;
    }

    public final void setMatchIndicatorBackgroundView$Tinder_release(@NotNull View view) {
        C2668g.b(view, "<set-?>");
        this.matchIndicatorBackgroundView = view;
    }

    @NotNull
    public final View getMatchIndicatorView$Tinder_release() {
        View view = this.matchIndicatorView;
        if (view == null) {
            C2668g.b("matchIndicatorView");
        }
        return view;
    }

    public final void setMatchIndicatorView$Tinder_release(@NotNull View view) {
        C2668g.b(view, "<set-?>");
        this.matchIndicatorView = view;
    }

    @NotNull
    public final View getNonsubscriberLikesCountBackground$Tinder_release() {
        View view = this.nonsubscriberLikesCountBackground;
        if (view == null) {
            C2668g.b("nonsubscriberLikesCountBackground");
        }
        return view;
    }

    public final void setNonsubscriberLikesCountBackground$Tinder_release(@NotNull View view) {
        C2668g.b(view, "<set-?>");
        this.nonsubscriberLikesCountBackground = view;
    }

    @NotNull
    public final TextView getNonsubscriberLikesCount$Tinder_release() {
        TextView textView = this.nonsubscriberLikesCount;
        if (textView == null) {
            C2668g.b("nonsubscriberLikesCount");
        }
        return textView;
    }

    public final void setNonsubscriberLikesCount$Tinder_release(@NotNull TextView textView) {
        C2668g.b(textView, "<set-?>");
        this.nonsubscriberLikesCount = textView;
    }

    @NotNull
    public final View getEmptyCenterView$Tinder_release() {
        View view = this.emptyCenterView;
        if (view == null) {
            C2668g.b("emptyCenterView");
        }
        return view;
    }

    public final void setEmptyCenterView$Tinder_release(@NotNull View view) {
        C2668g.b(view, "<set-?>");
        this.emptyCenterView = view;
    }

    @NotNull
    public final View getInnerCircleAvatar$Tinder_release() {
        View view = this.innerCircleAvatar;
        if (view == null) {
            C2668g.b("innerCircleAvatar");
        }
        return view;
    }

    public final void setInnerCircleAvatar$Tinder_release(@NotNull View view) {
        C2668g.b(view, "<set-?>");
        this.innerCircleAvatar = view;
    }

    @NotNull
    public final C9385a getPresenter$Tinder_release() {
        C9385a c9385a = this.f38128a;
        if (c9385a == null) {
            C2668g.b("presenter");
        }
        return c9385a;
    }

    public final void setPresenter$Tinder_release(@NotNull C9385a c9385a) {
        C2668g.b(c9385a, "<set-?>");
        this.f38128a = c9385a;
    }

    @NotNull
    public final C9404e getFastMatchPreviewImageCache$Tinder_release() {
        C9404e c9404e = this.f38129b;
        if (c9404e == null) {
            C2668g.b("fastMatchPreviewImageCache");
        }
        return c9404e;
    }

    public final void setFastMatchPreviewImageCache$Tinder_release(@NotNull C9404e c9404e) {
        C2668g.b(c9404e, "<set-?>");
        this.f38129b = c9404e;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C9385a c9385a = this.f38128a;
        if (c9385a == null) {
            C2668g.b("presenter");
        }
        Deadshot.take(this, c9385a);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Deadshot.drop(this);
    }

    public void showPreview(@NotNull FastMatchPreviewViewModel fastMatchPreviewViewModel) {
        C2668g.b(fastMatchPreviewViewModel, "viewModel");
        View view;
        TextView textView;
        switch (C9418c.f31558a[fastMatchPreviewViewModel.m39383c().ordinal()]) {
            case 1:
                view = this.nonsubscriberLikesCountBackground;
                if (view == null) {
                    C2668g.b("nonsubscriberLikesCountBackground");
                }
                view.setVisibility(0);
                textView = this.nonsubscriberLikesCount;
                if (textView == null) {
                    C2668g.b("nonsubscriberLikesCount");
                }
                textView.setVisibility(0);
                textView = this.nonsubscriberLikesCount;
                if (textView == null) {
                    C2668g.b("nonsubscriberLikesCount");
                }
                String str = this.countRangeFormatString;
                if (str == null) {
                    C2668g.b("countRangeFormatString");
                }
                textView.setText(fastMatchPreviewViewModel.m39381a(str));
                break;
            case 2:
                view = this.nonsubscriberLikesCountBackground;
                if (view == null) {
                    C2668g.b("nonsubscriberLikesCountBackground");
                }
                view.setVisibility(8);
                textView = this.nonsubscriberLikesCount;
                if (textView == null) {
                    C2668g.b("nonsubscriberLikesCount");
                }
                textView.setVisibility(8);
                break;
            case 3:
                view = this.nonsubscriberLikesCountBackground;
                if (view == null) {
                    C2668g.b("nonsubscriberLikesCountBackground");
                }
                view.setVisibility(8);
                textView = this.nonsubscriberLikesCount;
                if (textView == null) {
                    C2668g.b("nonsubscriberLikesCount");
                }
                textView.setVisibility(8);
                break;
            default:
                break;
        }
        switch (C9418c.f31559b[fastMatchPreviewViewModel.m39387g().ordinal()]) {
            case 1:
                m47459a(fastMatchPreviewViewModel.m39384d(), fastMatchPreviewViewModel.m39385e(), fastMatchPreviewViewModel.m39386f());
                return;
            case 2:
                m47458a();
                return;
            case 3:
                m47460b();
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    private final void m47459a(byte[] bArr, String str, boolean z) {
        m47461c();
        if (bArr == null) {
            bArr = this.avatarView;
            if (bArr == null) {
                C2668g.b("avatarView");
            }
            bArr.setVisibility(8);
            return;
        }
        bArr = C0994i.b(getContext()).a(bArr).l();
        if (z) {
            bArr.a(new Transformation[]{new C18448b(getContext(), 8.0f)});
        }
        AvatarView avatarView = this.avatarView;
        if (avatarView == null) {
            C2668g.b("avatarView");
        }
        bArr.b((Target) new C14309a(this, str, avatarView));
    }

    /* renamed from: a */
    private final void m47458a() {
        m47462d();
        View view = this.emptyCenterView;
        if (view == null) {
            C2668g.b("emptyCenterView");
        }
        view.setVisibility(0);
        view = this.emptyFastMatchOverlay;
        if (view == null) {
            C2668g.b("emptyFastMatchOverlay");
        }
        view.setVisibility(0);
    }

    /* renamed from: b */
    private final void m47460b() {
        m47462d();
        View view = this.emptyCenterView;
        if (view == null) {
            C2668g.b("emptyCenterView");
        }
        view.setVisibility(0);
        FastMatchEntryLoadingBar fastMatchEntryLoadingBar = this.loadingBar;
        if (fastMatchEntryLoadingBar == null) {
            C2668g.b("loadingBar");
        }
        fastMatchEntryLoadingBar.setVisibility(0);
        fastMatchEntryLoadingBar = this.loadingBar;
        if (fastMatchEntryLoadingBar == null) {
            C2668g.b("loadingBar");
        }
        FastMatchEntryLoadingBar.a(fastMatchEntryLoadingBar, 0, 1, null);
    }

    /* renamed from: c */
    private final void m47461c() {
        m47462d();
        AvatarView avatarView = this.avatarView;
        if (avatarView == null) {
            C2668g.b("avatarView");
        }
        avatarView.setVisibility(0);
        View view = this.innerCircleAvatar;
        if (view == null) {
            C2668g.b("innerCircleAvatar");
        }
        view.setVisibility(0);
        FrameLayout frameLayout = this.fastMatchOverlay;
        if (frameLayout == null) {
            C2668g.b("fastMatchOverlay");
        }
        frameLayout.setVisibility(0);
    }

    /* renamed from: d */
    private final void m47462d() {
        View view = this.emptyCenterView;
        if (view == null) {
            C2668g.b("emptyCenterView");
        }
        view.setVisibility(8);
        view = this.emptyFastMatchOverlay;
        if (view == null) {
            C2668g.b("emptyFastMatchOverlay");
        }
        view.setVisibility(8);
        view = this.innerCircleAvatar;
        if (view == null) {
            C2668g.b("innerCircleAvatar");
        }
        view.setVisibility(8);
        FrameLayout frameLayout = this.fastMatchOverlay;
        if (frameLayout == null) {
            C2668g.b("fastMatchOverlay");
        }
        frameLayout.setVisibility(8);
        FastMatchEntryLoadingBar fastMatchEntryLoadingBar = this.loadingBar;
        if (fastMatchEntryLoadingBar == null) {
            C2668g.b("loadingBar");
        }
        fastMatchEntryLoadingBar.clearAnimation();
        fastMatchEntryLoadingBar = this.loadingBar;
        if (fastMatchEntryLoadingBar == null) {
            C2668g.b("loadingBar");
        }
        fastMatchEntryLoadingBar.setVisibility(8);
    }
}
