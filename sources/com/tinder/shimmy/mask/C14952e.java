package com.tinder.shimmy.mask;

import android.graphics.Bitmap;
import com.tinder.api.ManagerWebServices;
import com.tinder.shimmy.p411a.C14945d;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u000f\u001a\u00020\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/tinder/shimmy/mask/MutableAlphaMask;", "", "size", "Lcom/tinder/shimmy/utils/Size;", "bitmap", "Landroid/graphics/Bitmap;", "(Lcom/tinder/shimmy/utils/Size;Landroid/graphics/Bitmap;)V", "getBitmap", "()Landroid/graphics/Bitmap;", "setBitmap", "(Landroid/graphics/Bitmap;)V", "getSize", "()Lcom/tinder/shimmy/utils/Size;", "setSize", "(Lcom/tinder/shimmy/utils/Size;)V", "immutableCopy", "Lcom/tinder/shimmy/mask/AlphaMask;", "shimmy_release"}, k = 1, mv = {1, 1, 9})
/* renamed from: com.tinder.shimmy.mask.e */
public final class C14952e {
    @NotNull
    /* renamed from: a */
    private C14945d f46686a;
    @Nullable
    /* renamed from: b */
    private Bitmap f46687b;

    public C14952e() {
        this(null, null, 3, null);
    }

    public C14952e(@NotNull C14945d c14945d, @Nullable Bitmap bitmap) {
        C2668g.b(c14945d, ManagerWebServices.PARAM_SIZE);
        this.f46686a = c14945d;
        this.f46687b = bitmap;
    }

    public /* synthetic */ C14952e(C14945d c14945d, Bitmap bitmap, int i, C15823e c15823e) {
        if ((i & 1) != null) {
            c14945d = C14945d.f46667a.m56450a();
        }
        if ((i & 2) != 0) {
            bitmap = null;
        }
        this(c14945d, bitmap);
    }

    /* renamed from: a */
    public final void m56477a(@Nullable Bitmap bitmap) {
        this.f46687b = bitmap;
    }

    /* renamed from: a */
    public final void m56478a(@NotNull C14945d c14945d) {
        C2668g.b(c14945d, "<set-?>");
        this.f46686a = c14945d;
    }

    @NotNull
    /* renamed from: b */
    public final C14945d m56479b() {
        return this.f46686a;
    }

    @Nullable
    /* renamed from: c */
    public final Bitmap m56480c() {
        return this.f46687b;
    }

    @NotNull
    /* renamed from: a */
    public final C14949a m56476a() {
        return new C14949a(this.f46686a, this.f46687b);
    }
}
