package com.tinder.common.activity;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.LayoutRes;
import android.support.v4.content.C0432b;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bumptech.glide.C0994i;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.tinder.C6250b.C6248a;
import com.tinder.R;
import com.tinder.profile.p365d.C14398a;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\b\u0010\u0017\u001a\u00020\u0015H\u0002J\b\u0010\u0018\u001a\u00020\u0015H\u0016J\u0012\u0010\u0019\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\b\u0010\u001c\u001a\u00020\u0015H\u0002J\b\u0010\u001d\u001a\u00020\u0015H\u0002J\b\u0010\u001e\u001a\u00020\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/tinder/common/activity/FullscreenImageActivity;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "accelerateDecelerateInterpolator", "Landroid/view/animation/AccelerateDecelerateInterpolator;", "errorViewLayoutResId", "", "imageUrl", "", "isTransitionAnimationEnabled", "", "sourceViewHeight", "", "sourceViewLeftAndTop", "Landroid/graphics/Point;", "sourceViewWidth", "transitionDeltaX", "transitionDeltaY", "transitionScaleX", "transitionScaleY", "applyViewTransitionStartValues", "", "fadeInBackgroundColor", "loadFullscreenImage", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onImageResourceReady", "startTransitionEnterAnimation", "startTransitionExitAnimation", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class FullscreenImageActivity extends AppCompatActivity {
    /* renamed from: a */
    public static final C8519a f45349a = new C8519a();
    /* renamed from: b */
    private String f45350b;
    /* renamed from: c */
    private final AccelerateDecelerateInterpolator f45351c = new AccelerateDecelerateInterpolator();
    /* renamed from: d */
    private Point f45352d = new Point();
    /* renamed from: e */
    private float f45353e;
    /* renamed from: f */
    private float f45354f;
    /* renamed from: g */
    private float f45355g = 1.0f;
    /* renamed from: h */
    private float f45356h = 1.0f;
    /* renamed from: i */
    private float f45357i;
    /* renamed from: j */
    private float f45358j;
    /* renamed from: k */
    private boolean f45359k;
    @LayoutRes
    /* renamed from: l */
    private int f45360l = -1;
    /* renamed from: m */
    private HashMap f45361m;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J:\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0018\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/tinder/common/activity/FullscreenImageActivity$Companion;", "", "()V", "EXTRA_ERROR_VIEW_LAYOUT_RES_ID", "", "EXTRA_IMAGE_HIGH_RES_URL", "EXTRA_SOURCE_VIEW_HEIGHT", "EXTRA_SOURCE_VIEW_LEFT_AND_TOP", "EXTRA_SOURCE_VIEW_WIDTH", "createIntentAndStartActivity", "", "activityContext", "Landroid/content/Context;", "errorViewLayoutRes", "", "imageUrl", "sourceImageViewWidth", "", "sourceImageViewHeight", "sourceImageViewLeftAndTop", "Landroid/graphics/Point;", "startActivity", "intent", "Landroid/content/Intent;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.common.activity.FullscreenImageActivity$a */
    public static final class C8519a {
        private C8519a() {
        }

        @JvmStatic
        /* renamed from: a */
        public final void m36479a(@NotNull Context context, @LayoutRes int i, @NotNull String str, float f, float f2, @NotNull Point point) {
            C2668g.b(context, "activityContext");
            C2668g.b(str, "imageUrl");
            C2668g.b(point, "sourceImageViewLeftAndTop");
            Intent intent = new Intent(context, FullscreenImageActivity.class);
            intent.putExtra("image_high_res_url", str);
            intent.putExtra("source_view_width", f);
            intent.putExtra("source_view_height", f2);
            intent.putExtra("error_view_layout_res_id", i);
            intent.putExtra("source_view_left_and_top", point);
            m36478a(context, intent);
        }

        /* renamed from: a */
        private final void m36478a(Context context, Intent intent) {
            context = C14398a.a(context);
            if (context == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
            }
            Activity activity = (Activity) context;
            activity.startActivity(intent);
            activity.overridePendingTransition(0, 0);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.common.activity.FullscreenImageActivity$c */
    static final class C8520c implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ FullscreenImageActivity f30265a;

        C8520c(FullscreenImageActivity fullscreenImageActivity) {
            this.f30265a = fullscreenImageActivity;
        }

        public final void onClick(View view) {
            if (this.f30265a.f45359k != null) {
                ((FrameLayout) this.f30265a.m54472a(C6248a.fullScreenImageContainer)).setOnClickListener(null);
                this.f30265a.m54468e();
                return;
            }
            this.f30265a.finish();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"com/tinder/common/activity/FullscreenImageActivity$onImageResourceReady$1", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "(Lcom/tinder/common/activity/FullscreenImageActivity;)V", "onPreDraw", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.common.activity.FullscreenImageActivity$d */
    public static final class C8521d implements OnPreDrawListener {
        /* renamed from: a */
        final /* synthetic */ FullscreenImageActivity f30266a;

        C8521d(FullscreenImageActivity fullscreenImageActivity) {
            this.f30266a = fullscreenImageActivity;
        }

        public boolean onPreDraw() {
            ImageView imageView = (ImageView) this.f30266a.m54472a(C6248a.fullscreenImage);
            C2668g.a(imageView, "fullscreenImage");
            imageView.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f30266a.m54470f();
            this.f30266a.m54464c();
            return true;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.common.activity.FullscreenImageActivity$e */
    static final class C8522e implements Runnable {
        /* renamed from: a */
        final /* synthetic */ FullscreenImageActivity f30267a;

        C8522e(FullscreenImageActivity fullscreenImageActivity) {
            this.f30267a = fullscreenImageActivity;
        }

        public final void run() {
            ImageView imageView = (ImageView) this.f30267a.m54472a(C6248a.fullscreenImage);
            C2668g.a(imageView, "fullscreenImage");
            imageView.setVisibility(0);
            this.f30267a.m54466d();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.common.activity.FullscreenImageActivity$f */
    static final class C8523f implements Runnable {
        /* renamed from: a */
        final /* synthetic */ FullscreenImageActivity f30268a;

        C8523f(FullscreenImageActivity fullscreenImageActivity) {
            this.f30268a = fullscreenImageActivity;
        }

        public final void run() {
            this.f30268a.finish();
            this.f30268a.overridePendingTransition(0, 0);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J:\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u0006H\u0016J<\u0010\u000e\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016¨\u0006\u0011"}, d2 = {"com/tinder/common/activity/FullscreenImageActivity$loadFullscreenImage$1", "Lcom/bumptech/glide/request/RequestListener;", "", "Landroid/graphics/Bitmap;", "(Lcom/tinder/common/activity/FullscreenImageActivity;)V", "onException", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "model", "target", "Lcom/bumptech/glide/request/target/Target;", "isFirstResource", "onResourceReady", "resource", "isFromMemoryCache", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.common.activity.FullscreenImageActivity$b */
    public static final class C10655b implements RequestListener<String, Bitmap> {
        /* renamed from: a */
        final /* synthetic */ FullscreenImageActivity f34946a;

        C10655b(FullscreenImageActivity fullscreenImageActivity) {
            this.f34946a = fullscreenImageActivity;
        }

        public /* synthetic */ boolean onException(Exception exception, Object obj, Target target, boolean z) {
            return m42970a(exception, (String) obj, target, z);
        }

        public /* synthetic */ boolean onResourceReady(Object obj, Object obj2, Target target, boolean z, boolean z2) {
            return m42969a((Bitmap) obj, (String) obj2, target, z, z2);
        }

        /* renamed from: a */
        public boolean m42970a(@Nullable Exception exception, @Nullable String str, @Nullable Target<Bitmap> target, boolean z) {
            ((FrameLayout) this.f34946a.m54472a(C6248a.fullScreenImageContainer)).setBackgroundColor(C0432b.c((Context) this.f34946a, R.color.black));
            FrameLayout frameLayout = (FrameLayout) this.f34946a.m54472a(C6248a.fullscreenImageErrorViewContainer);
            C2668g.a(frameLayout, "fullscreenImageErrorViewContainer");
            frameLayout.setVisibility(0);
            return false;
        }

        /* renamed from: a */
        public boolean m42969a(@Nullable Bitmap bitmap, @Nullable String str, @Nullable Target<Bitmap> target, boolean z, boolean z2) {
            if (this.f34946a.f45359k != null) {
                this.f34946a.m54462b();
            } else {
                ImageView imageView = (ImageView) this.f34946a.m54472a(C6248a.fullscreenImage);
                C2668g.a(imageView, "fullscreenImage");
                imageView.setVisibility(0);
                this.f34946a.m54466d();
            }
            return false;
        }
    }

    /* renamed from: a */
    public View m54472a(int i) {
        if (this.f45361m == null) {
            this.f45361m = new HashMap();
        }
        View view = (View) this.f45361m.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f45361m.put(Integer.valueOf(i), view);
        return view;
    }

    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_fullscreen_image);
        bundle = getIntent();
        this.f45350b = bundle.getStringExtra("image_high_res_url");
        Parcelable parcelableExtra = bundle.getParcelableExtra("source_view_left_and_top");
        C2668g.a(parcelableExtra, "getParcelableExtra(EXTRA_SOURCE_VIEW_LEFT_AND_TOP)");
        this.f45352d = (Point) parcelableExtra;
        this.f45353e = bundle.getFloatExtra("source_view_width", 0.0f);
        this.f45354f = bundle.getFloatExtra("source_view_height", 0.0f);
        this.f45360l = bundle.getIntExtra("error_view_layout_res_id", -1);
        bundle = (this.f45352d.x == null || this.f45352d.y == null || this.f45353e == null || this.f45354f == null) ? null : true;
        this.f45359k = bundle;
        if (this.f45360l > null) {
            ((FrameLayout) m54472a(C6248a.fullscreenImageErrorViewContainer)).addView(LayoutInflater.from(this).inflate(this.f45360l, (FrameLayout) m54472a(C6248a.fullscreenImageErrorViewContainer), false));
        }
        ((FrameLayout) m54472a(C6248a.fullScreenImageContainer)).setOnClickListener(new C8520c(this));
        m54460a();
    }

    public void onBackPressed() {
        if (this.f45359k) {
            m54468e();
        } else {
            super.onBackPressed();
        }
    }

    /* renamed from: a */
    private final void m54460a() {
        C0994i.a(this).a(this.f45350b).l().a(DiskCacheStrategy.ALL).c().a(new C10655b(this)).a((ImageView) m54472a(C6248a.fullscreenImage));
    }

    /* renamed from: b */
    private final void m54462b() {
        ImageView imageView = (ImageView) m54472a(C6248a.fullscreenImage);
        C2668g.a(imageView, "fullscreenImage");
        imageView.getViewTreeObserver().addOnPreDrawListener(new C8521d(this));
    }

    /* renamed from: c */
    private final void m54464c() {
        ((ImageView) m54472a(C6248a.fullscreenImage)).animate().setDuration(200).setInterpolator(this.f45351c).scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).withStartAction(new C8522e(this)).start();
    }

    /* renamed from: d */
    private final void m54466d() {
        ObjectAnimator.ofObject((FrameLayout) m54472a(C6248a.fullScreenImageContainer), "backgroundColor", new ArgbEvaluator(), new Object[]{Integer.valueOf(0), Integer.valueOf(-16777216)}).setDuration(200).start();
    }

    /* renamed from: e */
    private final void m54468e() {
        ((ImageView) m54472a(C6248a.fullscreenImage)).animate().setDuration(200).setInterpolator(this.f45351c).scaleX(this.f45355g).scaleY(this.f45356h).translationX(this.f45357i).translationY(this.f45358j).withEndAction(new C8523f(this)).start();
    }

    /* renamed from: f */
    private final void m54470f() {
        ImageView imageView = (ImageView) m54472a(C6248a.fullscreenImage);
        C2668g.a(imageView, "fullscreenImage");
        float width = (float) imageView.getWidth();
        ImageView imageView2 = (ImageView) m54472a(C6248a.fullscreenImage);
        C2668g.a(imageView2, "fullscreenImage");
        float height = (float) imageView2.getHeight();
        float f = (float) null;
        if (width > f && height > f) {
            this.f45355g = this.f45353e / width;
            this.f45356h = this.f45354f / height;
        }
        imageView = (ImageView) m54472a(C6248a.fullscreenImage);
        C2668g.a(imageView, "fullscreenImage");
        imageView.setScaleX(this.f45355g);
        imageView = (ImageView) m54472a(C6248a.fullscreenImage);
        C2668g.a(imageView, "fullscreenImage");
        imageView.setScaleY(this.f45356h);
        int[] iArr = new int[2];
        ((ImageView) m54472a(C6248a.fullscreenImage)).getLocationOnScreen(iArr);
        this.f45357i = (float) (this.f45352d.x - iArr[0]);
        this.f45358j = (float) (this.f45352d.y - iArr[1]);
        imageView = (ImageView) m54472a(C6248a.fullscreenImage);
        C2668g.a(imageView, "fullscreenImage");
        imageView.setTranslationX(this.f45357i);
        imageView = (ImageView) m54472a(C6248a.fullscreenImage);
        C2668g.a(imageView, "fullscreenImage");
        imageView.setTranslationY(this.f45358j);
    }
}
