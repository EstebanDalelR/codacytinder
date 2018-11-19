package com.tinder.recs.view;

import android.support.design.widget.Snackbar;
import android.support.design.widget.Snackbar.C2768a;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/tinder/recs/view/SettingsShortcutDialog$snackBarCallBack$1", "Landroid/support/design/widget/Snackbar$Callback;", "(Lcom/tinder/recs/view/SettingsShortcutDialog;)V", "onDismissed", "", "transientBottomBar", "Landroid/support/design/widget/Snackbar;", "event", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class SettingsShortcutDialog$snackBarCallBack$1 extends C2768a {
    final /* synthetic */ SettingsShortcutDialog this$0;

    SettingsShortcutDialog$snackBarCallBack$1(SettingsShortcutDialog settingsShortcutDialog) {
        this.this$0 = settingsShortcutDialog;
    }

    public void onDismissed(@Nullable Snackbar snackbar, int i) {
        super.onDismissed(snackbar, i);
        this.this$0.dismiss();
        SettingsShortcutDialog.access$getSnackBar$p(this.this$0).b(this);
    }
}
