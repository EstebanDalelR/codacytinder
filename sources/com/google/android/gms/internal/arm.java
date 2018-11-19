package com.google.android.gms.internal;

final class arm implements Runnable {
    /* renamed from: a */
    private /* synthetic */ ark f15660a;
    /* renamed from: b */
    private /* synthetic */ arl f15661b;

    arm(arl arl, ark ark) {
        this.f15661b = arl;
        this.f15660a = ark;
    }

    public final void run() {
        synchronized (this.f15661b.f23068i) {
            if (this.f15661b.f23078s != -2) {
                return;
            }
            this.f15661b.f23077r = this.f15661b.m27217d();
            if (this.f15661b.f23077r == null) {
                this.f15661b.zzv(4);
            } else if (!this.f15661b.m27219e() || this.f15661b.m27210a(1)) {
                this.f15660a.m31504a(this.f15661b);
                this.f15661b.m27208a(this.f15660a);
            } else {
                String f = this.f15661b.f23060a;
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(f).length() + 56);
                stringBuilder.append("Ignoring adapter ");
                stringBuilder.append(f);
                stringBuilder.append(" as delayed impression is not supported");
                hx.m19916e(stringBuilder.toString());
                this.f15661b.zzv(2);
            }
        }
    }
}
