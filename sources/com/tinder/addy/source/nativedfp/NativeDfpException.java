package com.tinder.addy.source.nativedfp;

import com.tinder.addy.AdException;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tinder/addy/source/nativedfp/NativeDfpException;", "Lcom/tinder/addy/AdException;", "errorCode", "", "(I)V", "addy-source-nativedfp_release"}, k = 1, mv = {1, 1, 10})
public final class NativeDfpException extends AdException {
    public NativeDfpException(int i) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Failed to load DfpAd with error code ");
        stringBuilder.append(i);
        stringBuilder.append(".\n");
        switch (i) {
            case 0:
                i = "Something happened internally; for instance, an invalid response was received from the ad server";
                break;
            case 1:
                i = "The ad request was invalid; for instance, the ad unit ID was incorrect.";
                break;
            case 2:
                i = "The ad request was unsuccessful due to network connectivity.";
                break;
            case 3:
                i = "The ad request was successful, but no ad was returned due to lack of ad inventory.";
                break;
            default:
                i = "Unknown error code";
                break;
        }
        stringBuilder.append(i);
        super(stringBuilder.toString());
    }
}
