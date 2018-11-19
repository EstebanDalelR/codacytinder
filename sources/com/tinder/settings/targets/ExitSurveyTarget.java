package com.tinder.settings.targets;

import android.support.annotation.NonNull;
import android.support.annotation.StringRes;
import com.tinder.settings.model.ExitSurveyDetailsMode;
import com.tinder.settings.model.ExitSurveyReason;
import com.tinder.settings.views.DeleteConfirmDialog.Type;
import java.util.List;

public interface ExitSurveyTarget {
    void closeView(int i);

    void navigateToDetailsScreen(ExitSurveyDetailsMode exitSurveyDetailsMode);

    void setTitleText(@StringRes int i);

    void setToolbarText(@StringRes int i);

    void showAccountHideFailed();

    void showConfirmDialog(@NonNull Type type);

    void showPauseDialog(@StringRes int i);

    void showReasons(List<ExitSurveyReason> list);
}
