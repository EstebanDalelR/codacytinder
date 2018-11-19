package com.evernote.android.job;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public interface JobCreator {

    public static abstract class AddJobCreatorReceiver extends BroadcastReceiver {
        /* renamed from: a */
        protected abstract void m3696a(@NonNull Context context, @NonNull C1139e c1139e);
    }

    @Nullable
    Job create(@NonNull String str);
}
