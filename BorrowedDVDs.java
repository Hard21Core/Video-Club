import java.util.Date;
import java.util.ArrayList;

public class BorrowedDVDs extends Notification
{	
	private ArrayList<String> BorrowedDVDs[] = new ArrayList<String>();
	private Date dateofborrowing= new Date();
	private int days;
	
    public void checkBorrowedDVDs()
    {
		//searching borrowed DVDs
		
        for (int i=0; i<BorrowedDVDs[].size(); i++);
        {
            System.out.println(BorrowedDVDs[i].DVDID + "\t\t" + BorrowedDVDs[i].last_name + "\t\t"+ BorrowedDVDs[i].fisrt_name + "\t\t" + BorrowedDVDs[i].dateofborrowing "\t\t" + BorrowedDVDs[i].days "\n");
	    }
    }
	
    public boolean check_deadline()
    {
		if (days < 15 )
			return true;
		else
			return false;
	}
    
    public int getmessage()
    {
		return last_name;
	}
	
    public void decreasePoints()
    {
        for (int i=0; i<BorrowedDVDs[].size(); i++);
        {
            if(BorrowedDVDs[i].days > 15)
            {
                points= points - 2;
            }
            else
            {
                System.out.println(" There is no time violation.");
            }
	    }
    }
}