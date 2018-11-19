package com.tinder.module;

import android.app.Application;
import android.content.ClipboardManager;
import android.content.Context;
import android.media.AudioManager;
import com.facebook.network.connectionclass.C1798b;
import com.facebook.network.connectionclass.ConnectionClassManager;
import com.firebase.jobdispatcher.C3487d;
import com.firebase.jobdispatcher.FirebaseJobDispatcher;
import com.tinder.api.EnvironmentProvider;
import com.tinder.api.ManagerNetwork;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.TinderApiClient;
import com.tinder.apprating.p086a.C8260f;
import com.tinder.interactors.C2647c;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.ManagerProfile;
import com.tinder.managers.UserMetaManager;
import com.tinder.managers.ad;
import com.tinder.managers.bj;
import com.tinder.managers.bk;
import com.tinder.managers.bs;
import com.tinder.managers.bt;
import com.tinder.passport.p093d.C3945a;
import com.tinder.tinderplus.p428a.C15193i;
import dagger.Module;
import dagger.Provides;
import de.greenrobot.event.C2664c;
import javax.inject.Singleton;

@Module
public class ec {
    @Singleton
    @Provides
    /* renamed from: a */
    public Application m40878a(ManagerApp managerApp) {
        return managerApp;
    }

    @Singleton
    @ForApplication
    @Provides
    /* renamed from: b */
    public Context m40887b(ManagerApp managerApp) {
        return managerApp;
    }

    @Singleton
    @Provides
    /* renamed from: a */
    public C8260f m40882a(ManagerWebServices managerWebServices, ManagerNetwork managerNetwork, C2647c c2647c) {
        return new C8260f(managerWebServices, managerNetwork, c2647c);
    }

    @Singleton
    @Provides
    /* renamed from: a */
    public ad m40883a(ManagerWebServices managerWebServices, ManagerProfile managerProfile, EnvironmentProvider environmentProvider, C15193i c15193i, UserMetaManager userMetaManager) {
        return new ad(managerWebServices, managerProfile, environmentProvider, c15193i, userMetaManager);
    }

    @Singleton
    @Provides
    /* renamed from: a */
    public C3945a m40886a(ManagerWebServices managerWebServices, ManagerNetwork managerNetwork, @Default C2664c c2664c, TinderApiClient tinderApiClient, EnvironmentProvider environmentProvider) {
        return new C3945a(managerWebServices, managerNetwork, c2664c, tinderApiClient, environmentProvider);
    }

    @Singleton
    @Provides
    /* renamed from: a */
    public bj m40884a(bk bkVar, @Default C2664c c2664c) {
        return new bj(bkVar, c2664c);
    }

    @Singleton
    @Provides
    /* renamed from: a */
    public ManagerWebServices m40881a(@ForApplication Context context) {
        return new ManagerWebServices(context);
    }

    @Singleton
    @Provides
    /* renamed from: b */
    public bt m40889b(@ForApplication Context context) {
        return new bt(context);
    }

    @Singleton
    @Provides
    /* renamed from: c */
    public AudioManager m40890c(ManagerApp managerApp) {
        return (AudioManager) managerApp.getSystemService("audio");
    }

    @Provides
    /* renamed from: d */
    public ClipboardManager m40891d(ManagerApp managerApp) {
        return (ClipboardManager) managerApp.getSystemService("clipboard");
    }

    @Singleton
    @Provides
    /* renamed from: a */
    public bs m40885a(bk bkVar, C1798b c1798b, ConnectionClassManager connectionClassManager) {
        return new bs(bkVar, c1798b, connectionClassManager);
    }

    @Singleton
    @Provides
    /* renamed from: a */
    public ConnectionClassManager m40879a() {
        return ConnectionClassManager.a();
    }

    @Singleton
    @Provides
    /* renamed from: b */
    public C1798b m40888b() {
        return C1798b.a();
    }

    @Provides
    /* renamed from: a */
    FirebaseJobDispatcher m40880a(Application application) {
        return new FirebaseJobDispatcher(new C3487d(application));
    }
}
