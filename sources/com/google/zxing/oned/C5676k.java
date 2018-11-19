package com.google.zxing.oned;

import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.util.List;

/* renamed from: com.google.zxing.oned.k */
final class C5676k {
    /* renamed from: a */
    private final List<int[]> f21037a;
    /* renamed from: b */
    private final List<String> f21038b;

    /* renamed from: a */
    String m24849a(String str) {
        m24847a();
        str = Integer.parseInt(str.substring(0, 3));
        int size = this.f21037a.size();
        for (int i = 0; i < size; i++) {
            int[] iArr = (int[]) this.f21037a.get(i);
            int i2 = iArr[0];
            if (str < i2) {
                return null;
            }
            if (iArr.length != 1) {
                i2 = iArr[1];
            }
            if (str <= i2) {
                return (String) this.f21038b.get(i);
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m24848a(int[] iArr, String str) {
        this.f21037a.add(iArr);
        this.f21038b.add(str);
    }

    /* renamed from: a */
    private synchronized void m24847a() {
        if (this.f21037a.isEmpty()) {
            m24848a(new int[]{0, 19}, "US/CA");
            m24848a(new int[]{30, 39}, "US");
            m24848a(new int[]{60, 139}, "US/CA");
            m24848a(new int[]{MapboxConstants.ANIMATION_DURATION, 379}, "FR");
            m24848a(new int[]{380}, "BG");
            m24848a(new int[]{383}, "SI");
            m24848a(new int[]{385}, "HR");
            m24848a(new int[]{387}, "BA");
            m24848a(new int[]{400, 440}, "DE");
            m24848a(new int[]{450, 459}, "JP");
            m24848a(new int[]{460, 469}, "RU");
            m24848a(new int[]{471}, "TW");
            m24848a(new int[]{474}, "EE");
            m24848a(new int[]{475}, "LV");
            m24848a(new int[]{476}, "AZ");
            m24848a(new int[]{477}, "LT");
            m24848a(new int[]{478}, "UZ");
            m24848a(new int[]{479}, "LK");
            m24848a(new int[]{480}, "PH");
            m24848a(new int[]{481}, "BY");
            m24848a(new int[]{482}, "UA");
            m24848a(new int[]{484}, "MD");
            m24848a(new int[]{485}, "AM");
            m24848a(new int[]{486}, "GE");
            m24848a(new int[]{487}, "KZ");
            m24848a(new int[]{489}, "HK");
            m24848a(new int[]{490, 499}, "JP");
            m24848a(new int[]{500, 509}, "GB");
            m24848a(new int[]{520}, "GR");
            m24848a(new int[]{528}, "LB");
            m24848a(new int[]{529}, "CY");
            m24848a(new int[]{531}, "MK");
            m24848a(new int[]{535}, "MT");
            m24848a(new int[]{539}, "IE");
            m24848a(new int[]{540, 549}, "BE/LU");
            m24848a(new int[]{560}, "PT");
            m24848a(new int[]{569}, "IS");
            m24848a(new int[]{570, 579}, "DK");
            m24848a(new int[]{590}, "PL");
            m24848a(new int[]{594}, "RO");
            m24848a(new int[]{599}, "HU");
            m24848a(new int[]{600, 601}, "ZA");
            m24848a(new int[]{603}, "GH");
            m24848a(new int[]{608}, "BH");
            m24848a(new int[]{609}, "MU");
            m24848a(new int[]{611}, "MA");
            m24848a(new int[]{613}, "DZ");
            m24848a(new int[]{616}, "KE");
            m24848a(new int[]{618}, "CI");
            m24848a(new int[]{619}, "TN");
            m24848a(new int[]{621}, "SY");
            m24848a(new int[]{622}, "EG");
            m24848a(new int[]{624}, "LY");
            m24848a(new int[]{625}, "JO");
            m24848a(new int[]{626}, "IR");
            m24848a(new int[]{627}, "KW");
            m24848a(new int[]{628}, "SA");
            m24848a(new int[]{629}, "AE");
            m24848a(new int[]{640, 649}, "FI");
            m24848a(new int[]{690, 695}, "CN");
            m24848a(new int[]{700, 709}, "NO");
            m24848a(new int[]{729}, "IL");
            m24848a(new int[]{730, 739}, "SE");
            m24848a(new int[]{740}, "GT");
            m24848a(new int[]{741}, "SV");
            m24848a(new int[]{742}, "HN");
            m24848a(new int[]{743}, "NI");
            m24848a(new int[]{744}, "CR");
            m24848a(new int[]{745}, "PA");
            m24848a(new int[]{746}, "DO");
            m24848a(new int[]{750}, "MX");
            m24848a(new int[]{754, 755}, "CA");
            m24848a(new int[]{759}, "VE");
            m24848a(new int[]{760, 769}, "CH");
            m24848a(new int[]{770}, "CO");
            m24848a(new int[]{773}, "UY");
            m24848a(new int[]{775}, "PE");
            m24848a(new int[]{777}, "BO");
            m24848a(new int[]{779}, "AR");
            m24848a(new int[]{780}, "CL");
            m24848a(new int[]{784}, "PY");
            m24848a(new int[]{785}, "PE");
            m24848a(new int[]{786}, "EC");
            m24848a(new int[]{789, 790}, "BR");
            m24848a(new int[]{800, 839}, "IT");
            m24848a(new int[]{840, 849}, "ES");
            m24848a(new int[]{850}, "CU");
            m24848a(new int[]{858}, "SK");
            m24848a(new int[]{859}, "CZ");
            m24848a(new int[]{860}, "YU");
            m24848a(new int[]{865}, "MN");
            m24848a(new int[]{867}, "KP");
            m24848a(new int[]{868, 869}, "TR");
            m24848a(new int[]{870, 879}, "NL");
            m24848a(new int[]{880}, "KR");
            m24848a(new int[]{885}, "TH");
            m24848a(new int[]{888}, "SG");
            m24848a(new int[]{890}, "IN");
            m24848a(new int[]{893}, "VN");
            m24848a(new int[]{896}, "PK");
            m24848a(new int[]{899}, "ID");
            m24848a(new int[]{900, 919}, "AT");
            m24848a(new int[]{930, 939}, "AU");
            m24848a(new int[]{940, 949}, "AZ");
            m24848a(new int[]{955}, "MY");
            m24848a(new int[]{958}, "MO");
        }
    }
}
