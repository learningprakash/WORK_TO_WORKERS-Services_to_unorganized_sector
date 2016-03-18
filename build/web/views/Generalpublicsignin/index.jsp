
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
        <form action="../../GeneralpublicsigninC" method="post" >
            <table align="right">
                <th colspan="2">Fill The Details</th>

                 
                    <tr>
                        <td id="LabelName">User Id:</td>
                        <td><input type="text" name="UserId" value="${UserId}" size="20" /></td>

                    </tr>

                <tr>

                    <td id="LabelPassword">Password</td>
                    <td><input type="password" name="Password" value="${Password}" size="20" /></td>
                </tr>
                  <tr>

                     <td></td>
                     <td>
                      <input type="submit"  name="SignIn" value="Sign In" />
                    </td>
                  </tr>
            </table>

 <table align="left">
                <th colspan="2">This is Organisation SignIn</th>

                 <tr>
                    <td id="LabelWorker_Id">You Are Requested to Fill all the details for sign in <br> We Will Give You The Best Workers</td>
                 </tr>
 </table>


        </form>
    </body>
</html>

