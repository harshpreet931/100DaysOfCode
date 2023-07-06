public class enumDAYSOFWEEK{
    public enum DoW{
        Sun,Mon,Tue,Wed,Thu,Fri,Sat
    }
    public static void main(String[] args){
        DoW today = DoW.Mon;
        System.out.println("Today is: " + today);

    }
}