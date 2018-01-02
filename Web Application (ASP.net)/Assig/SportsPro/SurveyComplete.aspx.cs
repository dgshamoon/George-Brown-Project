using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class SurveyComplete : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        if (!IsPostBack)
        {
            if (Convert.ToBoolean(HttpContext.Current.Session["contact"]) == true)
            {
                lblMessage.Text = "A customer service representative will " +
                "contact you within 24 hours.";
            }
            else
                lblMessage.Text = "";
        }
    }
    protected void btnSurvey_Click(object sender, EventArgs e)
    {
        Server.Transfer("Surveys.aspx");
    }
}