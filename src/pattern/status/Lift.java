package pattern.status;

public interface Lift {
    int OPEN_STATE= 1;
    int CLOSE_STATE= 1;
    int RUN_STATE= 1;
    int STOP_STATE= 1;
    void sate(int state);
    void open();
    void close();
    void run();
    void stop();
}
