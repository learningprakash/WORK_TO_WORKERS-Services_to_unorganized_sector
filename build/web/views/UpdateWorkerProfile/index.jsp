<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<jsp:include page="../../includes/header.jsp" />
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>UpDate Profile Form</title>
    </head>
    <body>
       <form action="../../UpdateWorkerProfileC" method="post" >
            <table align="center">
                <th colspan="2">Login Information</th>
                <tr>
                    <td id="LabelEmail_Id">Worker_Id</td>
                    <td><input type="text" name="Worker_id" value="${Worker_id}" size="20" /></td>
                </tr>
                <tr>
                    <td id="LabelEmail_Id">Email_Id</td>
                    <td><input type="text" name="email_id" value="${email_id}" size="20" /></td>
                </tr>
                <tr>
                    <td id="LabelPassword">Password</td>
                    <td><input type="password" name="password" value="${password}" size="20" /></td>
                </tr>

                  <tr>
                    <td id="LabelRating">RatingId</td>
                    <td><input type="password" name="rating_id" value="${rating_id}" size="20" /></td>
                  </tr>
            </table>

                <br/>

            <table align="center" >
                <th colspan="2">Personal Information</th>
                    <tr>
                        <td id="LabelName">Name:</td>
                        <td><input type="text" name="name" value="${name}" size="20" /></td>

                    </tr>
                    <tr>
                        <td id="LabelAge">Age:</td>
                        <td><input type="text" name="age" value="${age}" size="20" /></td>
                    </tr>

                   <tr>
                    <td  id="LabelGender">Gender:</td>
                    <td><input type="radio" name="gender" value="male" checked="checked" />Male;
                        <input type="radio" name="gender" value="female" />Female</td>
                    </tr>
                   <tr>
           <td id="LabelJob">Job:</td>
           <td><select name="Job">
            <option value="mason">Mason</option>
            <option value="gardener">Gardner</option>
            <option value="Painter">Painter</option>
            <option value="Sweeper">Sweeper</option>
            <option value="Labour">Labour</option>
            <option value="Carpenter">Carpenter</option>
            <option value="Other">Other</option>
               </select></td>
       </tr>
                   <tr>
                        <td id="LabelAddress">Working Area:</td>
                        <td><textarea name="Working_area" value="${Working_area}" rows="2" cols="20">

            </textarea></td>
                    </tr>
                    <tr>
           <td id="LabelCity">City</td>
           <td><select name="City">
                   <option value="Jabalpur">Jabalpur</option>
            <option value="Gwalior">Gwalior</option>
            <option value="Indore">Indore</option>
            <option value="Satna">Satna<option>
            <option value="Bhopal">Bhopal</option>
            <option value="Ratlam">Ratlam</option>
            <option value="Other">Other</option>
               </select></td>
       </tr>
                     <tr>
                    <td  id="LabelWagesMode">Wages_Mode:</td>
                    <td><input type="radio" name="payment_mode" value="Daily" checked="checked" />Daily;
                        <input type="radio" name="payment_mode" value="Contract" />Contract</td>
                    </tr>
                     <tr>
                        <td id="LabelCharge">Charges/Day:</td>
                        <td><input type="text" name="Daily_charges" value="${Daily_charges}" size="20" /></td>
                    </tr>
                     <tr>
                        <td id="LabelWellSkilled">Specialization:</td>
                        <td><input type="text" name="Specialization" value="${Specialization}" size="20" /></td>
                    </tr>

                    <tr>
                        <td id="LabelAddress">Address:</td>
                        <td><textarea name="address" value="${address}" rows="2" cols="20">

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
           <td id="LabelMobileNumber">Mobile Number</td>
           <td><input type="text" name="Mobile_no" value="${Mobile_no}" size="20" /></td>
       </tr>

       <tr>

           <td></td><td>
               <input type="submit"  name="Update" value="Update" />
           </td>
       </tr>
        </table>

        </form>
    </body>
</html>
<jsp:include page="../../includes/footer.jsp" />