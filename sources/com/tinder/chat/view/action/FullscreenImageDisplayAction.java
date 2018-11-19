package com.tinder.chat.view.action;

import android.graphics.Point;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/tinder/chat/view/action/FullscreenImageDisplayAction;", "", "showImage", "", "payload", "Lcom/tinder/chat/view/action/FullscreenImageDisplayAction$Payload;", "Payload", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface FullscreenImageDisplayAction {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/tinder/chat/view/action/FullscreenImageDisplayAction$Payload;", "", "imageUrl", "", "imageViewWidth", "", "imageViewHeight", "imageViewLeftAndTop", "Landroid/graphics/Point;", "(Ljava/lang/String;FFLandroid/graphics/Point;)V", "getImageUrl", "()Ljava/lang/String;", "getImageViewHeight", "()F", "getImageViewLeftAndTop", "()Landroid/graphics/Point;", "getImageViewWidth", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.view.action.FullscreenImageDisplayAction$a */
    public static final class C8456a {
        @NotNull
        /* renamed from: a */
        private final String f30111a;
        /* renamed from: b */
        private final float f30112b;
        /* renamed from: c */
        private final float f30113c;
        @NotNull
        /* renamed from: d */
        private final Point f30114d;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C8456a) {
                    C8456a c8456a = (C8456a) obj;
                    if (C2668g.a(this.f30111a, c8456a.f30111a) && Float.compare(this.f30112b, c8456a.f30112b) == 0 && Float.compare(this.f30113c, c8456a.f30113c) == 0 && C2668g.a(this.f30114d, c8456a.f30114d)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.f30111a;
            int i = 0;
            int hashCode = (((((str != null ? str.hashCode() : 0) * 31) + Float.floatToIntBits(this.f30112b)) * 31) + Float.floatToIntBits(this.f30113c)) * 31;
            Point point = this.f30114d;
            if (point != null) {
                i = point.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Payload(imageUrl=");
            stringBuilder.append(this.f30111a);
            stringBuilder.append(", imageViewWidth=");
            stringBuilder.append(this.f30112b);
            stringBuilder.append(", imageViewHeight=");
            stringBuilder.append(this.f30113c);
            stringBuilder.append(", imageViewLeftAndTop=");
            stringBuilder.append(this.f30114d);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C8456a(@NotNull String str, float f, float f2, @NotNull Point point) {
            C2668g.b(str, "imageUrl");
            C2668g.b(point, "imageViewLeftAndTop");
            this.f30111a = str;
            this.f30112b = f;
            this.f30113c = f2;
            this.f30114d = point;
        }

        @NotNull
        /* renamed from: a */
        public final String m36191a() {
            return this.f30111a;
        }

        /* renamed from: b */
        public final float m36192b() {
            return this.f30112b;
        }

        /* renamed from: c */
        public final float m36193c() {
            return this.f30113c;
        }

        @NotNull
        /* renamed from: d */
        public final Point m36194d() {
            return this.f30114d;
        }
    }

    void showImage(@NotNull C8456a c8456a);
}
