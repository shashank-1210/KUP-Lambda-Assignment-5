package Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class GetDistinctStringsImpl {

   public  GetDistinctStrings get = l -> {

        Set<String> set = l.stream().collect(Collectors.toSet());
        return set.stream().sorted().collect(Collectors.toList());

    };

}





      //  System.out.println(set);


  /*  @Override
    public List<String> distinctStrings(List<String> l)
    {
        Set<String> set = l.stream().collect(Collectors.toSet());
        return set.stream().sorted().collect(Collectors.toList());
    }*/




