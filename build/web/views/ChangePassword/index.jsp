<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<jsp:include page="../../includes/header.jsp" />
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Change Password</title>
    </head>
    <body>
        <form action="../../SignupC" method="post" >
       <table align="left">
                <th colspan="2">Change Password</th>

                 <tr>
                    <td id="LabelAdmin">For Changing Password You Must remember Old Password</td>
                 </tr>
       </table>
         <table align="center">
                <th colspan="2">Change Password</th>

                  <tr>
                        <td id="LabelOldPassword">Old Password:</td>
                        <td><input type="password" name="OldPassword" value="" size="20" /></td>

                    </tr>
                <tr>
                    <td id="LabelNewPassword">New Password</td>
                    <td><input type="password" name="NewPassword" value="" size="20" /></td>
                </tr>
               <tr>
                    <td id="LabelReEnterNewPassword">Re Enter New Password</td>
                    <td><input type="password" name="ReEnterNewPassword" value="" size="20" /></td>
                </tr>
                  <tr>

                     <td></td>
                     <td>
                      <input type="submit"  name="Change" value="Change" />
                    </td>
                  </tr>
            </table>
        </form>
    </body>
</html>
