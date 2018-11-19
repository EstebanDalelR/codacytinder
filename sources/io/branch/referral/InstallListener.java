package io.branch.referral;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import io.branch.referral.Defines.Jsonkey;
import java.net.URLDecoder;
import java.util.HashMap;

public class InstallListener extends BroadcastReceiver {
    /* renamed from: a */
    static boolean f48133a = false;
    /* renamed from: b */
    private static String f48134b = "bnc_no_value";
    /* renamed from: c */
    private static InstallListener$a f48135c;
    /* renamed from: d */
    private static boolean f48136d;
    /* renamed from: e */
    private static boolean f48137e;

    /* renamed from: io.branch.referral.InstallListener$1 */
    static class C155681 implements Runnable {
        C155681() {
        }

        public void run() {
            InstallListener.m58222e();
        }
    }

    /* renamed from: io.branch.referral.InstallListener$b */
    private static class C15569b {
        /* renamed from: a */
        private Object f48131a;
        /* renamed from: b */
        private Context f48132b;

        /* renamed from: io.branch.referral.InstallListener$b$1 */
        class C173011 implements InstallReferrerStateListener {
            /* renamed from: a */
            final /* synthetic */ C15569b f52976a;

            C173011(C15569b c15569b) {
                this.f52976a = c15569b;
            }

            public void onInstallReferrerSetupFinished(int i) {
                switch (i) {
                    case 0:
                        try {
                            if (this.f52976a.f48131a != 0) {
                                long c;
                                long j;
                                String str;
                                i = ((InstallReferrerClient) this.f52976a.f48131a).b();
                                if (i != 0) {
                                    String a = i.a();
                                    long b = i.b();
                                    c = i.c();
                                    j = b;
                                    str = a;
                                } else {
                                    c = 0;
                                    str = null;
                                    j = c;
                                }
                                InstallListener.m58218b(this.f52976a.f48132b, str, j, c);
                                return;
                            }
                            return;
                        } catch (int i2) {
                            C15593m.m58390b("BranchSDK", i2.getMessage());
                            InstallListener.m58221d();
                            return;
                        }
                    case 1:
                        InstallListener.m58221d();
                        return;
                    case 2:
                        InstallListener.m58221d();
                        return;
                    default:
                        return;
                }
            }

            public void onInstallReferrerServiceDisconnected() {
                InstallListener.m58221d();
            }
        }

        private C15569b(Context context) {
            this.f48132b = context;
        }

        /* renamed from: a */
        private boolean m58210a() {
            try {
                InstallReferrerClient a = InstallReferrerClient.a(this.f48132b).a();
                this.f48131a = a;
                a.a(new C173011(this));
                return true;
            } catch (Throwable th) {
                C15593m.m58390b("BranchSDK", th.getMessage());
                return false;
            }
        }
    }

    /* renamed from: a */
    public static void m58215a(Context context, long j, InstallListener$a installListener$a) {
        f48135c = installListener$a;
        if (f48133a != null) {
            m58222e();
            return;
        }
        f48136d = true;
        f48137e = new C15569b(context).m58210a();
        new Handler().postDelayed(new C155681(), j);
    }

    public void onReceive(Context context, Intent intent) {
        m58220c(context, intent.getStringExtra("referrer"), 0, 0);
        if (f48136d != null && f48137e == null) {
            m58222e();
        }
    }

    /* renamed from: b */
    private static void m58218b(Context context, String str, long j, long j2) {
        m58220c(context, str, j, j2);
        if (f48136d != null) {
            m58222e();
        }
    }

    /* renamed from: d */
    private static void m58221d() {
        f48137e = false;
    }

    /* renamed from: c */
    private static void m58220c(Context context, String str, long j, long j2) {
        context = C15593m.m58388a(context);
        if (j > 0) {
            context.m58408a("bnc_referrer_click_ts", j);
        }
        if (j2 > 0) {
            context.m58408a("bnc_install_begin_ts", j2);
        }
        if (str != null) {
            try {
                str = URLDecoder.decode(str, "UTF-8");
                j = new HashMap();
                for (String str2 : str.split("&")) {
                    if (!TextUtils.isEmpty(str2)) {
                        String str3 = "=";
                        if (!str2.contains("=") && str2.contains("-")) {
                            str3 = "-";
                        }
                        String[] split = str2.split(str3);
                        if (split.length > 1) {
                            j.put(URLDecoder.decode(split[0], "UTF-8"), URLDecoder.decode(split[1], "UTF-8"));
                        }
                    }
                }
                if (j.containsKey(Jsonkey.LinkClickID.getKey())) {
                    f48134b = (String) j.get(Jsonkey.LinkClickID.getKey());
                    context.m58434j(f48134b);
                }
                if (j.containsKey(Jsonkey.IsFullAppConv.getKey()) && j.containsKey(Jsonkey.ReferringLink.getKey())) {
                    context.m58414b(Boolean.parseBoolean((String) j.get(Jsonkey.IsFullAppConv.getKey())));
                    context.m58440m((String) j.get(Jsonkey.ReferringLink.getKey()));
                }
                if (j.containsKey(Jsonkey.GoogleSearchInstallReferrer.getKey())) {
                    context.m58436k((String) j.get(Jsonkey.GoogleSearchInstallReferrer.getKey()));
                    context.m58437l(str);
                }
            } catch (Context context2) {
                context2.printStackTrace();
            } catch (Context context22) {
                context22.printStackTrace();
                Log.w("BranchSDK", "Illegal characters in url encoded string");
            }
        }
    }

    /* renamed from: a */
    public static String m58214a() {
        return f48134b;
    }

    /* renamed from: e */
    private static void m58222e() {
        f48133a = true;
        if (f48135c != null) {
            f48135c.f();
            f48135c = null;
            f48133a = false;
            f48136d = false;
            f48137e = false;
        }
    }
}
