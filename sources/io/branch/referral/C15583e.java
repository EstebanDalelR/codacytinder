package io.branch.referral;

/* renamed from: io.branch.referral.e */
public class C15583e {
    /* renamed from: a */
    String f48196a = "";
    /* renamed from: b */
    int f48197b = -113;

    /* renamed from: a */
    public String m58330a() {
        return this.f48196a;
    }

    /* renamed from: b */
    public int m58331b() {
        return this.f48197b;
    }

    public String toString() {
        return m58330a();
    }

    public C15583e(String str, int i) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(m58329a(i));
        this.f48196a = stringBuilder.toString();
    }

    /* renamed from: a */
    private String m58329a(int i) {
        if (i == -113) {
            this.f48197b = -113;
            return " Branch API Error: poor network connectivity. Please try again later.";
        } else if (i == -114) {
            this.f48197b = -114;
            return " Branch API Error: Please enter your branch_key in your project's manifest file first.";
        } else if (i == -104) {
            this.f48197b = -104;
            return " Did you forget to call init? Make sure you init the session before making Branch calls.";
        } else if (i == -101) {
            this.f48197b = -101;
            return " Unable to initialize Branch. Check network connectivity or that your branch key is valid.";
        } else if (i == -102) {
            this.f48197b = -102;
            return " Please add 'android.permission.INTERNET' in your applications manifest file.";
        } else if (i == -105) {
            this.f48197b = -105;
            return " Unable to create a URL with that alias. If you want to reuse the alias, make sure to submit the same properties for all arguments and that the user is the same owner.";
        } else if (i == -106) {
            this.f48197b = -106;
            return " That Branch referral code is already in use.";
        } else if (i == -107) {
            this.f48197b = -107;
            return " Unable to redeem rewards. Please make sure you have credits available to redeem.";
        } else if (i == -108) {
            this.f48197b = -108;
            return "BranchApp class can be used only with API level 14 or above. Please make sure your minimum API level supported is 14. If you wish to use API level below 14 consider calling getInstance(Context) instead.";
        } else if (i == -109) {
            this.f48197b = -109;
            return "Branch instance is not created. Make  sure your Application class is an instance of BranchLikedApp.";
        } else if (i == -110) {
            this.f48197b = -110;
            return " Unable create share options. Couldn't find applications on device to share the link.";
        } else if (i == -111) {
            this.f48197b = -111;
            return " Request to Branch server timed out. Please check your internet connectivity";
        } else if (i == -117) {
            this.f48197b = -117;
            return " Tracking is disabled. Requested operation cannot be completed when tracking is disabled";
        } else {
            if (i < 500) {
                if (i != -112) {
                    if (i != 409) {
                        if (i != -115) {
                            if (i < 400) {
                                if (i != -116) {
                                    this.f48197b = -113;
                                    return " Check network connectivity and that you properly initialized.";
                                }
                            }
                            this.f48197b = -116;
                            return " The request was invalid.";
                        }
                    }
                    this.f48197b = -115;
                    return " A resource with this identifier already exists.";
                }
            }
            this.f48197b = -112;
            return " Unable to reach the Branch servers, please try again shortly.";
        }
    }
}
