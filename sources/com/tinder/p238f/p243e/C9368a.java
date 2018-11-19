package com.tinder.p238f.p243e;

import android.support.annotation.NonNull;
import com.tinder.domain.common.watchers.Watcher;
import com.tinder.model.UserMeta;
import com.tinder.p238f.p336c.C11600a;
import java.util.LinkedList;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
/* renamed from: com.tinder.f.e.a */
public class C9368a {
    @NonNull
    /* renamed from: a */
    private final C11600a f31427a;
    @NonNull
    /* renamed from: b */
    private final List<Watcher<UserMeta>> f31428b = new LinkedList();
    /* renamed from: c */
    private boolean f31429c = false;

    @Inject
    C9368a(@NonNull C11602c c11602c, @NonNull C11610o c11610o, @NonNull C11608k c11608k, @NonNull C11612s c11612s, @NonNull C11609m c11609m, @NonNull C11604g c11604g, @NonNull C11600a c11600a, @NonNull C11611q c11611q, @NonNull C11603e c11603e, @NonNull C11607i c11607i) {
        this.f31428b.add(c11602c);
        this.f31428b.add(c11603e);
        this.f31428b.add(c11610o);
        this.f31428b.add(c11608k);
        this.f31428b.add(c11612s);
        this.f31428b.add(c11609m);
        this.f31428b.add(c11604g);
        this.f31428b.add(c11611q);
        this.f31428b.add(c11607i);
        this.f31427a = c11600a;
    }

    /* renamed from: a */
    public void m39221a() {
        if (!this.f31429c) {
            for (Watcher startWatching : this.f31428b) {
                startWatching.startWatching(this.f31427a.observe());
            }
            this.f31429c = true;
        }
    }

    /* renamed from: b */
    public void m39222b() {
        for (Watcher stopWatching : this.f31428b) {
            stopWatching.stopWatching();
        }
        this.f31429c = false;
    }
}
