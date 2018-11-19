package io.fabric.sdk.android.services.events;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.QueueFile;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: io.fabric.sdk.android.services.events.c */
public class C17342c implements EventsStorage {
    /* renamed from: a */
    private final Context f53060a;
    /* renamed from: b */
    private final File f53061b;
    /* renamed from: c */
    private final String f53062c;
    /* renamed from: d */
    private final File f53063d;
    /* renamed from: e */
    private QueueFile f53064e = new QueueFile(this.f53063d);
    /* renamed from: f */
    private File f53065f;

    public C17342c(Context context, File file, String str, String str2) throws IOException {
        this.f53060a = context;
        this.f53061b = file;
        this.f53062c = str2;
        this.f53063d = new File(this.f53061b, str);
        m63399a();
    }

    /* renamed from: a */
    private void m63399a() {
        this.f53065f = new File(this.f53061b, this.f53062c);
        if (!this.f53065f.exists()) {
            this.f53065f.mkdirs();
        }
    }

    public void add(byte[] bArr) throws IOException {
        this.f53064e.m58669a(bArr);
    }

    public int getWorkingFileUsedSizeInBytes() {
        return this.f53064e.m58667a();
    }

    public void rollOver(String str) throws IOException {
        this.f53064e.close();
        m63400a(this.f53063d, new File(this.f53065f, str));
        this.f53064e = new QueueFile(this.f53063d);
    }

    /* renamed from: a */
    private void m63400a(File file, File file2) throws IOException {
        Closeable closeable = null;
        Closeable fileInputStream;
        try {
            Closeable a;
            fileInputStream = new FileInputStream(file);
            try {
                a = mo13556a(file2);
            } catch (Throwable th) {
                file2 = th;
                CommonUtils.m58603a(fileInputStream, "Failed to close file input stream");
                CommonUtils.m58603a(closeable, "Failed to close output stream");
                file.delete();
                throw file2;
            }
            try {
                CommonUtils.m58605a((InputStream) fileInputStream, (OutputStream) a, new byte[1024]);
                CommonUtils.m58603a(fileInputStream, "Failed to close file input stream");
                CommonUtils.m58603a(a, "Failed to close output stream");
                file.delete();
            } catch (Throwable th2) {
                Throwable th3 = th2;
                closeable = a;
                file2 = th3;
                CommonUtils.m58603a(fileInputStream, "Failed to close file input stream");
                CommonUtils.m58603a(closeable, "Failed to close output stream");
                file.delete();
                throw file2;
            }
        } catch (Throwable th4) {
            file2 = th4;
            fileInputStream = null;
            CommonUtils.m58603a(fileInputStream, "Failed to close file input stream");
            CommonUtils.m58603a(closeable, "Failed to close output stream");
            file.delete();
            throw file2;
        }
    }

    /* renamed from: a */
    public OutputStream mo13556a(File file) throws IOException {
        return new FileOutputStream(file);
    }

    public File getWorkingDirectory() {
        return this.f53061b;
    }

    public File getRollOverDirectory() {
        return this.f53065f;
    }

    public List<File> getBatchOfFilesToSend(int i) {
        List<File> arrayList = new ArrayList();
        for (Object add : this.f53065f.listFiles()) {
            arrayList.add(add);
            if (arrayList.size() >= i) {
                break;
            }
        }
        return arrayList;
    }

    public void deleteFilesInRollOverDirectory(List<File> list) {
        for (File file : list) {
            CommonUtils.m58600a(this.f53060a, String.format("deleting sent analytics file %s", new Object[]{file.getName()}));
            file.delete();
        }
    }

    public List<File> getAllFilesInRollOverDirectory() {
        return Arrays.asList(this.f53065f.listFiles());
    }

    public void deleteWorkingFile() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = this;
        r0 = r1.f53064e;	 Catch:{ IOException -> 0x0005 }
        r0.close();	 Catch:{ IOException -> 0x0005 }
    L_0x0005:
        r0 = r1.f53063d;
        r0.delete();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.fabric.sdk.android.services.events.c.deleteWorkingFile():void");
    }

    public boolean isWorkingFileEmpty() {
        return this.f53064e.m58672b();
    }

    public boolean canWorkingFileStore(int i, int i2) {
        return this.f53064e.m58671a(i, i2);
    }
}
