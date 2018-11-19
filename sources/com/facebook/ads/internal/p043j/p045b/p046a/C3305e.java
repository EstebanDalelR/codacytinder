package com.facebook.ads.internal.p043j.p045b.p046a;

import android.util.Log;
import java.io.File;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.facebook.ads.internal.j.b.a.e */
abstract class C3305e implements C1445a {
    /* renamed from: a */
    private final ExecutorService f10085a = Executors.newSingleThreadExecutor();

    /* renamed from: com.facebook.ads.internal.j.b.a.e$a */
    private class C1450a implements Callable<Void> {
        /* renamed from: a */
        final /* synthetic */ C3305e f3988a;
        /* renamed from: b */
        private final File f3989b;

        public C1450a(C3305e c3305e, File file) {
            this.f3988a = c3305e;
            this.f3989b = file;
        }

        /* renamed from: a */
        public Void m5075a() {
            this.f3988a.m12753b(this.f3989b);
            return null;
        }

        public /* synthetic */ Object call() {
            return m5075a();
        }
    }

    C3305e() {
    }

    /* renamed from: a */
    private void m12751a(List<File> list) {
        long b = m12752b((List) list);
        int size = list.size();
        for (File file : list) {
            if (!mo3338a(file, b, size)) {
                long length = file.length();
                if (file.delete()) {
                    size--;
                    long j = b - length;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Cache file ");
                    stringBuilder.append(file);
                    stringBuilder.append(" is deleted because it exceeds cache limit");
                    Log.i("ProxyCache", stringBuilder.toString());
                    b = j;
                } else {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Error deleting file ");
                    stringBuilder2.append(file);
                    stringBuilder2.append(" for trimming cache");
                    Log.e("ProxyCache", stringBuilder2.toString());
                }
            }
        }
    }

    /* renamed from: b */
    private long m12752b(List<File> list) {
        long j = 0;
        for (File length : list) {
            j += length.length();
        }
        return j;
    }

    /* renamed from: b */
    private void m12753b(File file) {
        C1449d.m5072c(file);
        m12751a(C1449d.m5071b(file.getParentFile()));
    }

    /* renamed from: a */
    public void mo1773a(File file) {
        this.f10085a.submit(new C1450a(this, file));
    }

    /* renamed from: a */
    protected abstract boolean mo3338a(File file, long j, int i);
}
