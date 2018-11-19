package com.google.android.m4b.maps.p110j;

import android.content.Context;
import com.google.android.m4b.maps.C4513R;
import com.google.android.m4b.maps.p113m.C5478e;

/* renamed from: com.google.android.m4b.maps.j.g */
public final class C5442g {
    /* renamed from: a */
    public static String m23675a(Context context, int i, String str) {
        context = context.getResources();
        if (i == 5) {
            return context.getString(C4513R.string.common_google_play_services_invalid_account_text);
        }
        if (i == 7) {
            return context.getString(C4513R.string.common_google_play_services_network_error_text);
        }
        if (i == 9) {
            return context.getString(C4513R.string.common_google_play_services_unsupported_text, new Object[]{str});
        } else if (i != 42) {
            switch (i) {
                case 1:
                    if (C5478e.m23834a(context) != 0) {
                        return context.getString(C4513R.string.common_google_play_services_install_text_tablet, new Object[]{str});
                    }
                    return context.getString(C4513R.string.common_google_play_services_install_text_phone, new Object[]{str});
                case 2:
                    return context.getString(C4513R.string.common_google_play_services_update_text, new Object[]{str});
                case 3:
                    return context.getString(C4513R.string.common_google_play_services_enable_text, new Object[]{str});
                default:
                    switch (i) {
                        case 16:
                            return context.getString(C4513R.string.common_google_play_services_api_unavailable_text, new Object[]{str});
                        case 17:
                            return context.getString(C4513R.string.common_google_play_services_sign_in_failed_text);
                        case 18:
                            return context.getString(C4513R.string.common_google_play_services_updating_text, new Object[]{str});
                        default:
                            return context.getString(C4513R.string.common_google_play_services_unknown_issue);
                    }
            }
        } else {
            return context.getString(C4513R.string.common_android_wear_update_text, new Object[]{str});
        }
    }

    /* renamed from: a */
    public static String m23674a(Context context, int i) {
        context = context.getResources();
        if (i != 42) {
            switch (i) {
                case 1:
                    return context.getString(C4513R.string.common_google_play_services_install_button);
                case 2:
                    break;
                case 3:
                    return context.getString(C4513R.string.common_google_play_services_enable_button);
                default:
                    return context.getString(17039370);
            }
        }
        return context.getString(C4513R.string.common_google_play_services_update_button);
    }
}
