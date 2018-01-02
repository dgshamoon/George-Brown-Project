using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class Maintenance_Product : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }
    protected void Button1_Click(object sender, EventArgs e)
    {
        SqlDataSource1.InsertParameters["ProductCode"].DefaultValue = txtProdCode.Text;
        SqlDataSource1.InsertParameters["Name"].DefaultValue = txtName.Text;
        SqlDataSource1.InsertParameters["Version"].DefaultValue = txtVersion.Text;
        SqlDataSource1.InsertParameters["ReleaseDate"].DefaultValue = txtRelease.Text;

        try
        {
            SqlDataSource1.Insert();
            txtProdCode.Text = txtName.Text = txtVersion.Text = txtRelease.Text = "";
        }
        catch (Exception except)
        {
            lblError.Text = "Error inserting into Database....Please check your data and rety.";
        }
    }
}