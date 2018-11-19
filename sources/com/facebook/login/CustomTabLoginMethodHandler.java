package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.AccessTokenSource;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookSdk;
import com.facebook.internal.C1709i;
import com.facebook.internal.C1712j;
import com.facebook.internal.C1749x;
import com.facebook.internal.Utility;
import com.facebook.login.LoginClient.Request;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class CustomTabLoginMethodHandler extends WebLoginMethodHandler {
    private static final int API_EC_DIALOG_CANCEL = 4201;
    private static final int CHALLENGE_LENGTH = 20;
    private static final String[] CHROME_PACKAGES = new String[]{"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};
    public static final Creator<CustomTabLoginMethodHandler> CREATOR = new C17541();
    private static final String CUSTOM_TABS_SERVICE_ACTION = "android.support.customtabs.action.CustomTabsService";
    private static final int CUSTOM_TAB_REQUEST_CODE = 1;
    private String currentPackage;
    private String expectedChallenge;

    /* renamed from: com.facebook.login.CustomTabLoginMethodHandler$1 */
    static class C17541 implements Creator {
        C17541() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m6079a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m6080a(i);
        }

        /* renamed from: a */
        public CustomTabLoginMethodHandler m6079a(Parcel parcel) {
            return new CustomTabLoginMethodHandler(parcel);
        }

        /* renamed from: a */
        public CustomTabLoginMethodHandler[] m6080a(int i) {
            return new CustomTabLoginMethodHandler[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    String getNameForLogging() {
        return "custom_tab";
    }

    protected String getSSODevice() {
        return "chrome_custom_tab";
    }

    CustomTabLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        this.expectedChallenge = Utility.m5754a(20);
    }

    AccessTokenSource getTokenSource() {
        return AccessTokenSource.CHROME_CUSTOM_TAB;
    }

    boolean tryAuthorize(Request request) {
        if (!isCustomTabsAllowed()) {
            return null;
        }
        request = addExtraParameters(getParameters(request), request);
        Intent intent = new Intent(this.loginClient.getActivity(), CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.f3076a, request);
        intent.putExtra(CustomTabMainActivity.f3077b, getChromePackage());
        this.loginClient.getFragment().startActivityForResult(intent, 1);
        return true;
    }

    private boolean isCustomTabsAllowed() {
        return isCustomTabsEnabled() && getChromePackage() != null && isCustomTabsCompatibleWithAutofill() && C1749x.m6073c(FacebookSdk.m3994e());
    }

    private boolean isCustomTabsEnabled() {
        C1709i a = C1712j.m5907a(Utility.m5755a(this.loginClient.getActivity()));
        return a != null && a.m5899d();
    }

    private String getChromePackage() {
        if (this.currentPackage != null) {
            return this.currentPackage;
        }
        Context activity = this.loginClient.getActivity();
        List<ResolveInfo> queryIntentServices = activity.getPackageManager().queryIntentServices(new Intent(CUSTOM_TABS_SERVICE_ACTION), 0);
        if (queryIntentServices != null) {
            Set hashSet = new HashSet(Arrays.asList(CHROME_PACKAGES));
            for (ResolveInfo resolveInfo : queryIntentServices) {
                ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                if (serviceInfo != null && hashSet.contains(serviceInfo.packageName)) {
                    this.currentPackage = serviceInfo.packageName;
                    return this.currentPackage;
                }
            }
        }
        return null;
    }

    private boolean isCustomTabsCompatibleWithAutofill() {
        return !Utility.m5808e(this.loginClient.getActivity());
    }

    boolean onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            return super.onActivityResult(i, i2, intent);
        }
        i = this.loginClient.getPendingRequest();
        if (i2 == -1) {
            onCustomTabComplete(intent.getStringExtra(CustomTabMainActivity.f3078c), i);
            return true;
        }
        super.onComplete(i, 0, new FacebookOperationCanceledException());
        return false;
    }

    private void onCustomTabComplete(java.lang.String r7, com.facebook.login.LoginClient.Request r8) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r6 = this;
        if (r7 == 0) goto L_0x00b3;
    L_0x0002:
        r0 = com.facebook.CustomTabMainActivity.m3969a();
        r0 = r7.startsWith(r0);
        if (r0 == 0) goto L_0x00b3;
    L_0x000c:
        r7 = android.net.Uri.parse(r7);
        r0 = r7.getQuery();
        r0 = com.facebook.internal.Utility.m5795c(r0);
        r7 = r7.getFragment();
        r7 = com.facebook.internal.Utility.m5795c(r7);
        r0.putAll(r7);
        r7 = r6.validateChallengeParam(r0);
        r1 = 0;
        if (r7 != 0) goto L_0x0035;
    L_0x002a:
        r7 = new com.facebook.FacebookException;
        r0 = "Invalid state parameter";
        r7.<init>(r0);
        super.onComplete(r8, r1, r7);
        return;
    L_0x0035:
        r7 = "error";
        r7 = r0.getString(r7);
        if (r7 != 0) goto L_0x0043;
    L_0x003d:
        r7 = "error_type";
        r7 = r0.getString(r7);
    L_0x0043:
        r2 = "error_msg";
        r2 = r0.getString(r2);
        if (r2 != 0) goto L_0x0051;
    L_0x004b:
        r2 = "error_message";
        r2 = r0.getString(r2);
    L_0x0051:
        if (r2 != 0) goto L_0x0059;
    L_0x0053:
        r2 = "error_description";
        r2 = r0.getString(r2);
    L_0x0059:
        r3 = "error_code";
        r3 = r0.getString(r3);
        r4 = com.facebook.internal.Utility.m5785a(r3);
        r5 = -1;
        if (r4 != 0) goto L_0x006b;
    L_0x0066:
        r3 = java.lang.Integer.parseInt(r3);	 Catch:{ NumberFormatException -> 0x006b }
        goto L_0x006c;
    L_0x006b:
        r3 = -1;
    L_0x006c:
        r4 = com.facebook.internal.Utility.m5785a(r7);
        if (r4 == 0) goto L_0x007e;
    L_0x0072:
        r4 = com.facebook.internal.Utility.m5785a(r2);
        if (r4 == 0) goto L_0x007e;
    L_0x0078:
        if (r3 != r5) goto L_0x007e;
    L_0x007a:
        super.onComplete(r8, r0, r1);
        goto L_0x00b3;
    L_0x007e:
        if (r7 == 0) goto L_0x0099;
    L_0x0080:
        r0 = "access_denied";
        r0 = r7.equals(r0);
        if (r0 != 0) goto L_0x0090;
    L_0x0088:
        r0 = "OAuthAccessDeniedException";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x0099;
    L_0x0090:
        r7 = new com.facebook.FacebookOperationCanceledException;
        r7.<init>();
        super.onComplete(r8, r1, r7);
        goto L_0x00b3;
    L_0x0099:
        r0 = 4201; // 0x1069 float:5.887E-42 double:2.0756E-320;
        if (r3 != r0) goto L_0x00a6;
    L_0x009d:
        r7 = new com.facebook.FacebookOperationCanceledException;
        r7.<init>();
        super.onComplete(r8, r1, r7);
        goto L_0x00b3;
    L_0x00a6:
        r0 = new com.facebook.FacebookRequestError;
        r0.<init>(r3, r7, r2);
        r7 = new com.facebook.FacebookServiceException;
        r7.<init>(r0, r2);
        super.onComplete(r8, r1, r7);
    L_0x00b3:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.CustomTabLoginMethodHandler.onCustomTabComplete(java.lang.String, com.facebook.login.LoginClient$Request):void");
    }

    protected void putChallengeParam(JSONObject jSONObject) throws JSONException {
        jSONObject.put("7_challenge", this.expectedChallenge);
    }

    private boolean validateChallengeParam(android.os.Bundle r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r2 = this;
        r0 = 0;
        r1 = "state";	 Catch:{ JSONException -> 0x001c }
        r3 = r3.getString(r1);	 Catch:{ JSONException -> 0x001c }
        if (r3 != 0) goto L_0x000a;	 Catch:{ JSONException -> 0x001c }
    L_0x0009:
        return r0;	 Catch:{ JSONException -> 0x001c }
    L_0x000a:
        r1 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x001c }
        r1.<init>(r3);	 Catch:{ JSONException -> 0x001c }
        r3 = "7_challenge";	 Catch:{ JSONException -> 0x001c }
        r3 = r1.getString(r3);	 Catch:{ JSONException -> 0x001c }
        r1 = r2.expectedChallenge;	 Catch:{ JSONException -> 0x001c }
        r3 = r3.equals(r1);	 Catch:{ JSONException -> 0x001c }
        return r3;
    L_0x001c:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.CustomTabLoginMethodHandler.validateChallengeParam(android.os.Bundle):boolean");
    }

    CustomTabLoginMethodHandler(Parcel parcel) {
        super(parcel);
        this.expectedChallenge = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.expectedChallenge);
    }
}
