using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

/// <summary>
/// Summary description for Customer
/// </summary>
public class Customer : IComparable, IEquatable<Customer>
{
    public int CustomerId { get; private set; }
    public string Name { get; set; }
    public string Address { get; set; }
    public string City { get; set; }
    public string State { get; set; }
    public string ZipCode { get; set; }
    public string Phone { get; set; }
    public string Email { get; set; }

	public Customer(int CustomerId, String Name, String Address, String City, String State, String ZipCode, String Phone, String Email)
	{
        this.CustomerId = CustomerId;
        this.Name = Name;
        this.Address = Address;
        this.City = City;
        this.State = State;
        this.ZipCode = ZipCode;
        this.Phone = Phone;
        this.Email = Email;
	}

    public int CompareTo(object obj)
    {
        Customer other = (Customer)obj;
        return this.Name.CompareTo(other.Name);
    }

    public String ToString()
    {
        return this.Name + "; " + this.Phone + "; " + this.Email;
    }

    public bool Equals(Customer other)
    {
        return this.CustomerId == other.CustomerId;
    }
}