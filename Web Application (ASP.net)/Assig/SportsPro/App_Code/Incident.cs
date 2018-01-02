using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

/// <summary>
/// Summary description for Incident
/// </summary>
public class Incident
{
    public int IncidentID { get; set; }
    public int CustomerID { get; set; }
    public String ProductCode { get; set; }
    public int TechID { get; set; }
    public DateTime DateOpened { get; set; }
    public DateTime DateClosed { get; set; }
    public String Title { get; set; }
    public String Description { get; set; }
    public String ResolutionNotes { get; set; }

    public string CustomerIncidentDisplay()
    {
        return "Incident for product " + ProductCode + " closed " + DateClosed.ToString("MM/dd/yyyy") + " (" + Title + ")";
    }


    public Incident(int incID, int custID, String prodco, int tid, DateTime dateO, DateTime dateC, string title, string desc, string resNotes)
	{
        IncidentID = incID;
        CustomerID = custID;
        ProductCode = prodco;
        TechID = tid;
        DateOpened = dateO;
        DateClosed = dateC;
        Title = title;
        Description = desc;
        ResolutionNotes = resNotes;
	}

   
}