package com.google.android.gms.gcm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.iid.zzb;
import com.tinder.api.ManagerWebServices;
import java.util.Iterator;

public class GcmListenerService extends zzb {
    static void zzq(Bundle bundle) {
        Iterator it = bundle.keySet().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str != null && str.startsWith("google.c.")) {
                it.remove();
            }
        }
    }

    public void handleIntent(Intent intent) {
        String stringExtra;
        if ("com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction())) {
            stringExtra = intent.getStringExtra("message_type");
            if (stringExtra == null) {
                stringExtra = "gcm";
            }
            Object obj = -1;
            int hashCode = stringExtra.hashCode();
            Object obj2 = 1;
            if (hashCode != -2062414158) {
                if (hashCode != 102161) {
                    if (hashCode != 814694033) {
                        if (hashCode == 814800675) {
                            if (stringExtra.equals("send_event")) {
                                obj = 2;
                            }
                        }
                    } else if (stringExtra.equals("send_error")) {
                        obj = 3;
                    }
                } else if (stringExtra.equals("gcm")) {
                    obj = null;
                }
            } else if (stringExtra.equals("deleted_messages")) {
                obj = 1;
            }
            switch (obj) {
                case null:
                    Bundle extras = intent.getExtras();
                    extras.remove("message_type");
                    extras.remove("android.support.content.wakelockid");
                    if (!"1".equals(C2547d.m9281a(extras, "gcm.n.e"))) {
                        if (C2547d.m9281a(extras, "gcm.n.icon") == null) {
                            obj2 = null;
                        }
                    }
                    if (obj2 != null) {
                        if (C2547d.m9284b((Context) this)) {
                            C2547d.m9282a(extras);
                        } else {
                            C2547d.m9280a((Context) this).m9286b(extras);
                            return;
                        }
                    }
                    stringExtra = extras.getString(ManagerWebServices.PARAM_FROM);
                    extras.remove(ManagerWebServices.PARAM_FROM);
                    zzq(extras);
                    onMessageReceived(stringExtra, extras);
                    return;
                case 1:
                    onDeletedMessages();
                    return;
                case 2:
                    onMessageSent(intent.getStringExtra("google.message_id"));
                    return;
                case 3:
                    stringExtra = intent.getStringExtra("google.message_id");
                    if (stringExtra == null) {
                        stringExtra = intent.getStringExtra("message_id");
                    }
                    onSendError(stringExtra, intent.getStringExtra("error"));
                    return;
                default:
                    String str = "GcmListenerService";
                    String str2 = "Received message with unknown type: ";
                    stringExtra = String.valueOf(stringExtra);
                    Log.w(str, stringExtra.length() != 0 ? str2.concat(stringExtra) : new String(str2));
                    return;
            }
        }
        stringExtra = "GcmListenerService";
        str2 = "Unknown intent action: ";
        str = String.valueOf(intent.getAction());
        Log.w(stringExtra, str.length() != 0 ? str2.concat(str) : new String(str2));
    }

    public void onDeletedMessages() {
    }

    public void onMessageReceived(String str, Bundle bundle) {
    }

    public void onMessageSent(String str) {
    }

    public void onSendError(String str, String str2) {
    }
}
