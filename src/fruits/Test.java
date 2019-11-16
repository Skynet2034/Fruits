package fruits;

public class Test {

    public static void main (String[] args)

    {

        Box<Orange> boxOr1=new Box<>();
        Box<Orange> boxOr2=new Box<>();
        Box<Apple> boxAp1=new Box<>();
        Box<Apple> boxAp2=new Box<>();
        for (int i=0;i<10;i++)
        {
            boxOr1.add(new Orange());
            boxAp1.add(new Apple());
        }
        System.out.println("Box orange 1 - "+boxOr1.count+" oranges, weight="+boxOr1.getWeight());
        System.out.println("Box apple 1 - "+boxAp1.count+" apples, weight="+boxAp1.getWeight());
        for (int i=0;i<1;i++)
        {
            boxOr2.add(new Orange());
            boxAp2.add(new Apple());
        }

        System.out.println("Comparing box orange 1 with box apple 1 - "+boxOr1.compare(boxAp1));
        for (int i=0;i<5;i++)
        {
            boxAp1.add(new Apple());
        }
        System.out.println("Box apple 1 - new apples count - "+boxAp1.count+" new weight="+boxAp1.getWeight());
        System.out.println("Comparing box orange 1 with box apple 1 - "+boxOr1.compare(boxAp1));
        System.out.println("Box orange 2 - "+boxOr2.count+" oranges, weight="+boxOr2.getWeight());
        System.out.println("Box apple 2 "+boxAp2.count+" apples, weight="+boxAp2.getWeight());
        System.out.println("Comparing box orange 2 with 1 orange - "+ boxOr2.compare(new Orange()));
        boxOr1.move(boxOr2);
        System.out.println("Moving oranges from box 1 to box 2, new orange box 2 weight= - "+boxOr2.getWeight());
        System.out.println("New orange box 1 weight= - "+boxOr1.getWeight());
    }
}
