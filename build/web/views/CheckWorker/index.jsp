
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<jsp:include page="../../includes/header.jsp" />
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Check Worker</title>
    </head>
    <body>
        <form action="../../CheckWorkerC" method="post" >
            <table align="right">
                <th colspan="2">Enter The Worketr Id to <br/>View Worker Profile</th>
                <tr>
                    <td id="LabelWorker_Id"><br/>Worker_Id</td>
                    <td><br/><input type="text" name="Worker_id" value="${Worker_id}" size="20" /></td>
                </tr>
                  <tr>

                     <td></td>
                     <td>
                      <input type="submit"  name="View" value="View" />
                    </td>
                  </tr>
            </table>
 <table align="left">
                <th colspan="2">This is Workers Profile view Page </th>

                 <tr>
                    <td id="LabelWorker_Id"><br/> Please Enter The Worker Id To View The Profile Of Worker </td>
                 </tr>
 </table>

        </form>
    </body>
</html>