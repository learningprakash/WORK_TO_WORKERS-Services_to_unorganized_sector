
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<jsp:include page="../../includes/header.jsp" />
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Pannel</title>
    </head>
    <body>
        <form action="../../SignupC" method="post" >
            <table align="center">
                <th colspan="3">Administrator Account</th>
                <tr>
                    <td>
                        <br/>
                        <br/>
                      <input type="submit"  name="GenerateGraph" value="Generate Graph" />
                    </td>
              
                    <td>
                        <br/>
                        <br/>
                      <input type="submit"  name="GenerateReport" value="Generate Report" />
                    </td>
               
                     <td>
                         <br/>
                         <br/>
                      <input type="submit"  name="Backup" value="Create Back Up" />
                    </td>
                  </tr>
            </table>




        </form>
    </body>
</html>
<jsp:include page="../../includes/footer.jsp" />

