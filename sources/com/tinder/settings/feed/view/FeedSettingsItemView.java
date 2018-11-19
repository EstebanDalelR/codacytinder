package com.tinder.settings.feed.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.tinder.deadshot.Deadshot;
import com.tinder.managers.ManagerApp;
import com.tinder.p361b.C13628c;
import com.tinder.settings.feed.activity.FeedSettingsActivity;
import com.tinder.settings.feed.activity.FeedSettingsActivity.C14870a;
import com.tinder.settings.feed.presenter.C14874a;
import com.tinder.settings.feed.target.FeedSettingItemTarget;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0014J\b\u0010\u0011\u001a\u00020\u000fH\u0016R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/tinder/settings/feed/view/FeedSettingsItemView;", "Landroid/widget/LinearLayout;", "Lcom/tinder/settings/feed/target/FeedSettingItemTarget;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "presenter", "Lcom/tinder/settings/feed/presenter/FeedSettingItemPresenter;", "getPresenter", "()Lcom/tinder/settings/feed/presenter/FeedSettingItemPresenter;", "setPresenter", "(Lcom/tinder/settings/feed/presenter/FeedSettingItemPresenter;)V", "disableActivityFeedSettings", "", "onDetachedFromWindow", "showActivityFeedSettings", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class FeedSettingsItemView extends LinearLayout implements FeedSettingItemTarget {
    @Inject
    @NotNull
    /* renamed from: a */
    public C14874a f51508a;

    public FeedSettingsItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        attributeSet = context.getApplicationContext();
        if (attributeSet == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.managers.ManagerApp");
        }
        ((ManagerApp) attributeSet).h().inject(this);
        setOrientation(1);
        C14874a c14874a = this.f51508a;
        if (c14874a == null) {
            C2668g.b("presenter");
        }
        Deadshot.take(this, c14874a);
        context = C13628c.a(LayoutInflater.from(context), this, true);
        C2668g.a(context, "binding");
        context.a((OnClickListener) new OnClickListener() {
            public final void onClick(View view) {
                this.getPresenter().m56307b();
            }
        });
    }

    @NotNull
    public final C14874a getPresenter() {
        C14874a c14874a = this.f51508a;
        if (c14874a == null) {
            C2668g.b("presenter");
        }
        return c14874a;
    }

    public final void setPresenter(@NotNull C14874a c14874a) {
        C2668g.b(c14874a, "<set-?>");
        this.f51508a = c14874a;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Deadshot.drop(this);
    }

    public void disableActivityFeedSettings() {
        setVisibility(8);
    }

    public void showActivityFeedSettings() {
        C14870a c14870a = FeedSettingsActivity.f60019a;
        Context context = getContext();
        C2668g.a(context, "context");
        getContext().startActivity(c14870a.m56298a(context));
    }
}
