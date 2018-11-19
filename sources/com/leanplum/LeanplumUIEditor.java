package com.leanplum;

import android.app.Activity;

@Deprecated
public interface LeanplumUIEditor {
    void allowInterfaceEditing(Boolean bool);

    void applyInterfaceEdits(Activity activity);

    LeanplumEditorMode getMode();

    void sendUpdate();

    void sendUpdateDelayed(int i);

    void sendUpdateDelayedDefault();

    void setMode(LeanplumEditorMode leanplumEditorMode);

    void startUpdating();

    void stopUpdating();
}
