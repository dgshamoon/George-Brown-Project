using System;
using System.Collections.Generic;
using System.Data;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class Customers : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        if (!IsPostBack)
        {
            ddlCustomers.DataBind();
        }

        Customer cust = GetCustomer();

        lblAddress1.Text = cust.Address;
        lblAddress2.Text = cust.City + ", " + cust.State + " " + cust.ZipCode;
        lblEmail.Text = cust.Email;
        lblPhone.Text = cust.Phone;
    }
    private Customer GetCustomer()
    {
        DataView customerTable = (DataView)SqlDataSource1.Select(DataSourceSelectArguments.Empty);
        customerTable.RowFilter = "CustomerID ='" + ddlCustomers.SelectedValue + "'";
        DataRowView row = (DataRowView)customerTable[0];

        string customerId = row["CustomerID"].ToString();
        string name = row["Name"].ToString();
        string address = row["Address"].ToString();
        string city = row["City"].ToString();
        string state = row["State"].ToString();
        string zipCode = row["ZipCode"].ToString();
        string phone = row["Phone"].ToString();
        string email = row["Email"].ToString();

        return new Customer(Int16.Parse(customerId), name, address, city, state, zipCode, phone, email);
    }

    protected void btnAdd_Click(object sender, EventArgs e)
    {
        CustomerList list = CustomerList.GetCustomerList();
        Customer cust = GetCustomer();
        list.AddItem(cust);

    }
    protected void btnDisplay_Click(object sender, EventArgs e)
    {
        Server.Transfer("Contactlist.aspx");
    }
}