package com.tinder.match.dialog;

import android.support.annotation.NonNull;
import com.tinder.itsamatch.ItsAMatchDialogModel;

public interface ItsAMatchDialogLauncherTarget {
    void showMatchedDialog(@NonNull ItsAMatchDialogModel itsAMatchDialogModel);
}
