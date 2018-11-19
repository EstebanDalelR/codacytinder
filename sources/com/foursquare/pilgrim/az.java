package com.foursquare.pilgrim;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;

abstract class az extends BroadcastReceiver {
    @NonNull
    protected abstract String getExpectedIntentString();

    protected abstract void onIntentReceived(@NonNull Context context, @NonNull Intent intent);

    az() {
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent != null && getExpectedIntentString().equals(intent.getAction())) {
            onIntentReceived(context, intent);
        }
    }
}
