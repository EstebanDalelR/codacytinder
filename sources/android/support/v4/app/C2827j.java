package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.app.j */
public abstract class C2827j<E> extends C0391h {
    /* renamed from: a */
    private final Activity f8954a;
    /* renamed from: b */
    final Context f8955b;
    /* renamed from: c */
    final int f8956c;
    /* renamed from: d */
    final C2832k f8957d;
    /* renamed from: e */
    private final Handler f8958e;

    @Nullable
    /* renamed from: a */
    public View mo380a(int i) {
        return null;
    }

    /* renamed from: a */
    public void mo3021a(@NonNull Fragment fragment, @NonNull String[] strArr, int i) {
    }

    /* renamed from: a */
    public void mo3022a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: a */
    public boolean mo381a() {
        return true;
    }

    /* renamed from: a */
    public boolean mo3023a(Fragment fragment) {
        return true;
    }

    /* renamed from: a */
    public boolean mo3024a(@NonNull String str) {
        return false;
    }

    /* renamed from: b */
    void mo3026b(Fragment fragment) {
    }

    /* renamed from: d */
    public void mo3027d() {
    }

    /* renamed from: e */
    public boolean mo3028e() {
        return true;
    }

    @Nullable
    /* renamed from: g */
    public abstract E mo3030g();

    C2827j(FragmentActivity fragmentActivity) {
        this(fragmentActivity, fragmentActivity, fragmentActivity.mHandler, 0);
    }

    C2827j(Activity activity, Context context, Handler handler, int i) {
        this.f8957d = new C2832k();
        this.f8954a = activity;
        this.f8955b = context;
        this.f8958e = handler;
        this.f8956c = i;
    }

    @NonNull
    /* renamed from: b */
    public LayoutInflater mo3025b() {
        return LayoutInflater.from(this.f8955b);
    }

    /* renamed from: a */
    public void mo3019a(Fragment fragment, Intent intent, int i, @Nullable Bundle bundle) {
        if (i != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        this.f8955b.startActivity(intent);
    }

    /* renamed from: a */
    public void mo3020a(Fragment fragment, IntentSender intentSender, int i, @Nullable Intent intent, int i2, int i3, int i4, Bundle bundle) throws SendIntentException {
        int i5 = i;
        if (i5 != -1) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        ActivityCompat.m10975a(this.f8954a, intentSender, i5, intent, i2, i3, i4, bundle);
    }

    /* renamed from: f */
    public int mo3029f() {
        return this.f8956c;
    }

    /* renamed from: h */
    Activity m11069h() {
        return this.f8954a;
    }

    /* renamed from: i */
    Context m11070i() {
        return this.f8955b;
    }

    /* renamed from: j */
    Handler m11071j() {
        return this.f8958e;
    }

    /* renamed from: k */
    C2832k m11072k() {
        return this.f8957d;
    }
}
