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
        <form action="../../RequireworkersC" method="post" >
            <table align="center">
                <th colspan="4">Workers Required</th>
                <tr>
                    <td id="LabelName">Name of requestee:</td>
                    <td><input type="text" name="Name" value="${Name}" size="20" /></td>
                    <td id="LabelRequestId">Request Id:</td>
                    <td><input type="text" disabled name="RequestNumber" value="${RequestNumber}" size="20" /></td>
                </tr>
                <tr>
                    <td id="LabelName">Number of Workers required</td>
                    <td><input type="text" name="NumberOfWorkers" value="${NumberOfWorkers}" size="20" /></td>
                </tr>
                <tr>
                    <td  id="LabelGender">Gender:</td>
                    <td><input type="radio" name="gender" value="male" checked="checked" />Male;
                        <input type="radio" name="gender" value="female" />Female</td>
                </tr>

                <tr>
                    <td id="LabelJob">Job:</td>
                    <td><input type="text" name="WorkName" value="${WorkName}" size="20" /></td>
                </tr>
                <tr>
                    <td  id="LabelWagesMode">Wages_Mode:</td>
                    <td><input type="radio" name="Wages_Mode" value="Daily" checked="checked" />Daily;
                        <input type="radio" name="Wages_Mode" value="Contract" />Contract</td>

                </tr>
                <tr>
                    <td id="LabelStartingdate">Starting date:</td>
                    <td><input type="text" name="StatDate" value="${StatDate}" size="20" /></td>
                    <td id="LabelEndingDate">Ending Date:</td>
                    <td><input type="text" name="EndDate" value="${EndDate}" size="20" /></td>
                </tr>
                <tr>
                    <td id="LabelAddress">Address:</td>
                    <td><textarea name="ReqAddress" value="${ReqAddress}" rows="2" cols="20">

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
                    <td id="LabelWageSpecification">Wage Specification<br/>(less than in Rs):</td>
                    <td><input type="text" name="WageRange" value="${WageRange}" size="20" /></td>
                </tr>
                <tr>

                    <td></td><td>
                        <input type="submit"  name="submit" value="submit" />
                    </td>
                </tr>
            </table>
           
        </form>
    </body>
</html>
<jsp:include page="../../includes/footer.jsp" />