<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Customers.aspx.cs" Inherits="Customers" MasterPageFile="~/SportsProMasterPage.master" %>
<asp:Content ID="Content1" ContentPlaceHolderId="ContentPlaceHolder" runat="server">
    <style type="text/css">
        .auto-style1 {
            width: 100%;
        }
        .auto-style2 {
            width: 240px;
        }
        .auto-style3 {
            width: 159px;
        }
        .auto-style4 {
            width: 159px;
            height: 23px;
        }
        .auto-style5 {
            height: 23px;
        }
        .auto-style6 {
            width: 159px;
            height: 26px;
        }
        .auto-style7 {
            height: 26px;
        }
        .auto-style8 {
            width: 241px;
        }
    </style>


    <h2>Customers - Search and view your customer contact information</h2>
    
        <table class="auto-style1">
        <tr>
            <td class="auto-style2">Select a Customer:</td>
            <td>
                <asp:DropDownList ID="ddlCustomers" runat="server" DataSourceID="SqlDataSource1" DataTextField="Name" DataValueField="CustomerID" AutoPostBack="True">
                </asp:DropDownList>
            </td>
            <td>
                <asp:SqlDataSource ID="SqlDataSource1" runat="server" ConnectionString="<%$ ConnectionStrings:ConnectionString %>" SelectCommand="SELECT * FROM [Customers] ORDER BY [Name]"></asp:SqlDataSource>
            </td>
        </tr>
    </table>
         <table class="auto-style1">
        <tr>
            <td class="auto-style3">Address:</td>
            <td>
                <asp:Label ID="lblAddress1" runat="server"></asp:Label>
            </td>
        </tr>
        <tr>
            <td class="auto-style3">&nbsp;</td>
            <td>
                <asp:Label ID="lblAddress2" runat="server"></asp:Label>
            </td>
        </tr>
        <tr>
            <td class="auto-style4">Phone:</td>
            <td class="auto-style5">
                <asp:Label ID="lblPhone" runat="server"></asp:Label>
            </td>
        </tr>
        <tr>
            <td class="auto-style6">Email:</td>
            <td class="auto-style7">
                <asp:Label ID="lblEmail" runat="server"></asp:Label>
            </td>
        </tr>
        <tr>
            <td class="auto-style3">
                &nbsp;</td>
            <td>
                &nbsp;</td>
        </tr>
    </table>

        
    <table class="auto-style1">
        <tr>
            <td class="auto-style8">
                <asp:Button CssClass="button" ID="btnAdd" runat="server" Text="Add to Contact List" Width="169px" OnClick="btnAdd_Click" />
            </td>
            <td>&nbsp;</td>
            <td>
                <asp:Button CssClass="button" ID="btnDisplay" runat="server" style="width: 177px; top: 0px; left: 0px;" Text="Display Contact List" OnClick="btnDisplay_Click" />
            </td>
        </tr>
    </table>
</asp:Content>

