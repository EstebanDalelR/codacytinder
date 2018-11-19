package android.support.v4.media.session;

import android.content.BroadcastReceiver;
import android.content.BroadcastReceiver.PendingResult;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaBrowserCompat.C0459b;
import android.util.Log;
import android.view.KeyEvent;
import java.util.List;

public class MediaButtonReceiver extends BroadcastReceiver {

    /* renamed from: android.support.v4.media.session.MediaButtonReceiver$a */
    private static class C2868a extends C0459b {
        /* renamed from: c */
        private final Context f9081c;
        /* renamed from: d */
        private final Intent f9082d;
        /* renamed from: e */
        private final PendingResult f9083e;
        /* renamed from: f */
        private MediaBrowserCompat f9084f;

        C2868a(Context context, Intent intent, PendingResult pendingResult) {
            this.f9081c = context;
            this.f9082d = intent;
            this.f9083e = pendingResult;
        }

        /* renamed from: a */
        void m11315a(MediaBrowserCompat mediaBrowserCompat) {
            this.f9084f = mediaBrowserCompat;
        }

        /* renamed from: a */
        public void mo554a() {
            try {
                new MediaControllerCompat(this.f9081c, this.f9084f.m1800c()).m1907a((KeyEvent) this.f9082d.getParcelableExtra("android.intent.extra.KEY_EVENT"));
            } catch (Throwable e) {
                Log.e("MediaButtonReceiver", "Failed to create a media controller", e);
            }
            m11313d();
        }

        /* renamed from: b */
        public void mo555b() {
            m11313d();
        }

        /* renamed from: c */
        public void mo556c() {
            m11313d();
        }

        /* renamed from: d */
        private void m11313d() {
            this.f9084f.m1799b();
            this.f9083e.finish();
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (intent != null && "android.intent.action.MEDIA_BUTTON".equals(intent.getAction())) {
            if (intent.hasExtra("android.intent.extra.KEY_EVENT")) {
                ComponentName a = m1891a(context, "android.intent.action.MEDIA_BUTTON");
                if (a != null) {
                    intent.setComponent(a);
                    m1892a(context, intent);
                    return;
                }
                a = m1891a(context, "android.media.browse.MediaBrowserService");
                if (a != null) {
                    PendingResult goAsync = goAsync();
                    context = context.getApplicationContext();
                    C0459b c2868a = new C2868a(context, intent, goAsync);
                    intent = new MediaBrowserCompat(context, a, c2868a, null);
                    c2868a.m11315a(intent);
                    intent.m1798a();
                    return;
                }
                throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Ignore unsupported intent: ");
        stringBuilder.append(intent);
        Log.d("MediaButtonReceiver", stringBuilder.toString());
    }

    /* renamed from: a */
    private static void m1892a(Context context, Intent intent) {
        if (VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
    }

    /* renamed from: a */
    private static ComponentName m1891a(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices.size() == 1) {
            ResolveInfo resolveInfo = (ResolveInfo) queryIntentServices.get(0);
            return new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
        } else if (queryIntentServices.isEmpty() != null) {
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expected 1 service that handles ");
            stringBuilder.append(str);
            stringBuilder.append(", found ");
            stringBuilder.append(queryIntentServices.size());
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
