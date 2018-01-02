using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

/// <summary>
/// Summary description for Customerlist
/// </summary>
public class CustomerList
{
    private List<Customer> list;

    public Customer this[int index] { get { return list[index]; } set { list[index] = value; } }

    public Customer this[String name]
    {
        get
        {
            return lookupCustomerByName(name);
        }
        set
        {
            list[lookupIndexByName(name)] = value;
        }
    }

    private Customer lookupCustomerByName(String name)
    {
        if (list != null)
            foreach (Customer c in list)
                if (c.Name.Equals(name))
                    return c;
        return null;
    }
    private int lookupIndexByName(String name)
    {
        if (list != null)
            for (int i = 0; i < this.list.Count; i++)
            {
                if (list[i].Name.Equals(name))
                    return i;
            }
        return -1;
    }

    public int Count
    {
        get
        {
            return list.Count;
        }
    }

    public CustomerList()
    {
        this.list = new List<Customer>();
    }

    public static CustomerList GetCustomerList()
    {
        CustomerList cList = (CustomerList)HttpContext.Current.Session["cList"];
        if (cList == null)
            HttpContext.Current.Session["cList"] = new CustomerList();
        return (CustomerList)HttpContext.Current.Session["cList"];
    }

    public void AddItem(Customer c)
    {
        if (!this.list.Contains(c))
            this.list.Add(c);
        list.Sort();
    }

    public void RemoveAt(int index)
    {
        this.list.RemoveAt(0);
    }

    public void Clear()
    {
        this.list.Clear();
    }


}