<%@ Page Language="C#" AutoEventWireup="true" CodeFile="SurveyComplete.aspx.cs" Inherits="SurveyComplete" MasterPageFile="~/SportsProMasterPage.master" %>

<asp:Content ID="Content1" ContentPlaceHolderId="ContentPlaceHolder" runat="server">

    <h1>Survey Complete - Description...</h1>

        Thank you for the feedback!<br />
        <asp:Label ID="lblMessage" runat="server" Text=""></asp:Label>
    <br />
    <br />
    <asp:Button CssClass="button" ID="btnSurvey" runat="server" Text="Back to Survey" OnClick="btnSurvey_Click" />
</asp:Content>

