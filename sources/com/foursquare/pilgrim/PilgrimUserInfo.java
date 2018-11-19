package com.foursquare.pilgrim;

import android.support.annotation.NonNull;
import com.tinder.ads.source.dfp.DfpCustomTargetingValuesKt;
import com.tinder.api.ManagerWebServices;
import java.util.Date;
import java.util.HashMap;

public final class PilgrimUserInfo extends HashMap<String, String> {

    public enum Gender {
        MALE,
        FEMALE,
        NOT_SPECIFIED
    }

    public String put(String str, String str2) {
        if (!("gender".equals(str) || ManagerWebServices.PARAM_USER_ID.equals(str) || DfpCustomTargetingValuesKt.ADS_TARGETING_AGE.equals(str))) {
            if (!ManagerWebServices.FB_PARAM_BIRTH_DATE.equals(str)) {
                return (String) super.put(str, str2);
            }
        }
        return null;
    }

    public void setUserId(String str) {
        super.put(ManagerWebServices.PARAM_USER_ID, str);
    }

    public void setAge(int i) {
        super.put(DfpCustomTargetingValuesKt.ADS_TARGETING_AGE, String.valueOf(i));
    }

    public void setBirthday(@NonNull Date date) {
        super.put(ManagerWebServices.FB_PARAM_BIRTH_DATE, String.valueOf(date.getTime()));
    }

    public void setGender(Gender gender) {
        switch (gender) {
            case MALE:
                super.put("gender", "male");
                return;
            case FEMALE:
                super.put("gender", "female");
                return;
            default:
                return;
        }
    }
}
