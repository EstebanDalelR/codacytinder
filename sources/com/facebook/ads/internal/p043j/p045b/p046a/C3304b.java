package com.facebook.ads.internal.p043j.p045b.p046a;

import com.facebook.ads.internal.p043j.p045b.C1451a;
import com.facebook.ads.internal.p043j.p045b.C1467l;
import java.io.File;
import java.io.RandomAccessFile;

/* renamed from: com.facebook.ads.internal.j.b.a.b */
public class C3304b implements C1451a {
    /* renamed from: a */
    public File f10082a;
    /* renamed from: b */
    private final C1445a f10083b;
    /* renamed from: c */
    private RandomAccessFile f10084c;

    public C3304b(File file, C1445a c1445a) {
        if (c1445a == null) {
            try {
                throw new NullPointerException();
            } catch (Throwable e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Error using file ");
                stringBuilder.append(file);
                stringBuilder.append(" as disc cache");
                throw new C1467l(stringBuilder.toString(), e);
            }
        }
        File file2;
        this.f10083b = c1445a;
        C1449d.m5070a(file.getParentFile());
        boolean exists = file.exists();
        if (exists) {
            file2 = file;
        } else {
            File parentFile = file.getParentFile();
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(file.getName());
            stringBuilder2.append(".download");
            file2 = new File(parentFile, stringBuilder2.toString());
        }
        this.f10082a = file2;
        this.f10084c = new RandomAccessFile(this.f10082a, exists ? "r" : "rw");
    }

    /* renamed from: a */
    private boolean m12743a(File file) {
        return file.getName().endsWith(".download");
    }

    /* renamed from: a */
    public synchronized int mo1767a() {
        try {
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error reading length of file ");
            stringBuilder.append(this.f10082a);
            throw new C1467l(stringBuilder.toString(), e);
        }
        return (int) this.f10084c.length();
    }

    /* renamed from: a */
    public synchronized int mo1768a(byte[] bArr, long j, int i) {
        try {
            this.f10084c.seek(j);
        } catch (Throwable e) {
            throw new C1467l(String.format("Error reading %d bytes with offset %d from file[%d bytes] to buffer[%d bytes]", new Object[]{Integer.valueOf(i), Long.valueOf(j), Integer.valueOf(mo1767a()), Integer.valueOf(bArr.length)}), e);
        }
        return this.f10084c.read(bArr, 0, i);
    }

    /* renamed from: a */
    public synchronized void mo1769a(byte[] bArr, int i) {
        try {
            if (mo1772d()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Error append cache: cache file ");
                stringBuilder.append(this.f10082a);
                stringBuilder.append(" is completed!");
                throw new C1467l(stringBuilder.toString());
            }
            this.f10084c.seek((long) mo1767a());
            this.f10084c.write(bArr, 0, i);
        } catch (Throwable e) {
            throw new C1467l(String.format("Error writing %d bytes to %s from buffer with size %d", new Object[]{Integer.valueOf(i), this.f10084c, Integer.valueOf(bArr.length)}), e);
        }
    }

    /* renamed from: b */
    public synchronized void mo1770b() {
        try {
            this.f10084c.close();
            this.f10083b.mo1773a(this.f10082a);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error closing file ");
            stringBuilder.append(this.f10082a);
            throw new C1467l(stringBuilder.toString(), e);
        }
    }

    /* renamed from: c */
    public synchronized void mo1771c() {
        StringBuilder stringBuilder;
        if (!mo1772d()) {
            mo1770b();
            File file = new File(this.f10082a.getParentFile(), this.f10082a.getName().substring(0, this.f10082a.getName().length() - ".download".length()));
            if (this.f10082a.renameTo(file)) {
                this.f10082a = file;
                try {
                    this.f10084c = new RandomAccessFile(this.f10082a, "r");
                    return;
                } catch (Throwable e) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Error opening ");
                    stringBuilder.append(this.f10082a);
                    stringBuilder.append(" as disc cache");
                    throw new C1467l(stringBuilder.toString(), e);
                }
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Error renaming file ");
            stringBuilder.append(this.f10082a);
            stringBuilder.append(" to ");
            stringBuilder.append(file);
            stringBuilder.append(" for completion!");
            throw new C1467l(stringBuilder.toString());
        }
    }

    /* renamed from: d */
    public synchronized boolean mo1772d() {
        return m12743a(this.f10082a) ^ 1;
    }
}
