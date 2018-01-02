<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Default.aspx.cs" Inherits="_Default" MasterPageFile="~/SportsProMasterPage.master" %>

  


<asp:Content ID="Content1" ContentPlaceHolderId="ContentPlaceHolder" runat="server">

       <style>
           td.num {
               background-color: darkblue;
               color: white;
               width: 40px;
               text-align: center;
           }
       </style>


    <h1>Welcome to SportsPro Portal</h1>

    <table class="auto-style1">
        <tr>
            <td class="num" rowspan="2">1</td>
            <td><b>Getting Started</b></td>
        </tr>
        <tr>
            <td>Go to <a href ="Customers.aspx">Customers</a>  section to search for your customer information.</td>
        </tr>
        <tr>
            <td colspan="2">&nbsp;</td>
        </tr>
        <tr>
            <td class="num" rowspan="2">2</td>
            <td><b>What do you think about our service?</b></td>
        </tr>
        <tr>
            <td><a href="Surveys.aspx">Submit a survey</a> to provide your feedback for any support we have provided to you recently.</td>
        </tr>
    </table>
    <br />
    <h2>Group Members</h2>
    <ol>
 <ol>
  <li>Khan Awa Vitalis</li>
  <li>Rajat Chawla</li>
  <li>Danial Ghehe Shamoon</li>
</ol>
</asp:Content>
