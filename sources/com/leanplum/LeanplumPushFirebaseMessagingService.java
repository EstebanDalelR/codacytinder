package com.leanplum;

import android.annotation.SuppressLint;
import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.leanplum.p069a.ao;
import com.leanplum.p069a.bo;
import java.util.Map;
import java.util.Map.Entry;

@SuppressLint({"Registered"})
public class LeanplumPushFirebaseMessagingService extends FirebaseMessagingService {
    public void onMessageReceived(RemoteMessage remoteMessage) {
        try {
            remoteMessage = remoteMessage.getData();
            if (remoteMessage.containsKey("lp_message")) {
                Bundle bundle = new Bundle();
                if (remoteMessage != null) {
                    for (Entry entry : remoteMessage.entrySet()) {
                        bundle.putString((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                LeanplumPushService.a(this, bundle);
            }
            Object[] objArr = new Object[1];
            StringBuilder stringBuilder = new StringBuilder("Received: ");
            stringBuilder.append(remoteMessage.toString());
            objArr[0] = stringBuilder.toString();
            ao.c(objArr);
        } catch (RemoteMessage remoteMessage2) {
            bo.a(remoteMessage2);
        }
    }

    /* renamed from: a */
    private static Bundle m25023a(Map<String, String> map) {
        Bundle bundle = new Bundle();
        if (map != null) {
            map = map.entrySet().iterator();
            while (map.hasNext()) {
                Entry entry = (Entry) map.next();
                bundle.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return bundle;
    }
}
