
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
                <th colspan="2">User Profile</th>
                 <tr>
                    <td>Email_Id</td>
             
                    <td>${user.EmailId}</td>
                </tr>
               
                    <tr>
                        <td>Name:</td>
                        <td>${user.Name}</td>
                    </tr>
                    <tr>
                        <td id="LabelAddress">Address:</td>
                        <td>
                        ${user.Address}
                         </td>
                    </tr>


       <tr>
           <td id="LabelState">State:</td>
           <td><input  type="text" name="State" value="" size="20" /></td>
       </tr>
         <tr>
           <td id="LabelMobileNumber">Mobile/Contact Number</td>
           <td><input  type="text" name="con_no" value="" size="20" /></td>
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

