package com.facebook.ads.internal.p043j.p044a;

import android.os.AsyncTask;

/* renamed from: com.facebook.ads.internal.j.a.h */
public class C3301h extends AsyncTask<C1438l, Void, C1440n> implements C1435c {
    /* renamed from: a */
    private C1433a f10079a;
    /* renamed from: b */
    private C1434b f10080b;
    /* renamed from: c */
    private Exception f10081c;

    public C3301h(C1433a c1433a, C1434b c1434b) {
        this.f10079a = c1433a;
        this.f10080b = c1434b;
    }

    /* renamed from: a */
    protected C1440n m12740a(C1438l... c1438lArr) {
        if (c1438lArr != null) {
            try {
                if (c1438lArr.length > 0) {
                    return this.f10079a.m5013a(c1438lArr[0]);
                }
            } catch (Exception e) {
                this.f10081c = e;
                cancel(true);
                return null;
            }
        }
        throw new IllegalArgumentException("DoHttpRequestTask takes exactly one argument of type HttpRequest");
    }

    /* renamed from: a */
    public void mo1766a(C1438l c1438l) {
        super.execute(new C1438l[]{c1438l});
    }

    /* renamed from: a */
    protected void m12742a(C1440n c1440n) {
        this.f10080b.mo1782a(c1440n);
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m12740a((C1438l[]) objArr);
    }

    protected void onCancelled() {
        this.f10080b.mo1783a(this.f10081c);
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m12742a((C1440n) obj);
    }
}
