using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class Contactlist : System.Web.UI.Page
{
    private CustomerList cList;
    protected void Page_Load(object sender, EventArgs e)
    {
        cList = CustomerList.GetCustomerList();
        if (!IsPostBack)
            RefreshListBox();
    }

    private void RefreshListBox()
    {
        this.lbContactList.Items.Clear();

        for (int i = 0; i < cList.Count; i++)
        {
            if (cList[i] != null)
                this.lbContactList.Items.Add(cList[i].ToString());
        }
    }
    protected void btnRemove_Click(object sender, EventArgs e)
    {
       
        lbContactList.Items.Remove(lbContactList.SelectedItem);
        //CustomerList.GetCustomerList().RemoveAt(index);
       //if (cList.Count > 0)
        //{
          //  if (lbContactList.SelectedIndex >= 0)
            //{
              //  cList.RemoveAt(lbContactList.SelectedIndex);
                //RefreshListBox();
            //}
        //}
    }
    protected void btnEmpty_Click(object sender, EventArgs e)
    {
        cList.Clear();
        RefreshListBox();
    }
    protected void btnSelectAddCustomers_Click(object sender, EventArgs e)
    {
        Server.Transfer("Customers.aspx");
    }
}