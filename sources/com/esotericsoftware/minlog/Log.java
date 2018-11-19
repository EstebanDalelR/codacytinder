package com.esotericsoftware.minlog;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Date;

public class Log {
    public static boolean DEBUG = (level <= 2);
    public static boolean ERROR = (level <= 5);
    public static boolean INFO = (level <= 3);
    public static final int LEVEL_DEBUG = 2;
    public static final int LEVEL_ERROR = 5;
    public static final int LEVEL_INFO = 3;
    public static final int LEVEL_NONE = 6;
    public static final int LEVEL_TRACE = 1;
    public static final int LEVEL_WARN = 4;
    public static boolean TRACE = false;
    public static boolean WARN = (level <= 4);
    private static int level = 3;
    private static Logger logger = new Logger();

    public static class Logger {
        private long firstLogTime = new Date().getTime();

        public void log(int i, String str, String str2, Throwable th) {
            StringBuilder stringBuilder = new StringBuilder(256);
            long time = new Date().getTime() - this.firstLogTime;
            long j = time / 60000;
            time = (time / 1000) % 60;
            if (j <= 9) {
                stringBuilder.append('0');
            }
            stringBuilder.append(j);
            stringBuilder.append(':');
            if (time <= 9) {
                stringBuilder.append('0');
            }
            stringBuilder.append(time);
            switch (i) {
                case 1:
                    stringBuilder.append(" TRACE: ");
                    break;
                case 2:
                    stringBuilder.append(" DEBUG: ");
                    break;
                case 3:
                    stringBuilder.append("  INFO: ");
                    break;
                case 4:
                    stringBuilder.append("  WARN: ");
                    break;
                case 5:
                    stringBuilder.append(" ERROR: ");
                    break;
                default:
                    break;
            }
            if (str != null) {
                stringBuilder.append(91);
                stringBuilder.append(str);
                stringBuilder.append("] ");
            }
            stringBuilder.append(str2);
            if (th != null) {
                i = new StringWriter(256);
                th.printStackTrace(new PrintWriter(i));
                stringBuilder.append('\n');
                stringBuilder.append(i.toString().trim());
            }
            print(stringBuilder.toString());
        }

        protected void print(String str) {
            System.out.println(str);
        }
    }

    static {
        boolean z = false;
        if (level <= 1) {
            z = true;
        }
        TRACE = z;
    }

    public static void set(int i) {
        level = i;
        boolean z = false;
        ERROR = i <= 5;
        WARN = i <= 4;
        INFO = i <= 3;
        DEBUG = i <= 2;
        if (i <= 1) {
            z = true;
        }
        TRACE = z;
    }

    public static void NONE() {
        set(6);
    }

    public static void ERROR() {
        set(5);
    }

    public static void WARN() {
        set(4);
    }

    public static void INFO() {
        set(3);
    }

    public static void DEBUG() {
        set(2);
    }

    public static void TRACE() {
        set(1);
    }

    public static void setLogger(Logger logger) {
        logger = logger;
    }

    public static void error(String str, Throwable th) {
        if (ERROR) {
            logger.log(5, null, str, th);
        }
    }

    public static void error(String str, String str2, Throwable th) {
        if (ERROR) {
            logger.log(5, str, str2, th);
        }
    }

    public static void error(String str) {
        if (ERROR) {
            logger.log(5, null, str, null);
        }
    }

    public static void error(String str, String str2) {
        if (ERROR) {
            logger.log(5, str, str2, null);
        }
    }

    public static void warn(String str, Throwable th) {
        if (WARN) {
            logger.log(4, null, str, th);
        }
    }

    public static void warn(String str, String str2, Throwable th) {
        if (WARN) {
            logger.log(4, str, str2, th);
        }
    }

    public static void warn(String str) {
        if (WARN) {
            logger.log(4, null, str, null);
        }
    }

    public static void warn(String str, String str2) {
        if (WARN) {
            logger.log(4, str, str2, null);
        }
    }

    public static void info(String str, Throwable th) {
        if (INFO) {
            logger.log(3, null, str, th);
        }
    }

    public static void info(String str, String str2, Throwable th) {
        if (INFO) {
            logger.log(3, str, str2, th);
        }
    }

    public static void info(String str) {
        if (INFO) {
            logger.log(3, null, str, null);
        }
    }

    public static void info(String str, String str2) {
        if (INFO) {
            logger.log(3, str, str2, null);
        }
    }

    public static void debug(String str, Throwable th) {
        if (DEBUG) {
            logger.log(2, null, str, th);
        }
    }

    public static void debug(String str, String str2, Throwable th) {
        if (DEBUG) {
            logger.log(2, str, str2, th);
        }
    }

    public static void debug(String str) {
        if (DEBUG) {
            logger.log(2, null, str, null);
        }
    }

    public static void debug(String str, String str2) {
        if (DEBUG) {
            logger.log(2, str, str2, null);
        }
    }

    public static void trace(String str, Throwable th) {
        if (TRACE) {
            logger.log(1, null, str, th);
        }
    }

    public static void trace(String str, String str2, Throwable th) {
        if (TRACE) {
            logger.log(1, str, str2, th);
        }
    }

    public static void trace(String str) {
        if (TRACE) {
            logger.log(1, null, str, null);
        }
    }

    public static void trace(String str, String str2) {
        if (TRACE) {
            logger.log(1, str, str2, null);
        }
    }

    private Log() {
    }
}
