package com.tinder.dialogs;

import android.app.Activity;
import android.content.Intent;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.recs.analytics.AddRecsInteractEvent.Type;
import com.tinder.recs.view.SettingsShortcutDialog;
import com.tinder.settings.activity.SettingsActivity;
import com.tinder.toppicks.SettingsLauncher;
import com.tinder.toppicks.SettingsLauncher.Source;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/dialogs/TinderSettingsLauncher;", "Lcom/tinder/toppicks/SettingsLauncher;", "abTestUtility", "Lcom/tinder/core/experiment/AbTestUtility;", "(Lcom/tinder/core/experiment/AbTestUtility;)V", "launchSettings", "", "activity", "Landroid/app/Activity;", "source", "Lcom/tinder/toppicks/SettingsLauncher$Source;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class ah implements SettingsLauncher {
    /* renamed from: a */
    private final AbTestUtility f35988a;

    @Inject
    public ah(@NotNull AbTestUtility abTestUtility) {
        C2668g.b(abTestUtility, "abTestUtility");
        this.f35988a = abTestUtility;
    }

    public void launchSettings(@NotNull Activity activity, @NotNull Source source) {
        C2668g.b(activity, "activity");
        C2668g.b(source, "source");
        if (this.f35988a.isSettingsOnRecsEnabled()) {
            SettingsShortcutDialog settingsShortcutDialog = new SettingsShortcutDialog(activity);
            switch (ai.f31004a[source.ordinal()]) {
                case 1:
                    activity = Type.TOP_PICKS_GRID;
                    break;
                case 2:
                    activity = Type.TOP_PICKS_ALC;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            settingsShortcutDialog.setAnalyticsType(activity);
            settingsShortcutDialog.show();
            return;
        }
        activity.startActivity(new Intent(activity, SettingsActivity.class));
    }
}
