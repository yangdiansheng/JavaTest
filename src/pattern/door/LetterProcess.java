package pattern.door;

public interface LetterProcess {
    void writeContext(String context);
    void fillEnvelope(String address);
    void letterInotoEnvelope();
    void sendLetter();
}
