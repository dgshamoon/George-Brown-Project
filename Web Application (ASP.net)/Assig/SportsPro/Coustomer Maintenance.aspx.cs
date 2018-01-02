using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class Coustomer_Maintenance : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }
    protected void DetailsView1_ItemUpdated(object sender, DetailsViewUpdatedEventArgs e)
    {
        if (e.Exception != null)
        {
            lblError.Text = "Error updating the database. Please check your values..";
            e.ExceptionHandled = true;
            e.KeepInEditMode = true;

        }
        else if (e.AffectedRows == 0)
        {
            lblError.Text = "Someone else is accessing the data , please try later..";
        }
    }
    protected void DetailsView1_PageIndexChanging(object sender, DetailsViewPageEventArgs e)
    {

    }
}