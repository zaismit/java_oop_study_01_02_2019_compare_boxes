public class box extends facade_file
{
    public int height;
    public int width;
    public int length;

    public box(int height, int length, int width)
    {
        this.height = height;
        this.length = length;
        this.width  = width;
    }

    public int volume()
    {
        int volume;

            volume = width * height * length;

        return volume;
    }
}
