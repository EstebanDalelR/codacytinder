package com.tinder.fastmatch.preview;

import android.graphics.Bitmap;
import android.support.v4.util.C0551g;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0005R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/fastmatch/preview/FastMatchPreviewImageCache;", "", "()V", "images", "Landroid/support/v4/util/LruCache;", "", "Landroid/graphics/Bitmap;", "addImage", "", "key", "bitmap", "getImage", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.fastmatch.preview.e */
public final class C9404e {
    /* renamed from: a */
    public static final C9403a f31531a = new C9403a();
    /* renamed from: b */
    private final C0551g<String, Bitmap> f31532b = new C0551g(2);

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tinder/fastmatch/preview/FastMatchPreviewImageCache$Companion;", "", "()V", "CACHE_SIZE", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.preview.e$a */
    public static final class C9403a {
        private C9403a() {
        }
    }

    /* renamed from: a */
    public final void m39353a(@NotNull String str, @NotNull Bitmap bitmap) {
        C2668g.b(str, "key");
        C2668g.b(bitmap, "bitmap");
        this.f31532b.put(str, bitmap);
    }
}
