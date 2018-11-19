package com.snapchat.kit.sdk.bitmoji.models;

import android.graphics.Color;
import com.snapchat.kit.sdk.bitmoji.search.C5909d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TagTileFactory {
    private static final int COLOR_VISIBLE_ALPHA = -16777216;

    private TagTileFactory() {
    }

    public static List<TagTile> fromStickerPacks(Collection<StickerPack> collection) {
        List<TagTile> arrayList = new ArrayList(collection.size());
        for (StickerPack stickerPack : collection) {
            arrayList.add(new TagTile(stickerPack.getTitle(), hexColorToInt(stickerPack.getColor())));
        }
        return arrayList;
    }

    public static List<TagTile> fromTags(Collection<String> collection, C5909d c5909d) {
        List<TagTile> arrayList = new ArrayList(collection.size());
        for (String str : collection) {
            arrayList.add(new TagTile(str, colorForTag(str, c5909d)));
        }
        return arrayList;
    }

    private static int colorForTag(String str, C5909d c5909d) {
        StickerPack c = c5909d.m25494c(str);
        if (c != null) {
            return hexColorToInt(c.getColor());
        }
        c5909d = c5909d.m25496d(str);
        int i = 40;
        Object obj = 1062501089;
        Object obj2 = 1065218998;
        if (c5909d != null) {
            switch (c5909d) {
                case f21638a:
                    i = 236;
                    obj = 1063625163;
                    obj2 = 1064816345;
                    break;
                case f21639b:
                    i = 340;
                    obj = 1059430859;
                    obj2 = 1065151889;
                    break;
                case f21640c:
                    i = 140;
                    obj = 1062920520;
                    obj2 = 1059900621;
                    break;
                case f21641d:
                    i = 272;
                    obj = 1056293519;
                    obj2 = 1063121846;
                    break;
                case f21642e:
                    i = 173;
                    obj = 1062735970;
                    obj2 = 1059950952;
                    break;
                default:
                    break;
            }
        }
        return Color.HSVToColor(new float[]{(float) (((i + ((int) (nsstringHash(str) % 36))) - 18) % 360), obj, obj2});
    }

    private static int hexColorToInt(java.lang.String r2) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Wrong literal type: java.lang.String for value: 16777216
	at jadx.core.dex.instructions.args.LiteralArg.<init>(LiteralArg.java:16)
	at jadx.core.dex.instructions.args.InsnArg.lit(InsnArg.java:44)
	at jadx.core.dex.visitors.SimplifyVisitor.simplifyArith(SimplifyVisitor.java:239)
	at jadx.core.dex.visitors.SimplifyVisitor.simplifyInsn(SimplifyVisitor.java:63)
	at jadx.core.dex.visitors.SimplifyVisitor.simplifyInsn(SimplifyVisitor.java:55)
	at jadx.core.dex.visitors.SimplifyVisitor.visit(SimplifyVisitor.java:44)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r0 = android.text.TextUtils.isEmpty(r2);
        r1 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
        if (r0 == 0) goto L_0x0009;
    L_0x0008:
        return r1;
    L_0x0009:
        r0 = "#";
        r0 = r2.startsWith(r0);
        if (r0 == 0) goto L_0x0016;
    L_0x0011:
        r0 = 1;
        r2 = r2.substring(r0);
    L_0x0016:
        r0 = 16;
        r2 = java.lang.Integer.parseInt(r2, r0);
        r2 = r2 + r1;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.bitmoji.models.TagTileFactory.hexColorToInt(java.lang.String):int");
    }

    private static long nsstringHash(String str) {
        str = str.getBytes();
        long length = (long) str.length;
        int i = 0;
        while (i < (str.length & -4)) {
            i += 4;
            length = ((((length * 67503105) + ((long) (str[i] * 16974593))) + ((long) (str[i + 1] * 66049))) + ((long) (str[i + 2] * 257))) + ((long) str[i + 3]);
        }
        while (i < str.length) {
            i++;
            length = (length * 257) + ((long) str[i]);
        }
        return length + (length << (str.length & 31));
    }
}
