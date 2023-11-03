package constructors;

public class Parameterized
{
	int num;
    String name;

    Parameterized(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public static void main(String[] args) {
    	Parameterized pc = new Parameterized(45, "Srinivas");
        System.out.println("Geekname is " + pc.name + " and geekid" + pc.num);

    }
}
