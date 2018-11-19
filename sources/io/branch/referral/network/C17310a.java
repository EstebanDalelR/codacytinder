package io.branch.referral.network;

import android.content.Context;
import io.branch.referral.C15593m;
import io.branch.referral.network.BranchRemoteInterface.BranchRemoteException;
import io.branch.referral.network.BranchRemoteInterface.C15594a;
import org.json.JSONObject;

/* renamed from: io.branch.referral.network.a */
public class C17310a extends BranchRemoteInterface {
    /* renamed from: a */
    C15593m f53006a;

    C17310a(Context context) {
        this.f53006a = C15593m.m58388a(context);
    }

    /* renamed from: a */
    public C15594a mo12775a(String str) throws BranchRemoteException {
        return m63289a(str, 0);
    }

    /* renamed from: a */
    public C15594a mo12776a(String str, JSONObject jSONObject) throws BranchRemoteException {
        return m63290a(str, jSONObject, 0);
    }

    /* renamed from: a */
    private io.branch.referral.network.BranchRemoteInterface.C15594a m63289a(java.lang.String r8, int r9) throws io.branch.referral.network.BranchRemoteInterface.BranchRemoteException {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r7 = this;
        r0 = -113; // 0xffffffffffffff8f float:NaN double:NaN;
        r1 = 0;
        r2 = r7.f53006a;	 Catch:{ SocketException -> 0x0124, SocketTimeoutException -> 0x00f9, IOException -> 0x00d2 }
        r2 = r2.m58412b();	 Catch:{ SocketException -> 0x0124, SocketTimeoutException -> 0x00f9, IOException -> 0x00d2 }
        if (r2 > 0) goto L_0x000d;	 Catch:{ SocketException -> 0x0124, SocketTimeoutException -> 0x00f9, IOException -> 0x00d2 }
    L_0x000b:
        r2 = 3000; // 0xbb8 float:4.204E-42 double:1.482E-320;	 Catch:{ SocketException -> 0x0124, SocketTimeoutException -> 0x00f9, IOException -> 0x00d2 }
    L_0x000d:
        r3 = "?";	 Catch:{ SocketException -> 0x0124, SocketTimeoutException -> 0x00f9, IOException -> 0x00d2 }
        r3 = r8.contains(r3);	 Catch:{ SocketException -> 0x0124, SocketTimeoutException -> 0x00f9, IOException -> 0x00d2 }
        if (r3 == 0) goto L_0x0018;	 Catch:{ SocketException -> 0x0124, SocketTimeoutException -> 0x00f9, IOException -> 0x00d2 }
    L_0x0015:
        r3 = "&";	 Catch:{ SocketException -> 0x0124, SocketTimeoutException -> 0x00f9, IOException -> 0x00d2 }
        goto L_0x001a;	 Catch:{ SocketException -> 0x0124, SocketTimeoutException -> 0x00f9, IOException -> 0x00d2 }
    L_0x0018:
        r3 = "?";	 Catch:{ SocketException -> 0x0124, SocketTimeoutException -> 0x00f9, IOException -> 0x00d2 }
    L_0x001a:
        r4 = new java.lang.StringBuilder;	 Catch:{ SocketException -> 0x0124, SocketTimeoutException -> 0x00f9, IOException -> 0x00d2 }
        r4.<init>();	 Catch:{ SocketException -> 0x0124, SocketTimeoutException -> 0x00f9, IOException -> 0x00d2 }
        r4.append(r8);	 Catch:{ SocketException -> 0x0124, SocketTimeoutException -> 0x00f9, IOException -> 0x00d2 }
        r4.append(r3);	 Catch:{ SocketException -> 0x0124, SocketTimeoutException -> 0x00f9, IOException -> 0x00d2 }
        r3 = "retryNumber";	 Catch:{ SocketException -> 0x0124, SocketTimeoutException -> 0x00f9, IOException -> 0x00d2 }
        r4.append(r3);	 Catch:{ SocketException -> 0x0124, SocketTimeoutException -> 0x00f9, IOException -> 0x00d2 }
        r3 = "=";	 Catch:{ SocketException -> 0x0124, SocketTimeoutException -> 0x00f9, IOException -> 0x00d2 }
        r4.append(r3);	 Catch:{ SocketException -> 0x0124, SocketTimeoutException -> 0x00f9, IOException -> 0x00d2 }
        r4.append(r9);	 Catch:{ SocketException -> 0x0124, SocketTimeoutException -> 0x00f9, IOException -> 0x00d2 }
        r3 = r4.toString();	 Catch:{ SocketException -> 0x0124, SocketTimeoutException -> 0x00f9, IOException -> 0x00d2 }
        r4 = new java.net.URL;	 Catch:{ SocketException -> 0x0124, SocketTimeoutException -> 0x00f9, IOException -> 0x00d2 }
        r4.<init>(r3);	 Catch:{ SocketException -> 0x0124, SocketTimeoutException -> 0x00f9, IOException -> 0x00d2 }
        r3 = r4.openConnection();	 Catch:{ SocketException -> 0x0124, SocketTimeoutException -> 0x00f9, IOException -> 0x00d2 }
        r3 = (javax.net.ssl.HttpsURLConnection) r3;	 Catch:{ SocketException -> 0x0124, SocketTimeoutException -> 0x00f9, IOException -> 0x00d2 }
        r3.setConnectTimeout(r2);	 Catch:{ SocketException -> 0x00cc, SocketTimeoutException -> 0x00ca, IOException -> 0x00c7, all -> 0x00c3 }
        r3.setReadTimeout(r2);	 Catch:{ SocketException -> 0x00cc, SocketTimeoutException -> 0x00ca, IOException -> 0x00c7, all -> 0x00c3 }
        r2 = r3.getResponseCode();	 Catch:{ SocketException -> 0x00cc, SocketTimeoutException -> 0x00ca, IOException -> 0x00c7, all -> 0x00c3 }
        r4 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;	 Catch:{ SocketException -> 0x00cc, SocketTimeoutException -> 0x00ca, IOException -> 0x00c7, all -> 0x00c3 }
        if (r2 < r4) goto L_0x0072;	 Catch:{ SocketException -> 0x00cc, SocketTimeoutException -> 0x00ca, IOException -> 0x00c7, all -> 0x00c3 }
    L_0x004f:
        r4 = r7.f53006a;	 Catch:{ SocketException -> 0x00cc, SocketTimeoutException -> 0x00ca, IOException -> 0x00c7, all -> 0x00c3 }
        r4 = r4.m58416c();	 Catch:{ SocketException -> 0x00cc, SocketTimeoutException -> 0x00ca, IOException -> 0x00c7, all -> 0x00c3 }
        if (r9 >= r4) goto L_0x0072;
    L_0x0057:
        r1 = r7.f53006a;	 Catch:{ InterruptedException -> 0x0062 }
        r1 = r1.m58419d();	 Catch:{ InterruptedException -> 0x0062 }
        r1 = (long) r1;	 Catch:{ InterruptedException -> 0x0062 }
        java.lang.Thread.sleep(r1);	 Catch:{ InterruptedException -> 0x0062 }
        goto L_0x0066;
    L_0x0062:
        r1 = move-exception;
        r1.printStackTrace();	 Catch:{ SocketException -> 0x00cc, SocketTimeoutException -> 0x00ca, IOException -> 0x00c7, all -> 0x00c3 }
    L_0x0066:
        r9 = r9 + 1;	 Catch:{ SocketException -> 0x00cc, SocketTimeoutException -> 0x00ca, IOException -> 0x00c7, all -> 0x00c3 }
        r1 = r7.m63289a(r8, r9);	 Catch:{ SocketException -> 0x00cc, SocketTimeoutException -> 0x00ca, IOException -> 0x00c7, all -> 0x00c3 }
        if (r3 == 0) goto L_0x0071;
    L_0x006e:
        r3.disconnect();
    L_0x0071:
        return r1;
    L_0x0072:
        r4 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r2 == r4) goto L_0x008f;
    L_0x0076:
        r4 = r3.getErrorStream();	 Catch:{ FileNotFoundException -> 0x00a2 }
        if (r4 == 0) goto L_0x008f;	 Catch:{ FileNotFoundException -> 0x00a2 }
    L_0x007c:
        r4 = new io.branch.referral.network.BranchRemoteInterface$a;	 Catch:{ FileNotFoundException -> 0x00a2 }
        r5 = r3.getErrorStream();	 Catch:{ FileNotFoundException -> 0x00a2 }
        r5 = r7.m63291a(r5);	 Catch:{ FileNotFoundException -> 0x00a2 }
        r4.<init>(r5, r2);	 Catch:{ FileNotFoundException -> 0x00a2 }
        if (r3 == 0) goto L_0x008e;
    L_0x008b:
        r3.disconnect();
    L_0x008e:
        return r4;
    L_0x008f:
        r4 = new io.branch.referral.network.BranchRemoteInterface$a;	 Catch:{ FileNotFoundException -> 0x00a2 }
        r5 = r3.getInputStream();	 Catch:{ FileNotFoundException -> 0x00a2 }
        r5 = r7.m63291a(r5);	 Catch:{ FileNotFoundException -> 0x00a2 }
        r4.<init>(r5, r2);	 Catch:{ FileNotFoundException -> 0x00a2 }
        if (r3 == 0) goto L_0x00a1;
    L_0x009e:
        r3.disconnect();
    L_0x00a1:
        return r4;
    L_0x00a2:
        r4 = "BranchSDK";	 Catch:{ SocketException -> 0x00cc, SocketTimeoutException -> 0x00ca, IOException -> 0x00c7, all -> 0x00c3 }
        r5 = new java.lang.StringBuilder;	 Catch:{ SocketException -> 0x00cc, SocketTimeoutException -> 0x00ca, IOException -> 0x00c7, all -> 0x00c3 }
        r5.<init>();	 Catch:{ SocketException -> 0x00cc, SocketTimeoutException -> 0x00ca, IOException -> 0x00c7, all -> 0x00c3 }
        r6 = "A resource conflict occurred with this request ";	 Catch:{ SocketException -> 0x00cc, SocketTimeoutException -> 0x00ca, IOException -> 0x00c7, all -> 0x00c3 }
        r5.append(r6);	 Catch:{ SocketException -> 0x00cc, SocketTimeoutException -> 0x00ca, IOException -> 0x00c7, all -> 0x00c3 }
        r5.append(r8);	 Catch:{ SocketException -> 0x00cc, SocketTimeoutException -> 0x00ca, IOException -> 0x00c7, all -> 0x00c3 }
        r5 = r5.toString();	 Catch:{ SocketException -> 0x00cc, SocketTimeoutException -> 0x00ca, IOException -> 0x00c7, all -> 0x00c3 }
        io.branch.referral.C15593m.m58390b(r4, r5);	 Catch:{ SocketException -> 0x00cc, SocketTimeoutException -> 0x00ca, IOException -> 0x00c7, all -> 0x00c3 }
        r4 = new io.branch.referral.network.BranchRemoteInterface$a;	 Catch:{ SocketException -> 0x00cc, SocketTimeoutException -> 0x00ca, IOException -> 0x00c7, all -> 0x00c3 }
        r4.<init>(r1, r2);	 Catch:{ SocketException -> 0x00cc, SocketTimeoutException -> 0x00ca, IOException -> 0x00c7, all -> 0x00c3 }
        if (r3 == 0) goto L_0x00c2;
    L_0x00bf:
        r3.disconnect();
    L_0x00c2:
        return r4;
    L_0x00c3:
        r8 = move-exception;
        r1 = r3;
        goto L_0x014b;
    L_0x00c7:
        r8 = move-exception;
        r1 = r3;
        goto L_0x00d3;
    L_0x00ca:
        r1 = r3;
        goto L_0x00f9;
    L_0x00cc:
        r8 = move-exception;
        r1 = r3;
        goto L_0x0125;
    L_0x00cf:
        r8 = move-exception;
        goto L_0x014b;
    L_0x00d2:
        r8 = move-exception;
    L_0x00d3:
        r9 = r7.getClass();	 Catch:{ all -> 0x00cf }
        r9 = r9.getSimpleName();	 Catch:{ all -> 0x00cf }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00cf }
        r2.<init>();	 Catch:{ all -> 0x00cf }
        r3 = "Branch connect exception: ";	 Catch:{ all -> 0x00cf }
        r2.append(r3);	 Catch:{ all -> 0x00cf }
        r8 = r8.getMessage();	 Catch:{ all -> 0x00cf }
        r2.append(r8);	 Catch:{ all -> 0x00cf }
        r8 = r2.toString();	 Catch:{ all -> 0x00cf }
        io.branch.referral.C15593m.m58390b(r9, r8);	 Catch:{ all -> 0x00cf }
        r8 = new io.branch.referral.network.BranchRemoteInterface$BranchRemoteException;	 Catch:{ all -> 0x00cf }
        r8.<init>(r0);	 Catch:{ all -> 0x00cf }
        throw r8;	 Catch:{ all -> 0x00cf }
    L_0x00f9:
        r0 = r7.f53006a;	 Catch:{ all -> 0x00cf }
        r0 = r0.m58416c();	 Catch:{ all -> 0x00cf }
        if (r9 >= r0) goto L_0x011c;
    L_0x0101:
        r0 = r7.f53006a;	 Catch:{ InterruptedException -> 0x010c }
        r0 = r0.m58419d();	 Catch:{ InterruptedException -> 0x010c }
        r2 = (long) r0;	 Catch:{ InterruptedException -> 0x010c }
        java.lang.Thread.sleep(r2);	 Catch:{ InterruptedException -> 0x010c }
        goto L_0x0110;
    L_0x010c:
        r0 = move-exception;
        r0.printStackTrace();	 Catch:{ all -> 0x00cf }
    L_0x0110:
        r9 = r9 + 1;	 Catch:{ all -> 0x00cf }
        r8 = r7.m63289a(r8, r9);	 Catch:{ all -> 0x00cf }
        if (r1 == 0) goto L_0x011b;
    L_0x0118:
        r1.disconnect();
    L_0x011b:
        return r8;
    L_0x011c:
        r8 = new io.branch.referral.network.BranchRemoteInterface$BranchRemoteException;	 Catch:{ all -> 0x00cf }
        r9 = -111; // 0xffffffffffffff91 float:NaN double:NaN;	 Catch:{ all -> 0x00cf }
        r8.<init>(r9);	 Catch:{ all -> 0x00cf }
        throw r8;	 Catch:{ all -> 0x00cf }
    L_0x0124:
        r8 = move-exception;	 Catch:{ all -> 0x00cf }
    L_0x0125:
        r9 = r7.getClass();	 Catch:{ all -> 0x00cf }
        r9 = r9.getSimpleName();	 Catch:{ all -> 0x00cf }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00cf }
        r2.<init>();	 Catch:{ all -> 0x00cf }
        r3 = "Http connect exception: ";	 Catch:{ all -> 0x00cf }
        r2.append(r3);	 Catch:{ all -> 0x00cf }
        r8 = r8.getMessage();	 Catch:{ all -> 0x00cf }
        r2.append(r8);	 Catch:{ all -> 0x00cf }
        r8 = r2.toString();	 Catch:{ all -> 0x00cf }
        io.branch.referral.C15593m.m58390b(r9, r8);	 Catch:{ all -> 0x00cf }
        r8 = new io.branch.referral.network.BranchRemoteInterface$BranchRemoteException;	 Catch:{ all -> 0x00cf }
        r8.<init>(r0);	 Catch:{ all -> 0x00cf }
        throw r8;	 Catch:{ all -> 0x00cf }
    L_0x014b:
        if (r1 == 0) goto L_0x0150;
    L_0x014d:
        r1.disconnect();
    L_0x0150:
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.network.a.a(java.lang.String, int):io.branch.referral.network.BranchRemoteInterface$a");
    }

    /* renamed from: a */
    private io.branch.referral.network.BranchRemoteInterface.C15594a m63290a(java.lang.String r9, org.json.JSONObject r10, int r11) throws io.branch.referral.network.BranchRemoteInterface.BranchRemoteException {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r8 = this;
        r0 = r8.f53006a;
        r0 = r0.m58412b();
        if (r0 > 0) goto L_0x000a;
    L_0x0008:
        r0 = 3000; // 0xbb8 float:4.204E-42 double:1.482E-320;
    L_0x000a:
        r1 = "retryNumber";	 Catch:{ JSONException -> 0x000f }
        r10.put(r1, r11);	 Catch:{ JSONException -> 0x000f }
    L_0x000f:
        r1 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        r2 = 0;
        r3 = 1;
        r4 = new java.net.URL;	 Catch:{ SocketTimeoutException -> 0x013e, IOException -> 0x0115, Exception -> 0x00d5 }
        r4.<init>(r9);	 Catch:{ SocketTimeoutException -> 0x013e, IOException -> 0x0115, Exception -> 0x00d5 }
        r4 = r4.openConnection();	 Catch:{ SocketTimeoutException -> 0x013e, IOException -> 0x0115, Exception -> 0x00d5 }
        r4 = (javax.net.ssl.HttpsURLConnection) r4;	 Catch:{ SocketTimeoutException -> 0x013e, IOException -> 0x0115, Exception -> 0x00d5 }
        r4.setConnectTimeout(r0);	 Catch:{ SocketTimeoutException -> 0x00cf, IOException -> 0x00cc, Exception -> 0x00ca }
        r4.setReadTimeout(r0);	 Catch:{ SocketTimeoutException -> 0x00cf, IOException -> 0x00cc, Exception -> 0x00ca }
        r4.setDoInput(r3);	 Catch:{ SocketTimeoutException -> 0x00cf, IOException -> 0x00cc, Exception -> 0x00ca }
        r4.setDoOutput(r3);	 Catch:{ SocketTimeoutException -> 0x00cf, IOException -> 0x00cc, Exception -> 0x00ca }
        r0 = "Content-Type";	 Catch:{ SocketTimeoutException -> 0x00cf, IOException -> 0x00cc, Exception -> 0x00ca }
        r5 = "application/json";	 Catch:{ SocketTimeoutException -> 0x00cf, IOException -> 0x00cc, Exception -> 0x00ca }
        r4.setRequestProperty(r0, r5);	 Catch:{ SocketTimeoutException -> 0x00cf, IOException -> 0x00cc, Exception -> 0x00ca }
        r0 = "Accept";	 Catch:{ SocketTimeoutException -> 0x00cf, IOException -> 0x00cc, Exception -> 0x00ca }
        r5 = "application/json";	 Catch:{ SocketTimeoutException -> 0x00cf, IOException -> 0x00cc, Exception -> 0x00ca }
        r4.setRequestProperty(r0, r5);	 Catch:{ SocketTimeoutException -> 0x00cf, IOException -> 0x00cc, Exception -> 0x00ca }
        r0 = "POST";	 Catch:{ SocketTimeoutException -> 0x00cf, IOException -> 0x00cc, Exception -> 0x00ca }
        r4.setRequestMethod(r0);	 Catch:{ SocketTimeoutException -> 0x00cf, IOException -> 0x00cc, Exception -> 0x00ca }
        r0 = new java.io.OutputStreamWriter;	 Catch:{ SocketTimeoutException -> 0x00cf, IOException -> 0x00cc, Exception -> 0x00ca }
        r5 = r4.getOutputStream();	 Catch:{ SocketTimeoutException -> 0x00cf, IOException -> 0x00cc, Exception -> 0x00ca }
        r0.<init>(r5);	 Catch:{ SocketTimeoutException -> 0x00cf, IOException -> 0x00cc, Exception -> 0x00ca }
        r5 = r10.toString();	 Catch:{ SocketTimeoutException -> 0x00cf, IOException -> 0x00cc, Exception -> 0x00ca }
        r0.write(r5);	 Catch:{ SocketTimeoutException -> 0x00cf, IOException -> 0x00cc, Exception -> 0x00ca }
        r0.flush();	 Catch:{ SocketTimeoutException -> 0x00cf, IOException -> 0x00cc, Exception -> 0x00ca }
        r0 = r4.getResponseCode();	 Catch:{ SocketTimeoutException -> 0x00cf, IOException -> 0x00cc, Exception -> 0x00ca }
        if (r0 < r1) goto L_0x0079;	 Catch:{ SocketTimeoutException -> 0x00cf, IOException -> 0x00cc, Exception -> 0x00ca }
    L_0x0056:
        r5 = r8.f53006a;	 Catch:{ SocketTimeoutException -> 0x00cf, IOException -> 0x00cc, Exception -> 0x00ca }
        r5 = r5.m58416c();	 Catch:{ SocketTimeoutException -> 0x00cf, IOException -> 0x00cc, Exception -> 0x00ca }
        if (r11 >= r5) goto L_0x0079;
    L_0x005e:
        r0 = r8.f53006a;	 Catch:{ InterruptedException -> 0x0069 }
        r0 = r0.m58419d();	 Catch:{ InterruptedException -> 0x0069 }
        r5 = (long) r0;	 Catch:{ InterruptedException -> 0x0069 }
        java.lang.Thread.sleep(r5);	 Catch:{ InterruptedException -> 0x0069 }
        goto L_0x006d;
    L_0x0069:
        r0 = move-exception;
        r0.printStackTrace();	 Catch:{ SocketTimeoutException -> 0x00cf, IOException -> 0x00cc, Exception -> 0x00ca }
    L_0x006d:
        r11 = r11 + 1;	 Catch:{ SocketTimeoutException -> 0x00cf, IOException -> 0x00cc, Exception -> 0x00ca }
        r0 = r8.m63290a(r9, r10, r11);	 Catch:{ SocketTimeoutException -> 0x00cf, IOException -> 0x00cc, Exception -> 0x00ca }
        if (r4 == 0) goto L_0x0078;
    L_0x0075:
        r4.disconnect();
    L_0x0078:
        return r0;
    L_0x0079:
        r5 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r0 == r5) goto L_0x0096;
    L_0x007d:
        r5 = r4.getErrorStream();	 Catch:{ FileNotFoundException -> 0x00a9 }
        if (r5 == 0) goto L_0x0096;	 Catch:{ FileNotFoundException -> 0x00a9 }
    L_0x0083:
        r5 = new io.branch.referral.network.BranchRemoteInterface$a;	 Catch:{ FileNotFoundException -> 0x00a9 }
        r6 = r4.getErrorStream();	 Catch:{ FileNotFoundException -> 0x00a9 }
        r6 = r8.m63291a(r6);	 Catch:{ FileNotFoundException -> 0x00a9 }
        r5.<init>(r6, r0);	 Catch:{ FileNotFoundException -> 0x00a9 }
        if (r4 == 0) goto L_0x0095;
    L_0x0092:
        r4.disconnect();
    L_0x0095:
        return r5;
    L_0x0096:
        r5 = new io.branch.referral.network.BranchRemoteInterface$a;	 Catch:{ FileNotFoundException -> 0x00a9 }
        r6 = r4.getInputStream();	 Catch:{ FileNotFoundException -> 0x00a9 }
        r6 = r8.m63291a(r6);	 Catch:{ FileNotFoundException -> 0x00a9 }
        r5.<init>(r6, r0);	 Catch:{ FileNotFoundException -> 0x00a9 }
        if (r4 == 0) goto L_0x00a8;
    L_0x00a5:
        r4.disconnect();
    L_0x00a8:
        return r5;
    L_0x00a9:
        r5 = "BranchSDK";	 Catch:{ SocketTimeoutException -> 0x00cf, IOException -> 0x00cc, Exception -> 0x00ca }
        r6 = new java.lang.StringBuilder;	 Catch:{ SocketTimeoutException -> 0x00cf, IOException -> 0x00cc, Exception -> 0x00ca }
        r6.<init>();	 Catch:{ SocketTimeoutException -> 0x00cf, IOException -> 0x00cc, Exception -> 0x00ca }
        r7 = "A resource conflict occurred with this request ";	 Catch:{ SocketTimeoutException -> 0x00cf, IOException -> 0x00cc, Exception -> 0x00ca }
        r6.append(r7);	 Catch:{ SocketTimeoutException -> 0x00cf, IOException -> 0x00cc, Exception -> 0x00ca }
        r6.append(r9);	 Catch:{ SocketTimeoutException -> 0x00cf, IOException -> 0x00cc, Exception -> 0x00ca }
        r6 = r6.toString();	 Catch:{ SocketTimeoutException -> 0x00cf, IOException -> 0x00cc, Exception -> 0x00ca }
        io.branch.referral.C15593m.m58390b(r5, r6);	 Catch:{ SocketTimeoutException -> 0x00cf, IOException -> 0x00cc, Exception -> 0x00ca }
        r5 = new io.branch.referral.network.BranchRemoteInterface$a;	 Catch:{ SocketTimeoutException -> 0x00cf, IOException -> 0x00cc, Exception -> 0x00ca }
        r5.<init>(r2, r0);	 Catch:{ SocketTimeoutException -> 0x00cf, IOException -> 0x00cc, Exception -> 0x00ca }
        if (r4 == 0) goto L_0x00c9;
    L_0x00c6:
        r4.disconnect();
    L_0x00c9:
        return r5;
    L_0x00ca:
        r9 = move-exception;
        goto L_0x00d7;
    L_0x00cc:
        r9 = move-exception;
        r2 = r4;
        goto L_0x0116;
    L_0x00cf:
        r2 = r4;
        goto L_0x013e;
    L_0x00d1:
        r9 = move-exception;
        r4 = r2;
        goto L_0x0168;
    L_0x00d5:
        r9 = move-exception;
        r4 = r2;
    L_0x00d7:
        r10 = r8.getClass();	 Catch:{ all -> 0x0113 }
        r10 = r10.getSimpleName();	 Catch:{ all -> 0x0113 }
        r11 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0113 }
        r11.<init>();	 Catch:{ all -> 0x0113 }
        r0 = "Exception: ";	 Catch:{ all -> 0x0113 }
        r11.append(r0);	 Catch:{ all -> 0x0113 }
        r0 = r9.getMessage();	 Catch:{ all -> 0x0113 }
        r11.append(r0);	 Catch:{ all -> 0x0113 }
        r11 = r11.toString();	 Catch:{ all -> 0x0113 }
        io.branch.referral.C15593m.m58390b(r10, r11);	 Catch:{ all -> 0x0113 }
        r10 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x0113 }
        r11 = 11;	 Catch:{ all -> 0x0113 }
        if (r10 < r11) goto L_0x0108;	 Catch:{ all -> 0x0113 }
    L_0x00fd:
        r9 = r9 instanceof android.os.NetworkOnMainThreadException;	 Catch:{ all -> 0x0113 }
        if (r9 == 0) goto L_0x0108;	 Catch:{ all -> 0x0113 }
    L_0x0101:
        r9 = "BranchSDK";	 Catch:{ all -> 0x0113 }
        r10 = "Branch Error: Don't call our synchronous methods on the main thread!!!";	 Catch:{ all -> 0x0113 }
        android.util.Log.i(r9, r10);	 Catch:{ all -> 0x0113 }
    L_0x0108:
        r9 = new io.branch.referral.network.BranchRemoteInterface$a;	 Catch:{ all -> 0x0113 }
        r9.<init>(r2, r1);	 Catch:{ all -> 0x0113 }
        if (r4 == 0) goto L_0x0112;
    L_0x010f:
        r4.disconnect();
    L_0x0112:
        return r9;
    L_0x0113:
        r9 = move-exception;
        goto L_0x0168;
    L_0x0115:
        r9 = move-exception;
    L_0x0116:
        r10 = r8.getClass();	 Catch:{ all -> 0x00d1 }
        r10 = r10.getSimpleName();	 Catch:{ all -> 0x00d1 }
        r11 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00d1 }
        r11.<init>();	 Catch:{ all -> 0x00d1 }
        r0 = "Http connect exception: ";	 Catch:{ all -> 0x00d1 }
        r11.append(r0);	 Catch:{ all -> 0x00d1 }
        r9 = r9.getMessage();	 Catch:{ all -> 0x00d1 }
        r11.append(r9);	 Catch:{ all -> 0x00d1 }
        r9 = r11.toString();	 Catch:{ all -> 0x00d1 }
        io.branch.referral.C15593m.m58390b(r10, r9);	 Catch:{ all -> 0x00d1 }
        r9 = new io.branch.referral.network.BranchRemoteInterface$BranchRemoteException;	 Catch:{ all -> 0x00d1 }
        r10 = -113; // 0xffffffffffffff8f float:NaN double:NaN;	 Catch:{ all -> 0x00d1 }
        r9.<init>(r10);	 Catch:{ all -> 0x00d1 }
        throw r9;	 Catch:{ all -> 0x00d1 }
    L_0x013e:
        r0 = r8.f53006a;	 Catch:{ all -> 0x00d1 }
        r0 = r0.m58416c();	 Catch:{ all -> 0x00d1 }
        if (r11 >= r0) goto L_0x0160;
    L_0x0146:
        r0 = r8.f53006a;	 Catch:{ InterruptedException -> 0x0151 }
        r0 = r0.m58419d();	 Catch:{ InterruptedException -> 0x0151 }
        r0 = (long) r0;	 Catch:{ InterruptedException -> 0x0151 }
        java.lang.Thread.sleep(r0);	 Catch:{ InterruptedException -> 0x0151 }
        goto L_0x0155;
    L_0x0151:
        r0 = move-exception;
        r0.printStackTrace();	 Catch:{ all -> 0x00d1 }
    L_0x0155:
        r11 = r11 + r3;	 Catch:{ all -> 0x00d1 }
        r9 = r8.m63290a(r9, r10, r11);	 Catch:{ all -> 0x00d1 }
        if (r2 == 0) goto L_0x015f;
    L_0x015c:
        r2.disconnect();
    L_0x015f:
        return r9;
    L_0x0160:
        r9 = new io.branch.referral.network.BranchRemoteInterface$BranchRemoteException;	 Catch:{ all -> 0x00d1 }
        r10 = -111; // 0xffffffffffffff91 float:NaN double:NaN;	 Catch:{ all -> 0x00d1 }
        r9.<init>(r10);	 Catch:{ all -> 0x00d1 }
        throw r9;	 Catch:{ all -> 0x00d1 }
    L_0x0168:
        if (r4 == 0) goto L_0x016d;
    L_0x016a:
        r4.disconnect();
    L_0x016d:
        throw r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.network.a.a(java.lang.String, org.json.JSONObject, int):io.branch.referral.network.BranchRemoteInterface$a");
    }

    /* renamed from: a */
    private java.lang.String m63291a(java.io.InputStream r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        if (r3 == 0) goto L_0x0011;
    L_0x0002:
        r0 = new java.io.BufferedReader;
        r1 = new java.io.InputStreamReader;
        r1.<init>(r3);
        r0.<init>(r1);
        r3 = r0.readLine();	 Catch:{ IOException -> 0x0011 }
        goto L_0x0012;
    L_0x0011:
        r3 = 0;
    L_0x0012:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.network.a.a(java.io.InputStream):java.lang.String");
    }
}
