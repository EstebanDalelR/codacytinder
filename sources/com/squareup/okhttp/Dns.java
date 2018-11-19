package com.squareup.okhttp;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

public interface Dns {
    /* renamed from: a */
    public static final Dns f21880a = new C72051();

    /* renamed from: com.squareup.okhttp.Dns$1 */
    static class C72051 implements Dns {
        C72051() {
        }

        public List<InetAddress> lookup(String str) throws UnknownHostException {
            if (str != null) {
                return Arrays.asList(InetAddress.getAllByName(str));
            }
            throw new UnknownHostException("hostname == null");
        }
    }

    List<InetAddress> lookup(String str) throws UnknownHostException;
}
