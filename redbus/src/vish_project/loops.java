package vish_project;

public class loops {

    public static void main(String args[])
    {
        int iterator=0;
        while (iterator<5)
        {
            System.out.println(iterator);
            iterator++;
        }
        for(int i=0;i<5;i++)
        {
            System.out.println(i);
        }
        String []abc={"viswa","gopi","mercy","vignesh"};
        for(String name:abc)
            System.out.println(name);
    }
}
