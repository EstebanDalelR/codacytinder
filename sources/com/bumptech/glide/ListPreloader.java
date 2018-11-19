package com.bumptech.glide;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.C4117a;
import com.bumptech.glide.request.target.SizeReadyCallback;
import java.util.List;
import java.util.Queue;

public class ListPreloader<T> implements OnScrollListener {
    /* renamed from: a */
    private final int f2552a;
    /* renamed from: b */
    private final C0962b f2553b;
    /* renamed from: c */
    private final PreloadModelProvider<T> f2554c;
    /* renamed from: d */
    private final PreloadSizeProvider<T> f2555d;
    /* renamed from: e */
    private int f2556e;
    /* renamed from: f */
    private int f2557f;
    /* renamed from: g */
    private int f2558g;
    /* renamed from: h */
    private int f2559h;
    /* renamed from: i */
    private boolean f2560i;

    public interface PreloadModelProvider<U> {
        List<U> getPreloadItems(int i);

        C0990e getPreloadRequestBuilder(U u);
    }

    public interface PreloadSizeProvider<T> {
        int[] getPreloadSize(T t, int i, int i2);
    }

    /* renamed from: com.bumptech.glide.ListPreloader$b */
    private static final class C0962b {
        /* renamed from: a */
        private final Queue<C4328a> f2551a;

        /* renamed from: a */
        public C4328a m3284a(int i, int i2) {
            C4328a c4328a = (C4328a) this.f2551a.poll();
            this.f2551a.offer(c4328a);
            c4328a.f14189b = i;
            c4328a.f14188a = i2;
            return c4328a;
        }
    }

    /* renamed from: com.bumptech.glide.ListPreloader$a */
    private static class C4328a extends C4117a<Object> {
        /* renamed from: a */
        private int f14188a;
        /* renamed from: b */
        private int f14189b;

        public void onResourceReady(Object obj, GlideAnimation<? super Object> glideAnimation) {
        }

        private C4328a() {
        }

        public void getSize(SizeReadyCallback sizeReadyCallback) {
            sizeReadyCallback.onSizeReady(this.f14189b, this.f14188a);
        }
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        this.f2559h = i3;
        if (i > this.f2558g) {
            m3287a(i2 + i, true);
        } else if (i < this.f2558g) {
            m3287a(i, (boolean) null);
        }
        this.f2558g = i;
    }

    /* renamed from: a */
    private void m3287a(int i, boolean z) {
        if (this.f2560i != z) {
            this.f2560i = z;
            m3285a();
        }
        m3286a(i, (z ? this.f2552a : -this.f2552a) + i);
    }

    /* renamed from: a */
    private void m3286a(int i, int i2) {
        int max;
        int i3;
        if (i < i2) {
            max = Math.max(this.f2556e, i);
            i3 = i2;
        } else {
            i3 = Math.min(this.f2557f, i);
            max = i2;
        }
        i3 = Math.min(this.f2559h, i3);
        max = Math.min(this.f2559h, Math.max(0, max));
        if (i < i2) {
            for (i = max; i < i3; i++) {
                m3289a(this.f2554c.getPreloadItems(i), i, true);
            }
        } else {
            for (i = i3 - 1; i >= max; i--) {
                m3289a(this.f2554c.getPreloadItems(i), i, false);
            }
        }
        this.f2557f = max;
        this.f2556e = i3;
    }

    /* renamed from: a */
    private void m3289a(List<T> list, int i, boolean z) {
        boolean size = list.size();
        if (z) {
            for (int i2 = false; i2 < size; i2++) {
                m3288a(list.get(i2), i, i2);
            }
            return;
        }
        for (int i3 = size - 1; i3 >= 0; i3--) {
            m3288a(list.get(i3), i, i3);
        }
    }

    /* renamed from: a */
    private void m3288a(T t, int i, int i2) {
        i = this.f2555d.getPreloadSize(t, i, i2);
        if (i != 0) {
            this.f2554c.getPreloadRequestBuilder(t).m3435b(this.f2553b.m3284a(i[0], i[1]));
        }
    }

    /* renamed from: a */
    private void m3285a() {
        for (int i = 0; i < this.f2552a; i++) {
            C0994i.m3485a(this.f2553b.m3284a(0, 0));
        }
    }
}
