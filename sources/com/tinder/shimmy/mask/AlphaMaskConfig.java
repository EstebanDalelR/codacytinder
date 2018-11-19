package com.tinder.shimmy.mask;

import android.graphics.Canvas;
import com.tinder.api.ManagerWebServices;
import com.tinder.shimmy.p411a.C14941a;
import com.tinder.shimmy.p411a.C14945d;
import java.util.ArrayList;
import java.util.List;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.collections.C19299w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/tinder/shimmy/mask/AlphaMaskConfig;", "", "size", "Lcom/tinder/shimmy/utils/Size;", "layers", "", "Lcom/tinder/shimmy/mask/AlphaMaskConfig$Layer;", "(Lcom/tinder/shimmy/utils/Size;Ljava/util/List;)V", "getLayers", "()Ljava/util/List;", "getSize", "()Lcom/tinder/shimmy/utils/Size;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Builder", "Layer", "shimmy_release"}, k = 1, mv = {1, 1, 9})
public final class AlphaMaskConfig {
    @NotNull
    /* renamed from: a */
    private final C14945d f46677a;
    @NotNull
    /* renamed from: b */
    private final List<Layer> f46678b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u001fB)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007HÂ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u001f\u0010\u0018\u001a\u00020\t2\u0014\b\u0004\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\t0\u0007H\bJ\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006 "}, d2 = {"Lcom/tinder/shimmy/mask/AlphaMaskConfig$Layer;", "", "size", "Lcom/tinder/shimmy/utils/Size;", "type", "Lcom/tinder/shimmy/mask/AlphaMaskConfig$Layer$Type;", "draw", "Lkotlin/Function1;", "Landroid/graphics/Canvas;", "", "(Lcom/tinder/shimmy/utils/Size;Lcom/tinder/shimmy/mask/AlphaMaskConfig$Layer$Type;Lkotlin/jvm/functions/Function1;)V", "bitmapPool", "Lcom/tinder/shimmy/utils/AlphaMaskBitmapPool;", "getSize", "()Lcom/tinder/shimmy/utils/Size;", "getType", "()Lcom/tinder/shimmy/mask/AlphaMaskConfig$Layer$Type;", "component1", "component2", "component3", "copy", "equals", "", "other", "get", "onComplete", "Landroid/graphics/Bitmap;", "hashCode", "", "toString", "", "Type", "shimmy_release"}, k = 1, mv = {1, 1, 9})
    public static final class Layer {
        /* renamed from: a */
        private final C14941a f46671a = C14941a.f46664a.m56442a();
        @NotNull
        /* renamed from: b */
        private final C14945d f46672b;
        @NotNull
        /* renamed from: c */
        private final Type f46673c;
        /* renamed from: d */
        private final Function1<Canvas, C15813i> f46674d;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/tinder/shimmy/mask/AlphaMaskConfig$Layer$Type;", "", "(Ljava/lang/String;I)V", "INCLUDE", "EXCLUDE", "shimmy_release"}, k = 1, mv = {1, 1, 9})
        public enum Type {
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Layer) {
                    Layer layer = (Layer) obj;
                    if (C2668g.a(this.f46672b, layer.f46672b) && C2668g.a(this.f46673c, layer.f46673c) && C2668g.a(this.f46674d, layer.f46674d)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            C14945d c14945d = this.f46672b;
            int i = 0;
            int hashCode = (c14945d != null ? c14945d.hashCode() : 0) * 31;
            Type type = this.f46673c;
            hashCode = (hashCode + (type != null ? type.hashCode() : 0)) * 31;
            Function1 function1 = this.f46674d;
            if (function1 != null) {
                i = function1.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Layer(size=");
            stringBuilder.append(this.f46672b);
            stringBuilder.append(", type=");
            stringBuilder.append(this.f46673c);
            stringBuilder.append(", draw=");
            stringBuilder.append(this.f46674d);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public Layer(@NotNull C14945d c14945d, @NotNull Type type, @NotNull Function1<? super Canvas, C15813i> function1) {
            C2668g.b(c14945d, ManagerWebServices.PARAM_SIZE);
            C2668g.b(type, "type");
            C2668g.b(function1, "draw");
            this.f46672b = c14945d;
            this.f46673c = type;
            this.f46674d = function1;
        }

        @NotNull
        /* renamed from: a */
        public final C14945d m56457a() {
            return this.f46672b;
        }

        @NotNull
        /* renamed from: b */
        public final Type m56458b() {
            return this.f46673c;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\n\u001a\u00020\u000bJ\u001f\u0010\f\u001a\u00020\r2\u0014\b\u0004\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u000fH\bJ\u001f\u0010\u0011\u001a\u00020\r2\u0014\b\u0004\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u000fH\bR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/tinder/shimmy/mask/AlphaMaskConfig$Builder;", "", "size", "Lcom/tinder/shimmy/utils/Size;", "(Lcom/tinder/shimmy/utils/Size;)V", "layers", "", "Lcom/tinder/shimmy/mask/AlphaMaskConfig$Layer;", "getSize", "()Lcom/tinder/shimmy/utils/Size;", "build", "Lcom/tinder/shimmy/mask/AlphaMaskConfig;", "exclude", "", "draw", "Lkotlin/Function1;", "Landroid/graphics/Canvas;", "include", "shimmy_release"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.shimmy.mask.AlphaMaskConfig$a */
    public static final class C14948a {
        /* renamed from: a */
        private final List<Layer> f46675a = ((List) new ArrayList());
        @NotNull
        /* renamed from: b */
        private final C14945d f46676b;

        public C14948a(@NotNull C14945d c14945d) {
            C2668g.b(c14945d, ManagerWebServices.PARAM_SIZE);
            this.f46676b = c14945d;
        }

        @NotNull
        /* renamed from: b */
        public final C14945d m56461b() {
            return this.f46676b;
        }

        @NotNull
        /* renamed from: a */
        public final AlphaMaskConfig m56460a() {
            return new AlphaMaskConfig(this.f46676b, C19299w.m68840l(this.f46675a));
        }
    }

    @NotNull
    /* renamed from: a */
    public final C14945d m56462a() {
        return this.f46677a;
    }

    @NotNull
    /* renamed from: b */
    public final List<Layer> m56463b() {
        return this.f46678b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AlphaMaskConfig) {
                AlphaMaskConfig alphaMaskConfig = (AlphaMaskConfig) obj;
                if (C2668g.a(this.f46677a, alphaMaskConfig.f46677a) && C2668g.a(this.f46678b, alphaMaskConfig.f46678b)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C14945d c14945d = this.f46677a;
        int i = 0;
        int hashCode = (c14945d != null ? c14945d.hashCode() : 0) * 31;
        List list = this.f46678b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AlphaMaskConfig(size=");
        stringBuilder.append(this.f46677a);
        stringBuilder.append(", layers=");
        stringBuilder.append(this.f46678b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public AlphaMaskConfig(@NotNull C14945d c14945d, @NotNull List<Layer> list) {
        C2668g.b(c14945d, ManagerWebServices.PARAM_SIZE);
        C2668g.b(list, "layers");
        this.f46677a = c14945d;
        this.f46678b = list;
    }
}
