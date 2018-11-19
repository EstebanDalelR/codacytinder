package com.leanplum.p069a;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.leanplum.ActionContext;
import com.leanplum.Leanplum;
import com.leanplum.LeanplumLocalPushListenerService;
import com.leanplum.callbacks.ActionCallback;
import com.leanplum.utils.SharedPreferencesUtil;

/* renamed from: com.leanplum.a.d$2 */
final class d$2 extends ActionCallback {
    /* renamed from: a */
    private /* synthetic */ C2587d f25532a;

    d$2(C2587d c2587d) {
    }

    public final boolean onResponse(ActionContext actionContext) {
        try {
            actionContext = actionContext.getMessageId();
            Context context = Leanplum.getContext();
            SharedPreferences sharedPreferences = context.getSharedPreferences("__leanplum_messaging__", 0);
            String format = String.format("__leanplum_local_message_%s", new Object[]{actionContext});
            long j = sharedPreferences.getLong(format, 0);
            Editor edit = sharedPreferences.edit();
            edit.remove(format);
            SharedPreferencesUtil.commitChanges(edit);
            ((AlarmManager) context.getSystemService("alarm")).cancel(PendingIntent.getService(context, actionContext.hashCode(), new Intent(context, LeanplumLocalPushListenerService.class), 134217728));
            actionContext = j > System.currentTimeMillis() ? true : null;
            if (actionContext != null) {
                ao.c(new Object[]{"Cancelled notification"});
            }
            return actionContext;
        } catch (ActionContext actionContext2) {
            bo.a(actionContext2);
            return false;
        }
    }
}
