package com.crashlytics.android;

import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.beta.Beta;
import com.crashlytics.android.core.CrashlyticsCore;
import com.crashlytics.android.core.CrashlyticsListener;
import com.crashlytics.android.core.PinningInfoProvider;
import io.fabric.sdk.android.C15608c;
import io.fabric.sdk.android.C15611g;
import io.fabric.sdk.android.KitGroup;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Crashlytics extends C15611g<Void> implements KitGroup {
    public static final String TAG = "Crashlytics";
    public final Answers answers;
    public final Beta beta;
    public final CrashlyticsCore core;
    public final Collection<? extends C15611g> kits;

    public static class Builder {
        private Answers answers;
        private Beta beta;
        private CrashlyticsCore core;
        private com.crashlytics.android.core.CrashlyticsCore.Builder coreBuilder;

        @Deprecated
        public Builder delay(float f) {
            getCoreBuilder().delay(f);
            return this;
        }

        @Deprecated
        public Builder listener(CrashlyticsListener crashlyticsListener) {
            getCoreBuilder().listener(crashlyticsListener);
            return this;
        }

        @Deprecated
        public Builder pinningInfo(PinningInfoProvider pinningInfoProvider) {
            getCoreBuilder().pinningInfo(pinningInfoProvider);
            return this;
        }

        @Deprecated
        public Builder disabled(boolean z) {
            getCoreBuilder().disabled(z);
            return this;
        }

        public Builder answers(Answers answers) {
            if (answers == null) {
                throw new NullPointerException("Answers Kit must not be null.");
            } else if (this.answers != null) {
                throw new IllegalStateException("Answers Kit already set.");
            } else {
                this.answers = answers;
                return this;
            }
        }

        public Builder beta(Beta beta) {
            if (beta == null) {
                throw new NullPointerException("Beta Kit must not be null.");
            } else if (this.beta != null) {
                throw new IllegalStateException("Beta Kit already set.");
            } else {
                this.beta = beta;
                return this;
            }
        }

        public Builder core(CrashlyticsCore crashlyticsCore) {
            if (crashlyticsCore == null) {
                throw new NullPointerException("CrashlyticsCore Kit must not be null.");
            } else if (this.core != null) {
                throw new IllegalStateException("CrashlyticsCore Kit already set.");
            } else {
                this.core = crashlyticsCore;
                return this;
            }
        }

        public Crashlytics build() {
            if (this.coreBuilder != null) {
                if (this.core != null) {
                    throw new IllegalStateException("Must not use Deprecated methods delay(), disabled(), listener(), pinningInfoProvider() with core()");
                }
                this.core = this.coreBuilder.build();
            }
            if (this.answers == null) {
                this.answers = new Answers();
            }
            if (this.beta == null) {
                this.beta = new Beta();
            }
            if (this.core == null) {
                this.core = new CrashlyticsCore();
            }
            return new Crashlytics(this.answers, this.beta, this.core);
        }

        private synchronized com.crashlytics.android.core.CrashlyticsCore.Builder getCoreBuilder() {
            if (this.coreBuilder == null) {
                this.coreBuilder = new com.crashlytics.android.core.CrashlyticsCore.Builder();
            }
            return this.coreBuilder;
        }
    }

    protected Void doInBackground() {
        return null;
    }

    public String getIdentifier() {
        return "com.crashlytics.sdk.android:crashlytics";
    }

    public String getVersion() {
        return "2.9.3.25";
    }

    public Crashlytics() {
        this(new Answers(), new Beta(), new CrashlyticsCore());
    }

    Crashlytics(Answers answers, Beta beta, CrashlyticsCore crashlyticsCore) {
        this.answers = answers;
        this.beta = beta;
        this.core = crashlyticsCore;
        this.kits = Collections.unmodifiableCollection(Arrays.asList(new C15611g[]{answers, beta, crashlyticsCore}));
    }

    public Collection<? extends C15611g> getKits() {
        return this.kits;
    }

    public static Crashlytics getInstance() {
        return (Crashlytics) C15608c.a(Crashlytics.class);
    }

    public static PinningInfoProvider getPinningInfoProvider() {
        checkInitialized();
        return getInstance().core.getPinningInfoProvider();
    }

    public static void logException(Throwable th) {
        checkInitialized();
        getInstance().core.logException(th);
    }

    public static void log(String str) {
        checkInitialized();
        getInstance().core.log(str);
    }

    public static void log(int i, String str, String str2) {
        checkInitialized();
        getInstance().core.log(i, str, str2);
    }

    public static void setUserIdentifier(String str) {
        checkInitialized();
        getInstance().core.setUserIdentifier(str);
    }

    public static void setUserName(String str) {
        checkInitialized();
        getInstance().core.setUserName(str);
    }

    public static void setUserEmail(String str) {
        checkInitialized();
        getInstance().core.setUserEmail(str);
    }

    public static void setString(String str, String str2) {
        checkInitialized();
        getInstance().core.setString(str, str2);
    }

    public static void setBool(String str, boolean z) {
        checkInitialized();
        getInstance().core.setBool(str, z);
    }

    public static void setDouble(String str, double d) {
        checkInitialized();
        getInstance().core.setDouble(str, d);
    }

    public static void setFloat(String str, float f) {
        checkInitialized();
        getInstance().core.setFloat(str, f);
    }

    public static void setInt(String str, int i) {
        checkInitialized();
        getInstance().core.setInt(str, i);
    }

    public static void setLong(String str, long j) {
        checkInitialized();
        getInstance().core.setLong(str, j);
    }

    public void crash() {
        this.core.crash();
    }

    public boolean verifyPinning(URL url) {
        return this.core.verifyPinning(url);
    }

    @Deprecated
    public synchronized void setListener(CrashlyticsListener crashlyticsListener) {
        this.core.setListener(crashlyticsListener);
    }

    @Deprecated
    public void setDebugMode(boolean z) {
        C15608c.h().w(TAG, "Use of Crashlytics.setDebugMode is deprecated.");
    }

    @Deprecated
    public boolean getDebugMode() {
        C15608c.h().w(TAG, "Use of Crashlytics.getDebugMode is deprecated.");
        getFabric();
        return C15608c.i();
    }

    @Deprecated
    public static void setPinningInfoProvider(PinningInfoProvider pinningInfoProvider) {
        C15608c.h().w(TAG, "Use of Crashlytics.setPinningInfoProvider is deprecated");
    }

    private static void checkInitialized() {
        if (getInstance() == null) {
            throw new IllegalStateException("Crashlytics must be initialized by calling Fabric.with(Context) prior to calling Crashlytics.getInstance()");
        }
    }
}
