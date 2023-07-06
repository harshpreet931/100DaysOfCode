public class enumWeeknd {
    public enum Wnd{
        SAT,SUN
    }

    public static void main(String[] args){
        Wnd d1 = Wnd.SAT;
        Wnd d2 = Wnd.SUN;

        System.out.println("FIRST DAY OF WEEKND: "+ d1);
        System.out.println("SECOND DAY OF THE WEEKND: "+d2);
    }
}
