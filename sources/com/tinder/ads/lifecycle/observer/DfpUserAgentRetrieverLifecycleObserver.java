package com.tinder.ads.lifecycle.observer;

import android.arch.lifecycle.Lifecycle.Event;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.webkit.WebView;
import com.tinder.messageads.UserAgentCache;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/ads/lifecycle/observer/DfpUserAgentRetrieverLifecycleObserver;", "Landroid/arch/lifecycle/LifecycleObserver;", "context", "Landroid/content/Context;", "userAgentCache", "Lcom/tinder/messageads/UserAgentCache;", "(Landroid/content/Context;Lcom/tinder/messageads/UserAgentCache;)V", "onActivityCreated", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class DfpUserAgentRetrieverLifecycleObserver implements LifecycleObserver {
    private final Context context;
    private final UserAgentCache userAgentCache;

    public DfpUserAgentRetrieverLifecycleObserver(@NotNull Context context, @NotNull UserAgentCache userAgentCache) {
        C2668g.m10309b(context, "context");
        C2668g.m10309b(userAgentCache, "userAgentCache");
        this.context = context;
        this.userAgentCache = userAgentCache;
    }

    @OnLifecycleEvent(Event.ON_CREATE)
    public final void onActivityCreated() {
        if (!this.userAgentCache.exists()) {
            Object settings = new WebView(this.context).getSettings();
            C2668g.m10305a(settings, "settings");
            settings.setAllowContentAccess(false);
            settings.setAllowFileAccess(false);
            settings = settings.getUserAgentString();
            UserAgentCache userAgentCache = this.userAgentCache;
            C2668g.m10305a(settings, "userAgent");
            userAgentCache.update(settings);
        }
    }
}
