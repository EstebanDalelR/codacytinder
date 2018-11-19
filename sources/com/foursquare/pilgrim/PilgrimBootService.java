package com.foursquare.pilgrim;

import android.app.IntentService;
import android.content.Intent;
import com.foursquare.internal.util.FsLog;
import com.foursquare.pilgrim.PilgrimSdk.LogLevel;

public class PilgrimBootService extends IntentService {
    public static final String EXTRA_CLEAR_MOTION_STATE;
    public static final String EXTRA_REGISTER;
    public static final String EXTRA_RESTART;
    /* renamed from: a */
    private static final String f5242a = "PilgrimBootService";

    static {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(f5242a);
        stringBuilder.append(".EXTRA_REGISTER");
        EXTRA_REGISTER = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(f5242a);
        stringBuilder.append(".EXTRA_RESTART");
        EXTRA_RESTART = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(f5242a);
        stringBuilder.append(".EXTRA_CLEAR_MOTION_STATE");
        EXTRA_CLEAR_MOTION_STATE = stringBuilder.toString();
    }

    public PilgrimBootService() {
        this(f5242a);
    }

    public PilgrimBootService(String str) {
        super(f5242a);
        setIntentRedelivery(true);
    }

    protected void onHandleIntent(Intent intent) {
        FsLog.m6800a(f5242a, "Doing boot service work!");
        if (intent == null) {
            C1993z.m7176a(intent);
            return;
        }
        try {
            new at(this).m6972a(intent.getBooleanExtra(EXTRA_REGISTER, false), intent.getBooleanExtra(EXTRA_RESTART, false), intent.getBooleanExtra(EXTRA_CLEAR_MOTION_STATE, false));
        } catch (Throwable e) {
            PilgrimSdk.get().log(LogLevel.ERROR, "Error while registering Pilgrim", e);
        } catch (Throwable th) {
            C1993z.m7176a(intent);
        }
        C1993z.m7176a(intent);
    }
}
