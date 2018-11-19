package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.ParcelFileDescriptor.AutoCloseOutputStream;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.common.util.C2523h;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.IOException;

@zzzv
public final class zzabj extends zzbfm {
    public static final Creator<zzabj> CREATOR = new ac();
    private ParcelFileDescriptor zzcpy;
    private Parcelable zzcpz;
    private boolean zzcqa;

    public zzabj(ParcelFileDescriptor parcelFileDescriptor) {
        this.zzcpy = parcelFileDescriptor;
        this.zzcpz = null;
        this.zzcqa = true;
    }

    public zzabj(zzbfq zzbfq) {
        this.zzcpy = null;
        this.zzcpz = zzbfq;
        this.zzcqa = false;
    }

    private final <T> ParcelFileDescriptor zze(byte[] bArr) {
        Throwable e;
        Closeable autoCloseOutputStream;
        try {
            ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
            autoCloseOutputStream = new AutoCloseOutputStream(createPipe[1]);
            try {
                new Thread(new ab(this, autoCloseOutputStream, bArr)).start();
                return createPipe[0];
            } catch (IOException e2) {
                e = e2;
                hx.m19912b("Error transporting the ad response", e);
                ar.i().m27296a(e, "LargeParcelTeleporter.pipeData.2");
                C2523h.a(autoCloseOutputStream);
                return null;
            }
        } catch (IOException e3) {
            e = e3;
            autoCloseOutputStream = null;
            hx.m19912b("Error transporting the ad response", e);
            ar.i().m27296a(e, "LargeParcelTeleporter.pipeData.2");
            C2523h.a(autoCloseOutputStream);
            return null;
        }
    }

    private final ParcelFileDescriptor zznn() {
        if (this.zzcpy == null) {
            Parcel obtain = Parcel.obtain();
            try {
                this.zzcpz.writeToParcel(obtain, 0);
                byte[] marshall = obtain.marshall();
                this.zzcpy = zze(marshall);
            } finally {
                obtain.recycle();
            }
        }
        return this.zzcpy;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        zznn();
        int a = oj.m20087a(parcel);
        oj.m20096a(parcel, 2, this.zzcpy, i, false);
        oj.m20088a(parcel, a);
    }

    public final <T extends zzbfq> T zza(Creator<T> creator) {
        Creator creator2;
        if (this.zzcqa) {
            if (this.zzcpy == null) {
                hx.m19913c("File descriptor is empty, returning null.");
                return null;
            }
            byte[] autoCloseInputStream = new AutoCloseInputStream(this.zzcpy);
            Closeable dataInputStream = new DataInputStream(autoCloseInputStream);
            try {
                autoCloseInputStream = new byte[dataInputStream.readInt()];
                boolean z = false;
                dataInputStream.readFully(autoCloseInputStream, z, autoCloseInputStream.length);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.unmarshall(autoCloseInputStream, z, autoCloseInputStream.length);
                    obtain.setDataPosition(z);
                    this.zzcpz = (zzbfq) creator2.createFromParcel(obtain);
                    this.zzcqa = z;
                } finally {
                    obtain.recycle();
                }
            } catch (IOException e) {
                creator2 = e;
                autoCloseInputStream = "Could not read from parcel file descriptor";
                hx.m19912b(autoCloseInputStream, creator2);
                return null;
            } finally {
                C2523h.a(dataInputStream);
            }
        }
        return (zzbfq) this.zzcpz;
    }
}
