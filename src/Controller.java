import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class Controller {
    public static boolean isInList(
            final ArrayList<double[]> list, final double[] candidate){

        for(final double[] item : list){
            if(Arrays.equals(item, candidate)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "drilon,mark,atlantik";

        String [] s1 = s.split(",");
        for (int i = 0; i <s1.length ; i++) {
            System.out.print(s1[i] + " ");
        }

        ArrayList<double[] > list = new ArrayList<>();
        list.add(new double[] {2,3,4,5,6,7,7,45,345,345,345,345,342});
        list.add(new double[] {1,2,3});
        list.add(new double[] {4,2,1});
        Controller c = new Controller();
        System.out.println(isInList(list, new double[] {1,5,3}));
    }
}
