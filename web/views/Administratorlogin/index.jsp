<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<jsp:include page="../../includes/header.jsp" />
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign In</title>
    </head>
    <body>
        <form action="../../AdministratorloginC" method="post" >
            <table align="right">
                <th colspan="2">Administrator LogIn</th>
                <tr>
                    <td id="LabelAdmin_Id">Admin_Id</td>
                    <td><input type="text" name="Admin_id" value="${Admin_id}" size="20" /></td>
                </tr>
                <tr>
                    <td id="LabelPassword">Password</td>
                    <td><input type="password" name="password" value="${Password}" size="20" /></td>
                </tr>
                  <tr>

                     <td></td>
                     <td>
                      <input type="submit"  name="SignIn" value="Sign In" />
                    </td>
                  </tr>
            </table>

 <table align="left">
                <th colspan="2">This is Admin SignIn</th>

                 <tr>
                    <td id="LabelAdmin">You Are Requested to Fill all the details for sign in to the account</td>
                 </tr>
 </table>


        </form>
    </body>
</html>


