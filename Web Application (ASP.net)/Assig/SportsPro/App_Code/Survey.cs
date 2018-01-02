using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

/// <summary>
/// Summary description for Survey
/// </summary>
public class Survey
{
    public int CustomerID { get; set; } 
    public int IncidentID { get; set; } 
    public int ResponseTime { get; set; } 
    public int TechEfficiency { get; set; } 
    public int Resolution { get; set; } 
    public string Comments { get; set; } 
    public bool Contact { get;set; }
    public string ContactBy { get; set; }

	public Survey(int CustomerID, int IncidentID, int ReponseTime, int TechEfficiency, 
        int Resolution, String Comments, 
        bool Contact, String ContactBy)
	{
        this.CustomerID = CustomerID;
        this.IncidentID = IncidentID;
        this.ResponseTime = ResponseTime;
        this.TechEfficiency = TechEfficiency;
        this.Resolution = Resolution;
        this.Comments = Comments;
        this.Contact = Contact;
        this.ContactBy = ContactBy;
	}
}