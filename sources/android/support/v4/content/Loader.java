package android.support.v4.content;

import android.content.Context;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.util.C0548d;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class Loader<D> {
    /* renamed from: f */
    int f1435f;
    /* renamed from: g */
    OnLoadCompleteListener<D> f1436g;
    /* renamed from: h */
    OnLoadCanceledListener<D> f1437h;
    /* renamed from: i */
    Context f1438i;
    /* renamed from: j */
    boolean f1439j = false;
    /* renamed from: k */
    boolean f1440k = false;
    /* renamed from: l */
    boolean f1441l = true;
    /* renamed from: m */
    boolean f1442m = false;
    /* renamed from: n */
    boolean f1443n = false;

    public interface OnLoadCanceledListener<D> {
        void onLoadCanceled(@NonNull Loader<D> loader);
    }

    public interface OnLoadCompleteListener<D> {
        void onLoadComplete(@NonNull Loader<D> loader, @Nullable D d);
    }

    @MainThread
    /* renamed from: a */
    protected void mo456a() {
    }

    @MainThread
    /* renamed from: b */
    protected boolean mo458b() {
        return false;
    }

    @MainThread
    /* renamed from: l */
    protected void mo3564l() {
    }

    @MainThread
    /* renamed from: p */
    protected void m1614p() {
    }

    @MainThread
    /* renamed from: r */
    protected void m1616r() {
    }

    @MainThread
    /* renamed from: t */
    protected void m1618t() {
    }

    public Loader(@NonNull Context context) {
        this.f1438i = context.getApplicationContext();
    }

    @MainThread
    /* renamed from: b */
    public void m1602b(@Nullable D d) {
        if (this.f1436g != null) {
            this.f1436g.onLoadComplete(this, d);
        }
    }

    @MainThread
    /* renamed from: g */
    public void m1605g() {
        if (this.f1437h != null) {
            this.f1437h.onLoadCanceled(this);
        }
    }

    /* renamed from: h */
    public int m1606h() {
        return this.f1435f;
    }

    @MainThread
    /* renamed from: a */
    public void m1599a(int i, @NonNull OnLoadCompleteListener<D> onLoadCompleteListener) {
        if (this.f1436g != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.f1436g = onLoadCompleteListener;
        this.f1435f = i;
    }

    @MainThread
    /* renamed from: a */
    public void m1600a(@NonNull OnLoadCompleteListener<D> onLoadCompleteListener) {
        if (this.f1436g == null) {
            throw new IllegalStateException("No listener register");
        } else if (this.f1436g != onLoadCompleteListener) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        } else {
            this.f1436g = null;
        }
    }

    /* renamed from: i */
    public boolean m1607i() {
        return this.f1439j;
    }

    /* renamed from: j */
    public boolean m1608j() {
        return this.f1440k;
    }

    @MainThread
    /* renamed from: k */
    public final void m1609k() {
        this.f1439j = true;
        this.f1441l = false;
        this.f1440k = false;
        mo3564l();
    }

    @MainThread
    /* renamed from: m */
    public boolean m1611m() {
        return mo458b();
    }

    @MainThread
    /* renamed from: n */
    public void m1612n() {
        mo456a();
    }

    @MainThread
    /* renamed from: o */
    public void m1613o() {
        this.f1439j = false;
        m1614p();
    }

    @MainThread
    /* renamed from: q */
    public void m1615q() {
        this.f1440k = true;
        m1616r();
    }

    @MainThread
    /* renamed from: s */
    public void m1617s() {
        m1618t();
        this.f1441l = true;
        this.f1439j = false;
        this.f1440k = false;
        this.f1442m = false;
        this.f1443n = false;
    }

    /* renamed from: u */
    public void m1619u() {
        this.f1443n = false;
    }

    /* renamed from: v */
    public void m1620v() {
        if (this.f1443n) {
            m1621w();
        }
    }

    @MainThread
    /* renamed from: w */
    public void m1621w() {
        if (this.f1439j) {
            m1612n();
        } else {
            this.f1442m = true;
        }
    }

    @NonNull
    /* renamed from: c */
    public String m1604c(@Nullable D d) {
        StringBuilder stringBuilder = new StringBuilder(64);
        C0548d.m2021a(d, stringBuilder);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(64);
        C0548d.m2021a(this, stringBuilder);
        stringBuilder.append(" id=");
        stringBuilder.append(this.f1435f);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public void mo457a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f1435f);
        printWriter.print(" mListener=");
        printWriter.println(this.f1436g);
        if (!(this.f1439j == null && this.f1442m == null && this.f1443n == null)) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f1439j);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f1442m);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f1443n);
        }
        if (this.f1440k != null || this.f1441l != null) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f1440k);
            printWriter.print(" mReset=");
            printWriter.println(this.f1441l);
        }
    }
}
