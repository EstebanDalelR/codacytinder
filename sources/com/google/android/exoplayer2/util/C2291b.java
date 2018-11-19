package com.google.android.exoplayer2.util;

import android.support.annotation.NonNull;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.google.android.exoplayer2.util.b */
public final class C2291b {
    /* renamed from: a */
    private final File f6888a;
    /* renamed from: b */
    private final File f6889b;

    /* renamed from: com.google.android.exoplayer2.util.b$a */
    private static final class C2290a extends OutputStream {
        /* renamed from: a */
        private final FileOutputStream f6886a;
        /* renamed from: b */
        private boolean f6887b = false;

        public C2290a(File file) throws FileNotFoundException {
            this.f6886a = new FileOutputStream(file);
        }

        public void close() throws IOException {
            if (!this.f6887b) {
                this.f6887b = true;
                flush();
                try {
                    this.f6886a.getFD().sync();
                } catch (Throwable e) {
                    Log.w("AtomicFile", "Failed to sync file descriptor:", e);
                }
                this.f6886a.close();
            }
        }

        public void flush() throws IOException {
            this.f6886a.flush();
        }

        public void write(int i) throws IOException {
            this.f6886a.write(i);
        }

        public void write(@NonNull byte[] bArr) throws IOException {
            this.f6886a.write(bArr);
        }

        public void write(@NonNull byte[] bArr, int i, int i2) throws IOException {
            this.f6886a.write(bArr, i, i2);
        }
    }

    public C2291b(File file) {
        this.f6888a = file;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(file.getPath());
        stringBuilder.append(".bak");
        this.f6889b = new File(stringBuilder.toString());
    }

    /* renamed from: a */
    public void m8316a() {
        this.f6888a.delete();
        this.f6889b.delete();
    }

    /* renamed from: b */
    public OutputStream m8318b() throws IOException {
        if (this.f6888a.exists()) {
            if (this.f6889b.exists()) {
                this.f6888a.delete();
            } else if (!this.f6888a.renameTo(this.f6889b)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Couldn't rename file ");
                stringBuilder.append(this.f6888a);
                stringBuilder.append(" to backup file ");
                stringBuilder.append(this.f6889b);
                Log.w("AtomicFile", stringBuilder.toString());
            }
        }
        try {
            return new C2290a(this.f6888a);
        } catch (Throwable e) {
            StringBuilder stringBuilder2;
            if (this.f6888a.getParentFile().mkdirs()) {
                try {
                    return new C2290a(this.f6888a);
                } catch (Throwable e2) {
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Couldn't create ");
                    stringBuilder2.append(this.f6888a);
                    throw new IOException(stringBuilder2.toString(), e2);
                }
            }
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Couldn't create directory ");
            stringBuilder2.append(this.f6888a);
            throw new IOException(stringBuilder2.toString(), e2);
        }
    }

    /* renamed from: a */
    public void m8317a(OutputStream outputStream) throws IOException {
        outputStream.close();
        this.f6889b.delete();
    }

    /* renamed from: c */
    public InputStream m8319c() throws FileNotFoundException {
        m8315d();
        return new FileInputStream(this.f6888a);
    }

    /* renamed from: d */
    private void m8315d() {
        if (this.f6889b.exists()) {
            this.f6888a.delete();
            this.f6889b.renameTo(this.f6888a);
        }
    }
}
