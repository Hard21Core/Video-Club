public class Notifications
{
    protected NewEditions issue;
    protected BorrowedDVDs card;
    
    public Notification(NewEditions is, BorrowedDVDs c)
    {   
        issue = is;
        card = c;
    }
    
    public NewEditions get_editions()
    {
        return issue;
    }
    
    public BorrowedDVDs getBorrowedDVDs()
    {
        return card;
    }
}