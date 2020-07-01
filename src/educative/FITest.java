package educative;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public interface FITest {

    public abstract void abc();

    List<String> getCompanies();
    List<String> getColleges();

    default public int getTRt(){
        return 65;
    }

    default public String getT2t(){
        return "24";
    }

    public static void main(String[] args) {

        int arr1[] = {1,2,3};
        int arr2[] = {1,2,3};
        if(arr1 == arr2){
            System.out.println("Same");
        }else
            System.out.println("Diff");

        /*List<String> lString = Arrays.asList("Amrendra", "Is", "Aditi", "And", "Aadya");

        Predicate<String> p = (s)-> s.startsWith("A");

        for(String s : lString) {
            if(p.test(s)){
                System.out.println(s);
            }
        }*/
    }

}
