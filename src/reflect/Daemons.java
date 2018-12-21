package reflect;

public final class Daemons {
    private static final int NANOS_PER_MILLI = 1000 * 1000;
    private static final int NANOS_PER_SECOND = NANOS_PER_MILLI * 1000;
    private static final long MAX_FINALIZE_NANOS = 10L * NANOS_PER_SECOND;

    public static void start() {
        System.out.println("start");
    }

    public static void startPostZygoteFork() {
        System.out.println("start");
    }

    public static void stop() {
        System.out.println("stop");
    }

    private static abstract class Daemon {

        public void stop() {
            System.out.println("Daemon stop");
        }

    }

    private static class FinalizerWatchdogDaemon extends Daemon {
        private static final FinalizerWatchdogDaemon INSTANCE = new FinalizerWatchdogDaemon();
    }
}
