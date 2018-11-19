package com.facebook.accountkit.ui;

import android.app.Fragment;
import android.support.annotation.Nullable;
import com.facebook.accountkit.ui.UIManager.UIManagerListener;

public interface AdvancedUIManager extends UIManagerStub {

    @Deprecated
    public interface AdvancedUIManagerListener extends UIManagerListener {
    }

    @Nullable
    Fragment getActionBarFragment(LoginFlowState loginFlowState);

    void setAdvancedUIManagerListener(AdvancedUIManagerListener advancedUIManagerListener);
}
