
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<jsp:include page="../../includes/header.jsp" />
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Workers Profile</title>
    </head>
    <body>
        <form>
            <table align="center">
              <th colspan="4">Workers Profile</th>
                <tr>
                    <td id="LabelName">Name:</td>
                    <td><input disabled type="text" name="name" value="" size="20" /></td>
                    <td id="LabelEmail_Id">Email_Id</td>
                    <td><input disabled type="text" name="u_id" value="" size="20" /></td>
                </tr>
                <tr>
                    <td id="LabelRating">Rating</td>
                    <td><input disabled type="text" name="name" value="" size="20" /></td>
                    <td id="LabelAge">Age:</td>
                    <td><input disabled type="text" name="name" value="" size="20" /></td>
                </tr>
                 <tr>
                    <td  id="LabelGender">Gender:</td>
                    <td><input disabled type="radio" name="gender" value="male" checked="checked" />Male;
                        <input disabled type="radio" name="gender" value="female" />Female</td>

                    <td id="LabelJob">Job:</td>
                    <td><input disabled type="text" name="Job" value="" size="20" /></td>
                  </tr>
                  <tr>
                        <td id="LabelAddress">Working Area:</td>
                        <td><textarea disabled name="address" rows="2" cols="20"></textarea></td>

                         <td  id="LabelWagesMode">Wages_Mode:</td>
                         <td><input disabled type="radio" name="WagesMode" value="Daily" checked="checked" />Daily;
                             <input disabled type="radio" name="WagesMode" value="Contract" />Contract</td>
                  </tr>

                  <tr>
                        <td id="LabelCharge">Charges/Day:</td>
                        <td><input disabled type="text" name="name" value="" size="20" /></td>

                        <td id="LabelWellSkilled">WellSkilled:</td>
                        <td><input disabled type="text" name="name" value="" size="20" /></td>
                  </tr>
                  <tr>
                        <td id="LabelAddress">Address:</td>
                        <td><textarea disabled name="address" rows="2" cols="20"></textarea></td>
                       
                         <td id="LabelState">State:</td>
                         <td><input disabled type="text" name="State" value="" size="20" /></td>
                  </tr>
                  <tr>
                        <td id="LabelMobileNumber">Mobile Number</td>
                        <td><input disabled type="text" name="con_no" value="" size="20" /></td>
                        
                         <td id="LabelCity">City:</td>
                         <td><input disabled type="text" name="City" value="" size="20" /></td>
                  </tr>
                  <tr>
                      <td  align="center" colspan="4"><br/>
                      <a href="../CheckWorker/index.jsp">
                    <ul>
                    Back
                    </ul>
                      </a>
                      </td>
                  </tr>

            </table>
                <br/>


        </form>
    </body>
</html>
<jsp:include page="../../includes/footer.jsp" />