package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

public interface zzvj extends IInterface {
    String getBody() throws RemoteException;

    String getCallToAction() throws RemoteException;

    Bundle getExtras() throws RemoteException;

    String getHeadline() throws RemoteException;

    List getImages() throws RemoteException;

    boolean getOverrideClickHandling() throws RemoteException;

    boolean getOverrideImpressionRecording() throws RemoteException;

    String getPrice() throws RemoteException;

    double getStarRating() throws RemoteException;

    String getStore() throws RemoteException;

    zzll getVideoController() throws RemoteException;

    void recordImpression() throws RemoteException;

    void zzh(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzi(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzj(IObjectWrapper iObjectWrapper) throws RemoteException;

    zzpq zzjs() throws RemoteException;

    IObjectWrapper zzjx() throws RemoteException;

    zzpm zzjy() throws RemoteException;

    IObjectWrapper zzmk() throws RemoteException;

    IObjectWrapper zzml() throws RemoteException;
}
