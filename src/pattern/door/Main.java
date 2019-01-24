package pattern.door;

import pattern.decoration.FourthGradeSchoolReport;
import pattern.decoration.HighScoreDecorator;
import pattern.decoration.SchoolReport;
import pattern.decoration.SortScoreDecorator;

public class Main {
    public static void main(String[] args){
//        LetterProcess letterProcess = new LetterProcessImpl();
//        letterProcess.writeContext("hello it`s me,do you know who i am?",);
//        letterProcess.fillEnvelope("Happy road No.666 God Province heaven");
//        letterProcess.letterInotoEnvelope();
//        letterProcess.sendLetter();
//

        ModenPostOffice modenPostOffice = new ModenPostOffice();
        modenPostOffice.sendLetter("hello it`s me,do you know who i am?",
                "Happy road No.666 God Province heaven");
    }
}
