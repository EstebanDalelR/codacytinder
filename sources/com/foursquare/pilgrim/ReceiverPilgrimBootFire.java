package com.foursquare.pilgrim;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.WakefulBroadcastReceiver;
import com.foursquare.internal.util.FsLog;

public class ReceiverPilgrimBootFire extends WakefulBroadcastReceiver {
    public static final String TAG = "ReceiverPilgrimBootFire";

    public void onReceive(Context context, Intent intent) {
        String str = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(TAG);
        stringBuilder.append(" fired!");
        FsLog.m6800a(str, stringBuilder.toString());
        try {
            if (!C1971b.m7063b()) {
                if (!ax.m7003a().m7047q()) {
                    Intent intent2 = new Intent(context, PilgrimBootService.class);
                    intent2.putExtras(intent);
                    C1993z.m7175a(context, intent2);
                    return;
                }
            }
            C3556l.m13403a(intent.getBooleanExtra(PilgrimBootService.EXTRA_RESTART, false), intent.getBooleanExtra(PilgrimBootService.EXTRA_REGISTER, false), intent.getBooleanExtra(PilgrimBootService.EXTRA_CLEAR_MOTION_STATE, false)).m3756D();
        } catch (Context context2) {
            new RealExceptionReporter().reportException(context2);
        }
    }
}
