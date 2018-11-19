package com.tinder.screenshotty.p401a;

import android.graphics.Bitmap;
import android.net.Uri;
import com.tinder.api.ManagerWebServices;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/screenshotty/model/Screenshot;", "", "()V", "Available", "Empty", "Lcom/tinder/screenshotty/model/Screenshot$Available;", "Lcom/tinder/screenshotty/model/Screenshot$Empty;", "screenshotty_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.screenshotty.a.a */
public abstract class C14826a {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/tinder/screenshotty/model/Screenshot$Available;", "Lcom/tinder/screenshotty/model/Screenshot;", "screenshot", "Landroid/graphics/Bitmap;", "uri", "Landroid/net/Uri;", "(Landroid/graphics/Bitmap;Landroid/net/Uri;)V", "getScreenshot", "()Landroid/graphics/Bitmap;", "getUri", "()Landroid/net/Uri;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "screenshotty_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.screenshotty.a.a$a */
    public static final class C16570a extends C14826a {
        @NotNull
        /* renamed from: a */
        private final Bitmap f51263a;
        @NotNull
        /* renamed from: b */
        private final Uri f51264b;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C16570a) {
                    C16570a c16570a = (C16570a) obj;
                    if (C2668g.a(this.f51263a, c16570a.f51263a) && C2668g.a(this.f51264b, c16570a.f51264b)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            Bitmap bitmap = this.f51263a;
            int i = 0;
            int hashCode = (bitmap != null ? bitmap.hashCode() : 0) * 31;
            Uri uri = this.f51264b;
            if (uri != null) {
                i = uri.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Available(screenshot=");
            stringBuilder.append(this.f51263a);
            stringBuilder.append(", uri=");
            stringBuilder.append(this.f51264b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C16570a(@NotNull Bitmap bitmap, @NotNull Uri uri) {
            C2668g.b(bitmap, "screenshot");
            C2668g.b(uri, ManagerWebServices.PARAM_SPOTIFY_URI);
            super();
            this.f51263a = bitmap;
            this.f51264b = uri;
        }

        @NotNull
        /* renamed from: a */
        public final Uri m61998a() {
            return this.f51264b;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/screenshotty/model/Screenshot$Empty;", "Lcom/tinder/screenshotty/model/Screenshot;", "()V", "screenshotty_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.screenshotty.a.a$b */
    public static final class C16571b extends C14826a {
        /* renamed from: a */
        public static final C16571b f51265a = new C16571b();

        private C16571b() {
            super();
        }
    }

    private C14826a() {
    }
}
