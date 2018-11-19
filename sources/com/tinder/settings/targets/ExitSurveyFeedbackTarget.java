package com.tinder.settings.targets;

import android.support.annotation.StringRes;
import com.tinder.settings.model.ExitSurveyDetailReason;
import com.tinder.settings.views.DeleteConfirmDialog.Type;
import java.util.List;

public interface ExitSurveyFeedbackTarget {
    void closeView(int i);

    void disableSubmitButton();

    void enableSubmitButton();

    void hideReasons();

    void setConfirmButtonText(@StringRes int i);

    void setSubtitleText(@StringRes int i);

    void setTextInputTitle(@StringRes int i);

    void setTitleText(@StringRes int i);

    void showAccountHideFailed();

    void showConfirmDialog(Type type);

    void showPauseDialog(@StringRes int i);

    void showReasons(List<? extends ExitSurveyDetailReason> list);

    void showTextInputField(boolean z);
}
