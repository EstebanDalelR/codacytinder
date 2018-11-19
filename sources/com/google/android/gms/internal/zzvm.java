package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

public interface zzvm extends IInterface {
    String getAdvertiser() throws RemoteException;

    String getBody() throws RemoteException;

    String getCallToAction() throws RemoteException;

    Bundle getExtras() throws RemoteException;

    String getHeadline() throws RemoteException;

    List getImages() throws RemoteException;

    boolean getOverrideClickHandling() throws RemoteException;

    boolean getOverrideImpressionRecording() throws RemoteException;

    zzll getVideoController() throws RemoteException;

    void recordImpression() throws RemoteException;

    void zzh(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzi(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzj(IObjectWrapper iObjectWrapper) throws RemoteException;

    IObjectWrapper zzjx() throws RemoteException;

    zzpm zzjy() throws RemoteException;

    zzpq zzjz() throws RemoteException;

    IObjectWrapper zzmk() throws RemoteException;

    IObjectWrapper zzml() throws RemoteException;
}
