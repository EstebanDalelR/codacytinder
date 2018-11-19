package android.support.v4.app;

import android.app.Notification;
import android.os.IInterface;
import android.os.RemoteException;

public interface INotificationSideChannel extends IInterface {
    void cancel(String str, int i, String str2) throws RemoteException;

    void cancelAll(String str) throws RemoteException;

    void notify(String str, int i, String str2, Notification notification) throws RemoteException;
}
