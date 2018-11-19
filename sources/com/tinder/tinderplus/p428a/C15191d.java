package com.tinder.tinderplus.p428a;

import android.app.Activity;
import android.support.annotation.NonNull;
import com.tinder.R;
import com.tinder.api.ManagerWebServices;
import com.tinder.listeners.ListenerUpdateProfileInfo;
import com.tinder.managers.ManagerAnalytics;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.ManagerProfile;
import com.tinder.managers.bj;
import com.tinder.model.SparksEvent;
import com.tinder.utils.ad;
import com.tinder.utils.at;
import javax.inject.Inject;

/* renamed from: com.tinder.tinderplus.a.d */
public class C15191d {
    /* renamed from: a */
    private final ManagerProfile f47241a;
    /* renamed from: b */
    private final bj f47242b;
    /* renamed from: c */
    private final ManagerAnalytics f47243c;

    /* renamed from: com.tinder.tinderplus.a.d$a */
    public static class C16926a implements ListenerUpdateProfileInfo {
        /* renamed from: a */
        String f52145a;

        public void onProfileUpdateSuccess() {
        }

        public C16926a(String str) {
            this.f52145a = str;
        }

        public void onProfileUpdateFailed() {
            if (ManagerApp.b() instanceof Activity) {
                at.m57640a((Activity) ManagerApp.b(), ManagerApp.b().getString(R.string.error_profile_update));
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to update feature: ");
            stringBuilder.append(this.f52145a);
            ad.a(stringBuilder.toString());
        }
    }

    @Inject
    public C15191d(ManagerProfile managerProfile, bj bjVar, ManagerAnalytics managerAnalytics) {
        this.f47241a = managerProfile;
        this.f47242b = bjVar;
        this.f47243c = managerAnalytics;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public void m57108a(@android.support.annotation.NonNull java.lang.String r7, @android.support.annotation.NonNull com.tinder.tinderplus.p428a.C15191d.C16926a r8) {
        /*
        r6 = this;
        r0 = r7.hashCode();
        r1 = 4;
        r2 = 3;
        r3 = 1;
        r4 = 0;
        r5 = 2;
        switch(r0) {
            case -2023617739: goto L_0x003f;
            case -1249477246: goto L_0x0035;
            case 102974381: goto L_0x002b;
            case 281977195: goto L_0x0021;
            case 1030823318: goto L_0x0017;
            case 1082295151: goto L_0x000d;
            default: goto L_0x000c;
        };
    L_0x000c:
        goto L_0x0049;
    L_0x000d:
        r0 = "recency";
        r7 = r7.equals(r0);
        if (r7 == 0) goto L_0x0049;
    L_0x0015:
        r7 = 5;
        goto L_0x004a;
    L_0x0017:
        r0 = "outside_fb";
        r7 = r7.equals(r0);
        if (r7 == 0) goto L_0x0049;
    L_0x001f:
        r7 = 2;
        goto L_0x004a;
    L_0x0021:
        r0 = "everyone";
        r7 = r7.equals(r0);
        if (r7 == 0) goto L_0x0049;
    L_0x0029:
        r7 = 0;
        goto L_0x004a;
    L_0x002b:
        r0 = "liked";
        r7 = r7.equals(r0);
        if (r7 == 0) goto L_0x0049;
    L_0x0033:
        r7 = 1;
        goto L_0x004a;
    L_0x0035:
        r0 = "optimal";
        r7 = r7.equals(r0);
        if (r7 == 0) goto L_0x0049;
    L_0x003d:
        r7 = 3;
        goto L_0x004a;
    L_0x003f:
        r0 = "popularity";
        r7 = r7.equals(r0);
        if (r7 == 0) goto L_0x0049;
    L_0x0047:
        r7 = 4;
        goto L_0x004a;
    L_0x0049:
        r7 = -1;
    L_0x004a:
        r0 = 7;
        switch(r7) {
            case 0: goto L_0x0083;
            case 1: goto L_0x0078;
            case 2: goto L_0x006d;
            case 3: goto L_0x0062;
            case 4: goto L_0x005a;
            case 5: goto L_0x004f;
            default: goto L_0x004e;
        };
    L_0x004e:
        goto L_0x008d;
    L_0x004f:
        r7 = r6.f47241a;
        r2 = "recency";
        r7.a(r2, r8);
        r6.m57107a(r0, r1);
        goto L_0x008d;
    L_0x005a:
        r7 = r6.f47241a;
        r0 = "popularity";
        r7.a(r0, r8);
        goto L_0x008d;
    L_0x0062:
        r7 = r6.f47241a;
        r1 = "optimal";
        r7.a(r1, r8);
        r6.m57107a(r0, r2);
        goto L_0x008d;
    L_0x006d:
        r7 = r6.f47241a;
        r1 = "outside_fb";
        r7.b(r1, r8);
        r6.m57107a(r0, r5);
        goto L_0x008d;
    L_0x0078:
        r7 = r6.f47241a;
        r1 = "liked";
        r7.b(r1, r8);
        r6.m57107a(r0, r3);
        goto L_0x008d;
    L_0x0083:
        r7 = r6.f47241a;
        r1 = "everyone";
        r7.b(r1, r8);
        r6.m57107a(r0, r4);
    L_0x008d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.tinderplus.a.d.a(java.lang.String, com.tinder.tinderplus.a.d$a):void");
    }

    /* renamed from: a */
    public void m57110a(boolean z, @NonNull String str, @NonNull C16926a c16926a) {
        int hashCode = str.hashCode();
        if (hashCode != -1773595597) {
            if (hashCode != -1773595518) {
                if (hashCode == -1375884718) {
                    if (str.equals(ManagerWebServices.PARAM_HIDE_DISTANCE) != null) {
                        str = true;
                        switch (str) {
                            case null:
                                this.f47241a.c(z, c16926a);
                                m57107a(7, z ? true : true);
                                return;
                            case 1:
                                this.f47241a.b(z, c16926a);
                                m57107a(7, z ? true : true);
                                return;
                            case 2:
                                this.f47241a.d(z, c16926a);
                                m57107a(7, z ? true : true);
                                return;
                            default:
                                return;
                        }
                    }
                }
            } else if (str.equals(ManagerWebServices.PARAM_HIDE_AGE) != null) {
                str = null;
                switch (str) {
                    case null:
                        this.f47241a.c(z, c16926a);
                        if (z) {
                        }
                        m57107a(7, z ? true : true);
                        return;
                    case 1:
                        this.f47241a.b(z, c16926a);
                        if (z) {
                        }
                        m57107a(7, z ? true : true);
                        return;
                    case 2:
                        this.f47241a.d(z, c16926a);
                        if (z) {
                        }
                        m57107a(7, z ? true : true);
                        return;
                    default:
                        return;
                }
            }
        } else if (str.equals(ManagerWebServices.PARAM_HIDE_ADS) != null) {
            str = 2;
            switch (str) {
                case null:
                    this.f47241a.c(z, c16926a);
                    if (z) {
                    }
                    m57107a(7, z ? true : true);
                    return;
                case 1:
                    this.f47241a.b(z, c16926a);
                    if (z) {
                    }
                    m57107a(7, z ? true : true);
                    return;
                case 2:
                    this.f47241a.d(z, c16926a);
                    if (z) {
                    }
                    m57107a(7, z ? true : true);
                    return;
                default:
                    return;
            }
        }
        str = -1;
        switch (str) {
            case null:
                this.f47241a.c(z, c16926a);
                if (z) {
                }
                m57107a(7, z ? true : true);
                return;
            case 1:
                this.f47241a.b(z, c16926a);
                if (z) {
                }
                m57107a(7, z ? true : true);
                return;
            case 2:
                this.f47241a.d(z, c16926a);
                if (z) {
                }
                m57107a(7, z ? true : true);
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    protected void m57107a(int i, int i2) {
        this.f47243c.a(new SparksEvent("UserInteraction.Settings").put("category", i).put("subcategory", i2));
    }

    /* renamed from: a */
    public void m57109a(boolean z) {
        this.f47242b.f(z);
    }
}
