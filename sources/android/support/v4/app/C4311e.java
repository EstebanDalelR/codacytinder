package android.support.v4.app;

import android.content.Intent;
import android.content.IntentSender;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;

@RestrictTo({Scope.LIBRARY_GROUP})
/* renamed from: android.support.v4.app.e */
abstract class C4311e extends C4016d {
    boolean mStartedActivityFromFragment;

    C4311e() {
    }

    @RequiresApi(16)
    public void startActivityForResult(Intent intent, int i, @Nullable Bundle bundle) {
        if (!(this.mStartedActivityFromFragment || i == -1)) {
            C4016d.checkForValidRequestCode(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    @RequiresApi(16)
    public void startIntentSenderForResult(IntentSender intentSender, int i, @Nullable Intent intent, int i2, int i3, int i4, Bundle bundle) throws SendIntentException {
        if (!(this.mStartedIntentSenderFromFragment || i == -1)) {
            C4016d.checkForValidRequestCode(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
