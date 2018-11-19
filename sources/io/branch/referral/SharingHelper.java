package io.branch.referral;

public class SharingHelper {

    public enum SHARE_WITH {
        FACEBOOK("com.facebook.katana"),
        FACEBOOK_MESSENGER("com.facebook.orca"),
        TWITTER("com.twitter.android"),
        MESSAGE(".mms"),
        EMAIL("com.google.android.email"),
        FLICKR("com.yahoo.mobile.client.android.flickr"),
        GOOGLE_DOC("com.google.android.apps.docs"),
        WHATS_APP("com.whatsapp"),
        PINTEREST("com.pinterest"),
        HANGOUT("com.google.android.talk"),
        INSTAGRAM("com.instagram.android"),
        WECHAT("jom.tencent.mm"),
        SNAPCHAT("com.snapchat.android"),
        GMAIL("com.google.android.gm");
        
        private String name;

        private SHARE_WITH(String str) {
            this.name = "";
            this.name = str;
        }

        public String getAppName() {
            return this.name;
        }

        public String toString() {
            return this.name;
        }
    }
}
