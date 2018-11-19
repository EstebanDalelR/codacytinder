package com.tinder.shimmy.p411a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.tinder.api.ManagerWebServices;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/shimmy/utils/AlphaMaskBitmapPool;", "", "()V", "safeBitmapFactory", "Lcom/tinder/shimmy/utils/SafeBitmapFactory;", "obtain", "Landroid/graphics/Bitmap;", "size", "Lcom/tinder/shimmy/utils/Size;", "release", "", "bitmap", "Companion", "shimmy_release"}, k = 1, mv = {1, 1, 9})
/* renamed from: com.tinder.shimmy.a.a */
public final class C14941a {
    /* renamed from: a */
    public static final C14940a f46664a = new C14940a();
    /* renamed from: c */
    private static C14941a f46665c;
    /* renamed from: b */
    private final C14943c f46666b = new C14943c();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\u0004H\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/tinder/shimmy/utils/AlphaMaskBitmapPool$Companion;", "", "()V", "sharedInstance", "Lcom/tinder/shimmy/utils/AlphaMaskBitmapPool;", "getSharedInstance", "()Lcom/tinder/shimmy/utils/AlphaMaskBitmapPool;", "setSharedInstance", "(Lcom/tinder/shimmy/utils/AlphaMaskBitmapPool;)V", "getInstance", "shimmy_release"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.shimmy.a.a$a */
    public static final class C14940a {
        private C14940a() {
        }

        /* renamed from: a */
        private final void m56440a(C14941a c14941a) {
            C14941a.f46665c = c14941a;
        }

        /* renamed from: b */
        private final C14941a m56441b() {
            return C14941a.f46665c;
        }

        @NotNull
        /* renamed from: a */
        public final synchronized C14941a m56442a() {
            C14941a b;
            if (m56441b() == null) {
                m56440a(new C14941a());
            }
            b = m56441b();
            if (b == null) {
                C2668g.a();
            }
            return b;
        }
    }

    @Nullable
    /* renamed from: a */
    public final synchronized Bitmap m56445a(@NotNull C14945d c14945d) {
        C2668g.b(c14945d, ManagerWebServices.PARAM_SIZE);
        return this.f46666b.m56449a((int) c14945d.m56452a(), (int) c14945d.m56453b(), Config.ALPHA_8);
    }

    /* renamed from: a */
    public final synchronized void m56446a(@NotNull Bitmap bitmap) {
        C2668g.b(bitmap, "bitmap");
        bitmap.recycle();
    }
}
