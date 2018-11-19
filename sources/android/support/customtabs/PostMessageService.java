package android.support.customtabs;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.IPostMessageService.C2744a;

public class PostMessageService extends Service {
    /* renamed from: a */
    private C2744a f566a = new C39891(this);

    /* renamed from: android.support.customtabs.PostMessageService$1 */
    class C39891 extends C2744a {
        /* renamed from: a */
        final /* synthetic */ PostMessageService f12667a;

        C39891(PostMessageService postMessageService) {
            this.f12667a = postMessageService;
        }

        public void onMessageChannelReady(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) throws RemoteException {
            iCustomTabsCallback.onMessageChannelReady(bundle);
        }

        public void onPostMessage(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle) throws RemoteException {
            iCustomTabsCallback.onPostMessage(str, bundle);
        }
    }

    public IBinder onBind(Intent intent) {
        return this.f566a;
    }
}
