<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<jsp:include page="../../includes/header.jsp" />

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profile</title>
    </head>
    <body>
        <form>
            <table align="center">
                <th colspan="4">Workers Profile</th>
                  <tr>
                    <td id="LabelWorker_Id">Worker_Id</td>
                    <td><input type="text" disabled="disabled"  name="Worker_id" value="" size="20" /></td>

                    <td id="LabelEmail_Id">Email_Id</td>
                    <td><input type="text" disabled="disabled" name="Email_id" value="" size="20" /></td>
                </tr>
                <tr>
                    <td id="LabelRating">Rating</td>
                    <td><input type="text" disabled="disabled" name="Rating" value="" size="20" /></td>

                        <td id="LabelName">Name:</td>
                        <td><input type="text" disabled="disabled" name="name" value="" size="20" /></td>
                    </tr>
                    <tr>
                        <td id="LabelAge">Age:</td>
                        <td><input type="text" disabled="disabled" name="age" value="" size="20" /></td>

                    <td  id="LabelGender">Gender:</td>
                    <td><input disabled="disabled" type="radio" name="gender" value="male" checked="checked" />Male;
                        <input disabled="disabled" type="radio" name="gender" value="female" />Female</td>
                    </tr>
                   <tr>
                        <td id="LabelJob">Job:</td>
                        <td><input disabled="disabled" type="text" name="Job" value="" size="20" /></td>

                        <td id="LabelAddress">Working Area:</td>
                        <td><textarea disabled="disabled" name="address" value="" rows="2" cols="20">

            </textarea></td>
                    </tr>
                     <tr>
                    <td  id="LabelWagesMode">Wages_Mode:</td>
                    <td><input disabled="disabled" type="radio" name="WagesMode" value="Daily" checked="checked" />Daily;
                        <input disabled="disabled" type="radio" name="WagesMode" value="Contract" />Contract</td>

                        <td id="LabelCharge">Charges/Day:</td>
                        <td><input disabled="disabled" type="text" name="Dailycharges" value="" size="20" /></td>
                    </tr>
                     <tr>
                        <td id="LabelWellSkilled">WellSkilled:</td>
                        <td><input disabled="disabled" type="text" name="Specialization" value="" size="20" /></td>

                        <td id="LabelAddress">Address:</td>
                        <td><textarea disabled="disabled" name="address" rows="2" cols="20">

            </textarea></td>
                    </tr>
       <tr>
           <td id="LabelState">State:</td>
           <td><input disabled="disabled" type="text" name="State" value="" size="20" /></td>

           <td id="LabelMobileNumber">Mobile Number</td>
           <td><input disabled="disabled" type="text" name="mobile_no" value="" size="20" /></td>
       </tr>
            </table>
                <br/><hr/>

            <table align="center" >
                <th colspan="5">Go to The Required Fields</th>
                <tr>
                    <td>
                       <a href="../UpdateWorkerProfile/index.jsp">
                    <ul>
                    Change Profile
                    </ul>
                    </a>
               </td>
                <td>
                      <a href="../home/index.jsp">
                    <ul>
                    Sign Out
                    </ul>
                    </a>
                </td>
              
               <td>
                      <a href="../Help/index.jsp">
                    <ul>
                    Help?
                    </ul>
                    </a>
                </td>
                <td>
                      <a href="../Aboutus/index.jsp">
                    <ul>
                    About US
                    </ul>
                    </a>
                </td>
                </tr>
            </table>
               
        </form>
    </body>
</html>
<jsp:include page="../../includes/footer.jsp" />