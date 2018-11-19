package com.tinder.shimmy.mask;

import android.graphics.Bitmap;
import com.tinder.api.ManagerWebServices;
import com.tinder.shimmy.p411a.C14945d;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/tinder/shimmy/mask/AlphaMask;", "", "size", "Lcom/tinder/shimmy/utils/Size;", "bitmap", "Landroid/graphics/Bitmap;", "(Lcom/tinder/shimmy/utils/Size;Landroid/graphics/Bitmap;)V", "getBitmap", "()Landroid/graphics/Bitmap;", "getSize", "()Lcom/tinder/shimmy/utils/Size;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "shimmy_release"}, k = 1, mv = {1, 1, 9})
/* renamed from: com.tinder.shimmy.mask.a */
public final class C14949a {
    @NotNull
    /* renamed from: a */
    private final C14945d f46679a;
    @Nullable
    /* renamed from: b */
    private final Bitmap f46680b;

    public C14949a() {
        this(null, null, 3, null);
    }

    @NotNull
    /* renamed from: a */
    public final C14945d m56464a() {
        return this.f46679a;
    }

    @Nullable
    /* renamed from: b */
    public final Bitmap m56465b() {
        return this.f46680b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C14949a) {
                C14949a c14949a = (C14949a) obj;
                if (C2668g.a(this.f46679a, c14949a.f46679a) && C2668g.a(this.f46680b, c14949a.f46680b)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C14945d c14945d = this.f46679a;
        int i = 0;
        int hashCode = (c14945d != null ? c14945d.hashCode() : 0) * 31;
        Bitmap bitmap = this.f46680b;
        if (bitmap != null) {
            i = bitmap.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AlphaMask(size=");
        stringBuilder.append(this.f46679a);
        stringBuilder.append(", bitmap=");
        stringBuilder.append(this.f46680b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C14949a(@NotNull C14945d c14945d, @Nullable Bitmap bitmap) {
        C2668g.b(c14945d, ManagerWebServices.PARAM_SIZE);
        this.f46679a = c14945d;
        this.f46680b = bitmap;
    }

    public /* synthetic */ C14949a(C14945d c14945d, Bitmap bitmap, int i, C15823e c15823e) {
        if ((i & 1) != null) {
            c14945d = C14945d.f46667a.m56450a();
        }
        if ((i & 2) != 0) {
            bitmap = null;
        }
        this(c14945d, bitmap);
    }
}
