package com.foursquare.pilgrim;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.foursquare.api.types.GoogleMotionReading;
import com.foursquare.internal.util.FsLog;
import com.google.android.gms.location.ActivityRecognitionResult;

public class ReceiverPilgrimActivityRecognitionFire extends BroadcastReceiver {
    public static final String TAG = "ReceiverPilgrimActivityRecognitionFire";

    public void onReceive(Context context, Intent intent) {
        context = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(TAG);
        stringBuilder.append(" fired!");
        FsLog.m6800a(context, stringBuilder.toString());
        try {
            context = ActivityRecognitionResult.extractResult(intent).getMostProbableActivity();
            if (context != null) {
                intent = TAG;
                stringBuilder = new StringBuilder();
                stringBuilder.append("Detected activity ");
                stringBuilder.append(context);
                FsLog.m6800a(intent, stringBuilder.toString());
                context = context.getType();
                long currentTimeMillis = System.currentTimeMillis();
                bi.f5362a.f5363b = GoogleMotionReading.from(currentTimeMillis, context);
            }
        } catch (Context context2) {
            new RealExceptionReporter().reportException(context2);
        }
    }
}
