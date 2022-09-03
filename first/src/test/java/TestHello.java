import com.yhh.Hello;
import org.junit.Test;
public class TestHello {
    @Test
    public void testHello(){
        Hello hello = new Hello();
        String ans = hello.sayHello(" world");
        System.out.println(ans);
    }
}
