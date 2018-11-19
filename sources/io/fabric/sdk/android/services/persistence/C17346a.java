package io.fabric.sdk.android.services.persistence;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Environment;
import io.fabric.sdk.android.C15608c;
import io.fabric.sdk.android.C15611g;
import java.io.File;

/* renamed from: io.fabric.sdk.android.services.persistence.a */
public class C17346a implements FileStore {
    /* renamed from: a */
    private final Context f53072a;
    /* renamed from: b */
    private final String f53073b;
    /* renamed from: c */
    private final String f53074c;

    public C17346a(C15611g c15611g) {
        if (c15611g.getContext() == null) {
            throw new IllegalStateException("Cannot get directory before context has been set. Call Fabric.with() first");
        }
        this.f53072a = c15611g.getContext();
        this.f53073b = c15611g.getPath();
        c15611g = new StringBuilder();
        c15611g.append("Android/");
        c15611g.append(this.f53072a.getPackageName());
        this.f53074c = c15611g.toString();
    }

    public File getCacheDir() {
        return m63407a(this.f53072a.getCacheDir());
    }

    public File getExternalCacheDir() {
        File file;
        if (!m63408a()) {
            file = null;
        } else if (VERSION.SDK_INT >= 8) {
            file = this.f53072a.getExternalCacheDir();
        } else {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f53074c);
            stringBuilder.append("/cache/");
            stringBuilder.append(this.f53073b);
            file = new File(externalStorageDirectory, stringBuilder.toString());
        }
        return m63407a(file);
    }

    public File getFilesDir() {
        return m63407a(this.f53072a.getFilesDir());
    }

    @TargetApi(8)
    public File getExternalFilesDir() {
        File file = null;
        if (m63408a()) {
            if (VERSION.SDK_INT >= 8) {
                file = this.f53072a.getExternalFilesDir(null);
            } else {
                File externalStorageDirectory = Environment.getExternalStorageDirectory();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.f53074c);
                stringBuilder.append("/files/");
                stringBuilder.append(this.f53073b);
                file = new File(externalStorageDirectory, stringBuilder.toString());
            }
        }
        return m63407a(file);
    }

    /* renamed from: a */
    File m63407a(File file) {
        if (file != null) {
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    C15608c.m58560h().mo12804w("Fabric", "Couldn't create file");
                }
            }
            return file;
        }
        C15608c.m58560h().mo12791d("Fabric", "Null File");
        return null;
    }

    /* renamed from: a */
    boolean m63408a() {
        if ("mounted".equals(Environment.getExternalStorageState())) {
            return true;
        }
        C15608c.m58560h().mo12804w("Fabric", "External Storage is not mounted and/or writable\nHave you declared android.permission.WRITE_EXTERNAL_STORAGE in the manifest?");
        return false;
    }
}
