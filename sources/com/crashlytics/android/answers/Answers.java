package com.crashlytics.android.answers;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import io.fabric.sdk.android.C15608c;
import io.fabric.sdk.android.C15611g;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.C15624h.C17330a;
import io.fabric.sdk.android.services.common.C15624h.C17331b;
import io.fabric.sdk.android.services.common.C15627j;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.settings.C15665p;
import io.fabric.sdk.android.services.settings.Settings;
import java.io.File;

public class Answers extends C15611g<Boolean> {
    static final String CRASHLYTICS_API_ENDPOINT = "com.crashlytics.ApiEndpoint";
    public static final String TAG = "Answers";
    SessionAnalyticsManager analyticsManager;
    boolean firebaseEnabled = false;

    public String getIdentifier() {
        return "com.crashlytics.sdk.android:answers";
    }

    public String getVersion() {
        return "1.4.2.25";
    }

    public static Answers getInstance() {
        return (Answers) C15608c.a(Answers.class);
    }

    public void logCustom(CustomEvent customEvent) {
        if (customEvent == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logCustom");
        } else {
            if (this.analyticsManager != null) {
                this.analyticsManager.onCustom(customEvent);
            }
        }
    }

    public void logPurchase(PurchaseEvent purchaseEvent) {
        if (purchaseEvent == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logPurchase");
        } else {
            if (this.analyticsManager != null) {
                this.analyticsManager.onPredefined(purchaseEvent);
            }
        }
    }

    public void logLogin(LoginEvent loginEvent) {
        if (loginEvent == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logLogin");
        } else {
            if (this.analyticsManager != null) {
                this.analyticsManager.onPredefined(loginEvent);
            }
        }
    }

    public void logShare(ShareEvent shareEvent) {
        if (shareEvent == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logShare");
        } else {
            if (this.analyticsManager != null) {
                this.analyticsManager.onPredefined(shareEvent);
            }
        }
    }

    public void logInvite(InviteEvent inviteEvent) {
        if (inviteEvent == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logInvite");
        } else {
            if (this.analyticsManager != null) {
                this.analyticsManager.onPredefined(inviteEvent);
            }
        }
    }

    public void logSignUp(SignUpEvent signUpEvent) {
        if (signUpEvent == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logSignUp");
        } else {
            if (this.analyticsManager != null) {
                this.analyticsManager.onPredefined(signUpEvent);
            }
        }
    }

    public void logLevelStart(LevelStartEvent levelStartEvent) {
        if (levelStartEvent == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logLevelStart");
        } else {
            if (this.analyticsManager != null) {
                this.analyticsManager.onPredefined(levelStartEvent);
            }
        }
    }

    public void logLevelEnd(LevelEndEvent levelEndEvent) {
        if (levelEndEvent == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logLevelEnd");
        } else {
            if (this.analyticsManager != null) {
                this.analyticsManager.onPredefined(levelEndEvent);
            }
        }
    }

    public void logAddToCart(AddToCartEvent addToCartEvent) {
        if (addToCartEvent == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logAddToCart");
        } else {
            if (this.analyticsManager != null) {
                this.analyticsManager.onPredefined(addToCartEvent);
            }
        }
    }

    public void logStartCheckout(StartCheckoutEvent startCheckoutEvent) {
        if (startCheckoutEvent == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logStartCheckout");
        } else {
            if (this.analyticsManager != null) {
                this.analyticsManager.onPredefined(startCheckoutEvent);
            }
        }
    }

    public void logRating(RatingEvent ratingEvent) {
        if (ratingEvent == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logRating");
        } else {
            if (this.analyticsManager != null) {
                this.analyticsManager.onPredefined(ratingEvent);
            }
        }
    }

    public void logContentView(ContentViewEvent contentViewEvent) {
        if (contentViewEvent == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logContentView");
        } else {
            if (this.analyticsManager != null) {
                this.analyticsManager.onPredefined(contentViewEvent);
            }
        }
    }

    public void logSearch(SearchEvent searchEvent) {
        if (searchEvent == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logSearch");
        } else {
            if (this.analyticsManager != null) {
                this.analyticsManager.onPredefined(searchEvent);
            }
        }
    }

    public void onException(C17331b c17331b) {
        if (this.analyticsManager != null) {
            this.analyticsManager.onError(c17331b.a());
        }
    }

    public void onException(C17330a c17330a) {
        if (this.analyticsManager != null) {
            this.analyticsManager.onCrash(c17330a.a(), c17330a.b());
        }
    }

    @SuppressLint({"NewApi"})
    protected boolean onPreExecute() {
        try {
            long j;
            Context context = getContext();
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            String num = Integer.toString(packageInfo.versionCode);
            String str = packageInfo.versionName == null ? "0.0" : packageInfo.versionName;
            if (VERSION.SDK_INT >= 9) {
                j = packageInfo.firstInstallTime;
            } else {
                j = new File(packageManager.getApplicationInfo(packageName, 0).sourceDir).lastModified();
            }
            this.analyticsManager = SessionAnalyticsManager.build(this, context, getIdManager(), num, str, j);
            this.analyticsManager.enable();
            this.firebaseEnabled = new C15627j().b(context);
            return true;
        } catch (Throwable e) {
            C15608c.h().e(TAG, "Error retrieving app properties", e);
            return false;
        }
    }

    protected Boolean doInBackground() {
        try {
            C15665p b = Settings.a().b();
            if (b == null) {
                C15608c.h().e(TAG, "Failed to retrieve settings");
                return Boolean.valueOf(false);
            } else if (b.f48509d.f48486d) {
                C15608c.h().d(TAG, "Analytics collection enabled");
                this.analyticsManager.setAnalyticsSettingsData(b.f48510e, getOverridenSpiEndpoint());
                return Boolean.valueOf(true);
            } else {
                C15608c.h().d(TAG, "Analytics collection disabled");
                this.analyticsManager.disable();
                return Boolean.valueOf(false);
            }
        } catch (Throwable e) {
            C15608c.h().e(TAG, "Error dealing with settings", e);
            return Boolean.valueOf(false);
        }
    }

    String getOverridenSpiEndpoint() {
        return CommonUtils.b(getContext(), CRASHLYTICS_API_ENDPOINT);
    }

    private void logFirebaseModeEnabledWarning(String str) {
        Logger h = C15608c.h();
        String str2 = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Method ");
        stringBuilder.append(str);
        stringBuilder.append(" is not supported when using Crashlytics through Firebase.");
        h.w(str2, stringBuilder.toString());
    }
}
