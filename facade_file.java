public class facade_file
{
    public static void main(String[] args)
    {
        box first_box;

            first_box  = new box(1, 3,5);

        int first_box_volume;

            first_box_volume = first_box.volume();

        box second_box;

            second_box = new box(1, 3, 5);

        int second_box_volume;

            second_box_volume = second_box.volume();

                if (first_box_volume < second_box_volume)
                {
                    System.out.println("second box bigger");
                }
                else if (first_box_volume > second_box_volume)
                {
                    System.out.println("first box bigger");
                }
                else
                {
                    System.out.println("equals");
                }
    }
}