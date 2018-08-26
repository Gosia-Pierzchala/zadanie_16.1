package przelicznikWag;

public class CalculateWeight {
    public static double changeKGtoG (double userInput){
        double result = userInput * 1000;
        return result;
    }

    public static double changeKGtoMg (double userInput){
        double result = userInput * 1000000;
        return result;
    }

    public static double changeGtoMg (double userInput){
        double result = userInput * 1000;
        return result;
    }

    public static double changeGtoKg (double userInput){
        double result = userInput/1000;
        return result;
    }

    public static double changeMGtoG (double userInput){
        double result = userInput/1000;
        return result;
    }

    public static double changeMGtoKG (double userInput){
        double result = userInput/1000000;
        return result;
    }

}
