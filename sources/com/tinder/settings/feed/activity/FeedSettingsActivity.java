package com.tinder.settings.feed.activity;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tinder.R;
import com.tinder.base.ActivitySignedInBase;
import com.tinder.managers.ManagerApp;
import com.tinder.settings.feed.injection.FeedSettingsActivityComponent;
import com.tinder.settings.feed.injection.FeedSettingsActivityComponentProvider;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \f2\u00020\u00012\u00020\u0002:\u0001\fB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014J\b\u0010\u000b\u001a\u00020\u0005H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/settings/feed/activity/FeedSettingsActivity;", "Lcom/tinder/base/ActivitySignedInBase;", "Lcom/tinder/settings/feed/injection/FeedSettingsActivityComponentProvider;", "()V", "feedSettingsActivityComponent", "Lcom/tinder/settings/feed/injection/FeedSettingsActivityComponent;", "finish", "", "onCreate", "bundle", "Landroid/os/Bundle;", "provideComponent", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class FeedSettingsActivity extends ActivitySignedInBase implements FeedSettingsActivityComponentProvider {
    /* renamed from: a */
    public static final C14870a f60019a = new C14870a();
    /* renamed from: b */
    private FeedSettingsActivityComponent f60020b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/settings/feed/activity/FeedSettingsActivity$Companion;", "", "()V", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.feed.activity.FeedSettingsActivity$a */
    public static final class C14870a {
        private C14870a() {
        }

        @NotNull
        /* renamed from: a */
        public final Intent m56298a(@NotNull Context context) {
            C2668g.b(context, "context");
            return new Intent(context, FeedSettingsActivity.class);
        }
    }

    protected void onCreate(@Nullable Bundle bundle) {
        Application application = getApplication();
        if (application == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.managers.ManagerApp");
        }
        this.f60020b = ((ManagerApp) application).h().feedSettingsActivityComponentBuilder().feedSettingsActivity(this).build();
        super.onCreate(bundle);
        setContentView(R.layout.activity_feed_settings);
        overridePendingTransition(R.anim.enter_right_to_left, R.anim.enter_left_to_right);
    }

    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.exit_left_to_right, R.anim.exit_right_to_left);
    }

    @NotNull
    public FeedSettingsActivityComponent provideComponent() {
        FeedSettingsActivityComponent feedSettingsActivityComponent = this.f60020b;
        if (feedSettingsActivityComponent == null) {
            C2668g.b("feedSettingsActivityComponent");
        }
        return feedSettingsActivityComponent;
    }
}
