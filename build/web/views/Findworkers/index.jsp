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
        <form action="../../FindworkersC" method="post" >
            <table align="Center">
                <th colspan="2">Enter The Work Details To Get details of Workers<br/><br/></th>
                    <tr>
           <td id="LabelWorkName">Work Name:</td>
           <td>
               <select name="WorkName">
            <option>Mason</option>
            <option>Gardner</option>
            <option>Painter</option>
            <option>Sweaper</option>
            <option>Labour</option>
            <option>Carpenter</option>
            <option>Any</option>
               </select>
           </td>
       </tr>
                <tr>
           <td id="LabelCity">City:</td>
           <td><select name="City">
            <option>Satna</option>
            <option>Ratlam</option>
            <option>Rewa</option>
            <option>Ujjain</option>
            <option>Indore</option>
            <option>Gwalior</option>
            <option>Jabalpur</option>
            <option>Bhopal</option>
               </select></td>
       </tr>
                <tr>
                    <td id="LabelDate">Working Date</td>
                    <td><input type="text" name="StatDate" value="${StatDate}" size="20" /></td>
                </tr>
                  <tr>
                      <td></td>

                     <td>
                         <br/>
                      <input type="submit"  name="Find Workers" value="Find Workers" />
                    </td>
                  </tr>
            </table>
        </form>
    </body>
</html>
<jsp:include page="../../includes/footer.jsp" />
