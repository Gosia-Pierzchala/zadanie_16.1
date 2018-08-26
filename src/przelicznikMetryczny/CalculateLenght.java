package przelicznikMetryczny;

public class CalculateLenght {

    public static double changeMtoMM (double userInput){
        double result = userInput * 1000;
        return result;
    }

    public static double changeMtoCM (double userInput){
        double result = userInput * 100;
        return result;
    }

    public static double changeCMtoMM (double userInput){
        double result = userInput * 10;
        return result;
    }

    public static double changeCMtoM (double userInput){
        double result = userInput/100;
        return result;
    }

    public static double changeMMtoCM (double userInput){
        double result = userInput/10;
        return result;
    }

    public static double changeMMtoM (double userInput){
        double result = userInput/1000;
        return result;
    }

}
