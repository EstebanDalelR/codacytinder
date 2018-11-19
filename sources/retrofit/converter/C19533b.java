package retrofit.converter;

import com.google.protobuf.AbstractMessageLite;
import com.tinder.api.ManagerWebServices;
import retrofit.mime.C19544d;
import retrofit.mime.TypedOutput;

/* renamed from: retrofit.converter.b */
public class C19533b implements Converter {
    public java.lang.Object fromBody(retrofit.mime.TypedInput r6, java.lang.reflect.Type r7) throws retrofit.converter.ConversionException {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r5 = this;
        r0 = r7 instanceof java.lang.Class;
        if (r0 != 0) goto L_0x001b;
    L_0x0004:
        r6 = new java.lang.IllegalArgumentException;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "Expected a raw Class<?> but was ";
        r0.append(r1);
        r0.append(r7);
        r7 = r0.toString();
        r6.<init>(r7);
        throw r6;
    L_0x001b:
        r7 = (java.lang.Class) r7;
        r0 = com.google.protobuf.AbstractMessageLite.class;
        r0 = r0.isAssignableFrom(r7);
        if (r0 != 0) goto L_0x0040;
    L_0x0025:
        r6 = new java.lang.IllegalArgumentException;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "Expected a protobuf message but was ";
        r0.append(r1);
        r7 = r7.getName();
        r0.append(r7);
        r7 = r0.toString();
        r6.<init>(r7);
        throw r6;
    L_0x0040:
        r0 = r6.mimeType();
        r1 = "application/x-protobuf";
        r1 = r1.equals(r0);
        if (r1 != 0) goto L_0x0063;
    L_0x004c:
        r6 = new retrofit.converter.ConversionException;
        r7 = new java.lang.StringBuilder;
        r7.<init>();
        r1 = "Response content type was not a proto: ";
        r7.append(r1);
        r7.append(r0);
        r7 = r7.toString();
        r6.<init>(r7);
        throw r6;
    L_0x0063:
        r0 = "parseFrom";	 Catch:{ InvocationTargetException -> 0x00a7, NoSuchMethodException -> 0x008c, IllegalAccessException -> 0x0086, IOException -> 0x007f }
        r1 = 1;	 Catch:{ InvocationTargetException -> 0x00a7, NoSuchMethodException -> 0x008c, IllegalAccessException -> 0x0086, IOException -> 0x007f }
        r2 = new java.lang.Class[r1];	 Catch:{ InvocationTargetException -> 0x00a7, NoSuchMethodException -> 0x008c, IllegalAccessException -> 0x0086, IOException -> 0x007f }
        r3 = java.io.InputStream.class;	 Catch:{ InvocationTargetException -> 0x00a7, NoSuchMethodException -> 0x008c, IllegalAccessException -> 0x0086, IOException -> 0x007f }
        r4 = 0;	 Catch:{ InvocationTargetException -> 0x00a7, NoSuchMethodException -> 0x008c, IllegalAccessException -> 0x0086, IOException -> 0x007f }
        r2[r4] = r3;	 Catch:{ InvocationTargetException -> 0x00a7, NoSuchMethodException -> 0x008c, IllegalAccessException -> 0x0086, IOException -> 0x007f }
        r0 = r7.getMethod(r0, r2);	 Catch:{ InvocationTargetException -> 0x00a7, NoSuchMethodException -> 0x008c, IllegalAccessException -> 0x0086, IOException -> 0x007f }
        r2 = 0;	 Catch:{ InvocationTargetException -> 0x00a7, NoSuchMethodException -> 0x008c, IllegalAccessException -> 0x0086, IOException -> 0x007f }
        r1 = new java.lang.Object[r1];	 Catch:{ InvocationTargetException -> 0x00a7, NoSuchMethodException -> 0x008c, IllegalAccessException -> 0x0086, IOException -> 0x007f }
        r6 = r6.in();	 Catch:{ InvocationTargetException -> 0x00a7, NoSuchMethodException -> 0x008c, IllegalAccessException -> 0x0086, IOException -> 0x007f }
        r1[r4] = r6;	 Catch:{ InvocationTargetException -> 0x00a7, NoSuchMethodException -> 0x008c, IllegalAccessException -> 0x0086, IOException -> 0x007f }
        r6 = r0.invoke(r2, r1);	 Catch:{ InvocationTargetException -> 0x00a7, NoSuchMethodException -> 0x008c, IllegalAccessException -> 0x0086, IOException -> 0x007f }
        return r6;
    L_0x007f:
        r6 = move-exception;
        r7 = new retrofit.converter.ConversionException;
        r7.<init>(r6);
        throw r7;
    L_0x0086:
        r6 = new java.lang.AssertionError;
        r6.<init>();
        throw r6;
    L_0x008c:
        r6 = new java.lang.IllegalArgumentException;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "Expected a protobuf message but was ";
        r0.append(r1);
        r7 = r7.getName();
        r0.append(r7);
        r7 = r0.toString();
        r6.<init>(r7);
        throw r6;
    L_0x00a7:
        r6 = move-exception;
        r0 = new retrofit.converter.ConversionException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r7 = r7.getName();
        r1.append(r7);
        r7 = ".parseFrom() failed";
        r1.append(r7);
        r7 = r1.toString();
        r6 = r6.getCause();
        r0.<init>(r7, r6);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit.converter.b.fromBody(retrofit.mime.TypedInput, java.lang.reflect.Type):java.lang.Object");
    }

    public TypedOutput toBody(Object obj) {
        if (obj instanceof AbstractMessageLite) {
            return new C19544d("application/x-protobuf", ((AbstractMessageLite) obj).toByteArray());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected a protobuf message but was ");
        stringBuilder.append(obj != null ? obj.getClass().getName() : ManagerWebServices.NULL_STRING_VALUE);
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
