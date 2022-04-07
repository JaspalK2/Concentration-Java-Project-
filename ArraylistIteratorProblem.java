import java.util.ArrayList;
import java.util.Arrays;

public class ArraylistIteratorProblem {
    public static void main(String[] args) {
        ArrayList<Integer> ary = new ArrayList<Integer>((Arrays.asList(1,2,2,3,3,4,5)));
    for(int i = 0; i < ary.size(); i++){
        int compare = ary.get((i));
        for(int z = 0; z < ary.size(); z++){
            if(z == i){
                continue;
            }
            if(ary.get(z) == ary.get(i)){

              ary.remove(ary.get(z));
            }


        }
    }
    for(int z = 0; z < ary.size(); z++){
       System.out.println(ary.get(z));
    }
    }
    
    
}
