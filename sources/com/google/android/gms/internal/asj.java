package com.google.android.gms.internal;

import android.os.RemoteException;

public final class asj extends ajz {
    /* renamed from: a */
    private final Object f26793a = new Object();
    /* renamed from: b */
    private volatile zzlo f26794b;

    public final float getAspectRatio() throws RemoteException {
        throw new RemoteException();
    }

    public final int getPlaybackState() throws RemoteException {
        throw new RemoteException();
    }

    public final boolean isClickToExpandEnabled() throws RemoteException {
        throw new RemoteException();
    }

    public final boolean isCustomControlsEnabled() throws RemoteException {
        throw new RemoteException();
    }

    public final boolean isMuted() throws RemoteException {
        throw new RemoteException();
    }

    public final void mute(boolean z) throws RemoteException {
        throw new RemoteException();
    }

    public final void pause() throws RemoteException {
        throw new RemoteException();
    }

    public final void play() throws RemoteException {
        throw new RemoteException();
    }

    public final void zza(zzlo zzlo) throws RemoteException {
        synchronized (this.f26793a) {
            this.f26794b = zzlo;
        }
    }

    public final float zzih() throws RemoteException {
        throw new RemoteException();
    }

    public final float zzii() throws RemoteException {
        throw new RemoteException();
    }

    public final zzlo zzij() throws RemoteException {
        zzlo zzlo;
        synchronized (this.f26793a) {
            zzlo = this.f26794b;
        }
        return zzlo;
    }
}
