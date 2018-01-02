<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Contactlist.aspx.cs" Inherits="Contactlist" MasterPageFile="~/SportsProMasterPage.master" %>

<asp:Content ID="Content1" ContentPlaceHolderId="ContentPlaceHolder" runat="server">
    <style type="text/css">
        .auto-style1 {
            width: 100%;
        }
        .auto-style3 {
            width: 4px;
        }
    </style>

        <h2>Contact List - Manage your contact list</h2>
        <br />
        <p>Contact list:</p>

        <table class="auto-style1">
        <tr>
            <td rowspan="2" class="auto-style3">
                <asp:ListBox ID="lbContactList" runat="server" Height="100px" Width="482px"></asp:ListBox>
            </td>
            <td>
                &nbsp;&nbsp;
                <asp:Button CssClass="button"  ID="btnRemove" runat="server" OnClick="btnRemove_Click" Text="Remove Contact" style="top: 0px; left: -1px" />
            </td>
        </tr>
        <tr>
            <td >
                &nbsp;&nbsp;
                <asp:Button CssClass="button" ID="btnEmpty" runat="server" OnClick="btnEmpty_Click" Text="Empty List" />
            </td>
        </tr>
    </table>
        <br />
        <asp:Button CssClass="button" ID="btnSelectAddCustomers" runat="server"  OnClick="btnSelectAddCustomers_Click" Text="Select Additiional Customers" style="width: 245px; top: 0px; left: 0px;" />
</asp:Content>
