<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<jsp:include page="../../includes/header.jsp" />

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profile</title>
    </head>
    <body>
        <form>
            <table align="center">
                <th colspan="2">Organisation Profile</th>
                 <tr>
                    <td id="LabelEmail_Id">Email_Id</td>
                    <td><input disabled type="text" name="u_id" value="" size="20" /></td>
                </tr>
                <tr>
                    <td id="LabelOrg_Registration_Id">Org_Registration_Id</td>
                    <td><input disabled type="text" name="u_id" value="" size="20" /></td>
                </tr>
                    <tr>
                        <td id="LabelName">Name:</td>
                        <td><input disabled type="text" name="name" value="" size="20" /></td>
                    </tr>
                    <tr>
                        <td id="LabelAddress">Address:</td>
                        <td><textarea disabled name="address" rows="4" cols="20">

            </textarea></td>
                    </tr>


       <tr>
           <td id="LabelState">State:</td>
           <td><input disabled type="text" name="State" value="" size="20" /></td>
       </tr>
         <tr>
           <td id="LabelMobileNumber">Manager's Number</td>
           <td><input disabled type="text" name="con_no" value="" size="20" /></td>
       </tr>
            </table>
                <br/><hr/>

            <table align="center" >
                <th colspan="4">Go to The Required Fields</th>
                <tr>
                    <td>
                       <a href="../UpdateOrgProfile/index.jsp">
                    <ul>
                    Change Profile
                    </ul>
                    </a>
               </td>
               <td>
                      <a href="../Requireworkers/index.jsp">
                    <ul>
                    Require Workers
                    </ul>
                    </a>
                </td>
                <td>
                      <a href="../ViewReports/index.jsp">
                    <ul>
                    View Reports
                    </ul>
                    </a>
                </td>
                
      </tr>
      <tr>
                   <td>
                       <a href="../Rateworker/index.jsp">
                    <ul>
                   Rate The Worker
                    </ul>
                    </a>
               </td>
               <td>
                      <a href="../CheckWorker/index.jsp">
                    <ul>
                   View Workers Profile
                    </ul>
                    </a>
                </td>
                <td>
                      <a href="../Findworkers/index.jsp">
                    <ul>
                   Find The Workers
                    </ul>
                    </a>
                </td>
      </tr>
       <tr>
              <td>
                      <a href="../home/index.jsp">
                    <ul>
                    Sign Out
                    </ul>
                    </a>
              </td>
               <td>
                      <a href="../Help/index.jsp">
                    <ul>
                    Help?
                    </ul>
                    </a>
                </td>
                <td>
                      <a href="../Aboutus/index.jsp">
                    <ul>
                    About US
                    </ul>
                    </a>
                </td>
                </tr>
            </table>
        </form>
    </body>
</html> 
<jsp:include page="../../includes/footer.jsp" />