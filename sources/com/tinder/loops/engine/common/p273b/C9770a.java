package com.tinder.loops.engine.common.p273b;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/tinder/loops/engine/common/model/VideoFrame;", "", "bitmap", "Landroid/graphics/Bitmap;", "sourceVideoPresentationTimeUS", "", "(Landroid/graphics/Bitmap;J)V", "getBitmap", "()Landroid/graphics/Bitmap;", "getSourceVideoPresentationTimeUS", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "loopsengine_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.loops.engine.common.b.a */
public final class C9770a {
    @NotNull
    /* renamed from: a */
    private final Bitmap f32407a;
    /* renamed from: b */
    private final long f32408b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9770a) {
            C9770a c9770a = (C9770a) obj;
            if (C2668g.a(this.f32407a, c9770a.f32407a)) {
                if ((this.f32408b == c9770a.f32408b ? 1 : null) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        Bitmap bitmap = this.f32407a;
        int hashCode = (bitmap != null ? bitmap.hashCode() : 0) * 31;
        long j = this.f32408b;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("VideoFrame(bitmap=");
        stringBuilder.append(this.f32407a);
        stringBuilder.append(", sourceVideoPresentationTimeUS=");
        stringBuilder.append(this.f32408b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C9770a(@NotNull Bitmap bitmap, long j) {
        C2668g.b(bitmap, "bitmap");
        this.f32407a = bitmap;
        this.f32408b = j;
    }

    @NotNull
    /* renamed from: a */
    public final Bitmap m40314a() {
        return this.f32407a;
    }

    /* renamed from: b */
    public final long m40315b() {
        return this.f32408b;
    }
}
