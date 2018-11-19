package com.facebook.accountkit.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.facebook.accountkit.AccessToken;
import com.facebook.accountkit.AccountKit.InitializeCallback;
import com.facebook.accountkit.EmailLoginModel;
import com.facebook.accountkit.PhoneLoginModel;
import com.facebook.accountkit.PhoneNumber;
import com.facebook.accountkit.PhoneUpdateModel;
import com.facebook.accountkit.ui.LoginType;
import com.facebook.accountkit.ui.NotificationChannel;

/* renamed from: com.facebook.accountkit.internal.c */
public final class C1220c {
    /* renamed from: a */
    private static final Initializer f3260a = new Initializer();
    /* renamed from: b */
    private static final C1235k f3261b = new C1235k();

    /* renamed from: com.facebook.accountkit.internal.c$a */
    public static class C1219a {
        /* renamed from: a */
        public static void m4261a(String str, Bundle bundle) {
            C1220c.f3260a.m4222f().m4373a(str, bundle);
        }

        /* renamed from: a */
        public static void m4267a(java.lang.String r2, java.lang.String r3, boolean r4) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r0 = new org.json.JSONObject;
            r0.<init>();
            r1 = "country_code";	 Catch:{ JSONException -> 0x005c }
            r0.put(r1, r2);	 Catch:{ JSONException -> 0x005c }
            r2 = "country_code_source";	 Catch:{ JSONException -> 0x005c }
            r0.put(r2, r3);	 Catch:{ JSONException -> 0x005c }
            r2 = "read_phone_number_permission";	 Catch:{ JSONException -> 0x005c }
            r3 = com.facebook.accountkit.internal.C1220c.f3260a;	 Catch:{ JSONException -> 0x005c }
            r3 = r3.m4218b();	 Catch:{ JSONException -> 0x005c }
            r3 = com.facebook.accountkit.internal.C1251w.m4508c(r3);	 Catch:{ JSONException -> 0x005c }
            if (r3 == 0) goto L_0x0022;	 Catch:{ JSONException -> 0x005c }
        L_0x001f:
            r3 = "true";	 Catch:{ JSONException -> 0x005c }
            goto L_0x0024;	 Catch:{ JSONException -> 0x005c }
        L_0x0022:
            r3 = "false";	 Catch:{ JSONException -> 0x005c }
        L_0x0024:
            r0.put(r2, r3);	 Catch:{ JSONException -> 0x005c }
            r2 = "read_sms_permission";	 Catch:{ JSONException -> 0x005c }
            r3 = com.facebook.accountkit.internal.C1220c.f3260a;	 Catch:{ JSONException -> 0x005c }
            r3 = r3.m4218b();	 Catch:{ JSONException -> 0x005c }
            r3 = com.facebook.accountkit.internal.C1251w.m4504b(r3);	 Catch:{ JSONException -> 0x005c }
            if (r3 == 0) goto L_0x003a;	 Catch:{ JSONException -> 0x005c }
        L_0x0037:
            r3 = "true";	 Catch:{ JSONException -> 0x005c }
            goto L_0x003c;	 Catch:{ JSONException -> 0x005c }
        L_0x003a:
            r3 = "false";	 Catch:{ JSONException -> 0x005c }
        L_0x003c:
            r0.put(r2, r3);	 Catch:{ JSONException -> 0x005c }
            r2 = "sim_locale";	 Catch:{ JSONException -> 0x005c }
            r3 = com.facebook.accountkit.internal.C1220c.f3260a;	 Catch:{ JSONException -> 0x005c }
            r3 = r3.m4218b();	 Catch:{ JSONException -> 0x005c }
            r3 = com.facebook.accountkit.internal.C1251w.m4519h(r3);	 Catch:{ JSONException -> 0x005c }
            r0.put(r2, r3);	 Catch:{ JSONException -> 0x005c }
            r2 = "retry";	 Catch:{ JSONException -> 0x005c }
            if (r4 == 0) goto L_0x0057;	 Catch:{ JSONException -> 0x005c }
        L_0x0054:
            r3 = "true";	 Catch:{ JSONException -> 0x005c }
            goto L_0x0059;	 Catch:{ JSONException -> 0x005c }
        L_0x0057:
            r3 = "false";	 Catch:{ JSONException -> 0x005c }
        L_0x0059:
            r0.put(r2, r3);	 Catch:{ JSONException -> 0x005c }
        L_0x005c:
            r2 = com.facebook.accountkit.internal.C1220c.f3260a;
            r2 = r2.m4222f();
            r3 = "ak_phone_login_view";
            r4 = "phone";
            r1 = 1;
            r2.m4379a(r3, r4, r1, r0);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.accountkit.internal.c.a.a(java.lang.String, java.lang.String, boolean):void");
        }

        /* renamed from: a */
        public static void m4268a(boolean r4) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r0 = new org.json.JSONObject;
            r0.<init>();
            r1 = "get_accounts_perm";	 Catch:{ JSONException -> 0x0029 }
            r2 = com.facebook.accountkit.internal.C1220c.f3260a;	 Catch:{ JSONException -> 0x0029 }
            r2 = r2.m4218b();	 Catch:{ JSONException -> 0x0029 }
            r2 = com.facebook.accountkit.internal.C1251w.m4511d(r2);	 Catch:{ JSONException -> 0x0029 }
            if (r2 == 0) goto L_0x0018;	 Catch:{ JSONException -> 0x0029 }
        L_0x0015:
            r2 = "true";	 Catch:{ JSONException -> 0x0029 }
            goto L_0x001a;	 Catch:{ JSONException -> 0x0029 }
        L_0x0018:
            r2 = "false";	 Catch:{ JSONException -> 0x0029 }
        L_0x001a:
            r0.put(r1, r2);	 Catch:{ JSONException -> 0x0029 }
            r1 = "retry";	 Catch:{ JSONException -> 0x0029 }
            if (r4 == 0) goto L_0x0024;	 Catch:{ JSONException -> 0x0029 }
        L_0x0021:
            r4 = "true";	 Catch:{ JSONException -> 0x0029 }
            goto L_0x0026;	 Catch:{ JSONException -> 0x0029 }
        L_0x0024:
            r4 = "false";	 Catch:{ JSONException -> 0x0029 }
        L_0x0026:
            r0.put(r1, r4);	 Catch:{ JSONException -> 0x0029 }
        L_0x0029:
            r4 = com.facebook.accountkit.internal.C1220c.f3260a;
            r4 = r4.m4222f();
            r1 = "ak_email_login_view";
            r2 = "email";
            r3 = 1;
            r4.m4379a(r1, r2, r3, r0);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.accountkit.internal.c.a.a(boolean):void");
        }

        /* renamed from: a */
        public static void m4262a(java.lang.String r2, java.lang.String r3) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r0 = new org.json.JSONObject;
            r0.<init>();
            if (r3 == 0) goto L_0x000c;
        L_0x0007:
            r1 = "link";	 Catch:{ JSONException -> 0x000c }
            r0.put(r1, r3);	 Catch:{ JSONException -> 0x000c }
        L_0x000c:
            r3 = "ak_phone_login_view";
            com.facebook.accountkit.internal.C1220c.C1219a.m4266a(r3, r2, r0);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.accountkit.internal.c.a.a(java.lang.String, java.lang.String):void");
        }

        /* renamed from: a */
        public static void m4263a(java.lang.String r2, java.lang.String r3, com.facebook.accountkit.PhoneNumber r4) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r0 = new org.json.JSONObject;
            r0.<init>();
            r1 = "phone_number_source";	 Catch:{ JSONException -> 0x0013 }
            r0.put(r1, r3);	 Catch:{ JSONException -> 0x0013 }
            r3 = "submitted_phone_number";	 Catch:{ JSONException -> 0x0013 }
            r4 = r4.toString();	 Catch:{ JSONException -> 0x0013 }
            r0.put(r3, r4);	 Catch:{ JSONException -> 0x0013 }
        L_0x0013:
            r3 = "ak_phone_login_view";
            com.facebook.accountkit.internal.C1220c.C1219a.m4266a(r3, r2, r0);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.accountkit.internal.c.a.a(java.lang.String, java.lang.String, com.facebook.accountkit.PhoneNumber):void");
        }

        /* renamed from: a */
        public static void m4265a(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r0 = new org.json.JSONObject;
            r0.<init>();
            r1 = "submitted_email";	 Catch:{ JSONException -> 0x0014 }
            r0.put(r1, r5);	 Catch:{ JSONException -> 0x0014 }
            r5 = "email_app_supplied_use";	 Catch:{ JSONException -> 0x0014 }
            r0.put(r5, r3);	 Catch:{ JSONException -> 0x0014 }
            r3 = "email_selected_use";	 Catch:{ JSONException -> 0x0014 }
            r0.put(r3, r4);	 Catch:{ JSONException -> 0x0014 }
        L_0x0014:
            r3 = "ak_email_login_view";
            com.facebook.accountkit.internal.C1220c.C1219a.m4266a(r3, r2, r0);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.accountkit.internal.c.a.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
        }

        /* renamed from: a */
        public static void m4260a(String str) {
            C1219a.m4266a("ak_email_sent_view", str, null);
        }

        /* renamed from: a */
        public static void m4257a() {
            C1220c.f3260a.m4222f().m4379a("ak_phone_login_view", "phone", false, null);
        }

        /* renamed from: b */
        public static void m4274b(boolean r4) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r0 = new org.json.JSONObject;
            r0.<init>();
            r1 = "retry";	 Catch:{ JSONException -> 0x0011 }
            if (r4 == 0) goto L_0x000c;	 Catch:{ JSONException -> 0x0011 }
        L_0x0009:
            r4 = "true";	 Catch:{ JSONException -> 0x0011 }
            goto L_0x000e;	 Catch:{ JSONException -> 0x0011 }
        L_0x000c:
            r4 = "false";	 Catch:{ JSONException -> 0x0011 }
        L_0x000e:
            r0.put(r1, r4);	 Catch:{ JSONException -> 0x0011 }
        L_0x0011:
            r4 = com.facebook.accountkit.internal.C1220c.f3260a;
            r4 = r4.m4222f();
            r1 = "ak_confirmation_code_view";
            r2 = "phone";
            r3 = 1;
            r4.m4379a(r1, r2, r3, r0);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.accountkit.internal.c.a.b(boolean):void");
        }

        /* renamed from: b */
        public static void m4271b() {
            C1220c.f3260a.m4222f().m4379a("ak_confirmation_code_view", "phone", false, null);
        }

        /* renamed from: b */
        public static void m4273b(java.lang.String r2, @android.support.annotation.Nullable java.lang.String r3) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r0 = new org.json.JSONObject;
            r0.<init>();
            if (r3 == 0) goto L_0x000c;
        L_0x0007:
            r1 = "link";	 Catch:{ JSONException -> 0x000c }
            r0.put(r1, r3);	 Catch:{ JSONException -> 0x000c }
        L_0x000c:
            r3 = "ak_confirmation_code_view";
            com.facebook.accountkit.internal.C1220c.C1219a.m4266a(r3, r2, r0);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.accountkit.internal.c.a.b(java.lang.String, java.lang.String):void");
        }

        /* renamed from: a */
        public static void m4264a(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r0 = new org.json.JSONObject;
            r0.<init>();
            r1 = com.facebook.accountkit.internal.C1251w.m4500a(r3);	 Catch:{ JSONException -> 0x002e }
            if (r1 != 0) goto L_0x0027;	 Catch:{ JSONException -> 0x002e }
        L_0x000b:
            r1 = com.facebook.accountkit.internal.C1251w.m4500a(r4);	 Catch:{ JSONException -> 0x002e }
            if (r1 != 0) goto L_0x002e;	 Catch:{ JSONException -> 0x002e }
        L_0x0011:
            r3 = r3.equals(r4);	 Catch:{ JSONException -> 0x002e }
            if (r3 == 0) goto L_0x001f;	 Catch:{ JSONException -> 0x002e }
        L_0x0017:
            r3 = "confirmation_code";	 Catch:{ JSONException -> 0x002e }
            r4 = "equals";	 Catch:{ JSONException -> 0x002e }
            r0.put(r3, r4);	 Catch:{ JSONException -> 0x002e }
            goto L_0x002e;	 Catch:{ JSONException -> 0x002e }
        L_0x001f:
            r3 = "confirmation_code";	 Catch:{ JSONException -> 0x002e }
            r4 = "notEquals";	 Catch:{ JSONException -> 0x002e }
            r0.put(r3, r4);	 Catch:{ JSONException -> 0x002e }
            goto L_0x002e;	 Catch:{ JSONException -> 0x002e }
        L_0x0027:
            r3 = "confirmation_code";	 Catch:{ JSONException -> 0x002e }
            r4 = "notSupplied";	 Catch:{ JSONException -> 0x002e }
            r0.put(r3, r4);	 Catch:{ JSONException -> 0x002e }
        L_0x002e:
            r3 = "ak_confirmation_code_view";
            com.facebook.accountkit.internal.C1220c.C1219a.m4266a(r3, r2, r0);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.accountkit.internal.c.a.a(java.lang.String, java.lang.String, java.lang.String):void");
        }

        /* renamed from: a */
        public static void m4269a(boolean z, LoginType loginType) {
            C1220c.f3260a.m4222f().m4379a("ak_error_view", loginType.equals(LoginType.PHONE) != null ? "phone" : "email", z, null);
        }

        /* renamed from: b */
        public static void m4272b(String str) {
            C1219a.m4278c("ak_error_view", str);
        }

        /* renamed from: c */
        public static void m4276c() {
            C1219a.m4278c("ak_ui_manager_invalid", null);
        }

        /* renamed from: c */
        public static void m4279c(boolean z) {
            C1220c.f3260a.m4222f().m4379a("ak_resend_view", "phone", z, null);
        }

        /* renamed from: c */
        public static void m4277c(String str) {
            C1219a.m4278c("ak_resend_view", str);
        }

        /* renamed from: d */
        public static void m4282d(String str) {
            C1219a.m4278c("ak_confirm_account_verified_view", str);
        }

        /* renamed from: b */
        public static void m4275b(boolean z, LoginType loginType) {
            C1220c.f3260a.m4222f().m4379a("ak_sending_code_view", loginType.equals(LoginType.PHONE) != null ? "phone" : "email", z, null);
        }

        /* renamed from: c */
        public static void m4280c(boolean z, LoginType loginType) {
            C1220c.f3260a.m4222f().m4379a("ak_sent_code_view", loginType.equals(LoginType.PHONE) != null ? "phone" : "email", z, null);
        }

        /* renamed from: d */
        public static void m4284d(boolean z, LoginType loginType) {
            C1220c.f3260a.m4222f().m4379a("ak_verifying_code_view", loginType.equals(LoginType.PHONE) != null ? "phone" : "email", z, null);
        }

        /* renamed from: e */
        public static void m4286e(boolean z, LoginType loginType) {
            C1220c.f3260a.m4222f().m4379a("ak_verified_code_view", loginType.equals(LoginType.PHONE) != null ? "phone" : "email", z, null);
        }

        /* renamed from: d */
        public static void m4281d() {
            C1220c.f3260a.m4222f().m4379a("ak_email_login_view", "email", false, null);
        }

        /* renamed from: d */
        public static void m4283d(boolean z) {
            C1220c.f3260a.m4222f().m4379a("ak_email_sent_view", "email", z, null);
        }

        /* renamed from: a */
        public static void m4270a(boolean r3, java.lang.String r4) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r0 = new org.json.JSONObject;
            r0.<init>();
            r1 = "country_code";	 Catch:{ JSONException -> 0x000a }
            r0.put(r1, r4);	 Catch:{ JSONException -> 0x000a }
        L_0x000a:
            r4 = com.facebook.accountkit.internal.C1220c.f3260a;
            r4 = r4.m4222f();
            r1 = "ak_country_code_view";
            r2 = "phone";
            r4.m4379a(r1, r2, r3, r0);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.accountkit.internal.c.a.a(boolean, java.lang.String):void");
        }

        /* renamed from: e */
        public static void m4285e(boolean z) {
            C1220c.f3260a.m4222f().m4379a("ak_account_verified_view", "phone", z, null);
        }

        /* renamed from: f */
        public static void m4287f(boolean z) {
            C1220c.f3260a.m4222f().m4379a("ak_confirm_account_verified_view", "phone", z, null);
        }

        /* renamed from: a */
        public static void m4259a(com.facebook.accountkit.ui.UIManager r4) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r0 = new org.json.JSONObject;
            r0.<init>();
            r1 = r4 instanceof com.facebook.accountkit.ui.SkinManager;	 Catch:{ JSONException -> 0x005b }
            if (r1 == 0) goto L_0x000c;	 Catch:{ JSONException -> 0x005b }
        L_0x0009:
            r1 = "SkinManager";	 Catch:{ JSONException -> 0x005b }
            goto L_0x0023;	 Catch:{ JSONException -> 0x005b }
        L_0x000c:
            r1 = r4 instanceof com.facebook.accountkit.ui.AdvancedUIManagerWrapper;	 Catch:{ JSONException -> 0x005b }
            if (r1 == 0) goto L_0x0013;	 Catch:{ JSONException -> 0x005b }
        L_0x0010:
            r1 = "AdvancedUIManager";	 Catch:{ JSONException -> 0x005b }
            goto L_0x0023;	 Catch:{ JSONException -> 0x005b }
        L_0x0013:
            r1 = r4 instanceof com.facebook.accountkit.ui.ThemeUIManager;	 Catch:{ JSONException -> 0x005b }
            if (r1 == 0) goto L_0x001a;	 Catch:{ JSONException -> 0x005b }
        L_0x0017:
            r1 = "ThemeUIManager";	 Catch:{ JSONException -> 0x005b }
            goto L_0x0023;	 Catch:{ JSONException -> 0x005b }
        L_0x001a:
            r1 = r4 instanceof com.facebook.accountkit.ui.BaseUIManager;	 Catch:{ JSONException -> 0x005b }
            if (r1 == 0) goto L_0x0021;	 Catch:{ JSONException -> 0x005b }
        L_0x001e:
            r1 = "BaseUIManager";	 Catch:{ JSONException -> 0x005b }
            goto L_0x0023;	 Catch:{ JSONException -> 0x005b }
        L_0x0021:
            r1 = "UIManager";	 Catch:{ JSONException -> 0x005b }
        L_0x0023:
            r2 = "ui_manager";	 Catch:{ JSONException -> 0x005b }
            r0.put(r2, r1);	 Catch:{ JSONException -> 0x005b }
            r1 = r4 instanceof com.facebook.accountkit.ui.SkinManager;	 Catch:{ JSONException -> 0x005b }
            if (r1 == 0) goto L_0x005b;	 Catch:{ JSONException -> 0x005b }
        L_0x002c:
            r4 = (com.facebook.accountkit.ui.SkinManager) r4;	 Catch:{ JSONException -> 0x005b }
            r1 = "skin_type";	 Catch:{ JSONException -> 0x005b }
            r2 = r4.getSkin();	 Catch:{ JSONException -> 0x005b }
            r0.put(r1, r2);	 Catch:{ JSONException -> 0x005b }
            r1 = "skin_manager_has_background_image";	 Catch:{ JSONException -> 0x005b }
            r2 = r4.hasBackgroundImage();	 Catch:{ JSONException -> 0x005b }
            r0.put(r1, r2);	 Catch:{ JSONException -> 0x005b }
            r1 = "skin_manager_primary_color";	 Catch:{ JSONException -> 0x005b }
            r2 = r4.getPrimaryColor();	 Catch:{ JSONException -> 0x005b }
            r0.put(r1, r2);	 Catch:{ JSONException -> 0x005b }
            r1 = "skin_manager_tint";	 Catch:{ JSONException -> 0x005b }
            r2 = r4.getTint();	 Catch:{ JSONException -> 0x005b }
            r0.put(r1, r2);	 Catch:{ JSONException -> 0x005b }
            r1 = "skin_manager_tint_intensity";	 Catch:{ JSONException -> 0x005b }
            r2 = r4.getTintIntensity();	 Catch:{ JSONException -> 0x005b }
            r0.put(r1, r2);	 Catch:{ JSONException -> 0x005b }
        L_0x005b:
            r4 = com.facebook.accountkit.internal.C1220c.f3260a;
            r4 = r4.m4222f();
            r1 = "ak_ui_manager_view";
            r4.m4380a(r1, r0);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.accountkit.internal.c.a.a(com.facebook.accountkit.ui.UIManager):void");
        }

        /* renamed from: a */
        public static void m4258a(com.facebook.accountkit.ui.LoginType r2, java.lang.String r3, boolean r4) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r0 = new org.json.JSONObject;
            r0.<init>();
            r1 = "view_type";	 Catch:{ JSONException -> 0x000f }
            r0.put(r1, r3);	 Catch:{ JSONException -> 0x000f }
            r3 = "view_provided";	 Catch:{ JSONException -> 0x000f }
            r0.put(r3, r4);	 Catch:{ JSONException -> 0x000f }
        L_0x000f:
            r3 = com.facebook.accountkit.internal.C1220c.f3260a;
            r3 = r3.m4222f();
            r4 = "ak_custom_view";
            r1 = com.facebook.accountkit.ui.LoginType.PHONE;
            r2 = r2.equals(r1);
            if (r2 == 0) goto L_0x0024;
        L_0x0021:
            r2 = "phone";
            goto L_0x0026;
        L_0x0024:
            r2 = "email";
        L_0x0026:
            r3.m4382b(r4, r2, r0);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.accountkit.internal.c.a.a(com.facebook.accountkit.ui.LoginType, java.lang.String, boolean):void");
        }

        /* renamed from: a */
        private static void m4266a(java.lang.String r1, java.lang.String r2, org.json.JSONObject r3) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            if (r3 != 0) goto L_0x0007;
        L_0x0002:
            r3 = new org.json.JSONObject;
            r3.<init>();
        L_0x0007:
            r0 = "button_type";	 Catch:{ JSONException -> 0x000c }
            r3.put(r0, r2);	 Catch:{ JSONException -> 0x000c }
        L_0x000c:
            r2 = com.facebook.accountkit.internal.C1220c.f3260a;
            r2 = r2.m4222f();
            r0 = "phone";
            r2.m4378a(r1, r0, r3);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.accountkit.internal.c.a.a(java.lang.String, java.lang.String, org.json.JSONObject):void");
        }

        /* renamed from: c */
        private static void m4278c(String str, String str2) {
            C1219a.m4266a(str, str2, null);
        }
    }

    /* renamed from: a */
    public static Context m4288a() {
        return f3260a.m4218b();
    }

    /* renamed from: b */
    public static boolean m4299b() {
        return f3260a.m4225i();
    }

    /* renamed from: a */
    public static void m4294a(Context context, InitializeCallback initializeCallback) {
        f3260a.m4217a(context, initializeCallback);
        f3261b.m4364a(context);
    }

    /* renamed from: c */
    public static void m4300c() {
        f3260a.m4223g().m4427g();
    }

    /* renamed from: a */
    public static EmailLoginModel m4289a(String str, String str2, @Nullable String str3) {
        if (C1220c.m4308i() != null) {
            C1220c.m4302d();
        }
        return f3260a.m4223g().m4409a(str, str2, str3);
    }

    /* renamed from: a */
    public static PhoneLoginModel m4290a(PhoneNumber phoneNumber, NotificationChannel notificationChannel, String str, @Nullable String str2) {
        if (C1220c.m4308i() != null) {
            C1220c.m4302d();
        }
        return f3260a.m4223g().m4410a(phoneNumber, notificationChannel, str, str2);
    }

    /* renamed from: d */
    public static void m4302d() {
        f3260a.m4223g().m4431k();
    }

    /* renamed from: e */
    public static void m4304e() {
        f3260a.m4223g().m4425e();
    }

    /* renamed from: a */
    public static void m4295a(String str) {
        f3260a.m4223g().m4417a(str);
    }

    /* renamed from: f */
    public static void m4305f() {
        f3260a.m4223g().m4411a();
    }

    @Nullable
    /* renamed from: a */
    public static PhoneUpdateModel m4291a(PhoneNumber phoneNumber, @Nullable String str) {
        return f3260a.m4224h().m4470a(phoneNumber, str);
    }

    /* renamed from: b */
    public static void m4298b(String str) {
        f3260a.m4224h().m4474a(str);
    }

    /* renamed from: g */
    public static void m4306g() {
        f3260a.m4224h().m4471a();
    }

    /* renamed from: h */
    public static C1232j m4307h() {
        return f3261b.m4363a();
    }

    @Nullable
    /* renamed from: i */
    public static AccessToken m4308i() {
        return f3260a.m4216a().m4254a();
    }

    /* renamed from: j */
    public static EmailLoginModel m4309j() {
        return f3260a.m4223g().m4421c();
    }

    /* renamed from: k */
    public static PhoneLoginModel m4310k() {
        return f3260a.m4223g().m4423d();
    }

    /* renamed from: a */
    public static void m4293a(Activity activity, Bundle bundle) {
        f3260a.m4223g().m4413a(activity, bundle);
    }

    /* renamed from: a */
    public static void m4292a(Activity activity) {
        f3260a.m4223g().m4412a(activity);
    }

    /* renamed from: b */
    public static void m4297b(Activity activity, Bundle bundle) {
        f3260a.m4223g().m4419b(activity, bundle);
    }

    /* renamed from: c */
    public static void m4301c(Activity activity, Bundle bundle) {
        f3260a.m4224h().m4473a(activity, bundle);
    }

    /* renamed from: b */
    public static void m4296b(Activity activity) {
        f3260a.m4224h().m4472a(activity);
    }

    /* renamed from: d */
    public static void m4303d(Activity activity, Bundle bundle) {
        f3260a.m4224h().m4476b(activity, bundle);
    }

    /* renamed from: l */
    public static String m4311l() {
        return f3260a.m4219c();
    }

    /* renamed from: m */
    public static String m4312m() {
        return f3260a.m4220d();
    }

    /* renamed from: n */
    public static String m4313n() {
        return f3260a.m4221e();
    }

    /* renamed from: o */
    public static boolean m4314o() {
        return f3260a.m4226j();
    }

    /* renamed from: p */
    public static String m4315p() {
        return C1220c.m4288a().getSharedPreferences("com.facebook.accountkit.internal.AccountKitController.preferences", 0).getString("AccountHost", "graph.accountkit.com");
    }
}
