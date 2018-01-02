<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Surveys.aspx.cs" Inherits="Surveys" MasterPageFile="~/SportsProMasterPage.master" %>


<asp:Content ID="Content1" ContentPlaceHolderId="ContentPlaceHolder" runat="server">

    
    <style type="text/css">
        .auto-style1 {
            width: 100%;
        }
        .auto-style2 {
            width: 190px;
        }
        .auto-style3 {
            width: 567px;
        }
    </style>

    <h1>Surveys - Collect feedback from customers</h1>
    
        <asp:Label ID="lblCustomerID" runat="server" Text="Enter your Customer ID:"></asp:Label>
        &nbsp;&nbsp;
        <asp:TextBox ID="tbCustomerID" runat="server" OnTextChanged="tbCustomerID_TextChanged"></asp:TextBox>
        &nbsp;&nbsp;
        <asp:Button CssClass="button" ID="btnGetIncident" runat="server" Text="Get Incidents" OnClick="btnGetIncident_Click" ValidationGroup="vgGetIncident" />
        &nbsp;
        <asp:RequiredFieldValidator ID="RequiredFieldValidator1" runat="server" ControlToValidate="tbCustomerID" Display="Dynamic" ErrorMessage="Please enter a value for Customer ID" ValidationGroup="vgGetIncident" ForeColor="Red"></asp:RequiredFieldValidator>
        <asp:CompareValidator ID="CompareValidator1" runat="server" ControlToValidate="tbCustomerID" Display="Dynamic" ErrorMessage="Make sure you enter a number" Operator="DataTypeCheck" Type="Integer" ValidationGroup="vgGetIncident" ForeColor="Red"></asp:CompareValidator>
        <br />
        <br />
        <asp:ListBox AutoPostBack="true" ID="lbIncidents" runat="server" Height="79px" Width="552px" OnSelectedIndexChanged="lbIncidents_SelectedIndexChanged" ValidationGroup="vgIncidents"></asp:ListBox>&nbsp; <asp:RequiredFieldValidator ID="RequiredFieldValidator2" runat="server" ErrorMessage="Please select an incident" ControlToValidate="lbIncidents" Display="Dynamic" ValidationGroup="vgIncidents" ForeColor="Red"></asp:RequiredFieldValidator>
        <asp:SqlDataSource ID="SqlDataSource1" runat="server" ConnectionString="<%$ ConnectionStrings:ConnectionString %>" SelectCommand="SELECT [IncidentID], [CustomerID], [ProductCode], [TechID], [DateOpened], [DateClosed], [Title], [ResolutionNotes] FROM [Incidents] ORDER BY [DateClosed]"></asp:SqlDataSource>
        <br />
        <br />
        <b>Please rate this incident by the following categories:</b><br />
        <table class="auto-style1">
            <tr>
                <td class="auto-style2">
                    <asp:Label ID="lblResponse" runat="server" Text="Response Time:" Enabled="False"></asp:Label>
                </td>
                <td class="auto-style3">
                    <asp:RadioButtonList ID="rbResponse" runat="server" RepeatDirection="Horizontal" Enabled="False">
                        <asp:ListItem Text ="Not satisfied" Value="1" />
                        <asp:ListItem Text ="Somewhat satisfied" Value="2" />
                        <asp:ListItem Text ="Satisfied" Value="3" />
                        <asp:ListItem Text ="Completely satisfied" Value="4" />
                    </asp:RadioButtonList>
                </td>
                <td>
                    <asp:RequiredFieldValidator ID="RequiredFieldValidator3" runat="server" ControlToValidate="rbResponse" Display="Dynamic" ErrorMessage="Please choose one" ForeColor="Red" ValidationGroup="vgIncidents"></asp:RequiredFieldValidator>
                </td>
            </tr>
            <tr>
                <td class="auto-style2">
                    <asp:Label ID="lblTechnician" runat="server" Text="Technician efficiency:" Enabled="False"></asp:Label>
                </td>
                <td class="auto-style3">
                    <asp:RadioButtonList ID="rbTechnician" runat="server" RepeatDirection="Horizontal" Enabled="False">
                        <asp:ListItem Text ="Not satisfied" Value="1" />
                        <asp:ListItem Text ="Somewhat satisfied" Value="2" />
                        <asp:ListItem Text ="Satisfied" Value="3" />
                        <asp:ListItem Text ="Completely satisfied" Value="4" />
                    </asp:RadioButtonList>
                </td>
                <td>
                    <asp:RequiredFieldValidator ID="RequiredFieldValidator4" runat="server" ControlToValidate="rbTechnician" Display="Dynamic" ErrorMessage="Please choose one" ForeColor="Red" ValidationGroup="vgIncidents"></asp:RequiredFieldValidator>
                </td>
            </tr>
            <tr>
                <td class="auto-style2">
                    <asp:Label ID="lblResolution" runat="server" Text="Problem resolution:" Enabled="False"></asp:Label>
                </td>
                <td class="auto-style3">
                    <asp:RadioButtonList ID="rbResolution" runat="server" RepeatDirection="Horizontal" Enabled="False">
                        <asp:ListItem Text ="Not satisfied" Value="1" />
                        <asp:ListItem Text ="Somewhat satisfied" Value="2" />
                        <asp:ListItem Text ="Satisfied" Value="3" />
                        <asp:ListItem Text ="Completely satisfied" Value="4" />
                    </asp:RadioButtonList>
                </td>
                <td>
                    <asp:RequiredFieldValidator ID="RequiredFieldValidator5" runat="server" ControlToValidate="rbResolution" Display="Dynamic" EnableTheming="False" ErrorMessage="Please choose one" ForeColor="Red" ValidationGroup="vgIncidents"></asp:RequiredFieldValidator>
                </td>
            </tr>
            <tr>
                <td class="auto-style2">
                    <asp:Label ID="lblComments" runat="server" Text="Additional Comments:" Enabled="False"></asp:Label>
                </td>
                <td class="auto-style3">
                    <asp:TextBox ID="tbComments" runat="server" Height="82px" TextMode="MultiLine" Width="379px" Enabled="False"></asp:TextBox>
                </td>
                <td>
                    &nbsp;</td>
            </tr>
        </table>


        <asp:CheckBox ID="cbContact" runat="server" Text="Please contact me to discuss this incident" Enabled="False" Checked="True" AutoPostBack="True" OnCheckedChanged="cbContact_CheckedChanged" />
        <br />
        <asp:RadioButton ID="rbEmail" runat="server" Checked="True" GroupName="rbGroupContact" Text="Contact by email" Enabled="False" />
        <asp:RadioButton ID="rbPhone" runat="server" GroupName="rbGroupContact" Text="Contact by phone" Enabled="False" />
        <br />
        <br />
        <asp:Button CssClass="button" ID="btnSubmit" runat="server" Text="Submit" ValidationGroup="vgIncidents" OnClick="btnSubmit_Click" Enabled="False" />



        </asp:Content>