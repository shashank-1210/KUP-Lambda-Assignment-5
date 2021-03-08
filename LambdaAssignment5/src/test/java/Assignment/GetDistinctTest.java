package Assignment;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetDistinctTest {


    GetDistinctStringsImpl obj = new GetDistinctStringsImpl();

    @Test
    public void test1()
    {
        List<String> expected = Arrays.asList("clojure","java","scala");
        List<String> actual = obj.get.distinctStrings(new ArrayList<>(Arrays.asList("java","scala","java","clojure","clojure")));

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void test2()
    {
        List<String> expected = Arrays.asList("a","an","the","three");
        List<String> actual = obj.get.distinctStrings(new ArrayList<>(Arrays.asList("the","three","the","three","the","three","an","an","a")));

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void test3()
    {
        List<String> expected = Arrays.asList("");
        List<String> actual = obj.get.distinctStrings(new ArrayList<>(Arrays.asList("")));

        Assert.assertEquals(expected,actual);
    }


    ////Negative Test Case as expected List will be [Hello]
    @Test
    public void test4()
    {
        List<String> expected = Arrays.asList("Hello","Hello");
        List<String> actual = obj.get.distinctStrings(new ArrayList<>(Arrays.asList("Hello","Hello","Hello")));

        Assert.assertNotEquals(expected,actual);
    }


}