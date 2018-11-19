package com.tinder.video.p444a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.support.annotation.WorkerThread;
import android.view.TextureView;
import com.tinder.video.p447d.C15413a;
import io.reactivex.C3960g;
import io.reactivex.functions.Action;
import java.util.concurrent.Callable;
import java8.util.Optional;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0003\u001a\u0018\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0005*\u00020\u0006H\u0000¨\u0006\u0007"}, d2 = {"createCopyBitmap", "Ljava8/util/Optional;", "Landroid/graphics/Bitmap;", "currentFrameBitmap", "createCopyBitmapSingle", "Lio/reactivex/Single;", "Landroid/view/TextureView;", "video_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.video.a.d */
public final class C15406d {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava8/util/Optional;", "Landroid/graphics/Bitmap;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.video.a.d$a */
    static final class C15405a<V> implements Callable<T> {
        /* renamed from: a */
        final /* synthetic */ Bitmap f47675a;

        C15405a(Bitmap bitmap) {
            this.f47675a = bitmap;
        }

        public /* synthetic */ Object call() {
            return m57736a();
        }

        @NotNull
        /* renamed from: a */
        public final Optional<Bitmap> m57736a() {
            return C15406d.m57739b(this.f47675a);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.video.a.d$b */
    static final class C17242b implements Action {
        /* renamed from: a */
        final /* synthetic */ Bitmap f52853a;

        C17242b(Bitmap bitmap) {
            this.f52853a = bitmap;
        }

        public final void run() {
            this.f52853a.recycle();
        }
    }

    @NotNull
    /* renamed from: a */
    public static final C3960g<Optional<Bitmap>> m57737a(@NotNull TextureView textureView) {
        C2668g.b(textureView, "$receiver");
        textureView = textureView.getBitmap();
        if (textureView == null) {
            textureView = C3960g.a(Optional.m59119a());
            C2668g.a(textureView, "Single.just(Optional.empty())");
            return textureView;
        }
        textureView = C3960g.c(new C15405a(textureView)).c(new C17242b(textureView));
        C2668g.a(textureView, "Single.fromCallable {\n  …itmap.recycle()\n        }");
        return textureView;
    }

    @WorkerThread
    /* renamed from: b */
    private static final Optional<Bitmap> m57739b(Bitmap bitmap) {
        Config config = bitmap.getConfig();
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), config);
        Object obj = (bitmap.sameAs(createBitmap) || C15413a.m57793a(bitmap)) ? null : 1;
        createBitmap.recycle();
        if (obj != null) {
            bitmap = Optional.m59120a(bitmap.copy(config, true));
            C2668g.a(bitmap, "Optional.of(bitmapCopy)");
            return bitmap;
        }
        bitmap = Optional.m59119a();
        C2668g.a(bitmap, "Optional.empty()");
        return bitmap;
    }
}
