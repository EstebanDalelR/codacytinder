package com.tinder.views.grid;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.support.v4.content.C0432b;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bumptech.glide.C0994i;
import com.bumptech.glide.C3018c;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.tinder.C6250b.C6249b;
import com.tinder.R;
import com.tinder.api.ManagerWebServices;
import com.tinder.cardstack.model.C8395a;
import com.tinder.recs.card.UserRecCard;
import com.tinder.recs.provider.UserRecActivePhotoIndexProvider;
import com.tinder.recs.view.RecCardView;
import com.tinder.view.grid.ParallaxFrameLayout;
import com.tinder.views.grid.C15459f.C15458a;
import com.tinder.views.grid.p449a.C15453a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.C15810e;
import kotlin.C15813i;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C18457p;
import kotlin.collections.C19299w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000e\b&\u0018\u0000 s2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002rsB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010K\u001a\u00020F2\u0006\u00107\u001a\u00020\u0002H\u0016J\u0018\u0010L\u001a\u00020F2\u0006\u0010M\u001a\u00020\u001d2\u0006\u0010N\u001a\u00020\u001dH\u0002J\u0010\u0010O\u001a\u00020F2\u0006\u00107\u001a\u00020\u0002H&J\b\u0010P\u001a\u00020FH\u0002J\u0006\u0010Q\u001a\u00020FJ\u0006\u0010R\u001a\u00020\u001dJ\u0006\u0010S\u001a\u00020TJ\u0006\u0010U\u001a\u00020'J\u0006\u0010V\u001a\u00020\u001dJ\u0010\u0010W\u001a\u00020F2\u0006\u0010X\u001a\u00020YH\u0016J\b\u0010Z\u001a\u00020FH\u0014J\b\u0010[\u001a\u00020FH\u0014J\u0018\u0010\\\u001a\u00020F2\u0006\u0010]\u001a\u00020\u001d2\u0006\u0010^\u001a\u00020\u001dH\u0014J\u0010\u0010_\u001a\u00020F2\u0006\u00107\u001a\u00020\u0002H\u0016J(\u0010`\u001a\u00020F2\u0006\u0010a\u001a\u00020\u001d2\u0006\u0010b\u001a\u00020\u001d2\u0006\u0010c\u001a\u00020\u001d2\u0006\u0010d\u001a\u00020\u001dH\u0014J\u001b\u0010e\u001a\b\u0012\u0004\u0012\u00020T0f2\u0006\u0010g\u001a\u00020TH\u0000¢\u0006\u0002\bhJ\u001b\u0010i\u001a\b\u0012\u0004\u0012\u00020T0f2\u0006\u0010j\u001a\u00020TH\u0000¢\u0006\u0002\bkJ\u0010\u0010l\u001a\u00020F2\u0006\u0010m\u001a\u00020-H\u0016J\u0010\u0010n\u001a\u00020F2\u0006\u0010o\u001a\u00020\u0011H\u0016J\u000e\u0010p\u001a\u00020F2\u0006\u0010q\u001a\u00020\u001dR\u001e\u0010\b\u001a\u00020\t8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00060\u000fR\u00020\u0000X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u0004\n\u0002\u0010\u001eR\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u001dX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u001dX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010#\u001a\u00020\u00178\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0019\"\u0004\b%\u0010\u001bR\u001e\u0010&\u001a\u00020'8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020-XD¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u001e\u00100\u001a\u0002018\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u00107\u001a\u00020\u00022\u0006\u00106\u001a\u00020\u0002@BX.¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u000e\u0010<\u001a\u00020=X.¢\u0006\u0002\n\u0000R\u001e\u0010>\u001a\u00020?8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010D\u001a\n\u0012\u0004\u0012\u00020F\u0018\u00010EX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010J¨\u0006t"}, d2 = {"Lcom/tinder/views/grid/GridUserRecCardView;", "Lcom/tinder/recs/view/RecCardView;", "Lcom/tinder/recs/card/UserRecCard;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "activePhotoIndexProvider", "Lcom/tinder/recs/provider/UserRecActivePhotoIndexProvider;", "getActivePhotoIndexProvider$Tinder_release", "()Lcom/tinder/recs/provider/UserRecActivePhotoIndexProvider;", "setActivePhotoIndexProvider$Tinder_release", "(Lcom/tinder/recs/provider/UserRecActivePhotoIndexProvider;)V", "alphaAnimator", "Lcom/tinder/views/grid/GridUserRecCardView$AlphaAnimator;", "aspectRatio", "", "getAspectRatio", "()F", "setAspectRatio", "(F)V", "bottomGradientView", "Landroid/widget/ImageView;", "getBottomGradientView$Tinder_release", "()Landroid/widget/ImageView;", "setBottomGradientView$Tinder_release", "(Landroid/widget/ImageView;)V", "gradientColor", "", "Ljava/lang/Integer;", "gradientDrawable", "Landroid/graphics/drawable/GradientDrawable;", "gradientHeight", "gradientWidth", "imageView", "getImageView$Tinder_release", "setImageView$Tinder_release", "parallaxFrameLayout", "Lcom/tinder/view/grid/ParallaxFrameLayout;", "getParallaxFrameLayout$Tinder_release", "()Lcom/tinder/view/grid/ParallaxFrameLayout;", "setParallaxFrameLayout$Tinder_release", "(Lcom/tinder/view/grid/ParallaxFrameLayout;)V", "shouldShowBottomGradient", "", "getShouldShowBottomGradient", "()Z", "userInfoViewContainer", "Landroid/view/ViewGroup;", "getUserInfoViewContainer$Tinder_release", "()Landroid/view/ViewGroup;", "setUserInfoViewContainer$Tinder_release", "(Landroid/view/ViewGroup;)V", "<set-?>", "userRecCard", "getUserRecCard", "()Lcom/tinder/recs/card/UserRecCard;", "setUserRecCard", "(Lcom/tinder/recs/card/UserRecCard;)V", "userRecPhotoAlbum", "Lcom/tinder/views/grid/UserRecPhotoAlbum;", "userRecPhotoAlbumProvider", "Lcom/tinder/views/grid/provider/UserRecPhotoAlbumProvider;", "getUserRecPhotoAlbumProvider$Tinder_release", "()Lcom/tinder/views/grid/provider/UserRecPhotoAlbumProvider;", "setUserRecPhotoAlbumProvider$Tinder_release", "(Lcom/tinder/views/grid/provider/UserRecPhotoAlbumProvider;)V", "verticalTranslationListener", "Lkotlin/Function0;", "", "getVerticalTranslationListener", "()Lkotlin/jvm/functions/Function0;", "setVerticalTranslationListener", "(Lkotlin/jvm/functions/Function0;)V", "bind", "bindColorGradientForHeight", "width", "height", "bindInfo", "bindPhotos", "clearPhoto", "getDisplayedPhotoIndex", "getDisplayedPhotoUrl", "", "getParallaxFrameLayout", "getPhotoCount", "loadImage", "photo", "Lcom/tinder/views/grid/UserRecPhotoAlbum$Photo;", "onDetachedFromWindow", "onFinishInflate", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onMovedToTop", "onSizeChanged", "w", "h", "oldw", "oldh", "requestForFullPhoto", "Lcom/bumptech/glide/DrawableRequestBuilder;", "photoUrl", "requestForFullPhoto$Tinder_release", "requestForThumbnailPhoto", "thumbnailUrl", "requestForThumbnailPhoto$Tinder_release", "setEnabled", "enabled", "setTranslationY", "translationY", "showPhotoAtIndex", "index", "AlphaAnimator", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public abstract class GridUserRecCardView extends RecCardView<UserRecCard> {
    /* renamed from: e */
    public static final C15449b f56670e = new C15449b();
    @NotNull
    /* renamed from: a */
    private UserRecCard f56671a;
    /* renamed from: b */
    private final boolean f56672b = true;
    @NotNull
    @BindView(2131363411)
    public ImageView bottomGradientView;
    @Inject
    @NotNull
    /* renamed from: c */
    public UserRecActivePhotoIndexProvider f56673c;
    @Inject
    @NotNull
    /* renamed from: d */
    public C15453a f56674d;
    /* renamed from: f */
    private C15459f f56675f;
    /* renamed from: g */
    private int f56676g;
    /* renamed from: h */
    private int f56677h;
    /* renamed from: i */
    private final C15448a f56678i = new C15448a(this);
    @NotNull
    @BindView(2131363422)
    public ImageView imageView;
    /* renamed from: j */
    private float f56679j;
    @Nullable
    /* renamed from: k */
    private Function0<C15813i> f56680k;
    /* renamed from: l */
    private Integer f56681l;
    /* renamed from: m */
    private GradientDrawable f56682m;
    /* renamed from: n */
    private HashMap f56683n;
    @NotNull
    @BindView(2131363423)
    public ParallaxFrameLayout parallaxFrameLayout;
    @NotNull
    @BindView(2131363406)
    public ViewGroup userInfoViewContainer;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/tinder/views/grid/GridUserRecCardView$AlphaAnimator;", "", "(Lcom/tinder/views/grid/GridUserRecCardView;)V", "alphaAnimator", "Landroid/animation/Animator;", "viewsToAnimate", "", "Landroid/view/View;", "getViewsToAnimate", "()Ljava/util/List;", "viewsToAnimate$delegate", "Lkotlin/Lazy;", "cancel", "", "start", "endAlpha", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.views.grid.GridUserRecCardView$a */
    private final class C15448a {
        /* renamed from: a */
        static final /* synthetic */ KProperty[] f47865a = new KProperty[]{C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(C15448a.class), "viewsToAnimate", "getViewsToAnimate()Ljava/util/List;"))};
        /* renamed from: b */
        final /* synthetic */ GridUserRecCardView f47866b;
        /* renamed from: c */
        private Animator f47867c;
        /* renamed from: d */
        private final Lazy f47868d = C15810e.m59833a((Function0) new GridUserRecCardView$AlphaAnimator$viewsToAnimate$2(this));

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 10})
        /* renamed from: com.tinder.views.grid.GridUserRecCardView$a$a */
        static final class C15446a implements AnimatorUpdateListener {
            /* renamed from: a */
            final /* synthetic */ C15448a f47861a;
            /* renamed from: b */
            final /* synthetic */ ValueAnimator f47862b;

            C15446a(C15448a c15448a, ValueAnimator valueAnimator) {
                this.f47861a = c15448a;
                this.f47862b = valueAnimator;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                valueAnimator = this.f47862b;
                C2668g.a(valueAnimator, "animator");
                valueAnimator = valueAnimator.getAnimatedFraction();
                for (View alpha : this.f47861a.m57939b()) {
                    alpha.setAlpha(valueAnimator);
                }
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"com/tinder/views/grid/GridUserRecCardView$AlphaAnimator$start$2", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/tinder/views/grid/GridUserRecCardView$AlphaAnimator;)V", "previousLayerType", "", "", "getPreviousLayerType", "()Ljava/util/List;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "onAnimationStart", "Tinder_release"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.views.grid.GridUserRecCardView$a$b */
        public static final class C15447b extends AnimatorListenerAdapter {
            /* renamed from: a */
            final /* synthetic */ C15448a f47863a;
            @NotNull
            /* renamed from: b */
            private final List<Integer> f47864b;

            C15447b(C15448a c15448a) {
                this.f47863a = c15448a;
                Iterable<View> a = c15448a.m57939b();
                Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) a, 10));
                for (View layerType : a) {
                    arrayList.add(Integer.valueOf(layerType.getLayerType()));
                }
                this.f47864b = (List) arrayList;
            }

            public void onAnimationStart(@Nullable Animator animator) {
                for (View layerType : this.f47863a.m57939b()) {
                    layerType.setLayerType(2, null);
                }
            }

            public void onAnimationEnd(@NotNull Animator animator) {
                C2668g.b(animator, "animation");
                Iterable<Pair> c = C19299w.m68815c((Iterable) this.f47863a.m57939b(), (Iterable) this.f47864b);
                Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) c, 10));
                for (Pair pair : c) {
                    ((View) pair.m59805c()).setLayerType(((Number) pair.m59806d()).intValue(), null);
                    arrayList.add(C15813i.f49016a);
                }
                List list = (List) arrayList;
                this.f47863a.f47867c = (Animator) null;
            }
        }

        /* renamed from: b */
        private final List<View> m57939b() {
            Lazy lazy = this.f47868d;
            KProperty kProperty = f47865a[0];
            return (List) lazy.getValue();
        }

        public C15448a(GridUserRecCardView gridUserRecCardView) {
            this.f47866b = gridUserRecCardView;
        }

        /* renamed from: a */
        public final void m57941a(float f) {
            m57940a();
            f = ValueAnimator.ofFloat(new float[]{this.f47866b.getAlpha(), f});
            f.addUpdateListener(new C15446a(this, f));
            f.addListener(new C15447b(this));
            f.start();
            this.f47867c = (Animator) f;
        }

        /* renamed from: a */
        public final void m57940a() {
            Animator animator = this.f47867c;
            if (animator != null) {
                animator.cancel();
            }
            this.f47867c = (Animator) null;
            for (View alpha : m57939b()) {
                alpha.setAlpha(1.0f);
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/tinder/views/grid/GridUserRecCardView$Companion;", "", "()V", "ASPECT_RATIO", "", "GRADIENT_HEIGHT_FRACTION", "", "MAX_PHOTO_COUNT", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.views.grid.GridUserRecCardView$b */
    public static final class C15449b {
        private C15449b() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.views.grid.GridUserRecCardView$c */
    static final class C15450c implements Runnable {
        /* renamed from: a */
        final /* synthetic */ GridUserRecCardView f47869a;
        /* renamed from: b */
        final /* synthetic */ int f47870b;
        /* renamed from: c */
        final /* synthetic */ int f47871c;
        /* renamed from: d */
        final /* synthetic */ int f47872d;

        C15450c(GridUserRecCardView gridUserRecCardView, int i, int i2, int i3) {
            this.f47869a = gridUserRecCardView;
            this.f47870b = i;
            this.f47871c = i2;
            this.f47872d = i3;
        }

        public final void run() {
            this.f47869a.m66288a(this.f47870b, this.f47869a.f56676g);
            if (this.f47871c == 0 || this.f47872d == 0) {
                this.f47869a.m66290b();
            }
        }
    }

    public void _$_clearFindViewByIdCache() {
        if (this.f56683n != null) {
            this.f56683n.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.f56683n == null) {
            this.f56683n = new HashMap();
        }
        View view = (View) this.f56683n.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f56683n.put(Integer.valueOf(i), view);
        return view;
    }

    /* renamed from: a */
    public abstract void mo13980a(@NotNull UserRecCard userRecCard);

    /* renamed from: c */
    public void m66299c(@NotNull UserRecCard userRecCard) {
        C2668g.b(userRecCard, "userRecCard");
    }

    public GridUserRecCardView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        if (attributeSet != null) {
            context = context.getTheme().obtainStyledAttributes(attributeSet, C6249b.GridUserRecCardView, 0, 0);
            try {
                this.f56679j = context.getFloat(0, 1.44f);
            } finally {
                context.recycle();
            }
        } else {
            this.f56679j = 1.44f;
        }
    }

    public /* synthetic */ void bind(C8395a c8395a) {
        m66298b((UserRecCard) c8395a);
    }

    public /* synthetic */ void bind(Object obj) {
        m66298b((UserRecCard) obj);
    }

    public /* synthetic */ void onMovedToTop(C8395a c8395a) {
        m66299c((UserRecCard) c8395a);
    }

    public /* synthetic */ void onMovedToTop(Object obj) {
        m66299c((UserRecCard) obj);
    }

    @NotNull
    public final ImageView getBottomGradientView$Tinder_release() {
        ImageView imageView = this.bottomGradientView;
        if (imageView == null) {
            C2668g.b("bottomGradientView");
        }
        return imageView;
    }

    public final void setBottomGradientView$Tinder_release(@NotNull ImageView imageView) {
        C2668g.b(imageView, "<set-?>");
        this.bottomGradientView = imageView;
    }

    @NotNull
    public final ParallaxFrameLayout getParallaxFrameLayout$Tinder_release() {
        ParallaxFrameLayout parallaxFrameLayout = this.parallaxFrameLayout;
        if (parallaxFrameLayout == null) {
            C2668g.b("parallaxFrameLayout");
        }
        return parallaxFrameLayout;
    }

    public final void setParallaxFrameLayout$Tinder_release(@NotNull ParallaxFrameLayout parallaxFrameLayout) {
        C2668g.b(parallaxFrameLayout, "<set-?>");
        this.parallaxFrameLayout = parallaxFrameLayout;
    }

    @NotNull
    public final ImageView getImageView$Tinder_release() {
        ImageView imageView = this.imageView;
        if (imageView == null) {
            C2668g.b("imageView");
        }
        return imageView;
    }

    public final void setImageView$Tinder_release(@NotNull ImageView imageView) {
        C2668g.b(imageView, "<set-?>");
        this.imageView = imageView;
    }

    @NotNull
    public final ViewGroup getUserInfoViewContainer$Tinder_release() {
        ViewGroup viewGroup = this.userInfoViewContainer;
        if (viewGroup == null) {
            C2668g.b("userInfoViewContainer");
        }
        return viewGroup;
    }

    public final void setUserInfoViewContainer$Tinder_release(@NotNull ViewGroup viewGroup) {
        C2668g.b(viewGroup, "<set-?>");
        this.userInfoViewContainer = viewGroup;
    }

    @NotNull
    public final UserRecActivePhotoIndexProvider getActivePhotoIndexProvider$Tinder_release() {
        UserRecActivePhotoIndexProvider userRecActivePhotoIndexProvider = this.f56673c;
        if (userRecActivePhotoIndexProvider == null) {
            C2668g.b("activePhotoIndexProvider");
        }
        return userRecActivePhotoIndexProvider;
    }

    public final void setActivePhotoIndexProvider$Tinder_release(@NotNull UserRecActivePhotoIndexProvider userRecActivePhotoIndexProvider) {
        C2668g.b(userRecActivePhotoIndexProvider, "<set-?>");
        this.f56673c = userRecActivePhotoIndexProvider;
    }

    @NotNull
    public final C15453a getUserRecPhotoAlbumProvider$Tinder_release() {
        C15453a c15453a = this.f56674d;
        if (c15453a == null) {
            C2668g.b("userRecPhotoAlbumProvider");
        }
        return c15453a;
    }

    public final void setUserRecPhotoAlbumProvider$Tinder_release(@NotNull C15453a c15453a) {
        C2668g.b(c15453a, "<set-?>");
        this.f56674d = c15453a;
    }

    private final void setUserRecCard(UserRecCard userRecCard) {
        this.f56671a = userRecCard;
    }

    @NotNull
    public final UserRecCard getUserRecCard() {
        UserRecCard userRecCard = this.f56671a;
        if (userRecCard == null) {
            C2668g.b("userRecCard");
        }
        return userRecCard;
    }

    protected boolean getShouldShowBottomGradient() {
        return this.f56672b;
    }

    public final float getAspectRatio() {
        return this.f56679j;
    }

    public final void setAspectRatio(float f) {
        this.f56679j = f;
    }

    @Nullable
    public final Function0<C15813i> getVerticalTranslationListener() {
        return this.f56680k;
    }

    public final void setVerticalTranslationListener(@Nullable Function0<C15813i> function0) {
        this.f56680k = function0;
    }

    public void setTranslationY(float f) {
        super.setTranslationY(f);
        f = this.f56680k;
        if (f != null) {
            C15813i c15813i = (C15813i) f.invoke();
        }
    }

    protected void onFinishInflate() {
        ButterKnife.a(this);
        super.onFinishInflate();
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f56678i.m57940a();
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f56676g = i2 / 4;
        this.f56677h = i;
        i2 = getContext();
        UserRecCard userRecCard = this.f56671a;
        if (userRecCard == null) {
            C2668g.b("userRecCard");
        }
        this.f56681l = Integer.valueOf(C0432b.c(i2, userRecCard.gradientColor()));
        Orientation orientation = Orientation.BOTTOM_TOP;
        int[] iArr = new int[2];
        Integer num = this.f56681l;
        if (num == null) {
            C2668g.a();
        }
        iArr[0] = num.intValue();
        iArr[1] = 0;
        this.f56682m = new GradientDrawable(orientation, iArr);
        post((Runnable) new C15450c(this, i, i3, i4));
    }

    /* renamed from: b */
    public void m66298b(@NotNull UserRecCard userRecCard) {
        C2668g.b(userRecCard, "userRecCard");
        this.f56678i.m57940a();
        super.bind(userRecCard);
        this.f56671a = userRecCard;
        mo13980a(userRecCard);
        m66288a(this.f56677h, this.f56676g);
        m66290b();
        userRecCard = cardStampsDecoration();
        if (userRecCard != null) {
            userRecCard.setShowSuperlikeStamp(false);
        }
    }

    protected void onMeasure(int i, int i2) {
        i = MeasureSpec.getSize(i);
        super.onMeasure(MeasureSpec.makeMeasureSpec(i, 1073741824), MeasureSpec.makeMeasureSpec((int) (((float) i) * this.f56679j), 1073741824));
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f56678i.m57941a(z ? true : false);
    }

    /* renamed from: a */
    public final void m66294a(int i) {
        C15459f c15459f = this.f56675f;
        if (c15459f == null) {
            C2668g.b("userRecPhotoAlbum");
        }
        if (!c15459f.m57954a().isEmpty()) {
            c15459f = this.f56675f;
            if (c15459f == null) {
                C2668g.b("userRecPhotoAlbum");
            }
            if (i < c15459f.m57954a().size()) {
                c15459f = this.f56675f;
                if (c15459f == null) {
                    C2668g.b("userRecPhotoAlbum");
                }
                mo13981a((C15458a) c15459f.m57954a().get(i));
            }
        }
    }

    /* renamed from: a */
    public void mo13981a(@NotNull C15458a c15458a) {
        C2668g.b(c15458a, ManagerWebServices.PARAM_PHOTO);
        c15458a = m66292a(c15458a.m57952a()).d().e().a(m66297b(c15458a.m57953b()).d().e());
        ImageView imageView = this.imageView;
        if (imageView == null) {
            C2668g.b("imageView");
        }
        c15458a.a(imageView);
    }

    @NotNull
    /* renamed from: a */
    public final C3018c<String> m66292a(@NotNull String str) {
        C2668g.b(str, "photoUrl");
        str = C0994i.b(getContext()).a(str).a(DiskCacheStrategy.ALL).a(R.color.light_grey1);
        C2668g.a(str, "Glide.with(context)\n    …lder(R.color.light_grey1)");
        return str;
    }

    @NotNull
    /* renamed from: b */
    public final C3018c<String> m66297b(@NotNull String str) {
        C2668g.b(str, "thumbnailUrl");
        str = C0994i.b(getContext()).a(str).a();
        C2668g.a(str, "Glide.with(context)\n    …            .centerCrop()");
        return str;
    }

    @NotNull
    public final ParallaxFrameLayout getParallaxFrameLayout() {
        ParallaxFrameLayout parallaxFrameLayout = this.parallaxFrameLayout;
        if (parallaxFrameLayout == null) {
            C2668g.b("parallaxFrameLayout");
        }
        return parallaxFrameLayout;
    }

    /* renamed from: a */
    public final void m66293a() {
        ImageView imageView = this.imageView;
        if (imageView == null) {
            C2668g.b("imageView");
        }
        C0994i.a(imageView);
    }

    /* renamed from: a */
    private final void m66288a(int i, int i2) {
        if (i != 0) {
            if (i2 != 0) {
                if (getShouldShowBottomGradient()) {
                    ImageView imageView = this.bottomGradientView;
                    if (imageView == null) {
                        C2668g.b("bottomGradientView");
                    }
                    LayoutParams layoutParams = imageView.getLayoutParams();
                    layoutParams.width = i;
                    layoutParams.height = i2;
                    i = this.bottomGradientView;
                    if (i == 0) {
                        C2668g.b("bottomGradientView");
                    }
                    i.setLayoutParams(layoutParams);
                    i = this.f56682m;
                    if (i != 0) {
                        i.setGradientType(0);
                    }
                    i = this.f56682m;
                    if (i != 0) {
                        i.setUseLevel(true);
                    }
                    i = this.bottomGradientView;
                    if (i == 0) {
                        C2668g.b("bottomGradientView");
                    }
                    i.setImageDrawable(this.f56682m);
                    i = this.bottomGradientView;
                    if (i == 0) {
                        C2668g.b("bottomGradientView");
                    }
                    i.setVisibility(0);
                } else {
                    i = this.bottomGradientView;
                    if (i == 0) {
                        C2668g.b("bottomGradientView");
                    }
                    i.setVisibility(8);
                }
            }
        }
    }

    /* renamed from: b */
    private final void m66290b() {
        C15453a c15453a = this.f56674d;
        if (c15453a == null) {
            C2668g.b("userRecPhotoAlbumProvider");
        }
        UserRecCard userRecCard = this.f56671a;
        if (userRecCard == null) {
            C2668g.b("userRecCard");
        }
        this.f56675f = c15453a.m57943a(userRecCard, getWidth(), getHeight());
        m66294a(getDisplayedPhotoIndex());
    }

    public final int getDisplayedPhotoIndex() {
        UserRecActivePhotoIndexProvider userRecActivePhotoIndexProvider = this.f56673c;
        if (userRecActivePhotoIndexProvider == null) {
            C2668g.b("activePhotoIndexProvider");
        }
        UserRecCard userRecCard = this.f56671a;
        if (userRecCard == null) {
            C2668g.b("userRecCard");
        }
        return userRecActivePhotoIndexProvider.getActivePhotoIndex(userRecCard.userRec().getId());
    }

    @NotNull
    public final String getDisplayedPhotoUrl() {
        int displayedPhotoIndex = getDisplayedPhotoIndex();
        C15459f c15459f = this.f56675f;
        if (c15459f == null) {
            C2668g.b("userRecPhotoAlbum");
        }
        if (!c15459f.m57954a().isEmpty()) {
            c15459f = this.f56675f;
            if (c15459f == null) {
                C2668g.b("userRecPhotoAlbum");
            }
            if (displayedPhotoIndex < c15459f.m57954a().size()) {
                C15459f c15459f2 = this.f56675f;
                if (c15459f2 == null) {
                    C2668g.b("userRecPhotoAlbum");
                }
                return ((C15458a) c15459f2.m57954a().get(getDisplayedPhotoIndex())).m57952a();
            }
        }
        return "";
    }

    public final int getPhotoCount() {
        UserRecCard userRecCard = this.f56671a;
        if (userRecCard == null) {
            C2668g.b("userRecCard");
        }
        return Math.min(userRecCard.userRec().getUser().photos().size(), 6);
    }
}
