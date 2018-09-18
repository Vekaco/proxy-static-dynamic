package staticproxy;


public class HelloImpl implements Hello {
    public void say(String name) {
        System.out.println("staticproxy.Hello!" + name);
    }
}
