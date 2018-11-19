package com.tinder.recs.presenter;

import com.tinder.recs.target.SettingsShortcutTarget;
import com.tinder.recs.target.SettingsShortcutTarget_Stub;

public class SettingsShortcutPresenter_Holder {
    public static void takeAll(SettingsShortcutPresenter settingsShortcutPresenter, SettingsShortcutTarget settingsShortcutTarget) {
        settingsShortcutPresenter.target = settingsShortcutTarget;
        settingsShortcutPresenter.take$Tinder_release();
    }

    public static void dropAll(SettingsShortcutPresenter settingsShortcutPresenter) {
        settingsShortcutPresenter.drop$Tinder_release();
        settingsShortcutPresenter.target = new SettingsShortcutTarget_Stub();
    }
}
