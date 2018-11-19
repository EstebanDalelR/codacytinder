package com.leanplum;

import android.app.IntentService;
import android.content.Intent;
import com.google.android.gms.location.C4484d;
import com.leanplum.p069a.C2587d;
import com.leanplum.p069a.ao;
import com.leanplum.p069a.bo;

public class ReceiveTransitionsIntentService extends IntentService {
    public ReceiveTransitionsIntentService() {
        super("ReceiveTransitionsIntentService");
    }

    protected void onHandleIntent(Intent intent) {
        try {
            intent = C4484d.m20351a(intent);
            if (intent.m20352a()) {
                intent = intent.m20353b();
                Object[] objArr = new Object[1];
                StringBuilder stringBuilder = new StringBuilder("Location Client Error with code: ");
                stringBuilder.append(intent);
                objArr[0] = stringBuilder.toString();
                ao.f(objArr);
                return;
            }
            int c = intent.m20354c();
            intent = intent.m20355d();
            if (c == 1 || c == 2) {
                LocationManagerImplementation locationManagerImplementation = (LocationManagerImplementation) C2587d.b();
                if (locationManagerImplementation != null) {
                    locationManagerImplementation.updateStatusForGeofences(intent, c);
                }
            }
        } catch (Intent intent2) {
            bo.a(intent2);
        }
    }
}
