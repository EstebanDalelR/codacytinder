package com.firebase.jobdispatcher;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;

/* renamed from: com.firebase.jobdispatcher.d */
public final class C3487d implements Driver {
    /* renamed from: a */
    private final JobValidator f10526a;
    /* renamed from: b */
    private final Context f10527b;
    /* renamed from: c */
    private final PendingIntent f10528c;
    /* renamed from: d */
    private final C1878f f10529d;
    /* renamed from: e */
    private final boolean f10530e = true;

    public boolean isAvailable() {
        return true;
    }

    public C3487d(Context context) {
        this.f10527b = context;
        this.f10528c = PendingIntent.getBroadcast(context, 0, new Intent(), 0);
        this.f10529d = new C1878f();
        this.f10526a = new C3486a(context);
    }

    public int schedule(@NonNull C3491i c3491i) {
        GooglePlayReceiver.m13222a(c3491i);
        this.f10527b.sendBroadcast(m13247a((JobParameters) c3491i));
        return null;
    }

    public int cancel(@NonNull String str) {
        this.f10527b.sendBroadcast(m13250a(str));
        return null;
    }

    public int cancelAll() {
        this.f10527b.sendBroadcast(m13249a());
        return 0;
    }

    @NonNull
    /* renamed from: a */
    protected Intent m13250a(@NonNull String str) {
        Intent b = m13248b("CANCEL_TASK");
        b.putExtra("tag", str);
        b.putExtra("component", new ComponentName(this.f10527b, m13251b()));
        return b;
    }

    @NonNull
    /* renamed from: a */
    protected Intent m13249a() {
        Intent b = m13248b("CANCEL_ALL");
        b.putExtra("component", new ComponentName(this.f10527b, m13251b()));
        return b;
    }

    @NonNull
    /* renamed from: b */
    protected Class<GooglePlayReceiver> m13251b() {
        return GooglePlayReceiver.class;
    }

    @NonNull
    public JobValidator getValidator() {
        return this.f10526a;
    }

    @NonNull
    /* renamed from: a */
    private Intent m13247a(JobParameters jobParameters) {
        Intent b = m13248b("SCHEDULE_TASK");
        b.putExtras(this.f10529d.m6600a(jobParameters, b.getExtras()));
        return b;
    }

    @NonNull
    /* renamed from: b */
    private Intent m13248b(String str) {
        Intent intent = new Intent("com.google.android.gms.gcm.ACTION_SCHEDULE");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("scheduler_action", str);
        intent.putExtra("app", this.f10528c);
        intent.putExtra("source", 8);
        intent.putExtra("source_version", 1);
        return intent;
    }
}
