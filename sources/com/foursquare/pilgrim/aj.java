package com.foursquare.pilgrim;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import com.foursquare.internal.util.FsLog;
import java.util.Random;

final class aj {
    /* renamed from: a */
    static final Random f5294a = new Random();
    /* renamed from: e */
    private static final String f5295e = "aj";
    /* renamed from: f */
    private static aj f5296f;
    @NonNull
    /* renamed from: b */
    final C1979c f5297b;
    @NonNull
    /* renamed from: c */
    final as f5298c;
    @NonNull
    /* renamed from: d */
    final PilgrimLogger f5299d;

    @NonNull
    /* renamed from: a */
    static synchronized aj m6921a() {
        aj ajVar;
        synchronized (aj.class) {
            ajVar = f5296f;
            if (ajVar == null) {
                throw new IllegalStateException("Pilgrim SDK was not initialized properly! Did you modify the AndroidManifest.xml to remove Pilgrim's ContentProvider?");
            }
        }
        return ajVar;
    }

    /* renamed from: a */
    static synchronized void m6924a(@NonNull aj ajVar) {
        synchronized (aj.class) {
            if (f5296f != null) {
                FsLog.m6805c(f5295e, "Pilgrim.instance was already set");
                return;
            }
            f5296f = ajVar;
        }
    }

    /* renamed from: a */
    static void m6923a(Context context, boolean z) {
        Intent intent = new Intent(context, ReceiverPilgrimBootFire.class);
        intent.putExtra(PilgrimBootService.EXTRA_REGISTER, z);
        try {
            PendingIntent.getBroadcast(context, false, intent, 134217728).send();
        } catch (Context context2) {
            z = f5295e;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error sending pilgrimbootservice broadcast ");
            stringBuilder.append(context2.getMessage());
            FsLog.m6807d(z, stringBuilder.toString());
        }
    }

    /* renamed from: a */
    static void m6922a(Context context) {
        m6925b(context, false);
    }

    /* renamed from: b */
    static void m6925b(Context context, boolean z) {
        try {
            Intent intent = new Intent(context, ReceiverPilgrimBootFire.class);
            intent.putExtra(PilgrimBootService.EXTRA_REGISTER, true);
            intent.putExtra(PilgrimBootService.EXTRA_RESTART, true);
            intent.putExtra(PilgrimBootService.EXTRA_CLEAR_MOTION_STATE, z);
            PendingIntent.getBroadcast(context, false, intent, 134217728).send();
        } catch (Context context2) {
            z = f5295e;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error sending pilgrimbootservice broadcast ");
            stringBuilder.append(context2.getMessage());
            FsLog.m6807d(z, stringBuilder.toString());
            new RealExceptionReporter().reportException(context2);
        }
    }

    /* renamed from: b */
    static boolean m6926b() {
        return 16 > VERSION.SDK_INT;
    }

    aj(@NonNull C1979c c1979c, @NonNull as asVar, @NonNull PilgrimLogger pilgrimLogger) {
        this.f5297b = c1979c;
        this.f5298c = asVar;
        this.f5299d = pilgrimLogger;
    }

    @NonNull
    /* renamed from: c */
    C1979c m6927c() {
        return this.f5297b;
    }
}
