package com.snapchat.kit.sdk.core.controller;

import android.os.Handler;
import android.support.annotation.NonNull;
import com.snapchat.kit.sdk.core.controller.LoginStateController.OnLoginStartListener;
import com.snapchat.kit.sdk.core.controller.LoginStateController.OnLoginStateChangedListener;
import com.snapchat.kit.sdk.core.dagger.scope.SnapConnectScope;
import java.util.ArrayList;
import java.util.Collection;
import java.util.WeakHashMap;
import javax.inject.Inject;

@SnapConnectScope
/* renamed from: com.snapchat.kit.sdk.core.controller.a */
public class C7136a implements LoginStateController {
    /* renamed from: a */
    private final WeakHashMap<OnLoginStateChangedListener, Void> f25869a = new WeakHashMap();
    /* renamed from: b */
    private final WeakHashMap<OnLoginStartListener, Void> f25870b = new WeakHashMap();
    /* renamed from: c */
    private final Handler f25871c;

    /* renamed from: com.snapchat.kit.sdk.core.controller.a$1 */
    class C59311 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C7136a f21700a;

        C59311(C7136a c7136a) {
            this.f21700a = c7136a;
        }

        public void run() {
            for (OnLoginStateChangedListener onLogout : this.f21700a.m30784e()) {
                onLogout.onLogout();
            }
        }
    }

    /* renamed from: com.snapchat.kit.sdk.core.controller.a$2 */
    class C59322 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C7136a f21701a;

        C59322(C7136a c7136a) {
            this.f21701a = c7136a;
        }

        public void run() {
            for (OnLoginStateChangedListener onLoginSucceeded : this.f21701a.m30784e()) {
                onLoginSucceeded.onLoginSucceeded();
            }
        }
    }

    /* renamed from: com.snapchat.kit.sdk.core.controller.a$3 */
    class C59333 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C7136a f21702a;

        C59333(C7136a c7136a) {
            this.f21702a = c7136a;
        }

        public void run() {
            for (OnLoginStateChangedListener onLoginFailed : this.f21702a.m30784e()) {
                onLoginFailed.onLoginFailed();
            }
        }
    }

    /* renamed from: com.snapchat.kit.sdk.core.controller.a$4 */
    class C59344 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C7136a f21703a;

        C59344(C7136a c7136a) {
            this.f21703a = c7136a;
        }

        public void run() {
            for (OnLoginStartListener onLoginStart : this.f21703a.m30785f()) {
                onLoginStart.onLoginStart();
            }
        }
    }

    @Inject
    C7136a(Handler handler) {
        this.f25871c = handler;
    }

    public void addOnLoginStateChangedListener(OnLoginStateChangedListener onLoginStateChangedListener) {
        this.f25869a.put(onLoginStateChangedListener, null);
    }

    public void removeOnLoginStateChangedListener(OnLoginStateChangedListener onLoginStateChangedListener) {
        this.f25869a.remove(onLoginStateChangedListener);
    }

    public void addOnLoginStartListener(OnLoginStartListener onLoginStartListener) {
        this.f25870b.put(onLoginStartListener, null);
    }

    public void removeOnLoginStartListener(OnLoginStartListener onLoginStartListener) {
        this.f25870b.remove(onLoginStartListener);
    }

    /* renamed from: a */
    public void m30786a() {
        this.f25871c.post(new C59311(this));
    }

    /* renamed from: b */
    public void m30787b() {
        this.f25871c.post(new C59322(this));
    }

    /* renamed from: c */
    public void m30788c() {
        this.f25871c.post(new C59333(this));
    }

    /* renamed from: d */
    public void m30789d() {
        this.f25871c.post(new C59344(this));
    }

    @NonNull
    /* renamed from: e */
    private Collection<OnLoginStateChangedListener> m30784e() {
        return new ArrayList(this.f25869a.keySet());
    }

    @NonNull
    /* renamed from: f */
    private Collection<OnLoginStartListener> m30785f() {
        return new ArrayList(this.f25870b.keySet());
    }
}
