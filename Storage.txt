import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;

public class Storage
{
	
	public int DVDID;
	public String category;
	public String title;
	private String author;
	private Date dateofissue= new Date();
	private int DVDcount;
	private ArrayList <String> DVDStocks[] = new ArrayList <String>();
	private Daneismos-polisi borrow = null; 

    public Storage(int ID, String ctg, String text, String writer, Date date, int count )
    {
		DVDID=ID;
		category=ctg;
		title=text;
		author=writer;
		dateofissue=date;
		DVDcount=count;
    }

    Scanner input = new Scanner(System.in);

    private int choice = input.nextInt();

    switch(choice)
    {
	    case:1 

            public void loadinglist()
            {
	
                for (int i=0; i<DVDStocks[].size(); i++)
                {
                    System.out.println(DVDStocks[i].DVDID + "\t\t" + DVDStocks[i].category + "\t\t" + DVDStocks[i].title + "\t\t" + DVDStocks[i].author + "\t\t" + DVDStocks[i].dateofissue + "\t\t" + DVDStocks[i].DVDcount"\n");
                }
		    }
	
            public void setDVD(int code)
            {
			    DVDID = code;
		    }

            public boolean check_storage()
            {
                for (int i=0; i<DVDStocks[].size(); i++)
                {
				    if (DVDStocks[i].DVDID=code)
					    return true;
				    else 
					    return false;
		        }
            }
        
            public int getDVDstocks()
            {
                for (int i=0; i<DVDStocks[].size(); i++)
                {
				    if (DVDStocks[i].DVDcount>0)
					    return DVDcount;
				    else 
					    System.out.println("Unavailable stock of DVD");
			    }
		    }
		
            public void setNumberOfDVD(int num)
            {
			    System.out.println("Enter the number of DVD:");
			    num = input.nextInt();
		    }

            public void update(Daneismos-Polisi b)
            {
			    borrow = b;
		    }

            public boolean isBorrowed()
            {
			    if(borrow!=null)
				    return true;
			    else
				    return false;
		    }
		
	    break;
	
	    case 2:    // remove DVD from DVDStocks

            public void removeDVD(int DVD)
            {
			    DVD = input.nextInt();
		    }

            public boolean check_list()
            {
                for (int i=0; i<DVDStocks[].size(); i++)
                {
				    if (DVDStocks[i].DVDID=DVD)
					    return true;
				    else
					    return false;
		        }
		    }

            public void reduce_stock()
            {
				
                for(i=0; i<DVDStocks[].size(); i++)
                {
                    if(DVDStocks[i].DVDID = DVD)
                    {
					    DVDStocks[i].DVDcount--;
					    System.out.println("Validate removal");
				    }
                    else 
                    {
					    System.out.println("There is no such a DVD.");
				    }
                }
            }

	    break;
    }
}