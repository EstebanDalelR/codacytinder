package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.Notification;
import android.app.Notification.BigTextStyle;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.GuardedBy;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.NotificationCompat.C0382c;
import android.support.v4.app.NotificationCompat.C2823b;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.ProgressBar;
import com.facebook.ads.internal.C1391d;
import com.google.android.gms.C2335R;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.aw;
import com.google.android.gms.common.api.internal.zzbx;
import com.google.android.gms.common.api.internal.zzcf;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.common.internal.ay;
import com.google.android.gms.common.internal.az;
import com.google.android.gms.common.util.C2521f;
import com.google.android.gms.common.util.C2526k;

/* renamed from: com.google.android.gms.common.b */
public class C3813b extends C2490g {
    /* renamed from: a */
    public static final int f12042a = C2490g.f7554b;
    /* renamed from: c */
    private static final Object f12043c = new Object();
    /* renamed from: d */
    private static final C3813b f12044d = new C3813b();
    @GuardedBy("mLock")
    /* renamed from: e */
    private String f12045e;

    @SuppressLint({"HandlerLeak"})
    /* renamed from: com.google.android.gms.common.b$a */
    class C2483a extends Handler {
        /* renamed from: a */
        private final Context f7543a;
        /* renamed from: b */
        private /* synthetic */ C3813b f7544b;

        public C2483a(C3813b c3813b, Context context) {
            this.f7544b = c3813b;
            super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
            this.f7543a = context.getApplicationContext();
        }

        public final void handleMessage(Message message) {
            if (message.what != 1) {
                int i = message.what;
                StringBuilder stringBuilder = new StringBuilder(50);
                stringBuilder.append("Don't know how to handle this message: ");
                stringBuilder.append(i);
                Log.w("GoogleApiAvailability", stringBuilder.toString());
                return;
            }
            i = this.f7544b.mo2566a(this.f7543a);
            if (this.f7544b.mo2568a(i)) {
                this.f7544b.m14435a(this.f7543a, i);
            }
        }
    }

    C3813b() {
    }

    /* renamed from: a */
    public static Dialog m14422a(Activity activity, OnCancelListener onCancelListener) {
        View progressBar = new ProgressBar(activity, null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        Builder builder = new Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(ay.m9130c(activity, 18));
        builder.setPositiveButton("", null);
        Dialog create = builder.create();
        C3813b.m14427a(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    /* renamed from: a */
    static Dialog m14423a(Context context, int i, az azVar, OnCancelListener onCancelListener) {
        Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new Builder(context, 5);
        }
        if (builder == null) {
            builder = new Builder(context);
        }
        builder.setMessage(ay.m9130c(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        CharSequence e = ay.m9132e(context, i);
        if (e != null) {
            builder.setPositiveButton(e, azVar);
        }
        CharSequence a = ay.m9125a(context, i);
        if (a != null) {
            builder.setTitle(a);
        }
        return builder.create();
    }

    @Nullable
    /* renamed from: a */
    public static zzbx m14424a(Context context, aw awVar) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        BroadcastReceiver zzbx = new zzbx(awVar);
        context.registerReceiver(zzbx, intentFilter);
        zzbx.m9014a(context);
        if (C2513p.zzv(context, "com.google.android.gms")) {
            return zzbx;
        }
        awVar.mo2520a();
        zzbx.m9013a();
        return null;
    }

    /* renamed from: a */
    public static C3813b m14425a() {
        return f12044d;
    }

    @TargetApi(26)
    /* renamed from: a */
    private final String m14426a(Context context, NotificationManager notificationManager) {
        ad.m9050a(C2526k.m9218i());
        String c = m14429c();
        if (c == null) {
            c = "com.google.android.gms.availability";
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel(c);
            CharSequence a = ay.m9124a(context);
            if (notificationChannel == null) {
                notificationChannel = new NotificationChannel(c, a, 4);
            } else if (!a.equals(notificationChannel.getName())) {
                notificationChannel.setName(a);
            }
            notificationManager.createNotificationChannel(notificationChannel);
            return c;
        }
        return c;
    }

    /* renamed from: a */
    static void m14427a(Activity activity, Dialog dialog, String str, OnCancelListener onCancelListener) {
        if (activity instanceof FragmentActivity) {
            C4399c.m18159a(dialog, onCancelListener).show(((FragmentActivity) activity).getSupportFragmentManager(), str);
            return;
        }
        C2461a.m8841a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    @TargetApi(20)
    /* renamed from: a */
    private final void m14428a(Context context, int i, String str, PendingIntent pendingIntent) {
        if (i == 18) {
            m14440b(context);
        } else if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
            }
        } else {
            Notification build;
            CharSequence b = ay.m9129b(context, i);
            CharSequence d = ay.m9131d(context, i);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (C2521f.m9200b(context)) {
                ad.m9050a(C2526k.m9215f());
                Notification.Builder addAction = new Notification.Builder(context).setSmallIcon(context.getApplicationInfo().icon).setPriority(2).setAutoCancel(true).setContentTitle(b).setStyle(new BigTextStyle().bigText(d)).addAction(C2335R.drawable.common_full_open_on_phone, resources.getString(C2335R.string.common_open_on_phone), pendingIntent);
                if (C2526k.m9218i() && C2526k.m9218i()) {
                    addAction.setChannelId(m14426a(context, notificationManager));
                }
                build = addAction.build();
            } else {
                C0382c a = new C0382c(context).m1410a(17301642).m1423c(resources.getString(C2335R.string.common_google_play_services_notification_ticker)).m1411a(System.currentTimeMillis()).m1418a(true).m1412a(pendingIntent).m1416a(b).m1420b(d).m1421b(true).m1415a(new C2823b().m11018a(d));
                if (C2526k.m9218i() && C2526k.m9218i()) {
                    a.m1417a(m14426a(context, notificationManager));
                }
                build = a.m1409a();
            }
            switch (i) {
                case 1:
                case 2:
                case 3:
                    i = 10436;
                    C2513p.zzfln.set(false);
                    break;
                default:
                    i = 39789;
                    break;
            }
            notificationManager.notify(i, build);
        }
    }

    @VisibleForTesting(otherwise = 2)
    /* renamed from: c */
    private final String m14429c() {
        String str;
        synchronized (f12043c) {
            str = this.f12045e;
        }
        return str;
    }

    /* renamed from: a */
    public int mo2566a(Context context) {
        return super.mo2566a(context);
    }

    /* renamed from: a */
    public Dialog m14431a(Activity activity, int i, int i2) {
        return m14432a(activity, i, i2, null);
    }

    /* renamed from: a */
    public Dialog m14432a(Activity activity, int i, int i2, OnCancelListener onCancelListener) {
        return C3813b.m14423a((Context) activity, i, az.m9133a(activity, C2490g.m9019a((Context) activity, i, C1391d.f3780a), i2), onCancelListener);
    }

    @Nullable
    /* renamed from: a */
    public PendingIntent mo2567a(Context context, int i, int i2) {
        return super.mo2567a(context, i, i2);
    }

    @Nullable
    /* renamed from: a */
    public PendingIntent m14434a(Context context, ConnectionResult connectionResult) {
        return connectionResult.hasResolution() ? connectionResult.getResolution() : mo2567a(context, connectionResult.getErrorCode(), 0);
    }

    /* renamed from: a */
    public void m14435a(Context context, int i) {
        m14428a(context, i, null, m9027a(context, i, 0, "n"));
    }

    /* renamed from: a */
    public final boolean mo2568a(int i) {
        return super.mo2568a(i);
    }

    /* renamed from: a */
    public final boolean m14437a(Activity activity, @NonNull zzcf zzcf, int i, int i2, OnCancelListener onCancelListener) {
        Dialog a = C3813b.m14423a((Context) activity, i, az.m9135a(zzcf, C2490g.m9019a((Context) activity, i, C1391d.f3780a), 2), onCancelListener);
        if (a == null) {
            return false;
        }
        C3813b.m14427a(activity, a, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    /* renamed from: a */
    public final boolean m14438a(Context context, ConnectionResult connectionResult, int i) {
        PendingIntent a = m14434a(context, connectionResult);
        if (a == null) {
            return false;
        }
        m14428a(context, connectionResult.getErrorCode(), null, GoogleApiActivity.m8850a(context, a, i));
        return true;
    }

    /* renamed from: b */
    public final String mo2569b(int i) {
        return super.mo2569b(i);
    }

    /* renamed from: b */
    final void m14440b(Context context) {
        new C2483a(this, context).sendEmptyMessageDelayed(1, 120000);
    }

    /* renamed from: b */
    public boolean m14441b(Activity activity, int i, int i2, OnCancelListener onCancelListener) {
        Dialog a = m14432a(activity, i, i2, onCancelListener);
        if (a == null) {
            return false;
        }
        C3813b.m14427a(activity, a, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }
}
