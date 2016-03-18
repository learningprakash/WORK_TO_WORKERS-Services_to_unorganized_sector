<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<jsp:include page="../../includes/header.jsp" />
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Rate The Worker</title>
    </head>
    <body>
        <form action="../../RateworkerC" method="post" >
            <table align="Center">
                <th colspan="2">Enter The Workers Details To Rate Him/Her<br/><br/></th>
                <tr>
                    <td id="LabelWorker_Id">Worker_Id</td>
                    <td><input type="text" name="worker_id" value="${worker_id}" size="20" /></td>
                 </tr>


                  <tr>
                    <td id="LabelRating">RatingId</td>
                    <td><input type="password" name="rating_id" value="${rating_id}" size="20" /></td>
                  </tr>
                  <tr>
                    <td id="LabelMark">Marks Out Of 10 Marks</td>
                    <td><input type="text" name="Rating" value="${Rating}" size="20" /></td>
                  </tr>
                
                  <tr>
                      <td></td>
                     <td>
                         <br/>
                      <input type="submit"  name="Rate" value="Rate" />
                    </td>
                  </tr>
            </table>
        </form>
    </body>
</html>
<jsp:include page="../../includes/footer.jsp" />