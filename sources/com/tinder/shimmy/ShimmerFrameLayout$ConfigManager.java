package com.tinder.shimmy;

import android.support.annotation.UiThread;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u0000 \u00122\u00020\u0001:\u0002\u0012\u0013B\u0005¢\u0006\u0002\u0010\u0002J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\u000bJ\b\u0010\f\u001a\u00020\tH\u0007J\b\u0010\r\u001a\u00020\tH\u0007J\b\u0010\u000e\u001a\u00020\u0004H\u0007J\b\u0010\u000f\u001a\u00020\tH\u0002J\u0015\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/tinder/shimmy/ShimmerFrameLayout$ConfigManager;", "", "()V", "config", "Lcom/tinder/shimmy/ShimmerFrameLayout$Config;", "listeners", "", "Lcom/tinder/shimmy/ShimmerFrameLayout$ConfigManager$Listener;", "addListener", "", "listener", "addListener$shimmy_release", "disableShimmer", "enableShimmer", "getConfig", "notifyListeners", "removeListener", "removeListener$shimmy_release", "Companion", "Listener", "shimmy_release"}, k = 1, mv = {1, 1, 9})
public final class ShimmerFrameLayout$ConfigManager {
    /* renamed from: a */
    public static final C14937a f46651a = new C14937a();
    /* renamed from: d */
    private static ShimmerFrameLayout$ConfigManager f46652d;
    /* renamed from: b */
    private ShimmerFrameLayout$b f46653b = new ShimmerFrameLayout$b(false, 1, null);
    /* renamed from: c */
    private final Set<Listener> f46654c = new LinkedHashSet();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/tinder/shimmy/ShimmerFrameLayout$ConfigManager$Listener;", "", "onConfigChanged", "", "shimmy_release"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.shimmy.ShimmerFrameLayout$ConfigManager$Listener */
    public interface Listener {
        void onConfigChanged();
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\u0004H\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/tinder/shimmy/ShimmerFrameLayout$ConfigManager$Companion;", "", "()V", "sharedInstance", "Lcom/tinder/shimmy/ShimmerFrameLayout$ConfigManager;", "getSharedInstance", "()Lcom/tinder/shimmy/ShimmerFrameLayout$ConfigManager;", "setSharedInstance", "(Lcom/tinder/shimmy/ShimmerFrameLayout$ConfigManager;)V", "getInstance", "shimmy_release"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.shimmy.ShimmerFrameLayout$ConfigManager$a */
    public static final class C14937a {
        private C14937a() {
        }

        /* renamed from: a */
        private final void m56415a(ShimmerFrameLayout$ConfigManager shimmerFrameLayout$ConfigManager) {
            ShimmerFrameLayout$ConfigManager.f46652d = shimmerFrameLayout$ConfigManager;
        }

        /* renamed from: b */
        private final ShimmerFrameLayout$ConfigManager m56416b() {
            return ShimmerFrameLayout$ConfigManager.f46652d;
        }

        @NotNull
        /* renamed from: a */
        public final synchronized ShimmerFrameLayout$ConfigManager m56417a() {
            ShimmerFrameLayout$ConfigManager b;
            if (m56416b() == null) {
                m56415a(new ShimmerFrameLayout$ConfigManager());
            }
            b = m56416b();
            if (b == null) {
                C2668g.a();
            }
            return b;
        }
    }

    @NotNull
    @UiThread
    /* renamed from: a */
    public final ShimmerFrameLayout$b m56421a() {
        return this.f46653b;
    }

    @UiThread
    /* renamed from: b */
    public final void m56423b() {
        this.f46653b = this.f46653b.m56434a(true);
        m56420e();
    }

    @UiThread
    /* renamed from: c */
    public final void m56425c() {
        this.f46653b = this.f46653b.m56434a(false);
        m56420e();
    }

    /* renamed from: a */
    public final void m56422a(@NotNull Listener listener) {
        C2668g.b(listener, "listener");
        this.f46654c.add(listener);
    }

    /* renamed from: b */
    public final void m56424b(@NotNull Listener listener) {
        C2668g.b(listener, "listener");
        this.f46654c.remove(listener);
    }

    /* renamed from: e */
    private final void m56420e() {
        for (Listener onConfigChanged : this.f46654c) {
            onConfigChanged.onConfigChanged();
        }
    }
}
