import java.util.ArrayList;

public class NewEditions extends Notification
{
	private String DVDName;
	private String authorName;
	private String publisherName;
	private double DVDPrice;
	private int grades;
	private ArrayList<String> DVDEdition[] = new ArrayList<String>();
	
	
  public void checkNewEditions()
  {
    //Show the new editions of DVDs
        
    for (int i=0; i<DVDEdition[].size(); i++);
    {
      System.out.println(DVDEdition[i].DVDName + "\t\t" + DVDEdition[i].authorName + "\t\t" + DVDEdition[i].publisherName + "\t\t" + DVDEdition[i].DVDPrice + "\t\t" + DVDEdition[i].grades"\n");
		}
	}
    
  public void set_a_DVD(string newbook)
  {
		DVDEdition[i].DVDName = newDVD;
	}
	
  public boolean check_list()
  {
		if(DVDEdition[i].DVDName = newDVD)
			return true;
		else
			return false;
	}
	
  public int getDVDID()
  {
		return DVDID;
	}
	
  public void validate_addition()
  {
		System.out.println("Adding a DVD.");
		System.out.println("Make an new Order.");
	}

}