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
import java.io.Serializable;
import java.util.Map;

/* renamed from: com.leanplum.a.d$1 */
final class d$1 extends ActionCallback {
    /* renamed from: a */
    private /* synthetic */ C2587d f25531a;

    d$1(C2587d c2587d) {
    }

    public final boolean onResponse(ActionContext actionContext) {
        ActionContext actionContext2 = actionContext;
        try {
            Object valueOf;
            Object[] objArr;
            String messageId = actionContext.getMessageId();
            if (actionContext.a()) {
                valueOf = Double.valueOf(5.0d);
            } else {
                Map map = (Map) bq.b().get(messageId);
                if (map == null) {
                    objArr = new Object[1];
                    StringBuilder stringBuilder = new StringBuilder("Could not find message options for ID ");
                    stringBuilder.append(messageId);
                    objArr[0] = stringBuilder.toString();
                    ao.a(objArr);
                    return false;
                }
                valueOf = map.get("countdown");
            }
            if (valueOf instanceof Number) {
                long currentTimeMillis = System.currentTimeMillis() + (((Number) valueOf).longValue() * 1000);
                Context context = Leanplum.getContext();
                Intent intent = new Intent(context, LeanplumLocalPushListenerService.class);
                AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
                SharedPreferences sharedPreferences = context.getSharedPreferences("__leanplum_messaging__", 0);
                long j = sharedPreferences.getLong(String.format("__leanplum_local_message_%s", new Object[]{messageId}), 0);
                if (j > 0 && j > System.currentTimeMillis()) {
                    if (j < currentTimeMillis) {
                        return false;
                    }
                    if (j >= currentTimeMillis) {
                        alarmManager.cancel(PendingIntent.getService(context, messageId.hashCode(), intent, 134217728));
                    }
                }
                Map map2 = (Map) actionContext2.objectNamed("Advanced options.Data");
                if (map2 != null) {
                    for (String str : map2.keySet()) {
                        intent.putExtra(str, (Serializable) map2.get(str));
                    }
                }
                String stringNamed = actionContext2.stringNamed("Open action");
                boolean equals = Boolean.TRUE.equals(actionContext2.objectNamed("Advanced options.Mute inside app"));
                if (stringNamed != null) {
                    if (equals) {
                        intent.putExtra("_lpu", messageId);
                    } else {
                        intent.putExtra("_lpm", messageId);
                    }
                } else if (equals) {
                    intent.putExtra("_lpv", messageId);
                } else {
                    intent.putExtra("_lpn", messageId);
                }
                stringNamed = actionContext2.stringNamed("Message");
                String str2 = "lp_message";
                if (stringNamed == null) {
                    stringNamed = "Push message goes here.";
                }
                intent.putExtra(str2, stringNamed);
                stringNamed = actionContext2.stringNamed("Android options.Collapse key");
                if (stringNamed != null) {
                    intent.putExtra("collapseKey", stringNamed);
                }
                if (Boolean.TRUE.equals(actionContext2.objectNamed("Android options.Delay while idle"))) {
                    intent.putExtra("delayWhileIdle", true);
                }
                alarmManager.set(0, currentTimeMillis, PendingIntent.getService(context, messageId.hashCode(), intent, 134217728));
                Editor edit = sharedPreferences.edit();
                edit.putLong(String.format("__leanplum_local_message_%s", new Object[]{messageId}), currentTimeMillis);
                SharedPreferencesUtil.commitChanges(edit);
                ao.c(new Object[]{"Scheduled notification"});
                return true;
            }
            objArr = new Object[1];
            StringBuilder stringBuilder2 = new StringBuilder("Invalid notification countdown: ");
            stringBuilder2.append(valueOf);
            objArr[0] = stringBuilder2.toString();
            ao.a(objArr);
            return false;
        } catch (Throwable th) {
            bo.a(th);
            return false;
        }
    }
}
