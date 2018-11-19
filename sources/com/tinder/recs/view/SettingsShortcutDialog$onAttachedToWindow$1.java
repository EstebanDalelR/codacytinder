package com.tinder.recs.view;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.tinder.recs.analytics.AddRecsInteractEvent.Type;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onDismiss"}, k = 3, mv = {1, 1, 10})
final class SettingsShortcutDialog$onAttachedToWindow$1 implements OnDismissListener {
    final /* synthetic */ SettingsShortcutDialog this$0;

    SettingsShortcutDialog$onAttachedToWindow$1(SettingsShortcutDialog settingsShortcutDialog) {
        this.this$0 = settingsShortcutDialog;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        dialogInterface = this.this$0;
        Type analyticsType = this.this$0.getAnalyticsType();
        if (analyticsType == null) {
            analyticsType = Type.SETTINGS_BACKGROUND;
        }
        dialogInterface.fireRecsInterctEvent(analyticsType);
    }
}
