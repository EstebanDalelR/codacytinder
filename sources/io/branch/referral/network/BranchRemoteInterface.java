package io.branch.referral.network;

import android.content.Context;
import android.support.annotation.Nullable;
import io.branch.referral.Branch;
import io.branch.referral.C15593m;
import io.branch.referral.C15601z;
import io.branch.referral.Defines.Jsonkey;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class BranchRemoteInterface {

    public static class BranchRemoteException extends Exception {
        /* renamed from: a */
        private int f48261a = -113;

        public BranchRemoteException(int i) {
            this.f48261a = i;
        }
    }

    /* renamed from: io.branch.referral.network.BranchRemoteInterface$a */
    public static class C15594a {
        /* renamed from: a */
        private final String f48262a;
        /* renamed from: b */
        private final int f48263b;

        public C15594a(@Nullable String str, int i) {
            this.f48262a = str;
            this.f48263b = i;
        }
    }

    /* renamed from: a */
    public abstract C15594a mo12775a(String str) throws BranchRemoteException;

    /* renamed from: a */
    public abstract C15594a mo12776a(String str, JSONObject jSONObject) throws BranchRemoteException;

    /* renamed from: a */
    public final C15601z m58475a(String str, JSONObject jSONObject, String str2, String str3) {
        StringBuilder stringBuilder;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (m58472a(jSONObject, str3) == null) {
            return new C15601z(str2, -114);
        }
        str3 = new StringBuilder();
        str3.append(str);
        str3.append(m58471a(jSONObject));
        str = str3.toString();
        long currentTimeMillis = System.currentTimeMillis();
        str3 = new StringBuilder();
        str3.append("getting ");
        str3.append(str);
        C15593m.m58390b("BranchSDK", str3.toString());
        try {
            str = mo12775a(str);
            str = m58470a(str.f48262a, str.f48263b, str2);
            if (Branch.b() != null) {
                jSONObject = (int) (System.currentTimeMillis() - currentTimeMillis);
                str3 = Branch.b();
                stringBuilder = new StringBuilder();
                stringBuilder.append(str2);
                stringBuilder.append("-");
                stringBuilder.append(Jsonkey.Branch_Round_Trip_Time.getKey());
                str3.a(stringBuilder.toString(), String.valueOf(jSONObject));
            }
            return str;
        } catch (String str4) {
            if (str4.f48261a == -111) {
                str4 = new C15601z(str2, -111);
                if (Branch.b() != null) {
                    jSONObject = (int) (System.currentTimeMillis() - currentTimeMillis);
                    str3 = Branch.b();
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(str2);
                    stringBuilder.append("-");
                    stringBuilder.append(Jsonkey.Branch_Round_Trip_Time.getKey());
                    str3.a(stringBuilder.toString(), String.valueOf(jSONObject));
                }
                return str4;
            }
            str4 = new C15601z(str2, -113);
            if (Branch.b() != null) {
                jSONObject = (int) (System.currentTimeMillis() - currentTimeMillis);
                str3 = Branch.b();
                stringBuilder = new StringBuilder();
                stringBuilder.append(str2);
                stringBuilder.append("-");
                stringBuilder.append(Jsonkey.Branch_Round_Trip_Time.getKey());
                str3.a(stringBuilder.toString(), String.valueOf(jSONObject));
            }
            return str4;
        } catch (String str42) {
            if (Branch.b() != null) {
                jSONObject = (int) (System.currentTimeMillis() - currentTimeMillis);
                str3 = Branch.b();
                stringBuilder = new StringBuilder();
                stringBuilder.append(str2);
                stringBuilder.append("-");
                stringBuilder.append(Jsonkey.Branch_Round_Trip_Time.getKey());
                str3.a(stringBuilder.toString(), String.valueOf(jSONObject));
            }
            throw str42;
        }
    }

    /* renamed from: a */
    public final C15601z m58476a(JSONObject jSONObject, String str, String str2, String str3) {
        StringBuilder stringBuilder;
        long currentTimeMillis = System.currentTimeMillis();
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (m58472a(jSONObject, str3) == null) {
            return new C15601z(str2, -114);
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("posting to ");
        stringBuilder2.append(str);
        C15593m.m58390b("BranchSDK", stringBuilder2.toString());
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Post value = ");
        stringBuilder2.append(jSONObject.toString());
        C15593m.m58390b("BranchSDK", stringBuilder2.toString());
        try {
            jSONObject = mo12776a(str, jSONObject);
            jSONObject = m58470a(jSONObject.f48262a, jSONObject.f48263b, str2);
            if (Branch.b() != null) {
                str = (int) (System.currentTimeMillis() - currentTimeMillis);
                str3 = Branch.b();
                stringBuilder = new StringBuilder();
                stringBuilder.append(str2);
                stringBuilder.append("-");
                stringBuilder.append(Jsonkey.Branch_Round_Trip_Time.getKey());
                str3.a(stringBuilder.toString(), String.valueOf(str));
            }
            return jSONObject;
        } catch (JSONObject jSONObject2) {
            if (jSONObject2.f48261a == -111) {
                jSONObject2 = new C15601z(str2, -111);
                if (Branch.b() != null) {
                    str = (int) (System.currentTimeMillis() - currentTimeMillis);
                    str3 = Branch.b();
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(str2);
                    stringBuilder.append("-");
                    stringBuilder.append(Jsonkey.Branch_Round_Trip_Time.getKey());
                    str3.a(stringBuilder.toString(), String.valueOf(str));
                }
                return jSONObject2;
            }
            jSONObject2 = new C15601z(str2, -113);
            if (Branch.b() != null) {
                str = (int) (System.currentTimeMillis() - currentTimeMillis);
                str3 = Branch.b();
                stringBuilder = new StringBuilder();
                stringBuilder.append(str2);
                stringBuilder.append("-");
                stringBuilder.append(Jsonkey.Branch_Round_Trip_Time.getKey());
                str3.a(stringBuilder.toString(), String.valueOf(str));
            }
            return jSONObject2;
        } catch (JSONObject jSONObject22) {
            if (Branch.b() != null) {
                str = (int) (System.currentTimeMillis() - currentTimeMillis);
                str3 = Branch.b();
                stringBuilder = new StringBuilder();
                stringBuilder.append(str2);
                stringBuilder.append("-");
                stringBuilder.append(Jsonkey.Branch_Round_Trip_Time.getKey());
                str3.a(stringBuilder.toString(), String.valueOf(str));
            }
            throw jSONObject22;
        }
    }

    /* renamed from: a */
    public static final BranchRemoteInterface m58469a(Context context) {
        return new C17310a(context);
    }

    /* renamed from: a */
    private io.branch.referral.C15601z m58470a(java.lang.String r3, int r4, java.lang.String r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = new io.branch.referral.z;
        r0.<init>(r5, r4);
        r4 = "BranchSDK";
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r1 = "returned ";
        r5.append(r1);
        r5.append(r3);
        r5 = r5.toString();
        io.branch.referral.C15593m.m58390b(r4, r5);
        if (r3 == 0) goto L_0x0050;
    L_0x001d:
        r4 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0026 }
        r4.<init>(r3);	 Catch:{ JSONException -> 0x0026 }
        r0.m58527a(r4);	 Catch:{ JSONException -> 0x0026 }
        goto L_0x0050;
    L_0x0026:
        r4 = new org.json.JSONArray;	 Catch:{ JSONException -> 0x002f }
        r4.<init>(r3);	 Catch:{ JSONException -> 0x002f }
        r0.m58527a(r4);	 Catch:{ JSONException -> 0x002f }
        goto L_0x0050;
    L_0x002f:
        r3 = move-exception;
        r4 = r2.getClass();
        r4 = r4.getSimpleName();
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r1 = "JSON exception: ";
        r5.append(r1);
        r3 = r3.getMessage();
        r5.append(r3);
        r3 = r5.toString();
        io.branch.referral.C15593m.m58390b(r4, r3);
    L_0x0050:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.network.BranchRemoteInterface.a(java.lang.String, int, java.lang.String):io.branch.referral.z");
    }

    /* renamed from: a */
    private boolean m58472a(org.json.JSONObject r3, java.lang.String r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = io.branch.referral.Defines.Jsonkey.UserData;	 Catch:{ JSONException -> 0x002a }
        r0 = r0.getKey();	 Catch:{ JSONException -> 0x002a }
        r0 = r3.has(r0);	 Catch:{ JSONException -> 0x002a }
        if (r0 != 0) goto L_0x0017;	 Catch:{ JSONException -> 0x002a }
    L_0x000c:
        r0 = io.branch.referral.Defines.Jsonkey.SDK;	 Catch:{ JSONException -> 0x002a }
        r0 = r0.getKey();	 Catch:{ JSONException -> 0x002a }
        r1 = "android2.17.1";	 Catch:{ JSONException -> 0x002a }
        r3.put(r0, r1);	 Catch:{ JSONException -> 0x002a }
    L_0x0017:
        r0 = "bnc_no_value";	 Catch:{ JSONException -> 0x002a }
        r0 = r4.equals(r0);	 Catch:{ JSONException -> 0x002a }
        if (r0 != 0) goto L_0x002a;	 Catch:{ JSONException -> 0x002a }
    L_0x001f:
        r0 = io.branch.referral.Defines.Jsonkey.BranchKey;	 Catch:{ JSONException -> 0x002a }
        r0 = r0.getKey();	 Catch:{ JSONException -> 0x002a }
        r3.put(r0, r4);	 Catch:{ JSONException -> 0x002a }
        r3 = 1;
        return r3;
    L_0x002a:
        r3 = 0;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.network.BranchRemoteInterface.a(org.json.JSONObject, java.lang.String):boolean");
    }

    /* renamed from: a */
    private String m58471a(JSONObject jSONObject) {
        StringBuilder stringBuilder = new StringBuilder();
        if (jSONObject != null) {
            JSONArray names = jSONObject.names();
            if (names != null) {
                int length = names.length();
                int i = 0;
                Object obj = 1;
                while (i < length) {
                    try {
                        String string = names.getString(i);
                        if (obj != null) {
                            stringBuilder.append("?");
                            obj = null;
                        } else {
                            stringBuilder.append("&");
                        }
                        String string2 = jSONObject.getString(string);
                        stringBuilder.append(string);
                        stringBuilder.append("=");
                        stringBuilder.append(string2);
                        i++;
                    } catch (JSONObject jSONObject2) {
                        jSONObject2.printStackTrace();
                        return null;
                    }
                }
            }
        }
        return stringBuilder.toString();
    }
}
