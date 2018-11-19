package com.tinder.toppicks;

import android.app.Activity;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\bJ\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\t"}, d2 = {"Lcom/tinder/toppicks/SettingsLauncher;", "", "launchSettings", "", "activity", "Landroid/app/Activity;", "source", "Lcom/tinder/toppicks/SettingsLauncher$Source;", "Source", "toppicks_release"}, k = 1, mv = {1, 1, 10})
public interface SettingsLauncher {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/tinder/toppicks/SettingsLauncher$Source;", "", "(Ljava/lang/String;I)V", "TOP_PICKS_GRID", "TOP_PICKS_PAYWALL", "toppicks_release"}, k = 1, mv = {1, 1, 10})
    public enum Source {
    }

    void launchSettings(@NotNull Activity activity, @NotNull Source source);
}
