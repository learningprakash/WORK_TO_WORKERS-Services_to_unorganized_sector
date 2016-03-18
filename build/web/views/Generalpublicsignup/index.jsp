<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<jsp:include page="../../includes/header.jsp" />
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign Up Form</title>
    </head>
    <body>
        <form action="../../GeneralpublicsignupC" method="post" >
            <table align="center">
                <th colspan="2">Login Information</th>
                <tr>
                    <td id="LabelEmail_Id">Email_Id</td>
                    <td><input type="text" name="EmailId" value="${EmailId}" size="20" /></td>
                </tr>
                 <tr>
                    <td id="LabelUser_Id">User_Id</td>
                    <td><input type="text" name="UserId" value="${UserId}" size="20" /></td>
                </tr>
                <tr>
                    <td id="LabelPassword">Password</td>
                    <td><input type="password" name="Password" value="${Password}" size="20" /></td>
                </tr>
                
            </table>
                <br/>

            <table align="center" >
                <th colspan="2">Personal Information</th>
                    <tr>
                        <td id="LabelName">Name:</td>
                        <td><input type="text" name="Name" value="${Name}" size="20" /></td>
                    </tr>
                    <tr>
                        <td id="LabelAddress">Address:</td>
                        <td><textarea name="Address" value="${Address}" rows="4" cols="20">

            </textarea></td>
                    </tr>


       <tr>
           <td id="LabelState">State:</td>
           <td><select name="State">
            <option>Andhra Pradesh</option>
            <option>Arunachal Pradesh</option>
            <option>Asam</option>
            <option>Bihar</option>
            <option>Chandigarh</option>
            <option>Chhatisgarh</option>
            <option>Delhi</option>
            <option>Goa</option>
            <option>Gujrat</option>
            <option>Haryana</option>
            <option>Himachal Pradesh</option>
            <option>Jammu & Kashmir</option>
            <option>Jharkhand</option>>
            <option>Karnataka</option>
            <option>Kerala</option>
            <option>Madhya Pradesh</option>
            <option>Maharashtra</option>
            <option>Manipur</option>
            <option>Meghalaya</option>
            <option>Mizoram</option>
            <option>Nagaland</option>
            <option>Orisa</option>
            <option>Pondicheri</option>
            <option>Punjab</option>
            <option>Rajsthan</option>
            <option>Sikkim</option>
            <option>Tamilnadu</option>
            <option>Tripura</option>
            <option>Uttaranchal</option>
            <option>Uttar Pradesh</option>
            <option>West Bengal</option>
               </select></td>
       </tr>
       <tr>
           <td id="LabelMobileNumber">Mobile/Contact Number</td>
           <td><input type="text" name="MobileNumber" value="${MobileNumber}{" size="20" /></td>
       </tr>

       <tr>

           <td></td><td>
               <input type="submit"  name="Submit" value="Submit" />
           </td>
       </tr>
        </table>
        </form>
    </body>
</html>
<jsp:include page="../../includes/footer.jsp" />