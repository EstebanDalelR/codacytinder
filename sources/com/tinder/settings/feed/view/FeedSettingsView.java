package com.tinder.settings.feed.view;

import android.app.Activity;
import android.arch.lifecycle.Lifecycle.Event;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.support.v4.content.C0432b;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.tinder.R;
import com.tinder.deadshot.Deadshot;
import com.tinder.domain.settings.feed.model.FeedSharingOption;
import com.tinder.p361b.C13629d;
import com.tinder.settings.feed.injection.FeedSettingsActivityComponentProvider;
import com.tinder.settings.feed.p406a.C14868a;
import com.tinder.settings.feed.presenter.C14876c;
import com.tinder.settings.feed.target.FeedSettingsTarget;
import com.tinder.settings.feed.view.FeedSharingOptionItemView.OnFeedSharingOptionChangedListener;
import com.tinder.settings.views.SwitchRowView$CheckStatusListener;
import java.util.Collections;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016J\b\u0010\u001c\u001a\u00020\u001aH\u0016J\b\u0010\u001d\u001a\u00020\u001aH\u0007J\b\u0010\u001e\u001a\u00020\u001aH\u0007J\u0016\u0010\u001f\u001a\u00020\u001a2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!H\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006#"}, d2 = {"Lcom/tinder/settings/feed/view/FeedSettingsView;", "Landroid/widget/LinearLayout;", "Lcom/tinder/settings/feed/target/FeedSettingsTarget;", "Landroid/arch/lifecycle/LifecycleObserver;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/tinder/databinding/ViewFeedSettingsBinding;", "getBinding", "()Lcom/tinder/databinding/ViewFeedSettingsBinding;", "controller", "Lcom/tinder/settings/feed/controller/FeedSettingsController;", "getController", "()Lcom/tinder/settings/feed/controller/FeedSettingsController;", "setController", "(Lcom/tinder/settings/feed/controller/FeedSettingsController;)V", "presenter", "Lcom/tinder/settings/feed/presenter/FeedSettingsPresenter;", "getPresenter", "()Lcom/tinder/settings/feed/presenter/FeedSettingsPresenter;", "setPresenter", "(Lcom/tinder/settings/feed/presenter/FeedSettingsPresenter;)V", "disableSharing", "", "enableSharing", "exitFeedSettings", "onPause", "onResume", "showOptions", "feedSharingOptions", "", "Lcom/tinder/domain/settings/feed/model/FeedSharingOption;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class FeedSettingsView extends LinearLayout implements LifecycleObserver, FeedSettingsTarget {
    @Inject
    @NotNull
    /* renamed from: a */
    public C14876c f12498a;
    @Inject
    @NotNull
    /* renamed from: b */
    public C14868a f12499b;
    @NotNull
    /* renamed from: c */
    private final C13629d f12500c;

    public FeedSettingsView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.m10309b(context, "context");
        super(context, attributeSet);
        ((FeedSettingsActivityComponentProvider) context).provideComponent().inject(this);
        setOrientation(1);
        setBackgroundColor(C0432b.m1647c(context, R.color.gray_background_light));
        Object a = C13629d.a(LayoutInflater.from(context), this, true);
        C2668g.m10305a(a, "ViewFeedSettingsBinding.…rom(context), this, true)");
        this.f12500c = a;
        ((AppCompatActivity) context).getLifecycle().mo36a(this);
        this.f12500c.a(Boolean.valueOf(true));
        this.f12500c.a(Collections.emptyList());
        this.f12500c.a((OnClickListener) new FeedSettingsView$1(this));
        this.f12500c.a((SwitchRowView$CheckStatusListener) new FeedSettingsView$2(this));
        this.f12500c.a((OnFeedSharingOptionChangedListener) new FeedSettingsView$3(this));
    }

    @NotNull
    public final C14876c getPresenter() {
        C14876c c14876c = this.f12498a;
        if (c14876c == null) {
            C2668g.m10310b("presenter");
        }
        return c14876c;
    }

    public final void setPresenter(@NotNull C14876c c14876c) {
        C2668g.m10309b(c14876c, "<set-?>");
        this.f12498a = c14876c;
    }

    @NotNull
    public final C14868a getController() {
        C14868a c14868a = this.f12499b;
        if (c14868a == null) {
            C2668g.m10310b("controller");
        }
        return c14868a;
    }

    public final void setController(@NotNull C14868a c14868a) {
        C2668g.m10309b(c14868a, "<set-?>");
        this.f12499b = c14868a;
    }

    @NotNull
    public final C13629d getBinding() {
        return this.f12500c;
    }

    @OnLifecycleEvent(Event.ON_RESUME)
    public final void onResume() {
        C14876c c14876c = this.f12498a;
        if (c14876c == null) {
            C2668g.m10310b("presenter");
        }
        Deadshot.take(this, c14876c);
    }

    @OnLifecycleEvent(Event.ON_PAUSE)
    public final void onPause() {
        C14868a c14868a = this.f12499b;
        if (c14868a == null) {
            C2668g.m10310b("controller");
        }
        c14868a.c();
        Deadshot.drop(this);
    }

    public void disableSharing() {
        this.f12500c.a(Boolean.valueOf(false));
    }

    public void enableSharing() {
        this.f12500c.a(Boolean.valueOf(true));
    }

    public void showOptions(@NotNull Set<FeedSharingOption> set) {
        C2668g.m10309b(set, "feedSharingOptions");
        this.f12500c.a(C19301m.l(set));
    }

    public void exitFeedSettings() {
        Context context = getContext();
        if (!(context instanceof Activity)) {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity != null) {
            activity.finish();
        }
    }
}
