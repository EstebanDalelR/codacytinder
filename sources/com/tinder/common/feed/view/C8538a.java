package com.tinder.common.feed.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.annotation.DrawableRes;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bumptech.glide.C0994i;
import com.bumptech.glide.C3015a;
import com.bumptech.glide.load.C3021a;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.tinder.chat.view.model.C10636b;
import com.tinder.common.feed.interfaces.OnFeedMediaContentLoadedListener;
import com.tinder.video.view.AspectRatioAwareImageView;
import java.util.List;
import jp.wasabeef.glide.transformations.C17540a;
import jp.wasabeef.glide.transformations.RoundedCornersTransformation;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000j\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u001a\\\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0001\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010!H\u0002\u001aL\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020$0#2\b\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010'\u001a\u00020(2\u0006\u0010\u0015\u001a\u00020\n2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020$0#2\b\b\u0001\u0010\u001f\u001a\u00020\u001eH\u0002\u001a\u001a\u0010*\u001a\u0004\u0018\u00010&2\u0006\u0010'\u001a\u00020(2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002\u001a.\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020$0#2\b\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010'\u001a\u00020(2\u0006\u0010\u0016\u001a\u00020\nH\u0002\u001aF\u0010,\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020$0#2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010 \u001a\u0004\u0018\u00010!H\u0002\u001a.\u0010.\u001a\u00020\u0012*\u00020/2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0000\u001a\u00020\u00012\b\u0010 \u001a\u0004\u0018\u00010!H\u0000\"\u001a\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00028@X\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\" \u0010\u0005\u001a\u0004\u0018\u00010\u0002*\b\u0012\u0004\u0012\u00020\u00020\u00068@X\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u001e\u0010\t\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\u00020\u00068@X\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\" \u0010\r\u001a\u0004\u0018\u00010\u0002*\b\u0012\u0004\u0012\u00020\u00020\u00068@X\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\b\"\u001e\u0010\u000f\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\u00020\u00068@X\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\f¨\u00060"}, d2 = {"aspectRatio", "", "Lcom/tinder/chat/view/model/ActivityFeedImageViewModel;", "getAspectRatio", "(Lcom/tinder/chat/view/model/ActivityFeedImageViewModel;)F", "highResImage", "", "getHighResImage", "(Ljava/util/List;)Lcom/tinder/chat/view/model/ActivityFeedImageViewModel;", "highResImageUrlOrEmpty", "", "getHighResImageUrlOrEmpty", "(Ljava/util/List;)Ljava/lang/String;", "lowResImage", "getLowResImage", "lowResImageUrlOrEmpty", "getLowResImageUrlOrEmpty", "bindFeedItemImage", "", "imageView", "Lcom/tinder/video/view/AspectRatioAwareImageView;", "highResImageUrl", "thumbnailUrl", "progressLoaderView", "Landroid/widget/ProgressBar;", "loadingErrorStateTextView", "Landroid/widget/TextView;", "loadingErrorStateIcon", "Landroid/view/View;", "imageCornerRadius", "", "placeholderResourceId", "onFeedMediaContentLoadedListener", "Lcom/tinder/common/feed/interfaces/OnFeedMediaContentLoadedListener;", "getHighResImageRequest", "Lcom/bumptech/glide/BitmapRequestBuilder;", "Landroid/graphics/Bitmap;", "roundCorners", "Ljp/wasabeef/glide/transformations/RoundedCornersTransformation;", "context", "Landroid/content/Context;", "thumbnailRequest", "getRoundedCornersTransformation", "getThumbnailImageRequest", "setRequestListener", "highResImageRequest", "bindActivityFeedImageView", "Lcom/tinder/common/feed/view/FeedImageContentView;", "Tinder_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.common.feed.view.a */
public final class C8538a {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J4\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00022\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u0006H\u0016J<\u0010\r\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u00022\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016¨\u0006\u0010"}, d2 = {"com/tinder/common/feed/view/FeedViewImageBindingExtensionsKt$setRequestListener$1", "Lcom/bumptech/glide/request/RequestListener;", "", "Landroid/graphics/Bitmap;", "(Landroid/widget/ProgressBar;Lcom/tinder/common/feed/interfaces/OnFeedMediaContentLoadedListener;Landroid/widget/TextView;Landroid/view/View;Lcom/tinder/video/view/AspectRatioAwareImageView;)V", "onException", "", "e", "Ljava/lang/Exception;", "model", "target", "Lcom/bumptech/glide/request/target/Target;", "isFirstResource", "onResourceReady", "resource", "isFromMemoryCache", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.common.feed.view.a$a */
    public static final class C10670a implements RequestListener<String, Bitmap> {
        /* renamed from: a */
        final /* synthetic */ ProgressBar f35007a;
        /* renamed from: b */
        final /* synthetic */ OnFeedMediaContentLoadedListener f35008b;
        /* renamed from: c */
        final /* synthetic */ TextView f35009c;
        /* renamed from: d */
        final /* synthetic */ View f35010d;
        /* renamed from: e */
        final /* synthetic */ AspectRatioAwareImageView f35011e;

        C10670a(ProgressBar progressBar, OnFeedMediaContentLoadedListener onFeedMediaContentLoadedListener, TextView textView, View view, AspectRatioAwareImageView aspectRatioAwareImageView) {
            this.f35007a = progressBar;
            this.f35008b = onFeedMediaContentLoadedListener;
            this.f35009c = textView;
            this.f35010d = view;
            this.f35011e = aspectRatioAwareImageView;
        }

        public /* synthetic */ boolean onException(Exception exception, Object obj, Target target, boolean z) {
            return m43007a(exception, (String) obj, target, z);
        }

        public /* synthetic */ boolean onResourceReady(Object obj, Object obj2, Target target, boolean z, boolean z2) {
            return m43006a((Bitmap) obj, (String) obj2, target, z, z2);
        }

        /* renamed from: a */
        public boolean m43006a(@Nullable Bitmap bitmap, @Nullable String str, @Nullable Target<Bitmap> target, boolean z, boolean z2) {
            this.f35007a.setVisibility(8);
            bitmap = this.f35008b;
            if (bitmap != null) {
                bitmap.onContentLoaded();
            }
            return null;
        }

        /* renamed from: a */
        public boolean m43007a(@Nullable Exception exception, @Nullable String str, @Nullable Target<Bitmap> target, boolean z) {
            this.f35007a.setVisibility(8);
            this.f35009c.setVisibility(0);
            this.f35010d.setVisibility(0);
            C0994i.a((View) this.f35011e);
            exception = this.f35008b;
            if (exception != null) {
                if (str == null) {
                    str = "";
                }
                exception.onErrorLoadingContent(str);
            }
            return false;
        }
    }

    /* renamed from: a */
    public static final void m36516a(@NotNull FeedImageContentView feedImageContentView, @NotNull String str, @NotNull String str2, float f, @Nullable OnFeedMediaContentLoadedListener onFeedMediaContentLoadedListener) {
        C2668g.b(feedImageContentView, "$receiver");
        C2668g.b(str, "highResImageUrl");
        C2668g.b(str2, "thumbnailUrl");
        String str3 = str;
        String str4 = str2;
        float f2 = f;
        C8538a.m36518a(feedImageContentView.getFeedImageView$Tinder_release(), str3, str4, feedImageContentView.getFeedProgressLoaderView$Tinder_release(), f2, feedImageContentView.getLoadingErrorTextView$Tinder_release(), feedImageContentView.getLoadingErrorIconView$Tinder_release(), feedImageContentView.getImageCornerRadius$Tinder_release(), feedImageContentView.getPlaceholderResourceId$Tinder_release(), onFeedMediaContentLoadedListener);
    }

    /* renamed from: a */
    private static final void m36518a(AspectRatioAwareImageView aspectRatioAwareImageView, String str, String str2, ProgressBar progressBar, float f, TextView textView, View view, int i, @DrawableRes int i2, OnFeedMediaContentLoadedListener onFeedMediaContentLoadedListener) {
        progressBar.setVisibility(0);
        textView.setVisibility(8);
        view.setVisibility(8);
        aspectRatioAwareImageView.setAspectRatio(f);
        Context context = aspectRatioAwareImageView.getContext();
        C2668g.a(context, "context");
        RoundedCornersTransformation a = C8538a.m36515a(context, i);
        str = C8538a.m36513a(a, context, str, C8538a.m36512a(a, context, str2), i2);
        C8538a.m36517a(aspectRatioAwareImageView, str, progressBar, textView, view, onFeedMediaContentLoadedListener);
        str.a(aspectRatioAwareImageView);
    }

    /* renamed from: a */
    private static final RoundedCornersTransformation m36515a(Context context, int i) {
        return i > 0 ? new RoundedCornersTransformation(context, i, 0) : null;
    }

    /* renamed from: a */
    private static final C3015a<String, Bitmap> m36512a(RoundedCornersTransformation roundedCornersTransformation, Context context, String str) {
        Transformation c3021a;
        if (roundedCornersTransformation != null) {
            c3021a = new C3021a(new Transformation[]{roundedCornersTransformation, new C17540a(context)});
        } else {
            c3021a = new C17540a(context);
        }
        roundedCornersTransformation = C0994i.b(context).a(str).l().a(new Transformation[]{c3021a});
        C2668g.a(roundedCornersTransformation, "Glide\n            .with(…(thumbnailRequestOptions)");
        return roundedCornersTransformation;
    }

    /* renamed from: a */
    private static final C3015a<String, Bitmap> m36513a(RoundedCornersTransformation roundedCornersTransformation, Context context, String str, C3015a<String, Bitmap> c3015a, @DrawableRes int i) {
        context = C0994i.b(context).a(str).l().a(c3015a).a(i).b(i);
        if (roundedCornersTransformation != null) {
            context.a(new Transformation[]{roundedCornersTransformation});
        }
        C2668g.a(context, "request");
        return context;
    }

    /* renamed from: a */
    private static final void m36517a(AspectRatioAwareImageView aspectRatioAwareImageView, C3015a<String, Bitmap> c3015a, ProgressBar progressBar, TextView textView, View view, OnFeedMediaContentLoadedListener onFeedMediaContentLoadedListener) {
        c3015a.a(new C10670a(progressBar, onFeedMediaContentLoadedListener, textView, view, aspectRatioAwareImageView));
    }

    @Nullable
    /* renamed from: a */
    public static final C10636b m36514a(@NotNull List<C10636b> list) {
        C2668g.b(list, "$receiver");
        list = list.iterator();
        if (list.hasNext()) {
            Object next = list.next();
            int b = ((C10636b) next).m42937b();
            while (list.hasNext()) {
                Object next2 = list.next();
                int b2 = ((C10636b) next2).m42937b();
                if (b < b2) {
                    next = next2;
                    b = b2;
                }
            }
            list = next;
        } else {
            list = null;
        }
        return (C10636b) list;
    }

    @Nullable
    /* renamed from: b */
    public static final C10636b m36519b(@NotNull List<C10636b> list) {
        C2668g.b(list, "$receiver");
        list = list.iterator();
        if (list.hasNext()) {
            Object next = list.next();
            int b = ((C10636b) next).m42937b();
            while (list.hasNext()) {
                Object next2 = list.next();
                int b2 = ((C10636b) next2).m42937b();
                if (b > b2) {
                    next = next2;
                    b = b2;
                }
            }
            list = next;
        } else {
            list = null;
        }
        return (C10636b) list;
    }

    /* renamed from: a */
    public static final float m36511a(@Nullable C10636b c10636b) {
        if (c10636b != null) {
            if (c10636b.m42936a() >= 1) {
                return ((float) c10636b.m42937b()) / ((float) c10636b.m42936a());
            }
        }
        return 1.0f;
    }

    @NotNull
    /* renamed from: c */
    public static final String m36520c(@NotNull List<C10636b> list) {
        C2668g.b(list, "$receiver");
        list = C8538a.m36519b(list);
        list = list != null ? list.m42938c() : null;
        return list != null ? list : "";
    }

    @NotNull
    /* renamed from: d */
    public static final String m36521d(@NotNull List<C10636b> list) {
        C2668g.b(list, "$receiver");
        list = C8538a.m36514a((List) list);
        list = list != null ? list.m42938c() : null;
        return list != null ? list : "";
    }
}
