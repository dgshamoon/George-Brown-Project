using System;
using System.Collections.Generic;
using System.Data;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class Surveys : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        Page.SetFocus(tbCustomerID);
    }
    protected void tbCustomerID_TextChanged(object sender, EventArgs e)
    {

    }
    protected void btnGetIncident_Click(object sender, EventArgs e)
    {
        lbIncidents.Items.Clear();

        ListItem firstItem = new ListItem("--Select an incident--", "None");
        lbIncidents.Items.Add(firstItem);

        List<Incident> incidents = DisaplayIncident();
        if (incidents.Count == 0)
        {
            EnableInput(false);
            Page.SetFocus(tbCustomerID);
            return;
        }
        foreach (Incident incident in incidents)
        {
            ListItem lItem = new ListItem(incident.CustomerIncidentDisplay(), incident.IncidentID.ToString());
            lbIncidents.Items.Add(lItem);
        }
        Page.SetFocus(lbIncidents);
    }
    public List<Incident> DisaplayIncident()
    {
        List<Incident> output = new List<Incident>();
        DataView incidentTable = (DataView)SqlDataSource1.Select(DataSourceSelectArguments.Empty);
        incidentTable.RowFilter = "CustomerID ='" + tbCustomerID.Text + "' and DateClosed is not null";
        //DataRowView row = (DataRowView)customerTable[0];

        foreach (DataRowView rowView in incidentTable)
        {
            DataRow row = rowView.Row;

            int incidentID = int.Parse(row["IncidentID"].ToString());
            int customerID = int.Parse(row["CustomerID"].ToString());
            String productCode = row["ProductCode"].ToString();
            int techID = int.Parse(row["TechID"].ToString());
            DateTime dateOpened = Convert.ToDateTime(row["DateOpened"].ToString());
            DateTime dateClosed = Convert.ToDateTime(row["DateClosed"].ToString());
            string title = row["Title"].ToString();
            string resolutionNotes = row["ResolutionNotes"].ToString();

            Incident incident = new Incident(incidentID, customerID, productCode, techID, 
                dateOpened, dateClosed, title, "", resolutionNotes);

            output.Add(incident);


        }

        return output;
    }


    protected void lbIncidents_SelectedIndexChanged(object sender, EventArgs e)
    {
        if (lbIncidents.SelectedIndex > 0)
        {
            EnableInput(true);
        }
        else EnableInput(false);
    }

    private void EnableInput(bool enable)
    {
        rbResponse.Enabled = enable;
        rbResolution.Enabled = enable;
        rbTechnician.Enabled = enable;
        cbContact.Enabled = enable;
        rbEmail.Enabled = enable;
        rbPhone.Enabled = enable;
        tbComments.Enabled = enable;
        btnSubmit.Enabled = enable;
    }
    protected void btnSubmit_Click(object sender, EventArgs e)
    {
        if (IsValid)
        {
            int customerID = int.Parse(tbCustomerID.Text);
            int incidentID = int.Parse(lbIncidents.SelectedItem.Value);
            int responseTime = int.Parse(rbResponse.SelectedValue);
            int techEfficienty = int.Parse(rbTechnician.SelectedValue);
            int resolution = int.Parse(rbResolution.SelectedValue);
            String comments = tbComments.Text;
            bool contact = cbContact.Checked;
            String contactBy = rbEmail.Checked ? rbEmail.Text : rbPhone.Text;

            Survey survey = new Survey(customerID, incidentID, responseTime, techEfficienty, resolution,
                comments, contact, contactBy);

            HttpContext.Current.Session["contact"] = contact;

            Server.Transfer("SurveyComplete.aspx");
        }
    }
    protected void cbContact_CheckedChanged(object sender, EventArgs e)
    {
        rbEmail.Enabled = !rbEmail.Enabled;
        rbPhone.Enabled = !rbPhone.Enabled;
    }
}