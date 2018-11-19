package com.google.android.gms.common.data;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.oj;
import com.google.android.gms.internal.zzbfm;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public class BitmapTeleporter extends zzbfm implements ReflectedParcelable {
    public static final Creator<BitmapTeleporter> CREATOR = new C2486a();
    private ParcelFileDescriptor zzcpy;
    private int zzeck;
    private int zzeie;
    private Bitmap zzfvr;
    private boolean zzfvs;
    private File zzfvt;

    BitmapTeleporter(int i, ParcelFileDescriptor parcelFileDescriptor, int i2) {
        this.zzeck = i;
        this.zzcpy = parcelFileDescriptor;
        this.zzeie = i2;
        this.zzfvr = null;
        this.zzfvs = false;
    }

    public BitmapTeleporter(Bitmap bitmap) {
        this.zzeck = 1;
        this.zzcpy = null;
        this.zzeie = 0;
        this.zzfvr = bitmap;
        this.zzfvs = true;
    }

    private static void zza(Closeable closeable) {
        try {
            closeable.close();
        } catch (Throwable e) {
            Log.w("BitmapTeleporter", "Could not close stream", e);
        }
    }

    private final java.io.FileOutputStream zzajx() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r3 = this;
        r0 = r3.zzfvt;
        if (r0 != 0) goto L_0x000c;
    L_0x0004:
        r0 = new java.lang.IllegalStateException;
        r1 = "setTempDir() must be called before writing this object to a parcel";
        r0.<init>(r1);
        throw r0;
    L_0x000c:
        r0 = "teleporter";	 Catch:{ IOException -> 0x002f }
        r1 = ".tmp";	 Catch:{ IOException -> 0x002f }
        r2 = r3.zzfvt;	 Catch:{ IOException -> 0x002f }
        r0 = java.io.File.createTempFile(r0, r1, r2);	 Catch:{ IOException -> 0x002f }
        r1 = new java.io.FileOutputStream;	 Catch:{ FileNotFoundException -> 0x0027 }
        r1.<init>(r0);	 Catch:{ FileNotFoundException -> 0x0027 }
        r2 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;	 Catch:{ FileNotFoundException -> 0x0027 }
        r2 = android.os.ParcelFileDescriptor.open(r0, r2);	 Catch:{ FileNotFoundException -> 0x0027 }
        r3.zzcpy = r2;	 Catch:{ FileNotFoundException -> 0x0027 }
        r0.delete();
        return r1;
    L_0x0027:
        r0 = new java.lang.IllegalStateException;
        r1 = "Temporary file is somehow already deleted";
        r0.<init>(r1);
        throw r0;
    L_0x002f:
        r0 = move-exception;
        r1 = new java.lang.IllegalStateException;
        r2 = "Could not create temporary file";
        r1.<init>(r2, r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.data.BitmapTeleporter.zzajx():java.io.FileOutputStream");
    }

    public final void release() {
        if (!this.zzfvs) {
            try {
                this.zzcpy.close();
            } catch (Throwable e) {
                Log.w("BitmapTeleporter", "Could not close PFD", e);
            }
        }
    }

    public final void setTempDir(File file) {
        if (file == null) {
            throw new NullPointerException("Cannot set null temp directory");
        }
        this.zzfvt = file;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (this.zzcpy == null) {
            Bitmap bitmap = this.zzfvr;
            Buffer allocate = ByteBuffer.allocate(bitmap.getRowBytes() * bitmap.getHeight());
            bitmap.copyPixelsToBuffer(allocate);
            byte[] array = allocate.array();
            Closeable dataOutputStream = new DataOutputStream(new BufferedOutputStream(zzajx()));
            try {
                dataOutputStream.writeInt(array.length);
                dataOutputStream.writeInt(bitmap.getWidth());
                dataOutputStream.writeInt(bitmap.getHeight());
                dataOutputStream.writeUTF(bitmap.getConfig().toString());
                dataOutputStream.write(array);
                zza(dataOutputStream);
            } catch (Throwable e) {
                throw new IllegalStateException("Could not write into unlinked file", e);
            } catch (Throwable th) {
                zza(dataOutputStream);
            }
        }
        i |= 1;
        int a = oj.a(parcel);
        oj.a(parcel, 1, this.zzeck);
        oj.a(parcel, 2, this.zzcpy, i, false);
        oj.a(parcel, 3, this.zzeie);
        oj.a(parcel, a);
        this.zzcpy = null;
    }

    public final Bitmap zzajw() {
        if (!this.zzfvs) {
            Closeable dataInputStream = new DataInputStream(new AutoCloseInputStream(this.zzcpy));
            try {
                byte[] bArr = new byte[dataInputStream.readInt()];
                int readInt = dataInputStream.readInt();
                int readInt2 = dataInputStream.readInt();
                Config valueOf = Config.valueOf(dataInputStream.readUTF());
                dataInputStream.read(bArr);
                zza(dataInputStream);
                Buffer wrap = ByteBuffer.wrap(bArr);
                Bitmap createBitmap = Bitmap.createBitmap(readInt, readInt2, valueOf);
                createBitmap.copyPixelsFromBuffer(wrap);
                this.zzfvr = createBitmap;
                this.zzfvs = true;
            } catch (Throwable e) {
                throw new IllegalStateException("Could not read from parcel file descriptor", e);
            } catch (Throwable th) {
                zza(dataInputStream);
            }
        }
        return this.zzfvr;
    }
}
