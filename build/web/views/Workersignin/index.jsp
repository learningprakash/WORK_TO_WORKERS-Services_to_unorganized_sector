
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Trnsitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<jsp:include page="../../includes/header.jsp" />

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign In</title>
    </head>
    <body>
        <form action="../../WorkersigninC" method="post" >
            <table align="right">
                <th colspan="2">Fill The Details</th>

                <tr>
                    <td id="LabelWorker_Id">Worker_Id</td>
                    <td><input type="text" name="worker_id" value="${worker_id}" size="20" /></td>
                 </tr>
                <tr>
                    <td id="LabelPassword">Password</td>
                    <td><input type="password" name="password" value="${password}" size="20" /></td>
                </tr>

                  <tr>

                     <td></td>
                     <td>
                      <input type="submit"  name="SignIn" value="Sign In" />
                    </td>
                  </tr>
                  <tr>
                      <td></td>
                      <td><span style="color: red">${error}</span>
                          
                      </td>

                 </tr>
            </table>

 <table align="left">
                <th colspan="2">This is Workers SignIn</th>

                 <tr>
                    <td id="LabelWorker_Id">Workers Are Requested to Fill all the details for sign in to there account We Will Give You The Best Salary</td>
                 </tr>
 </table>


        </form>
    </body>
</html>
