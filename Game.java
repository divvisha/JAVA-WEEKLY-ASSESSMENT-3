
public class Game
{
    public static void main(String[] args)
    {
        Sports s1=new Sports();
        Soccer s2=new Soccer();
        System.out.println(s1.get_name());
        s1.get_number_of_team_members();
        System.out.println(s2.get_name());
        s2.get_number_of_team_members();
    }
}