package com.google.android.m4b.maps.aw;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.m4b.maps.ay.C4710b;
import com.google.android.m4b.maps.ay.C4710b.C4709b;
import com.google.android.m4b.maps.ay.C4717k;
import com.google.android.m4b.maps.ay.C4728u;
import com.google.android.m4b.maps.p118r.C5517a;
import com.google.android.m4b.maps.p118r.C5517a.C6765a;
import com.google.android.m4b.maps.p125y.C5566g;
import com.google.android.m4b.maps.p125y.C5571j;
import com.google.android.m4b.maps.p125y.C5576n;
import java.util.concurrent.Executors;

/* renamed from: com.google.android.m4b.maps.aw.b */
public class C6402b extends C4710b<C5517a> {
    /* renamed from: a */
    private static final String f23734a = "b";
    /* renamed from: b */
    private final Context f23735b;
    /* renamed from: c */
    private final String f23736c;
    /* renamed from: d */
    private boolean f23737d = null;
    /* renamed from: e */
    private final String f23738e;
    /* renamed from: f */
    private final boolean f23739f;

    /* renamed from: com.google.android.m4b.maps.aw.b$a */
    interface C4696a {
        /* renamed from: a */
        void mo4864a();

        /* renamed from: a */
        void mo4866a(String str, long j);

        /* renamed from: b */
        void mo4867b();
    }

    C6402b(Context context, String str, String str2, String str3, boolean z) {
        super(context, str3, "com.google.android.gms.maps.auth.ApiTokenService", Executors.newSingleThreadExecutor());
        this.f23735b = context;
        this.f23736c = str;
        this.f23738e = str2;
        this.f23739f = z;
    }

    /* renamed from: a */
    public final void m27925a(final C4696a c4696a) {
        C5571j.m24293a((Object) c4696a, (Object) "callback");
        mo4877a(new C4709b<Void>(this) {
            /* renamed from: b */
            private /* synthetic */ C6402b f23733b;

            /* renamed from: a */
            private Void m27918a(C5517a c5517a) {
                try {
                    Log.i(C6402b.f23734a, "Sending API token request.");
                    this.f23733b.m27924a(c5517a.mo5674a(C6402b.m27920a(this.f23733b)), c4696a);
                } catch (C5517a c5517a2) {
                    Log.e(C6402b.f23734a, "Exception when sending the token request.", c5517a2);
                    c4696a.mo4864a();
                } catch (Throwable th) {
                    this.f23733b.m20954b();
                }
                this.f23733b.m20954b();
                return null;
            }
        });
    }

    /* renamed from: a */
    final void m27924a(Bundle bundle, C4696a c4696a) {
        short s = bundle.getShort("ERROR_CODE", (short) -1);
        if (s != (short) -1) {
            switch (s) {
                case (short) 1:
                    Log.e(f23734a, "Authentication failed. Package names don't match.");
                    m27922d();
                    c4696a.mo4867b();
                    break;
                case (short) 2:
                    Log.e(f23734a, "Authentication failed. Could not extract app certificate");
                    m27922d();
                    c4696a.mo4867b();
                    break;
                case (short) 3:
                    Log.e(f23734a, "Authentication failed. API Key not found in the request.");
                    m27922d();
                    c4696a.mo4867b();
                    break;
                case (short) 4:
                    Log.e(f23734a, "Authentication failed on the server.");
                    m27922d();
                    c4696a.mo4867b();
                    break;
                case (short) 5:
                    Log.e(f23734a, "Authentication failed. Timeout while trying to contact the server.");
                    c4696a.mo4864a();
                    break;
                default:
                    bundle = f23734a;
                    StringBuilder stringBuilder = new StringBuilder(49);
                    stringBuilder.append("Authentication failed. Unrecognized error: ");
                    stringBuilder.append(s);
                    Log.e(bundle, stringBuilder.toString());
                    m27922d();
                    c4696a.mo4867b();
                    return;
            }
        }
        String string = bundle.getString("API_TOKEN");
        if (string != null) {
            long j = bundle.getLong("VALIDITY_DURATION");
            bundle = f23734a;
            StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(string).length() + 57);
            stringBuilder2.append("Received API Token: ");
            stringBuilder2.append(string);
            stringBuilder2.append(" / Expires in: ");
            stringBuilder2.append(j);
            stringBuilder2.append("ms");
            Log.i(bundle, stringBuilder2.toString());
            c4696a.mo4866a(string, j);
            return;
        }
        Log.e(f23734a, "Missing token in service response.");
        c4696a.mo4867b();
    }

    /* renamed from: d */
    private void m27922d() {
        if (!this.f23737d) {
            C4728u.m21049a("Authorization failure.  Please see https://developers.google.com/maps/documentation/android/start for how to correctly set up the map.");
            String a = C4717k.m20983a(this.f23735b.getPackageManager(), this.f23738e);
            if (a == null) {
                a = null;
            } else {
                a = C5566g.m24266a(":").m24269a(C5576n.m24310a(2).m24314a(a.toUpperCase()));
            }
            String valueOf = String.valueOf("In the Google Developer Console (https://console.developers.google.com)\nEnsure that the \"Google Maps Android API v2\" is enabled.\nEnsure that the following Android Key exists:\n\tAPI Key: ");
            String str = this.f23736c;
            String str2 = this.f23738e;
            StringBuilder stringBuilder = new StringBuilder((((String.valueOf(valueOf).length() + 60) + String.valueOf(str).length()) + String.valueOf(a).length()) + String.valueOf(str2).length());
            stringBuilder.append(valueOf);
            stringBuilder.append(str);
            stringBuilder.append("\n\tAndroid Application (<cert_fingerprint>;<package_name>): ");
            stringBuilder.append(a);
            stringBuilder.append(";");
            stringBuilder.append(str2);
            C4728u.m21049a(stringBuilder.toString());
            this.f23737d = true;
        }
    }

    /* renamed from: a */
    protected final /* synthetic */ IInterface mo4863a(IBinder iBinder) {
        return C6765a.m30132a(iBinder);
    }

    /* renamed from: a */
    static /* synthetic */ Bundle m27920a(C6402b c6402b) {
        Bundle bundle = new Bundle(3);
        bundle.putString("PACKAGE_NAME", c6402b.f23738e);
        bundle.putString("API_KEY", c6402b.f23736c);
        bundle.putBoolean("M4B", c6402b.f23739f);
        return bundle;
    }
}
