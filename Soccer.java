public class Soccer extends Sports
{
    @Override
    String get_name()
    {
        return "Soccer Class";
    }
    void get_number_of_team_members()
    {
        System.out.println( "Each team has 11 players in " + get_name() );
    }
}

