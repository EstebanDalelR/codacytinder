package com.facebook.accountkit.internal;

import java.util.HashMap;

class FacebookAppEventLogger$1 extends HashMap<String, String> {
    FacebookAppEventLogger$1() {
        put("ak_email_login_view", "fb_ak_login_dialog_impression");
        put("ak_phone_login_view", "fb_ak_login_dialog_impression");
        put("ak_login_start", "fb_ak_login_start");
        put("ak_login_verify", "fb_ak_login_attempt");
        put("ak_seamless_pending", "fb_ak_login_attempt");
        put("ak_login_complete", "fb_ak_login_complete");
    }
}
