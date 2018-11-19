package com.leanplum.messagetemplates;

import android.content.Context;
import com.leanplum.ActionArgs;
import com.leanplum.Leanplum;
import com.leanplum.messagetemplates.C5748a.C70601;
import com.leanplum.messagetemplates.C5753f.C70621;

public class MessageTemplates {
    /* renamed from: a */
    private static boolean f8128a = false;

    /* renamed from: a */
    static String m9744a(Context context) {
        int i = context.getApplicationInfo().labelRes;
        if (i == 0) {
            return context.getApplicationInfo().loadLabel(context.getPackageManager()).toString();
        }
        return context.getString(i);
    }

    public static synchronized void register(Context context) {
        synchronized (MessageTemplates.class) {
            if (f8128a) {
                return;
            }
            f8128a = true;
            Leanplum.defineAction("Open URL", 2, new ActionArgs().with("URL", "http://www.example.com"), new C70621());
            Alert.register(context);
            Leanplum.defineAction("Confirm", 3, new ActionArgs().with("Title", m9744a(context)).with("Message", "Confirmation message goes here.").with("Accept text", "Yes").with("Cancel text", "No").withAction("Accept action", null).withAction("Cancel action", null), new C70601());
            CenterPopup.register(context);
            Interstitial.register(context);
            WebInterstitial.register();
            HTMLTemplate.register();
        }
    }
}
